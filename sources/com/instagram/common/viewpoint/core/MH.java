package com.instagram.common.viewpoint.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class MH {
    public static MH A02;
    public final C0930Vd A00;
    public final MJ A01;

    public MH(C1045Zs c1045Zs, Executor executor, C8W c8w) {
        this.A01 = new MJ(c1045Zs);
        this.A00 = new C0930Vd(executor, c8w, c1045Zs);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1045Zs c1045Zs, Executor executor, C8W c8w) {
        if (!C0608Im.A1S(c1045Zs)) {
            return;
        }
        if (A02 == null) {
            A02 = new MH(c1045Zs, executor, c8w);
            A02.A00();
        } else {
            A02.A02(c8w);
        }
    }

    private void A02(C8W c8w) {
        this.A00.A07(c8w);
    }
}
