package com.glority.android.guide.memo10004.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10004bBinding;
import com.glority.android.picturexx.view.notesnap.NoteSnapCongratsActivity;
import com.glority.base.viewmodel.AppViewModel;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Vip10004BActivity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/glority/android/guide/memo10004/activity/Vip10004BActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "yearlySKU", "", "binding", "Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10004bBinding;", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10004bBinding;", "setBinding", "(Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10004bBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getRichText", "Landroid/text/SpannableStringBuilder;", "changePrice", "finish", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10004BActivity extends BasePurchaseActivity {
    public static final int $stable = 8;
    public ActivityPurchase10004bBinding binding;
    private String yearlySKU = "sub_yearly";

    public final ActivityPurchase10004bBinding getBinding() {
        ActivityPurchase10004bBinding activityPurchase10004bBinding = this.binding;
        if (activityPurchase10004bBinding != null) {
            return activityPurchase10004bBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityPurchase10004bBinding activityPurchase10004bBinding) {
        Intrinsics.checkNotNullParameter(activityPurchase10004bBinding, "<set-?>");
        this.binding = activityPurchase10004bBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding(ActivityPurchase10004bBinding.inflate(getLayoutInflater()));
        setContentView(getBinding().getRoot());
        ScrollView sv = getBinding().sv;
        Intrinsics.checkNotNullExpressionValue(sv, "sv");
        new BillingUIScrollToDataPolicyRequest(sv, getBinding().gpv1.getPolicyContentView(), null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, getBinding().gpv1.getPolicyContentView()).post();
        TextView tvRestore = getBinding().tvRestore;
        Intrinsics.checkNotNullExpressionValue(tvRestore, "tvRestore");
        ViewExtensionsKt.setSingleClickListener$default(tvRestore, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10004.activity.Vip10004BActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new GuideRestoreRequest(false, null, 3, null).post();
            }
        }, 1, (Object) null);
        ImageView tvCancel = getBinding().tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10004.activity.Vip10004BActivity$onCreate$2
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
                Vip10004BActivity.this.trackClose();
                Vip10004BActivity.this.finish();
            }
        }, 1, (Object) null);
        getBinding().contentTv.setText(getRichText());
        TextView purchaseTv = getBinding().purchaseTv;
        Intrinsics.checkNotNullExpressionValue(purchaseTv, "purchaseTv");
        ViewExtensionsKt.setSingleClickListener$default(purchaseTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10004.activity.Vip10004BActivity$onCreate$3
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
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                str = Vip10004BActivity.this.yearlySKU;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        }, 1, (Object) null);
    }

    private final SpannableStringBuilder getRichText() {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("and get 30 days free  for");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, "30 days free", 0, false, 6, (Object) null);
            int i = indexOf$default + 12;
            StyleSpan styleSpan = new StyleSpan(1);
            RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.25f);
            spannableStringBuilder.setSpan(styleSpan, indexOf$default, i, 33);
            spannableStringBuilder.setSpan(relativeSizeSpan, indexOf$default, i, 33);
            return spannableStringBuilder;
        } catch (Throwable unused) {
            return new SpannableStringBuilder("Get CoinSnap today\nand get 30 days free  for\nNoteSnap");
        }
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result == null) {
            return;
        }
        String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
        if (result2 == null) {
            result2 = "";
        }
        double d = 0.1d;
        try {
            double doubleValue = new BigDecimal(Double.parseDouble(result2) / 365).setScale(2, 3).doubleValue();
            if (doubleValue >= 0.1d) {
                d = doubleValue;
            }
        } catch (Throwable unused) {
        }
        String str = " " + result + " " + d;
        String string = getString(R.string.bui_memo_27267_less_than_day, new Object[]{String.valueOf(str)});
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str2 = string;
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FAAF19")), StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null) + str.length(), 0);
        getBinding().infoTv.setText(spannableString);
        getBinding().priceTv.setText(getString(R.string.bui_memo_27267_PRICE_2, new Object[]{result + " " + result2}));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (AppViewModel.INSTANCE.isVip()) {
            NoteSnapCongratsActivity.INSTANCE.open(this, "100042");
        }
    }
}
