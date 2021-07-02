package com.example.demo.classes;

public class Livre {
private String titre,auteur;
private double prix;
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Livre(String titre, String auteur, double prix) {
	this.titre = titre;
	this.auteur = auteur;
	this.prix = prix;
}
public Livre() {
}
@Override
public String toString() {
	return "Livre [titre=" + titre + ", auteur=" + auteur + ", prix=" + prix + "]";
}




}
