package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class TTCornersWebView extends WebView {
    private final float[] COT;
    private int KS;
    private int jU;
    private int lMd;
    private int zp;

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.KS = getScrollX();
        this.jU = getScrollY();
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, this.jU, this.KS + this.zp, r2 + this.lMd), this.COT, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.zp = getMeasuredWidth();
        this.lMd = getMeasuredHeight();
    }
}
