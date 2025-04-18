package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import d0.b0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.TypeReference;

@j0.e(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {TypeReference.RESOURCE_VARIABLE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends j0.i implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public int f16515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.l f16516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(q0.l lVar, h0.g gVar) {
        super(1, gVar);
        this.f16516b = lVar;
    }

    @Override // j0.a
    public final h0.g create(h0.g gVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f16516b, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create((h0.g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16515a;
        if (i2 == 0) {
            q.m(obj);
            this.f16515a = 1;
            obj = MonotonicFrameClockKt.a(getContext()).b0(this.f16516b, this);
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
