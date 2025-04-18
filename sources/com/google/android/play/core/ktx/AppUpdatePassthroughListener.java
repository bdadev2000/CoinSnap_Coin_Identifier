package com.google.android.play.core.ktx;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppUpdatePassthroughListener implements InstallStateUpdatedListener {

    @NotNull
    private final l disposeAction;

    @NotNull
    private final InstallStateUpdatedListener listener;

    public AppUpdatePassthroughListener(@NotNull InstallStateUpdatedListener installStateUpdatedListener, @NotNull l lVar) {
        a.s(installStateUpdatedListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        a.s(lVar, "disposeAction");
        this.listener = installStateUpdatedListener;
        this.disposeAction = lVar;
    }

    @NotNull
    public final l getDisposeAction() {
        return this.disposeAction;
    }

    @NotNull
    public final InstallStateUpdatedListener getListener() {
        return this.listener;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(@NotNull InstallState installState) {
        a.s(installState, "state");
        this.listener.onStateUpdate(installState);
        int installStatus = installState.installStatus();
        if (installStatus == 0 || installStatus == 11 || installStatus == 5 || installStatus == 6) {
            this.disposeAction.invoke(this);
        }
    }
}
