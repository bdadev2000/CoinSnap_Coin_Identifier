package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class DSW {
    private View AlY;
    private String DSW;
    private YFl Sg;
    Paint YFl;
    private AnimatorSet tN = new AnimatorSet();

    /* renamed from: vc, reason: collision with root package name */
    private int f10266vc;
    private int wN;

    public DSW(View view, YFl yFl) {
        this.AlY = view;
        this.Sg = yFl;
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setAntiAlias(true);
    }

    public void Sg() {
        AnimatorSet animatorSet = this.tN;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if (r2.equals("accelerate") == false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x014f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0189. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.DSW.YFl():void");
    }

    public void YFl(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.DSW)) {
                return;
            }
            this.YFl.setColor(com.bytedance.adsdk.ugeno.DSW.YFl.YFl(this.DSW));
            this.YFl.setAlpha(90);
            ((ViewGroup) this.AlY.getParent()).setClipChildren(true);
            canvas.drawCircle(this.wN, this.f10266vc, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.YFl);
        } catch (Throwable th2) {
            Log.d("UGenAnimation", "ripple animation error " + th2.getMessage());
        }
    }

    public void YFl(int i10, int i11) {
        this.wN = i10 / 2;
        this.f10266vc = i11 / 2;
    }
}
