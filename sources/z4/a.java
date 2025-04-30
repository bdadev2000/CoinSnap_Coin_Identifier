package Z4;

import M0.C0219j;
import N4.b;
import O4.e;
import U4.y;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import g4.C2296f;
import r7.InterfaceC2683c;
import s7.InterfaceC2701a;

/* loaded from: classes2.dex */
public final class a implements InterfaceC2683c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3880a;
    public final Object b;

    public /* synthetic */ a(Object obj, int i9) {
        this.f3880a = i9;
        this.b = obj;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        switch (this.f3880a) {
            case 0:
                ((y) this.b).getClass();
                Y4.a e4 = Y4.a.e();
                C0219j.i(e4);
                return e4;
            case 1:
                C2296f c2296f = (C2296f) ((y) this.b).f3334a;
                C0219j.i(c2296f);
                return c2296f;
            case 2:
                e eVar = (e) ((y) this.b).b;
                C0219j.i(eVar);
                return eVar;
            case 3:
                b bVar = (b) ((y) this.b).f3335c;
                C0219j.i(bVar);
                return bVar;
            case 4:
                ((y) this.b).getClass();
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                C0219j.i(remoteConfigManager);
                return remoteConfigManager;
            case 5:
                ((y) this.b).getClass();
                SessionManager sessionManager = SessionManager.getInstance();
                C0219j.i(sessionManager);
                return sessionManager;
            case 6:
                b bVar2 = (b) ((y) this.b).f3336d;
                C0219j.i(bVar2);
                return bVar2;
            default:
                return ((InterfaceC2701a) this.b).get();
        }
    }
}
