package com.bytedance.adsdk.ugeno.DSW;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class NjR extends Handler {
    private final WeakReference<YFl> YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(Message message);
    }

    public NjR(Looper looper, YFl yFl) {
        super(looper);
        this.YFl = new WeakReference<>(yFl);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        YFl yFl = this.YFl.get();
        if (yFl != null && message != null) {
            yFl.YFl(message);
        }
    }
}
