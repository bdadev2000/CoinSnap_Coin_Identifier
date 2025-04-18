package y0;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n extends SuspendLambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f27802b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f27803c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27804d;

    /* renamed from: f, reason: collision with root package name */
    public Object f27805f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f27806g;

    /* renamed from: h, reason: collision with root package name */
    public int f27807h;

    /* renamed from: i, reason: collision with root package name */
    public int f27808i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f27809j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f27810k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u0 u0Var, o oVar, Continuation continuation) {
        super(1, continuation);
        this.f27809j = u0Var;
        this.f27810k = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new n(this.f27809j, this.f27810k, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
