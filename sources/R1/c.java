package R1;

import N1.i;
import android.util.Log;
import j5.C2400c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name */
    public final File f2625c;

    /* renamed from: g, reason: collision with root package name */
    public L1.c f2628g;

    /* renamed from: f, reason: collision with root package name */
    public final E1.d f2627f = new E1.d(12);

    /* renamed from: d, reason: collision with root package name */
    public final long f2626d = 262144000;
    public final E1.d b = new E1.d(13);

    public c(File file) {
        this.f2625c = file;
    }

    @Override // R1.a
    public final void a(N1.f fVar, C.c cVar) {
        b bVar;
        L1.c b;
        boolean z8;
        String q9 = this.b.q(fVar);
        E1.d dVar = this.f2627f;
        synchronized (dVar) {
            bVar = (b) ((HashMap) dVar.f973c).get(q9);
            if (bVar == null) {
                E1.c cVar2 = (E1.c) dVar.f974d;
                synchronized (((ArrayDeque) cVar2.f972c)) {
                    bVar = (b) ((ArrayDeque) cVar2.f972c).poll();
                }
                if (bVar == null) {
                    bVar = new b();
                }
                ((HashMap) dVar.f973c).put(q9, bVar);
            }
            bVar.b++;
        }
        bVar.f2624a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + q9 + " for for Key: " + fVar);
            }
            try {
                b = b();
            } catch (IOException e4) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e4);
                }
            }
            if (b.j(q9) != null) {
                return;
            }
            H0.b h6 = b.h(q9);
            if (h6 != null) {
                try {
                    if (((N1.b) cVar.f347c).m(cVar.f348d, h6.d(), (i) cVar.f349f)) {
                        L1.c.a((L1.c) h6.f1347e, h6, true);
                        h6.b = true;
                    }
                    if (!z8) {
                        try {
                            h6.a();
                        } catch (IOException unused) {
                        }
                    }
                    return;
                } finally {
                    if (!h6.b) {
                        try {
                            h6.a();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: ".concat(q9));
        } finally {
            this.f2627f.y(q9);
        }
    }

    public final synchronized L1.c b() {
        try {
            if (this.f2628g == null) {
                this.f2628g = L1.c.l(this.f2625c, this.f2626d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2628g;
    }

    @Override // R1.a
    public final File c(N1.f fVar) {
        String q9 = this.b.q(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + q9 + " for for Key: " + fVar);
        }
        try {
            C2400c j7 = b().j(q9);
            if (j7 == null) {
                return null;
            }
            return ((File[]) j7.f21107c)[0];
        } catch (IOException e4) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e4);
            return null;
        }
    }
}
