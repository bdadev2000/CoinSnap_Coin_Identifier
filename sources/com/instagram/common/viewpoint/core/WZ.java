package com.instagram.common.viewpoint.core;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: assets/audience_network.dex */
public class WZ extends KY {
    public final /* synthetic */ WY A00;

    public WZ(WY wy) {
        this.A00 = wy;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
