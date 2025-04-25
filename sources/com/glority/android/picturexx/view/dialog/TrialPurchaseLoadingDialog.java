package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogTrailPruchaseBinding;
import com.glority.base.dialog.BaseDialog;
import com.glority.utils.app.ResUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TrialPurchaseLoadingDialog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/TrialPurchaseLoadingDialog;", "Lcom/glority/base/dialog/BaseDialog;", "<init>", "()V", "trailDays", "", "getTrailDays", "()Ljava/lang/String;", "setTrailDays", "(Ljava/lang/String;)V", "binding", "Lcom/glority/android/picturexx/business/databinding/DialogTrailPruchaseBinding;", "show", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onStart", "initView", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class TrialPurchaseLoadingDialog extends BaseDialog {
    public static final int $stable = 8;
    private DialogTrailPruchaseBinding binding;
    private String trailDays = "7";

    public final String getTrailDays() {
        return this.trailDays;
    }

    public final void setTrailDays(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trailDays = str;
    }

    public final void show(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        show(fragmentManager, "__purchase_loading_dialog__");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogTrailPruchaseBinding inflate = DialogTrailPruchaseBinding.inflate(inflater, container, false);
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
        initView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(R.style.dialog_animation_fade);
    }

    private final void initView() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ResUtils.getString(R.string.ms_vippage_daysfree, this.trailDays));
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, this.trailDays, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FFD586")), indexOf$default, this.trailDays.length() + indexOf$default, 33);
        }
        DialogTrailPruchaseBinding dialogTrailPruchaseBinding = this.binding;
        if (dialogTrailPruchaseBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogTrailPruchaseBinding = null;
        }
        dialogTrailPruchaseBinding.textTv.setText(spannableStringBuilder2);
    }
}
