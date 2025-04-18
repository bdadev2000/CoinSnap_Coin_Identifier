package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class c0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public j1 f27694b;

    /* renamed from: c, reason: collision with root package name */
    public int f27695c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27696d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f27697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(u0 u0Var, Continuation continuation) {
        super(2, continuation);
        this.f27697f = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c0 c0Var = new c0(this.f27697f, continuation);
        c0Var.f27696d = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f27695c
            y0.u0 r2 = r9.f27697f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.ResultKt.throwOnFailure(r10)
            goto Laa
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            y0.j1 r1 = r9.f27694b
            java.lang.Object r4 = r9.f27696d
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L6e
        L2b:
            java.lang.Object r1 = r9.f27696d
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L54
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f27696d
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            r9.f27696d = r10
            r9.f27695c = r5
            kotlinx.coroutines.CoroutineScope r1 = r2.f27852c
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            y0.k0 r5 = new y0.k0
            r7 = 0
            r5.<init>(r2, r7, r6)
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r5, r9)
            if (r1 != r0) goto L51
            return r0
        L51:
            r8 = r1
            r1 = r10
            r10 = r8
        L54:
            y0.j1 r10 = (y0.j1) r10
            boolean r5 = r10 instanceof y0.d
            if (r5 == 0) goto L71
            r5 = r10
            y0.d r5 = (y0.d) r5
            java.lang.Object r5 = r5.f27701b
            r9.f27696d = r1
            r9.f27694b = r10
            r9.f27695c = r4
            java.lang.Object r4 = r1.emit(r5, r9)
            if (r4 != r0) goto L6c
            return r0
        L6c:
            r4 = r1
            r1 = r10
        L6e:
            r10 = r1
            r1 = r4
            goto L80
        L71:
            boolean r4 = r10 instanceof y0.n1
            if (r4 != 0) goto Lb2
            boolean r4 = r10 instanceof y0.y0
            if (r4 != 0) goto Lad
            boolean r4 = r10 instanceof y0.v0
            if (r4 == 0) goto L80
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L80:
            kc.c r2 = r2.f27856g
            java.lang.Object r2 = r2.f20640c
            kotlinx.coroutines.flow.MutableStateFlow r2 = (kotlinx.coroutines.flow.MutableStateFlow) r2
            y0.y r4 = new y0.y
            r4.<init>(r6)
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.takeWhile(r2, r4)
            y0.z r4 = new y0.z
            r4.<init>(r10, r6)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.dropWhile(r2, r4)
            y0.b0 r2 = new y0.b0
            r2.<init>(r10)
            r9.f27696d = r6
            r9.f27694b = r6
            r9.f27695c = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r2, r9)
            if (r10 != r0) goto Laa
            return r0
        Laa:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        Lad:
            y0.y0 r10 = (y0.y0) r10
            java.lang.Throwable r10 = r10.f27877b
            throw r10
        Lb2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
