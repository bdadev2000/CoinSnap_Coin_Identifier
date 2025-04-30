package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.ads.internal.util.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2112e extends C2111d {
    final /* synthetic */ Runnable $cancelRunnable;
    final /* synthetic */ WeakReference<InterfaceC2110c> $weakCallback;
    final /* synthetic */ h this$0;

    public C2112e(h hVar, WeakReference<InterfaceC2110c> weakReference, Runnable runnable) {
        this.this$0 = hVar;
        this.$weakCallback = weakReference;
        this.$cancelRunnable = runnable;
    }

    @Override // com.vungle.ads.internal.util.C2111d
    public void onStart() {
        ConcurrentHashMap concurrentHashMap;
        Handler handler;
        C2109b c2109b = h.Companion;
        c2109b.getInstance().removeListener(this);
        concurrentHashMap = this.this$0.adLeftCallbacks;
        C2111d c2111d = (C2111d) concurrentHashMap.get(this.$weakCallback.get());
        if (c2111d != null) {
            handler = this.this$0.handler;
            if (handler != null) {
                handler.postDelayed(this.$cancelRunnable, c2109b.getTIMEOUT());
            }
            this.this$0.addListener(c2111d);
        }
    }
}
