package telran.regex.utils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {

	public static String[] selectPictures(String[] pictures, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("");
		String[] arr = {};

		for(int i=0; i < pictures.length; i++)
		{
			matcher.reset(pictures[i]);
			if(matcher.find()) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = pictures[i];
				
			}
		}
		
		return arr;
	}
}
