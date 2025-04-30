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
public class dQp {
    private static volatile dQp KS;
    private Context jU;
    private volatile boolean lMd = false;
    private Map<String, String> zp;

    private dQp(Context context) {
        if (context != null && this.jU == null) {
            this.jU = context.getApplicationContext();
            zp();
        }
        this.jU = context;
    }

    private static String COT(String str) {
        int indexOf;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf(46)) >= 0 && indexOf < str.length() - 1) {
            return str.substring(indexOf + 1);
        }
        return "";
    }

    private void HWF(String str) {
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
                                zp(str2, substring);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] split = replaceAll.split("\\s+");
                for (int i9 = 1; i9 < split.length; i9++) {
                    zp(split[i9], split[0]);
                }
            }
        }
    }

    private static boolean KS(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            if (!zp(str.charAt(i9))) {
                return false;
            }
        }
        return true;
    }

    private String jU(String str) {
        String str2;
        String COT = COT(str);
        if (COT.isEmpty()) {
            return null;
        }
        zp();
        Map<String, String> map = this.zp;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.zp.get(COT);
            if (str2 == null) {
                COT = COT(COT);
            }
            if (str2 != null) {
                break;
            }
        } while (!COT.isEmpty());
        return str2;
    }

    private static String lMd(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = trim.toLowerCase(locale);
        if (!KS(lowerCase)) {
            return null;
        }
        int i9 = indexOf + 1;
        if (indexOf2 < 0) {
            substring = str.substring(i9);
        } else {
            substring = str.substring(i9, indexOf2);
        }
        String lowerCase2 = substring.trim().toLowerCase(locale);
        if (!KS(lowerCase2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(lowerCase2.length() + lowerCase.length() + 1);
        sb.append(lowerCase);
        sb.append('/');
        sb.append(lowerCase2);
        return sb.toString();
    }

    public static String zp(Context context, String str) {
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
        return zp(context).zp(str);
    }

    public static dQp zp(Context context) {
        if (KS == null) {
            synchronized (dQp.class) {
                try {
                    if (KS == null) {
                        KS = new dQp(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return KS;
    }

    public final String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String jU = jU(str);
        if (TextUtils.isEmpty(jU)) {
            return null;
        }
        return lMd(jU);
    }

    private static boolean zp(char c9) {
        return c9 > ' ' && c9 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c9) < 0;
    }

    private void zp() {
        if (this.jU == null || this.lMd) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.lMd) {
                    List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.dQp.1
                        @Override // java.security.PrivilegedAction
                        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
                        public List<String> run() {
                            BufferedReader bufferedReader;
                            InputStream inputStream = null;
                            try {
                                ArrayList arrayList = new ArrayList();
                                InputStream open = dQp.this.jU.getAssets().open("tt_mime_type.pro");
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
                    this.zp = new HashMap(list.size());
                    String str = "";
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = str + ((String) it.next());
                        if (str2.endsWith("\\")) {
                            str = str2.substring(0, str2.length() - 1);
                        } else {
                            HWF(str2);
                            str = "";
                        }
                    }
                    if (!str.isEmpty()) {
                        HWF(str);
                    }
                    this.lMd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void zp(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.zp.containsKey(str)) {
            return;
        }
        this.zp.put(str, str2);
    }
}
