package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FlowLayoutBuildingBlocks {

    /* renamed from: a, reason: collision with root package name */
    public final int f3900a;

    /* renamed from: b, reason: collision with root package name */
    public final FlowLayoutOverflowState f3901b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3902c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3903f;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class WrapEllipsisInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Measurable f3904a;

        /* renamed from: b, reason: collision with root package name */
        public final Placeable f3905b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3906c;
        public boolean d = true;

        public WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2) {
            this.f3904a = measurable;
            this.f3905b = placeable;
            this.f3906c = j2;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class WrapInfo {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3907a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3908b;

        public WrapInfo(boolean z2, boolean z3) {
            this.f3907a = z2;
            this.f3908b = z3;
        }
    }

    public FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5) {
        this.f3900a = i2;
        this.f3901b = flowLayoutOverflowState;
        this.f3902c = j2;
        this.d = i3;
        this.e = i4;
        this.f3903f = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006c, code lost:
    
        if (r7 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo a(androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo r6, boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            boolean r6 = r6.f3908b
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            androidx.compose.foundation.layout.FlowLayoutOverflowState r6 = r5.f3901b
            androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType r1 = r6.f3942a
            int r1 = r1.ordinal()
            r2 = 1
            if (r1 == 0) goto L83
            if (r1 == r2) goto L83
            r3 = 2
            if (r1 == r3) goto L20
            r3 = 3
            if (r1 != r3) goto L1a
            goto L20
        L1a:
            d0.e r6 = new d0.e
            r6.<init>()
            throw r6
        L20:
            java.lang.String r1 = "Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase."
            r3 = -1
            if (r7 == 0) goto L4f
            q0.p r7 = r6.f3950k
            if (r7 == 0) goto L42
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            int r4 = r6.d
            if (r4 == r3) goto L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r7.invoke(r9, r1)
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            if (r7 != 0) goto L44
            goto L42
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L42:
            androidx.compose.ui.layout.Measurable r7 = r6.e
        L44:
            androidx.collection.IntIntPair r9 = r6.f3948i
            q0.p r1 = r6.f3950k
            if (r1 != 0) goto L4d
            androidx.compose.ui.layout.Placeable r6 = r6.f3945f
            goto L81
        L4d:
            r6 = r0
            goto L81
        L4f:
            int r7 = r6.f3943b
            int r7 = r7 - r2
            if (r8 < r7) goto L78
            int r7 = r6.f3944c
            if (r9 < r7) goto L78
            q0.p r7 = r6.f3950k
            if (r7 == 0) goto L75
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            int r4 = r6.d
            if (r4 == r3) goto L6f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r7.invoke(r9, r1)
            androidx.compose.ui.layout.Measurable r7 = (androidx.compose.ui.layout.Measurable) r7
            if (r7 != 0) goto L79
            goto L75
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r1)
            throw r6
        L75:
            androidx.compose.ui.layout.Measurable r7 = r6.f3946g
            goto L79
        L78:
            r7 = r0
        L79:
            androidx.collection.IntIntPair r9 = r6.f3949j
            q0.p r1 = r6.f3950k
            if (r1 != 0) goto L4d
            androidx.compose.ui.layout.Placeable r6 = r6.f3947h
        L81:
            if (r7 != 0) goto L85
        L83:
            r1 = r0
            goto L8f
        L85:
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo r1 = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo
            p0.a.p(r9)
            long r3 = r9.f1432a
            r1.<init>(r7, r6, r3)
        L8f:
            if (r1 != 0) goto L92
            return r0
        L92:
            if (r8 < 0) goto La5
            if (r11 == 0) goto La6
            r6 = 32
            long r7 = r1.f3906c
            long r6 = r7 >> r6
            int r6 = (int) r6
            int r10 = r10 - r6
            if (r10 < 0) goto La5
            int r6 = r5.f3900a
            if (r11 >= r6) goto La5
            goto La6
        La5:
            r2 = 0
        La6:
            r1.d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.a(androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo, boolean, int, int, int, int):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapEllipsisInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if ((((int) (r21 >> 32)) - ((int) (r16 >> 32))) < 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo b(boolean r19, int r20, long r21, androidx.collection.IntIntPair r23, int r24, int r25, int r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.b(boolean, int, long, androidx.collection.IntIntPair, int, int, int, boolean, boolean):androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo");
    }
}
