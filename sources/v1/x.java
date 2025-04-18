package v1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import qc.t0;
import qc.u0;

/* loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25958c;

    public /* synthetic */ x(Object obj, int i10) {
        this.f25957b = i10;
        this.f25958c = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        p pVar = null;
        int i10 = this.f25957b;
        Object obj = this.f25958c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                y yVar = (y) obj;
                int i11 = z.f25969c;
                if (service != null) {
                    IInterface queryLocalInterface = service.queryLocalInterface(p.f25929i8);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof p)) {
                        pVar = (p) queryLocalInterface;
                    } else {
                        pVar = new o(service);
                    }
                }
                yVar.f25964g = pVar;
                yVar.f25960c.execute(yVar.f25967j);
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                u0 u0Var = (u0) obj;
                sb2.append(u0Var.f23883c.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                u0Var.f23882b = new Messenger(service);
                ArrayList arrayList = new ArrayList();
                u0Var.f23883c.drainTo(arrayList);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(u0Var.a), null, null, new t0(u0Var, arrayList, null), 3, null);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        int i10 = this.f25957b;
        Object obj = this.f25958c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(name, "name");
                y yVar = (y) obj;
                yVar.f25960c.execute(yVar.f25968k);
                yVar.f25964g = null;
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ((u0) obj).f23882b = null;
                return;
        }
    }
}
