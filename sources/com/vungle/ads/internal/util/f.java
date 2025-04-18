package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class f extends d {
    final /* synthetic */ Runnable $cancelRunnable;
    final /* synthetic */ WeakReference<c> $weakCallback;
    final /* synthetic */ h this$0;
    private boolean wasPaused;

    public f(WeakReference<c> weakReference, h hVar, Runnable runnable) {
        this.$weakCallback = weakReference;
        this.this$0 = hVar;
        this.$cancelRunnable = runnable;
    }

    public final boolean getWasPaused() {
        return this.wasPaused;
    }

    @Override // com.vungle.ads.internal.util.d
    public void onPause() {
        Handler handler;
        super.onPause();
        this.wasPaused = true;
        handler = this.this$0.handler;
        if (handler != null) {
            handler.removeCallbacks(this.$cancelRunnable);
        }
    }

    @Override // com.vungle.ads.internal.util.d
    public void onResume() {
        Handler handler;
        super.onResume();
        handler = this.this$0.handler;
        if (handler != null) {
            handler.postDelayed(this.$cancelRunnable, h.Companion.getCONFIG_CHANGE_DELAY() * 2);
        }
    }

    @Override // com.vungle.ads.internal.util.d
    public void onStop() {
        Handler handler;
        ConcurrentHashMap concurrentHashMap;
        super.onStop();
        c cVar = this.$weakCallback.get();
        if (this.wasPaused && cVar != null) {
            concurrentHashMap = this.this$0.adLeftCallbacks;
            if (concurrentHashMap.containsKey(cVar)) {
                ((com.vungle.ads.internal.ui.l) cVar).onLeftApplication();
            }
        }
        this.this$0.removeOnNextAppLeftCallback(cVar);
        handler = this.this$0.handler;
        if (handler != null) {
            handler.removeCallbacks(this.$cancelRunnable);
        }
    }

    public final void setWasPaused(boolean z10) {
        this.wasPaused = z10;
    }
}
