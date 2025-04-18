package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1", f = "Recomposer.kt", l = {888}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f13957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MonotonicFrameClock f13959c;
    public final /* synthetic */ ProduceFrameSignal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(Recomposer recomposer, MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, g gVar) {
        super(2, gVar);
        this.f13958b = recomposer;
        this.f13959c = monotonicFrameClock;
        this.d = produceFrameSignal;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.f13958b, this.f13959c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f13957a;
        if (i2 == 0) {
            q.m(obj);
            this.f13957a = 1;
            if (Recomposer.z(this.f13958b, this.f13959c, this.d, this) == aVar) {
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
