package com.instagram.common.viewpoint.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1123bB<K, V> extends AbstractC02392y<K, V> {
    public final /* synthetic */ C1122bA A00;

    public C1123bB(C1122bA c1122bA) {
        this.A00 = c1122bA;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final Object A0B(int i2, int i3) {
        return this.A00.A02[(i2 << 1) + i3];
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final V A0C(int i2, V value) {
        return this.A00.A0C(i2, value);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final void A0E(int i2) {
        this.A00.A0A(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02392y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
