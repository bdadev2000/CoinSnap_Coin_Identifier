package U4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class L implements ServiceConnection {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f3277c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f3278d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3279f;

    /* renamed from: g, reason: collision with root package name */
    public J f3280g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3281h;

    public L(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f3279f = new ArrayDeque();
        this.f3281h = false;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.f3277c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f3278d = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f3279f.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                J j7 = this.f3280g;
                if (j7 != null && j7.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f3280g.a((K) this.f3279f.poll());
                } else {
                    c();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        K k6;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            k6 = new K(intent);
            ScheduledExecutorService scheduledExecutorService = this.f3278d;
            k6.b.getTask().addOnCompleteListener(scheduledExecutorService, new F2.d(scheduledExecutorService.schedule(new D3.b(k6, 11), 20L, TimeUnit.SECONDS), 8));
            this.f3279f.add(k6);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return k6.b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f3281h);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f3281h) {
            return;
        }
        this.f3281h = true;
        try {
        } catch (SecurityException e4) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e4);
        }
        if (ConnectionTracker.getInstance().bindService(this.b, this.f3277c, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f3281h = false;
        while (true) {
            ArrayDeque arrayDeque = this.f3279f;
            if (!arrayDeque.isEmpty()) {
                ((K) arrayDeque.poll()).b.trySetResult(null);
            } else {
                return;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f3281h = false;
            if (!(iBinder instanceof J)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f3279f;
                    if (!arrayDeque.isEmpty()) {
                        ((K) arrayDeque.poll()).b.trySetResult(null);
                    } else {
                        return;
                    }
                }
            } else {
                this.f3280g = (J) iBinder;
                a();
            }
        } catch (Throwable th) {
            throw th;
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
