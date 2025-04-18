package com.bytedance.adsdk.ugeno.YFl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;

/* loaded from: classes.dex */
public class YFl {
    private Context AlY;
    private Sg Sg;
    private com.bytedance.adsdk.ugeno.Sg.Sg YFl;
    private ValueAnimator tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.YFl.YFl.YFl f10263vc;
    private int wN;

    public YFl(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, Sg sg3) {
        this.YFl = sg2;
        this.Sg = sg3;
        this.AlY = context;
    }

    public void Sg() {
        ValueAnimator valueAnimator = this.tN;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void YFl() {
        ValueAnimator valueAnimator = this.tN;
        if (valueAnimator == null || this.wN == -2) {
            return;
        }
        valueAnimator.start();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        switch(r8) {
            case 0: goto L35;
            case 1: goto L34;
            case 2: goto L33;
            default: goto L32;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r6 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2.addAll(r6.wN());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r6 = new com.bytedance.adsdk.ugeno.YFl.Sg.AlY(r9.AlY, r9.YFl, r5, r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r6 = new com.bytedance.adsdk.ugeno.YFl.Sg.Sg(r9.AlY, r9.YFl, r5, r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r6 = new com.bytedance.adsdk.ugeno.YFl.Sg.tN(r9.AlY, r9.YFl, r5, r4.getValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.ValueAnimator tN() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.YFl.YFl.tN():android.animation.ValueAnimator");
    }

    public void YFl(Canvas canvas) {
        com.bytedance.adsdk.ugeno.YFl.YFl.YFl yFl = this.f10263vc;
        if (yFl != null) {
            yFl.YFl(canvas);
        }
    }

    public void YFl(int i10, int i11) {
        com.bytedance.adsdk.ugeno.YFl.YFl.YFl yFl = this.f10263vc;
        if (yFl != null) {
            yFl.YFl(i10, i11);
        }
    }
}
