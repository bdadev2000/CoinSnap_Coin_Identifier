package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.zp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ku {
    private int COT;
    private int HWF;
    private AnimatorSet KS = new AnimatorSet();
    private String QR;
    private View jU;
    private zp lMd;
    Paint zp;

    public ku(View view, zp zpVar) {
        this.jU = view;
        this.lMd = zpVar;
        Paint paint = new Paint();
        this.zp = paint;
        paint.setAntiAlias(true);
    }

    public void lMd() {
        AnimatorSet animatorSet = this.KS;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x014d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0187. Please report as an issue. */
    public void zp() {
        ArrayList arrayList = new ArrayList();
        List<zp.C0067zp> KS = this.lMd.KS();
        if (KS == null || KS.size() <= 0) {
            return;
        }
        for (zp.C0067zp c0067zp : KS) {
            if (c0067zp != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0067zp.zp());
                if (TextUtils.equals(c0067zp.COT(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0067zp.COT(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0067zp.COT());
                }
                objectAnimator.setStartDelay(c0067zp.jU());
                objectAnimator.setTarget(this.jU);
                if (TextUtils.equals(c0067zp.COT(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setIntValues((int) c0067zp.HWF(), (int) c0067zp.QR());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0067zp.HWF() + "; to=" + c0067zp.QR());
                } else {
                    objectAnimator.setFloatValues(c0067zp.HWF(), c0067zp.QR());
                }
                int lMd = (int) this.lMd.lMd();
                if (lMd != 0) {
                    objectAnimator.setRepeatCount(lMd);
                } else {
                    objectAnimator.setRepeatCount((int) c0067zp.lMd());
                }
                if (TextUtils.equals(c0067zp.COT(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String HWF = this.lMd.HWF();
                if (TextUtils.isEmpty(HWF)) {
                    HWF = c0067zp.KS();
                }
                if (TextUtils.equals(HWF, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0067zp.ku() != null && c0067zp.ku().length > 0) {
                    objectAnimator.setFloatValues(c0067zp.ku());
                }
                if (TextUtils.equals(c0067zp.COT(), "rotationX")) {
                    this.jU.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ku.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ku.this.jU.setPivotX(ku.this.jU.getWidth() / 2.0f);
                            ku.this.jU.setPivotY(ku.this.jU.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0067zp.COT(), "ripple")) {
                    this.QR = c0067zp.dT();
                }
                String YW = c0067zp.YW();
                YW.getClass();
                char c9 = 65535;
                switch (YW.hashCode()) {
                    case -1354466595:
                        if (YW.equals("accelerate")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1263948740:
                        if (YW.equals("decelerate")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case -1102672091:
                        if (YW.equals("linear")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 475910905:
                        if (YW.equals("accelerateDecelerate")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 1312628413:
                        if (YW.equals("standard")) {
                            c9 = 4;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case 1:
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case 2:
                    case 4:
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case 3:
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.lMd.jU() != 0) {
            this.KS.setDuration(this.lMd.jU());
        }
        this.KS.setStartDelay(this.lMd.COT());
        if (TextUtils.equals(this.lMd.zp(), "sequentially")) {
            this.KS.playSequentially(arrayList);
        } else {
            this.KS.playTogether(arrayList);
        }
        this.KS.start();
    }

    public void zp(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.QR)) {
                return;
            }
            this.zp.setColor(com.bytedance.adsdk.ugeno.lMd.zp.zp(this.QR));
            this.zp.setAlpha(90);
            ((ViewGroup) this.jU.getParent()).setClipChildren(true);
            canvas.drawCircle(this.COT, this.HWF, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.zp);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void zp(int i9, int i10) {
        this.COT = i9 / 2;
        this.HWF = i10 / 2;
    }
}
