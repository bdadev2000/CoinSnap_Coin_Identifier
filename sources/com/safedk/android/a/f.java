package com.safedk.android.a;

import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29072a = f.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f29073b;

    public f(URLConnection uRLConnection) {
        this.f29073b = (HttpURLConnection) uRLConnection;
    }

    public void a(boolean z2) {
        this.f29073b.setUseCaches(z2);
    }

    public void a(String str) throws ProtocolException {
        this.f29073b.setRequestMethod(str);
    }

    public void a(String str, String str2) {
        this.f29073b.setRequestProperty(str, str2);
    }

    public void b(boolean z2) {
        this.f29073b.setDoOutput(z2);
    }

    public OutputStream a() throws IOException {
        return this.f29073b.getOutputStream();
    }

    public void c(boolean z2) {
        this.f29073b.setInstanceFollowRedirects(z2);
    }

    public int b() throws IOException {
        return this.f29073b.getResponseCode();
    }

    public URL c() {
        return this.f29073b.getURL();
    }

    public void a(int i2) {
        this.f29073b.setConnectTimeout(i2);
    }

    public void d() {
        this.f29073b.disconnect();
    }

    public InputStream e() throws IOException {
        return this.f29073b.getInputStream();
    }

    public void f() throws IOException {
        if (SafeDK.getInstance().s()) {
            Logger.e(f29072a, "SafeDK network activity in offline mode ");
            Logger.printStackTrace();
        }
        this.f29073b.connect();
    }

    public String b(String str) {
        return this.f29073b.getHeaderField(str);
    }

    public InputStream g() {
        return this.f29073b.getErrorStream();
    }

    public void d(boolean z2) {
        this.f29073b.setDoInput(z2);
    }

    public void b(int i2) {
        this.f29073b.setReadTimeout(i2);
    }
}
