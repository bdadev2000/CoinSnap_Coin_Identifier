package com.glority.android.guide.memo27267.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo27267.R;
import com.glority.android.uimaker.UIMaker;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.widget.purchase.policy.GlBasePolicyView;
import com.glority.widget.uitls.TextSizeUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: Vip27267AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/guide/memo27267/activity/Vip27267AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "jsonFile", "", "purchaseView", "Landroid/view/View;", "rootView", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "yearlySKU", "changePrice", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "", "smartTextList", "billingDescGroup", "Landroid/view/ViewGroup;", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes10.dex */
public final class Vip27267AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private View purchaseView;
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly";
    private final String jsonFile = "272671.json";

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
        View findViewById;
        super.onCreate(savedInstanceState);
        UIMaker uIMaker = new UIMaker(this, true);
        this.uiMaker = uIMaker;
        InputStream open = getAssets().open(this.jsonFile);
        Intrinsics.checkNotNullExpressionValue(open, "assets.open(jsonFile)");
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo27267.activity.Vip27267AActivity$onCreate$1
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
                    Vip27267AActivity.this.trackClose();
                    Vip27267AActivity.this.postUiCloseRequest();
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
        UIMaker uIMaker5 = this.uiMaker;
        if (uIMaker5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
        }
        View findViewWithTag = uIMaker5.mo7943getRootView().findViewWithTag("icon_purchase_holder");
        if (findViewWithTag != null) {
            ViewParent parent = findViewWithTag.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            LayoutInflater layoutInflater = getLayoutInflater();
            int i = R.layout.bui_memo27267_purchase_layout;
            View rootView = findViewWithTag.getRootView();
            if (rootView == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            View inflate = layoutInflater.inflate(i, (ViewGroup) rootView, false);
            this.purchaseView = inflate;
            if (inflate != null) {
                inflate.setId(findViewWithTag.getId());
            }
            View view3 = this.purchaseView;
            if (view3 != null) {
                view3.setLayoutParams(findViewWithTag.getLayoutParams());
            }
            constraintLayout.removeView(findViewWithTag);
            constraintLayout.addView(this.purchaseView);
            View view4 = this.purchaseView;
            if (view4 == null || (findViewById = view4.findViewById(R.id.purchase_tv)) == null) {
                return;
            }
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo27267.activity.Vip27267AActivity$onCreate$$inlined$apply$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    String str;
                    str = Vip27267AActivity.this.yearlySKU;
                    new GuidePurchaseRequest(str, null, 2, null).post();
                }
            });
        }
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        TextView textView;
        TextView textView2;
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result != null) {
            String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
            if (result2 == null) {
                result2 = "";
            }
            double d = 0.1d;
            try {
                d = Math.max(0.1d, new BigDecimal(Double.parseDouble(result2) / 365).setScale(1, RoundingMode.UP).doubleValue());
            } catch (Throwable unused) {
            }
            String str = " " + result + ' ' + d;
            String string = getString(R.string.bui_memo_27267_less_than_day, new Object[]{String.valueOf(str)});
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bui_m…han_day, \"${priceValue}\")");
            String str2 = string;
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FAAF19")), StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null) + str.length(), 0);
            View view = this.purchaseView;
            if (view != null && (textView2 = (TextView) view.findViewById(R.id.info_tv)) != null) {
                textView2.setText(spannableString);
            }
            View view2 = this.purchaseView;
            if (view2 == null || (textView = (TextView) view2.findViewById(R.id.price_tv)) == null) {
                return;
            }
            textView.setText(getString(R.string.bui_memo_27267_PRICE_2, new Object[]{result + ' ' + result2}));
        }
    }

    private final void smartTextList(ViewGroup billingDescGroup) {
        if (billingDescGroup != null) {
            TextSizeUtils.INSTANCE.smartTextListSize(SequencesKt.toList(SequencesKt.filterIsInstance(ViewGroupKt.getChildren(billingDescGroup), TextView.class)));
        }
    }
}
