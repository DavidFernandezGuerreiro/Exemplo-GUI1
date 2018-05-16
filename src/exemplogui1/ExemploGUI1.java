
package exemplogui1;

import com.ventana.ComposicionLayouts;
import com.ventana.Ventana;
import com.ventana.Ventana2;
import com.ventana.VentanaComponentes;
import com.ventana.VentanaComponentes2;
import com.ventana.VentanaLayouts;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploGUI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ventana obxVent=new Ventana();
//        Ventana2 obxVent2=new Ventana2();
//        VentanaComponentes obxVentComp=new VentanaComponentes();
//        VentanaComponentes2 obxVentComp2=new VentanaComponentes2();
        VentanaLayouts obxLayouts=new VentanaLayouts();
//        obxLayouts.distribuidorFlowLayout();
//        obxLayouts.disBoxLayout();
//        obxLayouts.disBorderLayout();
//        obxLayouts.disGridLayout();
        ComposicionLayouts obxComposicionLayout=new ComposicionLayouts();
        obxComposicionLayout.composicionLayout();
    }
    
}
