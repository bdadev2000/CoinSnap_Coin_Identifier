package com.bytedance.sdk.component.ku.zp;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.RCv;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class lMd extends RCv implements KS {
    private final HandlerThread lMd;

    public lMd(HandlerThread handlerThread, RCv.zp zpVar) {
        super(handlerThread.getLooper(), zpVar);
        this.lMd = handlerThread;
    }

    public void lMd() {
        HandlerThread handlerThread = this.lMd;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.ku.zp.KS
    public void zp() {
        removeCallbacksAndMessages(null);
        WeakReference<RCv.zp> weakReference = this.zp;
        if (weakReference != null) {
            weakReference.clear();
            this.zp = null;
        }
    }

    public void zp(RCv.zp zpVar) {
        this.zp = new WeakReference<>(zpVar);
    }
}
