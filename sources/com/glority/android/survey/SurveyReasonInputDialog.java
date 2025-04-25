package com.glority.android.survey;

import android.app.Activity;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import com.glority.android.core.app.AppContext;
import com.glority.android.survey.SurveyReasonInputDialog;
import com.glority.android.survey.event.LogEvents;
import com.glority.android.ui.base.BaseDialog;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyReasonInputDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\bH\u0003J\b\u0010\u000e\u001a\u00020\bH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/survey/SurveyReasonInputDialog;", "Lcom/glority/android/ui/base/BaseDialog;", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/survey/SurveyReasonInputDialog$OnFinishInputListener;", "(Landroid/app/Activity;Lcom/glority/android/survey/SurveyReasonInputDialog$OnFinishInputListener;)V", "doCreateView", "", "getLayoutId", "", "getLogPageName", "", "initListener", "initView", "observeSoftInput", "onSoftInputKeyboardVisible", "OnFinishInputListener", "base-survey_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyReasonInputDialog extends BaseDialog {
    private final OnFinishInputListener listener;

    /* compiled from: SurveyReasonInputDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/survey/SurveyReasonInputDialog$OnFinishInputListener;", "", "onClose", "", "onSubmit", "input", "", "base-survey_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public interface OnFinishInputListener {
        void onClose();

        void onSubmit(String input);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyReasonInputDialog(Activity activity, OnFinishInputListener onFinishInputListener) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.listener = onFinishInputListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SurveyReasonInputDialog(android.app.Activity r1, com.glority.android.survey.SurveyReasonInputDialog.OnFinishInputListener r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            com.glority.android.survey.SurveyReasonInputDialog$OnFinishInputListener r3 = (com.glority.android.survey.SurveyReasonInputDialog.OnFinishInputListener) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.survey.SurveyReasonInputDialog.<init>(android.app.Activity, com.glority.android.survey.SurveyReasonInputDialog$OnFinishInputListener, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected int getLayoutId() {
        return R.layout.dialog_survey_reason_input;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected String getLogPageName() {
        return LogEvents.SURVEY_REASON_INPUT;
    }

    @Override // com.glority.android.ui.base.BaseDialog
    protected void initView() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        doCreateView();
    }

    private final void doCreateView() {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        initListener();
        observeSoftInput();
        ((AppCompatEditText) findViewById(R.id.et_survey_reason_input)).requestFocus();
        AppCompatTextView tv_submit = (AppCompatTextView) findViewById(R.id.tv_submit);
        Intrinsics.checkNotNullExpressionValue(tv_submit, "tv_submit");
        tv_submit.setClickable(false);
        AppCompatTextView tv_submit2 = (AppCompatTextView) findViewById(R.id.tv_submit);
        Intrinsics.checkNotNullExpressionValue(tv_submit2, "tv_submit");
        tv_submit2.setAlpha(0.5f);
    }

    private final void initListener() {
        AppCompatEditText et_survey_reason_input = (AppCompatEditText) findViewById(R.id.et_survey_reason_input);
        Intrinsics.checkNotNullExpressionValue(et_survey_reason_input, "et_survey_reason_input");
        et_survey_reason_input.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.survey.SurveyReasonInputDialog$initListener$$inlined$addTextChangedListener$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                String obj;
                boolean z = (s == null || (obj = s.toString()) == null || obj.length() == 0) ? false : true;
                AppCompatTextView tv_submit = (AppCompatTextView) SurveyReasonInputDialog.this.findViewById(R.id.tv_submit);
                Intrinsics.checkNotNullExpressionValue(tv_submit, "tv_submit");
                tv_submit.setClickable(z);
                AppCompatTextView tv_submit2 = (AppCompatTextView) SurveyReasonInputDialog.this.findViewById(R.id.tv_submit);
                Intrinsics.checkNotNullExpressionValue(tv_submit2, "tv_submit");
                tv_submit2.setAlpha(z ? 1.0f : 0.5f);
            }
        });
        ((AppCompatTextView) findViewById(R.id.tv_submit)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.survey.SurveyReasonInputDialog$initListener$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyReasonInputDialog.OnFinishInputListener onFinishInputListener;
                AppCompatEditText et_survey_reason_input2 = (AppCompatEditText) SurveyReasonInputDialog.this.findViewById(R.id.et_survey_reason_input);
                Intrinsics.checkNotNullExpressionValue(et_survey_reason_input2, "et_survey_reason_input");
                String valueOf = String.valueOf(et_survey_reason_input2.getText());
                LogUtils.e("The input is: " + valueOf);
                onFinishInputListener = SurveyReasonInputDialog.this.listener;
                if (onFinishInputListener != null) {
                    onFinishInputListener.onSubmit(valueOf);
                }
                SurveyReasonInputDialog.this.dismiss();
            }
        });
        ((ImageView) findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.survey.SurveyReasonInputDialog$initListener$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SurveyReasonInputDialog.OnFinishInputListener onFinishInputListener;
                onFinishInputListener = SurveyReasonInputDialog.this.listener;
                if (onFinishInputListener != null) {
                    onFinishInputListener.onClose();
                }
                SurveyReasonInputDialog.this.dismiss();
            }
        });
        ((AppCompatEditText) findViewById(R.id.et_survey_reason_input)).setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.survey.SurveyReasonInputDialog$initListener$4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ViewParent parent;
                ViewParent parent2;
                if ((motionEvent == null || motionEvent.getAction() != 0) && (motionEvent == null || motionEvent.getAction() != 2)) {
                    if (motionEvent != null && motionEvent.getAction() == 1 && view != null && (parent = view.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                } else if (view != null && (parent2 = view.getParent()) != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
        ((AppCompatEditText) findViewById(R.id.et_survey_reason_input)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.glority.android.survey.SurveyReasonInputDialog$initListener$5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                ViewUtils.hideSoftInput((AppCompatEditText) SurveyReasonInputDialog.this.findViewById(R.id.et_survey_reason_input));
            }
        });
    }

    private final void observeSoftInput() {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.glority.android.survey.SurveyReasonInputDialog$observeSoftInput$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View decorView2;
                Rect rect = new Rect();
                Window window2 = SurveyReasonInputDialog.this.getWindow();
                if (window2 == null || (decorView2 = window2.getDecorView()) == null) {
                    return;
                }
                decorView2.getWindowVisibleDisplayFrame(rect);
                if (ViewUtils.getScreenHeight() - rect.bottom > ViewUtils.getScreenHeight() / 4) {
                    SurveyReasonInputDialog.this.onSoftInputKeyboardVisible();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSoftInputKeyboardVisible() {
        ((NestedScrollView) findViewById(R.id.survey_scroll_view)).post(new Runnable() { // from class: com.glority.android.survey.SurveyReasonInputDialog$onSoftInputKeyboardVisible$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Boolean.valueOf(((NestedScrollView) SurveyReasonInputDialog.this.findViewById(R.id.survey_scroll_view)).fullScroll(TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
    }
}
