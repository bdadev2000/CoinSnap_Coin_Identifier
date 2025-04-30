package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f16704a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};
    private static final Pattern b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16705c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16706d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f16707e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f16708f = new HashMap();

    static {
        for (e eVar : e.values()) {
            f16708f.put(eVar.a(), eVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f16704a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f16707e;
        }
        if ("mraid:".equals(str)) {
            return f16705c;
        }
        if ("ssp:".equals(str)) {
            return f16706d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f16707e;
        }
        return null;
    }

    public static String c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i10 = 0;
                while (true) {
                    if (i10 < 2) {
                        if (cArr[i10] == charAt) {
                            stringBuffer.append("\\" + charAt);
                            break;
                        }
                        i10++;
                    } else {
                        stringBuffer.append(charAt);
                        break;
                    }
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean d(String str) {
        return e(str).startsWith("image");
    }

    public static String e(String str) {
        String str2 = f16708f.get(f(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    private static String f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
