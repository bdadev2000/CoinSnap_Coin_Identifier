package p5;

import Q7.AbstractC0255x;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import g4.C2296f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class S extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22296a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22297c;

    public S(Looper looper) {
        super(looper);
        this.f22297c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f22296a) {
            Object b = C2296f.c().b(M.class);
            G7.j.d(b, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((M) b).b().f22258a);
            return;
        }
        Object b8 = C2296f.c().b(InterfaceC2569u.class);
        G7.j.d(b8, "Firebase.app[SessionDatastore::class.java]");
        C2563n c2563n = (C2563n) ((C2549D) ((InterfaceC2569u) b8)).f22256c.get();
        if (c2563n != null) {
            str = c2563n.f22352a;
        } else {
            str = null;
        }
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        String a6;
        Object b = C2296f.c().b(M.class);
        G7.j.d(b, "Firebase.app[SessionGenerator::class.java]");
        M m = (M) b;
        int i9 = m.f22283d + 1;
        m.f22283d = i9;
        if (i9 == 0) {
            a6 = m.f22282c;
        } else {
            a6 = m.a();
        }
        String str = a6;
        int i10 = m.f22283d;
        m.f22281a.getClass();
        m.f22284e = new E(str, m.f22282c, i10, 1000 * System.currentTimeMillis());
        m.b();
        StringBuilder sb = new StringBuilder("Generated new session ");
        Object b8 = C2296f.c().b(M.class);
        G7.j.d(b8, "Firebase.app[SessionGenerator::class.java]");
        sb.append(((M) b8).b().f22258a);
        Log.d("SessionLifecycleService", sb.toString());
        StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
        Object b9 = C2296f.c().b(M.class);
        G7.j.d(b9, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((M) b9).b());
        Log.d("SessionLifecycleService", sb2.toString());
        Object b10 = C2296f.c().b(H.class);
        G7.j.d(b10, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b11 = C2296f.c().b(M.class);
        G7.j.d(b11, "Firebase.app[SessionGenerator::class.java]");
        K k6 = (K) ((H) b10);
        AbstractC0255x.l(AbstractC0255x.a(k6.f22279e), null, null, new I(k6, ((M) b11).b(), null), 3);
        Iterator it = new ArrayList(this.f22297c).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            G7.j.d(messenger, "it");
            a(messenger);
        }
        Object b12 = C2296f.c().b(InterfaceC2569u.class);
        G7.j.d(b12, "Firebase.app[SessionDatastore::class.java]");
        Object b13 = C2296f.c().b(M.class);
        G7.j.d(b13, "Firebase.app[SessionGenerator::class.java]");
        C2549D c2549d = (C2549D) ((InterfaceC2569u) b12);
        String str2 = ((M) b13).b().f22258a;
        G7.j.e(str2, "sessionId");
        AbstractC0255x.l(AbstractC0255x.a(c2549d.b), null, null, new C2548C(c2549d, str2, null), 3);
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
            this.f22297c.remove(messenger);
        } catch (Exception e4) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
    
        if ((!P7.a.d(r8)) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        if ((!P7.a.d(r8)) != false) goto L33;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.S.handleMessage(android.os.Message):void");
    }
}
