
package com.mycompany.listacircularconjuntos;


public class Principal extends javax.swing.JFrame {
  ListaCircular Milista = new ListaCircular();
  ListaCircular Milista2 = new ListaCircular();
    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtdato1 = new javax.swing.JTextField();
        txtdato2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mi lista ");

        jLabel2.setText("Lista 1");

        jLabel3.setText("Lista 2");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Union");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Insercion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Diferencia B-A");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Direfencia A-B");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtdato1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtdato2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(txtdato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtdato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       Milista.addFinal(Integer.parseInt(txtdato1.getText()));   
//       Milista2.addFinal(Integer.parseInt(txtdato2.getText()));
       
       Milista.addFinal(1);
       Milista.addFinal(1);
       Milista.addFinal(5);
       Milista.addFinal(3);
       Milista.addFinal(4);
       Milista.addFinal(4);
       
       Milista2.addFinal(1);       
       Milista2.addFinal(1);
       Milista2.addFinal(6);
       Milista2.addFinal(3);
       Milista2.addFinal(3);
       Milista2.addFinal(4);
//       
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        ListaCircular miListaUnion = Milista.union2(Milista, Milista2);
        Nodo aux1=miListaUnion.getInicio();
        Nodo aux2=miListaUnion.getInicio();
        Nodo aux3=aux2.getSiguiente();
        
        do{                    
            do{
                if(aux1.getValor()==aux3.getValor()&&aux3!=aux1)
                     aux2.setSiguiente(aux3.getSiguiente());//eliminacion                                                          
                                
                aux2=aux3;
                aux3=aux2.getSiguiente();            
            }while(aux2 !=miListaUnion.getInicio());
            
            aux1=aux1.getSiguiente();
        }while(aux1 !=miListaUnion.getInicio());
        
        
        
        
        
        
        
        
        
        Nodo auxiterador = miListaUnion.getInicio();                        
            int i = 1;
            do{
                System.out.println("En la posición"
                        +i+" hay un: "+auxiterador.getValor());                                                      
                auxiterador = auxiterador.getSiguiente();
                i++;
            }while(auxiterador != miListaUnion.getInicio());                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            ListaCircular miListainterseccion = Milista.intersecion(Milista, Milista2);
            Nodo auxiterador = miListainterseccion.getInicio();                        
            int i = 1;
            do{
                System.out.println("En la posición"
                        +i+" hay un: "+auxiterador.getValor());                                                      
                auxiterador = auxiterador.getSiguiente();
                i++;
            }while(auxiterador != miListainterseccion.getInicio());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ListaCircular miListainterseccion = Milista.difrencia(Milista, Milista2);
            Nodo auxiterador = miListainterseccion.getInicio();                        
            int i = 1;
            do{
                System.out.println("En la posición"
                        +i+" hay un: "+auxiterador.getValor());                                                      
                auxiterador = auxiterador.getSiguiente();
                i++;
            }while(auxiterador != miListainterseccion.getInicio());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ListaCircular miListainterseccion = Milista.difrencia(Milista2, Milista);
            Nodo auxiterador = miListainterseccion.getInicio();                        
            int i = 1;
            do{
                System.out.println("En la posición"
                        +i+" hay un: "+auxiterador.getValor());                                                      
                auxiterador = auxiterador.getSiguiente();
                i++;
            }while(auxiterador != miListainterseccion.getInicio());
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtdato1;
    private javax.swing.JTextField txtdato2;
    // End of variables declaration//GEN-END:variables
}
