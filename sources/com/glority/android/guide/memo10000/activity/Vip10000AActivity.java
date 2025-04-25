package com.glority.android.guide.memo10000.activity;

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
import com.glority.widget.uitls.TextSizeUtils;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;

/* compiled from: Vip10000AActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/glority/android/guide/memo10000/activity/Vip10000AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "uiMaker", "Lcom/glority/android/uimaker/UIMaker;", "rootView", "Landroid/view/View;", "yearlySKU", "", "monthlySKU", "weeklySKU", "jsonFile", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "", "changePrice", "smartTextList", "billingDescGroup", "Landroid/view/ViewGroup;", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10000AActivity extends BasePurchaseActivity {
    private View rootView;
    private UIMaker uiMaker;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "";
    private String weeklySKU = "";
    private final String jsonFile = "100001.json";

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
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        View view = uIMaker.toView(TextStreamsKt.readText(new InputStreamReader(open, Charsets.UTF_8)), new UiMakerOnClickListener() { // from class: com.glority.android.guide.memo10000.activity.Vip10000AActivity$onCreate$1
            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClickByTag(String str) {
                UiMakerOnClickListener.DefaultImpls.onClickByTag(this, str);
            }

            @Override // com.glority.android.uimaker.parameter.UiMakerOnClickListener
            public void onClick(ClickEnum clickEnum) {
                Intrinsics.checkNotNullParameter(clickEnum, "clickEnum");
                if (clickEnum == ClickEnum.restore) {
                    new GuideRestoreRequest(false, null, 3, null).post();
                } else if (clickEnum == ClickEnum.close) {
                    Vip10000AActivity.this.trackClose();
                    Vip10000AActivity.this.postUiCloseRequest();
                }
            }
        });
        this.rootView = view;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view = null;
        }
        setContentView(view, new ViewGroup.LayoutParams(-1, -1));
        UIMaker uIMaker2 = this.uiMaker;
        if (uIMaker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            uIMaker2 = null;
        }
        UIMaker uIMaker3 = this.uiMaker;
        if (uIMaker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            uIMaker3 = null;
        }
        IUIMakerView findViewByUiMakerTag = uIMaker2.findViewByUiMakerTag("GlBasePolicyView", uIMaker3.getScrollView());
        Intrinsics.checkNotNull(findViewByUiMakerTag);
        TextView policyContentView = ((GlBasePolicyView) findViewByUiMakerTag).getPolicyContentView();
        UIMaker uIMaker4 = this.uiMaker;
        if (uIMaker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiMaker");
            uIMaker4 = null;
        }
        new BillingUIScrollToDataPolicyRequest(uIMaker4.getScrollView(), policyContentView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyContentView).post();
        View view3 = this.rootView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            view3 = null;
        }
        smartTextList((ViewGroup) view3.findViewWithTag("billingDesGroup"));
        View view4 = this.rootView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        } else {
            view2 = view4;
        }
        view2.findViewWithTag("icon_purchase").setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo10000.activity.Vip10000AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                Vip10000AActivity.onCreate$lambda$0(Vip10000AActivity.this, view5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Vip10000AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new GuidePurchaseRequest(this$0.yearlySKU, null, 2, null).post();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        if (new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult() == null) {
            return;
        }
        new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
    }

    private final void smartTextList(ViewGroup billingDescGroup) {
        if (billingDescGroup == null) {
            return;
        }
        TextSizeUtils.INSTANCE.smartTextListSize(SequencesKt.toList(SequencesKt.filterIsInstance(ViewGroupKt.getChildren(billingDescGroup), TextView.class)));
    }
}
