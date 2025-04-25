package com.bumptech.glide.integration.ktx;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.GlideIntegrationKt;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.util.Util;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Flows.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0007\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0003\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0003\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a8\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007\u001a0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0007\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u000bH\u0007¨\u0006\u0011"}, d2 = {"flow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bumptech/glide/integration/ktx/GlideFlowInstant;", "ResourceT", "", "Lcom/bumptech/glide/RequestBuilder;", LogEventArguments.ARG_SIZE, "Lcom/bumptech/glide/integration/ktx/AsyncGlideSize;", "Lcom/bumptech/glide/integration/ktx/ResolvableGlideSize;", "Lcom/bumptech/glide/integration/ktx/Size;", TypedValues.Custom.S_DIMENSION, "", "width", "height", "flowResolvable", "isValidGlideDimension", "", "ktx_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class FlowsKt {
    public static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        if (!requestBuilder.isValidOverride()) {
            throw new IllegalArgumentException("At least your primary request is missing override dimensions. If you want to use Target.SIZE_ORIGINAL, do so explicitly".toString());
        }
        return flow(requestBuilder, Integer.MIN_VALUE);
    }

    public static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder, int i) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        return flow(requestBuilder, i, i);
    }

    public static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder, AsyncGlideSize size) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        return flowResolvable(requestBuilder, size);
    }

    public static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder, int i, int i2) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        if (!Util.isValidDimensions(i, i2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return flow(requestBuilder, new Size(i, i2));
    }

    private static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder, Size size) {
        return flowResolvable(requestBuilder, new ImmediateGlideSize(size));
    }

    public static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flowResolvable(RequestBuilder<ResourceT> requestBuilder, ResolvableGlideSize size) {
        Intrinsics.checkNotNullParameter(requestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        return flow(requestBuilder, size);
    }

    private static final <ResourceT> Flow<GlideFlowInstant<ResourceT>> flow(RequestBuilder<ResourceT> requestBuilder, ResolvableGlideSize resolvableGlideSize) {
        return FlowKt.callbackFlow(new FlowsKt$flow$2(resolvableGlideSize, requestBuilder, GlideIntegrationKt.requestManager(requestBuilder), null));
    }

    public static final boolean isValidGlideDimension(int i) {
        return Util.isValidDimension(i);
    }
}
