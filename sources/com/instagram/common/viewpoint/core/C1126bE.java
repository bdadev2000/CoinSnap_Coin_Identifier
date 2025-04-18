package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1126bE implements InterfaceC02212g {
    private C02222h A00(InterfaceC02202f interfaceC02202f) {
        return (C02222h) interfaceC02202f.A6h();
    }

    public final void A01(InterfaceC02202f interfaceC02202f) {
        if (!interfaceC02202f.A8e()) {
            interfaceC02202f.AGe(0, 0, 0, 0);
            return;
        }
        float A7k = A7k(interfaceC02202f);
        float A8A = A8A(interfaceC02202f);
        float elevation = C02242j.A00(A7k, A8A, interfaceC02202f.A89());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C02242j.A01(A7k, A8A, interfaceC02202f.A89());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC02202f.AGe(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final ColorStateList A6U(InterfaceC02202f interfaceC02202f) {
        return A00(interfaceC02202f).A05();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7H(InterfaceC02202f interfaceC02202f) {
        return interfaceC02202f.A6i().getElevation();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7k(InterfaceC02202f interfaceC02202f) {
        return A00(interfaceC02202f).A03();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7p(InterfaceC02202f interfaceC02202f) {
        return A8A(interfaceC02202f) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A7q(InterfaceC02202f interfaceC02202f) {
        return A8A(interfaceC02202f) * 2.0f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final float A8A(InterfaceC02202f interfaceC02202f) {
        return A00(interfaceC02202f).A04();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void A9G() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void A9H(InterfaceC02202f interfaceC02202f, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        C02222h background = new C02222h(colorStateList, f2);
        interfaceC02202f.AGK(background);
        View view = interfaceC02202f.A6i();
        view.setClipToOutline(true);
        view.setElevation(f3);
        AGW(interfaceC02202f, f4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void ABY(InterfaceC02202f interfaceC02202f) {
        AGW(interfaceC02202f, A7k(interfaceC02202f));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void ADD(InterfaceC02202f interfaceC02202f) {
        AGW(interfaceC02202f, A7k(interfaceC02202f));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGJ(InterfaceC02202f interfaceC02202f, ColorStateList colorStateList) {
        A00(interfaceC02202f).A08(colorStateList);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGP(InterfaceC02202f interfaceC02202f, float f2) {
        interfaceC02202f.A6i().setElevation(f2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGW(InterfaceC02202f interfaceC02202f, float f2) {
        A00(interfaceC02202f).A07(f2, interfaceC02202f.A8e(), interfaceC02202f.A89());
        A01(interfaceC02202f);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02212g
    public final void AGc(InterfaceC02202f interfaceC02202f, float f2) {
        A00(interfaceC02202f).A06(f2);
    }
}
