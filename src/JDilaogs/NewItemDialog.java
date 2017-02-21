package JDilaogs;

import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import GameComponents.SharedVariables;
import GameComponents.SharedVariables.ArmorClass;
import GameComponents.SharedVariables.BeltClass;
import GameComponents.SharedVariables.BootsClass;
import GameComponents.SharedVariables.HelmetClass;
import GameComponents.SharedVariables.RingClass;
import GameComponents.SharedVariables.ShieldClass;
import GameComponents.SharedVariables.WeaponClass;

import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
/**
 * This class create dialog for new item
 * @author saiteja prasadam
 * @version 1.0.0
 * @since 2/20/2017
 *
 */
public class NewItemDialog extends JDialog {
  private JTextField itemNameTextField;

    public NewItemDialog(){
        DialogHelper.setDialogProperties(this, "New Item", new Rectangle(440, 227));
        getContentPane().setLayout(null);
        
        initComponents();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private void initComponents() {
      
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 11, 414, 141);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        Font font = new Font("Tahoma", Font.BOLD, 12);
        
        //Name Fields
        JLabel lblItemName = new JLabel("Item Name");
        lblItemName.setFont(font);
        lblItemName.setBounds(10, 11, 101, 20);
        panel.add(lblItemName);
        
        itemNameTextField = new JTextField();
        itemNameTextField.setBounds(141, 13, 263, 20);
        panel.add(itemNameTextField);
        itemNameTextField.setColumns(10);
        
        //Item type
        JLabel lblItemType = new JLabel("Item Type");
        lblItemType.setFont(font);
        lblItemType.setBounds(10, 42, 101, 20);
        panel.add(lblItemType);
                
        JComboBox itemTypesComboBox = new JComboBox(SharedVariables.ItemType.values());
        DefaultComboBoxModel itemTypesComboBoxModel = new DefaultComboBoxModel();
        JComboBox itemClassComboBox = new JComboBox(itemTypesComboBoxModel);
        
        for(ArmorClass values : SharedVariables.ArmorClass.values())
          itemTypesComboBoxModel.addElement(values.toString());
        
        itemTypesComboBox.setBounds(141, 44, 263, 20);
        itemTypesComboBox.addItemListener(new ItemListener() {
          
          @Override
          public void itemStateChanged(ItemEvent event) {
            
              if (event.getStateChange() == ItemEvent.SELECTED) {
                    switch(event.getItem().toString()){
                        
                      case "Armor":
                        itemTypesComboBoxModel.removeAllElements();
                        for(ArmorClass values : SharedVariables.ArmorClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Helmet":
                        itemTypesComboBoxModel.removeAllElements();
                        for(HelmetClass values : SharedVariables.HelmetClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Shield":
                        itemTypesComboBoxModel.removeAllElements();
                        for(ShieldClass values : SharedVariables.ShieldClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Belt":
                        itemTypesComboBoxModel.removeAllElements();
                        for(BeltClass values : SharedVariables.BeltClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Boots":
                        itemTypesComboBoxModel.removeAllElements();
                        for(BootsClass values : SharedVariables.BootsClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Ring":
                        itemTypesComboBoxModel.removeAllElements();
                        for(RingClass values : SharedVariables.RingClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                      case "Weapon":
                        itemTypesComboBoxModel.removeAllElements();
                        for(WeaponClass values : SharedVariables.WeaponClass.values())
                          itemTypesComboBoxModel.addElement(values.toString());
                        break;
                        
                    }
              }
            
          }

        });
        panel.add(itemTypesComboBox);
        
        //Item Class
        JLabel lblItemClass = new JLabel("Item Class");
        lblItemClass.setFont(font);
        lblItemClass.setBounds(10, 73, 101, 20);
        panel.add(lblItemClass);
                
        itemClassComboBox.setBounds(141, 75, 263, 20);
        panel.add(itemClassComboBox);      
        
        //Item level
        JLabel lblItemLevel = new JLabel("Item Level");
        lblItemLevel.setFont(font);
        lblItemLevel.setBounds(10, 104, 101, 20);
        panel.add(lblItemLevel);
        
        //Item Level value label
        JLabel ItemLevelValueLabel = new JLabel();
        ItemLevelValueLabel.setBounds(386, 106, 18, 24);
        panel.add(ItemLevelValueLabel);
        
        //JSlider 
        JSlider itemLevelSlider = new JSlider(JSlider.HORIZONTAL, 1, 20, 1);
        ItemLevelValueLabel.setText(String.valueOf(itemLevelSlider.getValue()));
        itemLevelSlider.setBackground(Color.WHITE);
        itemLevelSlider.setBounds(141, 104, 235, 26);
        itemLevelSlider.addChangeListener(new ChangeListener() {
          public void stateChanged(ChangeEvent event) {
              ItemLevelValueLabel.setText(String.valueOf(itemLevelSlider.getValue()));
          }
        });
        panel.add(itemLevelSlider);              
  
        //Create Item button
        JButton btnCreateItem = new JButton("Create Item");
        btnCreateItem.setBounds(308, 163, 116, 23);
        getContentPane().add(btnCreateItem);
    }
}
