package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J \u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J \u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo395measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m882findSizeToXhtMw = m882findSizeToXhtMw(j);
        if (!IntSize.m7165equalsimpl0(m882findSizeToXhtMw, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m6960fixedJhjzzOo(IntSize.m7167getWidthimpl(m882findSizeToXhtMw), IntSize.m7166getHeightimpl(m882findSizeToXhtMw));
        }
        final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m882findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m886tryMaxWidthJN0ABg$default = m886tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m886tryMaxWidthJN0ABg$default, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m886tryMaxWidthJN0ABg$default;
            }
            long m884tryMaxHeightJN0ABg$default = m884tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m884tryMaxHeightJN0ABg$default, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m884tryMaxHeightJN0ABg$default;
            }
            long m890tryMinWidthJN0ABg$default = m890tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m890tryMinWidthJN0ABg$default, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m890tryMinWidthJN0ABg$default;
            }
            long m888tryMinHeightJN0ABg$default = m888tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m888tryMinHeightJN0ABg$default, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m888tryMinHeightJN0ABg$default;
            }
            long m885tryMaxWidthJN0ABg = m885tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m885tryMaxWidthJN0ABg, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m885tryMaxWidthJN0ABg;
            }
            long m883tryMaxHeightJN0ABg = m883tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m883tryMaxHeightJN0ABg, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m883tryMaxHeightJN0ABg;
            }
            long m889tryMinWidthJN0ABg = m889tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m889tryMinWidthJN0ABg, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m889tryMinWidthJN0ABg;
            }
            long m887tryMinHeightJN0ABg = m887tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m887tryMinHeightJN0ABg, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m887tryMinHeightJN0ABg;
            }
        } else {
            long m884tryMaxHeightJN0ABg$default2 = m884tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m884tryMaxHeightJN0ABg$default2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m884tryMaxHeightJN0ABg$default2;
            }
            long m886tryMaxWidthJN0ABg$default2 = m886tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m886tryMaxWidthJN0ABg$default2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m886tryMaxWidthJN0ABg$default2;
            }
            long m888tryMinHeightJN0ABg$default2 = m888tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m888tryMinHeightJN0ABg$default2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m888tryMinHeightJN0ABg$default2;
            }
            long m890tryMinWidthJN0ABg$default2 = m890tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m7165equalsimpl0(m890tryMinWidthJN0ABg$default2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m890tryMinWidthJN0ABg$default2;
            }
            long m883tryMaxHeightJN0ABg2 = m883tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m883tryMaxHeightJN0ABg2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m883tryMaxHeightJN0ABg2;
            }
            long m885tryMaxWidthJN0ABg2 = m885tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m885tryMaxWidthJN0ABg2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m885tryMaxWidthJN0ABg2;
            }
            long m887tryMinHeightJN0ABg2 = m887tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m887tryMinHeightJN0ABg2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m887tryMinHeightJN0ABg2;
            }
            long m889tryMinWidthJN0ABg2 = m889tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7165equalsimpl0(m889tryMinWidthJN0ABg2, IntSize.INSTANCE.m7172getZeroYbymL2g())) {
                return m889tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m7172getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m886tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m885tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m885tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j);
        if (m6950getMaxWidthimpl != Integer.MAX_VALUE && (round = Math.round(m6950getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m6950getMaxWidthimpl, round);
            if (!z || ConstraintsKt.m6968isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m7172getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m884tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m883tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m883tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j);
        if (m6949getMaxHeightimpl != Integer.MAX_VALUE && (round = Math.round(m6949getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6949getMaxHeightimpl);
            if (!z || ConstraintsKt.m6968isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m7172getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m890tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m889tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m889tryMinWidthJN0ABg(long j, boolean z) {
        int m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(j);
        int round = Math.round(m6952getMinWidthimpl / this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(m6952getMinWidthimpl, round);
            if (!z || ConstraintsKt.m6968isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m7172getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m888tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m887tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m887tryMinHeightJN0ABg(long j, boolean z) {
        int m6951getMinHeightimpl = Constraints.m6951getMinHeightimpl(j);
        int round = Math.round(m6951getMinHeightimpl * this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6951getMinHeightimpl);
            if (!z || ConstraintsKt.m6968isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m7172getZeroYbymL2g();
    }
}
