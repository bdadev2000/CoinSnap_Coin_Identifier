package com.glority.widget.tracker.progressview;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.glority.widget.R;
import com.glority.widget.tracker.progressview.GlCircularProgressBar;
import com.glority.widget.uitls.UiUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlCircularProgressBar.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0089\u00012\u00020\u0001:\u0006\u0089\u0001\u008a\u0001\u008b\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\n2\u0006\u0010h\u001a\u00020\n2\u0006\u0010i\u001a\u00020\u0010H\u0002J\u001a\u0010j\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010k\u001a\u000202H\u0002J\b\u0010l\u001a\u000202H\u0002J\b\u0010m\u001a\u000202H\u0014J\u0010\u0010n\u001a\u0002022\u0006\u0010o\u001a\u00020pH\u0014J\u0018\u0010q\u001a\u0002022\u0006\u0010r\u001a\u00020\n2\u0006\u0010s\u001a\u00020\nH\u0014J(\u0010t\u001a\u0002022\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\n2\u0006\u0010w\u001a\u00020\n2\u0006\u0010x\u001a\u00020\nH\u0014J\b\u0010y\u001a\u000202H\u0002J\u0010\u0010z\u001a\u0002022\u0006\u0010{\u001a\u00020\nH\u0016J<\u0010|\u001a\u0002022\u0006\u0010:\u001a\u00020\u001f2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010~H\u0007¢\u0006\u0003\u0010\u0082\u0001J\r\u0010\u0083\u0001\u001a\u00020\u001f*\u00020\u001fH\u0002J\r\u0010\u0084\u0001\u001a\u00020&*\u00020NH\u0002J\r\u0010\u0085\u0001\u001a\u00020\u001f*\u00020\u001fH\u0002J\r\u0010\u0086\u0001\u001a\u00020N*\u00020NH\u0002J\r\u0010\u0087\u0001\u001a\u00020\u0010*\u00020\nH\u0002J\r\u0010\u0088\u0001\u001a\u00020N*\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00100\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u000202\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u000202\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010:\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\r\"\u0004\bA\u0010\u000fR$\u0010B\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u0010\u0015R*\u0010E\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bF\u0010\u0018\"\u0004\bG\u0010\u001aR*\u0010H\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bI\u0010\u0018\"\u0004\bJ\u0010\u001aR$\u0010K\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010$R$\u0010O\u001a\u00020N2\u0006\u0010\t\u001a\u00020N@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020N2\u0006\u0010\t\u001a\u00020N@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bU\u0010SR\u001e\u0010V\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bW\u0010$R$\u0010X\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\"\"\u0004\bZ\u0010$R\u000e\u0010[\u001a\u00020\\X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010]\u001a\u00020&2\u0006\u0010\t\u001a\u00020&@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R$\u0010`\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\"\"\u0004\bb\u0010$R\u001e\u0010c\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u001f@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bd\u0010$¨\u0006\u008c\u0001"}, d2 = {"Lcom/glority/widget/tracker/progressview/GlCircularProgressBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundPaint", "Landroid/graphics/Paint;", "value", "", "backgroundProgressBarColor", "getBackgroundProgressBarColor", "()I", "setBackgroundProgressBarColor", "(I)V", "Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$GradientDirection;", "backgroundProgressBarColorDirection", "getBackgroundProgressBarColorDirection", "()Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$GradientDirection;", "setBackgroundProgressBarColorDirection", "(Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$GradientDirection;)V", "backgroundProgressBarColorEnd", "getBackgroundProgressBarColorEnd", "()Ljava/lang/Integer;", "setBackgroundProgressBarColorEnd", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundProgressBarColorStart", "getBackgroundProgressBarColorStart", "setBackgroundProgressBarColorStart", "", "backgroundProgressBarWidth", "getBackgroundProgressBarWidth", "()F", "setBackgroundProgressBarWidth", "(F)V", "foregroundPaint", "", "indeterminateMode", "getIndeterminateMode", "()Z", "setIndeterminateMode", "(Z)V", "indeterminateModeHandler", "Landroid/os/Handler;", "indeterminateModeRunnable", "Ljava/lang/Runnable;", "onIndeterminateModeChangeListener", "Lkotlin/Function1;", "", "getOnIndeterminateModeChangeListener", "()Lkotlin/jvm/functions/Function1;", "setOnIndeterminateModeChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "onProgressChangeListener", "getOnProgressChangeListener", "setOnProgressChangeListener", "progress", "getProgress", "setProgress", "progressAnimator", "Landroid/animation/ValueAnimator;", "progressBarColor", "getProgressBarColor", "setProgressBarColor", "progressBarColorDirection", "getProgressBarColorDirection", "setProgressBarColorDirection", "progressBarColorEnd", "getProgressBarColorEnd", "setProgressBarColorEnd", "progressBarColorStart", "getProgressBarColorStart", "setProgressBarColorStart", "progressBarWidth", "getProgressBarWidth", "setProgressBarWidth", "Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$ProgressDirection;", "progressDirection", "getProgressDirection", "()Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$ProgressDirection;", "setProgressDirection", "(Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$ProgressDirection;)V", "progressDirectionIndeterminateMode", "setProgressDirectionIndeterminateMode", "progressIndeterminateMode", "setProgressIndeterminateMode", "progressMax", "getProgressMax", "setProgressMax", "rectF", "Landroid/graphics/RectF;", "roundBorder", "getRoundBorder", "setRoundBorder", "startAngle", "getStartAngle", "setStartAngle", "startAngleIndeterminateMode", "setStartAngleIndeterminateMode", "createLinearGradient", "Landroid/graphics/LinearGradient;", "startColor", "endColor", "gradientDirection", "init", "manageBackgroundProgressBarColor", "manageColor", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "postIndeterminateModeHandler", "setBackgroundColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "setProgressWithAnimation", TypedValues.TransitionType.S_DURATION, "", "interpolator", "Landroid/animation/TimeInterpolator;", "startDelay", "(FLjava/lang/Long;Landroid/animation/TimeInterpolator;Ljava/lang/Long;)V", "dpToPx", "isToRight", "pxToDp", "reverse", "toGradientDirection", "toProgressDirection", "Companion", "GradientDirection", "ProgressDirection", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlCircularProgressBar extends View {
    private static final long DEFAULT_ANIMATION_DURATION = 1500;
    private static final float DEFAULT_MAX_VALUE = 100.0f;
    private static final float DEFAULT_START_ANGLE = 270.0f;
    private Paint backgroundPaint;
    private int backgroundProgressBarColor;
    private GradientDirection backgroundProgressBarColorDirection;
    private Integer backgroundProgressBarColorEnd;
    private Integer backgroundProgressBarColorStart;
    private float backgroundProgressBarWidth;
    private Paint foregroundPaint;
    private boolean indeterminateMode;
    private Handler indeterminateModeHandler;
    private final Runnable indeterminateModeRunnable;
    private Function1<? super Boolean, Unit> onIndeterminateModeChangeListener;
    private Function1<? super Float, Unit> onProgressChangeListener;
    private float progress;
    private ValueAnimator progressAnimator;
    private int progressBarColor;
    private GradientDirection progressBarColorDirection;
    private Integer progressBarColorEnd;
    private Integer progressBarColorStart;
    private float progressBarWidth;
    private ProgressDirection progressDirection;
    private ProgressDirection progressDirectionIndeterminateMode;
    private float progressIndeterminateMode;
    private float progressMax;
    private RectF rectF;
    private boolean roundBorder;
    private float startAngle;
    private float startAngleIndeterminateMode;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[GradientDirection.LEFT_TO_RIGHT.ordinal()] = 1;
            iArr[GradientDirection.RIGHT_TO_LEFT.ordinal()] = 2;
            iArr[GradientDirection.TOP_TO_BOTTOM.ordinal()] = 3;
            iArr[GradientDirection.BOTTOM_TO_END.ordinal()] = 4;
        }
    }

    public final void setProgressWithAnimation(float f) {
        setProgressWithAnimation$default(this, f, null, null, null, 14, null);
    }

    public final void setProgressWithAnimation(float f, Long l) {
        setProgressWithAnimation$default(this, f, l, null, null, 12, null);
    }

    public final void setProgressWithAnimation(float f, Long l, TimeInterpolator timeInterpolator) {
        setProgressWithAnimation$default(this, f, l, timeInterpolator, null, 8, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlCircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rectF = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Unit unit = Unit.INSTANCE;
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        Unit unit2 = Unit.INSTANCE;
        this.foregroundPaint = paint2;
        this.progressMax = DEFAULT_MAX_VALUE;
        this.progressBarWidth = getResources().getDimension(R.dimen.x20);
        this.backgroundProgressBarWidth = getResources().getDimension(R.dimen.x20);
        this.progressBarColor = UiUtils.INSTANCE.getColorAccent(context);
        this.progressBarColorDirection = GradientDirection.LEFT_TO_RIGHT;
        this.backgroundProgressBarColor = getResources().getColor(R.color.gl_dark_transparent);
        this.backgroundProgressBarColorDirection = GradientDirection.LEFT_TO_RIGHT;
        this.roundBorder = true;
        this.startAngle = 270.0f;
        this.progressDirection = ProgressDirection.TO_RIGHT;
        this.progressDirectionIndeterminateMode = ProgressDirection.TO_RIGHT;
        this.startAngleIndeterminateMode = 270.0f;
        this.indeterminateModeRunnable = new Runnable() { // from class: com.glority.widget.tracker.progressview.GlCircularProgressBar$indeterminateModeRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                GlCircularProgressBar.ProgressDirection progressDirection;
                GlCircularProgressBar.ProgressDirection reverse;
                GlCircularProgressBar.ProgressDirection progressDirection2;
                boolean isToRight;
                if (GlCircularProgressBar.this.getIndeterminateMode()) {
                    GlCircularProgressBar.this.postIndeterminateModeHandler();
                    GlCircularProgressBar glCircularProgressBar = GlCircularProgressBar.this;
                    progressDirection = glCircularProgressBar.progressDirectionIndeterminateMode;
                    reverse = glCircularProgressBar.reverse(progressDirection);
                    glCircularProgressBar.setProgressDirectionIndeterminateMode(reverse);
                    GlCircularProgressBar glCircularProgressBar2 = GlCircularProgressBar.this;
                    progressDirection2 = glCircularProgressBar2.progressDirectionIndeterminateMode;
                    isToRight = glCircularProgressBar2.isToRight(progressDirection2);
                    if (isToRight) {
                        GlCircularProgressBar.setProgressWithAnimation$default(GlCircularProgressBar.this, 0.0f, 1500L, null, null, 12, null);
                    } else {
                        GlCircularProgressBar glCircularProgressBar3 = GlCircularProgressBar.this;
                        GlCircularProgressBar.setProgressWithAnimation$default(glCircularProgressBar3, glCircularProgressBar3.getProgressMax(), 1500L, null, null, 12, null);
                    }
                }
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlCircularProgressBar(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.tracker.progressview.GlCircularProgressBar.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final float getProgress() {
        return this.progress;
    }

    public final void setProgress(float f) {
        float f2 = this.progress;
        float f3 = this.progressMax;
        if (f2 > f3) {
            f = f3;
        }
        this.progress = f;
        Function1<? super Float, Unit> function1 = this.onProgressChangeListener;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
        invalidate();
    }

    public final float getProgressMax() {
        return this.progressMax;
    }

    public final void setProgressMax(float f) {
        if (this.progressMax < 0) {
            f = DEFAULT_MAX_VALUE;
        }
        this.progressMax = f;
        invalidate();
    }

    public final float getProgressBarWidth() {
        return this.progressBarWidth;
    }

    public final void setProgressBarWidth(float f) {
        float dpToPx = dpToPx(f);
        this.progressBarWidth = dpToPx;
        this.foregroundPaint.setStrokeWidth(dpToPx);
        requestLayout();
        invalidate();
    }

    public final float getBackgroundProgressBarWidth() {
        return this.backgroundProgressBarWidth;
    }

    public final void setBackgroundProgressBarWidth(float f) {
        float dpToPx = dpToPx(f);
        this.backgroundProgressBarWidth = dpToPx;
        this.backgroundPaint.setStrokeWidth(dpToPx);
        requestLayout();
        invalidate();
    }

    public final int getProgressBarColor() {
        return this.progressBarColor;
    }

    public final void setProgressBarColor(int i) {
        this.progressBarColor = i;
        manageColor();
        invalidate();
    }

    public final Integer getProgressBarColorStart() {
        return this.progressBarColorStart;
    }

    public final void setProgressBarColorStart(Integer num) {
        this.progressBarColorStart = num;
        manageColor();
        invalidate();
    }

    public final Integer getProgressBarColorEnd() {
        return this.progressBarColorEnd;
    }

    public final void setProgressBarColorEnd(Integer num) {
        this.progressBarColorEnd = num;
        manageColor();
        invalidate();
    }

    public final GradientDirection getProgressBarColorDirection() {
        return this.progressBarColorDirection;
    }

    public final void setProgressBarColorDirection(GradientDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.progressBarColorDirection = value;
        manageColor();
        invalidate();
    }

    public final int getBackgroundProgressBarColor() {
        return this.backgroundProgressBarColor;
    }

    public final void setBackgroundProgressBarColor(int i) {
        this.backgroundProgressBarColor = i;
        manageBackgroundProgressBarColor();
        invalidate();
    }

    public final Integer getBackgroundProgressBarColorStart() {
        return this.backgroundProgressBarColorStart;
    }

    public final void setBackgroundProgressBarColorStart(Integer num) {
        this.backgroundProgressBarColorStart = num;
        manageBackgroundProgressBarColor();
        invalidate();
    }

    public final Integer getBackgroundProgressBarColorEnd() {
        return this.backgroundProgressBarColorEnd;
    }

    public final void setBackgroundProgressBarColorEnd(Integer num) {
        this.backgroundProgressBarColorEnd = num;
        manageBackgroundProgressBarColor();
        invalidate();
    }

    public final GradientDirection getBackgroundProgressBarColorDirection() {
        return this.backgroundProgressBarColorDirection;
    }

    public final void setBackgroundProgressBarColorDirection(GradientDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.backgroundProgressBarColorDirection = value;
        manageBackgroundProgressBarColor();
        invalidate();
    }

    public final boolean getRoundBorder() {
        return this.roundBorder;
    }

    public final void setRoundBorder(boolean z) {
        this.roundBorder = z;
        this.foregroundPaint.setStrokeCap(z ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        invalidate();
    }

    public final float getStartAngle() {
        return this.startAngle;
    }

    public final void setStartAngle(float f) {
        float f2;
        float f3 = f + 270.0f;
        while (true) {
            f2 = 360;
            if (f3 <= f2) {
                break;
            } else {
                f3 -= f2;
            }
        }
        if (f3 < 0) {
            f3 = 0.0f;
        } else if (f3 > f2) {
            f3 = 360.0f;
        }
        this.startAngle = f3;
        invalidate();
    }

    public final ProgressDirection getProgressDirection() {
        return this.progressDirection;
    }

    public final void setProgressDirection(ProgressDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.progressDirection = value;
        invalidate();
    }

    public final boolean getIndeterminateMode() {
        return this.indeterminateMode;
    }

    public final void setIndeterminateMode(boolean z) {
        this.indeterminateMode = z;
        Function1<? super Boolean, Unit> function1 = this.onIndeterminateModeChangeListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        setProgressIndeterminateMode(0.0f);
        setProgressDirectionIndeterminateMode(ProgressDirection.TO_RIGHT);
        setStartAngleIndeterminateMode(270.0f);
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.removeCallbacks(this.indeterminateModeRunnable);
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.indeterminateModeHandler = handler2;
        if (this.indeterminateMode) {
            handler2.post(this.indeterminateModeRunnable);
        }
    }

    public final Function1<Float, Unit> getOnProgressChangeListener() {
        return this.onProgressChangeListener;
    }

    public final void setOnProgressChangeListener(Function1<? super Float, Unit> function1) {
        this.onProgressChangeListener = function1;
    }

    public final Function1<Boolean, Unit> getOnIndeterminateModeChangeListener() {
        return this.onIndeterminateModeChangeListener;
    }

    public final void setOnIndeterminateModeChangeListener(Function1<? super Boolean, Unit> function1) {
        this.onIndeterminateModeChangeListener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgressIndeterminateMode(float f) {
        this.progressIndeterminateMode = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgressDirectionIndeterminateMode(ProgressDirection progressDirection) {
        this.progressDirectionIndeterminateMode = progressDirection;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStartAngleIndeterminateMode(float f) {
        this.startAngleIndeterminateMode = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postIndeterminateModeHandler() {
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.postDelayed(this.indeterminateModeRunnable, 1500L);
        }
    }

    private final void init(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.GlCircularProgressBar, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl…ircularProgressBar, 0, 0)");
        setProgress(obtainStyledAttributes.getFloat(R.styleable.GlCircularProgressBar_gl_progress, this.progress));
        setProgressMax(obtainStyledAttributes.getFloat(R.styleable.GlCircularProgressBar_gl_progress_max, this.progressMax));
        setProgressBarWidth(pxToDp(obtainStyledAttributes.getDimension(R.styleable.GlCircularProgressBar_gl_progressbar_width, this.progressBarWidth)));
        setBackgroundProgressBarWidth(pxToDp(obtainStyledAttributes.getDimension(R.styleable.GlCircularProgressBar_gl_background_progressbar_width, this.backgroundProgressBarWidth)));
        setProgressBarColor(obtainStyledAttributes.getInt(R.styleable.GlCircularProgressBar_gl_progressbar_color, this.progressBarColor));
        int color = obtainStyledAttributes.getColor(R.styleable.GlCircularProgressBar_gl_progressbar_color_start, 0);
        if (color != 0) {
            setProgressBarColorStart(Integer.valueOf(color));
        }
        int color2 = obtainStyledAttributes.getColor(R.styleable.GlCircularProgressBar_gl_progressbar_color_end, 0);
        if (color2 != 0) {
            setProgressBarColorEnd(Integer.valueOf(color2));
        }
        setProgressBarColorDirection(toGradientDirection(obtainStyledAttributes.getInteger(R.styleable.GlCircularProgressBar_gl_progressbar_color_direction, this.progressBarColorDirection.getValue())));
        setBackgroundProgressBarColor(obtainStyledAttributes.getInt(R.styleable.GlCircularProgressBar_gl_background_progressbar_color, this.backgroundProgressBarColor));
        int color3 = obtainStyledAttributes.getColor(R.styleable.GlCircularProgressBar_gl_background_progressbar_color_start, 0);
        if (color3 != 0) {
            setBackgroundProgressBarColorStart(Integer.valueOf(color3));
        }
        int color4 = obtainStyledAttributes.getColor(R.styleable.GlCircularProgressBar_gl_background_progressbar_color_end, 0);
        if (color4 != 0) {
            setBackgroundProgressBarColorEnd(Integer.valueOf(color4));
        }
        setBackgroundProgressBarColorDirection(toGradientDirection(obtainStyledAttributes.getInteger(R.styleable.GlCircularProgressBar_gl_background_progressbar_color_direction, this.backgroundProgressBarColorDirection.getValue())));
        setProgressDirection(toProgressDirection(obtainStyledAttributes.getInteger(R.styleable.GlCircularProgressBar_gl_progress_direction, this.progressDirection.getValue())));
        setRoundBorder(obtainStyledAttributes.getBoolean(R.styleable.GlCircularProgressBar_gl_round_border, this.roundBorder));
        setStartAngle(obtainStyledAttributes.getFloat(R.styleable.GlCircularProgressBar_gl_start_angle, 0.0f));
        setIndeterminateMode(obtainStyledAttributes.getBoolean(R.styleable.GlCircularProgressBar_gl_indeterminate_mode, this.indeterminateMode));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Handler handler = this.indeterminateModeHandler;
        if (handler != null) {
            handler.removeCallbacks(this.indeterminateModeRunnable);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        manageColor();
        manageBackgroundProgressBarColor();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawOval(this.rectF, this.backgroundPaint);
        boolean z = this.indeterminateMode;
        canvas.drawArc(this.rectF, this.indeterminateMode ? this.startAngleIndeterminateMode : this.startAngle, ((((z && isToRight(this.progressDirectionIndeterminateMode)) || (!this.indeterminateMode && isToRight(this.progressDirection))) ? 360 : -360) * (((z ? this.progressIndeterminateMode : this.progress) * DEFAULT_MAX_VALUE) / this.progressMax)) / 100, false, this.foregroundPaint);
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        setBackgroundProgressBarColor(backgroundColor);
    }

    private final void manageColor() {
        Paint paint = this.foregroundPaint;
        Integer num = this.progressBarColorStart;
        int intValue = num != null ? num.intValue() : this.progressBarColor;
        Integer num2 = this.progressBarColorEnd;
        paint.setShader(createLinearGradient(intValue, num2 != null ? num2.intValue() : this.progressBarColor, this.progressBarColorDirection));
    }

    private final void manageBackgroundProgressBarColor() {
        Paint paint = this.backgroundPaint;
        Integer num = this.backgroundProgressBarColorStart;
        int intValue = num != null ? num.intValue() : this.backgroundProgressBarColor;
        Integer num2 = this.backgroundProgressBarColorEnd;
        paint.setShader(createLinearGradient(intValue, num2 != null ? num2.intValue() : this.backgroundProgressBarColor, this.backgroundProgressBarColorDirection));
    }

    private final LinearGradient createLinearGradient(int startColor, int endColor, GradientDirection gradientDirection) {
        float width;
        float f;
        float f2;
        float f3;
        int i = WhenMappings.$EnumSwitchMapping$0[gradientDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f = getWidth();
                f2 = 0.0f;
            } else if (i == 3) {
                f3 = getHeight();
                f = 0.0f;
                f2 = 0.0f;
                width = 0.0f;
            } else if (i != 4) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = getHeight();
                f = 0.0f;
                width = 0.0f;
                f3 = width;
            }
            width = f2;
            f3 = width;
        } else {
            width = getWidth();
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        return new LinearGradient(f, f2, width, f3, startColor, endColor, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        setMeasuredDimension(min, min);
        float f = this.progressBarWidth;
        float f2 = this.backgroundProgressBarWidth;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / 2;
        float f4 = 0 + f3;
        float f5 = min - f3;
        this.rectF.set(f4, f4, f5, f5);
    }

    public static /* synthetic */ void setProgressWithAnimation$default(GlCircularProgressBar glCircularProgressBar, float f, Long l, TimeInterpolator timeInterpolator, Long l2, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            timeInterpolator = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        glCircularProgressBar.setProgressWithAnimation(f, l, timeInterpolator, l2);
    }

    public final void setProgressWithAnimation(float progress, Long duration, TimeInterpolator interpolator, Long startDelay) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float[] fArr = new float[2];
        fArr[0] = this.indeterminateMode ? this.progressIndeterminateMode : this.progress;
        fArr[1] = progress;
        this.progressAnimator = ValueAnimator.ofFloat(fArr);
        if (duration != null) {
            long longValue = duration.longValue();
            ValueAnimator valueAnimator3 = this.progressAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(longValue);
            }
        }
        if (interpolator != null && (valueAnimator = this.progressAnimator) != null) {
            valueAnimator.setInterpolator(interpolator);
        }
        if (startDelay != null) {
            long longValue2 = startDelay.longValue();
            ValueAnimator valueAnimator4 = this.progressAnimator;
            if (valueAnimator4 != null) {
                valueAnimator4.setStartDelay(longValue2);
            }
        }
        ValueAnimator valueAnimator5 = this.progressAnimator;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.tracker.progressview.GlCircularProgressBar$setProgressWithAnimation$4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    GlCircularProgressBar.ProgressDirection progressDirection;
                    boolean isToRight;
                    Intrinsics.checkNotNullExpressionValue(animation, "animation");
                    Object animatedValue = animation.getAnimatedValue();
                    if (!(animatedValue instanceof Float)) {
                        animatedValue = null;
                    }
                    Float f = (Float) animatedValue;
                    if (f != null) {
                        float floatValue = f.floatValue();
                        if (GlCircularProgressBar.this.getIndeterminateMode()) {
                            GlCircularProgressBar.this.setProgressIndeterminateMode(floatValue);
                        } else {
                            GlCircularProgressBar.this.setProgress(floatValue);
                        }
                        if (GlCircularProgressBar.this.getIndeterminateMode()) {
                            float f2 = (floatValue * 360) / 100;
                            GlCircularProgressBar glCircularProgressBar = GlCircularProgressBar.this;
                            progressDirection = glCircularProgressBar.progressDirectionIndeterminateMode;
                            isToRight = glCircularProgressBar.isToRight(progressDirection);
                            if (!isToRight) {
                                f2 = -f2;
                            }
                            glCircularProgressBar.setStartAngleIndeterminateMode(f2 + 270.0f);
                        }
                    }
                }
            });
        }
        ValueAnimator valueAnimator6 = this.progressAnimator;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    private final float dpToPx(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return f * system.getDisplayMetrics().density;
    }

    private final float pxToDp(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return f / system.getDisplayMetrics().density;
    }

    private final ProgressDirection toProgressDirection(int i) {
        if (i == 1) {
            return ProgressDirection.TO_RIGHT;
        }
        if (i == 2) {
            return ProgressDirection.TO_LEFT;
        }
        throw new IllegalArgumentException("This value is not supported for ProgressDirection: " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProgressDirection reverse(ProgressDirection progressDirection) {
        return isToRight(progressDirection) ? ProgressDirection.TO_LEFT : ProgressDirection.TO_RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isToRight(ProgressDirection progressDirection) {
        return progressDirection == ProgressDirection.TO_RIGHT;
    }

    private final GradientDirection toGradientDirection(int i) {
        if (i == 1) {
            return GradientDirection.LEFT_TO_RIGHT;
        }
        if (i == 2) {
            return GradientDirection.RIGHT_TO_LEFT;
        }
        if (i == 3) {
            return GradientDirection.TOP_TO_BOTTOM;
        }
        if (i == 4) {
            return GradientDirection.BOTTOM_TO_END;
        }
        throw new IllegalArgumentException("This value is not supported for GradientDirection: " + i);
    }

    /* compiled from: GlCircularProgressBar.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$ProgressDirection;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TO_RIGHT", "TO_LEFT", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum ProgressDirection {
        TO_RIGHT(1),
        TO_LEFT(2);

        private final int value;

        ProgressDirection(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: GlCircularProgressBar.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/glority/widget/tracker/progressview/GlCircularProgressBar$GradientDirection;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "TOP_TO_BOTTOM", "BOTTOM_TO_END", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum GradientDirection {
        LEFT_TO_RIGHT(1),
        RIGHT_TO_LEFT(2),
        TOP_TO_BOTTOM(3),
        BOTTOM_TO_END(4);

        private final int value;

        GradientDirection(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
