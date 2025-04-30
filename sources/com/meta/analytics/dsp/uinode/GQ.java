package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class GQ implements Comparable<GQ> {
    public final int A00;
    public final GM A01;

    public GQ(int i9, GM gm) {
        this.A00 = i9;
        this.A01 = gm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(GQ gq) {
        return this.A00 - gq.A00;
    }
}
