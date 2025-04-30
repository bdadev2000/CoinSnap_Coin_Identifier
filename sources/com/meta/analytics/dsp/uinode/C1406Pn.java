package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1406Pn extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C1406Pn(C1636Yn c1636Yn, String str) {
        super(c1636Yn);
        float f9 = c1636Yn.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1636Yn);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f9;
        int i9 = (int) density;
        textView.setPadding(i9, i9, i9, i9);
        addView(textView);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.A01 = new RectF();
        AbstractC1303Lo.A0M(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9 = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f9 * 10.0f, 10.0f * f9, this.A00);
        super.onDraw(canvas);
    }
}
