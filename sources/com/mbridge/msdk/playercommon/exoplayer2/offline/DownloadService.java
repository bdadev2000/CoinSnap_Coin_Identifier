package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Requirements;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher;
import com.mbridge.msdk.playercommon.exoplayer2.scheduler.Scheduler;
import com.mbridge.msdk.playercommon.exoplayer2.util.NotificationUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class DownloadService extends Service {
    public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
    public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
    private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
    private static final String ACTION_START_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS";
    private static final String ACTION_STOP_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS";
    private static final boolean DEBUG = false;
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final String KEY_DOWNLOAD_ACTION = "download_action";
    public static final String KEY_FOREGROUND = "foreground";
    private static final String TAG = "DownloadService";
    private static final HashMap<Class<? extends DownloadService>, RequirementsHelper> requirementsHelpers = new HashMap<>();
    private final String channelId;
    private final int channelName;
    private DownloadManager downloadManager;
    private DownloadManagerListener downloadManagerListener;
    private final ForegroundNotificationUpdater foregroundNotificationUpdater;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* loaded from: classes4.dex */
    public final class DownloadManagerListener implements DownloadManager.Listener {
        private DownloadManagerListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public final void onIdle(DownloadManager downloadManager) {
            DownloadService.this.stop();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public final void onInitialized(DownloadManager downloadManager) {
            DownloadService.this.maybeStartWatchingRequirements();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Listener
        public final void onTaskStateChanged(DownloadManager downloadManager, DownloadManager.TaskState taskState) {
            DownloadService.this.onTaskStateChanged(taskState);
            if (taskState.state == 1) {
                DownloadService.this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                DownloadService.this.foregroundNotificationUpdater.update();
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class ForegroundNotificationUpdater implements Runnable {
        private final Handler handler = new Handler(Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i10, long j3) {
            this.notificationId = i10;
            this.updateInterval = j3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            update();
        }

        public final void showNotificationIfNotAlready() {
            if (!this.notificationDisplayed) {
                update();
            }
        }

        public final void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public final void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacks(this);
        }

        public final void update() {
            DownloadManager.TaskState[] allTaskStates = DownloadService.this.downloadManager.getAllTaskStates();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.notificationId, downloadService.getForegroundNotification(allTaskStates));
            this.notificationDisplayed = true;
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacks(this);
                this.handler.postDelayed(this, this.updateInterval);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class RequirementsHelper implements RequirementsWatcher.Listener {
        private final Context context;
        private final Requirements requirements;
        private final RequirementsWatcher requirementsWatcher;
        private final Scheduler scheduler;
        private final Class<? extends DownloadService> serviceClass;

        private void startServiceWithAction(String str) {
            Util.startForegroundService(this.context, new Intent(this.context, this.serviceClass).setAction(str).putExtra(DownloadService.KEY_FOREGROUND, true));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public final void requirementsMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_START_DOWNLOADS);
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.scheduler.RequirementsWatcher.Listener
        public final void requirementsNotMet(RequirementsWatcher requirementsWatcher) {
            startServiceWithAction(DownloadService.ACTION_STOP_DOWNLOADS);
            if (this.scheduler != null) {
                String g10 = c.m().g();
                if (TextUtils.isEmpty(g10)) {
                    g10 = this.context.getPackageName();
                }
                if (!this.scheduler.schedule(this.requirements, g10, DownloadService.ACTION_RESTART)) {
                    Log.e(DownloadService.TAG, "Scheduling downloads failed.");
                }
            }
        }

        public final void start() {
            this.requirementsWatcher.start();
        }

        public final void stop() {
            this.requirementsWatcher.stop();
            Scheduler scheduler = this.scheduler;
            if (scheduler != null) {
                scheduler.cancel();
            }
        }

        private RequirementsHelper(Context context, Requirements requirements, Scheduler scheduler, Class<? extends DownloadService> cls) {
            this.context = context;
            this.requirements = requirements;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            this.requirementsWatcher = new RequirementsWatcher(context, this, requirements);
        }
    }

    public DownloadService(int i10) {
        this(i10, 1000L);
    }

    public static Intent buildAddActionIntent(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        return new Intent(context, cls).setAction(ACTION_ADD).putExtra(KEY_DOWNLOAD_ACTION, downloadAction.toByteArray()).putExtra(KEY_FOREGROUND, z10);
    }

    private void logd(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void maybeStartWatchingRequirements() {
        if (this.downloadManager.getDownloadCount() == 0) {
            return;
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, RequirementsHelper> hashMap = requirementsHelpers;
        if (((RequirementsHelper) hashMap.get(cls)) == null) {
            RequirementsHelper requirementsHelper = new RequirementsHelper(this, getRequirements(), getScheduler(), cls);
            hashMap.put(cls, requirementsHelper);
            requirementsHelper.start();
            logd("started watching requirements");
        }
    }

    private void maybeStopWatchingRequirements() {
        RequirementsHelper remove;
        if (this.downloadManager.getDownloadCount() <= 0 && (remove = requirementsHelpers.remove(getClass())) != null) {
            remove.stop();
            logd("stopped watching requirements");
        }
    }

    public static void start(Context context, Class<? extends DownloadService> cls) {
        context.startService(new Intent(context, cls).setAction(ACTION_INIT));
    }

    public static void startForeground(Context context, Class<? extends DownloadService> cls) {
        Util.startForegroundService(context, new Intent(context, cls).setAction(ACTION_INIT).putExtra(KEY_FOREGROUND, true));
    }

    public static void startWithAction(Context context, Class<? extends DownloadService> cls, DownloadAction downloadAction, boolean z10) {
        Intent buildAddActionIntent = buildAddActionIntent(context, cls, downloadAction, z10);
        if (z10) {
            Util.startForegroundService(context, buildAddActionIntent);
        } else {
            context.startService(buildAddActionIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stop() {
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        if (this.startedInForeground && Util.SDK_INT >= 26) {
            this.foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        if (Util.SDK_INT < 28 && this.taskRemoved) {
            stopSelf();
            logd("stopSelf()");
            return;
        }
        logd("stopSelf(" + this.lastStartId + ") result: " + stopSelfResult(this.lastStartId));
    }

    public abstract DownloadManager getDownloadManager();

    public abstract Notification getForegroundNotification(DownloadManager.TaskState[] taskStateArr);

    public Requirements getRequirements() {
        return new Requirements(1, false, false);
    }

    public abstract Scheduler getScheduler();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        logd("onCreate");
        String str = this.channelId;
        if (str != null) {
            NotificationUtil.createNotificationChannel(this, str, this.channelName, 2);
        }
        this.downloadManager = getDownloadManager();
        DownloadManagerListener downloadManagerListener = new DownloadManagerListener();
        this.downloadManagerListener = downloadManagerListener;
        this.downloadManager.addListener(downloadManagerListener);
    }

    @Override // android.app.Service
    public void onDestroy() {
        logd("onDestroy");
        this.foregroundNotificationUpdater.stopPeriodicUpdates();
        this.downloadManager.removeListener(this.downloadManagerListener);
        maybeStopWatchingRequirements();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        if (r2.equals(com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.ACTION_RESTART) == false) goto L18;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            r6.lastStartId = r9
            r8 = 0
            r6.taskRemoved = r8
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r1 = 1
            if (r7 == 0) goto L26
            java.lang.String r2 = r7.getAction()
            boolean r3 = r6.startedInForeground
            java.lang.String r4 = "foreground"
            boolean r4 = r7.getBooleanExtra(r4, r8)
            if (r4 != 0) goto L21
            boolean r4 = r0.equals(r2)
            if (r4 == 0) goto L1f
            goto L21
        L1f:
            r4 = r8
            goto L22
        L21:
            r4 = r1
        L22:
            r3 = r3 | r4
            r6.startedInForeground = r3
            goto L27
        L26:
            r2 = 0
        L27:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r2 != 0) goto L2c
            r2 = r3
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onStartCommand action: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r5 = " startId: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r6.logd(r9)
            int r9 = r2.hashCode()
            r4 = -1
            switch(r9) {
                case -871181424: goto L79;
                case -382886238: goto L6e;
                case -337334865: goto L63;
                case 1015676687: goto L5a;
                case 1286088717: goto L4f;
                default: goto L4d;
            }
        L4d:
            r8 = r4
            goto L80
        L4f:
            java.lang.String r8 = "com.google.android.exoplayer.downloadService.action.STOP_DOWNLOADS"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L58
            goto L4d
        L58:
            r8 = 4
            goto L80
        L5a:
            boolean r8 = r2.equals(r3)
            if (r8 != 0) goto L61
            goto L4d
        L61:
            r8 = 3
            goto L80
        L63:
            java.lang.String r8 = "com.google.android.exoplayer.downloadService.action.START_DOWNLOADS"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L6c
            goto L4d
        L6c:
            r8 = 2
            goto L80
        L6e:
            java.lang.String r8 = "com.google.android.exoplayer.downloadService.action.ADD"
            boolean r8 = r2.equals(r8)
            if (r8 != 0) goto L77
            goto L4d
        L77:
            r8 = r1
            goto L80
        L79:
            boolean r9 = r2.equals(r0)
            if (r9 != 0) goto L80
            goto L4d
        L80:
            java.lang.String r9 = "DownloadService"
            switch(r8) {
                case 0: goto Lb5;
                case 1: goto L9b;
                case 2: goto L95;
                case 3: goto Lb5;
                case 4: goto L8f;
                default: goto L85;
            }
        L85:
            java.lang.String r7 = "Ignoring unrecognized action: "
            java.lang.String r7 = r7.concat(r2)
            android.util.Log.e(r9, r7)
            goto Lb5
        L8f:
            com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager r7 = r6.downloadManager
            r7.stopDownloads()
            goto Lb5
        L95:
            com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager r7 = r6.downloadManager
            r7.startDownloads()
            goto Lb5
        L9b:
            java.lang.String r8 = "download_action"
            byte[] r7 = r7.getByteArrayExtra(r8)
            if (r7 != 0) goto La9
            java.lang.String r7 = "Ignoring ADD action with no action data"
            android.util.Log.e(r9, r7)
            goto Lb5
        La9:
            com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager r8 = r6.downloadManager     // Catch: java.io.IOException -> Laf
            r8.handleAction(r7)     // Catch: java.io.IOException -> Laf
            goto Lb5
        Laf:
            r7 = move-exception
            java.lang.String r8 = "Failed to handle ADD action"
            android.util.Log.e(r9, r8, r7)
        Lb5:
            r6.maybeStartWatchingRequirements()
            com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager r7 = r6.downloadManager
            boolean r7 = r7.isIdle()
            if (r7 == 0) goto Lc3
            r6.stop()
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        logd("onTaskRemoved rootIntent: " + intent);
        this.taskRemoved = true;
    }

    public void onTaskStateChanged(DownloadManager.TaskState taskState) {
    }

    public DownloadService(int i10, long j3) {
        this(i10, j3, null, 0);
    }

    public DownloadService(int i10, long j3, String str, int i11) {
        this.foregroundNotificationUpdater = new ForegroundNotificationUpdater(i10, j3);
        this.channelId = str;
        this.channelName = i11;
    }
}
