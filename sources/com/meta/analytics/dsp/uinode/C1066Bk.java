package com.meta.analytics.dsp.uinode;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1066Bk implements InterfaceC1556Vi, Comparator<HO> {
    public long A00;
    public final long A01;
    public final TreeSet<HO> A02 = new TreeSet<>(this);

    public C1066Bk(long j7) {
        this.A01 = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(HO ho, HO ho2) {
        if (ho.A00 - ho2.A00 == 0) {
            return ho.compareTo(ho2);
        }
        return ho.A00 < ho2.A00 ? -1 : 1;
    }

    private void A01(HK hk, long j7) {
        while (this.A00 + j7 > this.A01 && !this.A02.isEmpty()) {
            try {
                hk.AF9(this.A02.first());
            } catch (HI unused) {
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.HJ
    public final void ADB(HK hk, HO ho) {
        this.A02.add(ho);
        this.A00 += ho.A01;
        A01(hk, 0L);
    }

    @Override // com.meta.analytics.dsp.uinode.HJ
    public final void ADC(HK hk, HO ho) {
        this.A02.remove(ho);
        this.A00 -= ho.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.HJ
    public final void ADD(HK hk, HO ho, HO ho2) {
        ADC(hk, ho);
        ADB(hk, ho2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1556Vi
    public final void ADE(HK hk, String str, long j7, long j9) {
        A01(hk, j9);
    }
}
