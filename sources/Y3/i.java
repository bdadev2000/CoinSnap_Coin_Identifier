package Y3;

import Q7.AbstractC0255x;
import U4.y;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import p5.Q;

/* loaded from: classes2.dex */
public final class i implements ServiceConnection {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3775c;

    public /* synthetic */ i(Object obj, int i9) {
        this.b = i9;
        this.f3775c = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.b) {
            case 0:
                j jVar = (j) this.f3775c;
                jVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                jVar.a().post(new X3.e(this, iBinder));
                return;
            default:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                y yVar = (y) this.f3775c;
                sb.append(((LinkedBlockingDeque) yVar.f3335c).size());
                Log.d("SessionLifecycleClient", sb.toString());
                yVar.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) yVar.f3335c).drainTo(arrayList);
                AbstractC0255x.l(AbstractC0255x.a((w7.k) yVar.f3334a), null, null, new Q(yVar, arrayList, null), 3);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.b) {
            case 0:
                j jVar = (j) this.f3775c;
                jVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                jVar.a().post(new h(this, 1));
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                y yVar = (y) this.f3775c;
                yVar.b = null;
                yVar.getClass();
                return;
        }
    }
}
