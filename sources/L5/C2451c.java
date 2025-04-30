package l5;

import U4.C0314j;
import U4.CallableC0313i;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.a0;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C2426o;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2451c {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f21581d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final A0.c f21582e = new A0.c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21583a;
    public final n b;

    /* renamed from: c, reason: collision with root package name */
    public Task f21584c = null;

    public C2451c(Executor executor, n nVar) {
        this.f21583a = executor;
        this.b = nVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        C2426o c2426o = new C2426o(1);
        Executor executor = f21582e;
        task.addOnSuccessListener(executor, c2426o);
        task.addOnFailureListener(executor, c2426o);
        task.addOnCanceledListener(executor, c2426o);
        if (((CountDownLatch) c2426o.f21320c).await(5L, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public final synchronized Task b() {
        try {
            Task task = this.f21584c;
            if (task != null) {
                if (task.isComplete() && !this.f21584c.isSuccessful()) {
                }
            }
            Executor executor = this.f21583a;
            n nVar = this.b;
            Objects.requireNonNull(nVar);
            this.f21584c = Tasks.call(executor, new a0(nVar, 3));
        } catch (Throwable th) {
            throw th;
        }
        return this.f21584c;
    }

    public final d c() {
        synchronized (this) {
            try {
                Task task = this.f21584c;
                if (task != null && task.isSuccessful()) {
                    return (d) this.f21584c.getResult();
                }
                try {
                    return (d) a(b(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e4);
                    return null;
                }
            } finally {
            }
        }
    }

    public final Task d(d dVar) {
        CallableC0313i callableC0313i = new CallableC0313i(4, this, dVar);
        Executor executor = this.f21583a;
        return Tasks.call(executor, callableC0313i).onSuccessTask(executor, new C0314j(this, dVar));
    }
}
