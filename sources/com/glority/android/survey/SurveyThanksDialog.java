package com.glority.android.survey;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.glority.android.survey.event.LogEvents;
import com.glority.android.ui.base.BaseDialog;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyThanksDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/glority/android/survey/SurveyThanksDialog;", "Lcom/glority/android/ui/base/BaseDialog;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getLayoutId", "", "getLogPageName", "", "initView", "", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyThanksDialog extends BaseDialog {
    private final Activity activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyThanksDialog(Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_survey_thanks;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.SURVEY_THANKS;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setDialogWidthPercent(0.8f);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.glority.android.survey.SurveyThanksDialog$initView$1
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity;
                Activity activity2;
                activity = SurveyThanksDialog.this.activity;
                if (activity.isFinishing()) {
                    return;
                }
                activity2 = SurveyThanksDialog.this.activity;
                if (activity2.isDestroyed()) {
                    return;
                }
                SurveyThanksDialog.this.dismiss();
            }
        }, SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
