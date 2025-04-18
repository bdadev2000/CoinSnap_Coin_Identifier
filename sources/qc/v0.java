package qc;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes3.dex */
public final class v0 extends Handler {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public long f23886b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23887c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f23887c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.a) {
            c(messenger, wh.a0.v().b().a);
            return;
        }
        Object b3 = c6.c.n().b(w.class);
        Intrinsics.checkNotNullExpressionValue(b3, "Firebase.app[SessionDatastore::class.java]");
        p pVar = (p) ((g0) ((w) b3)).f23804c.get();
        if (pVar != null) {
            str = pVar.a;
        } else {
            str = null;
        }
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        String a;
        p0 v10 = wh.a0.v();
        int i10 = v10.f23856d + 1;
        v10.f23856d = i10;
        if (i10 == 0) {
            a = v10.f23855c;
        } else {
            a = v10.a();
        }
        String str = v10.f23855c;
        int i11 = v10.f23856d;
        ((a1) v10.a).getClass();
        v10.f23857e = new h0(a, str, i11, 1000 * System.currentTimeMillis());
        v10.b();
        Log.d("SessionLifecycleService", "Generated new session " + wh.a0.v().b().a);
        Log.d("SessionLifecycleService", "Broadcasting new session: " + wh.a0.v().b());
        Object b3 = c6.c.n().b(k0.class);
        Intrinsics.checkNotNullExpressionValue(b3, "Firebase.app[SessionFirelogPublisher::class.java]");
        h0 sessionDetails = wh.a0.v().b();
        n0 n0Var = (n0) ((k0) b3);
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(n0Var.f23851e), null, null, new l0(n0Var, sessionDetails, null), 3, null);
        Iterator it = new ArrayList(this.f23887c).iterator();
        while (it.hasNext()) {
            Messenger it2 = (Messenger) it.next();
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            a(it2);
        }
        Object b10 = c6.c.n().b(w.class);
        Intrinsics.checkNotNullExpressionValue(b10, "Firebase.app[SessionDatastore::class.java]");
        String sessionId = wh.a0.v().b().a;
        g0 g0Var = (g0) ((w) b10);
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(g0Var.f23803b), null, null, new f0(g0Var, sessionId, null), 3, null);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f23887c.remove(messenger);
        } catch (Exception e2) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        if (r5 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        if (r4 != false) goto L39;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.v0.handleMessage(android.os.Message):void");
    }
}
