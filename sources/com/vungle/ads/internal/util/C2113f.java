package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.ads.internal.util.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2113f extends C2111d {
    final /* synthetic */ Runnable $cancelRunnable;
    final /* synthetic */ WeakReference<InterfaceC2110c> $weakCallback;
    final /* synthetic */ h this$0;
    private boolean wasPaused;

    public C2113f(WeakReference<InterfaceC2110c> weakReference, h hVar, Runnable runnable) {
        this.$weakCallback = weakReference;
        this.this$0 = hVar;
        this.$cancelRunnable = runnable;
    }

    public final boolean getWasPaused() {
        return this.wasPaused;
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onPause() {
        Handler handler;
        super.onPause();
        this.wasPaused = true;
        handler = this.this$0.handler;
        if (handler != null) {
            handler.removeCallbacks(this.$cancelRunnable);
        }
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onResume() {
        Handler handler;
        super.onResume();
        handler = this.this$0.handler;
        if (handler != null) {
            handler.postDelayed(this.$cancelRunnable, h.Companion.getCONFIG_CHANGE_DELAY() * 2);
        }
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onStop() {
        Handler handler;
        ConcurrentHashMap concurrentHashMap;
        super.onStop();
        InterfaceC2110c interfaceC2110c = this.$weakCallback.get();
        if (this.wasPaused && interfaceC2110c != null) {
            concurrentHashMap = this.this$0.adLeftCallbacks;
            if (concurrentHashMap.containsKey(interfaceC2110c)) {
                ((com.vungle.ads.internal.ui.l) interfaceC2110c).onLeftApplication();
            }
        }
        this.this$0.removeOnNextAppLeftCallback(interfaceC2110c);
        handler = this.this$0.handler;
        if (handler != null) {
            handler.removeCallbacks(this.$cancelRunnable);
        }
    }

    public final void setWasPaused(boolean z8) {
        this.wasPaused = z8;
    }
}
