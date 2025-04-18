package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

@e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(l lVar, g gVar) {
        super(1, gVar);
        this.f2094b = lVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f2094b, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f2093a;
        if (i2 == 0) {
            q.m(obj);
            this.f2093a = 1;
            obj = MonotonicFrameClockKt.a(getContext()).b0(this.f2094b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
