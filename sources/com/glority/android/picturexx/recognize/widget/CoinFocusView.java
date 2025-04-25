package com.glority.android.picturexx.recognize.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.analyzer.AreaProcessor;
import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinFocusView.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J0\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0014J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\bJ\n\u00102\u001a\u0004\u0018\u000103H\u0016J\u001d\u00104\u001a\u0002052\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000107H\u0016¢\u0006\u0002\u00108J\u0006\u00109\u001a\u00020\bJ\u0006\u0010:\u001a\u00020\bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/CoinFocusView;", "Landroid/widget/FrameLayout;", "Lcom/glority/android/picturexx/recognize/widget/CoinFocusViewDelegate;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessor;", "areaProcessor", "getAreaProcessor", "()Lcom/glority/android/picturexx/recognize/analyzer/AreaProcessor;", "circleWidthMultiplier", "", "circleWidth", "getCircleWidth", "()F", "circleLineWidth", "circleSumWidth", "getCircleSumWidth", "circleSumWidth$delegate", "Lkotlin/Lazy;", "maskPaint", "Landroid/graphics/Paint;", "transparentPaint", "centerX", "centerY", "circlePaint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "getCenter", "Landroid/graphics/Point;", "getCircleRect", "Landroid/graphics/Rect;", "setCircleMultiplier", "setCircleColor", "color", "getCircleRectF", "Landroid/graphics/RectF;", "process", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "detRegion", "", "([Ljava/lang/Float;)Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "getCircleBottom", "getCircleTop", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinFocusView extends FrameLayout implements CoinFocusViewDelegate {
    private AreaProcessor areaProcessor;
    private float centerX;
    private float centerY;
    private final float circleLineWidth;
    private Paint circlePaint;

    /* renamed from: circleSumWidth$delegate, reason: from kotlin metadata */
    private final Lazy circleSumWidth;
    private float circleWidthMultiplier;
    private final Paint maskPaint;
    private final Paint transparentPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinFocusView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CoinFocusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.areaProcessor = new AreaProcessor();
        this.circleWidthMultiplier = 1.0f;
        float dimension = ResUtils.getDimension(R.dimen.x8);
        this.circleLineWidth = dimension;
        this.circleSumWidth = LazyKt.lazy(new Function0<Float>() { // from class: com.glority.android.picturexx.recognize.widget.CoinFocusView$circleSumWidth$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                float circleWidth;
                float f;
                circleWidth = CoinFocusView.this.getCircleWidth();
                f = CoinFocusView.this.circleLineWidth;
                return Float.valueOf(circleWidth + f);
            }
        });
        Paint paint = new Paint();
        this.maskPaint = paint;
        Paint paint2 = new Paint();
        this.transparentPaint = paint2;
        this.circlePaint = new Paint();
        paint.setColor(Color.parseColor("#99000000"));
        this.circlePaint.setColor(Color.parseColor("#FFFFFF"));
        this.circlePaint.setStyle(Paint.Style.STROKE);
        this.circlePaint.setStrokeWidth(dimension);
        this.circlePaint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }

    public final AreaProcessor getAreaProcessor() {
        return this.areaProcessor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCircleWidth() {
        return Math.min(getWidth() * 0.7f, getHeight() * 0.7f) * this.circleWidthMultiplier;
    }

    private final float getCircleSumWidth() {
        return ((Number) this.circleSumWidth.getValue()).floatValue();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() <= getCircleWidth() || getHeight() <= getCircleWidth()) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.maskPaint);
        float f = 2;
        canvas.drawCircle(this.centerX, this.centerY, getCircleWidth() / f, this.circlePaint);
        canvas.drawCircle(this.centerX, this.centerY, getCircleWidth() / f, this.transparentPaint);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.centerX == 0.0f) {
            this.centerX = getWidth() / 2.0f;
        }
        if (this.centerY == 0.0f) {
            this.centerY = (((getHeight() - getPaddingBottom()) + getPaddingTop()) / 2.0f) * this.circleWidthMultiplier;
        }
        super.onLayout(changed, left, top, right, bottom);
    }

    public final Point getCenter() {
        return new Point((int) this.centerX, (int) this.centerY);
    }

    public final Rect getCircleRect() {
        float f = 2;
        return new Rect((int) (this.centerX - (getCircleSumWidth() / f)), (int) (this.centerY - (getCircleSumWidth() / f)), (int) (this.centerX + (getCircleSumWidth() / f)), (int) (this.centerY + (getCircleSumWidth() / f)));
    }

    public final void setCircleMultiplier(float circleWidthMultiplier) {
        this.circleWidthMultiplier = circleWidthMultiplier;
        invalidate();
    }

    public final void setCircleColor(int color) {
        this.circlePaint.setColor(color);
        invalidate();
    }

    @Override // com.glority.android.picturexx.recognize.widget.CoinFocusViewDelegate
    public RectF getCircleRectF() {
        try {
            float f = 2;
            return new RectF((this.centerX - (getCircleSumWidth() / f)) / getWidth(), (this.centerY - (getCircleSumWidth() / f)) / getHeight(), (this.centerX + (getCircleSumWidth() / f)) / getWidth(), (this.centerY + (getCircleSumWidth() / f)) / getHeight());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    @Override // com.glority.android.picturexx.recognize.widget.CoinFocusViewDelegate
    public AreaStatus process(Float[] detRegion) {
        return this.areaProcessor.process(detRegion, getCircleRectF());
    }

    public final int getCircleBottom() {
        return (int) (this.centerY + (getCircleSumWidth() / 2));
    }

    public final int getCircleTop() {
        return (int) (this.centerY - (getCircleSumWidth() / 2));
    }
}
