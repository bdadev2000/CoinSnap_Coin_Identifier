package androidx.compose.material3.carousel;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Arrangement.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "priority", "", "smallSize", "", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "(IFIFIFI)V", "getLargeCount", "()I", "getLargeSize", "()F", "getMediumCount", "getMediumSize", "getSmallCount", "getSmallSize", "cost", "targetLargeSize", "isValid", "", "itemCount", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class Arrangement {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.priority = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    private final boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float targetLargeSize) {
        if (isValid()) {
            return Math.abs(targetLargeSize - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    /* compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002JX\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013J`\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "()V", "MediumItemFlexPercentage", "", "calculateLargeSize", "availableSpace", "smallCount", "", "smallSize", "mediumCount", "largeCount", "findLowestCostArrangement", "Landroidx/compose/material3/carousel/Arrangement;", "itemSpacing", "targetSmallSize", "minSmallSize", "maxSmallSize", "smallCounts", "", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "fit", "priority", "mediumSize", "largeSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float calculateLargeSize(float availableSpace, int smallCount, float smallSize, int mediumCount, int largeCount) {
            float f = mediumCount / 2.0f;
            return (availableSpace - ((smallCount + f) * smallSize)) / (largeCount + f);
        }

        private Companion() {
        }

        public final Arrangement findLowestCostArrangement(float availableSpace, float itemSpacing, float targetSmallSize, float minSmallSize, float maxSmallSize, int[] smallCounts, float targetMediumSize, int[] mediumCounts, float targetLargeSize, int[] largeCounts) {
            int[] iArr = smallCounts;
            int length = largeCounts.length;
            Arrangement arrangement = null;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = largeCounts[i2];
                int length2 = mediumCounts.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = mediumCounts[i4];
                    int length3 = iArr.length;
                    Arrangement arrangement2 = arrangement;
                    int i6 = i;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = iArr[i7];
                        int i9 = i7;
                        Arrangement arrangement3 = arrangement2;
                        int i10 = length3;
                        int i11 = i4;
                        int i12 = length2;
                        int i13 = i2;
                        int i14 = length;
                        Arrangement fit = fit(i6, availableSpace, itemSpacing, i8, targetSmallSize, minSmallSize, maxSmallSize, i5, targetMediumSize, i3, targetLargeSize);
                        if (arrangement3 != null && fit.cost(targetLargeSize) >= arrangement3.cost(targetLargeSize)) {
                            arrangement2 = arrangement3;
                        } else {
                            if (fit.cost(targetLargeSize) == 0.0f) {
                                return fit;
                            }
                            arrangement2 = fit;
                        }
                        i6++;
                        i7 = i9 + 1;
                        iArr = smallCounts;
                        length3 = i10;
                        i4 = i11;
                        length2 = i12;
                        i2 = i13;
                        length = i14;
                    }
                    i4++;
                    arrangement = arrangement2;
                    i = i6;
                    iArr = smallCounts;
                }
                i2++;
                iArr = smallCounts;
            }
            return arrangement;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r14, float r15, float r16, int r17, float r18, float r19, float r20, int r21, float r22, int r23, float r24) {
            /*
                r13 = this;
                r6 = r17
                r7 = r21
                r8 = r23
                int r0 = r8 + r7
                int r0 = r0 + r6
                int r0 = r0 + (-1)
                float r0 = (float) r0
                float r0 = r0 * r16
                float r1 = r15 - r0
                float r0 = kotlin.ranges.RangesKt.coerceIn(r18, r19, r20)
                float r9 = (float) r8
                float r2 = r24 * r9
                float r10 = (float) r7
                float r3 = r22 * r10
                float r2 = r2 + r3
                float r3 = (float) r6
                float r4 = r0 * r3
                float r2 = r2 + r4
                float r2 = r1 - r2
                r11 = 0
                if (r6 <= 0) goto L31
                int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r4 <= 0) goto L31
                float r2 = r2 / r3
                float r3 = r20 - r0
                float r2 = java.lang.Math.min(r2, r3)
            L2f:
                float r0 = r0 + r2
                goto L3f
            L31:
                if (r6 <= 0) goto L3f
                int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r4 >= 0) goto L3f
                float r2 = r2 / r3
                float r3 = r19 - r0
                float r2 = java.lang.Math.max(r2, r3)
                goto L2f
            L3f:
                if (r6 <= 0) goto L43
                r12 = r0
                goto L44
            L43:
                r12 = r11
            L44:
                r0 = r13
                r2 = r17
                r3 = r12
                r4 = r21
                r5 = r23
                float r0 = r0.calculateLargeSize(r1, r2, r3, r4, r5)
                float r1 = r0 + r12
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                if (r7 <= 0) goto L7b
                int r2 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
                if (r2 != 0) goto L5c
                goto L7b
            L5c:
                float r2 = r24 - r0
                float r2 = r2 * r9
                r3 = 1036831949(0x3dcccccd, float:0.1)
                float r3 = r3 * r1
                float r3 = r3 * r10
                float r4 = java.lang.Math.abs(r2)
                float r3 = java.lang.Math.min(r4, r3)
                int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r2 <= 0) goto L76
                float r2 = r3 / r10
                float r1 = r1 - r2
                float r3 = r3 / r9
                float r0 = r0 + r3
                goto L7b
            L76:
                float r2 = r3 / r10
                float r1 = r1 + r2
                float r3 = r3 / r9
                float r0 = r0 - r3
            L7b:
                r9 = r0
                r4 = r1
                androidx.compose.material3.carousel.Arrangement r10 = new androidx.compose.material3.carousel.Arrangement
                r0 = r10
                r1 = r14
                r2 = r12
                r3 = r17
                r5 = r21
                r6 = r9
                r7 = r23
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, float, int, float, float, float, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }
    }
}
