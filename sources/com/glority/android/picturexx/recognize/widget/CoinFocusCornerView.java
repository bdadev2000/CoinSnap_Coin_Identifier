package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import com.glority.android.picturexx.recognize.analyzer.NewAreaProcessor;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinFocusCornerView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J#\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001bH\u0007J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\bH\u0007J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020\u0019H\u0016J\u001d\u0010+\u001a\u00020,2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!H\u0016¢\u0006\u0002\u0010.J\u001b\u0010/\u001a\u00020\u00132\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010!¢\u0006\u0002\u00100J(\u0010\u0018\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0013H\u0002J\u0018\u00105\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CoinFocusCornerView;", "Landroid/widget/FrameLayout;", "Lcom/glority/android/picturexx/recognize/widget/CoinFocusViewDelegate;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/glority/android/picturexx/recognize/analyzer/NewAreaProcessor;", "areaProcessor", "getAreaProcessor", "()Lcom/glority/android/picturexx/recognize/analyzer/NewAreaProcessor;", "paint", "Landroid/graphics/Paint;", "centerX", "", "getCenterX", "()F", "centerY", "getCenterY", "rectF", "Landroid/graphics/RectF;", "isCornerVisible", "", "setCornerRectF", "", "setCornerAsync", "heightWidthRatio", TtmlNode.TAG_REGION, "", "(F[Ljava/lang/Float;)V", "setCornerRectVisible", "visible", "setCornerColor", "color", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getCircleRectF", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "([Ljava/lang/Float;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "calculateZoomFactor", "([Ljava/lang/Float;)F", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "drawRoundedCornerRect", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinFocusCornerView extends FrameLayout implements CoinFocusViewDelegate {
    private NewAreaProcessor areaProcessor;
    private boolean isCornerVisible;
    private final Paint paint;
    private RectF rectF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinFocusCornerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinFocusCornerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CoinFocusCornerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinFocusCornerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.areaProcessor = new NewAreaProcessor();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.x8));
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint = paint;
        this.rectF = new RectF();
    }

    public final NewAreaProcessor getAreaProcessor() {
        return this.areaProcessor;
    }

    private final float getCenterX() {
        return getWidth() / 2.0f;
    }

    private final float getCenterY() {
        return getHeight() / 2.0f;
    }

    private final void setCornerRectF(RectF rectF) {
        if (rectF != null) {
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f = 2;
            float width = (rectF.width() * 1.2f) / f;
            float height = (rectF.height() * 1.2f) / f;
            this.rectF = rectF(centerX - width, centerY - height, centerX + width, centerY + height);
        } else {
            this.rectF = rectF;
        }
        postInvalidate();
    }

    public final void setCornerAsync(float heightWidthRatio, Float[] region) {
        if (region == null) {
            setCornerRectF(null);
            return;
        }
        float width = getWidth();
        float f = heightWidthRatio * width;
        float height = (getHeight() - f) / 2;
        setCornerRectF(rectF(region[1].floatValue() * width, (region[0].floatValue() * f) + height, region[3].floatValue() * width, height + (region[2].floatValue() * f)));
    }

    public final void setCornerRectVisible(boolean visible) {
        this.isCornerVisible = visible;
        invalidate();
    }

    public final void setCornerColor(int color) {
        this.paint.setColor(color);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isCornerVisible && (rectF = this.rectF) != null) {
            drawRoundedCornerRect(canvas, rectF);
        }
    }

    @Override // com.glority.android.picturexx.recognize.widget.CoinFocusViewDelegate
    public RectF getCircleRectF() {
        return rectF(getCenterX() - (getWidth() / 2), getCenterY() - (getHeight() / 2), getCenterX() + (getWidth() / 2), getCenterY() + (getHeight() / 2));
    }

    @Override // com.glority.android.picturexx.recognize.widget.CoinFocusViewDelegate
    public AreaStatus process(Float[] detRegion) {
        return this.areaProcessor.process(detRegion, getCircleRectF());
    }

    public final float calculateZoomFactor(Float[] detRegion) {
        return this.areaProcessor.calculateZoomFactor(detRegion, getCircleRectF());
    }

    private final RectF rectF(float left, float top, float right, float bottom) {
        return new RectF(left, top, right, bottom);
    }

    private final void drawRoundedCornerRect(Canvas canvas, RectF rectF) {
        float min = Math.min(getWidth(), getHeight()) / 12.0f;
        float f = min / 2;
        canvas.drawLine(rectF.left + f, rectF.top, rectF.left + min, rectF.top, this.paint);
        canvas.drawLine(rectF.left, rectF.top + f, rectF.left, rectF.top + min, this.paint);
        canvas.drawArc(rectF.left, rectF.top, rectF.left + min, rectF.top + min, 180.0f, 90.0f, false, this.paint);
        canvas.drawLine(rectF.right - f, rectF.top, rectF.right - min, rectF.top, this.paint);
        canvas.drawLine(rectF.right, rectF.top + f, rectF.right, rectF.top + min, this.paint);
        canvas.drawArc(rectF.right - min, rectF.top, rectF.right, rectF.top + min, 270.0f, 90.0f, false, this.paint);
        canvas.drawLine(rectF.left + f, rectF.bottom, rectF.left + min, rectF.bottom, this.paint);
        canvas.drawLine(rectF.left, rectF.bottom - f, rectF.left, rectF.bottom - min, this.paint);
        canvas.drawArc(rectF.left, rectF.bottom - min, rectF.left + min, rectF.bottom, 90.0f, 90.0f, false, this.paint);
        canvas.drawLine(rectF.right - f, rectF.bottom, rectF.right - min, rectF.bottom, this.paint);
        canvas.drawLine(rectF.right, rectF.bottom - f, rectF.right, rectF.bottom - min, this.paint);
        canvas.drawArc(rectF.right - min, rectF.bottom - min, rectF.right, rectF.bottom, 0.0f, 90.0f, false, this.paint);
    }
}
