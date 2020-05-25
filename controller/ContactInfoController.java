package controller;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import model.Message;
import org.jetbrains.annotations.NotNull;

/**
 * @author Joanna Sokołowska
 */

public class ContactInfoController {
    @FXML
    private Text contactName;
    @FXML
    private Circle unreadMsg;
    @FXML
    private Text lastMsg;
    @FXML
    private Text lastTimestamp;

    public void makeContact(String contactName, boolean isMsgRead, Message lastMsg){
        this.contactName.setText(contactName.trim());
        if(lastMsg != null){
            unreadMsg.setVisible(isMsgRead);
            this.lastMsg.setText(lastMsg.getMess().trim());
            //lastTimestamp.setText(lastMsg.getTimestamp());
        }else{
            unreadMsg.setVisible(false);
            this.lastMsg.setText("");
        }

    }

    public void makeContact(String contactName, boolean isMsgRead){
        makeContact(contactName, isMsgRead, null);
    }

    public void makeContact(String contactName){
        makeContact(contactName, false, null);
    }

    public void showNewMessage( @NotNull Message lastMessage){
        unreadMsg.setVisible(true);
        this.lastMsg.setText(lastMessage.getMess().trim());
    }

}