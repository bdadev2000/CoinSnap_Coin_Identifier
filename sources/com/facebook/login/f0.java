package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 implements q0 {
    public final /* synthetic */ g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f11212b;

    public f0(g0 g0Var, r rVar) {
        this.a = g0Var;
        this.f11212b = rVar;
    }

    @Override // com.facebook.internal.q0
    public final void a(Bundle bundle, com.facebook.q qVar) {
        g0 g0Var = this.a;
        g0Var.getClass();
        r request = this.f11212b;
        Intrinsics.checkNotNullParameter(request, "request");
        g0Var.r(request, bundle, qVar);
    }
}
