package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentManager;
import com.glority.android.picturexx.business.databinding.LayoutEmptyDialogBinding;
import com.glority.android.ui.base.v2.BaseDialogFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonSuggestionsFeedbackDialog.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialog;", "Lcom/glority/android/ui/base/v2/BaseDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/LayoutEmptyDialogBinding;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialogListener;", "<init>", "(Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialogListener;)V", "()V", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onStart", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CommonSuggestionsFeedbackDialog extends BaseDialogFragment<LayoutEmptyDialogBinding> {
    private final CommonSuggestionsFeedbackDialogListener listener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final void show(FragmentManager fragmentManager, CommonSuggestionsFeedbackDialogListener commonSuggestionsFeedbackDialogListener) {
        INSTANCE.show(fragmentManager, commonSuggestionsFeedbackDialogListener);
    }

    public CommonSuggestionsFeedbackDialog(CommonSuggestionsFeedbackDialogListener commonSuggestionsFeedbackDialogListener) {
        this.listener = commonSuggestionsFeedbackDialogListener;
    }

    /* compiled from: CommonSuggestionsFeedbackDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialog$Companion;", "", "<init>", "()V", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/view/dialog/CommonSuggestionsFeedbackDialogListener;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void show(FragmentManager fragmentManager, CommonSuggestionsFeedbackDialogListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (fragmentManager == null) {
                return;
            }
            new CommonSuggestionsFeedbackDialog(listener).show(fragmentManager, "__common_suggestions_feedback_dialog__");
        }
    }

    public CommonSuggestionsFeedbackDialog() {
        this(null);
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected String getLogPageName() {
        return "CommonSuggestionsFeedbackDialog";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    public LayoutEmptyDialogBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LayoutEmptyDialogBinding inflate = LayoutEmptyDialogBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setGravity(80);
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1604456011, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialog$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1604456011, i, -1, "com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialog.doCreateView.<anonymous> (CommonSuggestionsFeedbackDialog.kt:79)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    final CommonSuggestionsFeedbackDialog commonSuggestionsFeedbackDialog = CommonSuggestionsFeedbackDialog.this;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialog$doCreateView$1.1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CommonSuggestionsFeedbackDialogListener commonSuggestionsFeedbackDialogListener;
                            commonSuggestionsFeedbackDialogListener = CommonSuggestionsFeedbackDialog.this.listener;
                            if (commonSuggestionsFeedbackDialogListener != null) {
                                commonSuggestionsFeedbackDialogListener.onFeedbackClose(CommonSuggestionsFeedbackDialog.this);
                            }
                        }
                    };
                    final CommonSuggestionsFeedbackDialog commonSuggestionsFeedbackDialog2 = CommonSuggestionsFeedbackDialog.this;
                    CommonSuggestionsFeedbackDialogKt.SuggestionScreen(companion, function0, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialog$doCreateView$1.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String feedback) {
                            CommonSuggestionsFeedbackDialogListener commonSuggestionsFeedbackDialogListener;
                            Intrinsics.checkNotNullParameter(feedback, "feedback");
                            commonSuggestionsFeedbackDialogListener = CommonSuggestionsFeedbackDialog.this.listener;
                            if (commonSuggestionsFeedbackDialogListener != null) {
                                commonSuggestionsFeedbackDialogListener.onFeedbackSubmit(CommonSuggestionsFeedbackDialog.this, feedback);
                            }
                        }
                    }, composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        CommonSuggestionsFeedbackDialogListener commonSuggestionsFeedbackDialogListener = this.listener;
        if (commonSuggestionsFeedbackDialogListener != null) {
            commonSuggestionsFeedbackDialogListener.onFeedbackClose(this);
        }
        super.onDestroy();
    }
}
