package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eT;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class tN {
    private int AlY;
    Paint YFl;

    /* renamed from: vc, reason: collision with root package name */
    private int f10386vc;
    private int wN;
    Path Sg = new Path();
    Path tN = new Path();

    public tN() {
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(android.graphics.Canvas r23, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.tN.YFl(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public void YFl(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.f10386vc * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof eT) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i10).setTranslationX((-(this.f10386vc - layoutParams.width)) / 2);
                i10++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void YFl(View view, int i10, int i11) {
        String str;
        this.AlY = i10 / 2;
        this.wN = i11 / 2;
        if (this.f10386vc == 0 && view.getLayoutParams().width > 0) {
            this.f10386vc = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.tN.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i11 / 2, i11 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if (TtmlNode.RIGHT.equals(str)) {
            view.setPivotX(this.AlY * 2);
            view.setPivotY(this.wN);
        } else if (TtmlNode.LEFT.equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.wN);
        } else {
            view.setPivotX(this.AlY);
            view.setPivotY(this.wN);
        }
    }
}
