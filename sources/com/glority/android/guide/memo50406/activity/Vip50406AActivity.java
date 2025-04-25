package com.glority.android.guide.memo50406.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.uimaker.UIMaker;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.widget.purchase.policy.GlBasePolicyView;
import com.glority.widget.purchase.purchase.GlBasePurchaseView;
import com.glority.widget.purchase.purchase.PurchaseType;
import com.glority.widget.uitls.TextSizeUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* compiled from: Vip50406AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/guide/memo50406/activity/Vip50406AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "jsonFile", "", "monthlySKU", "rootView", "Landroid/view/View;", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "weeklySKU", "yearlySKU", "changePrice", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "", "smartTextList", "billingDescGroup", "Landroid/view/ViewGroup;", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes10.dex */
public final class Vip50406AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";
    private final String jsonFile = "504061.json";

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
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo50406.activity.Vip50406AActivity$onCreate$1
            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClickByTag(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                UiMakerOnClickListener.DefaultImpls.onClickByTag(this, tag);
            }

            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClick(ClickEnum clickEnum) {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(clickEnum, "clickEnum");
                if (clickEnum == ClickEnum.restore) {
                    new GuideRestoreRequest(false, null, 3, null).post();
                    return;
                }
                if (clickEnum == ClickEnum.close) {
                    Vip50406AActivity.this.trackClose();
                    Vip50406AActivity.this.postUiCloseRequest();
                    return;
                }
                if (clickEnum == ClickEnum.buyYearly) {
                    str3 = Vip50406AActivity.this.yearlySKU;
                    new GuidePurchaseRequest(str3, null, 2, null).post();
                } else if (clickEnum == ClickEnum.buyMontly) {
                    str2 = Vip50406AActivity.this.monthlySKU;
                    new GuidePurchaseRequest(str2, null, 2, null).post();
                } else if (clickEnum == ClickEnum.buyWeakly) {
                    str = Vip50406AActivity.this.weeklySKU;
                    new GuidePurchaseRequest(str, null, 2, null).post();
                }
            }
        });
        this.rootView = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        setContentView(view, new ViewGroup.LayoutParams(-1, -1));
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
        new BillingUISetPolicyClickRequest(this, policyContentView).post();
        View view2 = this.rootView;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        smartTextList((ViewGroup) view2.findViewWithTag("billingDesGroup"));
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
            if (result3 == null) {
                result3 = "";
            }
            String result4 = new BillingUIGetPriceBySkuRequest(this.weeklySKU, null, 2, null).toResult();
            String str = result4 != null ? result4 : "";
            UIMaker uIMaker = this.uiMaker;
            if (uIMaker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            }
            View view = this.rootView;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            GlBasePurchaseView glBasePurchaseView = (GlBasePurchaseView) uIMaker.findViewByUiMakerTag("GlBasePurchaseView", view);
            if (glBasePurchaseView != null) {
                glBasePurchaseView.setPrice(PurchaseType.YEARLY_7DT, result2, result);
                glBasePurchaseView.setPrice(PurchaseType.MONTHLY, result3, result);
                glBasePurchaseView.setPrice(PurchaseType.WEEKLY, str, result);
            }
        }
    }

    private final void smartTextList(ViewGroup billingDescGroup) {
        if (billingDescGroup != null) {
            TextSizeUtils.INSTANCE.smartTextListSize(SequencesKt.toList(SequencesKt.filterIsInstance(ViewGroupKt.getChildren(billingDescGroup), TextView.class)));
        }
    }
}
