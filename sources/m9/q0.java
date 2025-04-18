package m9;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class q0 implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f21720b;

    /* renamed from: c, reason: collision with root package name */
    public final p f21721c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21722d;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f21723f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f21724g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Object f21725h;

    public q0(l lVar, Uri uri, int i10, p0 p0Var) {
        o oVar = new o();
        oVar.a = uri;
        oVar.f21703i = 1;
        p a = oVar.a();
        this.f21723f = new v0(lVar);
        this.f21721c = a;
        this.f21722d = i10;
        this.f21724g = p0Var;
        this.f21720b = v8.p.f26222b.getAndIncrement();
    }

    @Override // m9.k0
    public final void cancelLoad() {
    }

    @Override // m9.k0
    public final void load() {
        this.f21723f.f21777b = 0L;
        n nVar = new n(this.f21723f, this.f21721c);
        try {
            if (!nVar.f21689f) {
                nVar.f21686b.a(nVar.f21687c);
                nVar.f21689f = true;
            }
            Uri uri = this.f21723f.getUri();
            uri.getClass();
            this.f21725h = this.f21724g.d(uri, nVar);
            int i10 = n9.h0.a;
            try {
                nVar.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            int i11 = n9.h0.a;
            try {
                nVar.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }
}
