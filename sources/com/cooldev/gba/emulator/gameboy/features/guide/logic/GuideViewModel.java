package com.cooldev.gba.emulator.gameboy.features.guide.logic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.safedk.android.utils.Logger;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GuideViewModel extends ViewModel {
    public static final int $stable = 8;

    @SuppressLint({"StaticFieldLeak"})
    @NotNull
    private final m0 _state;

    @NotNull
    private final g1 state;

    public GuideViewModel() {
        i1 c2 = t0.c(new GuideState(false, 1, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        p02.startActivity(p12);
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void onDownloadGame(@NotNull Context context, @NotNull String str) {
        a.s(context, "ctx");
        a.s(str, "url");
        try {
            AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(context, false);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
        }
    }
}
