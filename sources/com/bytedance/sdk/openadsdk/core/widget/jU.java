package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class jU {
    private boolean Bj;
    private float COT;
    private int HWF;
    private int QR;
    private float jU;
    private final zp zp;
    private final boolean lMd = false;
    private boolean KS = false;
    private boolean ku = true;
    private boolean YW = false;
    private final View.OnTouchListener dT = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jU.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (jU.this.zp.yRU()) {
                if (!jU.this.KS) {
                    return true;
                }
                return false;
            }
            float x9 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        jU.this.Bj = false;
                    }
                } else {
                    if (Math.abs(x9 - jU.this.HWF) > 20.0f || Math.abs(y4 - jU.this.QR) > 20.0f) {
                        jU.this.ku = false;
                    }
                    jU.this.ku = true;
                    jU.this.YW = false;
                    jU.this.jU = 0.0f;
                    jU.this.COT = 0.0f;
                    jU.this.HWF = 0;
                    if (jU.this.zp != null) {
                        jU.this.zp.zp(view, jU.this.ku);
                    }
                    jU.this.Bj = false;
                }
            } else {
                jU jUVar = jU.this;
                jUVar.Bj = jUVar.zp(motionEvent);
                jU.this.jU = x9;
                jU.this.COT = y4;
                jU.this.HWF = (int) x9;
                jU.this.QR = (int) y4;
                jU.this.ku = true;
                if (jU.this.zp != null && jU.this.KS) {
                    jU.this.zp.zp(view, true);
                }
            }
            if (!jU.this.KS) {
                return true;
            }
            return false;
        }
    };

    /* loaded from: classes.dex */
    public interface zp {
        boolean yRU();

        void zp(View view, boolean z8);
    }

    public jU(zp zpVar) {
        this.zp = zpVar;
    }

    public void zp(View view) {
        if (view != null) {
            view.setOnTouchListener(this.dT);
        }
    }

    public void zp(boolean z8) {
        this.KS = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zp(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int KS = WNy.KS(KVG.zp().getApplicationContext());
        int jU = WNy.jU(KVG.zp().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f9 = KS;
        if (rawX <= f9 * 0.01f || rawX >= f9 * 0.99f) {
            return true;
        }
        float f10 = jU;
        return rawY <= 0.01f * f10 || rawY >= f10 * 0.99f;
    }
}
