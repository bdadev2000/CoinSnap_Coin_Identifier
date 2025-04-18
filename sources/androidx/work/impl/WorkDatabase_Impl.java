package androidx.work.impl;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import s2.h;
import u2.c;
import u2.l;
import v1.i0;
import v1.j;
import v1.u;
import z1.g;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: c, reason: collision with root package name */
    public volatile l f2201c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f2202d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c f2203e;

    /* renamed from: f, reason: collision with root package name */
    public volatile h.c f2204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c f2205g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h f2206h;

    /* renamed from: i, reason: collision with root package name */
    public volatile c f2207i;

    @Override // androidx.work.impl.WorkDatabase
    public final c c() {
        c cVar;
        if (this.f2202d != null) {
            return this.f2202d;
        }
        synchronized (this) {
            if (this.f2202d == null) {
                this.f2202d = new c(this, 0);
            }
            cVar = this.f2202d;
        }
        return cVar;
    }

    @Override // v1.f0
    public final u createInvalidationTracker() {
        return new u(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // v1.f0
    public final g createOpenHelper(j jVar) {
        i0 callback = new i0(jVar, new m2.j(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = jVar.a;
        Intrinsics.checkNotNullParameter(context, "context");
        z1.c cVar = new z1.c(context);
        cVar.f28457b = jVar.f25891b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        cVar.f28458c = callback;
        return jVar.f25892c.d(cVar.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c d() {
        c cVar;
        if (this.f2207i != null) {
            return this.f2207i;
        }
        synchronized (this) {
            if (this.f2207i == null) {
                this.f2207i = new c(this, 1);
            }
            cVar = this.f2207i;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h.c e() {
        h.c cVar;
        if (this.f2204f != null) {
            return this.f2204f;
        }
        synchronized (this) {
            if (this.f2204f == null) {
                this.f2204f = new h.c(this);
            }
            cVar = this.f2204f;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f2205g != null) {
            return this.f2205g;
        }
        synchronized (this) {
            if (this.f2205g == null) {
                this.f2205g = new c(this, 2);
            }
            cVar = this.f2205g;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h g() {
        h hVar;
        if (this.f2206h != null) {
            return this.f2206h;
        }
        synchronized (this) {
            if (this.f2206h == null) {
                this.f2206h = new h(this);
            }
            hVar = this.f2206h;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l h() {
        l lVar;
        if (this.f2201c != null) {
            return this.f2201c;
        }
        synchronized (this) {
            if (this.f2201c == null) {
                this.f2201c = new l(this);
            }
            lVar = this.f2201c;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c i() {
        c cVar;
        if (this.f2203e != null) {
            return this.f2203e;
        }
        synchronized (this) {
            if (this.f2203e == null) {
                this.f2203e = new c(this, 3);
            }
            cVar = this.f2203e;
        }
        return cVar;
    }
}
