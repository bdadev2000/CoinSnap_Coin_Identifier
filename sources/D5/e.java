package d5;

import a5.C0397a;
import com.mbridge.msdk.foundation.entity.o;
import h5.i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0397a f19901f = C0397a.d();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f19902a;
    public final b5.e b;

    /* renamed from: c, reason: collision with root package name */
    public long f19903c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f19904d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final i f19905e;

    public e(HttpURLConnection httpURLConnection, i iVar, b5.e eVar) {
        this.f19902a = httpURLConnection;
        this.b = eVar;
        this.f19905e = iVar;
        eVar.l(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j7 = this.f19903c;
        b5.e eVar = this.b;
        i iVar = this.f19905e;
        if (j7 == -1) {
            iVar.f();
            long j9 = iVar.b;
            this.f19903c = j9;
            eVar.h(j9);
        }
        try {
            this.f19902a.connect();
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final Object b() {
        i iVar = this.f19905e;
        i();
        HttpURLConnection httpURLConnection = this.f19902a;
        int responseCode = httpURLConnection.getResponseCode();
        b5.e eVar = this.b;
        eVar.f(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                eVar.i(httpURLConnection.getContentType());
                return new C2188a((InputStream) content, eVar, iVar);
            }
            eVar.i(httpURLConnection.getContentType());
            eVar.j(httpURLConnection.getContentLength());
            eVar.k(iVar.c());
            eVar.c();
            return content;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final Object c(Class[] clsArr) {
        i iVar = this.f19905e;
        i();
        HttpURLConnection httpURLConnection = this.f19902a;
        int responseCode = httpURLConnection.getResponseCode();
        b5.e eVar = this.b;
        eVar.f(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                eVar.i(httpURLConnection.getContentType());
                return new C2188a((InputStream) content, eVar, iVar);
            }
            eVar.i(httpURLConnection.getContentType());
            eVar.j(httpURLConnection.getContentLength());
            eVar.k(iVar.c());
            eVar.c();
            return content;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f19902a;
        b5.e eVar = this.b;
        i();
        try {
            eVar.f(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f19901f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return new C2188a(errorStream, eVar, this.f19905e);
        }
        return errorStream;
    }

    public final InputStream e() {
        i iVar = this.f19905e;
        i();
        HttpURLConnection httpURLConnection = this.f19902a;
        int responseCode = httpURLConnection.getResponseCode();
        b5.e eVar = this.b;
        eVar.f(responseCode);
        eVar.i(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new C2188a(inputStream, eVar, iVar);
            }
            return inputStream;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final boolean equals(Object obj) {
        return this.f19902a.equals(obj);
    }

    public final OutputStream f() {
        i iVar = this.f19905e;
        b5.e eVar = this.b;
        try {
            OutputStream outputStream = this.f19902a.getOutputStream();
            if (outputStream != null) {
                return new C2189b(outputStream, eVar, iVar);
            }
            return outputStream;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final int g() {
        i();
        long j7 = this.f19904d;
        i iVar = this.f19905e;
        b5.e eVar = this.b;
        if (j7 == -1) {
            long c9 = iVar.c();
            this.f19904d = c9;
            eVar.f5327f.p(c9);
        }
        try {
            int responseCode = this.f19902a.getResponseCode();
            eVar.f(responseCode);
            return responseCode;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.f19902a;
        i();
        long j7 = this.f19904d;
        i iVar = this.f19905e;
        b5.e eVar = this.b;
        if (j7 == -1) {
            long c9 = iVar.c();
            this.f19904d = c9;
            eVar.f5327f.p(c9);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            eVar.f(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e4) {
            o.u(iVar, eVar, eVar);
            throw e4;
        }
    }

    public final int hashCode() {
        return this.f19902a.hashCode();
    }

    public final void i() {
        long j7 = this.f19903c;
        b5.e eVar = this.b;
        if (j7 == -1) {
            i iVar = this.f19905e;
            iVar.f();
            long j9 = iVar.b;
            this.f19903c = j9;
            eVar.h(j9);
        }
        HttpURLConnection httpURLConnection = this.f19902a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            eVar.e(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            eVar.e("POST");
        } else {
            eVar.e("GET");
        }
    }

    public final String toString() {
        return this.f19902a.toString();
    }
}
