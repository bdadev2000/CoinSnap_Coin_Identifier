package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class u implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f14308a;
    public final /* synthetic */ v b;

    public u(v vVar, Consumer consumer) {
        this.f14308a = consumer;
        this.b = vVar;
    }

    @Override // com.google.ar.core.s
    public final void a(ArCoreApk.Availability availability) {
        this.b.f14309a.post(new B3.b(this.f14308a, availability));
    }
}
