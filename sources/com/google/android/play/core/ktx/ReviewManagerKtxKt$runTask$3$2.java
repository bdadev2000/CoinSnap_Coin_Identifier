package com.google.android.play.core.ktx;

import b1.k;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class ReviewManagerKtxKt$runTask$3$2 extends r implements l {
    final /* synthetic */ k $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewManagerKtxKt$runTask$3$2(k kVar) {
        super(1);
        this.$continuation = kVar;
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m602invoke((ReviewManagerKtxKt$runTask$3$2) obj);
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m602invoke(T t2) {
        this.$continuation.resumeWith(t2);
    }
}
