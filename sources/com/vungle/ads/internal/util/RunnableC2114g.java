package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.ads.internal.util.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2114g implements Runnable {
    final /* synthetic */ WeakReference<InterfaceC2110c> $weakCallback;
    final /* synthetic */ h this$0;

    public RunnableC2114g(h hVar, WeakReference<InterfaceC2110c> weakReference) {
        this.this$0 = hVar;
        this.$weakCallback = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler;
        handler = this.this$0.handler;
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.this$0.removeOnNextAppLeftCallback(this.$weakCallback.get());
    }
}
