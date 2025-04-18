package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class A9 extends R8 {
    public final /* synthetic */ A6 A00;

    public A9(A6 a6) {
        this.A00 = a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C9O c9o) {
        float f2;
        T7 t7;
        Q4 q4;
        this.A00.A0d(c9o);
        f2 = this.A00.A01;
        t7 = this.A00.A0Z;
        float duration = (f2 * t7.getDuration()) + c9o.A00();
        q4 = this.A00.A0X;
        q4.ABz(duration);
    }
}
