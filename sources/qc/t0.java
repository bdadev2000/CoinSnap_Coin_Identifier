package qc;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class t0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f23877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f23878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.f23877c = u0Var;
        this.f23878d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t0(this.f23877c, this.f23878d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23876b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            rc.c cVar = rc.c.a;
            this.f23876b = 1;
            obj = cVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
        } else {
            Collection values = map.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((jb.i) it.next()).a.a()) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            } else {
                u0 u0Var = this.f23877c;
                List list = this.f23878d;
                for (Message message : CollectionsKt.sortedWith(CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(u0.a(u0Var, list, 2), u0.a(u0Var, list, 1))), new b0.g(5))) {
                    if (u0Var.f23882b != null) {
                        try {
                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                            Messenger messenger = u0Var.f23882b;
                            if (messenger != null) {
                                messenger.send(message);
                            }
                        } catch (RemoteException e2) {
                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
                            u0Var.b(message);
                        }
                    } else {
                        u0Var.b(message);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
