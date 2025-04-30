package com.apm.insight.k;

import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.apm.insight.Npth;
import com.apm.insight.l.q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5880a = false;
    private static h b;

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);


        /* renamed from: d, reason: collision with root package name */
        final int f5884d;

        a(int i9) {
            this.f5884d = i9;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);

        final int l;

        b(int i9) {
            this.l = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r9.endsWith("?") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r9 = r9.concat(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r9 = com.mbridge.msdk.foundation.entity.o.j(r9, "tt_data=a");
        r12 = "application/octet-stream;tt-data=a";
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r9.endsWith("&") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.apm.insight.k.l a(long r7, java.lang.String r9, byte[] r10, com.apm.insight.k.e.a r11, java.lang.String r12, boolean r13) {
        /*
            boolean r7 = com.apm.insight.Npth.isStopUpload()
            r8 = 201(0xc9, float:2.82E-43)
            if (r7 == 0) goto Le
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r7.<init>(r8)
            return r7
        Le:
            if (r9 != 0) goto L16
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r7.<init>(r8)
            return r7
        L16:
            if (r10 != 0) goto L1b
            r7 = 0
            byte[] r10 = new byte[r7]
        L1b:
            int r7 = r10.length
            com.apm.insight.k.e$a r8 = com.apm.insight.k.e.a.GZIP
            r0 = 128(0x80, float:1.8E-43)
            if (r8 != r11) goto L2d
            if (r7 <= r0) goto L2d
            byte[] r10 = b(r10)
            java.lang.String r7 = "gzip"
        L2a:
            r3 = r7
            r1 = r10
            goto L3c
        L2d:
            com.apm.insight.k.e$a r8 = com.apm.insight.k.e.a.DEFLATER
            if (r8 != r11) goto L3a
            if (r7 <= r0) goto L3a
            byte[] r10 = a(r10)
            java.lang.String r7 = "deflate"
            goto L2a
        L3a:
            r7 = 0
            goto L2a
        L3c:
            if (r1 != 0) goto L46
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r8 = 202(0xca, float:2.83E-43)
            r7.<init>(r8)
            return r7
        L46:
            if (r13 == 0) goto L8f
            com.apm.insight.runtime.ConfigManager r7 = com.apm.insight.i.i()
            com.apm.insight.e r7 = r7.getEncryptImpl()
            byte[] r7 = r7.a(r1)
            if (r7 == 0) goto L84
            java.net.URL r8 = new java.net.URL
            r8.<init>(r9)
            java.lang.String r8 = r8.getQuery()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L72
            java.lang.String r8 = "?"
            boolean r10 = r9.endsWith(r8)
            if (r10 != 0) goto L7b
        L6d:
            java.lang.String r9 = r9.concat(r8)
            goto L7b
        L72:
            java.lang.String r8 = "&"
            boolean r10 = r9.endsWith(r8)
            if (r10 != 0) goto L7b
            goto L6d
        L7b:
            java.lang.String r8 = "tt_data=a"
            java.lang.String r9 = com.mbridge.msdk.foundation.entity.o.j(r9, r8)
            java.lang.String r12 = "application/octet-stream;tt-data=a"
            r1 = r7
        L84:
            r0 = r9
            r2 = r12
            r5 = 1
            r6 = 1
            java.lang.String r4 = "POST"
            com.apm.insight.k.l r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L8f:
            r5 = 1
            r6 = 0
            java.lang.String r4 = "POST"
            r0 = r9
            r2 = r12
            com.apm.insight.k.l r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.e.a(long, java.lang.String, byte[], com.apm.insight.k.e$a, java.lang.String, boolean):com.apm.insight.k.l");
    }

    public static l b(String str, String str2) {
        return a(str, str2, a());
    }

    private static l c(byte[] bArr) {
        return new l(204, bArr);
    }

    public static String d() {
        return com.apm.insight.i.i().getAlogUploadUrl();
    }

    public static String e() {
        return com.apm.insight.i.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.i.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.i.i().getNativeCrashUploadUrl();
    }

    public static l b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        try {
            j jVar = new j(c(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            jVar.a("json", str2, true);
            jVar.a("file", fileArr);
            try {
                return new l(0, new JSONObject(jVar.a()));
            } catch (JSONException e4) {
                return new l(0, e4);
            }
        } catch (IOException e9) {
            e9.printStackTrace();
            return new l(207);
        }
    }

    public static String c() {
        return com.apm.insight.i.i().getJavaCrashUploadUrl();
    }

    private static String d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    private static l b(String str, byte[] bArr, String str2, String str3, String str4, boolean z8, boolean z9) {
        InputStream inputStream;
        GZIPInputStream gZIPInputStream;
        byte[] a6;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream2 = null;
        try {
            h hVar = b;
            if (hVar != null) {
                try {
                    str = hVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                if (z8) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (str4 == null) {
                    throw new IllegalArgumentException("request method is not null");
                }
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.l.k.a(dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            com.apm.insight.l.k.a(dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    l lVar = new l(206, "http response code " + responseCode);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                    com.apm.insight.l.k.a((Closeable) null);
                    return lVar;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            gZIPInputStream = new GZIPInputStream(inputStream2);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            a6 = a(gZIPInputStream);
                            com.apm.insight.l.k.a(gZIPInputStream);
                        } catch (Throwable th4) {
                            th = th4;
                            gZIPInputStream2 = gZIPInputStream;
                            com.apm.insight.l.k.a(gZIPInputStream2);
                            throw th;
                        }
                    } else {
                        a6 = a(inputStream2);
                    }
                    l c9 = c(a6);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                    }
                    com.apm.insight.l.k.a(inputStream2);
                    return c9;
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        q.a(th);
                        return new l(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        com.apm.insight.l.k.a(inputStream);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str.concat("?");
                }
            } else if (!str.endsWith("&")) {
                str = str.concat("&");
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean b() {
        return true;
    }

    private static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FragmentTransaction.TRANSIT_EXIT_MASK);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                q.b(th);
                gZIPOutputStream.close();
                return null;
            } catch (Throwable th2) {
                gZIPOutputStream.close();
                throw th2;
            }
        }
    }

    public static l a(String str, String str2) {
        return a(str, str2, b());
    }

    public static l a(String str, String str2, boolean z8) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z8);
            }
            return new l(201);
        } catch (Throwable th) {
            q.b(th);
            return new l(207, th);
        }
    }

    public static l a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static l a(String str, byte[] bArr, String str2, String str3, String str4, boolean z8, boolean z9) {
        return b(str, bArr, str2, str3, str4, z8, z9);
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(d(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(h hVar) {
        b = hVar;
    }

    public static boolean a() {
        return true;
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            j jVar = new j(str, "UTF-8", false);
            jVar.a("aid", str2);
            jVar.a("device_id", str3);
            jVar.a("os", "Android");
            jVar.a("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "Crash");
                    jVar.a(file.getName(), file, hashMap);
                }
            }
            return new JSONObject(jVar.a()).optInt("errno", -1) == 200;
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.l.k.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE, a(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(FragmentTransaction.TRANSIT_EXIT_MASK);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
