package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1651Zc extends AnonymousClass37 {
    public static String[] A01 = {"Aypyv0FACfsPQTq8B8UFxLSJIGYFzsCC", "O7nTze5knL3NcSr2rovnk7vqxWhLtUKF", "w8KDuB7m9FBYOy6hiJzio9ilRX5MSLSp", "Kqe5H6YPSeJrA9PRZ2BXFN4qonyjjTB9", "VPpNE9vsyh3HxU94PoFE47DnBqUfoC5Y", "VSW3ZMLcugYKNhiURlJ0g5uJ7Smp29SS", "AB", "JpT6Sbfy0irMNtnKFHDBnJ8tZotKHb"};
    public final C1650Zb A00;

    public C1651Zc(C1650Zb c1650Zb) {
        this.A00 = c1650Zb;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A08(View view, C08813s c08813s) {
        super.A08(view, c08813s);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            this.A00.A01.getLayoutManager().A1C(view, c08813s);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final boolean A09(View view, int i9, Bundle bundle) {
        if (super.A09(view, i9, bundle)) {
            if (A01[2].charAt(3) == 'j') {
                throw new RuntimeException();
            }
            A01[6] = "SRS22nAnXgHfwC2qheyHP9Kgc2YZ";
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1X(view, i9, bundle);
        }
        return false;
    }
}
