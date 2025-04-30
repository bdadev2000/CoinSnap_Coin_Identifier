package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class KVG extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.lMd.HWF lMd;
    private final zp zp;

    /* loaded from: classes.dex */
    public static class zp extends GestureDetector.SimpleOnGestureListener {
        boolean zp = false;

        public boolean lMd() {
            return this.zp;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.zp = true;
            return super.onSingleTapUp(motionEvent);
        }

        public void zp() {
            this.zp = false;
        }
    }

    public KVG(Context context) {
        this(context, new zp());
    }

    public boolean lMd() {
        return this.zp.lMd();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lMd.zp(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void zp() {
        this.zp.zp();
    }

    public KVG(Context context, zp zpVar) {
        super(context, zpVar);
        this.zp = zpVar;
        this.lMd = new com.bytedance.sdk.openadsdk.core.lMd.HWF();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.YW zp(Context context, View view, View view2) {
        if (this.lMd == null) {
            return new YW.zp().zp();
        }
        return new YW.zp().HWF(this.lMd.zp).COT(this.lMd.lMd).jU(this.lMd.KS).KS(this.lMd.jU).lMd(this.lMd.COT).zp(this.lMd.HWF).lMd(WNy.zp(view)).zp(WNy.zp(view2)).KS(WNy.KS(view)).jU(WNy.KS(view2)).jU(this.lMd.QR).COT(this.lMd.ku).HWF(this.lMd.YW).zp(this.lMd.vDp).lMd(com.bytedance.sdk.openadsdk.core.ku.lMd().zp() ? 1 : 2).zp("vessel").zp(WNy.COT(context)).KS(WNy.QR(context)).lMd(WNy.HWF(context)).zp();
    }
}
