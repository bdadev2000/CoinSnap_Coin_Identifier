package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1679a7 implements InterfaceC08432g {
    public final RectF A00 = new RectF();

    private C08462j A00(Context context, ColorStateList colorStateList, float f9, float f10, float f11) {
        return new C08462j(context.getResources(), colorStateList, f9, f10, f11);
    }

    private C08462j A01(InterfaceC08422f interfaceC08422f) {
        return (C08462j) interfaceC08422f.A6J();
    }

    public final void A02(InterfaceC08422f interfaceC08422f) {
        Rect rect = new Rect();
        A01(interfaceC08422f).A0K(rect);
        interfaceC08422f.AG7((int) Math.ceil(A7S(interfaceC08422f)), (int) Math.ceil(A7R(interfaceC08422f)));
        interfaceC08422f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final ColorStateList A66(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0F();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A6t(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7M(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7R(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7S(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0D();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7m(InterfaceC08422f interfaceC08422f) {
        return A01(interfaceC08422f).A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public void A8r() {
        C08462j.A0G = new C1680a8(this);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void A8s(InterfaceC08422f interfaceC08422f, Context context, ColorStateList colorStateList, float f9, float f10, float f11) {
        C08462j A00 = A00(context, colorStateList, f9, f10, f11);
        A00.A0L(interfaceC08422f.A7l());
        interfaceC08422f.AFu(A00);
        A02(interfaceC08422f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AB7(InterfaceC08422f interfaceC08422f) {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void ACk(InterfaceC08422f interfaceC08422f) {
        A01(interfaceC08422f).A0L(interfaceC08422f.A7l());
        A02(interfaceC08422f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AFt(InterfaceC08422f interfaceC08422f, ColorStateList colorStateList) {
        A01(interfaceC08422f).A0J(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AFz(InterfaceC08422f interfaceC08422f, float f9) {
        A01(interfaceC08422f).A0I(f9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AG6(InterfaceC08422f interfaceC08422f, float f9) {
        A01(interfaceC08422f).A0H(f9);
        A02(interfaceC08422f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AGC(InterfaceC08422f interfaceC08422f, float f9) {
        A01(interfaceC08422f).A0G(f9);
        A02(interfaceC08422f);
    }
}
