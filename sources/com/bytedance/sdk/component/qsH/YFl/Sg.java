package com.bytedance.sdk.component.qsH.YFl;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.bZ;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class Sg extends bZ implements tN {
    private final HandlerThread Sg;

    public Sg(HandlerThread handlerThread, bZ.YFl yFl) {
        super(handlerThread.getLooper(), yFl);
        this.Sg = handlerThread;
    }

    public void Sg() {
        HandlerThread handlerThread = this.Sg;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.qsH.YFl.tN
    public void YFl() {
        removeCallbacksAndMessages(null);
        WeakReference<bZ.YFl> weakReference = this.YFl;
        if (weakReference != null) {
            weakReference.clear();
            this.YFl = null;
        }
    }

    public void YFl(bZ.YFl yFl) {
        this.YFl = new WeakReference<>(yFl);
    }
}
