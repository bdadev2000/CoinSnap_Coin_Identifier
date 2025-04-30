package com.google.firebase.remoteconfig.internal;

import J.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import g4.h;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14373h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14374a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14375c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14376d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14377e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14378f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14379g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j7, long j9) {
        String str4;
        this.f14374a = context;
        this.b = str;
        this.f14375c = str2;
        Matcher matcher = f14373h.matcher(str);
        if (matcher.matches()) {
            str4 = matcher.group(1);
        } else {
            str4 = null;
        }
        this.f14376d = str4;
        this.f14377e = str3;
        this.f14378f = j7;
        this.f14379g = j9;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l) {
        long j7;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.b);
            Context context = this.f14374a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i9 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i9));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i9 >= 28) {
                        j7 = a.b(packageInfo);
                    } else {
                        j7 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j7));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.0.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l));
            }
            return new JSONObject(hashMap);
        }
        throw new h("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f14376d + "/namespaces/" + this.f14377e + ":fetch").openConnection();
        } catch (IOException e4) {
            throw new h(e4.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[LOOP:0: B:8:0x0098->B:11:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_LEAVE, TryCatch #15 {all -> 0x017f, blocks: (B:13:0x00b4, B:15:0x00d0, B:83:0x0185, B:84:0x018e, B:86:0x018f, B:87:0x0196), top: B:9:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185 A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_ENTER, TryCatch #15 {all -> 0x017f, blocks: (B:13:0x00b4, B:15:0x00d0, B:83:0x0185, B:84:0x018e, B:86:0x018f, B:87:0x0196), top: B:9:0x009c }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l5.f fetch(java.net.HttpURLConnection r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.Long r14, java.util.Date r15) throws k5.d {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):l5.f");
    }
}
