package com.safedk.android.internal.partials;

import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class NetworkBridge {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29993a = "javascript:";

    /* renamed from: b, reason: collision with root package name */
    public static ConcurrentHashMap<HttpURLConnection, f> f29994b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, RequestInfo> f29995c = new ConcurrentHashMap<>();
    private static final String d = "SafeDKNetwork";
    private static final String e = "";

    /* loaded from: classes.dex */
    public static class RequestInfo {

        /* renamed from: a, reason: collision with root package name */
        private String f29999a;

        /* renamed from: b, reason: collision with root package name */
        private String f30000b;

        /* renamed from: c, reason: collision with root package name */
        private String f30001c = null;
        private ByteArrayOutputStream d = new ByteArrayOutputStream();

        public RequestInfo(String sdkPackageName, String url) {
            this.f29999a = null;
            this.f30000b = null;
            this.f29999a = sdkPackageName;
            this.f30000b = url;
        }

        public String a() {
            return this.f29999a;
        }

        public String b() {
            return this.f30000b;
        }

        public String c() {
            if (this.f30001c == null) {
                this.f30001c = this.d.toString();
            }
            return this.f30001c;
        }

        public void a(byte[] bArr, long j2) {
            this.d.write(bArr, 0, (int) j2);
        }

        public String toString() {
            return "Info{" + this.f29999a + " " + this.f30000b + "}";
        }

        public void a(String str) {
            this.f30000b = str;
        }
    }

    public static void disposeOfConnectionToStreamMapping(HttpURLConnection connection) {
        try {
            f29994b.remove(connection);
        } catch (Throwable th) {
            Logger.e(d, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public static void logWebviewLoadURLRequest(final String sdk, final WebView webview, final String url) {
        Logger.d("logWebviewLoadURLRequest webview", "loadUrl " + webview.getId() + ", webview class name=" + webview.getClass().getCanonicalName() + ", WebView address : " + webview.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
        if (TextUtils.isEmpty(url) || url.startsWith("javascript:")) {
            Logger.d(d, "logWebviewLoadURLRequest loadUrl url is null or a javascript command : " + url);
            return;
        }
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            if (k.c()) {
                Executors.newScheduledThreadPool(1).execute(new Runnable() { // from class: com.safedk.android.internal.partials.NetworkBridge.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkBridge.b(sdk, webview, url);
                    }
                });
            } else {
                b(sdk, webview, url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2) {
        try {
            Logger.d("logWebviewLoadURLRequestImpl webview", "loadUrl " + webView.getId() + ", webview class name=" + webView.getClass().getCanonicalName() + ", WebView address : " + webView.toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = ");
            Logger.d(d, "logWebviewLoadURLRequest: " + str2);
            if (str2 != null) {
                BrandSafetyUtils.a(str, str2, webView);
            }
        } catch (Throwable th) {
            Logger.e(d, "caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public static Object invokeMethod(String className, String methodName, Object targetInstance, Class[] parametersTypes, Object[] paramaterValues) throws IOException {
        try {
            Method declaredMethod = Class.forName(className).getDeclaredMethod(methodName, parametersTypes);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(targetInstance, paramaterValues);
        } catch (ClassNotFoundException e2) {
            throw new IOException("Network access denied", e2.getCause());
        } catch (IllegalAccessException e3) {
            throw new IOException("Network access denied", e3.getCause());
        } catch (NoSuchMethodException e4) {
            throw new IOException("Network access denied", e4.getCause());
        } catch (InvocationTargetException e5) {
            throw new IOException("Network access denied", e5.getCause());
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            throw new IOException("error occurred while trying to access network");
        }
    }
}
