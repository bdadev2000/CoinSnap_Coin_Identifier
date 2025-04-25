package com.glority.android.detection.helper;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonMaxSuppression.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/glority/android/detection/helper/BoundingBox;", "", "classIndex", "", FirebaseAnalytics.Param.SCORE, "", "rect", "Landroid/graphics/RectF;", "(IFLandroid/graphics/RectF;)V", "getClassIndex", "()I", "getRect", "()Landroid/graphics/RectF;", "getScore", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final /* data */ class BoundingBox {
    private final int classIndex;
    private final RectF rect;
    private final float score;

    public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, int i, float f, RectF rectF, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = boundingBox.classIndex;
        }
        if ((i2 & 2) != 0) {
            f = boundingBox.score;
        }
        if ((i2 & 4) != 0) {
            rectF = boundingBox.rect;
        }
        return boundingBox.copy(i, f, rectF);
    }

    /* renamed from: component1, reason: from getter */
    public final int getClassIndex() {
        return this.classIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* renamed from: component3, reason: from getter */
    public final RectF getRect() {
        return this.rect;
    }

    public final BoundingBox copy(int classIndex, float score, RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new BoundingBox(classIndex, score, rect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) other;
        return this.classIndex == boundingBox.classIndex && Float.compare(this.score, boundingBox.score) == 0 && Intrinsics.areEqual(this.rect, boundingBox.rect);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.classIndex) * 31) + Float.hashCode(this.score)) * 31) + this.rect.hashCode();
    }

    public String toString() {
        return "BoundingBox(classIndex=" + this.classIndex + ", score=" + this.score + ", rect=" + this.rect + ")";
    }

    public BoundingBox(int i, float f, RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.classIndex = i;
        this.score = f;
        this.rect = rect;
    }

    public final int getClassIndex() {
        return this.classIndex;
    }

    public final float getScore() {
        return this.score;
    }

    public final RectF getRect() {
        return this.rect;
    }
}
