package com.bumptech.glide;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModelExtractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"internalModel", "", "kotlin.jvm.PlatformType", "Lcom/bumptech/glide/RequestBuilder;", "getInternalModel", "(Lcom/bumptech/glide/RequestBuilder;)Ljava/lang/Object;", "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ModelExtractorKt {
    public static final Object getInternalModel(RequestBuilder<?> requestBuilder) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        return requestBuilder.getModel();
    }
}
