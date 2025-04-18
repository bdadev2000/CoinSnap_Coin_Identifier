package com.google.accompanist.flowlayout;

import android.support.v4.media.d;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class OrientationIndependentConstraints {
    private final int crossAxisMax;
    private final int crossAxisMin;
    private final int mainAxisMax;
    private final int mainAxisMin;

    public /* synthetic */ OrientationIndependentConstraints(long j2, LayoutOrientation layoutOrientation, k kVar) {
        this(j2, layoutOrientation);
    }

    public static /* synthetic */ OrientationIndependentConstraints copy$default(OrientationIndependentConstraints orientationIndependentConstraints, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = orientationIndependentConstraints.mainAxisMin;
        }
        if ((i6 & 2) != 0) {
            i3 = orientationIndependentConstraints.mainAxisMax;
        }
        if ((i6 & 4) != 0) {
            i4 = orientationIndependentConstraints.crossAxisMin;
        }
        if ((i6 & 8) != 0) {
            i5 = orientationIndependentConstraints.crossAxisMax;
        }
        return orientationIndependentConstraints.copy(i2, i3, i4, i5);
    }

    public final int component1() {
        return this.mainAxisMin;
    }

    public final int component2() {
        return this.mainAxisMax;
    }

    public final int component3() {
        return this.crossAxisMin;
    }

    public final int component4() {
        return this.crossAxisMax;
    }

    @NotNull
    public final OrientationIndependentConstraints copy(int i2, int i3, int i4, int i5) {
        return new OrientationIndependentConstraints(i2, i3, i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) obj;
        return this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax;
    }

    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    public int hashCode() {
        return Integer.hashCode(this.crossAxisMax) + d.c(this.crossAxisMin, d.c(this.mainAxisMax, Integer.hashCode(this.mainAxisMin) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("OrientationIndependentConstraints(mainAxisMin=");
        sb.append(this.mainAxisMin);
        sb.append(", mainAxisMax=");
        sb.append(this.mainAxisMax);
        sb.append(", crossAxisMin=");
        sb.append(this.crossAxisMin);
        sb.append(", crossAxisMax=");
        return d.o(sb, this.crossAxisMax, ')');
    }

    public OrientationIndependentConstraints(int i2, int i3, int i4, int i5) {
        this.mainAxisMin = i2;
        this.mainAxisMax = i3;
        this.crossAxisMin = i4;
        this.crossAxisMax = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private OrientationIndependentConstraints(long r5, com.google.accompanist.flowlayout.LayoutOrientation r7) {
        /*
            r4 = this;
            com.google.accompanist.flowlayout.LayoutOrientation r0 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r7 != r0) goto L9
            int r1 = androidx.compose.ui.unit.Constraints.k(r5)
            goto Ld
        L9:
            int r1 = androidx.compose.ui.unit.Constraints.j(r5)
        Ld:
            if (r7 != r0) goto L14
            int r2 = androidx.compose.ui.unit.Constraints.i(r5)
            goto L18
        L14:
            int r2 = androidx.compose.ui.unit.Constraints.h(r5)
        L18:
            if (r7 != r0) goto L1f
            int r3 = androidx.compose.ui.unit.Constraints.j(r5)
            goto L23
        L1f:
            int r3 = androidx.compose.ui.unit.Constraints.k(r5)
        L23:
            if (r7 != r0) goto L2a
            int r5 = androidx.compose.ui.unit.Constraints.h(r5)
            goto L2e
        L2a:
            int r5 = androidx.compose.ui.unit.Constraints.i(r5)
        L2e:
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.OrientationIndependentConstraints.<init>(long, com.google.accompanist.flowlayout.LayoutOrientation):void");
    }
}
