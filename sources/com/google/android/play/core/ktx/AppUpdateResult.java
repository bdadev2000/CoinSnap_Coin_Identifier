package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import d0.b0;
import h0.g;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public class AppUpdateResult {

    /* loaded from: classes.dex */
    public static final class Downloaded extends AppUpdateResult {

        @NotNull
        private final AppUpdateManager appUpdateManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(@NotNull AppUpdateManager appUpdateManager) {
            super(null);
            a.s(appUpdateManager, "appUpdateManager");
            this.appUpdateManager = appUpdateManager;
        }

        @Nullable
        public final Object completeUpdate(@NotNull g gVar) {
            Object requestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, gVar);
            return requestCompleteUpdate == i0.a.f30806a ? requestCompleteUpdate : b0.f30125a;
        }
    }

    /* loaded from: classes.dex */
    public static final class InProgress extends AppUpdateResult {

        @NotNull
        private final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(@NotNull InstallState installState) {
            super(null);
            a.s(installState, "installState");
            this.installState = installState;
        }

        @NotNull
        public final InstallState getInstallState() {
            return this.installState;
        }
    }

    /* loaded from: classes.dex */
    public static final class NotAvailable extends AppUpdateResult {

        @NotNull
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    private AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(k kVar) {
        this();
    }

    /* loaded from: classes.dex */
    public static final class Available extends AppUpdateResult {

        @NotNull
        private final AppUpdateManager appUpdateManager;

        @NotNull
        private final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(@NotNull AppUpdateManager appUpdateManager, @NotNull AppUpdateInfo appUpdateInfo) {
            super(null);
            a.s(appUpdateManager, "appUpdateManager");
            a.s(appUpdateInfo, "updateInfo");
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = appUpdateInfo;
        }

        @NotNull
        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public final boolean startFlexibleUpdate(@NotNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            a.s(activityResultLauncher, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(0).build());
        }

        public final boolean startImmediateUpdate(@NotNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            a.s(activityResultLauncher, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        }

        public final boolean startFlexibleUpdate(@NotNull Activity activity, int i2) {
            a.s(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(0).build(), i2);
        }

        public final boolean startImmediateUpdate(@NotNull Activity activity, int i2) {
            a.s(activity, "activity");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(1).build(), i2);
        }

        public final boolean startFlexibleUpdate(@NotNull Fragment fragment, int i2) {
            a.s(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(0).build();
            a.r(build, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i2);
        }

        public final boolean startImmediateUpdate(@NotNull Fragment fragment, int i2) {
            a.s(fragment, "fragment");
            AppUpdateManager appUpdateManager = this.appUpdateManager;
            AppUpdateInfo appUpdateInfo = this.updateInfo;
            AppUpdateOptions build = AppUpdateOptions.newBuilder(1).build();
            a.r(build, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(appUpdateManager, appUpdateInfo, fragment, build, i2);
        }
    }
}
