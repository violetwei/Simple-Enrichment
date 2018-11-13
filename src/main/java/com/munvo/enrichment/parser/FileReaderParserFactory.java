package com.munvo.enrichment.parser;

import com.munvo.enrichment.configuration.Configuration;
import com.munvo.enrichment.parser.CSV;
import com.munvo.enrichment.parser.FileReaderParser;
import com.munvo.enrichment.parser.JASON;

//Create a Factory -- Factory class
public class FileReaderParserFactory {
	
	    //use getParser method to get object of type FileReaderParser
		public static FileReaderParser getParser(Configuration configuration) {
			
			if(configuration == null) {
				return null;
			}
			
			if(configuration.getType() == "JASON") {
				return new JASON();
			}
			else if(configuration.getType() == "CSV") {
				return new CSV();
			}
			
			return null;	
		}

}