package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import p0.a;
import q0.b;
import q0.c;
import q0.f;
import q0.g;
import q0.h;
import q0.i;
import q0.j;
import q0.k;
import q0.m;
import q0.n;
import q0.p;
import q0.q;
import q0.s;
import q0.t;
import q0.u;
import q0.v;
import q0.w;

@Stable
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl implements ComposableLambda {

    /* renamed from: a, reason: collision with root package name */
    public final int f14280a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14281b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14282c;
    public RecomposeScope d;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f14283f;

    public ComposableLambdaImpl(int i2, r rVar, boolean z2) {
        this.f14280a = i2;
        this.f14281b = z2;
        this.f14282c = rVar;
    }

    public final Object A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 11) : ComposableLambdaKt.a(1, 11);
        Object obj12 = this.f14282c;
        a.q(obj12, "null cannot be cast to non-null type kotlin.Function14<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(14, obj12);
        Object d = ((f) obj12).d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$11(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, i2, i3);
        }
        return d;
    }

    public final Object B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 12) : ComposableLambdaKt.a(1, 12);
        Object obj13 = this.f14282c;
        a.q(obj13, "null cannot be cast to non-null type kotlin.Function15<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(15, obj13);
        Object r2 = ((g) obj13).r(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$12(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, i2, i3);
        }
        return r2;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 13) : ComposableLambdaKt.a(1, 13);
        Object obj14 = this.f14282c;
        a.q(obj14, "null cannot be cast to non-null type kotlin.Function16<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(16, obj14);
        Object p2 = ((h) obj14).p(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$13(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, i2, i3);
        }
        return p2;
    }

    public final Object D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 14) : ComposableLambdaKt.a(1, 14);
        Object obj15 = this.f14282c;
        a.q(obj15, "null cannot be cast to non-null type kotlin.Function17<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(17, obj15);
        Object u2 = ((i) obj15).u(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$14(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, i2, i3);
        }
        return u2;
    }

    public final Object E(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 15) : ComposableLambdaKt.a(1, 15);
        Object obj16 = this.f14282c;
        a.q(obj16, "null cannot be cast to non-null type kotlin.Function18<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(18, obj16);
        Object g3 = ((j) obj16).g(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$15(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, i2, i3);
        }
        return g3;
    }

    public final Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 16) : ComposableLambdaKt.a(1, 16);
        Object obj17 = this.f14282c;
        a.q(obj17, "null cannot be cast to non-null type kotlin.Function19<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(19, obj17);
        Object o2 = ((k) obj17).o(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$16(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, i2, i3);
        }
        return o2;
    }

    public final Object G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 17) : ComposableLambdaKt.a(1, 17);
        Object obj18 = this.f14282c;
        a.q(obj18, "null cannot be cast to non-null type kotlin.Function20<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(20, obj18);
        Object j2 = ((m) obj18).j(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$17(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, i2, i3);
        }
        return j2;
    }

    public final Object H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 18) : ComposableLambdaKt.a(1, 18);
        Object obj19 = this.f14282c;
        a.q(obj19, "null cannot be cast to non-null type kotlin.Function21<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'p11')] kotlin.Any?, @[ParameterName(name = 'p12')] kotlin.Any?, @[ParameterName(name = 'p13')] kotlin.Any?, @[ParameterName(name = 'p14')] kotlin.Any?, @[ParameterName(name = 'p15')] kotlin.Any?, @[ParameterName(name = 'p16')] kotlin.Any?, @[ParameterName(name = 'p17')] kotlin.Any?, @[ParameterName(name = 'p18')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(21, obj19);
        Object e = ((n) obj19).e(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$18(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, i2, i3);
        }
        return e;
    }

    public final void I(Composer composer) {
        RecomposeScopeImpl r2;
        if (!this.f14281b || (r2 = composer.r()) == null) {
            return;
        }
        composer.C(r2);
        if (ComposableLambdaKt.d(this.d, r2)) {
            this.d = r2;
            return;
        }
        ArrayList arrayList = this.f14283f;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f14283f = arrayList2;
            arrayList2.add(r2);
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (ComposableLambdaKt.d((RecomposeScope) arrayList.get(i2), r2)) {
                arrayList.set(i2, r2);
                return;
            }
        }
        arrayList.add(r2);
    }

    public final void J(r rVar) {
        if (a.g(this.f14282c, rVar)) {
            return;
        }
        boolean z2 = this.f14282c == null;
        this.f14282c = rVar;
        if (z2 || !this.f14281b) {
            return;
        }
        RecomposeScope recomposeScope = this.d;
        if (recomposeScope != null) {
            recomposeScope.invalidate();
            this.d = null;
        }
        ArrayList arrayList = this.f14283f;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((RecomposeScope) arrayList.get(i2)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // q0.e
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, Integer num, Integer num2) {
        return z(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, num.intValue(), num2.intValue());
    }

    public final Object b(Object obj, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 1) : ComposableLambdaKt.a(1, 1);
        Object obj2 = this.f14282c;
        a.q(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(3, obj2);
        Object invoke = ((q) obj2).invoke(obj, g2, Integer.valueOf(a2 | i2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$1(this, obj, i2);
        }
        return invoke;
    }

    public final Object c(Object obj, Object obj2, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 2) : ComposableLambdaKt.a(1, 2);
        Object obj3 = this.f14282c;
        a.q(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(4, obj3);
        Object invoke = ((q0.r) obj3).invoke(obj, obj2, g2, Integer.valueOf(a2 | i2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$2(this, obj, obj2, i2);
        }
        return invoke;
    }

    @Override // q0.f
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Composer composer, Integer num, Integer num2) {
        return A(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.n
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Composer composer, Integer num, Integer num2) {
        return H(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.t
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return n(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // q0.j
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Composer composer, Integer num, Integer num2) {
        return E(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.v
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, Integer num) {
        return v(obj, obj2, obj3, obj4, obj5, obj6, composer, num.intValue());
    }

    @Override // q0.w
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, Integer num) {
        return w(obj, obj2, obj3, obj4, obj5, obj6, obj7, composer, num.intValue());
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int a2;
        int intValue = ((Number) obj2).intValue();
        ComposerImpl g2 = ((Composer) obj).g(this.f14280a);
        I(g2);
        if (g2.I(this)) {
            a2 = ComposableLambdaKt.a(2, 0);
        } else {
            a2 = ComposableLambdaKt.a(1, 0);
        }
        int i2 = intValue | a2;
        Object obj3 = this.f14282c;
        a.q(obj3, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(2, obj3);
        Object invoke = ((p) obj3).invoke(g2, Integer.valueOf(i2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            e.g(2, this);
            Z.d = this;
        }
        return invoke;
    }

    @Override // q0.m
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Composer composer, Integer num, Integer num2) {
        return G(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.s
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return m(obj, obj2, obj3, composer, num.intValue());
    }

    @Override // q0.u
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, Integer num) {
        return q(obj, obj2, obj3, obj4, obj5, composer, num.intValue());
    }

    public final Object m(Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 3) : ComposableLambdaKt.a(1, 3);
        Object obj4 = this.f14282c;
        a.q(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(5, obj4);
        Object k2 = ((s) obj4).k(obj, obj2, obj3, g2, Integer.valueOf(a2 | i2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$3(this, obj, obj2, obj3, i2);
        }
        return k2;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 4) : ComposableLambdaKt.a(1, 4);
        Object obj5 = this.f14282c;
        a.q(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(6, obj5);
        Object f2 = ((t) obj5).f(obj, obj2, obj3, obj4, g2, Integer.valueOf(a2 | i2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$4(this, obj, obj2, obj3, obj4, i2);
        }
        return f2;
    }

    @Override // q0.k
    public final /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Composer composer, Integer num, Integer num2) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.h
    public final /* bridge */ /* synthetic */ Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Composer composer, Integer num, Integer num2) {
        return C(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, composer, num.intValue(), num2.intValue());
    }

    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 5) : ComposableLambdaKt.a(1, 5);
        Object obj6 = this.f14282c;
        a.q(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(7, obj6);
        Object l2 = ((u) obj6).l(obj, obj2, obj3, obj4, obj5, g2, Integer.valueOf(i2 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$5(this, obj, obj2, obj3, obj4, obj5, i2);
        }
        return l2;
    }

    @Override // q0.g
    public final /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Composer composer, Integer num, Integer num2) {
        return B(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, composer, num.intValue(), num2.intValue());
    }

    @Override // q0.b
    public final /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, Integer num) {
        return x(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, composer, num.intValue());
    }

    @Override // q0.c
    public final /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, Integer num) {
        return y(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, composer, num.intValue());
    }

    @Override // q0.i
    public final /* bridge */ /* synthetic */ Object u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Composer composer, Integer num, Integer num2) {
        return D(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, composer, num.intValue(), num2.intValue());
    }

    public final Object v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 6) : ComposableLambdaKt.a(1, 6);
        Object obj7 = this.f14282c;
        a.q(obj7, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(8, obj7);
        Object h2 = ((v) obj7).h(obj, obj2, obj3, obj4, obj5, obj6, g2, Integer.valueOf(i2 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$6(this, obj, obj2, obj3, obj4, obj5, obj6, i2);
        }
        return h2;
    }

    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 7) : ComposableLambdaKt.a(1, 7);
        Object obj8 = this.f14282c;
        a.q(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(9, obj8);
        Object i3 = ((w) obj8).i(obj, obj2, obj3, obj4, obj5, obj6, obj7, g2, Integer.valueOf(i2 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$7(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i2);
        }
        return i3;
    }

    public final Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 8) : ComposableLambdaKt.a(1, 8);
        Object obj9 = this.f14282c;
        a.q(obj9, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(10, obj9);
        Object s2 = ((b) obj9).s(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, g2, Integer.valueOf(i2 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$8(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i2);
        }
        return s2;
    }

    public final Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 9) : ComposableLambdaKt.a(1, 9);
        Object obj10 = this.f14282c;
        a.q(obj10, "null cannot be cast to non-null type kotlin.Function11<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        e.g(11, obj10);
        Object t2 = ((c) obj10).t(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, g2, Integer.valueOf(i2 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$9(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, i2);
        }
        return t2;
    }

    public final Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(this.f14280a);
        I(g2);
        int a2 = g2.I(this) ? ComposableLambdaKt.a(2, 10) : ComposableLambdaKt.a(1, 10);
        Object obj11 = this.f14282c;
        a.q(obj11, "null cannot be cast to non-null type kotlin.Function13<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'p8')] kotlin.Any?, @[ParameterName(name = 'p9')] kotlin.Any?, @[ParameterName(name = 'p10')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, @[ParameterName(name = 'changed1')] kotlin.Int, kotlin.Any?>");
        e.g(13, obj11);
        Object a3 = ((q0.e) obj11).a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, g2, Integer.valueOf(i2), Integer.valueOf(i3 | a2));
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposableLambdaImpl$invoke$10(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, i2);
        }
        return a3;
    }

    @Override // q0.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Override // q0.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }
}
