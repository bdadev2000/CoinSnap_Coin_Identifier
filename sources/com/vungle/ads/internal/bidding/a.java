package com.vungle.ads.internal.bidding;

import com.vungle.ads.internal.f0;

/* loaded from: classes4.dex */
public final class a extends com.vungle.ads.internal.util.d {
    final /* synthetic */ e this$0;

    public a(e eVar) {
        this.this$0 = eVar;
    }

    @Override // com.vungle.ads.internal.util.d
    public void onPause() {
        super.onPause();
        this.this$0.enterBackgroundTime = System.currentTimeMillis();
    }

    @Override // com.vungle.ads.internal.util.d
    public void onResume() {
        long j3;
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        j3 = this.this$0.enterBackgroundTime;
        if (currentTimeMillis > f0.INSTANCE.getSessionTimeout() + j3) {
            this.this$0.ordinalView = 0;
            this.this$0.enterBackgroundTime = 0L;
        }
    }
}
