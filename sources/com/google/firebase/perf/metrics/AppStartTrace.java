package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.FirstDrawDoneListener;
import com.google.firebase.perf.util.PreDrawListener;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {
    private static final int CORE_POOL_SIZE = 0;
    private static final int MAX_POOL_SIZE = 1;
    private static ExecutorService executorService;
    private static volatile AppStartTrace instance;
    private Context appContext;
    private WeakReference<Activity> appStartActivity;
    private final Clock clock;
    private final ConfigResolver configResolver;
    private final TraceMetric.Builder experimentTtid;
    private final Timer firebaseClassLoadTime;
    private WeakReference<Activity> launchActivity;
    private final Timer processStartTime;
    private PerfSession startSession;
    private final TransportManager transportManager;
    private static final Timer PERF_CLASS_LOAD_TIME = new Clock().getTime();
    private static final long MAX_LATENCY_BEFORE_UI_INIT = TimeUnit.MINUTES.toMicros(1);
    private boolean isRegisteredForLifecycleCallbacks = false;
    private boolean isTooLateToInitUI = false;
    private Timer onCreateTime = null;
    private Timer onStartTime = null;
    private Timer onResumeTime = null;
    private Timer firstForegroundTime = null;
    private Timer firstBackgroundTime = null;
    private Timer preDrawPostTime = null;
    private Timer preDrawPostAtFrontOfQueueTime = null;
    private Timer onDrawPostAtFrontOfQueueTime = null;
    private boolean isStartedFromBackground = false;
    private int onDrawCount = 0;
    private final DrawCounter onDrawCounterListener = new DrawCounter();
    private boolean systemForegroundCheck = false;

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    static /* synthetic */ int access$308(AppStartTrace appStartTrace) {
        int i = appStartTrace.onDrawCount;
        appStartTrace.onDrawCount = i + 1;
        return i;
    }

    public static AppStartTrace getInstance() {
        return instance != null ? instance : getInstance(TransportManager.getInstance(), new Clock());
    }

    static AppStartTrace getInstance(TransportManager transportManager, Clock clock) {
        if (instance == null) {
            synchronized (AppStartTrace.class) {
                if (instance == null) {
                    instance = new AppStartTrace(transportManager, clock, ConfigResolver.getInstance(), new ThreadPoolExecutor(0, 1, MAX_LATENCY_BEFORE_UI_INIT + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return instance;
    }

    AppStartTrace(TransportManager transportManager, Clock clock, ConfigResolver configResolver, ExecutorService executorService2) {
        this.transportManager = transportManager;
        this.clock = clock;
        this.configResolver = configResolver;
        executorService = executorService2;
        this.experimentTtid = TraceMetric.newBuilder().setName("_experiment_app_start_ttid");
        this.processStartTime = Timer.ofElapsedRealtime(Process.getStartElapsedRealtime());
        StartupTime startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class);
        this.firebaseClassLoadTime = startupTime != null ? Timer.ofElapsedRealtime(startupTime.getElapsedRealtime()) : null;
    }

    public synchronized void registerActivityLifecycleCallbacks(Context context) {
        boolean z;
        if (this.isRegisteredForLifecycleCallbacks) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycleRegistry().addObserver(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.systemForegroundCheck && !isAnyAppProcessInForeground(applicationContext)) {
                z = false;
                this.systemForegroundCheck = z;
                this.isRegisteredForLifecycleCallbacks = true;
                this.appContext = applicationContext;
            }
            z = true;
            this.systemForegroundCheck = z;
            this.isRegisteredForLifecycleCallbacks = true;
            this.appContext = applicationContext;
        }
    }

    public synchronized void unregisterActivityLifecycleCallbacks() {
        if (this.isRegisteredForLifecycleCallbacks) {
            ProcessLifecycleOwner.get().getLifecycleRegistry().removeObserver(this);
            ((Application) this.appContext).unregisterActivityLifecycleCallbacks(this);
            this.isRegisteredForLifecycleCallbacks = false;
        }
    }

    private Timer getStartTimerCompat() {
        Timer timer = this.processStartTime;
        return timer != null ? timer : getClassLoadTimeCompat();
    }

    private Timer getClassLoadTimeCompat() {
        Timer timer = this.firebaseClassLoadTime;
        return timer != null ? timer : PERF_CLASS_LOAD_TIME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDraw() {
        if (this.preDrawPostTime != null) {
            return;
        }
        this.preDrawPostTime = this.clock.getTime();
        this.experimentTtid.setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostTime));
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordPreDrawFrontOfQueue() {
        if (this.preDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.preDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_preDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.preDrawPostAtFrontOfQueueTime)).build());
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordOnDrawFrontOfQueue() {
        if (this.onDrawPostAtFrontOfQueueTime != null) {
            return;
        }
        this.onDrawPostAtFrontOfQueueTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_onDrawFoQ").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.onDrawPostAtFrontOfQueueTime)).build());
        if (this.processStartTime != null) {
            this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_procStart_to_classLoad").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(getClassLoadTimeCompat())).build());
        }
        this.experimentTtid.putCustomAttributes("systemDeterminedForeground", this.systemForegroundCheck ? "true" : "false");
        this.experimentTtid.putCounters("onDrawCount", this.onDrawCount);
        this.experimentTtid.addPerfSessions(this.startSession.build());
        logExperimentTrace(this.experimentTtid);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001b, B:16:0x003c), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.isStartedFromBackground     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L40
            com.google.firebase.perf.util.Timer r5 = r3.onCreateTime     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La
            goto L40
        La:
            boolean r5 = r3.systemForegroundCheck     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r5 != 0) goto L1a
            android.content.Context r5 = r3.appContext     // Catch: java.lang.Throwable -> L42
            boolean r5 = isAnyAppProcessInForeground(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L18
            goto L1a
        L18:
            r5 = 0
            goto L1b
        L1a:
            r5 = r0
        L1b:
            r3.systemForegroundCheck = r5     // Catch: java.lang.Throwable -> L42
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            r3.launchActivity = r5     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Clock r4 = r3.clock     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r4 = r4.getTime()     // Catch: java.lang.Throwable -> L42
            r3.onCreateTime = r4     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r4 = r3.getStartTimerCompat()     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.Timer r5 = r3.onCreateTime     // Catch: java.lang.Throwable -> L42
            long r4 = r4.getDurationMicros(r5)     // Catch: java.lang.Throwable -> L42
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.MAX_LATENCY_BEFORE_UI_INIT     // Catch: java.lang.Throwable -> L42
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3e
            r3.isTooLateToInitUI = r0     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r3)
            return
        L40:
            monitor-exit(r3)
            return
        L42:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.isStartedFromBackground && this.onStartTime == null && !this.isTooLateToInitUI) {
            this.onStartTime = this.clock.getTime();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.isStartedFromBackground && !this.isTooLateToInitUI) {
            boolean isExperimentTTIDEnabled = this.configResolver.getIsExperimentTTIDEnabled();
            if (isExperimentTTIDEnabled) {
                View findViewById = activity.findViewById(R.id.content);
                findViewById.getViewTreeObserver().addOnDrawListener(this.onDrawCounterListener);
                FirstDrawDoneListener.registerForNextDraw(findViewById, new Runnable() { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.recordOnDrawFrontOfQueue();
                    }
                });
                PreDrawListener.registerForNextDraw(findViewById, new Runnable() { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.recordPreDraw();
                    }
                }, new Runnable() { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.recordPreDrawFrontOfQueue();
                    }
                });
            }
            if (this.onResumeTime != null) {
                return;
            }
            this.appStartActivity = new WeakReference<>(activity);
            this.onResumeTime = this.clock.getTime();
            this.startSession = SessionManager.getInstance().perfSession();
            AndroidLogger.getInstance().debug("onResume(): " + activity.getClass().getName() + ": " + getClassLoadTimeCompat().getDurationMicros(this.onResumeTime) + " microseconds");
            executorService.execute(new Runnable() { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.logAppStartTrace();
                }
            });
            if (!isExperimentTTIDEnabled) {
                unregisterActivityLifecycleCallbacks();
            }
        }
    }

    private void logExperimentTrace(final TraceMetric.Builder builder) {
        if (this.preDrawPostTime == null || this.preDrawPostAtFrontOfQueueTime == null || this.onDrawPostAtFrontOfQueueTime == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: com.google.firebase.perf.metrics.AppStartTrace$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AppStartTrace.this.m8231x969c1f0b(builder);
            }
        });
        unregisterActivityLifecycleCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$logExperimentTrace$0$com-google-firebase-perf-metrics-AppStartTrace, reason: not valid java name */
    public /* synthetic */ void m8231x969c1f0b(TraceMetric.Builder builder) {
        this.transportManager.log(builder.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logAppStartTrace() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(Constants.TraceNames.APP_START_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onResumeTime));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TraceMetric.newBuilder().setName(Constants.TraceNames.ON_CREATE_TRACE_NAME.toString()).setClientStartTimeUs(getClassLoadTimeCompat().getMicros()).setDurationUs(getClassLoadTimeCompat().getDurationMicros(this.onCreateTime)).build());
        if (this.onStartTime != null) {
            TraceMetric.Builder newBuilder = TraceMetric.newBuilder();
            newBuilder.setName(Constants.TraceNames.ON_START_TRACE_NAME.toString()).setClientStartTimeUs(this.onCreateTime.getMicros()).setDurationUs(this.onCreateTime.getDurationMicros(this.onStartTime));
            arrayList.add(newBuilder.build());
            TraceMetric.Builder newBuilder2 = TraceMetric.newBuilder();
            newBuilder2.setName(Constants.TraceNames.ON_RESUME_TRACE_NAME.toString()).setClientStartTimeUs(this.onStartTime.getMicros()).setDurationUs(this.onStartTime.getDurationMicros(this.onResumeTime));
            arrayList.add(newBuilder2.build());
        }
        durationUs.addAllSubtraces(arrayList).addPerfSessions(this.startSession.build());
        this.transportManager.log((TraceMetric) durationUs.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || !this.configResolver.getIsExperimentTTIDEnabled()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.onDrawCounterListener);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstForegroundTime != null) {
            return;
        }
        this.firstForegroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstForegrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstForegroundTime)).build());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.isStartedFromBackground || this.isTooLateToInitUI || this.firstBackgroundTime != null) {
            return;
        }
        this.firstBackgroundTime = this.clock.getTime();
        this.experimentTtid.addSubtraces(TraceMetric.newBuilder().setName("_experiment_firstBackgrounding").setClientStartTimeUs(getStartTimerCompat().getMicros()).setDurationUs(getStartTimerCompat().getDurationMicros(this.firstBackgroundTime)).build());
    }

    public static boolean isAnyAppProcessInForeground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isScreenOn(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* loaded from: classes3.dex */
    public static class StartFromBackgroundRunnable implements Runnable {
        private final AppStartTrace trace;

        public StartFromBackgroundRunnable(AppStartTrace appStartTrace) {
            this.trace = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.trace.onCreateTime == null) {
                this.trace.isStartedFromBackground = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    private final class DrawCounter implements ViewTreeObserver.OnDrawListener {
        private DrawCounter() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.access$308(AppStartTrace.this);
        }
    }

    Activity getLaunchActivity() {
        return this.launchActivity.get();
    }

    Activity getAppStartActivity() {
        return this.appStartActivity.get();
    }

    Timer getOnCreateTime() {
        return this.onCreateTime;
    }

    Timer getOnStartTime() {
        return this.onStartTime;
    }

    Timer getOnResumeTime() {
        return this.onResumeTime;
    }

    void setIsStartFromBackground() {
        this.isStartedFromBackground = true;
    }
}
