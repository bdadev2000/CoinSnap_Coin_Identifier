package com.glority.widget.scanner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import com.glority.widget.uitls.ModelUtils;
import com.glority.widget.uitls.UiUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropMagnifierView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0014J\u0016\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u000e\u00104\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/glority/widget/scanner/CropMagnifierView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmapPaint", "Landroid/graphics/Paint;", "getBitmapPaint", "()Landroid/graphics/Paint;", "borderWidth", "", "getBorderWidth", "()F", "setBorderWidth", "(F)V", "centerX", "centerY", "density", "destRectF", "Landroid/graphics/RectF;", "drawMatrix", "Landroid/graphics/Matrix;", "endAngle", "getEndAngle", "setEndAngle", "fillPaint", "getFillPaint", "linePaint", "getLinePaint", "linePath", "Landroid/graphics/Path;", "point", "Landroid/graphics/PointF;", "getPoint", "()Landroid/graphics/PointF;", "setPoint", "(Landroid/graphics/PointF;)V", "pointF", "srcRectF", "startAngle", "getStartAngle", "setStartAngle", "x1", "x2", "y1", "y2", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setAngle", "start", TtmlNode.END, "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class CropMagnifierView extends CardView {
    private Bitmap bitmap;
    private final Paint bitmapPaint;
    private float borderWidth;
    private float centerX;
    private float centerY;
    private float density;
    private final RectF destRectF;
    private final Matrix drawMatrix;
    private float endAngle;
    private final Paint fillPaint;
    private final Paint linePaint;
    private final Path linePath;
    private PointF point;
    private final PointF pointF;
    private final RectF srcRectF;
    private float startAngle;
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    public CropMagnifierView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CropMagnifierView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CropMagnifierView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scanner.CropMagnifierView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropMagnifierView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.linePaint = paint;
        Paint paint2 = new Paint(1);
        this.fillPaint = paint2;
        Paint paint3 = new Paint(1);
        this.bitmapPaint = paint3;
        this.pointF = new PointF();
        this.linePath = new Path();
        this.srcRectF = new RectF();
        this.destRectF = new RectF();
        this.drawMatrix = new Matrix();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.density = resources.getDisplayMetrics().density;
        new TypedValue();
        paint.setColor(UiUtils.INSTANCE.getColorAccent(context));
        paint.setStrokeWidth(this.density * 2);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.borderWidth = this.density;
    }

    public final Paint getLinePaint() {
        return this.linePaint;
    }

    public final Paint getFillPaint() {
        return this.fillPaint;
    }

    public final Paint getBitmapPaint() {
        return this.bitmapPaint;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final void setBorderWidth(float f) {
        this.borderWidth = f;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final void setStartAngle(float f) {
        this.startAngle = f;
    }

    public final float getEndAngle() {
        return this.endAngle;
    }

    public final void setEndAngle(float f) {
        this.endAngle = f;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final PointF getPoint() {
        return this.point;
    }

    public final void setPoint(PointF pointF) {
        this.point = pointF;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float f = 2;
        this.centerX = getWidth() / f;
        this.centerY = getHeight() / f;
        float max = (Math.max(getWidth(), getHeight()) / 2) - this.borderWidth;
        ModelUtils.INSTANCE.calculatePoint(this.centerX, this.centerY, max, this.startAngle, this.pointF);
        this.x1 = this.pointF.x;
        this.y1 = this.pointF.y;
        ModelUtils.INSTANCE.calculatePoint(this.centerX, this.centerY, max, this.endAngle, this.pointF);
        this.x2 = this.pointF.x;
        this.y2 = this.pointF.y;
        PointF pointF = this.point;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null && pointF != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            RectF rectF = this.srcRectF;
            rectF.left = (pointF.x * bitmap.getWidth()) - max;
            rectF.top = (pointF.y * bitmap.getHeight()) - max;
            float f2 = f * max;
            rectF.right = rectF.left + f2;
            rectF.bottom = rectF.top + f2;
            RectF rectF2 = this.destRectF;
            rectF2.left = this.borderWidth;
            rectF2.top = this.borderWidth;
            rectF2.right = this.borderWidth + f2;
            rectF2.bottom = f2 + this.borderWidth;
            canvas.drawCircle(this.centerX, this.centerY, max, this.fillPaint);
            this.drawMatrix.setRectToRect(this.srcRectF, this.destRectF, Matrix.ScaleToFit.FILL);
            canvas.concat(this.drawMatrix);
            canvas.drawBitmap(bitmap, getMatrix(), this.bitmapPaint);
            canvas.restoreToCount(saveLayer);
        }
        Path path = this.linePath;
        path.reset();
        path.moveTo(this.x1, this.y1);
        path.lineTo(this.centerX, this.centerY);
        path.lineTo(this.x2, this.y2);
        canvas.drawPath(this.linePath, this.linePaint);
    }

    public final void setAngle(float start, float end) {
        this.startAngle = start;
        this.endAngle = end;
        postInvalidate();
    }
}
