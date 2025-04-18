package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RecomposeScopeImpl$end$1$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecomposeScopeImpl f13873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f13875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i2, MutableObjectIntMap mutableObjectIntMap) {
        super(1);
        this.f13873a = recomposeScopeImpl;
        this.f13874b = i2;
        this.f13875c = mutableObjectIntMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    @Override // q0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.compose.runtime.Composition r1 = (androidx.compose.runtime.Composition) r1
            androidx.compose.runtime.RecomposeScopeImpl r2 = r0.f13873a
            int r3 = r2.e
            int r4 = r0.f13874b
            if (r3 != r4) goto Lab
            androidx.collection.MutableObjectIntMap r3 = r2.f13871f
            androidx.collection.MutableObjectIntMap r5 = r0.f13875c
            boolean r3 = p0.a.g(r5, r3)
            if (r3 == 0) goto Lab
            boolean r3 = r1 instanceof androidx.compose.runtime.CompositionImpl
            if (r3 == 0) goto Lab
            long[] r3 = r5.f1545a
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto Lab
            r8 = 0
        L24:
            r9 = r3[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9f
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3e:
            if (r13 >= r11) goto L99
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8d
            int r14 = r8 << 3
            int r14 = r14 + r13
            java.lang.Object[] r15 = r5.f1546b
            r15 = r15[r14]
            int[] r7 = r5.f1547c
            r7 = r7[r14]
            if (r7 == r4) goto L58
            r7 = 1
            goto L59
        L58:
            r7 = 0
        L59:
            if (r7 == 0) goto L83
            r12 = r1
            androidx.compose.runtime.CompositionImpl r12 = (androidx.compose.runtime.CompositionImpl) r12
            androidx.compose.runtime.collection.ScopeMap r0 = r12.f13738h
            r0.c(r15, r2)
            boolean r0 = r15 instanceof androidx.compose.runtime.DerivedState
            if (r0 == 0) goto L83
            r0 = r15
            androidx.compose.runtime.DerivedState r0 = (androidx.compose.runtime.DerivedState) r0
            r17 = r1
            androidx.compose.runtime.collection.ScopeMap r1 = r12.f13738h
            androidx.collection.MutableScatterMap r1 = r1.f14161a
            boolean r1 = r1.a(r0)
            if (r1 != 0) goto L7b
            androidx.compose.runtime.collection.ScopeMap r1 = r12.f13741k
            r1.d(r0)
        L7b:
            androidx.collection.MutableScatterMap r0 = r2.f13872g
            if (r0 == 0) goto L85
            r0.i(r15)
            goto L85
        L83:
            r17 = r1
        L85:
            if (r7 == 0) goto L8a
            r5.f(r14)
        L8a:
            r0 = 8
            goto L90
        L8d:
            r17 = r1
            r0 = r12
        L90:
            long r9 = r9 >> r0
            int r13 = r13 + 1
            r12 = r0
            r1 = r17
            r0 = r18
            goto L3e
        L99:
            r17 = r1
            r0 = r12
            if (r11 != r0) goto Lab
            goto La1
        L9f:
            r17 = r1
        La1:
            if (r8 == r6) goto Lab
            int r8 = r8 + 1
            r0 = r18
            r1 = r17
            goto L24
        Lab:
            d0.b0 r0 = d0.b0.f30125a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl$end$1$2.invoke(java.lang.Object):java.lang.Object");
    }
}
