package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class pDU extends YogaNodeJNIBase {
    public void YoT() {
        long j3 = this.YFl;
        if (j3 != 0) {
            this.YFl = 0L;
            YogaNative.jni_YGNodeDeallocateJNI(j3);
        }
    }

    public void finalize() throws Throwable {
        try {
            YoT();
        } finally {
            super.finalize();
        }
    }
}
