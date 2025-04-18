package mc;

import android.util.Log;
import com.facebook.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f22157d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final l.a f22158e = new l.a(22);
    public final Executor a;

    /* renamed from: b, reason: collision with root package name */
    public final o f22159b;

    /* renamed from: c, reason: collision with root package name */
    public Task f22160c = null;

    public d(ScheduledExecutorService scheduledExecutorService, o oVar) {
        this.a = scheduledExecutorService;
        this.f22159b = oVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        ka.f fVar = new ka.f(5);
        Executor executor = f22158e;
        task.addOnSuccessListener(executor, fVar);
        task.addOnFailureListener(executor, fVar);
        task.addOnCanceledListener(executor, fVar);
        if (((CountDownLatch) fVar.f20532b).await(5L, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final synchronized Task b() {
        Task task = this.f22160c;
        if (task == null || (task.isComplete() && !this.f22160c.isSuccessful())) {
            Executor executor = this.a;
            o oVar = this.f22159b;
            Objects.requireNonNull(oVar);
            this.f22160c = Tasks.call(executor, new w(oVar, 4));
        }
        return this.f22160c;
    }

    public final f c() {
        synchronized (this) {
            Task task = this.f22160c;
            if (task != null && task.isSuccessful()) {
                return (f) this.f22160c.getResult();
            }
            try {
                return (f) a(b(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                return null;
            }
        }
    }

    public final Task d(f fVar) {
        m3.f fVar2 = new m3.f(5, this, fVar);
        Executor executor = this.a;
        return Tasks.call(executor, fVar2).onSuccessTask(executor, new com.applovin.impl.sdk.ad.f(this, fVar));
    }
}
