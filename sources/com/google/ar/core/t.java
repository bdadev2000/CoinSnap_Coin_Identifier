package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes2.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f14307a;

    public t(v vVar) {
        this.f14307a = vVar;
    }

    @Override // com.google.ar.core.s
    public final void a(ArCoreApk.Availability availability) {
        synchronized (this.f14307a) {
            v vVar = this.f14307a;
            vVar.f14314g = availability;
            vVar.f14315h = false;
        }
    }
}
