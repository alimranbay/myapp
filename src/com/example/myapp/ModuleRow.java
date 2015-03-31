package com.example.myapp;

/**
 * Created by Ali Imran on 31/03/2015.
 * Een klasse om de image, description en vraag bij te houden om later te gebruiken in een custom adapter
 * made by Georgy(c)
 */
public class ModuleRow {
	private String title;
	private String description;
	private int image;

	public ModuleRow(String title, String description, int image) {
		this.title = title;
		this.description = description;
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getImage() {
		return image;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImage(int image) {
		this.image = image;
	}
}
