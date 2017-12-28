/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainForm.java
 *
 * Created on 3/12/2010, 11:07:07 PM
 */

package facturatron.Principal;

import java.awt.Component;
import org.jdesktop.swingx.JXHyperlink;

/**
 *
 * @author mora
 */
public class MainForm extends javax.swing.JFrame {

    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
        this.getPanelEdicion().setAutoFocusOnTabHideClose(true);
        this.getPanelEdicion().setAutoRequestFocus(true);        
        setSize(1024, 768);
        this.getPanelEdicion().setShowCloseButton(true);
        this.getPanelEdicion().setShowTabButtons(true);
        this.getPanelEdicion().setShowCloseButtonOnTab(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        linkFacturar = new org.jdesktop.swingx.JXHyperlink();
        linkFacturasEmitidas = new org.jdesktop.swingx.JXHyperlink();
        linkInformeMensual = new org.jdesktop.swingx.JXHyperlink();
        jXTaskPane2 = new org.jdesktop.swingx.JXTaskPane();
        linkCatalogo = new org.jdesktop.swingx.JXHyperlink();
        linkUnidad = new org.jdesktop.swingx.JXHyperlink();
        linkProducto = new org.jdesktop.swingx.JXHyperlink();
        jXTaskPane3 = new org.jdesktop.swingx.JXTaskPane();
        linkCfgFiscal = new org.jdesktop.swingx.JXHyperlink();
        linkCfgSystem = new org.jdesktop.swingx.JXHyperlink();
        linkCfgPAC = new org.jdesktop.swingx.JXHyperlink();
        linkCfgAcercaDe = new org.jdesktop.swingx.JXHyperlink();
        linkSalir = new org.jdesktop.swingx.JXHyperlink();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelEdicion = new com.jidesoft.swing.JideTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturatron");

        jXTaskPaneContainer1.setBackground(new java.awt.Color(41, 71, 173));

        jXTaskPane1.setTitle("Facturas");

        linkFacturar.setText("Facturar");
        linkFacturar.setUnclickedColor(new java.awt.Color(0, 0, 0));
        jXTaskPane1.getContentPane().add(linkFacturar);

        linkFacturasEmitidas.setText("Facturas Emitidas");
        linkFacturasEmitidas.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkFacturasEmitidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkFacturasEmitidasActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkFacturasEmitidas);

        linkInformeMensual.setText("Informe SAT");
        linkInformeMensual.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkInformeMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkInformeMensualActionPerformed(evt);
            }
        });
        jXTaskPane1.getContentPane().add(linkInformeMensual);

        jXTaskPaneContainer1.add(jXTaskPane1);

        jXTaskPane2.setTitle("Catálogos");

        linkCatalogo.setText("Clientes");
        linkCatalogo.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkCatalogoActionPerformed(evt);
            }
        });
        jXTaskPane2.getContentPane().add(linkCatalogo);

        linkUnidad.setText("Unidades");
        linkUnidad.setUnclickedColor(new java.awt.Color(0, 0, 0));
        Boolean moduloActivo = facturatron.Dominio.Configuracion.getConfig().getModuloUnidadesActivo();
        if(moduloActivo != null)
        linkUnidad.setVisible(moduloActivo);
        linkUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkUnidadActionPerformed(evt);
            }
        });
        jXTaskPane2.getContentPane().add(linkUnidad);

        linkProducto.setText("Productos");
        linkProducto.setUnclickedColor(new java.awt.Color(0, 0, 0));
        Boolean moduloPActivo = facturatron.Dominio.Configuracion.getConfig().getModuloProductosActivo();
        if(moduloPActivo != null)
        linkProducto.setVisible(moduloPActivo);
        jXTaskPane2.getContentPane().add(linkProducto);

        jXTaskPaneContainer1.add(jXTaskPane2);

        jXTaskPane3.setTitle("Sistema");

        linkCfgFiscal.setText("Configuración Fiscal");
        linkCfgFiscal.setUnclickedColor(new java.awt.Color(0, 0, 0));
        jXTaskPane3.getContentPane().add(linkCfgFiscal);

        linkCfgSystem.setText("Configuración Sistema");
        linkCfgSystem.setUnclickedColor(new java.awt.Color(0, 0, 0));
        jXTaskPane3.getContentPane().add(linkCfgSystem);

        linkCfgPAC.setText("Configuración Integraciones");
        linkCfgPAC.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkCfgPAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkCfgPACActionPerformed(evt);
            }
        });
        jXTaskPane3.getContentPane().add(linkCfgPAC);

        linkCfgAcercaDe.setText("Acerca De");
        linkCfgAcercaDe.setUnclickedColor(new java.awt.Color(0, 0, 0));
        jXTaskPane3.getContentPane().add(linkCfgAcercaDe);

        linkSalir.setText("Salir");
        linkSalir.setUnclickedColor(new java.awt.Color(0, 0, 0));
        linkSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkSalirActionPerformed(evt);
            }
        });
        jXTaskPane3.getContentPane().add(linkSalir);

        jXTaskPaneContainer1.add(jXTaskPane3);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jXTaskPaneContainer1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Facturatron 1.9 b5. Phesus.");
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jXTaskPaneContainer1.add(jLabel2);

        panelEdicion.setAutoscrolls(true);
        panelEdicion.setShowCloseButtonOnMouseOver(true);
        panelEdicion.setTabEditingAllowed(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(panelEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JXHyperlink getLinkProducto() {
        return linkProducto;
    }

    public void setLinkProducto(JXHyperlink linkProducto) {
        this.linkProducto = linkProducto;
    }

    private void linkFacturasEmitidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkFacturasEmitidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkFacturasEmitidasActionPerformed

    private void linkCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkCatalogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkCatalogoActionPerformed

    private void linkSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkSalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_linkSalirActionPerformed

    private void linkInformeMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkInformeMensualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkInformeMensualActionPerformed

    private void linkCfgPACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkCfgPACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkCfgPACActionPerformed

    private void linkUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linkUnidadActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    public void addTab(String nombre, Component comp) {
        this.getPanelEdicion().addTab(nombre, comp);
        this.getPanelEdicion().setSelectedComponent(comp);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane2;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane3;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private org.jdesktop.swingx.JXHyperlink linkCatalogo;
    private org.jdesktop.swingx.JXHyperlink linkCfgAcercaDe;
    private org.jdesktop.swingx.JXHyperlink linkCfgFiscal;
    private org.jdesktop.swingx.JXHyperlink linkCfgPAC;
    private org.jdesktop.swingx.JXHyperlink linkCfgSystem;
    private org.jdesktop.swingx.JXHyperlink linkFacturar;
    private org.jdesktop.swingx.JXHyperlink linkFacturasEmitidas;
    private org.jdesktop.swingx.JXHyperlink linkInformeMensual;
    private org.jdesktop.swingx.JXHyperlink linkProducto;
    private org.jdesktop.swingx.JXHyperlink linkSalir;
    private org.jdesktop.swingx.JXHyperlink linkUnidad;
    private com.jidesoft.swing.JideTabbedPane panelEdicion;
    // End of variables declaration//GEN-END:variables

    public JXHyperlink getLinkUnidad() {
        return linkUnidad;
    }

    public void setLinkUnidad(JXHyperlink linkUnidad) {
        this.linkUnidad = linkUnidad;
    }



    /**
     * @return the jXTaskPane1
     */
    public org.jdesktop.swingx.JXTaskPane getjXTaskPane1() {
        return jXTaskPane1;
    }

    /**
     * @param jXTaskPane1 the jXTaskPane1 to set
     */
    public void setjXTaskPane1(org.jdesktop.swingx.JXTaskPane jXTaskPane1) {
        this.jXTaskPane1 = jXTaskPane1;
    }

    /**
     * @return the jXTaskPane2
     */
    public org.jdesktop.swingx.JXTaskPane getjXTaskPane2() {
        return jXTaskPane2;
    }

    /**
     * @param jXTaskPane2 the jXTaskPane2 to set
     */
    public void setjXTaskPane2(org.jdesktop.swingx.JXTaskPane jXTaskPane2) {
        this.jXTaskPane2 = jXTaskPane2;
    }

    /**
     * @return the jXTaskPane3
     */
    public org.jdesktop.swingx.JXTaskPane getjXTaskPane3() {
        return jXTaskPane3;
    }

    /**
     * @param jXTaskPane3 the jXTaskPane3 to set
     */
    public void setjXTaskPane3(org.jdesktop.swingx.JXTaskPane jXTaskPane3) {
        this.jXTaskPane3 = jXTaskPane3;
    }

    /**
     * @return the jXTaskPaneContainer1
     */
    public org.jdesktop.swingx.JXTaskPaneContainer getjXTaskPaneContainer1() {
        return jXTaskPaneContainer1;
    }

    /**
     * @param jXTaskPaneContainer1 the jXTaskPaneContainer1 to set
     */
    public void setjXTaskPaneContainer1(org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1) {
        this.jXTaskPaneContainer1 = jXTaskPaneContainer1;
    }

   
    /**
     * @return the linkSalir
     */
    public org.jdesktop.swingx.JXHyperlink getLinkSalir() {
        return linkSalir;
    }

    /**
     * @param linkSalir the linkSalir to set
     */
    public void setLinkSalir(org.jdesktop.swingx.JXHyperlink linkSalir) {
        this.linkSalir = linkSalir;
    }

    /**
     * @return the panelEdicion
     */
    public com.jidesoft.swing.JideTabbedPane getPanelEdicion() {
        return panelEdicion;
    }

    /**
     * @param panelEdicion the panelEdicion to set
     */
    public void setPanelEdicion(com.jidesoft.swing.JideTabbedPane panelEdicion) {
        this.panelEdicion = panelEdicion;
    }

    /**
     * @return the linkCatalogo
     */
    public org.jdesktop.swingx.JXHyperlink getLinkCatalogo() {
        return linkCatalogo;
    }
    public org.jdesktop.swingx.JXHyperlink GetlinkUnidad() {
        return linkUnidad;        
    }
    /**
     * @param linkCatalogo the linkCatalogo to set
     */
    public void setLinkCatalogo(org.jdesktop.swingx.JXHyperlink linkCatalogo) {
        this.linkCatalogo = linkCatalogo;
    }

    /**
     * @return the linkFacturar
     */
    public org.jdesktop.swingx.JXHyperlink getLinkFacturar() {
        return linkFacturar;
    }

    /**
     * @param linkFacturar the linkFacturar to set
     */
    public void setLinkFacturar(org.jdesktop.swingx.JXHyperlink linkFacturar) {
        this.linkFacturar = linkFacturar;
    }

    /**
     * @return the linkFacturasEmitidas
     */
    public org.jdesktop.swingx.JXHyperlink getLinkFacturasEmitidas() {
        return linkFacturasEmitidas;
    }

    /**
     * @param linkFacturasEmitidas the linkFacturasEmitidas to set
     */
    public void setLinkFacturasEmitidas(org.jdesktop.swingx.JXHyperlink linkFacturasEmitidas) {
        this.linkFacturasEmitidas = linkFacturasEmitidas;
    }


    /**
     * @return the linkCfgFiscal
     */
    public org.jdesktop.swingx.JXHyperlink getLinkCfgFiscal() {
        return linkCfgFiscal;
    }

    /**
     * @return the linkCfgSystem
     */
    public org.jdesktop.swingx.JXHyperlink getLinkCfgSystem() {
        return linkCfgSystem;
    }

    /**
     * @return the linkInformeMensual
     */
    public org.jdesktop.swingx.JXHyperlink getLinkInformeMensual() {
        return linkInformeMensual;
    }

    /**
     * @return the linkCfgAcercaDe
     */
    public org.jdesktop.swingx.JXHyperlink getLinkCfgAcercaDe() {
        return linkCfgAcercaDe;
    }

    /**
     * @param linkCfgAcercaDe the linkCfgAcercaDe to set
     */
    public void setLinkCfgAcercaDe(org.jdesktop.swingx.JXHyperlink linkCfgAcercaDe) {
        this.linkCfgAcercaDe = linkCfgAcercaDe;
    }

    public JXHyperlink getLinkCfgPAC() {
        return linkCfgPAC;
    }
}
