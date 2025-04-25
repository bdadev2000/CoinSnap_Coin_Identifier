package com.glority.android.guide.memo10002.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityPurchase10002aBinding;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView3Parameter;
import com.glority.widget.purchase.purchase.GlPurchaseView3;
import com.glority.widget.purchase.purchase.PurchaseType;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: Vip10002AActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/guide/memo10002/activity/Vip10002AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "yearlySKU", "", "monthlySKU", "weeklySKU", "binding", "Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002aBinding;", "getBinding", "()Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002aBinding;", "setBinding", "(Lcom/glority/android/picturexx/business/databinding/ActivityPurchase10002aBinding;)V", "cardData", "", "Lkotlin/Pair;", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "changePrice", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10002AActivity extends BasePurchaseActivity {
    public static final int $stable = 8;
    public ActivityPurchase10002aBinding binding;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";
    private final List<Pair<Integer, Integer>> cardData = CollectionsKt.listOf((Object[]) new Pair[]{new Pair(Integer.valueOf(R.drawable.icon_vip_10002_1), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro1)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_2), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro2)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_3), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro3)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_4), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro4)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_5), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro5)), new Pair(Integer.valueOf(R.drawable.icon_vip_10002_6), Integer.valueOf(R.string.coinlist_exportconversion_caption_featureintro6))});

    public final ActivityPurchase10002aBinding getBinding() {
        ActivityPurchase10002aBinding activityPurchase10002aBinding = this.binding;
        if (activityPurchase10002aBinding != null) {
            return activityPurchase10002aBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityPurchase10002aBinding activityPurchase10002aBinding) {
        Intrinsics.checkNotNullParameter(activityPurchase10002aBinding, "<set-?>");
        this.binding = activityPurchase10002aBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinding(ActivityPurchase10002aBinding.inflate(getLayoutInflater()));
        setContentView(getBinding().getRoot());
        InputStream open = getAssets().open("10002a_purchase.json");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            GlPurchaseView3Parameter glPurchaseView3Parameter = (GlPurchaseView3Parameter) new Gson().fromJson(TextStreamsKt.readText(bufferedReader), GlPurchaseView3Parameter.class);
            GlPurchaseView3 glPurchaseView3 = getBinding().gpv3;
            ResourceConverter resourceConverter = new ResourceConverter(360, 640, this);
            Intrinsics.checkNotNull(glPurchaseView3Parameter);
            glPurchaseView3.parseParameter(true, resourceConverter, glPurchaseView3Parameter);
            CardView cardView = (CardView) getBinding().gpv3.findViewById(R.id.ll_weekly);
            if (cardView != null) {
                cardView.setElevation(0.0f);
                cardView.setTranslationZ(0.0f);
            }
            CardView cardView2 = (CardView) getBinding().gpv3.findViewById(R.id.ll_monthly);
            if (cardView2 != null) {
                cardView2.setElevation(0.0f);
                cardView2.setTranslationZ(0.0f);
            }
            CardView cardView3 = (CardView) getBinding().gpv3.findViewById(R.id.ll_7_day_free);
            if (cardView3 != null) {
                cardView3.setElevation(0.0f);
                cardView3.setTranslationZ(0.0f);
                Unit unit = Unit.INSTANCE;
            }
            CloseableKt.closeFinally(bufferedReader, null);
            ScrollView sv = getBinding().sv;
            Intrinsics.checkNotNullExpressionValue(sv, "sv");
            new BillingUIScrollToDataPolicyRequest(sv, getBinding().gpv1.getPolicyContentView(), null, 4, null).post();
            new BillingUISetPolicyClickRequest(this, getBinding().gpv1.getPolicyContentView()).post();
            TextView tvRestore = getBinding().tvRestore;
            Intrinsics.checkNotNullExpressionValue(tvRestore, "tvRestore");
            ViewExtensionsKt.setSingleClickListener$default(tvRestore, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10002.activity.Vip10002AActivity$onCreate$2
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
            ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo10002.activity.Vip10002AActivity$onCreate$3
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
                    Vip10002AActivity.this.trackClose();
                    Vip10002AActivity.this.finish();
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
            Vip10002Adapter vip10002Adapter = new Vip10002Adapter();
            vip10002Adapter.setNewData(this.cardData);
            getBinding().rv.setAdapter(vip10002Adapter);
            getBinding().rv.setScrollStep(3, 0);
        } finally {
        }
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
        String result3 = new BillingUIGetPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
        if (result3 == null) {
            result3 = "";
        }
        String result4 = new BillingUIGetPriceBySkuRequest(this.weeklySKU, null, 2, null).toResult();
        String str = result4 != null ? result4 : "";
        GlPurchaseView3 glPurchaseView3 = getBinding().gpv3;
        glPurchaseView3.setPrice(PurchaseType.YEARLY_7DT, result2, result);
        glPurchaseView3.setPrice(PurchaseType.MONTHLY, result3, result);
        glPurchaseView3.setPrice(PurchaseType.WEEKLY, str, result);
        getBinding().gpv3.setUiMakerOnClickListener(new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo10002.activity.Vip10002AActivity$changePrice$2
            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClickByTag(String str2) {
                UiMakerOnClickListener.DefaultImpls.onClickByTag(this, str2);
            }

            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClick(ClickEnum clickEnum) {
                String str2;
                String str3;
                String str4;
                Intrinsics.checkNotNullParameter(clickEnum, "clickEnum");
                if (clickEnum == ClickEnum.buyYearly) {
                    str4 = Vip10002AActivity.this.yearlySKU;
                    new GuidePurchaseRequest(str4, null, 2, null).post();
                } else if (clickEnum == ClickEnum.buyMontly) {
                    str3 = Vip10002AActivity.this.monthlySKU;
                    new GuidePurchaseRequest(str3, null, 2, null).post();
                } else if (clickEnum == ClickEnum.buyWeakly) {
                    str2 = Vip10002AActivity.this.weeklySKU;
                    new GuidePurchaseRequest(str2, null, 2, null).post();
                }
            }
        });
    }
}
