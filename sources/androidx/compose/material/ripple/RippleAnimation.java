package androidx.compose.material.ripple;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.util.MathHelpersKt;
import b1.r1;
import b1.s;
import d0.b0;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RippleAnimation {

    /* renamed from: a, reason: collision with root package name */
    public Offset f7411a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7412b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7413c;
    public Float d;
    public Offset e;

    /* renamed from: f, reason: collision with root package name */
    public final Animatable f7414f = AnimatableKt.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public final Animatable f7415g = AnimatableKt.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public final Animatable f7416h = AnimatableKt.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public final s f7417i;

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7418j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7419k;

    /* JADX WARN: Type inference failed for: r1v3, types: [b1.r1, b1.s] */
    public RippleAnimation(Offset offset, float f2, boolean z2) {
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        this.f7411a = offset;
        this.f7412b = f2;
        this.f7413c = z2;
        ?? r1Var = new r1(true);
        r1Var.W(null);
        this.f7417i = r1Var;
        Boolean bool = Boolean.FALSE;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f7418j = f3;
        f4 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f7419k = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f7421b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            d0.b0 r3 = d0.b0.f30125a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.jvm.internal.q.m(r9)
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            androidx.compose.material.ripple.RippleAnimation r2 = r0.f7420a
            kotlin.jvm.internal.q.m(r9)
            goto L70
        L3e:
            androidx.compose.material.ripple.RippleAnimation r2 = r0.f7420a
            kotlin.jvm.internal.q.m(r9)
            goto L5c
        L44:
            kotlin.jvm.internal.q.m(r9)
            r0.f7420a = r8
            r0.d = r6
            androidx.compose.material.ripple.RippleAnimation$fadeIn$2 r9 = new androidx.compose.material.ripple.RippleAnimation$fadeIn$2
            r9.<init>(r8, r7)
            java.lang.Object r9 = p0.a.J(r9, r0)
            if (r9 != r1) goto L57
            goto L58
        L57:
            r9 = r3
        L58:
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r2 = r8
        L5c:
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = r2.f7418j
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r9.setValue(r6)
            r0.f7420a = r2
            r0.d = r5
            b1.s r9 = r2.f7417i
            java.lang.Object r9 = r9.t(r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            r0.f7420a = r7
            r0.d = r4
            r2.getClass()
            androidx.compose.material.ripple.RippleAnimation$fadeOut$2 r9 = new androidx.compose.material.ripple.RippleAnimation$fadeOut$2
            r9.<init>(r2, r7)
            java.lang.Object r9 = p0.a.J(r9, r0)
            if (r9 != r1) goto L83
            goto L84
        L83:
            r9 = r3
        L84:
            if (r9 != r1) goto L87
            return r1
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.a(h0.g):java.lang.Object");
    }

    public final void b(DrawScope drawScope, long j2) {
        if (this.d == null) {
            long b2 = drawScope.b();
            float f2 = RippleAnimationKt.f7435a;
            this.d = Float.valueOf(Math.max(Size.d(b2), Size.b(b2)) * 0.3f);
        }
        if (this.f7411a == null) {
            this.f7411a = new Offset(drawScope.F1());
        }
        if (this.e == null) {
            this.e = new Offset(OffsetKt.a(Size.d(drawScope.b()) / 2.0f, Size.b(drawScope.b()) / 2.0f));
        }
        float floatValue = (!((Boolean) this.f7419k.getValue()).booleanValue() || ((Boolean) this.f7418j.getValue()).booleanValue()) ? ((Number) this.f7414f.d()).floatValue() : 1.0f;
        Float f3 = this.d;
        p0.a.p(f3);
        float b3 = MathHelpersKt.b(f3.floatValue(), this.f7412b, ((Number) this.f7415g.d()).floatValue());
        Offset offset = this.f7411a;
        p0.a.p(offset);
        float g2 = Offset.g(offset.f14913a);
        Offset offset2 = this.e;
        p0.a.p(offset2);
        float g3 = Offset.g(offset2.f14913a);
        Animatable animatable = this.f7416h;
        float b4 = MathHelpersKt.b(g2, g3, ((Number) animatable.d()).floatValue());
        Offset offset3 = this.f7411a;
        p0.a.p(offset3);
        float h2 = Offset.h(offset3.f14913a);
        Offset offset4 = this.e;
        p0.a.p(offset4);
        long a2 = OffsetKt.a(b4, MathHelpersKt.b(h2, Offset.h(offset4.f14913a), ((Number) animatable.d()).floatValue()));
        long b5 = Color.b(j2, Color.d(j2) * floatValue);
        if (!this.f7413c) {
            drawScope.j1(b5, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : b3, (r19 & 4) != 0 ? drawScope.F1() : a2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
            return;
        }
        float d = Size.d(drawScope.b());
        float b6 = Size.b(drawScope.b());
        CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
        long b7 = A1.b();
        A1.a().p();
        A1.f15139a.b(0.0f, 0.0f, d, b6, 1);
        drawScope.j1(b5, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : b3, (r19 & 4) != 0 ? drawScope.F1() : a2, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
        d.A(A1, b7);
    }

    public final void c() {
        this.f7419k.setValue(Boolean.TRUE);
        this.f7417i.Z(b0.f30125a);
    }
}
