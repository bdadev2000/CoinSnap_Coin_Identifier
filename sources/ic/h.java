package ic;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class h extends Service {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19548h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f19549b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f19550c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19551d;

    /* renamed from: f, reason: collision with root package name */
    public int f19552f;

    /* renamed from: g, reason: collision with root package name */
    public int f19553g;

    public h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19549b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f19551d = new Object();
        this.f19553g = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            c0.a(intent);
        }
        synchronized (this.f19551d) {
            int i10 = this.f19553g - 1;
            this.f19553g = i10;
            if (i10 == 0) {
                stopSelfResult(this.f19552f);
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f19550c == null) {
            this.f19550c = new d0(new ka.f(this));
        }
        return this.f19550c;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f19549b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f19551d) {
            this.f19552f = i11;
            this.f19553g++;
        }
        Intent intent2 = (Intent) ((Queue) t.f().f19576d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f19549b.execute(new androidx.emoji2.text.n(16, this, intent2, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new l.a(14), new OnCompleteListener() { // from class: ic.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                h.this.a(intent);
            }
        });
        return 3;
    }
}
