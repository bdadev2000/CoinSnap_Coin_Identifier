package ic;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f0 implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f19540b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f19541c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f19542d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f19543f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f19544g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19545h;

    public f0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19543f = new ArrayDeque();
        this.f19545h = false;
        Context applicationContext = context.getApplicationContext();
        this.f19540b = applicationContext;
        this.f19541c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f19542d = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f19543f.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            d0 d0Var = this.f19544g;
            if (d0Var != null && d0Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f19544g.a((e0) this.f19543f.poll());
            } else {
                c();
                return;
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        e0 e0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        e0Var = new e0(intent);
        ScheduledExecutorService scheduledExecutorService = this.f19542d;
        e0Var.f19539b.getTask().addOnCompleteListener(scheduledExecutorService, new androidx.core.app.h(scheduledExecutorService.schedule(new k8.f(e0Var, 12), 20L, TimeUnit.SECONDS), 2));
        this.f19543f.add(e0Var);
        a();
        return e0Var.f19539b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f19545h);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f19545h) {
            return;
        }
        this.f19545h = true;
        try {
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e2);
        }
        if (ConnectionTracker.getInstance().bindService(this.f19540b, this.f19541c, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f19545h = false;
        while (true) {
            ArrayDeque arrayDeque = this.f19543f;
            if (!arrayDeque.isEmpty()) {
                ((e0) arrayDeque.poll()).f19539b.trySetResult(null);
            } else {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f19545h = false;
        if (!(iBinder instanceof d0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f19543f;
                if (!arrayDeque.isEmpty()) {
                    ((e0) arrayDeque.poll()).f19539b.trySetResult(null);
                } else {
                    return;
                }
            }
        } else {
            this.f19544g = (d0) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
