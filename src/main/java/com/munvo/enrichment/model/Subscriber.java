package com.munvo.enrichment.model;

public class Subscriber{

    private int id;
    private String name;
    private String phone;
    
    //Implement FileReaderParse interface for two different file types: JSON & CSV
    //(input subLine with variables separated by ",")
    /*public Subscriber parseSubscriber(String subLine) {
    	Configuration instance = Configuration.getInstance();
    	String new_subString = "";
    	
    	int id = 0;
    	String name = "";
    	String phone = "";
    	
    	//case when the file type is "CSV"
    	if(instance.getType() == "CSV") {
    		int iend1 = subLine.indexOf(","); //get the index of first occurrence of "," in input subLine
    	    if(iend1 != -1) {
    		    id = Integer.parseInt(subLine.substring(0,  iend1)); //get ID from input
    		    new_subString = subLine.substring(iend1+1, subLine.length());
    	    }
    	    
    	    int iend2 = new_subString.indexOf(",");
    	    if(iend2 != -1) {
    		    name = new_subString.substring(0, iend2); //get name from input
    		    phone = new_subString.substring(iend2+1, new_subString.length()); //get phone from input
    	    }   
    	}
    	else { //case when the file type is "JSON" since there are only two types of file
    		String subString2 = "";
    		
    		int i_col1 = subLine.indexOf(":"); //get the index of first occurrence of ":" in subLine
    		int i_com1 = subLine.indexOf(","); //get the index of first occurrence of "," in subLine
    		if((i_col1 != -1) && (i_com1 != -1)) {
    			id = Integer.parseInt(subLine.substring(i_col1+2, i_com1)); //get ID from input
    			new_subString = subLine.substring(i_com1+2, subLine.length());
    		}
    		
    		int i_col2 = new_subString.indexOf(":");
    		int i_com2 = new_subString.indexOf(",");
    		if((i_col2 != -1) && (i_com2 != -1)) {
    			name = new_subString.substring(i_col2+3, i_com2-1); //get Name from input
    			subString2 = new_subString.substring(i_com2+2, new_subString.length());
    		}
    		
    		int i_col3 = subString2.indexOf(":");
    		int i_cur3 = subString2.indexOf("}");
    		if((i_col3 != -1) && (i_cur3 != -1)) {
    			phone = subString2.substring(i_col3+3, i_cur3-1); // get phone from input
    		}
    		
    	}
    	Subscriber subscriber = new Subscriber(id, name, phone);
    	return subscriber;	
    	
    }*/

    public Subscriber(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
