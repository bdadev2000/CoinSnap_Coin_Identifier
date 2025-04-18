package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.common.net.HttpHeaders;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class NodeMeasuringIntrinsics {

    /* loaded from: classes.dex */
    public interface ApproachMeasureBlock {
        MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j2);
    }

    /* loaded from: classes.dex */
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        /* renamed from: a, reason: collision with root package name */
        public final IntrinsicMeasurable f16141a;

        /* renamed from: b, reason: collision with root package name */
        public final IntrinsicMinMax f16142b;

        /* renamed from: c, reason: collision with root package name */
        public final IntrinsicWidthHeight f16143c;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.f16141a = intrinsicMeasurable;
            this.f16142b = intrinsicMinMax;
            this.f16143c = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int K(int i2) {
            return this.f16141a.K(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int R(int i2) {
            return this.f16141a.R(i2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int S(int i2) {
            return this.f16141a.S(i2);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public final Placeable V(long j2) {
            IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f16147a;
            IntrinsicMinMax intrinsicMinMax = IntrinsicMinMax.f16145b;
            IntrinsicMinMax intrinsicMinMax2 = this.f16142b;
            IntrinsicMeasurable intrinsicMeasurable = this.f16141a;
            if (this.f16143c == intrinsicWidthHeight) {
                return new EmptyPlaceable(intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.S(Constraints.h(j2)) : intrinsicMeasurable.R(Constraints.h(j2)), Constraints.d(j2) ? Constraints.h(j2) : 32767);
            }
            return new EmptyPlaceable(Constraints.e(j2) ? Constraints.i(j2) : 32767, intrinsicMinMax2 == intrinsicMinMax ? intrinsicMeasurable.s(Constraints.i(j2)) : intrinsicMeasurable.K(Constraints.i(j2)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final Object m() {
            return this.f16141a.m();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int s(int i2) {
            return this.f16141a.s(i2);
        }
    }

    /* loaded from: classes.dex */
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i2, int i3) {
            o0(IntSizeKt.a(i2, i3));
        }

        @Override // androidx.compose.ui.layout.Measured
        public final int Z(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        public final void n0(long j2, float f2, l lVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class IntrinsicMinMax {

        /* renamed from: a, reason: collision with root package name */
        public static final IntrinsicMinMax f16144a;

        /* renamed from: b, reason: collision with root package name */
        public static final IntrinsicMinMax f16145b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicMinMax[] f16146c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicMinMax] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicMinMax] */
        static {
            ?? r02 = new Enum("Min", 0);
            f16144a = r02;
            ?? r1 = new Enum("Max", 1);
            f16145b = r1;
            f16146c = new IntrinsicMinMax[]{r02, r1};
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) f16146c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class IntrinsicWidthHeight {

        /* renamed from: a, reason: collision with root package name */
        public static final IntrinsicWidthHeight f16147a;

        /* renamed from: b, reason: collision with root package name */
        public static final IntrinsicWidthHeight f16148b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ IntrinsicWidthHeight[] f16149c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicWidthHeight] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicWidthHeight] */
        static {
            ?? r02 = new Enum(HttpHeaders.WIDTH, 0);
            f16147a = r02;
            ?? r1 = new Enum("Height", 1);
            f16148b = r1;
            f16149c = new IntrinsicWidthHeight[]{r02, r1};
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) f16149c.clone();
        }
    }

    /* loaded from: classes.dex */
    public interface MeasureBlock {
    }

    public static int a(ApproachMeasureBlock approachMeasureBlock, ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator, IntrinsicMinMax.f16145b, IntrinsicWidthHeight.f16148b), ConstraintsKt.b(i2, 0, 13)).getHeight();
    }

    public static int b(ApproachMeasureBlock approachMeasureBlock, ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator, IntrinsicMinMax.f16145b, IntrinsicWidthHeight.f16147a), ConstraintsKt.b(0, i2, 7)).getWidth();
    }

    public static int c(ApproachMeasureBlock approachMeasureBlock, ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator, IntrinsicMinMax.f16144a, IntrinsicWidthHeight.f16148b), ConstraintsKt.b(i2, 0, 13)).getHeight();
    }

    public static int d(ApproachMeasureBlock approachMeasureBlock, ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return approachMeasureBlock.a(new ApproachIntrinsicsMeasureScope(approachMeasureScopeImpl, approachMeasureScopeImpl.getLayoutDirection()), new DefaultIntrinsicMeasurable(nodeCoordinator, IntrinsicMinMax.f16144a, IntrinsicWidthHeight.f16147a), ConstraintsKt.b(0, i2, 7)).getWidth();
    }
}
