package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {

    /* renamed from: a, reason: collision with root package name */
    public final FlowLayoutOverflow.OverflowType f3942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3944c;
    public int d = -1;
    public Measurable e;

    /* renamed from: f, reason: collision with root package name */
    public Placeable f3945f;

    /* renamed from: g, reason: collision with root package name */
    public Measurable f3946g;

    /* renamed from: h, reason: collision with root package name */
    public Placeable f3947h;

    /* renamed from: i, reason: collision with root package name */
    public IntIntPair f3948i;

    /* renamed from: j, reason: collision with root package name */
    public IntIntPair f3949j;

    /* renamed from: k, reason: collision with root package name */
    public p f3950k;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        this.f3942a = overflowType;
        this.f3943b = i2;
        this.f3944c = i3;
    }

    public final IntIntPair a(int i2, int i3, boolean z2) {
        int ordinal = this.f3942a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            if (z2) {
                return this.f3948i;
            }
            return null;
        }
        if (ordinal != 3) {
            throw new RuntimeException();
        }
        if (z2) {
            return this.f3948i;
        }
        if (i2 + 1 < this.f3943b || i3 < this.f3944c) {
            return null;
        }
        return this.f3949j;
    }

    public final void b(FlowLineMeasurePolicy flowLineMeasurePolicy, Measurable measurable, Measurable measurable2, long j2) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.f4037a : LayoutOrientation.f4038b;
        long c2 = OrientationIndependentConstraints.c(OrientationIndependentConstraints.b(OrientationIndependentConstraints.a(j2, layoutOrientation), 10), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.e(measurable, flowLineMeasurePolicy, c2, new FlowLayoutOverflowState$setOverflowMeasurables$3$1(this, flowLineMeasurePolicy));
            this.e = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.e(measurable2, flowLineMeasurePolicy, c2, new FlowLayoutOverflowState$setOverflowMeasurables$4$1(this, flowLineMeasurePolicy));
            this.f3946g = measurable2;
        }
    }

    public final void c(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMeasurable intrinsicMeasurable2, boolean z2, long j2) {
        long a2 = OrientationIndependentConstraints.a(j2, z2 ? LayoutOrientation.f4037a : LayoutOrientation.f4038b);
        if (intrinsicMeasurable != null) {
            int h2 = Constraints.h(a2);
            CrossAxisAlignment crossAxisAlignment = FlowLayoutKt.f3910a;
            int R = z2 ? intrinsicMeasurable.R(h2) : intrinsicMeasurable.K(h2);
            this.f3948i = new IntIntPair(IntIntPair.a(R, FlowLayoutKt.c(intrinsicMeasurable, z2, R)));
            this.e = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.f3945f = null;
        }
        if (intrinsicMeasurable2 != null) {
            int h3 = Constraints.h(a2);
            CrossAxisAlignment crossAxisAlignment2 = FlowLayoutKt.f3910a;
            int R2 = z2 ? intrinsicMeasurable2.R(h3) : intrinsicMeasurable2.K(h3);
            this.f3949j = new IntIntPair(IntIntPair.a(R2, FlowLayoutKt.c(intrinsicMeasurable2, z2, R2)));
            this.f3946g = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.f3947h = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.f3942a == flowLayoutOverflowState.f3942a && this.f3943b == flowLayoutOverflowState.f3943b && this.f3944c == flowLayoutOverflowState.f3944c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3944c) + d.c(this.f3943b, this.f3942a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.f3942a);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.f3943b);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return d.o(sb, this.f3944c, ')');
    }
}
