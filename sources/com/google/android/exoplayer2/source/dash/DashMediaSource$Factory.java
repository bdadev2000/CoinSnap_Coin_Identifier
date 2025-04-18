package com.google.android.exoplayer2.source.dash;

import ac.e;
import com.facebook.internal.m;
import java.util.List;
import m9.k;
import m9.p0;
import r4.c;
import s7.j1;
import v8.a;
import v8.y;
import y8.h;
import y8.j;

/* loaded from: classes3.dex */
public final class DashMediaSource$Factory implements y {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11488h = 0;
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final k f11489b;

    /* renamed from: c, reason: collision with root package name */
    public x7.j f11490c = new x7.j();

    /* renamed from: e, reason: collision with root package name */
    public e f11492e = new e();

    /* renamed from: f, reason: collision with root package name */
    public final long f11493f = 30000;

    /* renamed from: g, reason: collision with root package name */
    public final long f11494g = 5000000;

    /* renamed from: d, reason: collision with root package name */
    public final m f11491d = new m();

    public DashMediaSource$Factory(k kVar) {
        this.a = new j(kVar);
        this.f11489b = kVar;
    }

    @Override // v8.y
    public final a a(j1 j1Var) {
        p0 p0Var;
        j1Var.f24453c.getClass();
        z8.e eVar = new z8.e();
        List list = j1Var.f24453c.f24346g;
        if (!list.isEmpty()) {
            p0Var = new c(eVar, list, 26);
        } else {
            p0Var = eVar;
        }
        return new h(j1Var, this.f11489b, p0Var, this.a, this.f11491d, this.f11490c.b(j1Var), this.f11492e, this.f11493f, this.f11494g);
    }

    @Override // v8.y
    public final y b(e eVar) {
        if (eVar != null) {
            this.f11492e = eVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // v8.y
    public final y c(x7.j jVar) {
        if (jVar != null) {
            this.f11490c = jVar;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
