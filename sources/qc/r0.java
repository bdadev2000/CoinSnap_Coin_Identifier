package qc;

import android.util.Log;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class r0 extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(String str, Continuation continuation) {
        super(2, continuation);
        this.f23869c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r0(this.f23869c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f23868b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            rc.c cVar = rc.c.a;
            this.f23868b = 1;
            obj = cVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Collection<jb.i> values = ((Map) obj).values();
        String str = this.f23869c;
        for (jb.i iVar : values) {
            rc.e eVar = new rc.e(str);
            iVar.getClass();
            b6.a.f2288f.d("App Quality Sessions session changed: " + eVar, null);
            jb.h hVar = iVar.f19894b;
            String str2 = eVar.a;
            synchronized (hVar) {
                if (!Objects.equals(hVar.f19893c, str2)) {
                    ob.c cVar2 = hVar.a;
                    String str3 = hVar.f19892b;
                    if (str3 != null && str2 != null) {
                        try {
                            cVar2.o(str3, "aqs.".concat(str2)).createNewFile();
                        } catch (IOException e2) {
                            b6.a.f2288f.i("Failed to persist App Quality Sessions session id.", e2);
                        }
                    }
                    hVar.f19893c = str2;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + rc.d.CRASHLYTICS + " of new session " + str);
        }
        return Unit.INSTANCE;
    }
}
