package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class MultiInstanceInvalidationClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f21296a;

    /* renamed from: b, reason: collision with root package name */
    public final InvalidationTracker f21297b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f21298c;
    public final Context d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final InvalidationTracker.Observer f21299f;

    /* renamed from: g, reason: collision with root package name */
    public IMultiInstanceInvalidationService f21300g;

    /* renamed from: h, reason: collision with root package name */
    public final MultiInstanceInvalidationClient$callback$1 f21301h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f21302i;

    /* renamed from: j, reason: collision with root package name */
    public final MultiInstanceInvalidationClient$serviceConnection$1 f21303j;

    /* renamed from: k, reason: collision with root package name */
    public final a f21304k;

    /* renamed from: l, reason: collision with root package name */
    public final a f21305l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.room.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.room.a] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.room.MultiInstanceInvalidationClient$serviceConnection$1, android.content.ServiceConnection] */
    public MultiInstanceInvalidationClient(Context context, String str, Intent intent, InvalidationTracker invalidationTracker, Executor executor) {
        p0.a.s(executor, "executor");
        this.f21296a = str;
        this.f21297b = invalidationTracker;
        this.f21298c = executor;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.f21301h = new MultiInstanceInvalidationClient$callback$1(this);
        final int i2 = 0;
        this.f21302i = new AtomicBoolean(false);
        ?? r4 = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, androidx.room.IMultiInstanceInvalidationService$Stub$Proxy] */
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService;
                p0.a.s(componentName, "name");
                p0.a.s(iBinder, "service");
                int i3 = IMultiInstanceInvalidationService.Stub.f21270a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface(IMultiInstanceInvalidationService.m8);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationService)) {
                    ?? obj = new Object();
                    obj.f21271a = iBinder;
                    iMultiInstanceInvalidationService = obj;
                } else {
                    iMultiInstanceInvalidationService = (IMultiInstanceInvalidationService) queryLocalInterface;
                }
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient.f21300g = iMultiInstanceInvalidationService;
                multiInstanceInvalidationClient.f21298c.execute(multiInstanceInvalidationClient.f21304k);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                p0.a.s(componentName, "name");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient.f21298c.execute(multiInstanceInvalidationClient.f21305l);
                multiInstanceInvalidationClient.f21300g = null;
            }
        };
        this.f21303j = r4;
        this.f21304k = new Runnable(this) { // from class: androidx.room.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiInstanceInvalidationClient f21397b;

            {
                this.f21397b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f21397b;
                switch (i3) {
                    case 0:
                        p0.a.s(multiInstanceInvalidationClient, "this$0");
                        try {
                            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f21300g;
                            if (iMultiInstanceInvalidationService != null) {
                                multiInstanceInvalidationClient.e = iMultiInstanceInvalidationService.B(multiInstanceInvalidationClient.f21301h, multiInstanceInvalidationClient.f21296a);
                                InvalidationTracker invalidationTracker2 = multiInstanceInvalidationClient.f21297b;
                                InvalidationTracker.Observer observer = multiInstanceInvalidationClient.f21299f;
                                if (observer != null) {
                                    invalidationTracker2.a(observer);
                                    return;
                                } else {
                                    p0.a.B0("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                            return;
                        }
                    default:
                        p0.a.s(multiInstanceInvalidationClient, "this$0");
                        InvalidationTracker.Observer observer2 = multiInstanceInvalidationClient.f21299f;
                        if (observer2 != null) {
                            multiInstanceInvalidationClient.f21297b.c(observer2);
                            return;
                        } else {
                            p0.a.B0("observer");
                            throw null;
                        }
                }
            }
        };
        final int i3 = 1;
        this.f21305l = new Runnable(this) { // from class: androidx.room.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultiInstanceInvalidationClient f21397b;

            {
                this.f21397b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f21397b;
                switch (i32) {
                    case 0:
                        p0.a.s(multiInstanceInvalidationClient, "this$0");
                        try {
                            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f21300g;
                            if (iMultiInstanceInvalidationService != null) {
                                multiInstanceInvalidationClient.e = iMultiInstanceInvalidationService.B(multiInstanceInvalidationClient.f21301h, multiInstanceInvalidationClient.f21296a);
                                InvalidationTracker invalidationTracker2 = multiInstanceInvalidationClient.f21297b;
                                InvalidationTracker.Observer observer = multiInstanceInvalidationClient.f21299f;
                                if (observer != null) {
                                    invalidationTracker2.a(observer);
                                    return;
                                } else {
                                    p0.a.B0("observer");
                                    throw null;
                                }
                            }
                            return;
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                            return;
                        }
                    default:
                        p0.a.s(multiInstanceInvalidationClient, "this$0");
                        InvalidationTracker.Observer observer2 = multiInstanceInvalidationClient.f21299f;
                        if (observer2 != null) {
                            multiInstanceInvalidationClient.f21297b.c(observer2);
                            return;
                        } else {
                            p0.a.B0("observer");
                            throw null;
                        }
                }
            }
        };
        this.f21299f = new InvalidationTracker.Observer((String[]) invalidationTracker.d.keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public final void a(Set set) {
                p0.a.s(set, "tables");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                if (multiInstanceInvalidationClient.f21302i.get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f21300g;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.s(multiInstanceInvalidationClient.e, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        };
        applicationContext.bindService(intent, (ServiceConnection) r4, 1);
    }
}
