package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1681a9 implements InterfaceC08432g {
    private C08442h A00(InterfaceC08422f interfaceC08422f) {
        return (C08442h) interfaceC08422f.A6J();
    }

    public final void A01(InterfaceC08422f interfaceC08422f) {
        if (!interfaceC08422f.A8G()) {
            interfaceC08422f.AGE(0, 0, 0, 0);
            return;
        }
        float A7M = A7M(interfaceC08422f);
        float A7m = A7m(interfaceC08422f);
        float elevation = C08462j.A00(A7M, A7m, interfaceC08422f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C08462j.A01(A7M, A7m, interfaceC08422f.A7l());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC08422f.AGE(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final ColorStateList A66(InterfaceC08422f interfaceC08422f) {
        return A00(interfaceC08422f).A05();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A6t(InterfaceC08422f interfaceC08422f) {
        return interfaceC08422f.A6K().getElevation();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7M(InterfaceC08422f interfaceC08422f) {
        return A00(interfaceC08422f).A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7R(InterfaceC08422f interfaceC08422f) {
        return A7m(interfaceC08422f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7S(InterfaceC08422f interfaceC08422f) {
        return A7m(interfaceC08422f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final float A7m(InterfaceC08422f interfaceC08422f) {
        return A00(interfaceC08422f).A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void A8r() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void A8s(InterfaceC08422f interfaceC08422f, Context context, ColorStateList colorStateList, float f9, float f10, float f11) {
        C08442h background = new C08442h(colorStateList, f9);
        interfaceC08422f.AFu(background);
        View view = interfaceC08422f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f10);
        AG6(interfaceC08422f, f11);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AB7(InterfaceC08422f interfaceC08422f) {
        AG6(interfaceC08422f, A7M(interfaceC08422f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void ACk(InterfaceC08422f interfaceC08422f) {
        AG6(interfaceC08422f, A7M(interfaceC08422f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AFt(InterfaceC08422f interfaceC08422f, ColorStateList colorStateList) {
        A00(interfaceC08422f).A08(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AFz(InterfaceC08422f interfaceC08422f, float f9) {
        interfaceC08422f.A6K().setElevation(f9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AG6(InterfaceC08422f interfaceC08422f, float f9) {
        A00(interfaceC08422f).A07(f9, interfaceC08422f.A8G(), interfaceC08422f.A7l());
        A01(interfaceC08422f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08432g
    public final void AGC(InterfaceC08422f interfaceC08422f, float f9) {
        A00(interfaceC08422f).A06(f9);
    }
}
