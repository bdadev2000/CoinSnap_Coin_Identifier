package com.glority.android.picturexx.view.dialog;

import android.app.Activity;
import android.view.View;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.utils.DialogUtil;
import com.glority.android.ui.base.BaseDialog;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.ui.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.RandomKt;

/* compiled from: WebSurveyDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/WebSurveyDialog;", "Lcom/glority/android/ui/base/BaseDialog;", "activity", "Landroid/app/Activity;", "callBack", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "getLayoutId", "", "getLogPageName", "", "initView", "onBackPressed", "dismiss", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class WebSurveyDialog extends BaseDialog {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_WEB_SURVEY_COUNT = "key_web_survey_count";
    public static final String KEY_WEB_SURVEY_DONE = "key_web_survey_done";
    private final Function1<Boolean, Unit> callBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebSurveyDialog(Activity activity, Function1<? super Boolean, Unit> callBack) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.callBack = callBack;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_web_survey;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.websurvey;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        BaseDialog.logEvent$default(this, LogEvents.questionnaire_open, null, 2, null);
        PersistData.INSTANCE.set(KEY_WEB_SURVEY_COUNT, Integer.valueOf(((Number) PersistData.INSTANCE.get(KEY_WEB_SURVEY_COUNT, 0)).intValue() + 1));
        DialogUtil.INSTANCE.setTodayHasShown();
        setCanceledOnTouchOutside(false);
        setGravity(80);
        setDialogWidth(ViewUtils.getScreenWidth());
        View findViewById = findViewById(R.id.iv_close);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.WebSurveyDialog$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(it, "it");
                function1 = WebSurveyDialog.this.callBack;
                function1.invoke(false);
                WebSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
        View findViewById2 = findViewById(R.id.tv_yes_sure);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.WebSurveyDialog$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(it, "it");
                BaseDialog.logEvent$default(WebSurveyDialog.this, LogEvents.questionnaire_yes_click, null, 2, null);
                PersistData.INSTANCE.set(WebSurveyDialog.KEY_WEB_SURVEY_DONE, 1);
                function1 = WebSurveyDialog.this.callBack;
                function1.invoke(true);
                WebSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
        View findViewById3 = findViewById(R.id.tv_next_time);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.WebSurveyDialog$initView$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(it, "it");
                BaseDialog.logEvent$default(WebSurveyDialog.this, LogEvents.questionnaire_next_click, null, 2, null);
                function1 = WebSurveyDialog.this.callBack;
                function1.invoke(false);
                WebSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
        this.callBack.invoke(false);
    }

    @Override // com.glority.android.ui.base.BaseDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        BaseDialog.logEvent$default(this, LogEvents.questionnaire_close, null, 2, null);
    }

    /* compiled from: WebSurveyDialog.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/WebSurveyDialog$Companion;", "", "<init>", "()V", "KEY_WEB_SURVEY_DONE", "", "KEY_WEB_SURVEY_COUNT", "canShow", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean canShow() {
            int intValue = ((Number) PersistData.INSTANCE.get(WebSurveyDialog.KEY_WEB_SURVEY_DONE, 0)).intValue();
            int intValue2 = ((Number) PersistData.INSTANCE.get(WebSurveyDialog.KEY_WEB_SURVEY_COUNT, 0)).intValue();
            int surveyVip = CoinAbTestUtils.INSTANCE.surveyVip();
            int surveyNoVip = CoinAbTestUtils.INSTANCE.surveyNoVip();
            VipInfo value = AppViewModel.INSTANCE.getInstance().getVipInfo().getValue();
            boolean isVip = value != null ? value.getIsVip() : false;
            int nextInt = RandomKt.Random(System.currentTimeMillis()).nextInt(0, 10000) / 100;
            return intValue == 0 && intValue2 < 2 && !DialogUtil.INSTANCE.todayHasShown() && (!isVip ? nextInt < surveyNoVip : nextInt < surveyVip);
        }
    }
}
