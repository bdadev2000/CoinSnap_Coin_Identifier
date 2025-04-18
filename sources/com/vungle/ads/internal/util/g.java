package com.vungle.ads.internal.util;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class g implements Runnable {
    final /* synthetic */ WeakReference<c> $weakCallback;
    final /* synthetic */ h this$0;

    public g(h hVar, WeakReference<c> weakReference) {
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
