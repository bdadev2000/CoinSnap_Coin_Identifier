package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.LazyListState$updateScrollDeltaForPostLookahead$2$1", f = "LazyListState.kt", l = {578}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyListState$updateScrollDeltaForPostLookahead$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$updateScrollDeltaForPostLookahead$2$1(LazyListState lazyListState, g gVar) {
        super(2, gVar);
        this.f4429b = lazyListState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyListState$updateScrollDeltaForPostLookahead$2$1(this.f4429b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListState$updateScrollDeltaForPostLookahead$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f4428a;
        if (i2 == 0) {
            q.m(obj);
            AnimationState animationState = this.f4429b.w;
            Float f2 = new Float(0.0f);
            SpringSpec c2 = AnimationSpecKt.c(0.0f, 400.0f, new Float(0.5f), 1);
            this.f4428a = 1;
            if (SuspendAnimationKt.g(animationState, f2, c2, true, null, this, 8) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
