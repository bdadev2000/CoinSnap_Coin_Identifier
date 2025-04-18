package androidx.compose.ui.platform;

import b1.d0;
import d0.b0;
import e1.g1;
import kotlin.jvm.internal.q;

@j0.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f16675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MotionDurationScaleImpl f16676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(g1 g1Var, MotionDurationScaleImpl motionDurationScaleImpl, h0.g gVar) {
        super(2, gVar);
        this.f16675b = g1Var;
        this.f16676c = motionDurationScaleImpl;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.f16675b, this.f16676c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16674a;
        if (i2 == 0) {
            q.m(obj);
            final MotionDurationScaleImpl motionDurationScaleImpl = this.f16676c;
            e1.i iVar = new e1.i() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // e1.i
                public final Object emit(Object obj2, h0.g gVar) {
                    MotionDurationScaleImpl.this.f16531a.n(((Number) obj2).floatValue());
                    return b0.f30125a;
                }
            };
            this.f16674a = 1;
            if (this.f16675b.collect(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        throw new RuntimeException();
    }
}
