package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestrictTo
/* loaded from: classes.dex */
public class Processor implements ExecutionListener, ForegroundProcessor {

    /* renamed from: m, reason: collision with root package name */
    public static final String f21925m = Logger.e("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f21927b;

    /* renamed from: c, reason: collision with root package name */
    public final Configuration f21928c;
    public final TaskExecutor d;

    /* renamed from: f, reason: collision with root package name */
    public final WorkDatabase f21929f;

    /* renamed from: i, reason: collision with root package name */
    public final List f21932i;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f21931h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f21930g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f21933j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f21934k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f21926a = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f21935l = new Object();

    /* loaded from: classes.dex */
    public static class FutureListener implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public ExecutionListener f21936a;

        /* renamed from: b, reason: collision with root package name */
        public String f21937b;

        /* renamed from: c, reason: collision with root package name */
        public ListenableFuture f21938c;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            try {
                z2 = ((Boolean) this.f21938c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z2 = true;
            }
            this.f21936a.e(this.f21937b, z2);
        }
    }

    public Processor(Context context, Configuration configuration, WorkManagerTaskExecutor workManagerTaskExecutor, WorkDatabase workDatabase, List list) {
        this.f21927b = context;
        this.f21928c = configuration;
        this.d = workManagerTaskExecutor;
        this.f21929f = workDatabase;
        this.f21932i = list;
    }

    public static boolean d(String str, WorkerWrapper workerWrapper) {
        boolean z2;
        if (workerWrapper == null) {
            Logger.c().a(f21925m, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        workerWrapper.f21994t = true;
        workerWrapper.i();
        ListenableFuture listenableFuture = workerWrapper.f21993s;
        if (listenableFuture != null) {
            z2 = listenableFuture.isDone();
            workerWrapper.f21993s.cancel(true);
        } else {
            z2 = false;
        }
        ListenableWorker listenableWorker = workerWrapper.f21981g;
        if (listenableWorker == null || z2) {
            Logger.c().a(WorkerWrapper.f21976u, String.format("WorkSpec %s is already done. Not interrupting.", workerWrapper.f21980f), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        Logger.c().a(f21925m, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public final void a(String str) {
        synchronized (this.f21935l) {
            this.f21930g.remove(str);
            i();
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public final void b(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.f21935l) {
            try {
                Logger.c().d(f21925m, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f21931h.remove(str);
                if (workerWrapper != null) {
                    if (this.f21926a == null) {
                        PowerManager.WakeLock a2 = WakeLocks.a(this.f21927b, "ProcessorForegroundLck");
                        this.f21926a = a2;
                        a2.acquire();
                    }
                    this.f21930g.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f21927b, SystemForegroundDispatcher.c(this.f21927b, str, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ExecutionListener executionListener) {
        synchronized (this.f21935l) {
            this.f21934k.add(executionListener);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        synchronized (this.f21935l) {
            try {
                this.f21931h.remove(str);
                Logger.c().a(f21925m, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z2)), new Throwable[0]);
                Iterator it = this.f21934k.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).e(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(String str) {
        boolean z2;
        synchronized (this.f21935l) {
            try {
                z2 = this.f21931h.containsKey(str) || this.f21930g.containsKey(str);
            } finally {
            }
        }
        return z2;
    }

    public final void g(ExecutionListener executionListener) {
        synchronized (this.f21935l) {
            this.f21934k.remove(executionListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, androidx.work.impl.WorkerWrapper$Builder] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, androidx.work.impl.Processor$FutureListener, java.lang.Runnable] */
    public final boolean h(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        synchronized (this.f21935l) {
            try {
                if (f(str)) {
                    Logger.c().a(f21925m, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                Context context = this.f21927b;
                Configuration configuration = this.f21928c;
                TaskExecutor taskExecutor = this.d;
                WorkDatabase workDatabase = this.f21929f;
                ?? obj = new Object();
                obj.f22006h = new WorkerParameters.RuntimeExtras();
                obj.f22001a = context.getApplicationContext();
                obj.f22003c = taskExecutor;
                obj.f22002b = this;
                obj.d = configuration;
                obj.e = workDatabase;
                obj.f22004f = str;
                obj.f22005g = this.f21932i;
                if (runtimeExtras != null) {
                    obj.f22006h = runtimeExtras;
                }
                WorkerWrapper a2 = obj.a();
                SettableFuture settableFuture = a2.f21992r;
                ?? obj2 = new Object();
                obj2.f21936a = this;
                obj2.f21937b = str;
                obj2.f21938c = settableFuture;
                settableFuture.addListener(obj2, this.d.a());
                this.f21931h.put(str, a2);
                this.d.c().execute(a2);
                Logger.c().a(f21925m, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f21935l) {
            try {
                if (!(!this.f21930g.isEmpty())) {
                    Context context = this.f21927b;
                    String str = SystemForegroundDispatcher.f22099k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f21927b.startService(intent);
                    } catch (Throwable th) {
                        Logger.c().b(f21925m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f21926a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f21926a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean d;
        synchronized (this.f21935l) {
            Logger.c().a(f21925m, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            d = d(str, (WorkerWrapper) this.f21930g.remove(str));
        }
        return d;
    }

    public final boolean k(String str) {
        boolean d;
        synchronized (this.f21935l) {
            Logger.c().a(f21925m, String.format("Processor stopping background work %s", str), new Throwable[0]);
            d = d(str, (WorkerWrapper) this.f21931h.remove(str));
        }
        return d;
    }
}
