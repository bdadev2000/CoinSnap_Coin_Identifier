package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.ModelExtractorKt;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.integration.compose.DoNotTransition;
import com.bumptech.glide.integration.compose.Transition;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlideModifier.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0019\u001a\u00020\tHÂ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÂ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0011HÂ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0013HÂ\u0003Jn\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0002H\u0016J\u0013\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0002H\u0016J\f\u0010.\u001a\u00020,*\u00020/H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlideNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/bumptech/glide/integration/compose/GlideNode;", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "requestListener", "Lcom/bumptech/glide/integration/compose/RequestListener;", "draw", "", "transitionFactory", "Lcom/bumptech/glide/integration/compose/Transition$Factory;", "(Lcom/bumptech/glide/RequestBuilder;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;Ljava/lang/Float;Landroidx/compose/ui/graphics/ColorFilter;Lcom/bumptech/glide/integration/compose/RequestListener;Ljava/lang/Boolean;Lcom/bumptech/glide/integration/compose/Transition$Factory;)V", "Ljava/lang/Float;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "()Ljava/lang/Float;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "copy", "(Lcom/bumptech/glide/RequestBuilder;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;Ljava/lang/Float;Landroidx/compose/ui/graphics/ColorFilter;Lcom/bumptech/glide/integration/compose/RequestListener;Ljava/lang/Boolean;Lcom/bumptech/glide/integration/compose/Transition$Factory;)Lcom/bumptech/glide/integration/compose/GlideNodeElement;", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final /* data */ class GlideNodeElement extends ModifierNodeElement<GlideNode> {
    private final Alignment alignment;
    private final Float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Boolean draw;
    private final RequestBuilder<Drawable> requestBuilder;
    private final RequestListener requestListener;
    private final Transition.Factory transitionFactory;

    private final RequestBuilder<Drawable> component1() {
        return this.requestBuilder;
    }

    /* renamed from: component2, reason: from getter */
    private final ContentScale getContentScale() {
        return this.contentScale;
    }

    /* renamed from: component3, reason: from getter */
    private final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component4, reason: from getter */
    private final Float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component5, reason: from getter */
    private final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    /* renamed from: component6, reason: from getter */
    private final RequestListener getRequestListener() {
        return this.requestListener;
    }

    /* renamed from: component7, reason: from getter */
    private final Boolean getDraw() {
        return this.draw;
    }

    /* renamed from: component8, reason: from getter */
    private final Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    public final GlideNodeElement copy(RequestBuilder<Drawable> requestBuilder, ContentScale contentScale, Alignment alignment, Float alpha, ColorFilter colorFilter, RequestListener requestListener, Boolean draw, Transition.Factory transitionFactory) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new GlideNodeElement(requestBuilder, contentScale, alignment, alpha, colorFilter, requestListener, draw, transitionFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlideNodeElement)) {
            return false;
        }
        GlideNodeElement glideNodeElement = (GlideNodeElement) other;
        return Intrinsics.areEqual(this.requestBuilder, glideNodeElement.requestBuilder) && Intrinsics.areEqual(this.contentScale, glideNodeElement.contentScale) && Intrinsics.areEqual(this.alignment, glideNodeElement.alignment) && Intrinsics.areEqual((Object) this.alpha, (Object) glideNodeElement.alpha) && Intrinsics.areEqual(this.colorFilter, glideNodeElement.colorFilter) && Intrinsics.areEqual(this.requestListener, glideNodeElement.requestListener) && Intrinsics.areEqual(this.draw, glideNodeElement.draw) && Intrinsics.areEqual(this.transitionFactory, glideNodeElement.transitionFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((this.requestBuilder.hashCode() * 31) + this.contentScale.hashCode()) * 31) + this.alignment.hashCode()) * 31;
        Float f = this.alpha;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        ColorFilter colorFilter = this.colorFilter;
        int hashCode3 = (hashCode2 + (colorFilter == null ? 0 : colorFilter.hashCode())) * 31;
        RequestListener requestListener = this.requestListener;
        int hashCode4 = (hashCode3 + (requestListener == null ? 0 : requestListener.hashCode())) * 31;
        Boolean bool = this.draw;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Transition.Factory factory = this.transitionFactory;
        return hashCode5 + (factory != null ? factory.hashCode() : 0);
    }

    public String toString() {
        return "GlideNodeElement(requestBuilder=" + this.requestBuilder + ", contentScale=" + this.contentScale + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ", requestListener=" + this.requestListener + ", draw=" + this.draw + ", transitionFactory=" + this.transitionFactory + ')';
    }

    public GlideNodeElement(RequestBuilder<Drawable> requestBuilder, ContentScale contentScale, Alignment alignment, Float f, ColorFilter colorFilter, RequestListener requestListener, Boolean bool, Transition.Factory factory) {
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.requestBuilder = requestBuilder;
        this.contentScale = contentScale;
        this.alignment = alignment;
        this.alpha = f;
        this.colorFilter = colorFilter;
        this.requestListener = requestListener;
        this.draw = bool;
        this.transitionFactory = factory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public GlideNode getNode() {
        GlideNode glideNode = new GlideNode();
        update(glideNode);
        return glideNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(GlideNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.onNewRequest(this.requestBuilder, this.contentScale, this.alignment, this.alpha, this.colorFilter, this.requestListener, this.draw, this.transitionFactory);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        String str;
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("GlideNode");
        inspectorInfo.getProperties().set("model", ModelExtractorKt.getInternalModel(this.requestBuilder));
        ValueElementSequence properties = inspectorInfo.getProperties();
        Object overrideSize = SizesKt.overrideSize(this.requestBuilder);
        if (overrideSize == null) {
            overrideSize = "LayoutBased";
        }
        properties.set(LogEventArguments.ARG_SIZE, overrideSize);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("contentScale", this.contentScale);
        inspectorInfo.getProperties().set("colorFilter", this.colorFilter);
        inspectorInfo.getProperties().set("draw", this.draw);
        ValueElementSequence properties2 = inspectorInfo.getProperties();
        Transition.Factory factory = this.transitionFactory;
        if (factory instanceof DoNotTransition.Factory) {
            str = "None";
        } else {
            str = factory instanceof CrossFade ? "CrossFade" : "Custom: " + this.transitionFactory;
        }
        properties2.set("transition", str);
    }
}
