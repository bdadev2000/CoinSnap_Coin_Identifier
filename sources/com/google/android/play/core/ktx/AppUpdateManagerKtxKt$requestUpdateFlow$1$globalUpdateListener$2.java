package com.google.android.play.core.ktx;

import d0.b0;
import d1.p;
import d1.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2 extends r implements l {
    final /* synthetic */ q $$this$callbackFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2(q qVar) {
        super(1);
        this.$$this$callbackFlow = qVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppUpdatePassthroughListener) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull AppUpdatePassthroughListener appUpdatePassthroughListener) {
        a.s(appUpdatePassthroughListener, "$this$$receiver");
        ((p) this.$$this$callbackFlow).f(null);
    }
}
