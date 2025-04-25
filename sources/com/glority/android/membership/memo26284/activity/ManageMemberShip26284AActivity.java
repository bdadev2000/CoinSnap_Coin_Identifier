package com.glority.android.membership.memo26284.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.membership.memo19162.utils.MemberShipUtil;
import com.glority.android.membership.memo19162.utils.VipInfo;
import com.glority.android.picturexx.payment.skumanager.SkuManager;
import com.glority.purchase.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ManageMemberShip26284AActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/glority/android/membership/memo26284/activity/ManageMemberShip26284AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "oneStatus", "", "twoStatus", LogEventArguments.ARG_SKU, "", "bStartDate", "Landroid/widget/TextView;", "bPremium", "bTextDate", "bEndDate", "bPayType", "bIvClose", "Landroid/view/View;", "bTvKeep", "bTvChange", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "changePrice", "purchaseui_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes3.dex */
public final class ManageMemberShip26284AActivity extends BasePurchaseActivity {
    private TextView bEndDate;
    private View bIvClose;
    private TextView bPayType;
    private TextView bPremium;
    private TextView bStartDate;
    private TextView bTextDate;
    private View bTvChange;
    private View bTvKeep;
    private boolean oneStatus;
    private String sku;
    private boolean twoStatus;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        View view;
        View view2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memship_memo26284a_activity_manage_member_ship);
        this.bStartDate = (TextView) findViewById(R.id.b_start_date);
        this.bPremium = (TextView) findViewById(R.id.b_premium);
        this.bTextDate = (TextView) findViewById(R.id.b_text_date);
        this.bEndDate = (TextView) findViewById(R.id.b_end_date);
        this.bPayType = (TextView) findViewById(R.id.b_pay_type);
        this.bIvClose = findViewById(R.id.b_iv_close);
        this.bTvKeep = findViewById(R.id.b_tv_keep);
        this.bTvChange = findViewById(R.id.b_tv_change);
        TextView textView = this.bStartDate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bStartDate");
            textView = null;
        }
        textView.setText(MemberShipUtil.INSTANCE.getStartTime());
        if (MemberShipUtil.INSTANCE.isFreeTrial()) {
            String string = getString(R.string.memship_memo18378_text_premium_7_day_free_trial);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            VipInfo vipInfo = MemberShipUtil.INSTANCE.getVipInfo();
            String sku = vipInfo != null ? vipInfo.getSku() : null;
            Integer trialDays = SkuManager.INSTANCE.getTrialDays(sku == null ? "" : sku);
            if (sku != null && sku.length() > 0 && trialDays != null && trialDays.intValue() != 7) {
                string = StringsKt.replace$default(string, "7", String.valueOf(trialDays), false, 4, (Object) null);
            }
            TextView textView2 = this.bPremium;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bPremium");
                textView2 = null;
            }
            textView2.setText(string);
            TextView textView3 = this.bTextDate;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bTextDate");
                textView3 = null;
            }
            textView3.setText(getString(R.string.memship_memo18378_text_free_trial_ends_in));
            TextView textView4 = this.bEndDate;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bEndDate");
                textView4 = null;
            }
            int i = R.string.memship_memo18378_text_format_days;
            Object[] objArr = new Object[1];
            objArr[0] = trialDays != null ? String.valueOf(trialDays) : "7";
            textView4.setText(getString(i, objArr));
        } else {
            TextView textView5 = this.bPremium;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bPremium");
                textView5 = null;
            }
            textView5.setText(getString(R.string.memship_memo18378_text_premium));
            TextView textView6 = this.bTextDate;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bTextDate");
                textView6 = null;
            }
            textView6.setText(getString(R.string.memship_memo18378_text_next_billing_date));
            TextView textView7 = this.bEndDate;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bEndDate");
                textView7 = null;
            }
            textView7.setText(MemberShipUtil.INSTANCE.getEndTime());
        }
        changePrice();
        View view3 = this.bIvClose;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bIvClose");
            view3 = null;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.membership.memo26284.activity.ManageMemberShip26284AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                ManageMemberShip26284AActivity.onCreate$lambda$0(ManageMemberShip26284AActivity.this, view4);
            }
        });
        View view4 = this.bTvKeep;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bTvKeep");
            view = null;
        } else {
            view = view4;
        }
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.membership.memo26284.activity.ManageMemberShip26284AActivity$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view5) {
                invoke2(view5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                boolean z;
                String str;
                String str2;
                boolean z2;
                Intrinsics.checkNotNullParameter(it, "it");
                z = ManageMemberShip26284AActivity.this.oneStatus;
                if (!z) {
                    z2 = ManageMemberShip26284AActivity.this.twoStatus;
                    if (!z2) {
                        MemberShipUtil.INSTANCE.clickKeepPlan();
                        ManageMemberShip26284AActivity.this.finish();
                        return;
                    }
                }
                MemberShipUtil memberShipUtil = MemberShipUtil.INSTANCE;
                str = ManageMemberShip26284AActivity.this.sku;
                memberShipUtil.clickChangePlan(str);
                str2 = ManageMemberShip26284AActivity.this.sku;
                new GuidePurchaseRequest(str2, null, 2, null).post();
            }
        }, 1, (Object) null);
        View view5 = this.bTvChange;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bTvChange");
            view2 = null;
        } else {
            view2 = view5;
        }
        ViewExtensionsKt.setSingleClickListener$default(view2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.membership.memo26284.activity.ManageMemberShip26284AActivity$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view6) {
                invoke2(view6);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MemberShipUtil.INSTANCE.clickCancelPlan();
                new LogEventRequest("membership_togooglecancel_click", null, 2, null).post();
                MemberShipUtil.INSTANCE.toGoogleSubscriptionsPage(ManageMemberShip26284AActivity.this);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ManageMemberShip26284AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MemberShipUtil.INSTANCE.clickX();
        this$0.finish();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String string;
        VipInfo vipInfo = MemberShipUtil.INSTANCE.getVipInfo();
        TextView textView = null;
        String sku = vipInfo != null ? vipInfo.getSku() : null;
        String str = sku;
        if (str == null || str.length() == 0) {
            TextView textView2 = this.bPayType;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bPayType");
            } else {
                textView = textView2;
            }
            textView.setText(getString(R.string.memship_memo18378_text_1_year_billing));
            return;
        }
        Integer skuCycle = SkuManager.INSTANCE.getSkuCycle(sku);
        Integer skuCycleValue = SkuManager.INSTANCE.getSkuCycleValue(sku);
        if (skuCycle != null && skuCycle.intValue() == 2) {
            string = getString(R.string.memship_memo18378_text_1_year_billing);
        } else if (skuCycle != null && skuCycle.intValue() == 1) {
            string = getString(R.string.memship_memo18378_text_1_month_billing);
        } else {
            string = (skuCycle != null && skuCycle.intValue() == 0) ? getString(R.string.memship_memo18378_text_1_week_billing) : getString(R.string.memship_memo18378_text_1_year_billing);
        }
        String str2 = string;
        Intrinsics.checkNotNull(str2);
        if (skuCycleValue == null || skuCycleValue.intValue() != 1) {
            str2 = StringsKt.replace$default(str2, "1", String.valueOf(skuCycleValue), false, 4, (Object) null);
        }
        TextView textView3 = this.bPayType;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bPayType");
        } else {
            textView = textView3;
        }
        textView.setText(str2);
    }
}
