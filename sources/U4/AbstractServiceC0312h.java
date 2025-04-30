package U4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j5.C2400c;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: U4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC0312h extends Service {
    public final ExecutorService b;

    /* renamed from: c, reason: collision with root package name */
    public J f3303c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3304d;

    /* renamed from: f, reason: collision with root package name */
    public int f3305f;

    /* renamed from: g, reason: collision with root package name */
    public int f3306g;

    public AbstractServiceC0312h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f3304d = new Object();
        this.f3306g = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            I.a(intent);
        }
        synchronized (this.f3304d) {
            try {
                int i9 = this.f3306g - 1;
                this.f3306g = i9;
                if (i9 == 0) {
                    stopSelfResult(this.f3305f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f3303c == null) {
                this.f3303c = new J(new C2400c(this, 19));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3303c;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        synchronized (this.f3304d) {
            this.f3305f = i10;
            this.f3306g++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) y.e().f3336d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.b.execute(new RunnableC0311g(this, intent2, taskCompletionSource, 0));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new A0.c(0), new F2.e(1, this, intent));
        return 3;
    }
}
