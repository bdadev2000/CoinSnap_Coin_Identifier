package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.cooldev.gba.emulator.gameboy.constants.MyConstants;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.safedk.android.utils.Logger;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PurchasePageViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasePageViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
        this.context = application.getApplicationContext();
        i1 c2 = t0.c(new PurchasePageState(null, 1, 0 == true ? 1 : 0));
        this._state = c2;
        this.state = new o0(c2);
        fetchDataRemoteConfig();
    }

    private final void fetchDataRemoteConfig() {
        e.v(ViewModelKt.a(this), null, 0, new PurchasePageViewModel$fetchDataRemoteConfig$1(this, null), 3);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        p02.startActivity(p12);
    }

    private final void setDisableOpenAds() {
        AppOpenAdPrefUtils appOpenAdPrefUtils = AppOpenAdPrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        appOpenAdPrefUtils.setShowAppOpenAdOnResume(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void onTapPolicy(@NotNull Context context) {
        a.s(context, "ctx");
        try {
            setDisableOpenAds();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(MyConstants.PRIVACY_POLICY)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
        }
    }

    public final void onTapTerm(@NotNull Context context) {
        a.s(context, "ctx");
        try {
            setDisableOpenAds();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(MyConstants.TERM_OF_USE)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
        }
    }
}
