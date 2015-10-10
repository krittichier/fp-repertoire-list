package edu.bsu.cs222.fp.repertoireList;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;                          

public class URLFactory {
	private String url;
	
	public URLFactory(String query) {
		String encodedQuery = "";
		try {
			encodedQuery = URLEncoder.encode(query, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			new ExceptionHandler("Error!  Try Again.");
		}
		url =  "http://developer.echonest.com/api/v4/song/search?api_key=NDVFILMAVOOY8ITWS&artist=" + encodedQuery + "&format=json&results=100";
	}
	
	public String getURL() {
		return url;
	}
}
