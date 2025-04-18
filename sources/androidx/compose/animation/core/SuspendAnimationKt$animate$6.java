package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SuspendAnimationKt$animate$6 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animation f2247c;
    public final /* synthetic */ AnimationVector d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AnimationState f2248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f2249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f2250h;

    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnimationState f2251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnimationState animationState) {
            super(0);
            this.f2251a = animationState;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f2251a.f2038g = false;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$6(f0 f0Var, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f2, l lVar) {
        super(1);
        this.f2245a = f0Var;
        this.f2246b = obj;
        this.f2247c = animation;
        this.d = animationVector;
        this.f2248f = animationState;
        this.f2249g = f2;
        this.f2250h = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f2246b;
        Animation animation = this.f2247c;
        AnimationScope animationScope = new AnimationScope(obj2, animation.e(), this.d, longValue, animation.g(), longValue, new AnonymousClass1(this.f2248f));
        SuspendAnimationKt.h(animationScope, longValue, this.f2249g, this.f2247c, this.f2248f, this.f2250h);
        this.f2245a.f30930a = animationScope;
        return b0.f30125a;
    }
}
