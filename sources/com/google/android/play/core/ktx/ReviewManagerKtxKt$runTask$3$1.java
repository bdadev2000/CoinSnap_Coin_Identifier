package com.google.android.play.core.ktx;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class ReviewManagerKtxKt$runTask$3$1 extends r implements l {
    final /* synthetic */ a $onCanceled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewManagerKtxKt$runTask$3$1(a aVar) {
        super(1);
        this.$onCanceled = aVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return b0.f30125a;
    }

    public final void invoke(Throwable th) {
        this.$onCanceled.invoke();
    }
}
