package ni;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class q extends s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22839d;

    /* renamed from: e, reason: collision with root package name */
    public final e f22840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r0 r0Var, wh.j jVar, l lVar, e eVar, int i10) {
        super(r0Var, jVar, lVar);
        this.f22839d = i10;
        this.f22840e = eVar;
    }

    @Override // ni.s
    public final Object a(b0 b0Var, Object[] objArr) {
        int i10 = this.f22839d;
        e eVar = this.f22840e;
        switch (i10) {
            case 0:
                return eVar.adapt(b0Var);
            default:
                c cVar = (c) eVar.adapt(b0Var);
                Continuation continuation = (Continuation) objArr[objArr.length - 1];
                try {
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                    cancellableContinuationImpl.invokeOnCancellation(new u(cVar, 2));
                    cVar.enqueue(new v(cancellableContinuationImpl, 2));
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                        return result;
                    }
                    return result;
                } catch (Exception e2) {
                    return com.bumptech.glide.e.U(e2, continuation);
                }
        }
    }
}
