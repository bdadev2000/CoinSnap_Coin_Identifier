package com.glority.android.survey;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewGroupKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.survey.SurveyReasonDialog;
import com.glority.android.survey.event.LogEvents;
import com.glority.android.ui.base.BaseDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyReasonDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/survey/SurveyReasonDialog;", "Lcom/glority/android/ui/base/BaseDialog;", "activity", "Landroid/app/Activity;", "reasons", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedListener", "Lcom/glority/android/survey/SurveyReasonDialog$SelectedListener;", "(Landroid/app/Activity;Ljava/util/ArrayList;Lcom/glority/android/survey/SurveyReasonDialog$SelectedListener;)V", "addOptionView", "", "contentRes", "getLayoutId", "getLogPageName", "", "initView", "SelectedListener", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyReasonDialog extends BaseDialog {
    private final Activity activity;
    private final ArrayList<Integer> reasons;
    private final SelectedListener selectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyReasonDialog(Activity activity, ArrayList<Integer> reasons, SelectedListener selectedListener) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(selectedListener, "selectedListener");
        this.activity = activity;
        this.reasons = reasons;
        this.selectedListener = selectedListener;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_survey_reason;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.SURVEY_REASON;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        if (this.reasons.size() < 2) {
            SelectedListener.DefaultImpls.result$default(this.selectedListener, -1, null, 2, null);
            dismiss();
            return;
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setDialogWidthPercent(0.8f);
        AppCompatTextView tv_submit = (AppCompatTextView) findViewById(R.id.tv_submit);
        Intrinsics.checkNotNullExpressionValue(tv_submit, "tv_submit");
        ViewExtensionsKt.alphaEnable(tv_submit, false);
        ((LinearLayout) findViewById(R.id.ll_reasons)).removeAllViews();
        List<Integer> subList = this.reasons.subList(0, r1.size() - 1);
        Intrinsics.checkNotNullExpressionValue(subList, "reasons.subList(0, reasons.size - 1)");
        List<Integer> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.shuffled(subList));
        mutableList.add(CollectionsKt.last((List) this.reasons));
        for (Integer it : mutableList) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            addOptionView(it.intValue());
        }
        AppCompatTextView tv_submit2 = (AppCompatTextView) findViewById(R.id.tv_submit);
        Intrinsics.checkNotNullExpressionValue(tv_submit2, "tv_submit");
        ViewExtensionsKt.setSingleClickListener$default(tv_submit2, 0L, new SurveyReasonDialog$initView$2(this, mutableList), 1, (Object) null);
        FrameLayout iv_close = (FrameLayout) findViewById(R.id.iv_close);
        Intrinsics.checkNotNullExpressionValue(iv_close, "iv_close");
        ViewExtensionsKt.setSingleClickListener$default(iv_close, 0L, new Function1<View, Unit>() { // from class: com.glority.android.survey.SurveyReasonDialog$initView$3
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
            public final void invoke2(View it2) {
                SurveyReasonDialog.SelectedListener selectedListener;
                Intrinsics.checkNotNullParameter(it2, "it");
                SurveyReasonDialog.this.dismiss();
                selectedListener = SurveyReasonDialog.this.selectedListener;
                SurveyReasonDialog.SelectedListener.DefaultImpls.result$default(selectedListener, -1, null, 2, null);
            }
        }, 1, (Object) null);
    }

    private final void addOptionView(int contentRes) {
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.item_survey_reason, (ViewGroup) findViewById(R.id.ll_reasons), false);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.CheckedTextView");
        }
        final CheckedTextView checkedTextView = (CheckedTextView) inflate;
        CheckedTextView checkedTextView2 = checkedTextView;
        ViewExtensionsKt.setSingleClickListener$default(checkedTextView2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.survey.SurveyReasonDialog$addOptionView$1
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
                boolean isChecked = checkedTextView.isChecked();
                LinearLayout ll_reasons = (LinearLayout) SurveyReasonDialog.this.findViewById(R.id.ll_reasons);
                Intrinsics.checkNotNullExpressionValue(ll_reasons, "ll_reasons");
                for (View view : ViewGroupKt.getChildren(ll_reasons)) {
                    if (view == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.CheckedTextView");
                    }
                    ((CheckedTextView) view).setChecked(false);
                }
                checkedTextView.setChecked(!isChecked);
                AppCompatTextView tv_submit = (AppCompatTextView) SurveyReasonDialog.this.findViewById(R.id.tv_submit);
                Intrinsics.checkNotNullExpressionValue(tv_submit, "tv_submit");
                ViewExtensionsKt.alphaEnable(tv_submit, checkedTextView.isChecked());
            }
        }, 1, (Object) null);
        checkedTextView.setText(contentRes);
        ((LinearLayout) findViewById(R.id.ll_reasons)).addView(checkedTextView2);
    }

    /* compiled from: SurveyReasonDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/android/survey/SurveyReasonDialog$SelectedListener;", "", com.glority.android.xx.constants.LogEvents.result, "", "index", "", "content", "", "base-survey_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public interface SelectedListener {
        void result(int index, String content);

        /* compiled from: SurveyReasonDialog.kt */
        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void result$default(SelectedListener selectedListener, int i, String str, int i2, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: result");
                }
                if ((i2 & 2) != 0) {
                    str = null;
                }
                selectedListener.result(i, str);
            }
        }
    }
}
