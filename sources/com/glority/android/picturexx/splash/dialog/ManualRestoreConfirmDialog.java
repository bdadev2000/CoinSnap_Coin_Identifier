package com.glority.android.picturexx.splash.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.picturexx.splash.databinding.DialogEmptyComposeViewLayoutBinding;
import com.glority.android.ui.base.v2.BaseCenterDialogFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualRestoreConfirmDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog;", "Lcom/glority/android/ui/base/v2/BaseCenterDialogFragment;", "Lcom/glority/android/picturexx/splash/databinding/DialogEmptyComposeViewLayoutBinding;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog$ManualRestoreConfirmDialogListener;", "<init>", "(Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog$ManualRestoreConfirmDialogListener;)V", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onConfirmClick", "onCancelClick", "Companion", "ManualRestoreConfirmDialogListener", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ManualRestoreConfirmDialog extends BaseCenterDialogFragment<DialogEmptyComposeViewLayoutBinding> {
    private final ManualRestoreConfirmDialogListener listener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ManualRestoreConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog$ManualRestoreConfirmDialogListener;", "", "onConfirm", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "onCancel", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface ManualRestoreConfirmDialogListener {
        void onCancel(DialogFragment dialog);

        void onConfirm(DialogFragment dialog);
    }

    @JvmStatic
    public static final void showDialog(FragmentManager fragmentManager, ManualRestoreConfirmDialogListener manualRestoreConfirmDialogListener) {
        INSTANCE.showDialog(fragmentManager, manualRestoreConfirmDialogListener);
    }

    public ManualRestoreConfirmDialog(ManualRestoreConfirmDialogListener manualRestoreConfirmDialogListener) {
        this.listener = manualRestoreConfirmDialogListener;
    }

    /* compiled from: ManualRestoreConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog$Companion;", "", "<init>", "()V", "showDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/splash/dialog/ManualRestoreConfirmDialog$ManualRestoreConfirmDialogListener;", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void showDialog(FragmentManager fragmentManager, ManualRestoreConfirmDialogListener listener) {
            if (fragmentManager == null) {
                return;
            }
            new ManualRestoreConfirmDialog(listener).show(fragmentManager, "__manual_restore_confirm_dialog__");
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected String getLogPageName() {
        return "manual_restore_confirm";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    public DialogEmptyComposeViewLayoutBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogEmptyComposeViewLayoutBinding inflate = DialogEmptyComposeViewLayoutBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ((DialogEmptyComposeViewLayoutBinding) getBinding()).composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1750288817, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog$doCreateView$1
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
                        ComposerKt.traceEventStart(-1750288817, i, -1, "com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog.doCreateView.<anonymous> (ManualRestoreConfirmDialog.kt:50)");
                    }
                    ManualRestoreConfirmDialogKt.access$ManualRestoreConfirmView(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), new AnonymousClass1(ManualRestoreConfirmDialog.this), new AnonymousClass2(ManualRestoreConfirmDialog.this), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ManualRestoreConfirmDialog.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog$doCreateView$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass1(Object obj) {
                    super(0, obj, ManualRestoreConfirmDialog.class, "onConfirmClick", "onConfirmClick()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((ManualRestoreConfirmDialog) this.receiver).onConfirmClick();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ManualRestoreConfirmDialog.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialog$doCreateView$1$2, reason: invalid class name */
            /* loaded from: classes5.dex */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass2(Object obj) {
                    super(0, obj, ManualRestoreConfirmDialog.class, "onCancelClick", "onCancelClick()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((ManualRestoreConfirmDialog) this.receiver).onCancelClick();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfirmClick() {
        ManualRestoreConfirmDialogListener manualRestoreConfirmDialogListener = this.listener;
        if (manualRestoreConfirmDialogListener != null) {
            manualRestoreConfirmDialogListener.onConfirm(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancelClick() {
        ManualRestoreConfirmDialogListener manualRestoreConfirmDialogListener = this.listener;
        if (manualRestoreConfirmDialogListener != null) {
            manualRestoreConfirmDialogListener.onCancel(this);
        }
    }
}
