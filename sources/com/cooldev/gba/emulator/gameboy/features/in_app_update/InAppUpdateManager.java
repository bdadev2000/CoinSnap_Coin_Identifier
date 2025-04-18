package com.cooldev.gba.emulator.gameboy.features.in_app_update;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.o0;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import g1.u;
import h1.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class InAppUpdateManager {
    private static final int DAYS_FOR_FLEXIBLE_UPDATE = 7;

    @NotNull
    private final AppUpdateManager appUpdateManager;
    private final int appUpdateType;

    @NotNull
    private final Context context;

    @NotNull
    private final InstallStateUpdatedListener flexibleUpdateListener;
    private final int stalenessAppUpdateType;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Nullable
    private static final String TAG = g0.a(InAppUpdateManager.class).c();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public InAppUpdateManager(@NotNull Context context, int i2) {
        p0.a.s(context, "context");
        this.context = context;
        this.appUpdateType = i2;
        AppUpdateManager create = AppUpdateManagerFactory.create(context);
        p0.a.r(create, "create(...)");
        this.appUpdateManager = create;
        this.stalenessAppUpdateType = 1;
        this.flexibleUpdateListener = new InstallStateUpdatedListener() { // from class: com.cooldev.gba.emulator.gameboy.features.in_app_update.a
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                InAppUpdateManager.flexibleUpdateListener$lambda$4(InAppUpdateManager.this, installState);
            }
        };
    }

    public static final void checkForUpdate$lambda$0(l lVar, Object obj) {
        p0.a.s(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public static final void checkForUpdate$lambda$1(Exception exc) {
        p0.a.s(exc, "it");
        Log.e(TAG, "Failed to check for updates: " + exc.getMessage());
    }

    public final void continueUpdate(AppUpdateInfo appUpdateInfo, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        Log.d(TAG, "Continuing update process that is in progress...");
        try {
            this.appUpdateManager.startUpdateFlowForResult(appUpdateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public static final void flexibleUpdateListener$lambda$4(InAppUpdateManager inAppUpdateManager, InstallState installState) {
        p0.a.s(inAppUpdateManager, "this$0");
        p0.a.s(installState, "state");
        int installStatus = installState.installStatus();
        if (installStatus == 2) {
            Log.d(TAG, "Downloading update: " + installState.bytesDownloaded() + " / " + installState.totalBytesToDownload());
            return;
        }
        if (installStatus == 5) {
            Log.e(TAG, "Update download failed!");
            return;
        }
        if (installStatus == 11) {
            Log.d(TAG, "Update downloaded successfully.");
            inAppUpdateManager.showUpdateCompletion();
        } else {
            Log.d(TAG, "Current install status: " + installState.installStatus());
        }
    }

    private final void registerListenerForFlexibleUpdate(int i2) {
        if (i2 == 0) {
            this.appUpdateManager.registerListener(this.flexibleUpdateListener);
            Log.d(TAG, "Registering listener for flexible update...");
        }
    }

    private final void showUpdateCompletion() {
        Toast.makeText(this.context, "Download successful. Restarting app in 5 seconds.", 1).show();
        d dVar = o0.f22355a;
        e.v(p0.a.c(u.f30639a), null, 0, new InAppUpdateManager$showUpdateCompletion$1(this, null), 3);
    }

    private final void startUpdate(AppUpdateInfo appUpdateInfo, int i2, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        Log.d(TAG, "Starting update flow with update type: " + i2);
        try {
            this.appUpdateManager.startUpdateFlowForResult(appUpdateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(i2).build());
            registerListenerForFlexibleUpdate(i2);
        } catch (Throwable th) {
            q.d(th);
        }
    }

    public final void startUpdateIfAllowed(AppUpdateInfo appUpdateInfo, int i2, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (!appUpdateInfo.isUpdateTypeAllowed(i2)) {
            Log.e(TAG, "Update type is not allowed. Cannot proceed with update.");
        } else {
            Log.d(TAG, "Update type is allowed. Starting update...");
            startUpdate(appUpdateInfo, i2, activityResultLauncher);
        }
    }

    public final void checkForUpdate(@NotNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        p0.a.s(activityResultLauncher, "updateLauncher");
        Task<AppUpdateInfo> appUpdateInfo = this.appUpdateManager.getAppUpdateInfo();
        p0.a.r(appUpdateInfo, "getAppUpdateInfo(...)");
        appUpdateInfo.addOnSuccessListener(new com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.a(new InAppUpdateManager$checkForUpdate$1(this, activityResultLauncher))).addOnFailureListener(new androidx.compose.animation.core.a(0));
    }

    public final void unregisterListener() {
        if (this.appUpdateType == 0) {
            this.appUpdateManager.unregisterListener(this.flexibleUpdateListener);
        }
    }
}
