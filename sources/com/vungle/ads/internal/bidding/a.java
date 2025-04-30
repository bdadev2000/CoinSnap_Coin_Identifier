package com.vungle.ads.internal.bidding;

import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.C2111d;

/* loaded from: classes3.dex */
public final class a extends C2111d {
    final /* synthetic */ e this$0;

    public a(e eVar) {
        this.this$0 = eVar;
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onPause() {
        super.onPause();
        this.this$0.enterBackgroundTime = System.currentTimeMillis();
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onResume() {
        long j7;
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        j7 = this.this$0.enterBackgroundTime;
        if (currentTimeMillis > F.INSTANCE.getSessionTimeout() + j7) {
            this.this$0.ordinalView = 0;
            this.this$0.enterBackgroundTime = 0L;
        }
    }
}
