package m9;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v0 implements l {
    public final l a;

    /* renamed from: b, reason: collision with root package name */
    public long f21777b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f21778c;

    /* renamed from: d, reason: collision with root package name */
    public Map f21779d;

    public v0(l lVar) {
        lVar.getClass();
        this.a = lVar;
        this.f21778c = Uri.EMPTY;
        this.f21779d = Collections.emptyMap();
    }

    @Override // m9.l
    public final long a(p pVar) {
        this.f21778c = pVar.a;
        this.f21779d = Collections.emptyMap();
        long a = this.a.a(pVar);
        Uri uri = getUri();
        uri.getClass();
        this.f21778c = uri;
        this.f21779d = getResponseHeaders();
        return a;
    }

    @Override // m9.l
    public final void c(w0 w0Var) {
        w0Var.getClass();
        this.a.c(w0Var);
    }

    @Override // m9.l
    public final void close() {
        this.a.close();
    }

    @Override // m9.l
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.a.read(bArr, i10, i11);
        if (read != -1) {
            this.f21777b += read;
        }
        return read;
    }
}
