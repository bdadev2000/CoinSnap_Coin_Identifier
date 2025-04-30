package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class zp {
    private int COT;
    private int HWF;
    private int jU;
    Paint zp;
    Path lMd = new Path();
    Path KS = new Path();

    public zp() {
        Paint paint = new Paint();
        this.zp = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(android.graphics.Canvas r22, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.zp.zp(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void zp(View view, float f9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.HWF * f9);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof DynamicImageView) {
            int i9 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i9 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i9).setTranslationX((-(this.HWF - layoutParams.width)) / 2);
                i9++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void zp(View view, int i9, int i10) {
        String str;
        this.jU = i9 / 2;
        this.COT = i10 / 2;
        if (this.HWF == 0 && view.getLayoutParams().width > 0) {
            this.HWF = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.KS.addRoundRect(new RectF(0.0f, 0.0f, i9, i10), i10 / 2, i10 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.jU * 2);
            view.setPivotY(this.COT);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.COT);
        } else {
            view.setPivotX(this.jU);
            view.setPivotY(this.COT);
        }
    }
}
