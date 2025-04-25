package com.bumptech.glide.integration.compose;

import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.integration.ktx.FlowsKt;
import com.bumptech.glide.integration.ktx.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Sizes.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0000\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\u0001*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0000\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"inferredGlideSize", "Lcom/bumptech/glide/integration/ktx/Size;", "Landroidx/compose/ui/unit/Constraints;", "inferredGlideSize-BRTryo0", "(J)Lcom/bumptech/glide/integration/ktx/Size;", "isOverrideSizeSet", "", "Lcom/bumptech/glide/RequestBuilder;", "", "overrideSize", "toGlideSize", "Landroidx/compose/ui/geometry/Size;", "toGlideSize-uvyYCjk", "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SizesKt {
    public static final Size overrideSize(RequestBuilder<? extends Object> requestBuilder) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        if (isOverrideSizeSet(requestBuilder)) {
            return new Size(requestBuilder.getOverrideWidth(), requestBuilder.getOverrideHeight());
        }
        return null;
    }

    public static final boolean isOverrideSizeSet(RequestBuilder<? extends Object> requestBuilder) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        return FlowsKt.isValidGlideDimension(requestBuilder.getOverrideWidth()) && FlowsKt.isValidGlideDimension(requestBuilder.getOverrideHeight());
    }

    /* renamed from: toGlideSize-uvyYCjk, reason: not valid java name */
    public static final Size m7685toGlideSizeuvyYCjk(long j) {
        int roundToInt = MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4343getWidthimpl(j));
        int roundToInt2 = MathKt.roundToInt(androidx.compose.ui.geometry.Size.m4340getHeightimpl(j));
        if (FlowsKt.isValidGlideDimension(roundToInt) && FlowsKt.isValidGlideDimension(roundToInt2)) {
            return new Size(roundToInt, roundToInt2);
        }
        return null;
    }

    /* renamed from: inferredGlideSize-BRTryo0, reason: not valid java name */
    public static final Size m7684inferredGlideSizeBRTryo0(long j) {
        int m6950getMaxWidthimpl = Constraints.m6946getHasBoundedWidthimpl(j) ? Constraints.m6950getMaxWidthimpl(j) : Integer.MIN_VALUE;
        int m6949getMaxHeightimpl = Constraints.m6945getHasBoundedHeightimpl(j) ? Constraints.m6949getMaxHeightimpl(j) : Integer.MIN_VALUE;
        if (FlowsKt.isValidGlideDimension(m6950getMaxWidthimpl) && FlowsKt.isValidGlideDimension(m6949getMaxHeightimpl)) {
            return new Size(m6950getMaxWidthimpl, m6949getMaxHeightimpl);
        }
        return null;
    }
}
