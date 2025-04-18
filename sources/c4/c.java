package c4;

import android.util.Log;
import e4.j;
import e4.m;
import g4.k;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public final class c implements i4.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f2589b;

    /* renamed from: c, reason: collision with root package name */
    public d f2590c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2591d;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2592f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2593g;

    public c(File file, long j3) {
        this.f2593g = new d3.g(22, (com.applovin.impl.mediation.ads.e) null);
        this.f2592f = file;
        this.f2589b = j3;
        this.f2591d = new d3.g(24, (com.applovin.impl.mediation.ads.e) null);
    }

    @Override // i4.a
    public final File g(j jVar) {
        d dVar;
        String u = ((d3.g) this.f2591d).u(jVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + u + " for for Key: " + jVar);
        }
        try {
            synchronized (this) {
                if (this.f2590c == null) {
                    this.f2590c = d.s((File) this.f2592f, this.f2589b);
                }
                dVar = this.f2590c;
            }
            c q10 = dVar.q(u);
            if (q10 != null) {
                return ((File[]) q10.f2593g)[0];
            }
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            }
        }
        return null;
    }

    @Override // i4.a
    public final void j(j jVar, k kVar) {
        i4.b bVar;
        d dVar;
        boolean z10;
        String u = ((d3.g) this.f2591d).u(jVar);
        d3.g gVar = (d3.g) this.f2593g;
        synchronized (gVar) {
            bVar = (i4.b) ((Map) gVar.f16812c).get(u);
            if (bVar == null) {
                f.a aVar = (f.a) gVar.f16813d;
                synchronized (((Queue) aVar.f17509c)) {
                    bVar = (i4.b) ((Queue) aVar.f17509c).poll();
                }
                if (bVar == null) {
                    bVar = new i4.b();
                }
                ((Map) gVar.f16812c).put(u, bVar);
            }
            bVar.f19141b++;
        }
        bVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + u + " for for Key: " + jVar);
            }
            try {
                synchronized (this) {
                    if (this.f2590c == null) {
                        this.f2590c = d.s((File) this.f2592f, this.f2589b);
                    }
                    dVar = this.f2590c;
                }
                if (dVar.q(u) == null) {
                    h3.a k10 = dVar.k(u);
                    if (k10 != null) {
                        try {
                            if (((e4.c) kVar.a).p(kVar.f18102b, k10.j(), (m) kVar.f18103c)) {
                                k10.c();
                            }
                            if (!z10) {
                                try {
                                    k10.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!k10.f18722c) {
                                try {
                                    k10.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(u));
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            ((d3.g) this.f2593g).E(u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, String str, long j3, File[] fileArr, long[] jArr) {
        this.f2590c = dVar;
        this.f2591d = str;
        this.f2589b = j3;
        this.f2593g = fileArr;
        this.f2592f = jArr;
    }
}
