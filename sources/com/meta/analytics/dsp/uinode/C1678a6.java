package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1678a6<K, V> extends AbstractC08612y<K, V> {
    public final /* synthetic */ C1677a5 A00;

    public C1678a6(C1677a5 c1677a5) {
        this.A00 = c1677a5;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final Object A0B(int i9, int i10) {
        return this.A00.A02[(i9 << 1) + i10];
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final V A0C(int i9, V value) {
        return this.A00.A0C(i9, value);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final void A0E(int i9) {
        this.A00.A0A(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08612y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
