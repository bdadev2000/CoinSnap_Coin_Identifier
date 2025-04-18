package qc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f23843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f23844d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0 f23845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, CoroutineContext coroutineContext, w0 w0Var, Continuation continuation) {
        super(2, continuation);
        this.f23843c = oVar;
        this.f23844d = coroutineContext;
        this.f23845f = w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f23843c, this.f23844d, this.f23845f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
