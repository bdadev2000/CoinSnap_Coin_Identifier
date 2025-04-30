package u4;

import android.content.Context;
import android.util.Log;
import com.facebook.internal.C1838g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g4.C2296f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import q4.C2642a;
import s4.InterfaceC2699a;
import t4.InterfaceC2708a;

/* renamed from: u4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2772q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23151a;
    public final J1.B b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f23152c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23153d;

    /* renamed from: e, reason: collision with root package name */
    public k8.c f23154e;

    /* renamed from: f, reason: collision with root package name */
    public k8.c f23155f;

    /* renamed from: g, reason: collision with root package name */
    public C2769n f23156g;

    /* renamed from: h, reason: collision with root package name */
    public final C2778w f23157h;

    /* renamed from: i, reason: collision with root package name */
    public final z4.c f23158i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2708a f23159j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2699a f23160k;
    public final ExecutorService l;
    public final U4.y m;

    /* renamed from: n, reason: collision with root package name */
    public final C2764i f23161n;

    /* renamed from: o, reason: collision with root package name */
    public final r4.a f23162o;

    /* renamed from: p, reason: collision with root package name */
    public final C1838g f23163p;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, U4.y] */
    public C2772q(C2296f c2296f, C2778w c2778w, r4.a aVar, J1.B b, C2642a c2642a, C2642a c2642a2, z4.c cVar, ExecutorService executorService, C2764i c2764i, C1838g c1838g) {
        this.b = b;
        c2296f.a();
        this.f23151a = c2296f.f20433a;
        this.f23157h = c2778w;
        this.f23162o = aVar;
        this.f23159j = c2642a;
        this.f23160k = c2642a2;
        this.l = executorService;
        this.f23158i = cVar;
        ?? obj = new Object();
        obj.b = Tasks.forResult(null);
        obj.f3335c = new Object();
        obj.f3336d = new ThreadLocal();
        obj.f3334a = executorService;
        executorService.execute(new B3.k(obj, 23));
        this.m = obj;
        this.f23161n = c2764i;
        this.f23163p = c1838g;
        this.f23153d = System.currentTimeMillis();
        this.f23152c = new r4.c();
    }

    public static Task a(C2772q c2772q, B4.c cVar) {
        Task forException;
        CallableC2771p callableC2771p;
        U4.y yVar = c2772q.m;
        U4.y yVar2 = c2772q.m;
        if (Boolean.TRUE.equals(((ThreadLocal) yVar.f3336d).get())) {
            c2772q.f23154e.a();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
            }
            try {
                try {
                    c2772q.f23159j.d(new C2770o(c2772q));
                    c2772q.f23156g.f();
                    if (!cVar.f().b.f309a) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                        }
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        callableC2771p = new CallableC2771p(c2772q, 0);
                    } else {
                        if (!c2772q.f23156g.d(cVar)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                        }
                        forException = c2772q.f23156g.g(((TaskCompletionSource) ((AtomicReference) cVar.f323i).get()).getTask());
                        callableC2771p = new CallableC2771p(c2772q, 0);
                    }
                } catch (Exception e4) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e4);
                    forException = Tasks.forException(e4);
                    callableC2771p = new CallableC2771p(c2772q, 0);
                }
                yVar2.k(callableC2771p);
                return forException;
            } catch (Throwable th) {
                yVar2.k(new CallableC2771p(c2772q, 0));
                throw th;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b(B4.c cVar) {
        Future<?> submit = this.l.submit(new f4.b(21, this, cVar, false));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e4) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e4);
        } catch (ExecutionException e9) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
