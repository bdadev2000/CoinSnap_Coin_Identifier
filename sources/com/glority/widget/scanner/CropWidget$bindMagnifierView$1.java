package com.glority.widget.scanner;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.glority.widget.scanner.CropPointsView;
import com.glority.widget.scanner.CropWidget;
import com.glority.widget.uitls.ModelUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropWidget.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0006\u0010\u0015\u001a\u00020\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0016"}, d2 = {"com/glority/widget/scanner/CropWidget$bindMagnifierView$1", "Lcom/glority/widget/scanner/CropPointsView$Callback;", "dragPointType", "Lcom/glority/widget/scanner/CropPointsView$DragPointType;", "getDragPointType", "()Lcom/glority/widget/scanner/CropPointsView$DragPointType;", "setDragPointType", "(Lcom/glority/widget/scanner/CropPointsView$DragPointType;)V", "touchX", "", "getTouchX", "()F", "setTouchX", "(F)V", "touchY", "getTouchY", "setTouchY", "onDrag", "", "onDragEnded", "onDragStarted", "updateMagnifierView", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class CropWidget$bindMagnifierView$1 implements CropPointsView.Callback {
    final /* synthetic */ CropPointsView $cropView;
    final /* synthetic */ CropMagnifierView $magnifierView;
    final /* synthetic */ Function1 $onDragEnded;
    private CropPointsView.DragPointType dragPointType;
    private float touchX;
    private float touchY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CropWidget$bindMagnifierView$1(CropMagnifierView cropMagnifierView, CropPointsView cropPointsView, Function1 function1) {
        this.$magnifierView = cropMagnifierView;
        this.$cropView = cropPointsView;
        this.$onDragEnded = function1;
    }

    public final CropPointsView.DragPointType getDragPointType() {
        return this.dragPointType;
    }

    public final void setDragPointType(CropPointsView.DragPointType dragPointType) {
        this.dragPointType = dragPointType;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final void setTouchX(float f) {
        this.touchX = f;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    public final void setTouchY(float f) {
        this.touchY = f;
    }

    @Override // com.glority.widget.scanner.CropPointsView.Callback
    public void onDragStarted(final CropPointsView.DragPointType dragPointType, final float touchX, final float touchY) {
        Intrinsics.checkNotNullParameter(dragPointType, "dragPointType");
        this.$magnifierView.post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$bindMagnifierView$1$onDragStarted$1
            @Override // java.lang.Runnable
            public final void run() {
                if (dragPointType == CropPointsView.DragPointType.CENTER) {
                    return;
                }
                CropWidget$bindMagnifierView$1.this.setDragPointType(dragPointType);
                CropWidget$bindMagnifierView$1.this.setTouchX(touchX);
                CropWidget$bindMagnifierView$1.this.setTouchY(touchY);
                if (CropWidget$bindMagnifierView$1.this.$cropView.getPoint(dragPointType) != null) {
                    CropWidget$bindMagnifierView$1.this.updateMagnifierView();
                    CropWidget$bindMagnifierView$1.this.$magnifierView.setVisibility(0);
                }
            }
        });
    }

    @Override // com.glority.widget.scanner.CropPointsView.Callback
    public void onDrag(CropPointsView.DragPointType dragPointType, final float touchX, final float touchY) {
        Intrinsics.checkNotNullParameter(dragPointType, "dragPointType");
        this.$magnifierView.post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$bindMagnifierView$1$onDrag$1
            @Override // java.lang.Runnable
            public final void run() {
                CropWidget$bindMagnifierView$1.this.setTouchX(touchX);
                CropWidget$bindMagnifierView$1.this.setTouchY(touchY);
                CropWidget$bindMagnifierView$1.this.updateMagnifierView();
            }
        });
    }

    @Override // com.glority.widget.scanner.CropPointsView.Callback
    public void onDragEnded() {
        this.$magnifierView.post(new Runnable() { // from class: com.glority.widget.scanner.CropWidget$bindMagnifierView$1$onDragEnded$1
            @Override // java.lang.Runnable
            public final void run() {
                CropPointsView.DragPointType dragPointType = CropWidget$bindMagnifierView$1.this.getDragPointType();
                if (dragPointType == null || dragPointType == CropPointsView.DragPointType.CENTER) {
                    return;
                }
                CropWidget$bindMagnifierView$1.this.$magnifierView.setVisibility(8);
            }
        });
        List<PointF> points = this.$cropView.getPoints();
        if (points != null) {
        }
    }

    public final void updateMagnifierView() {
        PointF point;
        CropPointsView.DragPointType dragPointType;
        CropPointsView.DragPointType dragPointType2;
        Point truePoint;
        Point truePoint2;
        CropPointsView.DragPointType dragPointType3 = this.dragPointType;
        if (dragPointType3 == null || dragPointType3 == CropPointsView.DragPointType.CENTER || (point = this.$cropView.getPoint(dragPointType3)) == null) {
            return;
        }
        switch (CropWidget.WhenMappings.$EnumSwitchMapping$0[dragPointType3.ordinal()]) {
            case 1:
                dragPointType = CropPointsView.DragPointType.LEFT;
                dragPointType2 = CropPointsView.DragPointType.TOP;
                break;
            case 2:
                dragPointType = CropPointsView.DragPointType.RIGHT;
                dragPointType2 = CropPointsView.DragPointType.TOP;
                break;
            case 3:
                dragPointType = CropPointsView.DragPointType.RIGHT;
                dragPointType2 = CropPointsView.DragPointType.BOTTOM;
                break;
            case 4:
                dragPointType = CropPointsView.DragPointType.LEFT;
                dragPointType2 = CropPointsView.DragPointType.BOTTOM;
                break;
            case 5:
                dragPointType = CropPointsView.DragPointType.LEFT_TOP;
                dragPointType2 = CropPointsView.DragPointType.RIGHT_TOP;
                break;
            case 6:
                dragPointType = CropPointsView.DragPointType.RIGHT_TOP;
                dragPointType2 = CropPointsView.DragPointType.RIGHT_BOTTOM;
                break;
            case 7:
                dragPointType = CropPointsView.DragPointType.RIGHT_BOTTOM;
                dragPointType2 = CropPointsView.DragPointType.LEFT_BOTTOM;
                break;
            case 8:
                dragPointType = CropPointsView.DragPointType.LEFT_TOP;
                dragPointType2 = CropPointsView.DragPointType.LEFT_BOTTOM;
                break;
            default:
                return;
        }
        if (this.$cropView.getTruePoint(dragPointType3) == null || (truePoint = this.$cropView.getTruePoint(dragPointType)) == null || (truePoint2 = this.$cropView.getTruePoint(dragPointType2)) == null) {
            return;
        }
        CropMagnifierView cropMagnifierView = this.$magnifierView;
        int width = this.$cropView.getWidth();
        int height = this.$magnifierView.getHeight();
        cropMagnifierView.setPoint(point);
        cropMagnifierView.setAngle(ModelUtils.INSTANCE.calculateAngle(r0.x, r0.y, truePoint.x, truePoint.y), ModelUtils.INSTANCE.calculateAngle(r0.x, r0.y, truePoint2.x, truePoint2.y));
        ViewGroup.LayoutParams layoutParams = cropMagnifierView.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = (this.touchY > ((float) (((height + layoutParams2.topMargin) + layoutParams2.bottomMargin) + CropWidget.INSTANCE.getHAND_TOUCH_WIDTH())) || this.touchX > ((float) (width / 2))) ? 3 : 5;
        }
        cropMagnifierView.requestLayout();
    }
}
