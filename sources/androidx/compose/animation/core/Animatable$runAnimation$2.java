package androidx.compose.animation.core;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import h0.g;
import j0.e;
import j0.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {312}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public AnimationState f1990a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f1991b;

    /* renamed from: c, reason: collision with root package name */
    public int f1992c;
    public final /* synthetic */ Animatable d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Animation f1994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1995h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f1996i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animatable f1997a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnimationState f1998b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f1999c;
        public final /* synthetic */ b0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable animatable, AnimationState animationState, l lVar, b0 b0Var) {
            super(1);
            this.f1997a = animatable;
            this.f1998b = animationState;
            this.f1999c = lVar;
            this.d = b0Var;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            Animatable animatable = this.f1997a;
            SuspendAnimationKt.j(animationScope, animatable.f1983c);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.e;
            Object a2 = Animatable.a(animatable, parcelableSnapshotMutableState.getValue());
            boolean g2 = p0.a.g(a2, parcelableSnapshotMutableState.getValue());
            l lVar = this.f1999c;
            if (!g2) {
                animatable.f1983c.f2035b.setValue(a2);
                this.f1998b.f2035b.setValue(a2);
                if (lVar != null) {
                    lVar.invoke(animatable);
                }
                animationScope.a();
                this.d.f30919a = true;
            } else if (lVar != null) {
                lVar.invoke(animatable);
            }
            return d0.b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(Animatable animatable, Object obj, Animation animation, long j2, l lVar, g gVar) {
        super(1, gVar);
        this.d = animatable;
        this.f1993f = obj;
        this.f1994g = animation;
        this.f1995h = j2;
        this.f1996i = lVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new Animatable$runAnimation$2(this.d, this.f1993f, this.f1994g, this.f1995h, this.f1996i, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((g) obj)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        AnimationState animationState;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f1992c;
        Animatable animatable = this.d;
        try {
            if (i2 == 0) {
                q.m(obj);
                animatable.f1983c.f2036c = (AnimationVector) animatable.f1981a.a().invoke(this.f1993f);
                animatable.e.setValue(this.f1994g.g());
                animatable.d.setValue(Boolean.TRUE);
                AnimationState animationState2 = animatable.f1983c;
                AnimationState animationState3 = new AnimationState(animationState2.f2034a, animationState2.f2035b.getValue(), AnimationVectorsKt.a(animationState2.f2036c), animationState2.d, Long.MIN_VALUE, animationState2.f2038g);
                ?? obj2 = new Object();
                Animation animation = this.f1994g;
                long j2 = this.f1995h;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(animatable, animationState3, this.f1996i, obj2);
                this.f1990a = animationState3;
                this.f1991b = obj2;
                this.f1992c = 1;
                if (SuspendAnimationKt.b(animationState3, animation, j2, anonymousClass1, this) == aVar) {
                    return aVar;
                }
                b0Var = obj2;
                animationState = animationState3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = this.f1991b;
                animationState = this.f1990a;
                q.m(obj);
            }
            AnimationEndReason animationEndReason = b0Var.f30919a ? AnimationEndReason.f2022a : AnimationEndReason.f2023b;
            Animatable.b(animatable);
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            Animatable.b(animatable);
            throw e;
        }
    }
}
