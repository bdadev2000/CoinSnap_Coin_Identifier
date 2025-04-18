package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class e extends d {
    final /* synthetic */ Runnable $cancelRunnable;
    final /* synthetic */ WeakReference<c> $weakCallback;
    final /* synthetic */ h this$0;

    public e(h hVar, WeakReference<c> weakReference, Runnable runnable) {
        this.this$0 = hVar;
        this.$weakCallback = weakReference;
        this.$cancelRunnable = runnable;
    }

    @Override // com.vungle.ads.internal.util.d
    public void onStart() {
        ConcurrentHashMap concurrentHashMap;
        Handler handler;
        b bVar = h.Companion;
        bVar.getInstance().removeListener(this);
        concurrentHashMap = this.this$0.adLeftCallbacks;
        d dVar = (d) concurrentHashMap.get(this.$weakCallback.get());
        if (dVar != null) {
            handler = this.this$0.handler;
            if (handler != null) {
                handler.postDelayed(this.$cancelRunnable, bVar.getTIMEOUT());
            }
            this.this$0.addListener(dVar);
        }
    }
}
