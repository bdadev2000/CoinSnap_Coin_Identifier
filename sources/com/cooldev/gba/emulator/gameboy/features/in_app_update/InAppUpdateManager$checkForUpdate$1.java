package com.cooldev.gba.emulator.gameboy.features.in_app_update;

import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class InAppUpdateManager$checkForUpdate$1 extends r implements l {
    final /* synthetic */ ActivityResultLauncher<IntentSenderRequest> $updateLauncher;
    final /* synthetic */ InAppUpdateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateManager$checkForUpdate$1(InAppUpdateManager inAppUpdateManager, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        super(1);
        this.this$0 = inAppUpdateManager;
        this.$updateLauncher = activityResultLauncher;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppUpdateInfo) obj);
        return b0.f30125a;
    }

    public final void invoke(AppUpdateInfo appUpdateInfo) {
        String str;
        String str2;
        int i2;
        int i3;
        str = InAppUpdateManager.TAG;
        Log.d(str, "Update availability status: " + appUpdateInfo.updateAvailability());
        Integer clientVersionStalenessDays = appUpdateInfo.clientVersionStalenessDays();
        if (clientVersionStalenessDays == null) {
            clientVersionStalenessDays = -1;
        }
        int intValue = clientVersionStalenessDays.intValue();
        str2 = InAppUpdateManager.TAG;
        Log.d(str2, "Update available. Staleness days: " + intValue);
        if (appUpdateInfo.updateAvailability() != 2) {
            if (appUpdateInfo.updateAvailability() == 3) {
                this.this$0.continueUpdate(appUpdateInfo, this.$updateLauncher);
            }
        } else if (intValue >= 7) {
            InAppUpdateManager inAppUpdateManager = this.this$0;
            i3 = inAppUpdateManager.stalenessAppUpdateType;
            inAppUpdateManager.startUpdateIfAllowed(appUpdateInfo, i3, this.$updateLauncher);
        } else {
            InAppUpdateManager inAppUpdateManager2 = this.this$0;
            i2 = inAppUpdateManager2.appUpdateType;
            inAppUpdateManager2.startUpdateIfAllowed(appUpdateInfo, i2, this.$updateLauncher);
        }
    }
}
