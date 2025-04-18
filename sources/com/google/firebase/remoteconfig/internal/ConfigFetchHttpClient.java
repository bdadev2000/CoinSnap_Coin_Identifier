package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import e0.a;
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
import lc.c;
import lc.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f12087h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12090d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12091e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12092f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12093g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j3, long j10) {
        String str3;
        this.a = context;
        this.f12088b = str;
        this.f12089c = str2;
        Matcher matcher = f12087h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.f12090d = str3;
        this.f12091e = "firebase";
        this.f12092f = j3;
        this.f12093g = j10;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
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

    public final JSONObject a(String str, String str2, Map map, Long l10) {
        long j3;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f12088b);
            Context context = this.a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j3 = a.b(packageInfo);
                    } else {
                        j3 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j3));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.0.1");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                long longValue = l10.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new c("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f12090d, this.f12091e)).openConnection();
        } catch (IOException e2) {
            throw new d(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009c A[LOOP:0: B:8:0x0096->B:11:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce A[Catch: JSONException -> 0x0189, IOException | JSONException -> 0x018b, all -> 0x0194, TRY_LEAVE, TryCatch #8 {all -> 0x0194, blocks: (B:13:0x00b2, B:15:0x00ce, B:82:0x017f, B:83:0x0188, B:85:0x018c, B:86:0x0193), top: B:9:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f A[Catch: JSONException -> 0x0189, IOException | JSONException -> 0x018b, all -> 0x0194, TRY_ENTER, TryCatch #8 {all -> 0x0194, blocks: (B:13:0x00b2, B:15:0x00ce, B:82:0x017f, B:83:0x0188, B:85:0x018c, B:86:0x0193), top: B:9:0x009a }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mc.h fetch(java.net.HttpURLConnection r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.Long r14, java.util.Date r15) throws lc.d {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):mc.h");
    }
}
