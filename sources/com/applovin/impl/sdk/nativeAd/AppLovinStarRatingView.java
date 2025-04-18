package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.t3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class AppLovinStarRatingView extends View {
    private static final int DEFAULT_PADDING_DP = 2;
    private static final float DEFAULT_STROKE_WIDTH = 0.5f;
    private static final int DEFAULT_TOTAL_NUMBER_OF_STARS = 5;
    private static final float INTERNAL_ANGLE_OF_PENTAGON_RADIANS = 1.8849556f;
    private static final float SUM_OF_CENTRAL_ANGLES_IN_CIRCLE_RADIANS = 6.2831855f;
    private static final float TWELVE_OCLOCK_POSITION_RADIANS = 4.712389f;
    private static final Paint emptyStarPaint = new Paint(1);
    private static final Paint filledStarPaint = new Paint(1);
    private final float interStarsSpacingDp;
    private final float paddingDp;
    private float sideLength;
    private final Double starRating;

    public AppLovinStarRatingView(Double d, Context context) {
        super(context);
        this.starRating = d;
        this.paddingDp = AppLovinSdkUtils.dpToPx(context, 2);
        this.interStarsSpacingDp = AppLovinSdkUtils.dpToPx(context, 2);
        setupPaints();
    }

    private void drawEmptyStars(Canvas canvas, Path path) {
        canvas.drawPath(path, emptyStarPaint);
    }

    private void drawFilledStars(Canvas canvas, Path path) {
        if (this.starRating.doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        float roundUpToNearestHalfInt = ((float) roundUpToNearestHalfInt(this.starRating.doubleValue())) / 5.0f;
        float ceil = (float) ((Math.ceil(r0 - 1.0f) * this.interStarsSpacingDp) + this.paddingDp);
        canvas.clipPath(path);
        canvas.drawRect(new RectF(0.0f, 0.0f, (roundUpToNearestHalfInt * 5.0f * this.sideLength) + ceil, getHeight()), filledStarPaint);
    }

    private Path getCombinedPathForAllStarsWithSide(float f2) {
        PointF pointF = new PointF(0.0f, this.paddingDp);
        float f3 = pointF.x + this.paddingDp;
        Path path = new Path();
        for (int i2 = 0; i2 < 5; i2++) {
            float f4 = pointF.y;
            Path starPath = getStarPath(new RectF(f3, f4, f3 + f2, f4 + f2));
            f3 += this.interStarsSpacingDp + f2;
            path.addPath(starPath);
        }
        return path;
    }

    private static float getDistanceBetweenPoints(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(Math.pow(pointF.y - pointF2.y, 2.0d) + Math.pow(pointF.x - pointF2.x, 2.0d));
    }

    private static PointF getMidpointBetweenPoints(PointF pointF, PointF pointF2) {
        return new PointF((float) (((pointF2.x - pointF.x) * 0.5d) + pointF.x), (float) (((pointF2.y - pointF.y) * 0.5d) + pointF.y));
    }

    private Path getStarPath(RectF rectF) {
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        List<PointF> starPointsOnACircle = getStarPointsOnACircle(pointF, (float) (rectF.width() * 0.5d), TWELVE_OCLOCK_POSITION_RADIANS);
        PointF pointF2 = starPointsOnACircle.get(0);
        List<PointF> starPointsOnACircle2 = getStarPointsOnACircle(pointF, getDistanceBetweenPoints(pointF, getMidpointBetweenPoints(pointF2, starPointsOnACircle.get(1))) - ((float) (getDistanceBetweenPoints(pointF2, r3) / Math.tan(0.9424778f))), 5.340708f);
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        for (int i2 = 0; i2 < 5; i2++) {
            PointF pointF3 = starPointsOnACircle.get(i2);
            PointF pointF4 = starPointsOnACircle2.get(i2);
            path.lineTo(pointF3.x, pointF3.y);
            path.lineTo(pointF4.x, pointF4.y);
        }
        path.close();
        return path;
    }

    private List<PointF> getStarPointsOnACircle(PointF pointF, float f2, float f3) {
        float f4 = 6.2831855f / 5;
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            double d = f2;
            double d2 = f3;
            arrayList.add(new PointF((float) ((Math.cos(d2) * d) + pointF.x), (float) ((Math.sin(d2) * d) + pointF.y)));
            f3 += f4;
        }
        return arrayList;
    }

    private double getTotalHorizontalSpacing() {
        return (this.interStarsSpacingDp * 4.0f) + (this.paddingDp * 2.0f);
    }

    private double roundUpToNearestHalfInt(double d) {
        return Math.ceil(d * 2.0d) / 2.0d;
    }

    private void setupPaints() {
        Paint paint = emptyStarPaint;
        paint.setColor(t3.a(R.color.applovin_sdk_starColor, getContext()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
        Paint paint2 = filledStarPaint;
        paint2.setColor(t3.a(R.color.applovin_sdk_starColor, getContext()));
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.starRating == null) {
            return;
        }
        float min = (float) Math.min((getWidth() - getTotalHorizontalSpacing()) / 5.0d, getHeight() - (this.paddingDp * 2.0f));
        this.sideLength = min;
        if (min <= 0.0f) {
            return;
        }
        Path combinedPathForAllStarsWithSide = getCombinedPathForAllStarsWithSide(min);
        drawEmptyStars(canvas, combinedPathForAllStarsWithSide);
        drawFilledStars(canvas, combinedPathForAllStarsWithSide);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
