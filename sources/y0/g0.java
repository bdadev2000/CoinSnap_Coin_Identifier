package y0;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Throwable f27737b;

    /* renamed from: c, reason: collision with root package name */
    public int f27738c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f27739d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f27740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f27741g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u0 u0Var, int i10, Continuation continuation) {
        super(2, continuation);
        this.f27740f = u0Var;
        this.f27741g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g0 g0Var = new g0(this.f27740f, this.f27741g, continuation);
        g0Var.f27739d = ((Boolean) obj).booleanValue();
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        boolean z10;
        Throwable th2;
        j1 j1Var;
        boolean z11;
        boolean z12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z13 = this.f27738c;
        u0 u0Var = this.f27740f;
        try {
        } catch (Throwable th3) {
            th = th3;
            if (z13 != 0) {
                i1 e2 = u0Var.e();
                this.f27737b = th;
                this.f27739d = z13;
                this.f27738c = 2;
                Integer a = e2.a();
                if (a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z10 = z13 ? 1 : 0;
                th2 = th;
                obj = a;
            } else {
                i10 = this.f27741g;
                z12 = z13;
            }
        }
        if (z13 != 0) {
            if (z13 != 1) {
                if (z13 == 2) {
                    z10 = this.f27739d;
                    th2 = this.f27737b;
                    ResultKt.throwOnFailure(obj);
                    boolean z14 = z10;
                    i10 = ((Number) obj).intValue();
                    th = th2;
                    z12 = z14;
                    j1Var = new y0(th, i10);
                    z11 = z12;
                    return TuplesKt.to(j1Var, Boxing.boxBoolean(z11));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z15 = this.f27739d;
            ResultKt.throwOnFailure(obj);
            z13 = z15;
        } else {
            ResultKt.throwOnFailure(obj);
            boolean z16 = this.f27739d;
            this.f27739d = z16;
            this.f27738c = 1;
            obj = u0.d(u0Var, z16, this);
            z13 = z16;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        j1Var = (j1) obj;
        z11 = z13;
        return TuplesKt.to(j1Var, Boxing.boxBoolean(z11));
    }
}
