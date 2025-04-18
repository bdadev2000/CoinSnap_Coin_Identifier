package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class LifecycleEffectKt$LifecycleStartEffect$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f20196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f20197c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleEffectKt$LifecycleStartEffect$1(Object obj, LifecycleOwner lifecycleOwner, l lVar, int i2, int i3) {
        super(2);
        this.f20195a = obj;
        this.f20196b = lifecycleOwner;
        this.f20197c = lVar;
        this.d = i2;
        this.f20198f = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if ((r5 & 2) != 0) goto L45;
     */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            androidx.compose.runtime.Composer r8 = (androidx.compose.runtime.Composer) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            java.lang.Object r1 = r7.f20195a
            q0.l r3 = r7.f20197c
            int r9 = r7.d
            r9 = r9 | 1
            int r4 = androidx.compose.runtime.RecomposeScopeImplKt.a(r9)
            int r5 = r7.f20198f
            r9 = -1408314671(0xffffffffac0ed2d1, float:-2.029644E-12)
            androidx.compose.runtime.ComposerImpl r8 = r8.g(r9)
            r9 = r5 & 1
            if (r9 == 0) goto L23
            r9 = r4 | 6
            goto L33
        L23:
            r9 = r4 & 6
            if (r9 != 0) goto L32
            boolean r9 = r8.w(r1)
            if (r9 == 0) goto L2f
            r9 = 4
            goto L30
        L2f:
            r9 = 2
        L30:
            r9 = r9 | r4
            goto L33
        L32:
            r9 = r4
        L33:
            r0 = r4 & 48
            androidx.lifecycle.LifecycleOwner r2 = r7.f20196b
            if (r0 != 0) goto L49
            r0 = r5 & 2
            if (r0 != 0) goto L46
            boolean r0 = r8.w(r2)
            if (r0 == 0) goto L46
            r0 = 32
            goto L48
        L46:
            r0 = 16
        L48:
            r9 = r9 | r0
        L49:
            r0 = r5 & 4
            if (r0 == 0) goto L50
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L60
        L50:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L60
            boolean r0 = r8.w(r3)
            if (r0 == 0) goto L5d
            r0 = 256(0x100, float:3.59E-43)
            goto L5f
        L5d:
            r0 = 128(0x80, float:1.8E-43)
        L5f:
            r9 = r9 | r0
        L60:
            r0 = r9 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r0 != r6) goto L71
            boolean r0 = r8.i()
            if (r0 != 0) goto L6d
            goto L71
        L6d:
            r8.A()
            goto Lc5
        L71:
            r8.u0()
            r0 = r4 & 1
            if (r0 == 0) goto L89
            boolean r0 = r8.e0()
            if (r0 == 0) goto L7f
            goto L89
        L7f:
            r8.A()
            r0 = r5 & 2
            if (r0 == 0) goto L97
        L86:
            r9 = r9 & (-113(0xffffffffffffff8f, float:NaN))
            goto L97
        L89:
            r0 = r5 & 2
            if (r0 == 0) goto L97
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.f20226a
            java.lang.Object r0 = r8.K(r0)
            r2 = r0
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            goto L86
        L97:
            r8.W()
            boolean r0 = r8.I(r1)
            boolean r6 = r8.I(r2)
            r0 = r0 | r6
            java.lang.Object r6 = r8.u()
            if (r0 != 0) goto Lad
            androidx.compose.runtime.Composer$Companion$Empty$1 r0 = androidx.compose.runtime.Composer.Companion.f13690a
            if (r6 != r0) goto Lb9
        Lad:
            androidx.lifecycle.compose.LifecycleStartStopEffectScope r6 = new androidx.lifecycle.compose.LifecycleStartStopEffectScope
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            r6.<init>(r0)
            r8.o(r6)
        Lb9:
            androidx.lifecycle.compose.LifecycleStartStopEffectScope r6 = (androidx.lifecycle.compose.LifecycleStartStopEffectScope) r6
            int r0 = r9 >> 3
            r0 = r0 & 14
            r9 = r9 & 896(0x380, float:1.256E-42)
            r9 = r9 | r0
            androidx.lifecycle.compose.LifecycleEffectKt.b(r2, r6, r3, r8, r9)
        Lc5:
            androidx.compose.runtime.RecomposeScopeImpl r8 = r8.Z()
            if (r8 == 0) goto Ld3
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$1 r9 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8.d = r9
        Ld3:
            d0.b0 r8 = d0.b0.f30125a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
