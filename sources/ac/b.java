package ac;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import db.s;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements db.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f427c;

    public /* synthetic */ b(s sVar, int i10) {
        this.f426b = i10;
        this.f427c = sVar;
    }

    @Override // db.d
    public final Object c(ob.c cVar) {
        int i10 = this.f426b;
        s sVar = this.f427c;
        switch (i10) {
            case 0:
                return new d((Context) cVar.b(Context.class), ((va.g) cVar.b(va.g.class)).d(), cVar.c(s.a(e.class)), cVar.d(kc.b.class), (Executor) cVar.e(sVar));
            case 1:
                return FirebaseMessagingRegistrar.a(sVar, cVar);
            default:
                return RemoteConfigRegistrar.a(sVar, cVar);
        }
    }
}
