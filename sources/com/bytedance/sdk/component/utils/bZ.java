package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class bZ extends Handler {
    protected WeakReference<YFl> YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(Message message);
    }

    public bZ(YFl yFl) {
        if (yFl != null) {
            this.YFl = new WeakReference<>(yFl);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        YFl yFl;
        WeakReference<YFl> weakReference = this.YFl;
        if (weakReference != null && (yFl = weakReference.get()) != null && message != null) {
            yFl.YFl(message);
        }
    }

    public bZ(Looper looper, YFl yFl) {
        super(looper);
        if (yFl != null) {
            this.YFl = new WeakReference<>(yFl);
        }
    }
}
