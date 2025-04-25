package com.glority.android.picturexx.view.dialog;

import android.app.Activity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.utils.DialogUtil;
import com.glority.android.survey.DialogType;
import com.glority.android.survey.SurveyDialog;
import com.glority.android.xx.constants.Constants;
import com.glority.base.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinSatisfactionSurveyDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CoinSatisfactionSurveyDialog;", "", "<init>", "()V", "open", "", "context", "Landroid/app/Activity;", "logPageName", "", "itemId", "", "captureCount", "", "onComplete", "Lkotlin/Function0;", "canShow", "", Constants.recognizeCount, "isVip", "isSample", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinSatisfactionSurveyDialog {
    public static final int $stable = 0;
    public static final CoinSatisfactionSurveyDialog INSTANCE = new CoinSatisfactionSurveyDialog();

    private CoinSatisfactionSurveyDialog() {
    }

    public final void open(Activity context, String logPageName, long itemId, int captureCount, final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logPageName, "logPageName");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        SurveyDialog.INSTANCE.showDialog(context, CollectionsKt.arrayListOf(Integer.valueOf(R.string.survey_option_1), Integer.valueOf(R.string.survey_option_2), Integer.valueOf(R.string.survey_option_3), Integer.valueOf(R.string.survey_option_4), Integer.valueOf(R.string.survey_text_reason_none_of_above)), itemId, captureCount, AppViewModel.INSTANCE.isVip(), logPageName, new SurveyDialog.SurveyListener() { // from class: com.glority.android.picturexx.view.dialog.CoinSatisfactionSurveyDialog$open$1
            @Override // com.glority.android.survey.SurveyDialog.SurveyListener
            public void complete(Boolean status) {
                if (status != null) {
                    DialogUtil.INSTANCE.setTodayHasShown();
                }
                onComplete.invoke();
            }
        }, (r21 & 128) != 0 ? DialogType.SINGLE_CHOICE : null);
    }

    public final boolean canShow(int recognizeCount, boolean isVip, boolean isSample) {
        return !DialogUtil.INSTANCE.todayHasShown() && SurveyDialog.INSTANCE.needShow(recognizeCount, isVip, isSample);
    }
}
