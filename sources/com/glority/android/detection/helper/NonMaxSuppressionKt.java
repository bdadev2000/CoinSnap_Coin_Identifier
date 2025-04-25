package com.glority.android.detection.helper;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonMaxSuppression.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"IOU", "", "a", "Landroid/graphics/RectF;", "b", "nonMaxSuppression", "", "", "boundingBoxes", "Lcom/glority/android/detection/helper/BoundingBox;", "indices", "iouThreshold", "maxBoxes", "([Lcom/glority/android/detection/helper/BoundingBox;[Ljava/lang/Integer;FI)[Ljava/lang/Integer;", "([Lcom/glority/android/detection/helper/BoundingBox;FI)[Ljava/lang/Integer;", "lib-image-detection_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public final class NonMaxSuppressionKt {
    private static final float IOU(RectF rectF, RectF rectF2) {
        float width = rectF.width() * rectF.height();
        if (width <= 0.0f) {
            return 0.0f;
        }
        float width2 = rectF2.width() * rectF2.height();
        if (width2 <= 0.0f) {
            return 0.0f;
        }
        float max = Math.max(rectF.left, rectF2.left);
        float max2 = Math.max(Math.min(rectF.bottom, rectF2.bottom) - Math.max(rectF.top, rectF2.top), 0.0f) * Math.max(Math.min(rectF.right, rectF2.right) - max, 0.0f);
        return max2 / ((width + width2) - max2);
    }

    public static final Integer[] nonMaxSuppression(BoundingBox[] boundingBoxes, float f, int i) {
        Intrinsics.checkNotNullParameter(boundingBoxes, "boundingBoxes");
        return nonMaxSuppression(boundingBoxes, (Integer[]) CollectionsKt.toList(ArraysKt.getIndices(boundingBoxes)).toArray(new Integer[0]), f, i);
    }

    public static final Integer[] nonMaxSuppression(final BoundingBox[] boundingBoxes, Integer[] indices, float f, int i) {
        Intrinsics.checkNotNullParameter(boundingBoxes, "boundingBoxes");
        Intrinsics.checkNotNullParameter(indices, "indices");
        ArraysKt.sortWith(indices, new Comparator() { // from class: com.glority.android.detection.helper.NonMaxSuppressionKt$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int nonMaxSuppression$lambda$0;
                nonMaxSuppression$lambda$0 = NonMaxSuppressionKt.nonMaxSuppression$lambda$0(boundingBoxes, (Integer) obj, (Integer) obj2);
                return nonMaxSuppression$lambda$0;
            }
        });
        ArrayList arrayList = new ArrayList();
        int length = indices.length;
        for (int i2 = 0; i2 < length && arrayList.size() < i; i2++) {
            BoundingBox boundingBox = boundingBoxes[indices[i2].intValue()];
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    arrayList.add(indices[i2]);
                    break;
                }
                if (IOU(boundingBox.getRect(), boundingBoxes[((Number) arrayList.get(i3)).intValue()].getRect()) > f) {
                    break;
                }
                i3++;
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nonMaxSuppression$lambda$0(BoundingBox[] boundingBoxes, Integer a2, Integer b) {
        Intrinsics.checkNotNullParameter(boundingBoxes, "$boundingBoxes");
        Intrinsics.checkNotNullExpressionValue(a2, "a");
        Float valueOf = Float.valueOf(boundingBoxes[a2.intValue()].getScore());
        Intrinsics.checkNotNullExpressionValue(b, "b");
        return -ComparisonsKt.compareValues(valueOf, Float.valueOf(boundingBoxes[b.intValue()].getScore()));
    }
}
