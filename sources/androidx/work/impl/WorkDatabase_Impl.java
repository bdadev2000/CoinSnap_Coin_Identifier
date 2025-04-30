package androidx.work.impl;

import B4.c;
import D0.a;
import D0.e;
import D0.j;
import D0.l;
import E1.d;
import a7.b;
import android.content.Context;
import b1.h;
import d1.C2161b;
import d1.C2164e;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f5219s = 0;
    public volatile c l;
    public volatile b m;

    /* renamed from: n, reason: collision with root package name */
    public volatile d f5220n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C.c f5221o;

    /* renamed from: p, reason: collision with root package name */
    public volatile b f5222p;

    /* renamed from: q, reason: collision with root package name */
    public volatile h f5223q;

    /* renamed from: r, reason: collision with root package name */
    public volatile d f5224r;

    @Override // D0.j
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // D0.j
    public final H0.d e(a aVar) {
        l lVar = new l(aVar, new E1.c(this, 21));
        Context context = aVar.b;
        if (context != null) {
            return aVar.f582a.d(new H0.b(context, aVar.f583c, lVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b i() {
        b bVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new b((j) this, 19);
                }
                bVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d j() {
        d dVar;
        if (this.f5224r != null) {
            return this.f5224r;
        }
        synchronized (this) {
            try {
                if (this.f5224r == null) {
                    this.f5224r = new d(this, 24);
                }
                dVar = this.f5224r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C.c k() {
        C.c cVar;
        if (this.f5221o != null) {
            return this.f5221o;
        }
        synchronized (this) {
            try {
                if (this.f5221o == null) {
                    this.f5221o = new C.c(this);
                }
                cVar = this.f5221o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b l() {
        b bVar;
        if (this.f5222p != null) {
            return this.f5222p;
        }
        synchronized (this) {
            try {
                if (this.f5222p == null) {
                    this.f5222p = new b((j) this, 20);
                }
                bVar = this.f5222p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b1.h, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final h m() {
        h hVar;
        if (this.f5223q != null) {
            return this.f5223q;
        }
        synchronized (this) {
            try {
                if (this.f5223q == null) {
                    ?? obj = new Object();
                    obj.b = this;
                    obj.f5270c = new C2161b(this, 4);
                    obj.f5271d = new C2164e(this, 1);
                    obj.f5272f = new C2164e(this, 2);
                    this.f5223q = obj;
                }
                hVar = this.f5223q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c n() {
        c cVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new c(this);
                }
                cVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d o() {
        d dVar;
        if (this.f5220n != null) {
            return this.f5220n;
        }
        synchronized (this) {
            try {
                if (this.f5220n == null) {
                    this.f5220n = new d(this, 25);
                }
                dVar = this.f5220n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
