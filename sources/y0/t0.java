package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class t0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.IntRef f27842b;

    /* renamed from: c, reason: collision with root package name */
    public int f27843c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27844d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f27845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f27846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f27847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f27848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Ref.IntRef intRef, u0 u0Var, Object obj, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f27845f = intRef;
        this.f27846g = u0Var;
        this.f27847h = obj;
        this.f27848i = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t0 t0Var = new t0(this.f27845f, this.f27846g, this.f27847h, this.f27848i, continuation);
        t0Var.f27844d = obj;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((a1.j) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f27843c
            java.lang.Object r2 = r7.f27847h
            y0.u0 r3 = r7.f27846g
            kotlin.jvm.internal.Ref$IntRef r4 = r7.f27845f
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.jvm.internal.Ref$IntRef r1 = r7.f27842b
            java.lang.Object r6 = r7.f27844d
            a1.j r6 = (a1.j) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4f
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f27844d
            a1.j r8 = (a1.j) r8
            y0.i1 r1 = r3.e()
            r7.f27844d = r8
            r7.f27842b = r4
            r7.f27843c = r6
            fb.c r1 = r1.f27767b
            java.lang.Object r1 = r1.f17773c
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            r6 = r8
            r8 = r1
            r1 = r4
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.element = r8
            r8 = 0
            r7.f27844d = r8
            r7.f27842b = r8
            r7.f27843c = r5
            java.lang.Object r8 = r6.b(r2, r7)
            if (r8 != r0) goto L65
            return r0
        L65:
            boolean r8 = r7.f27848i
            if (r8 == 0) goto L7d
            kc.c r8 = r3.f27856g
            y0.d r0 = new y0.d
            if (r2 == 0) goto L74
            int r1 = r2.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r3 = r4.element
            r0.<init>(r1, r3, r2)
            r8.v(r0)
        L7d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
