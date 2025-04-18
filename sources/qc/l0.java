package qc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class l0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public s f23826b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f23827c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f23828d;

    /* renamed from: f, reason: collision with root package name */
    public va.g f23829f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f23830g;

    /* renamed from: h, reason: collision with root package name */
    public sc.l f23831h;

    /* renamed from: i, reason: collision with root package name */
    public int f23832i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n0 f23833j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f23834k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.f23833j = n0Var;
        this.f23834k = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l0(this.f23833j, this.f23834k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
