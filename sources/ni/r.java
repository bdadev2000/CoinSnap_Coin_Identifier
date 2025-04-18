package ni;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class r extends s {

    /* renamed from: d, reason: collision with root package name */
    public final e f22864d;

    public r(r0 r0Var, wh.j jVar, l lVar, e eVar) {
        super(r0Var, jVar, lVar);
        this.f22864d = eVar;
    }

    @Override // ni.s
    public final Object a(b0 b0Var, Object[] objArr) {
        c cVar = (c) this.f22864d.adapt(b0Var);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.invokeOnCancellation(new u(cVar, 0));
            cVar.enqueue(new v(cancellableContinuationImpl, 0));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Exception e2) {
            return com.bumptech.glide.e.U(e2, continuation);
        }
    }
}
