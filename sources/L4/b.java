package L4;

import U4.p;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import g4.C2296f;
import j5.C2399b;
import java.util.concurrent.Executor;
import k5.k;
import o4.InterfaceC2498d;
import o4.q;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC2498d {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f1807c;

    public /* synthetic */ b(q qVar, int i9) {
        this.b = i9;
        this.f1807c = qVar;
    }

    @Override // o4.InterfaceC2498d
    public final Object f(p pVar) {
        W4.a lambda$getComponents$0;
        k lambda$getComponents$02;
        switch (this.b) {
            case 0:
                return new e((Context) pVar.b(Context.class), ((C2296f) pVar.b(C2296f.class)).d(), pVar.a(q.a(f.class)), pVar.c(C2399b.class), (Executor) pVar.f(this.f1807c));
            case 1:
                return FirebaseMessagingRegistrar.a(this.f1807c, pVar);
            case 2:
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(this.f1807c, pVar);
                return lambda$getComponents$0;
            default:
                lambda$getComponents$02 = RemoteConfigRegistrar.lambda$getComponents$0(this.f1807c, pVar);
                return lambda$getComponents$02;
        }
    }
}
