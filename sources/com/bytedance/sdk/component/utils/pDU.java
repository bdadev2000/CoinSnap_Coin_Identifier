package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class pDU {
    private static volatile pDU tN;
    private Context AlY;
    private volatile boolean Sg = false;
    private Map<String, String> YFl;

    private pDU(Context context) {
        if (context != null && this.AlY == null) {
            this.AlY = context.getApplicationContext();
            YFl();
        }
        this.AlY = context;
    }

    private String AlY(String str) {
        String str2;
        String wN = wN(str);
        if (wN.isEmpty()) {
            return null;
        }
        YFl();
        Map<String, String> map = this.YFl;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.YFl.get(wN);
            if (str2 == null) {
                wN = wN(wN);
            }
            if (str2 != null) {
                break;
            }
        } while (!wN.isEmpty());
        return str2;
    }

    private static String Sg(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = trim.toLowerCase(locale);
        if (!tN(lowerCase)) {
            return null;
        }
        int i10 = indexOf + 1;
        if (indexOf2 < 0) {
            substring = str.substring(i10);
        } else {
            substring = str.substring(i10, indexOf2);
        }
        String lowerCase2 = substring.trim().toLowerCase(locale);
        if (!tN(lowerCase2)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(lowerCase2.length() + lowerCase.length() + 1);
        sb2.append(lowerCase);
        sb2.append('/');
        sb2.append(lowerCase2);
        return sb2.toString();
    }

    private static boolean tN(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (!YFl(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    private void vc(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (trim.charAt(0) != '#') {
                String replaceAll = trim.replaceAll("\\s*#.*", "");
                if (replaceAll.indexOf(61) > 0) {
                    Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
                    if (matcher.find()) {
                        String substring = matcher.group().substring(5);
                        if (substring.charAt(0) == '\"') {
                            substring = substring.substring(1, substring.length() - 1);
                        }
                        Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                        if (matcher2.find()) {
                            String substring2 = matcher2.group().substring(5);
                            if (substring2.charAt(0) == '\"') {
                                substring2 = substring2.substring(1, substring2.length() - 1);
                            }
                            for (String str2 : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                                YFl(str2, substring);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] split = replaceAll.split("\\s+");
                for (int i10 = 1; i10 < split.length; i10++) {
                    YFl(split[i10], split[0]);
                }
            }
        }
    }

    private static String wN(String str) {
        int indexOf;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf(46)) >= 0 && indexOf < str.length() - 1) {
            return str.substring(indexOf + 1);
        }
        return "";
    }

    public static String YFl(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith("/")) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return YFl(context).YFl(str);
    }

    public static pDU YFl(Context context) {
        if (tN == null) {
            synchronized (pDU.class) {
                if (tN == null) {
                    tN = new pDU(context);
                }
            }
        }
        return tN;
    }

    public final String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String AlY = AlY(str);
        if (TextUtils.isEmpty(AlY)) {
            return null;
        }
        return Sg(AlY);
    }

    private static boolean YFl(char c10) {
        return c10 > ' ' && c10 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c10) < 0;
    }

    private void YFl() {
        if (this.AlY == null || this.Sg) {
            return;
        }
        synchronized (this) {
            if (!this.Sg) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.pDU.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream open = pDU.this.AlY.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(open));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        if (!TextUtils.isEmpty(readLine)) {
                                            arrayList.add(readLine);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = open;
                                        try {
                                            List<String> emptyList = Collections.emptyList();
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            return emptyList;
                                        } finally {
                                        }
                                    }
                                }
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused5) {
                                }
                                return arrayList;
                            } catch (Throwable unused6) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused7) {
                            bufferedReader = null;
                        }
                    }
                });
                this.YFl = new HashMap(list.size());
                String str = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = str + ((String) it.next());
                    if (str2.endsWith("\\")) {
                        str = str2.substring(0, str2.length() - 1);
                    } else {
                        vc(str2);
                        str = "";
                    }
                }
                if (!str.isEmpty()) {
                    vc(str);
                }
                this.Sg = true;
            }
        }
    }

    private void YFl(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.YFl.containsKey(str)) {
            return;
        }
        this.YFl.put(str, str2);
    }
}
