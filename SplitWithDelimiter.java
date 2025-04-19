package Bolum10;

import java.util.*;
import java.util.regex.*;

public class SplitWithDelimiter {

	public static void main(String[] args) {
		 String[] parts1 = split("ab#12#453", "#");
        System.out.println(Arrays.toString(parts1)); // [ab, #, 12, #, 453]

        String[] parts2 = split("a?b?gf#e", "[?#]");
        System.out.println(Arrays.toString(parts2)); // [a, ?, b, ?, gf, #, e]
	}
	
		public static String[] split(String s, String regex) {
		    List<String> result = new ArrayList<>();
		    Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(s);
		
		    int lastIndex = 0;
		
		    while (matcher.find()) {
		        if (matcher.start() > lastIndex) {
		            result.add(s.substring(lastIndex, matcher.start())); // delimiter öncesi
		        }
		        result.add(matcher.group()); // delimiter kendisi
		        lastIndex = matcher.end();   // bir sonraki parçanýn baþlangýcý
		    }
		
		    if (lastIndex < s.length()) {
		        result.add(s.substring(lastIndex)); // son kalan parça
		    }
		
		    return result.toArray(new String[0]);
		}
}
