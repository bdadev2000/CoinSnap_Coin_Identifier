package com.glority.widget.scanner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.glority.widget.uitls.UiUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropPointsView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002UVB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0012H\u0002J\u0018\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0010H\u0002J\u001a\u0010E\u001a\u0004\u0018\u00010\u00102\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0012H\u0002J\u0010\u0010F\u001a\u0004\u0018\u00010.2\u0006\u0010G\u001a\u00020\u001eJ\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010,J\u0010\u0010I\u001a\u0004\u0018\u00010\u00102\u0006\u0010G\u001a\u00020\u001eJ\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0014J\u0010\u0010N\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u000e\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020 J\u0016\u0010Q\u001a\u00020K2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010,J\b\u0010S\u001a\u00020KH\u0002J\b\u0010T\u001a\u00020KH\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u0016\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010/\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u00101\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\u0016\u00106\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016¨\u0006W"}, d2 = {"Lcom/glority/widget/scanner/CropPointsView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lcom/glority/widget/scanner/CropPointsView$Callback;", "getCallback", "()Lcom/glority/widget/scanner/CropPointsView$Callback;", "setCallback", "(Lcom/glority/widget/scanner/CropPointsView$Callback;)V", "centerPoint", "Landroid/graphics/Point;", "centerPointRadius", "", "getCenterPointRadius", "()F", "setCenterPointRadius", "(F)V", "density", "dragLine", "Lcom/glority/widget/scanner/Line;", "dragOffsetX", "dragOffsetY", "dragPoint", "dragPointType", "Lcom/glority/widget/scanner/CropPointsView$DragPointType;", "dragRect", "Landroid/graphics/Rect;", "imageRect", "linePaint", "Landroid/graphics/Paint;", "getLinePaint", "()Landroid/graphics/Paint;", "linePath", "Landroid/graphics/Path;", "midPointRadius", "getMidPointRadius", "setMidPointRadius", "midPoints", "", "pointFList", "Landroid/graphics/PointF;", "pointFillPaint", "getPointFillPaint", "pointPaint", "getPointPaint", "pointRadius", "getPointRadius", "setPointRadius", "points", "touchPointDistance", "getTouchPointDistance", "setTouchPointDistance", "dispatchTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "getDistance", "point", "x", "y", "getMidPoint", "point0", "point1", "getNearByPoint", "getPoint", "pointType", "getPoints", "getTruePoint", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "setImageRect", "rect", "setPoints", "list", "updateLinePath", "updatePoints", "Callback", "DragPointType", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class CropPointsView extends View {
    private Callback callback;
    private Point centerPoint;
    private float centerPointRadius;
    private float density;
    private final Line dragLine;
    private float dragOffsetX;
    private float dragOffsetY;
    private Point dragPoint;
    private DragPointType dragPointType;
    private final Rect dragRect;
    private final Rect imageRect;
    private final Paint linePaint;
    private final Path linePath;
    private float midPointRadius;
    private List<? extends Point> midPoints;
    private List<? extends PointF> pointFList;
    private final Paint pointFillPaint;
    private final Paint pointPaint;
    private float pointRadius;
    private List<? extends Point> points;
    private float touchPointDistance;

    /* compiled from: CropPointsView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/glority/widget/scanner/CropPointsView$Callback;", "", "onDrag", "", "dragPointType", "Lcom/glority/widget/scanner/CropPointsView$DragPointType;", "touchX", "", "touchY", "onDragEnded", "onDragStarted", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface Callback {
        void onDrag(DragPointType dragPointType, float touchX, float touchY);

        void onDragEnded();

        void onDragStarted(DragPointType dragPointType, float touchX, float touchY);
    }

    /* compiled from: CropPointsView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/widget/scanner/CropPointsView$DragPointType;", "", "(Ljava/lang/String;I)V", "LEFT_TOP", "RIGHT_TOP", "RIGHT_BOTTOM", "LEFT_BOTTOM", "TOP", "RIGHT", "BOTTOM", "LEFT", "CENTER", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum DragPointType {
        LEFT_TOP,
        RIGHT_TOP,
        RIGHT_BOTTOM,
        LEFT_BOTTOM,
        TOP,
        RIGHT,
        BOTTOM,
        LEFT,
        CENTER
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DragPointType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DragPointType.LEFT_TOP.ordinal()] = 1;
            iArr[DragPointType.RIGHT_TOP.ordinal()] = 2;
            iArr[DragPointType.RIGHT_BOTTOM.ordinal()] = 3;
            iArr[DragPointType.LEFT_BOTTOM.ordinal()] = 4;
            iArr[DragPointType.LEFT.ordinal()] = 5;
            iArr[DragPointType.TOP.ordinal()] = 6;
            iArr[DragPointType.RIGHT.ordinal()] = 7;
            iArr[DragPointType.BOTTOM.ordinal()] = 8;
            iArr[DragPointType.CENTER.ordinal()] = 9;
            int[] iArr2 = new int[DragPointType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DragPointType.LEFT_TOP.ordinal()] = 1;
            iArr2[DragPointType.RIGHT_TOP.ordinal()] = 2;
            iArr2[DragPointType.RIGHT_BOTTOM.ordinal()] = 3;
            iArr2[DragPointType.LEFT_BOTTOM.ordinal()] = 4;
            iArr2[DragPointType.TOP.ordinal()] = 5;
            iArr2[DragPointType.RIGHT.ordinal()] = 6;
            iArr2[DragPointType.BOTTOM.ordinal()] = 7;
            iArr2[DragPointType.LEFT.ordinal()] = 8;
            iArr2[DragPointType.CENTER.ordinal()] = 9;
        }
    }

    public CropPointsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CropPointsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CropPointsView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scanner.CropPointsView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropPointsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.linePaint = paint;
        Paint paint2 = new Paint(1);
        this.pointPaint = paint2;
        Paint paint3 = new Paint(1);
        this.pointFillPaint = paint3;
        this.imageRect = new Rect();
        this.linePath = new Path();
        this.dragRect = new Rect();
        this.dragLine = new Line(0, 0, 0, 7, null);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        this.density = resources.getDisplayMetrics().density;
        new TypedValue();
        paint.setColor(UiUtils.INSTANCE.getColorAccent(context));
        float f = 2;
        paint.setStrokeWidth(this.density * f);
        paint.setStyle(Paint.Style.STROKE);
        new TypedValue();
        paint2.setColor(UiUtils.INSTANCE.getColorAccent(context));
        paint2.setStrokeWidth(this.density * f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint3.setColor(-1);
        paint3.setAlpha(100);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        float f2 = this.density;
        this.pointRadius = 9.0f * f2;
        this.midPointRadius = f2 * 7.0f;
        this.centerPointRadius = 7.0f * f2;
        this.touchPointDistance = f2 * 20.0f;
    }

    public final Paint getLinePaint() {
        return this.linePaint;
    }

    public final Paint getPointPaint() {
        return this.pointPaint;
    }

    public final Paint getPointFillPaint() {
        return this.pointFillPaint;
    }

    public final float getPointRadius() {
        return this.pointRadius;
    }

    public final void setPointRadius(float f) {
        this.pointRadius = f;
    }

    public final float getMidPointRadius() {
        return this.midPointRadius;
    }

    public final void setMidPointRadius(float f) {
        this.midPointRadius = f;
    }

    public final float getCenterPointRadius() {
        return this.centerPointRadius;
    }

    public final void setCenterPointRadius(float f) {
        this.centerPointRadius = f;
    }

    public final float getTouchPointDistance() {
        return this.touchPointDistance;
    }

    public final void setTouchPointDistance(float f) {
        this.touchPointDistance = f;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(Callback callback) {
        this.callback = callback;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        List<? extends Point> list;
        Point point;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        List<? extends Point> list2 = this.points;
        if (list2 == null || (list = this.midPoints) == null || (point = this.centerPoint) == null || getWidth() <= 0 || getHeight() <= 0 || this.imageRect.isEmpty()) {
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawCircle(point.x, point.y, this.centerPointRadius, this.pointFillPaint);
        canvas.drawCircle(point.x, point.y, this.centerPointRadius, this.pointPaint);
        canvas.drawPath(this.linePath, this.linePaint);
        for (Point point2 : list) {
            canvas.drawCircle(point2.x, point2.y, this.midPointRadius, this.pointFillPaint);
            canvas.drawCircle(point2.x, point2.y, this.midPointRadius, this.pointPaint);
        }
        for (Point point3 : list2) {
            canvas.drawCircle(point3.x, point3.y, this.pointRadius, this.pointFillPaint);
            canvas.drawCircle(point3.x, point3.y, this.pointRadius, this.pointPaint);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            Point nearByPoint = getNearByPoint(event.getX(), event.getY());
            this.dragPoint = nearByPoint;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(nearByPoint != null);
            }
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x05a8, code lost:
    
        if (r16.dragLine.getY(r14) < r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05b8, code lost:
    
        if (r16.dragLine.getY(r14) > r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x06d3, code lost:
    
        if (r16.dragLine.getY(r12) < r13) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x06e3, code lost:
    
        if (r16.dragLine.getY(r12) > r13) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0354, code lost:
    
        if (r16.dragLine.getY(r12) > r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0364, code lost:
    
        if (r16.dragLine.getY(r12) < r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x047c, code lost:
    
        if (r16.dragLine.getY(r14) > r12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x048c, code lost:
    
        if (r16.dragLine.getY(r14) < r12) goto L80;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 3172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.scanner.CropPointsView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setImageRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Rect rect2 = this.imageRect;
        rect2.left = rect.left;
        rect2.top = rect.top;
        rect2.right = rect.right;
        rect2.bottom = rect.bottom;
        List<? extends PointF> list = this.pointFList;
        if (list == null || list.isEmpty()) {
            return;
        }
        updatePoints();
        postInvalidate();
    }

    public final void setPoints(List<? extends PointF> list) {
        this.pointFList = list;
        if (this.imageRect.isEmpty()) {
            return;
        }
        updatePoints();
        postInvalidate();
    }

    public final List<PointF> getPoints() {
        PointF point;
        PointF point2;
        PointF point3;
        PointF point4 = getPoint(DragPointType.LEFT_TOP);
        if (point4 == null || (point = getPoint(DragPointType.RIGHT_TOP)) == null || (point2 = getPoint(DragPointType.RIGHT_BOTTOM)) == null || (point3 = getPoint(DragPointType.LEFT_BOTTOM)) == null) {
            return null;
        }
        return CollectionsKt.listOf((Object[]) new PointF[]{point4, point, point2, point3});
    }

    public final PointF getPoint(DragPointType pointType) {
        Intrinsics.checkNotNullParameter(pointType, "pointType");
        if (getTruePoint(pointType) != null) {
            return new PointF((r4.x - this.imageRect.left) / this.imageRect.width(), (r4.y - this.imageRect.top) / this.imageRect.height());
        }
        return null;
    }

    public final Point getTruePoint(DragPointType pointType) {
        List<? extends Point> list;
        Point point;
        Intrinsics.checkNotNullParameter(pointType, "pointType");
        List<? extends Point> list2 = this.points;
        if (list2 == null || (list = this.midPoints) == null || (point = this.centerPoint) == null || this.imageRect.isEmpty()) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[pointType.ordinal()]) {
            case 1:
                return list2.get(0);
            case 2:
                return list2.get(1);
            case 3:
                return list2.get(2);
            case 4:
                return list2.get(3);
            case 5:
                return list.get(0);
            case 6:
                return list.get(1);
            case 7:
                return list.get(2);
            case 8:
                return list.get(3);
            case 9:
                return point;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final float getDistance(Point point, float x, float y) {
        double d = 2;
        return (float) Math.sqrt(((float) Math.pow(x - point.x, d)) + ((float) Math.pow(y - point.y, d)));
    }

    private final Point getNearByPoint(float x, float y) {
        List<? extends Point> list;
        Point point;
        List<? extends Point> list2 = this.points;
        Object obj = null;
        if (list2 == null || (list = this.midPoints) == null || (point = this.centerPoint) == null) {
            return null;
        }
        List plus = CollectionsKt.plus((Collection<? extends Point>) CollectionsKt.plus((Collection) list2, (Iterable) list), point);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : plus) {
            if (getDistance((Point) obj2, x, y) <= this.touchPointDistance) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                float distance = getDistance((Point) obj, x, y);
                do {
                    Object next = it.next();
                    float distance2 = getDistance((Point) next, x, y);
                    if (Float.compare(distance, distance2) > 0) {
                        obj = next;
                        distance = distance2;
                    }
                } while (it.hasNext());
            }
        }
        return (Point) obj;
    }

    private final void updatePoints() {
        List<? extends PointF> list = this.pointFList;
        if (list == null || list.size() != 4 || this.imageRect.isEmpty()) {
            return;
        }
        List<? extends PointF> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (PointF pointF : list2) {
            arrayList.add(new Point((int) (this.imageRect.left + (this.imageRect.width() * pointF.x) + 0.5f), (int) (this.imageRect.top + (this.imageRect.height() * pointF.y) + 0.5f)));
        }
        ArrayList arrayList2 = arrayList;
        this.points = arrayList2;
        this.midPoints = CollectionsKt.listOf((Object[]) new Point[]{getMidPoint((Point) arrayList2.get(0), (Point) arrayList2.get(1)), getMidPoint((Point) arrayList2.get(1), (Point) arrayList2.get(2)), getMidPoint((Point) arrayList2.get(2), (Point) arrayList2.get(3)), getMidPoint((Point) arrayList2.get(3), (Point) arrayList2.get(0))});
        this.centerPoint = new Point((((((Point) arrayList2.get(0)).x + ((Point) arrayList2.get(1)).x) + ((Point) arrayList2.get(2)).x) + ((Point) arrayList2.get(3)).x) / 4, (((((Point) arrayList2.get(0)).y + ((Point) arrayList2.get(1)).y) + ((Point) arrayList2.get(2)).y) + ((Point) arrayList2.get(3)).y) / 4);
        updateLinePath();
    }

    private final void updateLinePath() {
        if (this.points != null) {
            Path path = this.linePath;
            path.reset();
            path.moveTo(r0.get(0).x, r0.get(0).y);
            path.lineTo(r0.get(1).x, r0.get(1).y);
            path.lineTo(r0.get(2).x, r0.get(2).y);
            path.lineTo(r0.get(3).x, r0.get(3).y);
            path.close();
        }
    }

    private final Point getMidPoint(Point point0, Point point1) {
        return new Point((point0.x + point1.x) / 2, (point0.y + point1.y) / 2);
    }
}
