package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemAlarmDispatcher implements ExecutionListener {

    /* renamed from: l, reason: collision with root package name */
    public static final String f22042l = Logger.e("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f22043a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskExecutor f22044b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkTimer f22045c;
    public final Processor d;

    /* renamed from: f, reason: collision with root package name */
    public final WorkManagerImpl f22046f;

    /* renamed from: g, reason: collision with root package name */
    public final CommandHandler f22047g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f22048h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22049i;

    /* renamed from: j, reason: collision with root package name */
    public Intent f22050j;

    /* renamed from: k, reason: collision with root package name */
    public CommandsCompletedListener f22051k;

    /* loaded from: classes2.dex */
    public static class AddRunnable implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final SystemAlarmDispatcher f22053a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f22054b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22055c;

        public AddRunnable(int i2, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f22053a = systemAlarmDispatcher;
            this.f22054b = intent;
            this.f22055c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22053a.a(this.f22055c, this.f22054b);
        }
    }

    /* loaded from: classes2.dex */
    public interface CommandsCompletedListener {
        void b();
    }

    /* loaded from: classes2.dex */
    public static class DequeueAndCheckForCompletion implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final SystemAlarmDispatcher f22056a;

        public DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f22056a = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2;
            boolean z3;
            SystemAlarmDispatcher systemAlarmDispatcher = this.f22056a;
            systemAlarmDispatcher.getClass();
            Logger c2 = Logger.c();
            String str = SystemAlarmDispatcher.f22042l;
            c2.a(str, "Checking if commands are complete.", new Throwable[0]);
            systemAlarmDispatcher.b();
            synchronized (systemAlarmDispatcher.f22049i) {
                try {
                    if (systemAlarmDispatcher.f22050j != null) {
                        Logger.c().a(str, String.format("Removing command %s", systemAlarmDispatcher.f22050j), new Throwable[0]);
                        if (!((Intent) systemAlarmDispatcher.f22049i.remove(0)).equals(systemAlarmDispatcher.f22050j)) {
                            throw new IllegalStateException("Dequeue-d command is not the first.");
                        }
                        systemAlarmDispatcher.f22050j = null;
                    }
                    SerialExecutor c3 = systemAlarmDispatcher.f22044b.c();
                    CommandHandler commandHandler = systemAlarmDispatcher.f22047g;
                    synchronized (commandHandler.f22023c) {
                        z2 = !commandHandler.f22022b.isEmpty();
                    }
                    if (!z2 && systemAlarmDispatcher.f22049i.isEmpty()) {
                        synchronized (c3.f22199c) {
                            z3 = !c3.f22197a.isEmpty();
                        }
                        if (!z3) {
                            Logger.c().a(str, "No more commands & intents.", new Throwable[0]);
                            CommandsCompletedListener commandsCompletedListener = systemAlarmDispatcher.f22051k;
                            if (commandsCompletedListener != null) {
                                commandsCompletedListener.b();
                            }
                        }
                    }
                    if (!systemAlarmDispatcher.f22049i.isEmpty()) {
                        systemAlarmDispatcher.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SystemAlarmDispatcher(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f22043a = applicationContext;
        this.f22047g = new CommandHandler(applicationContext);
        this.f22045c = new WorkTimer();
        WorkManagerImpl b2 = WorkManagerImpl.b(context);
        this.f22046f = b2;
        Processor processor = b2.f21972f;
        this.d = processor;
        this.f22044b = b2.d;
        processor.c(this);
        this.f22049i = new ArrayList();
        this.f22050j = null;
        this.f22048h = new Handler(Looper.getMainLooper());
    }

    public final void a(int i2, Intent intent) {
        Logger c2 = Logger.c();
        String str = f22042l;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.c().g(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f22049i) {
                try {
                    Iterator it = this.f22049i.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f22049i) {
            try {
                boolean z2 = !this.f22049i.isEmpty();
                this.f22049i.add(intent);
                if (!z2) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f22048h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void c() {
        Logger.c().a(f22042l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.d.g(this);
        ScheduledExecutorService scheduledExecutorService = this.f22045c.f22233a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f22051k = null;
    }

    public final void d(Runnable runnable) {
        this.f22048h.post(runnable);
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        String str2 = CommandHandler.d;
        Intent intent = new Intent(this.f22043a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        d(new AddRunnable(0, intent, this));
    }

    public final void f() {
        b();
        PowerManager.WakeLock a2 = WakeLocks.a(this.f22043a, "ProcessCommand");
        try {
            a2.acquire();
            this.f22046f.d.b(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public final void run() {
                    SystemAlarmDispatcher systemAlarmDispatcher;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.f22049i) {
                        SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher2.f22050j = (Intent) systemAlarmDispatcher2.f22049i.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.f22050j;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.f22050j.getIntExtra("KEY_START_ID", 0);
                        Logger c2 = Logger.c();
                        String str = SystemAlarmDispatcher.f22042l;
                        c2.a(str, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.f22050j, Integer.valueOf(intExtra)), new Throwable[0]);
                        PowerManager.WakeLock a3 = WakeLocks.a(SystemAlarmDispatcher.this.f22043a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                        try {
                            Logger.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a3), new Throwable[0]);
                            a3.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher3 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher3.f22047g.c(intExtra, systemAlarmDispatcher3.f22050j, systemAlarmDispatcher3);
                            Logger.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a3), new Throwable[0]);
                            a3.release();
                            systemAlarmDispatcher = SystemAlarmDispatcher.this;
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(systemAlarmDispatcher);
                        } catch (Throwable th) {
                            try {
                                Logger c3 = Logger.c();
                                String str2 = SystemAlarmDispatcher.f22042l;
                                c3.b(str2, "Unexpected error in onHandleIntent", th);
                                Logger.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a3), new Throwable[0]);
                                a3.release();
                                systemAlarmDispatcher = SystemAlarmDispatcher.this;
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(systemAlarmDispatcher);
                            } catch (Throwable th2) {
                                Logger.c().a(SystemAlarmDispatcher.f22042l, String.format("Releasing operation wake lock (%s) %s", action, a3), new Throwable[0]);
                                a3.release();
                                SystemAlarmDispatcher systemAlarmDispatcher4 = SystemAlarmDispatcher.this;
                                systemAlarmDispatcher4.d(new DequeueAndCheckForCompletion(systemAlarmDispatcher4));
                                throw th2;
                            }
                        }
                        systemAlarmDispatcher.d(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            a2.release();
        }
    }
}
