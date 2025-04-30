package com.bytedance.sdk.component.adexpress.dynamic.interact.zp;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.interact.YW;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class zp implements View.OnTouchListener {
    private static int KS = 10;
    private int COT;
    private YW jU;
    private float lMd;
    private float zp;
    private RectF HWF = new RectF();
    private long QR = 0;
    private final int ku = 200;
    private final int YW = 3;
    private SoftReference<ViewGroup> dT = new SoftReference<>(null);

    public zp(YW yw, int i9, final ViewGroup viewGroup) {
        this.COT = KS;
        this.jU = yw;
        if (i9 > 0) {
            this.COT = i9;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.zp.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    zp.this.dT = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        YW yw;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.HWF;
                if (rectF != null && !rectF.contains(this.zp, this.lMd)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float abs = Math.abs(rawX - this.zp);
                float abs2 = Math.abs(rawY - this.lMd);
                int i9 = this.COT;
                if (abs >= i9 && abs2 >= i9) {
                    YW yw2 = this.jU;
                    if (yw2 != null) {
                        yw2.zp();
                    }
                } else if ((System.currentTimeMillis() - this.QR < 200 || (abs < 3.0f && abs2 < 3.0f)) && (yw = this.jU) != null) {
                    yw.zp();
                }
            }
        } else {
            this.HWF = zp(this.dT.get());
            this.zp = motionEvent.getRawX();
            this.lMd = motionEvent.getRawY();
            this.QR = System.currentTimeMillis();
        }
        return true;
    }

    private RectF zp(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
