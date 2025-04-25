package com.glority.android.guide.memo50432.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo50432.R;
import com.glority.android.uimaker.UIMaker;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.widget.purchase.policy.GlBasePolicyView;
import com.glority.widget.uitls.TextSizeUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* compiled from: Vip50432AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/android/guide/memo50432/activity/Vip50432AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "currentSku", "", "jsonFile", "monthlySKU", "newPurchaseView", "Landroid/view/View;", "rootView", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "yearlySKU", "changePrice", "", "changeSKU", LogEventArguments.ARG_SKU, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "replacePurchase", "showBackPressedCloseRetain", "", "smartTextList", "billingDescGroup", "Landroid/view/ViewGroup;", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes10.dex */
public final class Vip50432AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private View newPurchaseView;
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly";
    private String monthlySKU = "sub_month_pro";
    private final String jsonFile = "504321.json";
    private String currentSku = "sub_yearly";

    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIMaker uIMaker = new UIMaker(this, true);
        this.uiMaker = uIMaker;
        InputStream open = getAssets().open(this.jsonFile);
        Intrinsics.checkNotNullExpressionValue(open, "assets.open(jsonFile)");
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo50432.activity.Vip50432AActivity$onCreate$1
            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClickByTag(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                UiMakerOnClickListener.DefaultImpls.onClickByTag(this, tag);
            }

            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClick(ClickEnum clickEnum) {
                Intrinsics.checkNotNullParameter(clickEnum, "clickEnum");
                if (clickEnum == ClickEnum.restore) {
                    new GuideRestoreRequest(false, null, 3, null).post();
                } else if (clickEnum == ClickEnum.close) {
                    Vip50432AActivity.this.trackClose();
                    Vip50432AActivity.this.postUiCloseRequest();
                }
            }
        });
        this.rootView = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        setContentView(view, new ViewGroup.LayoutParams(-1, -1));
        replacePurchase();
        UIMaker uIMaker2 = this.uiMaker;
        if (uIMaker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
        }
        UIMaker uIMaker3 = this.uiMaker;
        if (uIMaker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
        }
        IUIMakerView findViewByUiMakerTag = uIMaker2.findViewByUiMakerTag("GlBasePolicyView", uIMaker3.getScrollView());
        Intrinsics.checkNotNull(findViewByUiMakerTag);
        TextView policyContentView = ((GlBasePolicyView) findViewByUiMakerTag).getPolicyContentView();
        UIMaker uIMaker4 = this.uiMaker;
        if (uIMaker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
        }
        new BillingUIScrollToDataPolicyRequest(uIMaker4.getScrollView(), policyContentView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyContentView, 1).post();
        View view2 = this.rootView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        smartTextList((ViewGroup) view2.findViewWithTag("billingDesGroup"));
    }

    private final void replacePurchase() {
        View view = this.rootView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View holderView = view.findViewWithTag("icon_purchase_holder");
        View inflate = getLayoutInflater().inflate(R.layout.bui_memo50432_purchase, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutInflater.inflate(R…memo50432_purchase, null)");
        this.newPurchaseView = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        Intrinsics.checkNotNullExpressionValue(holderView, "holderView");
        inflate.setId(holderView.getId());
        ViewParent parent = holderView.getParent();
        if (parent == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(holderView);
        View view2 = this.newPurchaseView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        viewGroup.addView(view2, holderView.getLayoutParams());
        View view3 = this.newPurchaseView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        View findViewById = view3.findViewById(R.id.year_ll);
        View view4 = this.newPurchaseView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        View findViewById2 = view4.findViewById(R.id.month_ll);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50432.activity.Vip50432AActivity$replacePurchase$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                String str;
                String str2;
                Vip50432AActivity vip50432AActivity = Vip50432AActivity.this;
                str = vip50432AActivity.yearlySKU;
                vip50432AActivity.changeSKU(str);
                str2 = Vip50432AActivity.this.yearlySKU;
                new GuidePurchaseRequest(str2, null, 2, null).post();
            }
        });
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50432.activity.Vip50432AActivity$replacePurchase$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                String str;
                String str2;
                Vip50432AActivity vip50432AActivity = Vip50432AActivity.this;
                str = vip50432AActivity.monthlySKU;
                vip50432AActivity.changeSKU(str);
                str2 = Vip50432AActivity.this.monthlySKU;
                new GuidePurchaseRequest(str2, null, 2, null).post();
            }
        });
        View view5 = this.newPurchaseView;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        view5.findViewById(R.id.continue_tv).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50432.activity.Vip50432AActivity$replacePurchase$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                String str;
                str = Vip50432AActivity.this.currentSku;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        });
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result != null) {
            String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
            if (result2 == null) {
                result2 = "";
            }
            String result3 = new BillingUIGetPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
            String str = result3 != null ? result3 : "";
            int roundToInt = MathKt.roundToInt((1 - ((Float.parseFloat(result2) / 12) / Float.parseFloat(str))) * 100);
            View view = this.newPurchaseView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            }
            View findViewById = view.findViewById(R.id.off_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "newPurchaseView.findView…Id<TextView>(R.id.off_tv)");
            ((TextView) findViewById).setText(new StringBuilder().append(roundToInt).append('%').toString());
            float parseFloat = ((int) ((Float.parseFloat(result2) / 12.0d) * 100)) / 100.0f;
            View view2 = this.newPurchaseView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            }
            View findViewById2 = view2.findViewById(R.id.year_price_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "newPurchaseView.findView…View>(R.id.year_price_tv)");
            ((TextView) findViewById2).setText(getString(R.string.bui_memo50432_8, new Object[]{result + parseFloat}));
            View view3 = this.newPurchaseView;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            }
            View findViewById3 = view3.findViewById(R.id.month_price_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "newPurchaseView.findView…iew>(R.id.month_price_tv)");
            ((TextView) findViewById3).setText(getString(R.string.bui_memo50432_8, new Object[]{result + str}));
            String string = getString(R.string.bui_memo50432_7, new Object[]{result + str});
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bui_m…7,\"$code${monthlyPrice}\")");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + ' ' + result + result2);
            spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, string.length(), 18);
            View view4 = this.newPurchaseView;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            }
            View findViewById4 = view4.findViewById(R.id.year_info_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "newPurchaseView.findView…tView>(R.id.year_info_tv)");
            ((TextView) findViewById4).setText(spannableStringBuilder);
            View view5 = this.newPurchaseView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
            }
            View findViewById5 = view5.findViewById(R.id.month_info_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "newPurchaseView.findView…View>(R.id.month_info_tv)");
            ((TextView) findViewById5).setText(result + str);
            View view6 = this.rootView;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById6 = view6.findViewById(R.id.title_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "rootView.findViewById<View>(R.id.title_tv)");
            findViewById6.setVisibility(8);
        }
    }

    private final void smartTextList(ViewGroup billingDescGroup) {
        if (billingDescGroup != null) {
            TextSizeUtils.INSTANCE.smartTextListSize(SequencesKt.toList(SequencesKt.filterIsInstance(ViewGroupKt.getChildren(billingDescGroup), TextView.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeSKU(String sku) {
        this.currentSku = sku;
        View view = this.newPurchaseView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        View findViewById = view.findViewById(R.id.month_ll);
        View view2 = this.newPurchaseView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newPurchaseView");
        }
        View findViewById2 = view2.findViewById(R.id.year_ll);
        findViewById.setBackgroundResource(Intrinsics.areEqual(sku, this.monthlySKU) ? R.drawable.bui_memo50432_select : R.drawable.bui_memo50432_unselect);
        findViewById2.setBackgroundResource(Intrinsics.areEqual(sku, this.yearlySKU) ? R.drawable.bui_memo50432_select : R.drawable.bui_memo50432_unselect);
    }
}
