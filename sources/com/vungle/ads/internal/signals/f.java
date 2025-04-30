package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.C2111d;

/* loaded from: classes3.dex */
public final class f extends C2111d {
    final /* synthetic */ j this$0;

    public f(j jVar) {
        this.this$0 = jVar;
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onPause() {
        super.onPause();
        this.this$0.setEnterBackgroundTime(System.currentTimeMillis());
        j jVar = this.this$0;
        jVar.setSessionDuration((this.this$0.getEnterBackgroundTime() - this.this$0.getEnterForegroundTime()) + jVar.getSessionDuration());
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onResume() {
        super.onResume();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.this$0.getEnterBackgroundTime() > F.INSTANCE.getSignalsSessionTimeout()) {
            this.this$0.createNewSessionData();
        }
        this.this$0.setEnterForegroundTime(currentTimeMillis);
        this.this$0.setEnterBackgroundTime(0L);
    }
}
