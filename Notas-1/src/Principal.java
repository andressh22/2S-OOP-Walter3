
import InterfazGrafica.VentanaPrincipal;
import InterfazGrafica.VentanaResultados;


public class Principal {
    
    private static final java.util.logging.Logger loggerPrincipal = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private static final java.util.logging.Logger loggerResultados = java.util.logging.Logger.getLogger(VentanaResultados.class.getName());

    
    public static void main(String args[]) {
        /*Principal Window ejecuter*/

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            loggerPrincipal.log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       /*Resultados Window ejecuter*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            loggerResultados.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        /*java.awt.EventQueue.invokeLater(() -> new VentanaResultados().setVisible(true));*/
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
