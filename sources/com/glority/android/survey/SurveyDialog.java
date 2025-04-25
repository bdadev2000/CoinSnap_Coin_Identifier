package com.glority.android.survey;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.cmsui.entity.LikeItem;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddTagToItemRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.survey.SurveyDialog;
import com.glority.android.survey.SurveyReasonDialog;
import com.glority.android.survey.SurveyReasonInputDialog;
import com.glority.android.survey.base.PersistKey;
import com.glority.android.survey.base.SurveyAbTest;
import com.glority.android.survey.event.LogEvents;
import com.glority.android.surveyEvent.Satisfaction;
import com.glority.android.ui.base.BaseDialog;
import com.glority.android.xx.constants.Constants;
import com.glority.utils.ui.ToastUtils;
import com.glority.utils.ui.ViewUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.RandomKt;
import org.json.JSONObject;

/* compiled from: SurveyDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 (2\u00020\u0001:\u0002()BY\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0006H\u0014J\b\u0010\u001b\u001a\u00020\rH\u0014J\"\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J$\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0002J5\u0010$\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/glority/android/survey/SurveyDialog;", "Lcom/glority/android/ui/base/BaseDialog;", "activity", "Landroid/app/Activity;", "reasons", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "itemId", "", "isVip", "", "from", "", Constants.recognizeCount, "surveyListener", "Lcom/glority/android/survey/SurveyDialog$SurveyListener;", "dialogType", "Lcom/glority/android/survey/DialogType;", "(Landroid/app/Activity;Ljava/util/ArrayList;JZLjava/lang/String;ILcom/glority/android/survey/SurveyDialog$SurveyListener;Lcom/glority/android/survey/DialogType;)V", "click", "", "yes", "getBundle", "Landroid/os/Bundle;", "index", "getLayoutId", "getLogPageName", "getSurveyResultBasicBundle", "surveyResult", "int1", "content", "initView", "openSurveyReasonDialog", "openSurveyReasonInputDialog", "sendSurveyReasonInputResultEvent", "sendSurveyResultEvent", "optionContent", "optionIndex", "(ZILjava/lang/String;Ljava/lang/Integer;)V", "Companion", "SurveyListener", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyDialog extends BaseDialog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Activity activity;
    private final DialogType dialogType;
    private final String from;
    private final boolean isVip;
    private final long itemId;
    private final ArrayList<Integer> reasons;
    private final int recognizeCount;
    private final SurveyListener surveyListener;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DialogType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DialogType.SINGLE_CHOICE.ordinal()] = 1;
            iArr[DialogType.REASON_INPUT.ordinal()] = 2;
        }
    }

    @JvmStatic
    public static final void checkAndShow(Activity activity, ArrayList<Integer> arrayList, long j, boolean z, int i, boolean z2, String str, SurveyListener surveyListener, DialogType dialogType) {
        INSTANCE.checkAndShow(activity, arrayList, j, z, i, z2, str, surveyListener, dialogType);
    }

    @JvmStatic
    public static final boolean needShow(int i, boolean z, boolean z2) {
        return INSTANCE.needShow(i, z, z2);
    }

    @JvmStatic
    public static final void showDialog(Activity activity, ArrayList<Integer> arrayList, long j, int i, boolean z, String str, SurveyListener surveyListener, DialogType dialogType) {
        INSTANCE.showDialog(activity, arrayList, j, i, z, str, surveyListener, dialogType);
    }

    public /* synthetic */ SurveyDialog(Activity activity, ArrayList arrayList, long j, boolean z, String str, int i, SurveyListener surveyListener, DialogType dialogType, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, arrayList, j, z, str, i, surveyListener, dialogType);
    }

    /* synthetic */ SurveyDialog(Activity activity, ArrayList arrayList, long j, boolean z, String str, int i, SurveyListener surveyListener, DialogType dialogType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, arrayList, j, z, str, i, surveyListener, (i2 & 128) != 0 ? DialogType.SINGLE_CHOICE : dialogType);
    }

    private SurveyDialog(Activity activity, ArrayList<Integer> arrayList, long j, boolean z, String str, int i, SurveyListener surveyListener, DialogType dialogType) {
        super(activity);
        this.activity = activity;
        this.reasons = arrayList;
        this.itemId = j;
        this.isVip = z;
        this.from = str;
        this.recognizeCount = i;
        this.surveyListener = surveyListener;
        this.dialogType = dialogType;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.SURVEY;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_survey;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        updateCommonEventArgs(TuplesKt.to("from", this.from), TuplesKt.to("id", String.valueOf(this.itemId)), TuplesKt.to("name", "Style1"));
        new LogEventRequest(LogEvents.INSTANCE.eventOpen(LogEvents.SURVEY_BQ), getBundle$default(this, 0, 1, null)).post();
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setDialogWidthPercent(0.8f);
        setGravity(17);
        final boolean nextBoolean = RandomKt.Random(System.currentTimeMillis()).nextBoolean();
        findViewById(R.id.btn1_icon).setBackgroundResource(nextBoolean ? R.drawable.survey_emoji_yes : R.drawable.survey_emoji_no);
        ((AppCompatTextView) findViewById(R.id.btn1_text)).setText(nextBoolean ? R.string.text_yes : R.string.text_no);
        findViewById(R.id.btn2_icon).setBackgroundResource(nextBoolean ? R.drawable.survey_emoji_no : R.drawable.survey_emoji_yes);
        ((AppCompatTextView) findViewById(R.id.btn2_text)).setText(nextBoolean ? R.string.text_no : R.string.text_yes);
        LinearLayout btn1 = (LinearLayout) findViewById(R.id.btn1);
        Intrinsics.checkNotNullExpressionValue(btn1, "btn1");
        ViewExtensionsKt.setSingleClickListener$default(btn1, 0L, new Function1<View, Unit>() { // from class: com.glority.android.survey.SurveyDialog$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Intrinsics.checkNotNullParameter(it, "it");
                SurveyDialog.this.click(nextBoolean);
            }
        }, 1, (Object) null);
        LinearLayout btn2 = (LinearLayout) findViewById(R.id.btn2);
        Intrinsics.checkNotNullExpressionValue(btn2, "btn2");
        ViewExtensionsKt.setSingleClickListener$default(btn2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.survey.SurveyDialog$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Intrinsics.checkNotNullParameter(it, "it");
                SurveyDialog.this.click(!nextBoolean);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void click(boolean yes) {
        if (!yes) {
            new LogEventRequest(LogEvents.SURVEY_BQ_NO, getBundle$default(this, 0, 1, null)).post();
            new SurveyAddTagToItemRequest(this.itemId, new String[]{Satisfaction.NO.getValue()}).post();
            int i = WhenMappings.$EnumSwitchMapping$0[this.dialogType.ordinal()];
            if (i == 1) {
                openSurveyReasonDialog();
            } else if (i == 2) {
                openSurveyReasonInputDialog();
            }
        } else {
            new LogEventRequest(LogEvents.SURVEY_BQ_YES, getBundle$default(this, 0, 1, null)).post();
            new SurveyAddTagToItemRequest(this.itemId, new String[]{Satisfaction.YES.getValue()}).post();
            sendSurveyResultEvent$default(this, true, 1, null, null, 12, null);
            SurveyThanksDialog surveyThanksDialog = new SurveyThanksDialog(this.activity);
            surveyThanksDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.glority.android.survey.SurveyDialog$click$1
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SurveyDialog.SurveyListener surveyListener;
                    surveyListener = SurveyDialog.this.surveyListener;
                    surveyListener.complete(true);
                }
            });
            if (!this.activity.isFinishing() && !this.activity.isDestroyed()) {
                surveyThanksDialog.show();
            }
        }
        dismiss();
    }

    private final void openSurveyReasonDialog() {
        new SurveyReasonDialog(this.activity, this.reasons, new SurveyReasonDialog.SelectedListener() { // from class: com.glority.android.survey.SurveyDialog$openSurveyReasonDialog$1
            @Override // com.glority.android.survey.SurveyReasonDialog.SelectedListener
            public void result(int index, String content) {
                Bundle bundle;
                SurveyDialog.SurveyListener surveyListener;
                if (index != -1) {
                    bundle = SurveyDialog.this.getBundle(index);
                    new LogEventRequest(LogEvents.SURVEY_BA_SUBMIT, bundle).post();
                } else {
                    new LogEventRequest(LogEvents.SURVEY_BA_CLOSE, SurveyDialog.getBundle$default(SurveyDialog.this, 0, 1, null)).post();
                }
                SurveyDialog.this.sendSurveyResultEvent(false, 0, content, Integer.valueOf(index));
                surveyListener = SurveyDialog.this.surveyListener;
                surveyListener.complete(false);
            }
        }).show();
    }

    private final void openSurveyReasonInputDialog() {
        SurveyReasonInputDialog surveyReasonInputDialog = new SurveyReasonInputDialog(this.activity, new SurveyReasonInputDialog.OnFinishInputListener() { // from class: com.glority.android.survey.SurveyDialog$openSurveyReasonInputDialog$1
            @Override // com.glority.android.survey.SurveyReasonInputDialog.OnFinishInputListener
            public void onSubmit(String input) {
                SurveyDialog.SurveyListener surveyListener;
                Bundle bundle$default = SurveyDialog.getBundle$default(SurveyDialog.this, 0, 1, null);
                String str = input;
                if (str != null && str.length() != 0) {
                    bundle$default = LogEventArgumentsKt.logEventBundleAdd(bundle$default, TuplesKt.to("content", input));
                }
                new LogEventRequest(LogEvents.SURVEY_REASON_SUBMIT_CLICK, bundle$default).post();
                ToastUtils.showLong(R.string.dissatisfactionsurvey_feedback_text);
                SurveyDialog.this.sendSurveyReasonInputResultEvent(false, 0, input);
                surveyListener = SurveyDialog.this.surveyListener;
                surveyListener.complete(false);
            }

            @Override // com.glority.android.survey.SurveyReasonInputDialog.OnFinishInputListener
            public void onClose() {
                SurveyDialog.SurveyListener surveyListener;
                new LogEventRequest(LogEvents.SURVEY_REASON_CLOSE_CLICK, SurveyDialog.getBundle$default(SurveyDialog.this, 0, 1, null)).post();
                SurveyDialog.this.sendSurveyReasonInputResultEvent(false, 0, null);
                surveyListener = SurveyDialog.this.surveyListener;
                surveyListener.complete(false);
            }
        });
        surveyReasonInputDialog.setDialogWidth(ViewUtils.getScreenWidth());
        surveyReasonInputDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle getBundle$default(SurveyDialog surveyDialog, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return surveyDialog.getBundle(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getBundle(int index) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("id", String.valueOf(this.itemId));
        pairArr[1] = TuplesKt.to(LogEventArguments.ARG_NUMBER, Double.valueOf(this.recognizeCount));
        pairArr[2] = TuplesKt.to("vip", this.isVip ? "1" : LikeItem.DISLIKE);
        Bundle logEventBundleOf = LogEventArgumentsKt.logEventBundleOf(pairArr);
        return index >= 0 ? LogEventArgumentsKt.logEventBundleAdd(logEventBundleOf, TuplesKt.to("index", Integer.valueOf(index))) : logEventBundleOf;
    }

    static /* synthetic */ void sendSurveyResultEvent$default(SurveyDialog surveyDialog, boolean z, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        surveyDialog.sendSurveyResultEvent(z, i, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSurveyResultEvent(boolean surveyResult, int int1, String optionContent, Integer optionIndex) {
        Bundle surveyResultBasicBundle = getSurveyResultBasicBundle(surveyResult, int1, null);
        if (optionContent != null) {
            surveyResultBasicBundle = LogEventArgumentsKt.logEventBundleAdd(surveyResultBasicBundle, TuplesKt.to(LogEventArguments.ARG_STRING_2, optionContent));
        }
        if (optionIndex != null) {
            surveyResultBasicBundle = LogEventArgumentsKt.logEventBundleAdd(surveyResultBasicBundle, TuplesKt.to(LogEventArguments.ARG_INTEGER_2, optionIndex));
        }
        new LogEventRequest(LogEvents.SURVEY_RESULT, surveyResultBasicBundle).post();
    }

    static /* synthetic */ void sendSurveyReasonInputResultEvent$default(SurveyDialog surveyDialog, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        surveyDialog.sendSurveyReasonInputResultEvent(z, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSurveyReasonInputResultEvent(boolean surveyResult, int int1, String content) {
        new LogEventRequest(LogEvents.SURVEY_RESULT, getSurveyResultBasicBundle(surveyResult, int1, content)).post();
    }

    private final Bundle getSurveyResultBasicBundle(boolean surveyResult, int int1, String content) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LogEventArguments.ARG_NUMBER, this.recognizeCount);
        String str = content;
        if (str != null && str.length() != 0) {
            jSONObject.put("content", content);
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.to("id", String.valueOf(this.itemId));
        pairArr[1] = TuplesKt.to("name", "Style1");
        pairArr[2] = TuplesKt.to("from", this.from);
        pairArr[3] = TuplesKt.to(LogEventArguments.ARG_STRING_1, surveyResult ? "yes" : "no");
        pairArr[4] = TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(int1));
        pairArr[5] = TuplesKt.to("content", jSONObject.toString());
        return LogEventArgumentsKt.logEventBundleOf(pairArr);
    }

    /* compiled from: SurveyDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/survey/SurveyDialog$SurveyListener;", "", "complete", "", "status", "", "(Ljava/lang/Boolean;)V", "base-survey_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public interface SurveyListener {
        void complete(Boolean status);

        /* compiled from: SurveyDialog.kt */
        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void complete$default(SurveyListener surveyListener, Boolean bool, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: complete");
                }
                if ((i & 1) != 0) {
                    bool = null;
                }
                surveyListener.complete(bool);
            }
        }
    }

    /* compiled from: SurveyDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0007JZ\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, d2 = {"Lcom/glority/android/survey/SurveyDialog$Companion;", "", "()V", "checkAndShow", "", "activity", "Landroid/app/Activity;", "reasons", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "itemId", "", "isSample", "", Constants.recognizeCount, "isVip", "from", "", "surveyListener", "Lcom/glority/android/survey/SurveyDialog$SurveyListener;", "dialogType", "Lcom/glority/android/survey/DialogType;", "needShow", "showDialog", "base-survey_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void checkAndShow(Activity activity, ArrayList<Integer> reasons, long itemId, boolean isSample, int recognizeCount, boolean isVip, String from, SurveyListener surveyListener, DialogType dialogType) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(surveyListener, "surveyListener");
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            if (needShow(recognizeCount, isVip, isSample)) {
                showDialog(activity, reasons, itemId, recognizeCount, isVip, from, surveyListener, dialogType);
            } else {
                SurveyListener.DefaultImpls.complete$default(surveyListener, null, 1, null);
            }
        }

        @JvmStatic
        public final boolean needShow(int recognizeCount, boolean isVip, boolean isSample) {
            Long l = (Long) PersistData.INSTANCE.get(PersistKey.LAST_SHOWN_SURVEY_TS);
            if (DateUtils.isToday(l != null ? l.longValue() : 0L) || isSample) {
                return false;
            }
            int nextInt = RandomKt.Random(System.currentTimeMillis()).nextInt(100);
            if (isVip) {
                if (recognizeCount == 1) {
                    if (SurveyAbTest.INSTANCE.surveyVipFirst() > 0 && nextInt < SurveyAbTest.INSTANCE.surveyVipFirst()) {
                        return true;
                    }
                } else if (SurveyAbTest.INSTANCE.surveyVipNoFirst() > 0 && nextInt < SurveyAbTest.INSTANCE.surveyVipNoFirst()) {
                    return true;
                }
            } else if (recognizeCount == 1) {
                if (SurveyAbTest.INSTANCE.surveyNoVipFirst() > 0 && nextInt < SurveyAbTest.INSTANCE.surveyNoVipFirst()) {
                    return true;
                }
            } else if (SurveyAbTest.INSTANCE.surveyNOVipNoFirst() > 0 && nextInt < SurveyAbTest.INSTANCE.surveyNOVipNoFirst()) {
                return true;
            }
            return false;
        }

        @JvmStatic
        public final void showDialog(Activity activity, ArrayList<Integer> reasons, long itemId, int recognizeCount, boolean isVip, String from, SurveyListener surveyListener, DialogType dialogType) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(reasons, "reasons");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(surveyListener, "surveyListener");
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            PersistData.INSTANCE.set(PersistKey.LAST_SHOWN_SURVEY_TS, Long.valueOf(System.currentTimeMillis()));
            new SurveyDialog(activity, reasons, itemId, isVip, from, recognizeCount, surveyListener, dialogType, null).show();
        }
    }
}
