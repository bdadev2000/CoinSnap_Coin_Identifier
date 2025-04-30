package Y3;

import J1.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f3776n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3777a;
    public final r b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3782g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f3783h;
    public i l;
    public IInterface m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3779d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3780e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f3781f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final g f3785j = new IBinder.DeathRecipient() { // from class: Y3.g
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            j jVar = j.this;
            jVar.b.a("reportBinderDeath", new Object[0]);
            o.v(jVar.f3784i.get());
            String str = jVar.f3778c;
            jVar.b.a("%s : Binder has died.", str);
            ArrayList arrayList = jVar.f3779d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                TaskCompletionSource taskCompletionSource = fVar.b;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            arrayList.clear();
            jVar.b();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f3786k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f3778c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f3784i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [Y3.g] */
    public j(Context context, r rVar, Intent intent) {
        this.f3777a = context;
        this.b = rVar;
        this.f3783h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f3776n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f3778c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3778c, 10);
                    handlerThread.start();
                    hashMap.put(this.f3778c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f3778c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f3781f) {
            try {
                Iterator it = this.f3780e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f3778c).concat(" : Binder has died.")));
                }
                this.f3780e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
