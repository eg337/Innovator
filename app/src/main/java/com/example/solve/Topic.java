package com.example.solve;

public enum Topic {
    Grade5("Grade_5_Questions", "grade_5"), Grade6("Grade_6_Questions","grade_6");
    private String rootFolderName, picturePrefix;

    Topic(String rootFolderName, String picturePrefix) {
        this.rootFolderName = rootFolderName;
        this.picturePrefix = picturePrefix;
    }

    public String getRootFolderName() {
        return rootFolderName;
    }

    public String getPicturePrefix() {
        return picturePrefix;
    }
}
/*
	enum predefined methods:
		public static enum-type [] values() //returns list of enums
		public static enum-type valueOf(String str) //(reverse toString)
		final int ordinal() //returns the ordinal value/its place in the list
		final int compareTo(enum-type e) //returns negative if invoking ordinal is less than e ordinal.
		//compare for equality by ==. equals() only returns true if ordinals are the same in the same enum collection.

	Enums can have constants

	enum Apple{
		Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);//these are ctor calls; RedDel is not given a price & called the default ctor.
		private int price;

		//ctor
		Apple(int p){price = p;}

		Apple(){price = -1;}

		int getPrice(){return price;}
	}
	//to print price, do Apple.Winesap.getPrice()

Enumerations inherit Java.lang.Enum.
 */