package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;


public interface FileReaderParser {
    public Subscriber parseSubscriber(String subLine); 
    
}

// when the resource file is type ".jason"
class JASON implements FileReaderParser{
	
	private Subscriber subscriber;

	public Subscriber parseSubscriber(String subLine) {

    	String new_subString = "";
		
		String subString2 = "";
		
		int i_col1 = subLine.indexOf(":"); //get the index of first occurrence of ":" in subLine
		int i_com1 = subLine.indexOf(","); //get the index of first occurrence of "," in subLine
		
		if((i_col1 != -1) && (i_com1 != -1)) 
		{
			subscriber.setId(Integer.parseInt(subLine.substring(i_col1+2, i_com1)));	
		}
		
		new_subString = subLine.substring(i_com1+2, subLine.length());
		int i_col2 = new_subString.indexOf(":");
		int i_com2 = new_subString.indexOf(",");
		
		if((i_col2 != -1) && (i_com2 != -1)) 
		{
			subscriber.setName(new_subString.substring(i_col2+3, i_com2-1));
		}
		
		subString2 = new_subString.substring(i_com2+2, new_subString.length());
		int i_col3 = subString2.indexOf(":");
		int i_cur3 = subString2.indexOf("}");
		
		if((i_col3 != -1) && (i_cur3 != -1)) 
		{
			subscriber.setPhone(subString2.substring(i_col3+3, i_cur3-1));
		}
		
    	return subscriber;	
	}
	
}

//when the resource file is type ".csv"
class CSV implements FileReaderParser{
	
    private Subscriber subscriber;
	
	public Subscriber parseSubscriber(String subLine) {
		
		String new_subString = "";
	
	    int iend1 = subLine.indexOf(","); //get the index of first occurrence of "," in input subLine
        
	    if(iend1 != -1) 
	    {
        	subscriber.setId(Integer.parseInt(subLine.substring(0,  iend1)));
	        
        }
	    
	    new_subString = subLine.substring(iend1+1, subLine.length());
        int iend2 = new_subString.indexOf(",");
        
        if(iend2 != -1) 
        {
        	subscriber.setName(new_subString.substring(0, iend2));
        	
        	subscriber.setPhone(new_subString.substring(iend2+1, new_subString.length()));
        }
        
    	return subscriber;
        
	}  
}
