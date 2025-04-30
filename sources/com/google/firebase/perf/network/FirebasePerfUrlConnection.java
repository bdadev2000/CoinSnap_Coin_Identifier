package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import b5.e;
import d5.C2190c;
import d5.d;
import d5.h;
import g5.C2303f;
import h5.i;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        C2303f c2303f = C2303f.f20472u;
        i iVar = new i();
        iVar.f();
        long j7 = iVar.b;
        e eVar = new e(c2303f);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) openConnection, iVar, eVar).f19900a.b();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C2190c((HttpURLConnection) openConnection, iVar, eVar).f19899a.b();
            }
            return openConnection.getContent();
        } catch (IOException e4) {
            eVar.h(j7);
            eVar.k(iVar.c());
            eVar.l(url.toString());
            h.c(eVar);
            throw e4;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection) obj, new i(), new e(C2303f.f20472u));
        }
        if (obj instanceof HttpURLConnection) {
            return new C2190c((HttpURLConnection) obj, new i(), new e(C2303f.f20472u));
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Keep
    public static InputStream openStream(URL url) throws IOException {
        C2303f c2303f = C2303f.f20472u;
        i iVar = new i();
        if (!c2303f.f20474d.get()) {
            return url.openConnection().getInputStream();
        }
        iVar.f();
        long j7 = iVar.b;
        e eVar = new e(c2303f);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                url = new d((HttpsURLConnection) openConnection, iVar, eVar).f19900a.e();
            } else if (openConnection instanceof HttpURLConnection) {
                url = new C2190c((HttpURLConnection) openConnection, iVar, eVar).f19899a.e();
            } else {
                url = openConnection.getInputStream();
            }
            return url;
        } catch (IOException e4) {
            eVar.h(j7);
            eVar.k(iVar.c());
            eVar.l(url.toString());
            h.c(eVar);
            throw e4;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        C2303f c2303f = C2303f.f20472u;
        i iVar = new i();
        iVar.f();
        long j7 = iVar.b;
        e eVar = new e(c2303f);
        try {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) openConnection, iVar, eVar).f19900a.c(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new C2190c((HttpURLConnection) openConnection, iVar, eVar).f19899a.c(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e4) {
            eVar.h(j7);
            eVar.k(iVar.c());
            eVar.l(url.toString());
            h.c(eVar);
            throw e4;
        }
    }
}
