package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f3720c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f3721d = new Paint(1);

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f3722f = new Paint(1);

    public n(Context context) {
        super(context);
        f3720c.setColor(-1);
        f3721d.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint = f3722f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.a * 10.0f;
    }

    public float getInnerCircleOffset() {
        return this.a * 2.0f;
    }

    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    public float getStrokeWidth() {
        return this.a * 3.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_BLACK;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f3720c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f3721d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f3722f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
