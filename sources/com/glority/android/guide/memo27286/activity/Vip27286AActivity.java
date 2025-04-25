package com.glority.android.guide.memo27286.activity;

import android.os.Bundle;
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
import com.glority.android.core.route.guide.GuidePurchaseWithoutDetainRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo27286.R;
import com.glority.android.guide.memo27286.dialog.Vip27286MakeSureDialog;
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
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* compiled from: Vip27286AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\nJ\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/android/guide/memo27286/activity/Vip27286AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "hasClickContinue", "", "getHasClickContinue", "()Z", "setHasClickContinue", "(Z)V", "jsonFile", "", "monthlySKU", "purchaseView", "Landroid/view/View;", "rootView", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "weeklySKU", "yearlySKU", "changePrice", "", "getSku", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "smartTextList", "billingDescGroup", "Landroid/view/ViewGroup;", "tryTrial", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes10.dex */
public final class Vip27286AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private boolean hasClickContinue;
    private View purchaseView;
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";
    private final String jsonFile = "272861.json";

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

    public final boolean getHasClickContinue() {
        return this.hasClickContinue;
    }

    public final void setHasClickContinue(boolean z) {
        this.hasClickContinue = z;
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
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo27286.activity.Vip27286AActivity$onCreate$1
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
                    return;
                }
                if (clickEnum == ClickEnum.close) {
                    Vip27286AActivity.this.trackClose();
                    if (!Vip27286AActivity.this.getHasClickContinue()) {
                        Vip27286AActivity.this.postUiCloseRequest();
                    } else {
                        Vip27286AActivity.this.close();
                    }
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
            int i = R.layout.bui_memo27286_purchase_layout;
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
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo27286.activity.Vip27286AActivity$onCreate$$inlined$apply$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    if (!Vip27286AActivity.this.getHasClickContinue()) {
                        Vip27286AActivity.this.setHasClickContinue(true);
                    }
                    new Vip27286MakeSureDialog().show(Vip27286AActivity.this.getSupportFragmentManager(), "27286A");
                }
            });
        }
    }

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return !this.hasClickContinue;
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        TextView textView;
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result != null) {
            String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
            if (result2 == null) {
                result2 = "";
            }
            new BillingUIGetPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
            new BillingUIGetPriceBySkuRequest(this.weeklySKU, null, 2, null).toResult();
            View view = this.purchaseView;
            if (view == null || (textView = (TextView) view.findViewById(R.id.info_tv)) == null) {
                return;
            }
            textView.setText(getString(R.string.bui_memo_27086_price_then_year, new Object[]{result + result2}));
        }
    }

    private final void smartTextList(ViewGroup billingDescGroup) {
        if (billingDescGroup != null) {
            TextSizeUtils.INSTANCE.smartTextListSize(SequencesKt.toList(SequencesKt.filterIsInstance(ViewGroupKt.getChildren(billingDescGroup), TextView.class)));
        }
    }

    public final void tryTrial() {
        new GuidePurchaseWithoutDetainRequest(this.yearlySKU, null, 2, null).post();
    }

    /* renamed from: getSku, reason: from getter */
    public final String getYearlySKU() {
        return this.yearlySKU;
    }
}
