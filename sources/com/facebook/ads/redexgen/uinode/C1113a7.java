package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1113a7 implements InterfaceC02772g {
    public final RectF A00 = new RectF();

    private C02802j A00(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new C02802j(context.getResources(), colorStateList, f10, f11, f12);
    }

    private C02802j A01(InterfaceC02762f interfaceC02762f) {
        return (C02802j) interfaceC02762f.A6J();
    }

    public final void A02(InterfaceC02762f interfaceC02762f) {
        Rect rect = new Rect();
        A01(interfaceC02762f).A0K(rect);
        interfaceC02762f.AG7((int) Math.ceil(A7S(interfaceC02762f)), (int) Math.ceil(A7R(interfaceC02762f)));
        interfaceC02762f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final ColorStateList A66(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0F();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A6t(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7M(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7R(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7S(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0D();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7m(InterfaceC02762f interfaceC02762f) {
        return A01(interfaceC02762f).A0A();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public void A8r() {
        C02802j.A0G = new C1114a8(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void A8s(InterfaceC02762f interfaceC02762f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C02802j A00 = A00(context, colorStateList, f10, f11, f12);
        A00.A0L(interfaceC02762f.A7l());
        interfaceC02762f.AFu(A00);
        A02(interfaceC02762f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AB7(InterfaceC02762f interfaceC02762f) {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void ACk(InterfaceC02762f interfaceC02762f) {
        A01(interfaceC02762f).A0L(interfaceC02762f.A7l());
        A02(interfaceC02762f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AFt(InterfaceC02762f interfaceC02762f, ColorStateList colorStateList) {
        A01(interfaceC02762f).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AFz(InterfaceC02762f interfaceC02762f, float f10) {
        A01(interfaceC02762f).A0I(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AG6(InterfaceC02762f interfaceC02762f, float f10) {
        A01(interfaceC02762f).A0H(f10);
        A02(interfaceC02762f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AGC(InterfaceC02762f interfaceC02762f, float f10) {
        A01(interfaceC02762f).A0G(f10);
        A02(interfaceC02762f);
    }
}
