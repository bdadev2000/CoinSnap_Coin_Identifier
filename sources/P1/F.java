package P1;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class F implements h, g {
    public final i b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2287c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f2288d;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0231e f2289f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f2290g;

    /* renamed from: h, reason: collision with root package name */
    public volatile T1.t f2291h;

    /* renamed from: i, reason: collision with root package name */
    public volatile C0232f f2292i;

    public F(i iVar, g gVar) {
        this.b = iVar;
        this.f2287c = gVar;
    }

    @Override // P1.g
    public final void a(N1.f fVar, Exception exc, com.bumptech.glide.load.data.e eVar, int i9) {
        this.f2287c.a(fVar, exc, eVar, this.f2291h.f2994c.d());
    }

    @Override // P1.h
    public final boolean b() {
        if (this.f2290g != null) {
            Object obj = this.f2290g;
            this.f2290g = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e4) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e4);
                }
            }
        }
        if (this.f2289f != null && this.f2289f.b()) {
            return true;
        }
        this.f2289f = null;
        this.f2291h = null;
        boolean z8 = false;
        while (!z8 && this.f2288d < this.b.b().size()) {
            ArrayList b = this.b.b();
            int i9 = this.f2288d;
            this.f2288d = i9 + 1;
            this.f2291h = (T1.t) b.get(i9);
            if (this.f2291h != null && (this.b.f2317p.c(this.f2291h.f2994c.d()) || this.b.c(this.f2291h.f2994c.a()) != null)) {
                this.f2291h.f2994c.e(this.b.f2316o, new a7.b(7, this, this.f2291h, false));
                z8 = true;
            }
        }
        return z8;
    }

    @Override // P1.g
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // P1.h
    public final void cancel() {
        T1.t tVar = this.f2291h;
        if (tVar != null) {
            tVar.f2994c.cancel();
        }
    }

    @Override // P1.g
    public final void d(N1.f fVar, Object obj, com.bumptech.glide.load.data.e eVar, int i9, N1.f fVar2) {
        this.f2287c.d(fVar, obj, eVar, this.f2291h.f2994c.d(), fVar);
    }

    public final boolean e(Object obj) {
        int i9 = j2.i.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        try {
            com.bumptech.glide.load.data.g g9 = this.b.f2306c.a().g(obj);
            Object c9 = g9.c();
            N1.b e4 = this.b.e(c9);
            C.c cVar = new C.c(e4, c9, this.b.f2312i, 4);
            N1.f fVar = this.f2291h.f2993a;
            i iVar = this.b;
            C0232f c0232f = new C0232f(fVar, iVar.f2315n);
            R1.a a6 = iVar.f2311h.a();
            a6.a(c0232f, cVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c0232f + ", data: " + obj + ", encoder: " + e4 + ", duration: " + j2.i.a(elapsedRealtimeNanos));
            }
            if (a6.c(c0232f) != null) {
                this.f2292i = c0232f;
                this.f2289f = new C0231e(Collections.singletonList(this.f2291h.f2993a), this.b, this);
                this.f2291h.f2994c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f2292i + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f2287c.d(this.f2291h.f2993a, g9.c(), this.f2291h.f2994c, this.f2291h.f2994c.d(), this.f2291h.f2993a);
                return false;
            } catch (Throwable th) {
                th = th;
                z8 = true;
                if (!z8) {
                    this.f2291h.f2994c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
