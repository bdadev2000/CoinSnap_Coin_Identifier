package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1124bC implements InterfaceC02212g {
    public final RectF A00 = new RectF();

    private C02242j A00(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new C02242j(context.getResources(), colorStateList, f2, f3, f4);
    }

    private C02242j A01(InterfaceC02202f interfaceC02202f) {
        return (C02242j) interfaceC02202f.A6h();
    }

    public final void A02(InterfaceC02202f interfaceC02202f) {
        Rect rect = new Rect();
        A01(interfaceC02202f).A0K(rect);
        interfaceC02202f.AGX((int) Math.ceil(A7q(interfaceC02202f)), (int) Math.ceil(A7p(interfaceC02202f)));
        interfaceC02202f.AGe(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final ColorStateList A6U(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0F();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7H(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7k(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7p(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0C();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7q(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0D();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A8A(InterfaceC02202f interfaceC02202f) {
        return A01(interfaceC02202f).A0A();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public void A9G() {
        C02242j.A0G = new C1125bD(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void A9H(InterfaceC02202f interfaceC02202f, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        C02242j A00 = A00(context, colorStateList, f2, f3, f4);
        A00.A0L(interfaceC02202f.A89());
        interfaceC02202f.AGK(A00);
        A02(interfaceC02202f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void ABY(InterfaceC02202f interfaceC02202f) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void ADD(InterfaceC02202f interfaceC02202f) {
        A01(interfaceC02202f).A0L(interfaceC02202f.A89());
        A02(interfaceC02202f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGJ(InterfaceC02202f interfaceC02202f, ColorStateList colorStateList) {
        A01(interfaceC02202f).A0J(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGP(InterfaceC02202f interfaceC02202f, float f2) {
        A01(interfaceC02202f).A0I(f2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGW(InterfaceC02202f interfaceC02202f, float f2) {
        A01(interfaceC02202f).A0H(f2);
        A02(interfaceC02202f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGc(InterfaceC02202f interfaceC02202f, float f2) {
        A01(interfaceC02202f).A0G(f2);
        A02(interfaceC02202f);
    }
}
