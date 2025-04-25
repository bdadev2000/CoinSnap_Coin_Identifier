package com.glority.android.detection.item;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.detection.p001enum.ModelType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetectOptions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/glority/android/detection/item/DetectOptions;", "", "width", "", "height", "count", "imageMean", "", "imageStd", "modelType", "Lcom/glority/android/detection/enum/ModelType;", "(IIIFFLcom/glority/android/detection/enum/ModelType;)V", "getCount", "()I", "getHeight", "getImageMean", "()F", "getImageStd", "getModelType", "()Lcom/glority/android/detection/enum/ModelType;", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final /* data */ class DetectOptions {
    private final int count;
    private final int height;
    private final float imageMean;
    private final float imageStd;
    private final ModelType modelType;
    private final int width;

    public static /* synthetic */ DetectOptions copy$default(DetectOptions detectOptions, int i, int i2, int i3, float f, float f2, ModelType modelType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = detectOptions.width;
        }
        if ((i4 & 2) != 0) {
            i2 = detectOptions.height;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = detectOptions.count;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            f = detectOptions.imageMean;
        }
        float f3 = f;
        if ((i4 & 16) != 0) {
            f2 = detectOptions.imageStd;
        }
        float f4 = f2;
        if ((i4 & 32) != 0) {
            modelType = detectOptions.modelType;
        }
        return detectOptions.copy(i, i5, i6, f3, f4, modelType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    public final float getImageMean() {
        return this.imageMean;
    }

    /* renamed from: component5, reason: from getter */
    public final float getImageStd() {
        return this.imageStd;
    }

    /* renamed from: component6, reason: from getter */
    public final ModelType getModelType() {
        return this.modelType;
    }

    public final DetectOptions copy(int width, int height, int count, float imageMean, float imageStd, ModelType modelType) {
        Intrinsics.checkNotNullParameter(modelType, "modelType");
        return new DetectOptions(width, height, count, imageMean, imageStd, modelType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectOptions)) {
            return false;
        }
        DetectOptions detectOptions = (DetectOptions) other;
        return this.width == detectOptions.width && this.height == detectOptions.height && this.count == detectOptions.count && Float.compare(this.imageMean, detectOptions.imageMean) == 0 && Float.compare(this.imageStd, detectOptions.imageStd) == 0 && this.modelType == detectOptions.modelType;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.count)) * 31) + Float.hashCode(this.imageMean)) * 31) + Float.hashCode(this.imageStd)) * 31) + this.modelType.hashCode();
    }

    public String toString() {
        return "DetectOptions(width=" + this.width + ", height=" + this.height + ", count=" + this.count + ", imageMean=" + this.imageMean + ", imageStd=" + this.imageStd + ", modelType=" + this.modelType + ")";
    }

    public DetectOptions(int i, int i2, int i3, float f, float f2, ModelType modelType) {
        Intrinsics.checkNotNullParameter(modelType, "modelType");
        this.width = i;
        this.height = i2;
        this.count = i3;
        this.imageMean = f;
        this.imageStd = f2;
        this.modelType = modelType;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getCount() {
        return this.count;
    }

    public final float getImageMean() {
        return this.imageMean;
    }

    public final float getImageStd() {
        return this.imageStd;
    }

    public final ModelType getModelType() {
        return this.modelType;
    }
}
