package com.amazonaws.util;

import androidx.webkit.ProxyConfig;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class HttpUtils {
    private static final Pattern DECODED_CHARACTERS_PATTERN;
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final Pattern ENCODED_CHARACTERS_PATTERN;
    private static final int HTTP_STATUS_OK = 200;
    private static final int PORT_HTTP = 80;
    private static final int PORT_HTTPS = 443;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Pattern.quote("+")).append("|").append(Pattern.quote(ProxyConfig.MATCH_ALL_SCHEMES)).append("|").append(Pattern.quote("%7E")).append("|").append(Pattern.quote("%2F"));
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Pattern.quote("%2A")).append("|").append(Pattern.quote("%2B")).append("|");
        DECODED_CHARACTERS_PATTERN = Pattern.compile(sb2.toString());
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
                    group = "%20";
                } else if (ProxyConfig.MATCH_ALL_SCHEMES.equals(group)) {
                    group = "%2A";
                } else if ("%7E".equals(group)) {
                    group = "~";
                } else if (z && "%2F".equals(group)) {
                    group = RemoteSettings.FORWARD_SLASH_STRING;
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

    public static boolean isUsingNonDefaultPort(URI uri) {
        String lowerCase = StringUtils.lowerCase(uri.getScheme());
        int port = uri.getPort();
        if (port <= 0) {
            return false;
        }
        if (ProxyConfig.MATCH_HTTP.equals(lowerCase) && port == 80) {
            return false;
        }
        return ("https".equals(lowerCase) && port == PORT_HTTPS) ? false : true;
    }

    public static boolean usePayloadForQueryParameters(Request<?> request) {
        return HttpMethodName.POST.equals(request.getHttpMethod()) && (request.getContent() == null);
    }

    public static String encodeParameters(Request<?> request) {
        String encode;
        if (request.getParameters().isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry<String, String> entry : request.getParameters().entrySet()) {
                String encode2 = URLEncoder.encode(entry.getKey(), "UTF-8");
                String value = entry.getValue();
                if (value != null) {
                    encode = URLEncoder.encode(value, "UTF-8");
                } else {
                    encode = "";
                }
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(encode2).append("=").append(encode);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String appendUri(String str, String str2) {
        return appendUri(str, str2, false);
    }

    public static String appendUri(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0) {
            return !str.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? str + RemoteSettings.FORWARD_SLASH_STRING : str;
        }
        if (str2.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(0, str.length() - 1);
            }
        } else if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            str = str + RemoteSettings.FORWARD_SLASH_STRING;
        }
        String urlEncode = urlEncode(str2, true);
        if (z) {
            urlEncode = urlEncode.replace("//", "/%2F");
        }
        return str + urlEncode;
    }

    public static String appendUriEncoded(String str, String str2) {
        return str2 != null ? str + str2 : str;
    }

    public static InputStream fetchFile(URI uri, ClientConfiguration clientConfiguration) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) uri.toURL().openConnection();
        httpURLConnection.setConnectTimeout(getConnectionTimeout(clientConfiguration));
        httpURLConnection.setReadTimeout(getSocketTimeout(clientConfiguration));
        httpURLConnection.addRequestProperty("User-Agent", getUserAgent(clientConfiguration));
        if (httpURLConnection.getResponseCode() != 200) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                errorStream.close();
            }
            httpURLConnection.disconnect();
            throw new IOException("Error fetching file from " + uri + ": " + httpURLConnection.getResponseMessage());
        }
        return httpURLConnection.getInputStream();
    }

    static String getUserAgent(ClientConfiguration clientConfiguration) {
        String userAgent = clientConfiguration != null ? clientConfiguration.getUserAgent() : null;
        if (userAgent == null) {
            return ClientConfiguration.DEFAULT_USER_AGENT;
        }
        return !ClientConfiguration.DEFAULT_USER_AGENT.equals(userAgent) ? userAgent + ", " + ClientConfiguration.DEFAULT_USER_AGENT : userAgent;
    }

    static int getConnectionTimeout(ClientConfiguration clientConfiguration) {
        if (clientConfiguration != null) {
            return clientConfiguration.getConnectionTimeout();
        }
        return 15000;
    }

    static int getSocketTimeout(ClientConfiguration clientConfiguration) {
        if (clientConfiguration != null) {
            return clientConfiguration.getSocketTimeout();
        }
        return 15000;
    }
}
