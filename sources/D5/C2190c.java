package d5;

import com.mbridge.msdk.foundation.download.Command;
import h5.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2190c extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    public final e f19899a;

    public C2190c(HttpURLConnection httpURLConnection, i iVar, b5.e eVar) {
        super(httpURLConnection.getURL());
        this.f19899a = new e(httpURLConnection, iVar, eVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f19899a.f19902a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f19899a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.f19899a;
        long c9 = eVar.f19905e.c();
        b5.e eVar2 = eVar.b;
        eVar2.k(c9);
        eVar2.c();
        eVar.f19902a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f19899a.f19902a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f19899a.f19902a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f19899a.f19902a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f19899a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f19899a.f19902a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f19899a.f19902a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f19899a.f19902a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f19899a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i9) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderField(i9);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j7) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderFieldDate(str, j7);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i9) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderFieldInt(str, i9);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i9) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderFieldKey(i9);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j7) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderFieldLong(str, j7);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f19899a.f19902a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f19899a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f19899a.f19902a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f19899a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        e eVar = this.f19899a;
        eVar.getClass();
        try {
            return eVar.f19902a.getPermission();
        } catch (IOException e4) {
            long c9 = eVar.f19905e.c();
            b5.e eVar2 = eVar.b;
            eVar2.k(c9);
            h.c(eVar2);
            throw e4;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f19899a.f19902a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f19899a.f19902a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f19899a.f19902a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f19899a.f19902a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f19899a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f19899a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f19899a.f19902a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f19899a.f19902a.getUseCaches();
    }

    public final int hashCode() {
        return this.f19899a.f19902a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z8) {
        this.f19899a.f19902a.setAllowUserInteraction(z8);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i9) {
        this.f19899a.f19902a.setChunkedStreamingMode(i9);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i9) {
        this.f19899a.f19902a.setConnectTimeout(i9);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z8) {
        this.f19899a.f19902a.setDefaultUseCaches(z8);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z8) {
        this.f19899a.f19902a.setDoInput(z8);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z8) {
        this.f19899a.f19902a.setDoOutput(z8);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i9) {
        this.f19899a.f19902a.setFixedLengthStreamingMode(i9);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j7) {
        this.f19899a.f19902a.setIfModifiedSince(j7);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z8) {
        this.f19899a.f19902a.setInstanceFollowRedirects(z8);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i9) {
        this.f19899a.f19902a.setReadTimeout(i9);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f19899a.f19902a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f19899a;
        eVar.getClass();
        if (Command.HTTP_HEADER_USER_AGENT.equalsIgnoreCase(str)) {
            eVar.b.f5329h = str2;
        }
        eVar.f19902a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z8) {
        this.f19899a.f19902a.setUseCaches(z8);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f19899a.f19902a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f19899a.f19902a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f19899a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.f19899a;
        eVar.i();
        return eVar.f19902a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j7) {
        this.f19899a.f19902a.setFixedLengthStreamingMode(j7);
    }
}
