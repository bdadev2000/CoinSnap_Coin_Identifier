package com.bytedance.adsdk.ugeno.lMd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class YW extends Handler {
    private final WeakReference<zp> zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(Message message);
    }

    public YW(Looper looper, zp zpVar) {
        super(looper);
        this.zp = new WeakReference<>(zpVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        zp zpVar = this.zp.get();
        if (zpVar != null && message != null) {
            zpVar.zp(message);
        }
    }
}
