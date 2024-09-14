import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CowView extends JFrame {
    private JTextField idField = new JTextField(10);
    private JButton checkButton = new JButton("Check Cow");
    private JLabel resultLabel = new JLabel("Enter cow ID:");
    private JScrollPane scrollPane;  
    public CowView() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // เพิ่มระยะห่างระหว่างส่วนประกอบ

        
        gbc.gridx = 0; 
        gbc.gridy = 0; 
        gbc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Cow ID:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(idField, gbc);

       
        gbc.gridx = 2; 
        gbc.anchor = GridBagConstraints.LINE_START;
        add(checkButton, gbc);

        resultLabel = new JLabel();
        scrollPane = new JScrollPane(resultLabel);
        scrollPane.setPreferredSize(new Dimension(400, 200)); // ตั้งขนาดเริ่มต้น
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3; 
        gbc.fill = GridBagConstraints.BOTH; 
        add(scrollPane, gbc);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); 
    }

    public String getCowId() {
        return idField.getText();
    }

    public void setResult(String result) {
        resultLabel.setText("<html><div style='font-size:10px;'><br>" 
                + result.replace("\n", "<br>") + "</div></html>");
    }

    public void resetInput() {
        idField.setText("");
    }

    public void addCheckButtonListener(ActionListener listener) {
        checkButton.addActionListener(listener);
    }
}
