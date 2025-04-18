package com.google.android.play.core.ktx;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import b1.f0;
import b1.k;
import b1.l;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import d0.b0;
import d1.s;
import e1.h;
import h0.g;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes.dex */
public final class AppUpdateManagerKtxKt {
    public static final long getBytesDownloaded(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.bytesDownloaded();
    }

    @Nullable
    public static final Integer getClientVersionStalenessDays(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.clientVersionStalenessDays();
    }

    public static final boolean getHasTerminalStatus(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        int installStatus = installState.installStatus();
        return installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6;
    }

    @InstallErrorCode
    public static final int getInstallErrorCode(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        return installState.installErrorCode();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.installStatus();
    }

    @NotNull
    public static final String getPackageName(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        String packageName = installState.packageName();
        a.r(packageName, "packageName()");
        return packageName;
    }

    public static final long getTotalBytesToDownload(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.totalBytesToDownload();
    }

    public static final int getUpdatePriority(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.updatePriority();
    }

    public static final boolean isFlexibleUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(0);
    }

    public static final boolean isImmediateUpdateAllowed(@NotNull AppUpdateInfo appUpdateInfo) {
        a.s(appUpdateInfo, "<this>");
        return appUpdateInfo.isUpdateTypeAllowed(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object requestAppUpdateInfo(@org.jetbrains.annotations.NotNull com.google.android.play.core.appupdate.AppUpdateManager r4, @org.jetbrains.annotations.NotNull h0.g r5) {
        /*
            boolean r0 = r5 instanceof com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            if (r0 == 0) goto L13
            r0 = r5
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = (com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1 r0 = new com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestAppUpdateInfo$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.jvm.internal.q.m(r5)
            com.google.android.gms.tasks.Task r4 = r4.getAppUpdateInfo()
            java.lang.String r5 = "appUpdateInfo"
            p0.a.r(r4, r5)
            r0.label = r3
            r5 = 0
            r2 = 2
            java.lang.Object r5 = runTask$default(r4, r5, r0, r2, r5)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "runTask(appUpdateInfo)"
            p0.a.r(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestAppUpdateInfo(com.google.android.play.core.appupdate.AppUpdateManager, h0.g):java.lang.Object");
    }

    @Nullable
    public static final Object requestCompleteUpdate(@NotNull AppUpdateManager appUpdateManager, @NotNull g gVar) {
        Task<Void> completeUpdate = appUpdateManager.completeUpdate();
        a.r(completeUpdate, "completeUpdate()");
        Object runTask$default = runTask$default(completeUpdate, null, gVar, 2, null);
        return runTask$default == i0.a.f30806a ? runTask$default : b0.f30125a;
    }

    @NotNull
    public static final h requestUpdateFlow(@NotNull AppUpdateManager appUpdateManager) throws InstallException {
        a.s(appUpdateManager, "<this>");
        return a.k(a.l(new AppUpdateManagerKtxKt$requestUpdateFlow$1(appUpdateManager, null)), -1);
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull q0.a aVar, @NotNull g gVar) {
        final l lVar = new l(1, f0.r(gVar));
        lVar.p();
        lVar.z(new AppUpdateManagerKtxKt$runTask$3$1(aVar));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t2) {
                    k.this.resumeWith(t2);
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(@NotNull Exception exc) {
                    a.s(exc, "exception");
                    k.this.resumeWith(q.d(exc));
                }
            });
        } else if (task.isSuccessful()) {
            lVar.resumeWith(task.getResult());
        } else {
            Exception exception = task.getException();
            a.p(exception);
            lVar.resumeWith(q.d(exception));
        }
        Object o2 = lVar.o();
        i0.a aVar2 = i0.a.f30806a;
        return o2;
    }

    public static /* synthetic */ Object runTask$default(Task task, q0.a aVar, g gVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = AppUpdateManagerKtxKt$runTask$2.INSTANCE;
        }
        return runTask(task, aVar, gVar);
    }

    public static final boolean startUpdateFlowForResult(@NotNull AppUpdateManager appUpdateManager, @NotNull AppUpdateInfo appUpdateInfo, @NotNull final Fragment fragment, @NotNull AppUpdateOptions appUpdateOptions, int i2) throws IntentSender.SendIntentException {
        a.s(appUpdateManager, "<this>");
        a.s(appUpdateInfo, "appUpdateInfo");
        a.s(fragment, "fragment");
        a.s(appUpdateOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        return appUpdateManager.startUpdateFlowForResult(appUpdateInfo, new IntentSenderForResultStarter() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$startUpdateFlowForResult$1
            @Override // com.google.android.play.core.common.IntentSenderForResultStarter
            public final void startIntentSenderForResult(@NotNull IntentSender intentSender, int i3, @Nullable Intent intent, int i4, int i5, int i6, @Nullable Bundle bundle) {
                a.s(intentSender, "p0");
                Fragment.this.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
            }
        }, appUpdateOptions, i2);
    }

    public static final <E> boolean tryOffer(@NotNull s sVar, E e) {
        a.s(sVar, "<this>");
        return !(sVar.b(e) instanceof d1.h);
    }

    public static final long getBytesDownloaded(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        return installState.bytesDownloaded();
    }

    @InstallStatus
    public static final int getInstallStatus(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        return installState.installStatus();
    }

    public static final long getTotalBytesToDownload(@NotNull InstallState installState) {
        a.s(installState, "<this>");
        return installState.totalBytesToDownload();
    }
}
