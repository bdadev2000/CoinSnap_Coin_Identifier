package com.amazonaws.services.s3.internal;

import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class S3HttpUtils {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Pattern ENCODED_CHARACTERS_PATTERN;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("+")).append("|").append(Pattern.quote(ProxyConfig.MATCH_ALL_SCHEMES)).append("|").append(Pattern.quote("%7E")).append("|").append(Pattern.quote("%2F")).append("|").append(Pattern.quote("%3A")).append("|").append(Pattern.quote("%27")).append("|").append(Pattern.quote("%28")).append("|").append(Pattern.quote("%29")).append("|").append(Pattern.quote("%21")).append("|").append(Pattern.quote("%5B")).append("|").append(Pattern.quote("%5D")).append("|").append(Pattern.quote("%24"));
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(sb.toString());
    }

    public static String urlEncode(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encode);
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            while (matcher.find()) {
                String group = matcher.group(0);
                if ("+".equals(group)) {
                    group = " ";
                } else if (ProxyConfig.MATCH_ALL_SCHEMES.equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                } else if (z && "%2F".equals(group)) {
                    group = RemoteSettings.FORWARD_SLASH_STRING;
                } else if (z && "%3A".equals(group)) {
                    group = ":";
                } else if (z && "%27".equals(group)) {
                    group = "'";
                } else if (z && "%28".equals(group)) {
                    group = "(";
                } else if (z && "%29".equals(group)) {
                    group = ")";
                } else if (z && "%21".equals(group)) {
                    group = "!";
                } else if (z && "%5B".equals(group)) {
                    group = "[";
                } else if (z && "%5D".equals(group)) {
                    group = "]";
                }
                matcher.appendReplacement(stringBuffer, group);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String urlDecode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
