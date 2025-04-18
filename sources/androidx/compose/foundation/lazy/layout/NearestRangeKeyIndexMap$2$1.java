package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NearestRangeKeyIndexMap$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f4887c;
    public final /* synthetic */ NearestRangeKeyIndexMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestRangeKeyIndexMap$2$1(int i2, int i3, MutableObjectIntMap mutableObjectIntMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        super(1);
        this.f4885a = i2;
        this.f4886b = i3;
        this.f4887c = mutableObjectIntMap;
        this.d = nearestRangeKeyIndexMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r3 == null) goto L7;
     */
    @Override // q0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            androidx.compose.foundation.lazy.layout.IntervalList$Interval r7 = (androidx.compose.foundation.lazy.layout.IntervalList.Interval) r7
            java.lang.Object r0 = r7.f4659c
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            q0.l r0 = r0.getKey()
            int r1 = r6.f4885a
            int r2 = r7.f4657a
            int r1 = java.lang.Math.max(r1, r2)
            int r7 = r7.f4658b
            int r7 = r7 + r2
            int r7 = r7 + (-1)
            int r3 = r6.f4886b
            int r7 = java.lang.Math.min(r3, r7)
            if (r1 > r7) goto L46
        L1f:
            if (r0 == 0) goto L2d
            int r3 = r1 - r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L32
        L2d:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r3.<init>(r1)
        L32:
            androidx.collection.MutableObjectIntMap r4 = r6.f4887c
            r4.g(r3, r1)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r6.d
            java.lang.Object[] r5 = r4.f4883b
            int r4 = r4.f4884c
            int r4 = r1 - r4
            r5[r4] = r3
            if (r1 == r7) goto L46
            int r1 = r1 + 1
            goto L1f
        L46:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$2$1.invoke(java.lang.Object):java.lang.Object");
    }
}
