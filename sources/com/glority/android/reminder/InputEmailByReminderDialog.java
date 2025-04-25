package com.glority.android.reminder;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.PurchaseUiLogEvents;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.reminder.InputEmailByReminderDialog;
import com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment;
import com.glority.purchase.ui.R;
import com.glority.purchase.ui.databinding.BuiDialogInputEmailByReminderBinding;
import com.glority.utils.app.ResUtils;
import com.glority.utils.data.RegexUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InputEmailByReminderDialog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/glority/android/reminder/InputEmailByReminderDialog;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/purchase/ui/databinding/BuiDialogInputEmailByReminderBinding;", "<init>", "()V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "submitCallback", "Lcom/glority/android/reminder/InputEmailByReminderDialog$SubmitCallBacK;", "getSubmitCallback", "()Lcom/glority/android/reminder/InputEmailByReminderDialog$SubmitCallBacK;", "setSubmitCallback", "(Lcom/glority/android/reminder/InputEmailByReminderDialog$SubmitCallBacK;)V", "getLogPageName", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "", "initView", "SubmitCallBacK", "Companion", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class InputEmailByReminderDialog extends BaseBottomSheetDialogFragment<BuiDialogInputEmailByReminderBinding> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String from = "";
    private SubmitCallBacK submitCallback;

    /* compiled from: InputEmailByReminderDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/reminder/InputEmailByReminderDialog$SubmitCallBacK;", "", "callBack", "", "email", "", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface SubmitCallBacK {
        void callBack(String email);
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final SubmitCallBacK getSubmitCallback() {
        return this.submitCallback;
    }

    public final void setSubmitCallback(SubmitCallBacK submitCallBacK) {
        this.submitCallback = submitCallBacK;
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected String getLogPageName() {
        return PurchaseUiLogEvents.INPUTEMAILBYREMINDER;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public BuiDialogInputEmailByReminderBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        BuiDialogInputEmailByReminderBinding inflate = BuiDialogInputEmailByReminderBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        return new BottomSheetDialog(requireContext(), R.style.TransparentBottomSheetStyle);
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        updateCommonEventArgs(TuplesKt.to("from", this.from));
        if (getDialog() != null) {
            setCancelable(false);
        }
        initView();
    }

    private final void initView() {
        TextView tvSave = getBinding().tvSave;
        Intrinsics.checkNotNullExpressionValue(tvSave, "tvSave");
        ViewExtensionsKt.setSingleClickListener$default(tvSave, 0L, new Function1<View, Unit>() { // from class: com.glority.android.reminder.InputEmailByReminderDialog$initView$1
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
                BuiDialogInputEmailByReminderBinding binding;
                String str;
                String obj;
                Intrinsics.checkNotNullParameter(it, "it");
                BaseBottomSheetDialogFragment.logEvent$default(InputEmailByReminderDialog.this, PurchaseUiLogEvents.INPUTEMAILBYREMINDER_SUBMIT_CLICK, null, 2, null);
                binding = InputEmailByReminderDialog.this.getBinding();
                Editable text = binding.etEmail.getText();
                if (text == null || (obj = text.toString()) == null || (str = StringsKt.trim((CharSequence) obj).toString()) == null) {
                    str = "";
                }
                if (!RegexUtils.isEmail(str)) {
                    ToastUtils.showShort(ResUtils.getString(R.string.text_invalid_email_address_content), new Object[0]);
                    return;
                }
                InputEmailByReminderDialog.this.logEvent(PurchaseUiLogEvents.INPUTEMAILBYREMINDER_EMAIL_CLICK, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, str)));
                InputEmailByReminderDialog.SubmitCallBacK submitCallback = InputEmailByReminderDialog.this.getSubmitCallback();
                if (submitCallback != null) {
                    submitCallback.callBack(str);
                }
                InputEmailByReminderDialog.this.dismissAllowingStateLoss();
            }
        }, 1, (Object) null);
        GlTextView tvNotInput = getBinding().tvNotInput;
        Intrinsics.checkNotNullExpressionValue(tvNotInput, "tvNotInput");
        ViewExtensionsKt.setSingleClickListener$default(tvNotInput, 0L, new Function1<View, Unit>() { // from class: com.glority.android.reminder.InputEmailByReminderDialog$initView$2
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
                Intrinsics.checkNotNullParameter(it, "it");
                BaseBottomSheetDialogFragment.logEvent$default(InputEmailByReminderDialog.this, PurchaseUiLogEvents.INPUTEMAILBYREMINDER_NOTNEED_CLICK, null, 2, null);
                InputEmailByReminderDialog.SubmitCallBacK submitCallback = InputEmailByReminderDialog.this.getSubmitCallback();
                if (submitCallback != null) {
                    submitCallback.callBack("");
                }
                InputEmailByReminderDialog.this.dismissAllowingStateLoss();
            }
        }, 1, (Object) null);
    }

    /* compiled from: InputEmailByReminderDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/reminder/InputEmailByReminderDialog$Companion;", "", "<init>", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "from", "", "submitCallBacK", "Lcom/glority/android/reminder/InputEmailByReminderDialog$SubmitCallBacK;", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void show$default(Companion companion, FragmentActivity fragmentActivity, String str, SubmitCallBacK submitCallBacK, int i, Object obj) {
            if ((i & 4) != 0) {
                submitCallBacK = null;
            }
            companion.show(fragmentActivity, str, submitCallBacK);
        }

        public final void show(FragmentActivity activity, String from, SubmitCallBacK submitCallBacK) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(from, "from");
            InputEmailByReminderDialog inputEmailByReminderDialog = new InputEmailByReminderDialog();
            inputEmailByReminderDialog.setFrom(from);
            inputEmailByReminderDialog.setSubmitCallback(submitCallBacK);
            activity.getSupportFragmentManager().beginTransaction().add(inputEmailByReminderDialog, "input_email_by_reminder_dialog").commitAllowingStateLoss();
        }
    }
}
