package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class RCv extends Handler {
    protected WeakReference<zp> zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(Message message);
    }

    public RCv(zp zpVar) {
        if (zpVar != null) {
            this.zp = new WeakReference<>(zpVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        zp zpVar;
        WeakReference<zp> weakReference = this.zp;
        if (weakReference != null && (zpVar = weakReference.get()) != null && message != null) {
            zpVar.zp(message);
        }
    }

    public RCv(Looper looper, zp zpVar) {
        super(looper);
        if (zpVar != null) {
            this.zp = new WeakReference<>(zpVar);
        }
    }
}
