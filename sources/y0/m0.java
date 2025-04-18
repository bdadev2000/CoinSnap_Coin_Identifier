package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m0 extends SuspendLambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f27795b;

    /* renamed from: c, reason: collision with root package name */
    public int f27796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27797d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f27798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f27799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u0 u0Var, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f27797d = u0Var;
        this.f27798f = coroutineContext;
        this.f27799g = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new m0(this.f27797d, this.f27798f, this.f27799g, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((m0) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f27796c
            y0.u0 r2 = r8.f27797d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r8.f27795b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L77
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f27795b
            y0.d r1 = (y0.d) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L51
        L29:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L39
        L2d:
            kotlin.ResultKt.throwOnFailure(r9)
            r8.f27796c = r5
            java.lang.Object r9 = y0.u0.d(r2, r5, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            r1 = r9
            y0.d r1 = (y0.d) r1
            y0.l0 r9 = new y0.l0
            kotlin.jvm.functions.Function2 r6 = r8.f27799g
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f27795b = r1
            r8.f27796c = r4
            kotlin.coroutines.CoroutineContext r4 = r8.f27798f
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r4, r9, r8)
            if (r9 != r0) goto L51
            return r0
        L51:
            java.lang.Object r4 = r1.f27701b
            r6 = 0
            if (r4 == 0) goto L5b
            int r4 = r4.hashCode()
            goto L5c
        L5b:
            r4 = r6
        L5c:
            int r7 = r1.f27702c
            if (r4 != r7) goto L61
            r6 = r5
        L61:
            if (r6 == 0) goto L79
            java.lang.Object r1 = r1.f27701b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r1 != 0) goto L78
            r8.f27795b = r9
            r8.f27796c = r3
            java.lang.Object r1 = r2.h(r9, r5, r8)
            if (r1 != r0) goto L76
            return r0
        L76:
            r0 = r9
        L77:
            r9 = r0
        L78:
            return r9
        L79:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
