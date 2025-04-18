package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.safedk.android.utils.Logger;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import org.jetbrains.annotations.NotNull;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RatingDialogViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingDialogViewModel(@NotNull Application application) {
        super(application);
        p0.a.s(application, "application");
        i1 c2 = t0.c(new RatingDialogState(0, 1, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    public static final void onTapSubmitButton$lambda$0(ReviewManager reviewManager, Activity activity, Task task) {
        p0.a.s(reviewManager, "$reviewManager");
        p0.a.s(activity, "$activity");
        p0.a.s(task, "it");
        Log.d("vuoncog", "In-app: " + task.isSuccessful());
        if (task.isSuccessful()) {
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult());
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        p02.startActivity(p12);
    }

    private final void updateState(l lVar) {
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

    public final void onTapStar(int i2) {
        updateState(new RatingDialogViewModel$onTapStar$1(i2));
    }

    public final void onTapSubmitButton(@NotNull Context context, int i2, boolean z2) {
        p0.a.s(context, "ctx");
        Activity activity = (Activity) context;
        if (1 > i2 || i2 >= 6) {
            return;
        }
        if (4 <= i2 && i2 < 6 && !z2) {
            ReviewManager create = ReviewManagerFactory.create(context);
            p0.a.r(create, "create(...)");
            create.requestReviewFlow().addOnCompleteListener(new a(0, activity, create));
            return;
        }
        String packageName = activity.getApplicationContext().getPackageName();
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            th.printStackTrace();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }
}
