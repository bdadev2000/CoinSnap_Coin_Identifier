package com.glority.android.picturexx.splash.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.splash.R;
import com.glority.android.picturexx.splash.databinding.DialogForceUpdateBinding;
import com.glority.base.dialog.BaseCenterDialog;
import com.glority.base.utils.SystemUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ForceUpdateDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/splash/dialog/ForceUpdateDialog;", "Lcom/glority/base/dialog/BaseCenterDialog;", "<init>", "()V", "isForced", "", "binding", "Lcom/glority/android/picturexx/splash/databinding/DialogForceUpdateBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setForced", "bool", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ForceUpdateDialog extends BaseCenterDialog {
    public static final int $stable = 8;
    private DialogForceUpdateBinding binding;
    private boolean isForced;

    public ForceUpdateDialog() {
        super(false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogForceUpdateBinding inflate = DialogForceUpdateBinding.inflate(inflater);
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DialogForceUpdateBinding dialogForceUpdateBinding = null;
        if (this.isForced) {
            DialogForceUpdateBinding dialogForceUpdateBinding2 = this.binding;
            if (dialogForceUpdateBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogForceUpdateBinding2 = null;
            }
            dialogForceUpdateBinding2.tvDescription.setText(R.string.warning_text_update_old);
        } else {
            DialogForceUpdateBinding dialogForceUpdateBinding3 = this.binding;
            if (dialogForceUpdateBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogForceUpdateBinding3 = null;
            }
            dialogForceUpdateBinding3.tvDescription.setText(R.string.text_warning_update_desc);
        }
        setCancelable(!this.isForced);
        DialogForceUpdateBinding dialogForceUpdateBinding4 = this.binding;
        if (dialogForceUpdateBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogForceUpdateBinding = dialogForceUpdateBinding4;
        }
        TextView tvUpdate = dialogForceUpdateBinding.tvUpdate;
        Intrinsics.checkNotNullExpressionValue(tvUpdate, "tvUpdate");
        ViewExtensionsKt.setSingleClickListener(tvUpdate, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ForceUpdateDialog$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SystemUtil.INSTANCE.startMarket(ForceUpdateDialog.this.getActivity());
                if (ForceUpdateDialog.this.isCancelable()) {
                    ForceUpdateDialog.this.dismiss();
                }
            }
        });
    }

    public final ForceUpdateDialog setForced(boolean bool) {
        this.isForced = bool;
        return this;
    }
}
