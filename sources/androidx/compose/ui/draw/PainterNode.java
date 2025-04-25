package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getDrawableIntrinsicSize() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo395measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(m4169modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m4169modifyConstraintsZezNO4M = m4169modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m6952getMinWidthimpl(m4169modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m4169modifyConstraintsZezNO4M = m4169modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m6952getMinWidthimpl(m4169modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m4169modifyConstraintsZezNO4M = m4169modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m6951getMinHeightimpl(m4169modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (getUseIntrinsicSize()) {
            long m4169modifyConstraintsZezNO4M = m4169modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m6951getMinHeightimpl(m4169modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m4166calculateScaledSizeE7KxVPU(long dstSize) {
        float m4343getWidthimpl;
        float m4340getHeightimpl;
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        if (!m4168hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getDrawableIntrinsicSize())) {
            m4343getWidthimpl = Size.m4343getWidthimpl(dstSize);
        } else {
            m4343getWidthimpl = Size.m4343getWidthimpl(this.painter.getDrawableIntrinsicSize());
        }
        if (!m4167hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getDrawableIntrinsicSize())) {
            m4340getHeightimpl = Size.m4340getHeightimpl(dstSize);
        } else {
            m4340getHeightimpl = Size.m4340getHeightimpl(this.painter.getDrawableIntrinsicSize());
        }
        long Size = SizeKt.Size(m4343getWidthimpl, m4340getHeightimpl);
        if (Size.m4343getWidthimpl(dstSize) != 0.0f && Size.m4340getHeightimpl(dstSize) != 0.0f) {
            return ScaleFactorKt.m5955timesUQTWf7w(Size, this.contentScale.mo5842computeScaleFactorH7hwNQA(Size, dstSize));
        }
        return Size.INSTANCE.m4352getZeroNHjbRc();
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m4169modifyConstraintsZezNO4M(long constraints) {
        int m6952getMinWidthimpl;
        int m6951getMinHeightimpl;
        boolean z = Constraints.m6946getHasBoundedWidthimpl(constraints) && Constraints.m6945getHasBoundedHeightimpl(constraints);
        boolean z2 = Constraints.m6948getHasFixedWidthimpl(constraints) && Constraints.m6947getHasFixedHeightimpl(constraints);
        if ((!getUseIntrinsicSize() && z) || z2) {
            return Constraints.m6941copyZbe2FdA$default(constraints, Constraints.m6950getMaxWidthimpl(constraints), 0, Constraints.m6949getMaxHeightimpl(constraints), 0, 10, null);
        }
        long drawableIntrinsicSize = this.painter.getDrawableIntrinsicSize();
        if (!m4168hasSpecifiedAndFiniteWidthuvyYCjk(drawableIntrinsicSize)) {
            m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(constraints);
        } else {
            m6952getMinWidthimpl = Math.round(Size.m4343getWidthimpl(drawableIntrinsicSize));
        }
        if (!m4167hasSpecifiedAndFiniteHeightuvyYCjk(drawableIntrinsicSize)) {
            m6951getMinHeightimpl = Constraints.m6951getMinHeightimpl(constraints);
        } else {
            m6951getMinHeightimpl = Math.round(Size.m4340getHeightimpl(drawableIntrinsicSize));
        }
        long m4166calculateScaledSizeE7KxVPU = m4166calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m6967constrainWidthK40F9xA(constraints, m6952getMinWidthimpl), ConstraintsKt.m6966constrainHeightK40F9xA(constraints, m6951getMinHeightimpl)));
        return Constraints.m6941copyZbe2FdA$default(constraints, ConstraintsKt.m6967constrainWidthK40F9xA(constraints, Math.round(Size.m4343getWidthimpl(m4166calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m6966constrainHeightK40F9xA(constraints, Math.round(Size.m4340getHeightimpl(m4166calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m4343getWidthimpl;
        float m4340getHeightimpl;
        long m4352getZeroNHjbRc;
        long drawableIntrinsicSize = this.painter.getDrawableIntrinsicSize();
        if (m4168hasSpecifiedAndFiniteWidthuvyYCjk(drawableIntrinsicSize)) {
            m4343getWidthimpl = Size.m4343getWidthimpl(drawableIntrinsicSize);
        } else {
            m4343getWidthimpl = Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc());
        }
        if (m4167hasSpecifiedAndFiniteHeightuvyYCjk(drawableIntrinsicSize)) {
            m4340getHeightimpl = Size.m4340getHeightimpl(drawableIntrinsicSize);
        } else {
            m4340getHeightimpl = Size.m4340getHeightimpl(contentDrawScope.mo5071getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m4343getWidthimpl, m4340getHeightimpl);
        if (Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc()) != 0.0f && Size.m4340getHeightimpl(contentDrawScope.mo5071getSizeNHjbRc()) != 0.0f) {
            m4352getZeroNHjbRc = ScaleFactorKt.m5955timesUQTWf7w(Size, this.contentScale.mo5842computeScaleFactorH7hwNQA(Size, contentDrawScope.mo5071getSizeNHjbRc()));
        } else {
            m4352getZeroNHjbRc = Size.INSTANCE.m4352getZeroNHjbRc();
        }
        long j = m4352getZeroNHjbRc;
        long mo4120alignKFBX0sM = this.alignment.mo4120alignKFBX0sM(IntSizeKt.IntSize(Math.round(Size.m4343getWidthimpl(j)), Math.round(Size.m4340getHeightimpl(j))), IntSizeKt.IntSize(Math.round(Size.m4343getWidthimpl(contentDrawScope.mo5071getSizeNHjbRc())), Math.round(Size.m4340getHeightimpl(contentDrawScope.mo5071getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m7125getXimpl = IntOffset.m7125getXimpl(mo4120alignKFBX0sM);
        float m7126getYimpl = IntOffset.m7126getYimpl(mo4120alignKFBX0sM);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(m7125getXimpl, m7126getYimpl);
        try {
            this.painter.m5198drawx_KDEd0(contentDrawScope2, j, this.alpha, this.colorFilter);
            contentDrawScope2.getDrawContext().getTransform().translate(-m7125getXimpl, -m7126getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().translate(-m7125getXimpl, -m7126getYimpl);
            throw th;
        }
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m4168hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m4339equalsimpl0(j, Size.INSTANCE.m4351getUnspecifiedNHjbRc())) {
            float m4343getWidthimpl = Size.m4343getWidthimpl(j);
            if (!Float.isInfinite(m4343getWidthimpl) && !Float.isNaN(m4343getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m4167hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m4339equalsimpl0(j, Size.INSTANCE.m4351getUnspecifiedNHjbRc())) {
            float m4340getHeightimpl = Size.m4340getHeightimpl(j);
            if (!Float.isInfinite(m4340getHeightimpl) && !Float.isNaN(m4340getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
