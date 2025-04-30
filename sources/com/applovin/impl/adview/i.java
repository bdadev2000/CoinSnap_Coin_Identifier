package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f6710c = new Paint(1);

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f6711d = new Paint(1);

    public i(Context context) {
        super(context);
        f6710c.setARGB(80, 0, 0, 0);
        Paint paint = f6711d;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i9) {
        setViewScale(i9 / 30.0f);
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getCrossOffset() {
        return this.f6696a * 8.0f;
    }

    public float getStrokeWidth() {
        return this.f6696a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.WHITE_ON_TRANSPARENT;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f6710c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        Paint paint = f6711d;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, paint);
        canvas.drawLine(crossOffset, size, size, crossOffset, paint);
    }
}
