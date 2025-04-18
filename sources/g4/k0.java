package g4;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k0 implements h, g {

    /* renamed from: b, reason: collision with root package name */
    public final i f18104b;

    /* renamed from: c, reason: collision with root package name */
    public final g f18105c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f18106d;

    /* renamed from: f, reason: collision with root package name */
    public volatile e f18107f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f18108g;

    /* renamed from: h, reason: collision with root package name */
    public volatile k4.x f18109h;

    /* renamed from: i, reason: collision with root package name */
    public volatile f f18110i;

    public k0(i iVar, g gVar) {
        this.f18104b = iVar;
        this.f18105c = gVar;
    }

    @Override // g4.g
    public final void a(e4.j jVar, Exception exc, com.bumptech.glide.load.data.e eVar, e4.a aVar) {
        this.f18105c.a(jVar, exc, eVar, this.f18109h.f20271c.d());
    }

    @Override // g4.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        if (this.f18108g != null) {
            Object obj = this.f18108g;
            this.f18108g = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e2);
                }
            }
        }
        if (this.f18107f != null && this.f18107f.b()) {
            return true;
        }
        this.f18107f = null;
        this.f18109h = null;
        boolean z12 = false;
        while (!z12) {
            if (this.f18106d < this.f18104b.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b3 = this.f18104b.b();
            int i10 = this.f18106d;
            this.f18106d = i10 + 1;
            this.f18109h = (k4.x) b3.get(i10);
            if (this.f18109h != null) {
                if (!this.f18104b.f18089p.a(this.f18109h.f20271c.d())) {
                    if (this.f18104b.c(this.f18109h.f20271c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                this.f18109h.f20271c.e(this.f18104b.f18088o, new d3.g(this, this.f18109h, 19));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // g4.g
    public final void c(e4.j jVar, Object obj, com.bumptech.glide.load.data.e eVar, e4.a aVar, e4.j jVar2) {
        this.f18105c.c(jVar, obj, eVar, this.f18109h.f20271c.d(), jVar);
    }

    @Override // g4.h
    public final void cancel() {
        k4.x xVar = this.f18109h;
        if (xVar != null) {
            xVar.f20271c.cancel();
        }
    }

    @Override // g4.g
    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final boolean e(Object obj) {
        int i10 = w4.g.f26732b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.g f10 = this.f18104b.f18076c.a().f(obj);
            Object i11 = f10.i();
            e4.c e2 = this.f18104b.e(i11);
            k kVar = new k(e2, i11, this.f18104b.f18082i);
            e4.j jVar = this.f18109h.a;
            i iVar = this.f18104b;
            f fVar = new f(jVar, iVar.f18087n);
            i4.a a = iVar.f18081h.a();
            a.j(fVar, kVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + e2 + ", duration: " + w4.g.a(elapsedRealtimeNanos));
            }
            if (a.g(fVar) != null) {
                this.f18110i = fVar;
                this.f18107f = new e(Collections.singletonList(this.f18109h.a), this.f18104b, this);
                this.f18109h.f20271c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f18110i + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f18105c.c(this.f18109h.a, f10.i(), this.f18109h.f20271c, this.f18109h.f20271c.d(), this.f18109h.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f18109h.f20271c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
