package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import h0.g;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Animatable<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final TwoWayConverter f1981a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1982b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimationState f1983c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public final MutatorMutex f1984f;

    /* renamed from: g, reason: collision with root package name */
    public final SpringSpec f1985g;

    /* renamed from: h, reason: collision with root package name */
    public final AnimationVector f1986h;

    /* renamed from: i, reason: collision with root package name */
    public final AnimationVector f1987i;

    /* renamed from: j, reason: collision with root package name */
    public final AnimationVector f1988j;

    /* renamed from: k, reason: collision with root package name */
    public final AnimationVector f1989k;

    public Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        AnimationVector animationVector;
        AnimationVector animationVector2;
        this.f1981a = twoWayConverter;
        this.f1982b = obj2;
        AnimationState animationState = new AnimationState(twoWayConverter, obj, null, 60);
        this.f1983c = animationState;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.d = f2;
        f3 = SnapshotStateKt.f(obj, StructuralEqualityPolicy.f14078a);
        this.e = f3;
        this.f1984f = new MutatorMutex();
        this.f1985g = new SpringSpec(obj2, 3);
        AnimationVector animationVector3 = animationState.f2036c;
        boolean z2 = animationVector3 instanceof AnimationVector1D;
        if (z2) {
            animationVector = AnimatableKt.e;
        } else if (animationVector3 instanceof AnimationVector2D) {
            animationVector = AnimatableKt.f2006f;
        } else {
            animationVector = animationVector3 instanceof AnimationVector3D ? AnimatableKt.f2007g : AnimatableKt.f2008h;
        }
        this.f1986h = animationVector;
        if (z2) {
            animationVector2 = AnimatableKt.f2003a;
        } else if (animationVector3 instanceof AnimationVector2D) {
            animationVector2 = AnimatableKt.f2004b;
        } else {
            animationVector2 = animationVector3 instanceof AnimationVector3D ? AnimatableKt.f2005c : AnimatableKt.d;
        }
        this.f1987i = animationVector2;
        this.f1988j = animationVector;
        this.f1989k = animationVector2;
    }

    public static final Object a(Animatable animatable, Object obj) {
        AnimationVector animationVector = animatable.f1986h;
        AnimationVector animationVector2 = animatable.f1988j;
        boolean g2 = p0.a.g(animationVector2, animationVector);
        AnimationVector animationVector3 = animatable.f1989k;
        if (g2 && p0.a.g(animationVector3, animatable.f1987i)) {
            return obj;
        }
        TwoWayConverter twoWayConverter = animatable.f1981a;
        AnimationVector animationVector4 = (AnimationVector) twoWayConverter.a().invoke(obj);
        int b2 = animationVector4.b();
        boolean z2 = false;
        for (int i2 = 0; i2 < b2; i2++) {
            if (animationVector4.a(i2) < animationVector2.a(i2) || animationVector4.a(i2) > animationVector3.a(i2)) {
                animationVector4.e(p0.a.z(animationVector4.a(i2), animationVector2.a(i2), animationVector3.a(i2)), i2);
                z2 = true;
            }
        }
        return z2 ? twoWayConverter.b().invoke(animationVector4) : obj;
    }

    public static final void b(Animatable animatable) {
        AnimationState animationState = animatable.f1983c;
        animationState.f2036c.d();
        animationState.d = Long.MIN_VALUE;
        animatable.d.setValue(Boolean.FALSE);
    }

    public static Object c(Animatable animatable, Object obj, AnimationSpec animationSpec, Float f2, l lVar, g gVar, int i2) {
        AnimationSpec animationSpec2 = (i2 & 2) != 0 ? animatable.f1985g : animationSpec;
        Object invoke = (i2 & 4) != 0 ? animatable.f1981a.b().invoke(animatable.f1983c.f2036c) : f2;
        l lVar2 = (i2 & 8) != 0 ? null : lVar;
        Object d = animatable.d();
        TwoWayConverter twoWayConverter = animatable.f1981a;
        return MutatorMutex.b(animatable.f1984f, new Animatable$runAnimation$2(animatable, invoke, new TargetBasedAnimation(animationSpec2, twoWayConverter, d, obj, (AnimationVector) twoWayConverter.a().invoke(invoke)), animatable.f1983c.d, lVar2, null), gVar);
    }

    public final Object d() {
        return this.f1983c.f2035b.getValue();
    }

    public final Object e(Object obj, g gVar) {
        Object b2 = MutatorMutex.b(this.f1984f, new Animatable$snapTo$2(this, obj, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public final Object f(g gVar) {
        Object b2 = MutatorMutex.b(this.f1984f, new Animatable$stop$2(this, null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i2) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2);
    }
}
