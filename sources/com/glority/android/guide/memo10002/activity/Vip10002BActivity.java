package com.glority.android.guide.memo10002.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
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
import com.glority.android.picturexx.business.databinding.ActivityPurchase10002bBinding;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Vip10002BActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/android/guide/memo10002/activity/Vip10002BActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "yearlySKU", "", "binding", "Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002bBinding;", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002bBinding;", "setBinding", "(Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002bBinding;)V", "cardData", "", "Lkotlin/Pair;", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "changePrice", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10002BActivity extends BasePurchaseActivity {
    public static final int $stable = 8;
    public ActivityPurchase10002bBinding binding;
    private String yearlySKU = "sub_yearly";
    private final List<Pair<Integer, Integer>> cardData = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.drawable.icon_vip_10002_1), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro1)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_2), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro2)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_3), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro3)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_4), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro4)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_5), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro5)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_6), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro6))});

    public final ActivityPurchase10002bBinding getBinding() {
        ActivityPurchase10002bBinding activityPurchase10002bBinding = this.binding;
        if (activityPurchase10002bBinding != null) {
            return activityPurchase10002bBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityPurchase10002bBinding activityPurchase10002bBinding) {
        Intrinsics.checkNotNullParameter(activityPurchase10002bBinding, "<set-?>");
        this.binding = activityPurchase10002bBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding(ActivityPurchase10002bBinding.inflate(getLayoutInflater()));
        setContentView(getBinding().getRoot());
        ScrollView sv = getBinding().sv;
        Intrinsics.checkNotNullExpressionValue(sv, "sv");
        new BillingUIScrollToDataPolicyRequest(sv, getBinding().gpv1.getPolicyContentView(), null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, getBinding().gpv1.getPolicyContentView()).post();
        TextView tvRestore = getBinding().tvRestore;
        Intrinsics.checkNotNullExpressionValue(tvRestore, "tvRestore");
        ViewExtensionsKt.setSingleClickListener$default(tvRestore, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10002.activity.Vip10002BActivity$onCreate$1
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
        TextView tvCancel = getBinding().tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10002.activity.Vip10002BActivity$onCreate$2
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
                Vip10002BActivity.this.trackClose();
                Vip10002BActivity.this.finish();
            }
        }, 1, (Object) null);
        String string = getString(R.string.coinlist_exportconversion_title_summary);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.coinlist_exportconversion_caption_function);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + "\n" + string2);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, string2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, string2, 0, false, 6, (Object) null) + string2.length(), 17);
        getBinding().titleTv.setText(spannableStringBuilder2);
        TextView purchaseTv = getBinding().purchaseTv;
        Intrinsics.checkNotNullExpressionValue(purchaseTv, "purchaseTv");
        ViewExtensionsKt.setSingleClickListener$default(purchaseTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10002.activity.Vip10002BActivity$onCreate$3
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
                str = Vip10002BActivity.this.yearlySKU;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        }, 1, (Object) null);
        Vip10002Adapter vip10002Adapter = new Vip10002Adapter();
        vip10002Adapter.setNewData(this.cardData);
        getBinding().rv.setAdapter(vip10002Adapter);
        getBinding().rv.setScrollStep(3, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBinding().rv.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getBinding().rv.stop();
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
}
