package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1115a9 implements InterfaceC02772g {
    private C02782h A00(InterfaceC02762f interfaceC02762f) {
        return (C02782h) interfaceC02762f.A6J();
    }

    public final void A01(InterfaceC02762f interfaceC02762f) {
        if (!interfaceC02762f.A8G()) {
            interfaceC02762f.AGE(0, 0, 0, 0);
            return;
        }
        float A7M = A7M(interfaceC02762f);
        float A7m = A7m(interfaceC02762f);
        float elevation = C02802j.A00(A7M, A7m, interfaceC02762f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C02802j.A01(A7M, A7m, interfaceC02762f.A7l());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC02762f.AGE(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final ColorStateList A66(InterfaceC02762f interfaceC02762f) {
        return A00(interfaceC02762f).A05();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A6t(InterfaceC02762f interfaceC02762f) {
        return interfaceC02762f.A6K().getElevation();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7M(InterfaceC02762f interfaceC02762f) {
        return A00(interfaceC02762f).A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7R(InterfaceC02762f interfaceC02762f) {
        return A7m(interfaceC02762f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7S(InterfaceC02762f interfaceC02762f) {
        return A7m(interfaceC02762f) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final float A7m(InterfaceC02762f interfaceC02762f) {
        return A00(interfaceC02762f).A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void A8r() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void A8s(InterfaceC02762f interfaceC02762f, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C02782h background = new C02782h(colorStateList, f10);
        interfaceC02762f.AFu(background);
        View view = interfaceC02762f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AG6(interfaceC02762f, f12);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AB7(InterfaceC02762f interfaceC02762f) {
        AG6(interfaceC02762f, A7M(interfaceC02762f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void ACk(InterfaceC02762f interfaceC02762f) {
        AG6(interfaceC02762f, A7M(interfaceC02762f));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AFt(InterfaceC02762f interfaceC02762f, ColorStateList colorStateList) {
        A00(interfaceC02762f).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AFz(InterfaceC02762f interfaceC02762f, float f10) {
        interfaceC02762f.A6K().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AG6(InterfaceC02762f interfaceC02762f, float f10) {
        A00(interfaceC02762f).A07(f10, interfaceC02762f.A8G(), interfaceC02762f.A7l());
        A01(interfaceC02762f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC02772g
    public final void AGC(InterfaceC02762f interfaceC02762f, float f10) {
        A00(interfaceC02762f).A06(f10);
    }
}
