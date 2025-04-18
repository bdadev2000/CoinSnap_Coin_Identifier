package qc;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class f0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f23796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f23796c = g0Var;
        this.f23797d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.f23796c, this.f23797d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23795b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                y yVar = g0.f23801e;
                Context context = this.f23796c.a;
                yVar.getClass();
                y0.j jVar = (y0.j) g0.f23802f.getValue(context, y.a[0]);
                e0 e0Var = new e0(this.f23797d, null);
                this.f23795b = 1;
                if (jVar.a(new c1.h(e0Var, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (IOException e2) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e2);
        }
        return Unit.INSTANCE;
    }
}
