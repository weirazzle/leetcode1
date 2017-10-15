package leetcode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class P535_Codec {
	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		try {
			return URLEncoder.encode(longUrl, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		try {
			return URLDecoder.decode(shortUrl, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		P535_Codec codec = new P535_Codec();

		String longUrl = "https://leetcode.com/problems/design-tinyurl";
		String shortUrl = codec.encode(longUrl);

		String decodedUrl = codec.decode(shortUrl);

		System.out.println(longUrl);
		System.out.println(shortUrl);
		System.out.println(decodedUrl);
	}
}
