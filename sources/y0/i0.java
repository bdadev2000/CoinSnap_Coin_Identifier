package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Object f27762b;

    /* renamed from: c, reason: collision with root package name */
    public int f27763c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f27764d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f27765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u0 u0Var, int i10, Continuation continuation) {
        super(2, continuation);
        this.f27765f = u0Var;
        this.f27766g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i0 i0Var = new i0(this.f27765f, this.f27766g, continuation);
        i0Var.f27764d = ((Boolean) obj).booleanValue();
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f27763c
            y0.u0 r2 = r6.f27765f
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r6.f27762b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L47
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            boolean r1 = r6.f27764d
            kotlin.ResultKt.throwOnFailure(r7)
            goto L34
        L24:
            kotlin.ResultKt.throwOnFailure(r7)
            boolean r1 = r6.f27764d
            r6.f27764d = r1
            r6.f27763c = r4
            java.lang.Object r7 = r2.g(r6)
            if (r7 != r0) goto L34
            return r0
        L34:
            if (r1 == 0) goto L51
            y0.i1 r1 = r2.e()
            r6.f27762b = r7
            r6.f27763c = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L45
            return r0
        L45:
            r0 = r7
            r7 = r1
        L47:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r5 = r0
            r0 = r7
            r7 = r5
            goto L53
        L51:
            int r0 = r6.f27766g
        L53:
            y0.d r1 = new y0.d
            if (r7 == 0) goto L5c
            int r2 = r7.hashCode()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            r1.<init>(r2, r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
