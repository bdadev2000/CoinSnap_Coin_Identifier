package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.f0;

/* loaded from: classes4.dex */
public final class f extends com.vungle.ads.internal.util.d {
    final /* synthetic */ j this$0;

    public f(j jVar) {
        this.this$0 = jVar;
    }

    @Override // com.vungle.ads.internal.util.d
    public void onPause() {
        super.onPause();
        this.this$0.setEnterBackgroundTime(System.currentTimeMillis());
        j jVar = this.this$0;
        jVar.setSessionDuration((this.this$0.getEnterBackgroundTime() - this.this$0.getEnterForegroundTime()) + jVar.getSessionDuration());
    }

    @Override // com.vungle.ads.internal.util.d
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.this$0.getEnterBackgroundTime() > f0.INSTANCE.getSignalsSessionTimeout()) {
            this.this$0.createNewSessionData();
        }
        this.this$0.setEnterForegroundTime(currentTimeMillis);
        this.this$0.setEnterBackgroundTime(0L);
    }
}
