package team.esprit.presentation;

public class GestionDesCovoitureurs extends javax.swing.JFrame {

    public GestionDesCovoitureurs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutton_AjouterCovoitureur = new javax.swing.JButton();
        boutton_AfficherLesCovoitureurs = new javax.swing.JButton();
        boutton_RechercheUnCovoitureur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boutton_AjouterCovoitureur.setText("Ajouter un covoitureur");
        boutton_AjouterCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AjouterCovoitureurActionPerformed(evt);
            }
        });

        boutton_AfficherLesCovoitureurs.setText("Afficher les covoitureurs");
        boutton_AfficherLesCovoitureurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_AfficherLesCovoitureursActionPerformed(evt);
            }
        });

        boutton_RechercheUnCovoitureur.setText("Recherche Un Covoitureur");
        boutton_RechercheUnCovoitureur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutton_RechercheUnCovoitureurActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestion des Covoitureurs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boutton_RechercheUnCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_AfficherLesCovoitureurs, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutton_AjouterCovoitureur, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(boutton_AjouterCovoitureur)
                .addGap(32, 32, 32)
                .addComponent(boutton_AfficherLesCovoitureurs)
                .addGap(34, 34, 34)
                .addComponent(boutton_RechercheUnCovoitureur)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutton_AjouterCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AjouterCovoitureurActionPerformed
        AjouterUnCovoitureur ajouterUnCovoitureur = new AjouterUnCovoitureur();
        ajouterUnCovoitureur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boutton_AjouterCovoitureurActionPerformed

    private void boutton_AfficherLesCovoitureursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_AfficherLesCovoitureursActionPerformed
        AfficherLesCovoitureurs afficherLesCovoitureurs = new AfficherLesCovoitureurs();
        afficherLesCovoitureurs.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_boutton_AfficherLesCovoitureursActionPerformed

    private void boutton_RechercheUnCovoitureurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutton_RechercheUnCovoitureurActionPerformed
        RechercherUnCovoitureur rechercherUnCovoitureur = new RechercherUnCovoitureur();
        rechercherUnCovoitureur.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_boutton_RechercheUnCovoitureurActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesCovoitureurs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutton_AfficherLesCovoitureurs;
    private javax.swing.JButton boutton_AjouterCovoitureur;
    private javax.swing.JButton boutton_RechercheUnCovoitureur;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}