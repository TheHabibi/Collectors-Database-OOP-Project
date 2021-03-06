/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Inheritance.ComicBook;
import Inheritance.Cover;
import SystemAndMain.CollectiblesSys;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author yusuf and ali eren
 */
public class addComicBook extends javax.swing.JFrame {

    /**
     * Creates new form addComicBook
     */
    public addComicBook() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        textPublisher = new javax.swing.JTextField();
        labelPublisher = new javax.swing.JLabel();
        labelCondition = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        labelGenre = new javax.swing.JLabel();
        labelIssue = new javax.swing.JLabel();
        labelIllustrator = new javax.swing.JLabel();
        labelAuthor = new javax.swing.JLabel();
        labelArtist = new javax.swing.JLabel();
        labelCover = new javax.swing.JLabel();
        textCoverLimit = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        comboCondition = new javax.swing.JComboBox<>();
        textTitle = new javax.swing.JTextField();
        comboGenre = new javax.swing.JComboBox<>();
        textIllustrator = new javax.swing.JTextField();
        textIssue = new javax.swing.JTextField();
        textAuthor = new javax.swing.JTextField();
        checkSigned = new javax.swing.JCheckBox();
        textArtist = new javax.swing.JTextField();
        checkVariant = new javax.swing.JCheckBox();
        textYear = new javax.swing.JTextField();
        addButton = new javax.swing.JPanel();
        labelAdd = new javax.swing.JLabel();
        textInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(37, 36, 35));

        labelTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Title:");

        textPublisher.setBackground(new java.awt.Color(60, 63, 66));
        textPublisher.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textPublisher.setForeground(new java.awt.Color(255, 255, 255));
        textPublisher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textPublisher.setCaretColor(new java.awt.Color(202, 80, 16));
        textPublisher.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPublisherActionPerformed(evt);
            }
        });

        labelPublisher.setBackground(new java.awt.Color(255, 255, 255));
        labelPublisher.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPublisher.setForeground(new java.awt.Color(255, 255, 255));
        labelPublisher.setText("Publisher:");

        labelCondition.setBackground(new java.awt.Color(255, 255, 255));
        labelCondition.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCondition.setForeground(new java.awt.Color(255, 255, 255));
        labelCondition.setText("Condition:");

        labelPrice.setBackground(new java.awt.Color(255, 255, 255));
        labelPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(255, 255, 255));
        labelPrice.setText("Price:");

        labelYear.setBackground(new java.awt.Color(255, 255, 255));
        labelYear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelYear.setForeground(new java.awt.Color(255, 255, 255));
        labelYear.setText("Year:");

        labelGenre.setBackground(new java.awt.Color(255, 255, 255));
        labelGenre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelGenre.setForeground(new java.awt.Color(255, 255, 255));
        labelGenre.setText("Genre:");

        labelIssue.setBackground(new java.awt.Color(255, 255, 255));
        labelIssue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelIssue.setForeground(new java.awt.Color(255, 255, 255));
        labelIssue.setText("Issue:");

        labelIllustrator.setBackground(new java.awt.Color(255, 255, 255));
        labelIllustrator.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelIllustrator.setForeground(new java.awt.Color(255, 255, 255));
        labelIllustrator.setText("Illustrator:");

        labelAuthor.setBackground(new java.awt.Color(255, 255, 255));
        labelAuthor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelAuthor.setForeground(new java.awt.Color(255, 255, 255));
        labelAuthor.setText("Author:");

        labelArtist.setBackground(new java.awt.Color(255, 255, 255));
        labelArtist.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelArtist.setForeground(new java.awt.Color(255, 255, 255));
        labelArtist.setText("Artist:");

        labelCover.setBackground(new java.awt.Color(255, 255, 255));
        labelCover.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCover.setForeground(new java.awt.Color(255, 255, 255));
        labelCover.setText("Cover Limit:");

        textCoverLimit.setBackground(new java.awt.Color(60, 63, 66));
        textCoverLimit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textCoverLimit.setForeground(new java.awt.Color(255, 255, 255));
        textCoverLimit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textCoverLimit.setCaretColor(new java.awt.Color(202, 80, 16));
        textCoverLimit.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textCoverLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCoverLimitActionPerformed(evt);
            }
        });

        textPrice.setBackground(new java.awt.Color(60, 63, 66));
        textPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textPrice.setForeground(new java.awt.Color(255, 255, 255));
        textPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textPrice.setCaretColor(new java.awt.Color(202, 80, 16));
        textPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPriceActionPerformed(evt);
            }
        });

        comboCondition.setBackground(new java.awt.Color(255, 102, 51));
        comboCondition.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboCondition.setForeground(new java.awt.Color(255, 255, 255));
        comboCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Near Mint", "Fine", "Good", "Fair", "Poor" }));

        textTitle.setBackground(new java.awt.Color(60, 63, 66));
        textTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textTitle.setForeground(new java.awt.Color(255, 255, 255));
        textTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textTitle.setCaretColor(new java.awt.Color(202, 80, 16));
        textTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTitleActionPerformed(evt);
            }
        });

        comboGenre.setBackground(new java.awt.Color(255, 102, 51));
        comboGenre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboGenre.setForeground(new java.awt.Color(255, 255, 255));
        comboGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Comedy", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Thriller", "Western" }));

        textIllustrator.setBackground(new java.awt.Color(60, 63, 66));
        textIllustrator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textIllustrator.setForeground(new java.awt.Color(255, 255, 255));
        textIllustrator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textIllustrator.setCaretColor(new java.awt.Color(202, 80, 16));
        textIllustrator.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textIllustrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIllustratorActionPerformed(evt);
            }
        });

        textIssue.setBackground(new java.awt.Color(60, 63, 66));
        textIssue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textIssue.setForeground(new java.awt.Color(255, 255, 255));
        textIssue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textIssue.setCaretColor(new java.awt.Color(202, 80, 16));
        textIssue.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIssueActionPerformed(evt);
            }
        });

        textAuthor.setBackground(new java.awt.Color(60, 63, 66));
        textAuthor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textAuthor.setForeground(new java.awt.Color(255, 255, 255));
        textAuthor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textAuthor.setCaretColor(new java.awt.Color(202, 80, 16));
        textAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAuthorActionPerformed(evt);
            }
        });

        checkSigned.setBackground(new java.awt.Color(37, 36, 35));
        checkSigned.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkSigned.setForeground(new java.awt.Color(255, 255, 255));
        checkSigned.setText("Signed");

        textArtist.setBackground(new java.awt.Color(60, 63, 66));
        textArtist.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textArtist.setForeground(new java.awt.Color(255, 255, 255));
        textArtist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textArtist.setCaretColor(new java.awt.Color(202, 80, 16));
        textArtist.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textArtistActionPerformed(evt);
            }
        });

        checkVariant.setBackground(new java.awt.Color(37, 36, 35));
        checkVariant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkVariant.setForeground(new java.awt.Color(255, 255, 255));
        checkVariant.setText("Variant");

        textYear.setBackground(new java.awt.Color(60, 63, 66));
        textYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textYear.setForeground(new java.awt.Color(255, 255, 255));
        textYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 66), 2));
        textYear.setCaretColor(new java.awt.Color(202, 80, 16));
        textYear.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYearActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(60, 63, 66));
        addButton.setForeground(new java.awt.Color(60, 63, 66));
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addButtonMouseReleased(evt);
            }
        });

        labelAdd.setBackground(new java.awt.Color(153, 255, 51));
        labelAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_to_collection_96px.png"))); // NOI18N

        javax.swing.GroupLayout addButtonLayout = new javax.swing.GroupLayout(addButton);
        addButton.setLayout(addButtonLayout);
        addButtonLayout.setHorizontalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAdd)
                .addGap(20, 20, 20))
        );
        addButtonLayout.setVerticalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addButtonLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelAdd)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        textInfo.setBackground(new java.awt.Color(255, 255, 255));
        textInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textInfo.setForeground(new java.awt.Color(255, 255, 255));
        textInfo.setText(" ");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCondition, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCoverLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(textPrice)
                            .addComponent(textPublisher)
                            .addComponent(comboCondition, 0, 195, Short.MAX_VALUE)
                            .addComponent(textTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textYear))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(labelGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboGenre, 0, 195, Short.MAX_VALUE)
                            .addComponent(textIllustrator)
                            .addComponent(textAuthor)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelIssue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelIllustrator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelArtist)
                            .addComponent(checkSigned))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textIssue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArtist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkVariant, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGenre)
                        .addComponent(comboGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrice)
                    .addComponent(labelAuthor)
                    .addComponent(textAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPublisher)
                    .addComponent(textPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIllustrator)
                    .addComponent(textIllustrator, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCondition)
                    .addComponent(comboCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIssue)
                    .addComponent(textIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYear)
                    .addComponent(labelArtist)
                    .addComponent(textArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCover)
                    .addComponent(checkSigned)
                    .addComponent(checkVariant)
                    .addComponent(textCoverLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(textInfo)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPublisherActionPerformed

    private void textCoverLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCoverLimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCoverLimitActionPerformed

    private void textPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPriceActionPerformed

    private void textTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTitleActionPerformed

    private void textIllustratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIllustratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIllustratorActionPerformed

    private void textIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIssueActionPerformed

    private void textAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAuthorActionPerformed

    private void textArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textArtistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArtistActionPerformed

    private void textYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYearActionPerformed

    public void enterColor(JPanel temp) {
        temp.setBackground(new Color(202, 80, 16));
    }

    public void exitColor(JPanel temp) {
        temp.setBackground(new Color(60, 63, 66));
    }

    public void pressColor(JPanel temp) {
        temp.setBackground(new Color(255, 128, 0));
    }

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        // TODO add your handling code here:
        enterColor(addButton);
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        // TODO add your handling code here:
        exitColor(addButton);
    }//GEN-LAST:event_addButtonMouseExited

    private void addButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMousePressed
        // TODO add your handling code here:
        pressColor(addButton);
    }//GEN-LAST:event_addButtonMousePressed

    private void addButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseReleased
        // TODO add your handling code here:
        enterColor(addButton);
    }//GEN-LAST:event_addButtonMouseReleased

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:

        if (textTitle.getText().isEmpty() || textPrice.getText().isEmpty() || textPublisher.getText().isEmpty() || textAuthor.getText().isEmpty() || textIllustrator.getText().isEmpty() || textIssue.getText().isEmpty() || textArtist.getText().isEmpty() || textCoverLimit.getText().isEmpty()) {
            textInfo.setText("Please fill the necessary fields!");
        } else {
            String title = textTitle.getText();
            double price = Double.parseDouble(textPrice.getText());
            String publisher = textPublisher.getText();
            String condition = comboCondition.getSelectedItem().toString();
            int year = Integer.parseInt(textYear.getText());
            String genre = comboGenre.getSelectedItem().toString();
            String author = textAuthor.getText();
            String illustrator = textIllustrator.getText();
            int issue = Integer.parseInt(textIssue.getText());
            Boolean isSigned = checkSigned.isSelected();
            String artist = textArtist.getText();
            Boolean variant = checkVariant.isSelected();
            int coverLimit = Integer.parseInt(textCoverLimit.getText());
            Cover cov = new Cover(artist, variant, coverLimit);
            ComicBook cb = new ComicBook(author, illustrator, issue, isSigned, genre, title, price, publisher, condition, year, 0, cov);

            cb.setWorth(cb.worthCalculator());

            CollectiblesSys.addCollectible(cb);

            textInfo.setText("Your Comic Book is added to your collection!");
        }
    }//GEN-LAST:event_addButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addComicBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addComicBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addComicBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addComicBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addComicBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addButton;
    private javax.swing.JPanel background;
    private javax.swing.JCheckBox checkSigned;
    private javax.swing.JCheckBox checkVariant;
    private javax.swing.JComboBox<String> comboCondition;
    private javax.swing.JComboBox<String> comboGenre;
    private javax.swing.JLabel labelAdd;
    private javax.swing.JLabel labelArtist;
    private javax.swing.JLabel labelAuthor;
    private javax.swing.JLabel labelCondition;
    private javax.swing.JLabel labelCover;
    private javax.swing.JLabel labelGenre;
    private javax.swing.JLabel labelIllustrator;
    private javax.swing.JLabel labelIssue;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPublisher;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelYear;
    private javax.swing.JTextField textArtist;
    private javax.swing.JTextField textAuthor;
    private javax.swing.JTextField textCoverLimit;
    private javax.swing.JTextField textIllustrator;
    private javax.swing.JLabel textInfo;
    private javax.swing.JTextField textIssue;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textPublisher;
    private javax.swing.JTextField textTitle;
    private javax.swing.JTextField textYear;
    // End of variables declaration//GEN-END:variables
}
