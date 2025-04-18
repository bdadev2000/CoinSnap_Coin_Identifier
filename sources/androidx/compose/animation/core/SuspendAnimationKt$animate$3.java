package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SuspendAnimationKt$animate$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoWayConverter f2239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(p pVar) {
        super(1);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        this.f2238a = pVar;
        this.f2239b = twoWayConverter;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        this.f2238a.invoke(animationScope.e.getValue(), this.f2239b.b().invoke(animationScope.f2030f));
        return b0.f30125a;
    }
}
