package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class C implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14256a;

    public C(AtomicReference atomicReference) {
        this.f14256a = atomicReference;
    }

    @Override // com.google.ar.core.s
    public final void a(ArCoreApk.Availability availability) {
        this.f14256a.set(availability);
    }
}
