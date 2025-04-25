package com.glority.android.picturexx.view.dialog;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.compose.DialogNavigator;
import com.glority.android.picturexx.business.R;
import com.glority.android.ui.base.BaseCenterDialogFragment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeltPriceHintDialog.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog;", "Lcom/glority/android/ui/base/BaseCenterDialogFragment;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog$MeltHintDialogListener;", "<init>", "(Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog$MeltHintDialogListener;)V", "()V", "getLogPageName", "", "getLayoutId", "", "initView", "", "onCloseClick", "onGotItClick", "Companion", "MeltHintDialogListener", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeltPriceHintDialog extends BaseCenterDialogFragment {
    private final MeltHintDialogListener listener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MeltPriceHintDialog.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog$MeltHintDialogListener;", "", "onCloseClick", "", DialogNavigator.NAME, "Landroidx/fragment/app/DialogFragment;", "onGotItClick", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface MeltHintDialogListener {
        void onCloseClick(DialogFragment dialog);

        void onGotItClick(DialogFragment dialog);
    }

    @JvmStatic
    public static final void show(FragmentManager fragmentManager, MeltHintDialogListener meltHintDialogListener) {
        INSTANCE.show(fragmentManager, meltHintDialogListener);
    }

    public MeltPriceHintDialog(MeltHintDialogListener meltHintDialogListener) {
        this.listener = meltHintDialogListener;
    }

    /* compiled from: MeltPriceHintDialog.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog$Companion;", "", "<init>", "()V", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/view/dialog/MeltPriceHintDialog$MeltHintDialogListener;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void show(FragmentManager fragmentManager, MeltHintDialogListener listener) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(listener, "listener");
            new MeltPriceHintDialog(listener).show(fragmentManager, "__melt_price_hint_dialog__");
        }
    }

    public MeltPriceHintDialog() {
        this(null);
    }

    @Override // com.glority.android.ui.base.BaseDialogFragment
    protected String getLogPageName() {
        return "meltpricehint";
    }

    @Override // com.glority.android.ui.base.BaseDialogFragment
    public int getLayoutId() {
        return R.layout.dialog_melt_price_hint;
    }

    @Override // com.glority.android.ui.base.BaseDialogFragment
    public void initView() {
        View view = getRootView();
        ComposeView composeView = view != null ? (ComposeView) view.findViewById(R.id.compose_view) : null;
        if (composeView != null) {
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1781372053, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.MeltPriceHintDialog$initView$1
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
                            ComposerKt.traceEventStart(1781372053, i, -1, "com.glority.android.picturexx.view.dialog.MeltPriceHintDialog.initView.<anonymous> (MeltPriceHintDialog.kt:61)");
                        }
                        MeltPriceHintDialogKt.access$MeltPriceHint(Modifier.INSTANCE, new AnonymousClass1(MeltPriceHintDialog.this), new AnonymousClass2(MeltPriceHintDialog.this), composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MeltPriceHintDialog.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                /* renamed from: com.glority.android.picturexx.view.dialog.MeltPriceHintDialog$initView$1$1, reason: invalid class name */
                /* loaded from: classes5.dex */
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                    AnonymousClass1(Object obj) {
                        super(0, obj, MeltPriceHintDialog.class, "onCloseClick", "onCloseClick()V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((MeltPriceHintDialog) this.receiver).onCloseClick();
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MeltPriceHintDialog.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                /* renamed from: com.glority.android.picturexx.view.dialog.MeltPriceHintDialog$initView$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
                    AnonymousClass2(Object obj) {
                        super(0, obj, MeltPriceHintDialog.class, "onGotItClick", "onGotItClick()V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((MeltPriceHintDialog) this.receiver).onGotItClick();
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseClick() {
        MeltHintDialogListener meltHintDialogListener = this.listener;
        if (meltHintDialogListener != null) {
            meltHintDialogListener.onCloseClick(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGotItClick() {
        MeltHintDialogListener meltHintDialogListener = this.listener;
        if (meltHintDialogListener != null) {
            meltHintDialogListener.onGotItClick(this);
        }
    }
}
