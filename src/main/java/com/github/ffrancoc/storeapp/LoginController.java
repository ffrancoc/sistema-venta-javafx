package com.github.ffrancoc.storeapp;

import com.github.ffrancoc.storeapp.db.DAOUsuario;
import com.github.ffrancoc.storeapp.models.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginController implements Initializable {
    
    @FXML
    private TextField txtUsuario;
    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Label lblMessage;
    
    @FXML
    private void onActionLogin() throws IOException {
        String _txtUsuario = txtUsuario.getText().trim();
        String _txtPassword = txtPassword.getText().trim();
        
        if (!_txtUsuario.isEmpty() && !_txtPassword.isEmpty()) {
            DAOUsuario dao = new DAOUsuario();
            Usuario usuario = dao.getLogin(_txtUsuario, _txtUsuario);            
            if (usuario != null) {                
                clearInputs();
                App.setData(usuario);
                App.setRoot("main");
            } else {
                lblMessage.setTextFill(Color.RED);
                lblMessage.setText("Inicio de sesion invalido");
            }
        }
    }
    
    private void clearInputs() {
        txtUsuario.clear();
        txtPassword.clear();
        lblMessage.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
}
