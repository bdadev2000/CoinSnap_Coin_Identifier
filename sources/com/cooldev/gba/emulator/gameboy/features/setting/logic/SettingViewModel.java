package com.cooldev.gba.emulator.gameboy.features.setting.logic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.cooldev.gba.emulator.gameboy.constants.MyConstants;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.safedk.android.utils.Logger;
import d0.b0;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SettingViewModel extends ViewModel {
    public static final int $stable = 0;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        p02.startActivity(p12);
    }

    private final void setDisableOpenAds(Context context) {
        AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(context, false);
    }

    public final void onTapContactUs(@NotNull Context context) {
        a.s(context, "context");
        try {
            setDisableOpenAds(context);
            String[] strArr = {MyConstants.EMAIL_CONTACT};
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", strArr);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, Intent.createChooser(intent, "Send mail..."));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            b0.a.b(context, "Unable to send email.").show();
        }
    }

    public final void onTapPolicy(@NotNull Context context) {
        a.s(context, "context");
        try {
            setDisableOpenAds(context);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(MyConstants.PRIVACY_POLICY)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
            b0.a.b(context, "Unable to open privacy policy.").show();
        }
    }

    public final void onTapRateApp(@NotNull Context context) {
        a.s(context, "ctx");
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + context.getApplicationContext().getPackageName())));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            b0.a.b(context, "Unable to open app rating.").show();
        }
    }

    public final void onTapStore(@NotNull Context context) {
        a.s(context, "context");
        try {
            setDisableOpenAds(context);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/dev?id=5724175075891781466")));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
            b0.a.b(context, "Unable to open app store.").show();
        }
    }

    public final void onTapSubscription(@NotNull Context context) {
        a.s(context, "context");
        try {
            setDisableOpenAds(context);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(MyConstants.SUBSCRIPTION)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
            b0.a.b(context, "Unable to open subscription page.").show();
        }
    }

    public final void onTapTerm(@NotNull Context context) {
        a.s(context, "context");
        try {
            setDisableOpenAds(context);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(MyConstants.TERM_OF_USE)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            System.out.print(b0.f30125a);
            b0.a.b(context, "Unable to open terms of use.").show();
        }
    }
}
