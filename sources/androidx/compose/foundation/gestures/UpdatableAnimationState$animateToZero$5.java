package androidx.compose.foundation.gestures;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UpdatableAnimationState$animateToZero$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpdatableAnimationState f3670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3671b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$5(UpdatableAnimationState updatableAnimationState, l lVar) {
        super(1);
        this.f3670a = updatableAnimationState;
        this.f3671b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        UpdatableAnimationState updatableAnimationState = this.f3670a;
        float f2 = updatableAnimationState.e;
        updatableAnimationState.e = 0.0f;
        this.f3671b.invoke(Float.valueOf(f2));
        return b0.f30125a;
    }
}
