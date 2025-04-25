package com.glority.android.detection.helper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.image.ColorSpaceType;
import org.tensorflow.lite.support.image.ImageOperator;
import org.tensorflow.lite.support.image.TensorImage;

/* compiled from: DetResizeOp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/glority/android/detection/helper/DetResizeOp;", "Lorg/tensorflow/lite/support/image/ImageOperator;", "targetHeight", "", "targetWidth", "(II)V", "getTargetHeight", "()I", "getTargetWidth", "apply", "Lorg/tensorflow/lite/support/image/TensorImage;", "image", "getOutputImageHeight", "inputImageHeight", "inputImageWidth", "getOutputImageWidth", "inverseTransform", "Landroid/graphics/PointF;", "point", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class DetResizeOp implements ImageOperator {
    private final int targetHeight;
    private final int targetWidth;

    public DetResizeOp(int i, int i2) {
        this.targetHeight = i;
        this.targetWidth = i2;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public final int getTargetWidth() {
        return this.targetWidth;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator, org.tensorflow.lite.support.common.Operator
    public TensorImage apply(TensorImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        SupportPreconditions.checkArgument(image.getColorSpaceType() == ColorSpaceType.RGB, "Only RGB images are supported in ResizeOp, but not " + image.getColorSpaceType().name());
        Bitmap createBitmap = Bitmap.createBitmap(this.targetWidth, this.targetHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(targetWidth…,Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(Color.parseColor("#FF727272"));
        float max = Math.max(image.getBitmap().getWidth() / this.targetWidth, image.getBitmap().getHeight() / this.targetHeight);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(image.getBitmap(), (int) (image.getBitmap().getWidth() / max), (int) (image.getBitmap().getHeight() / max), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(image…/maxRate).toInt(), false)");
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, (Paint) null);
        createScaledBitmap.recycle();
        image.load(createBitmap);
        return image;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageHeight(int inputImageHeight, int inputImageWidth) {
        return this.targetHeight;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public int getOutputImageWidth(int inputImageHeight, int inputImageWidth) {
        return this.targetWidth;
    }

    @Override // org.tensorflow.lite.support.image.ImageOperator
    public PointF inverseTransform(PointF point, int inputImageHeight, int inputImageWidth) {
        Intrinsics.checkNotNullParameter(point, "point");
        return new PointF((point.x * inputImageWidth) / this.targetWidth, (point.y * inputImageHeight) / this.targetHeight);
    }
}
