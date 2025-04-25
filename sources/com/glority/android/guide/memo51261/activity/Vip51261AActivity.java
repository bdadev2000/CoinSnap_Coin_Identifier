package com.glority.android.guide.memo51261.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo51261.R;
import com.glority.android.guide.memo51261.databinding.BuiMemo51261ActivityVipLayoutBinding;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: Vip51261AActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\"H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/glority/android/guide/memo51261/activity/Vip51261AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "binding", "Lcom/glority/android/guide/memo51261/databinding/BuiMemo51261ActivityVipLayoutBinding;", "ivClose", "Landroid/widget/ImageView;", "getIvClose", "()Landroid/widget/ImageView;", "llMonthly", "Landroid/widget/LinearLayout;", "getLlMonthly", "()Landroid/widget/LinearLayout;", "llWeekly", "getLlWeekly", "llYearly", "getLlYearly", LogEventArguments.ARG_SKU, "", "tvContinue", "Landroidx/appcompat/widget/AppCompatTextView;", "getTvContinue", "()Landroidx/appcompat/widget/AppCompatTextView;", "tvRestore", "Landroid/widget/TextView;", "getTvRestore", "()Landroid/widget/TextView;", "changePrice", "", "initListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "", "Companion", "guide-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Vip51261AActivity extends BasePurchaseActivity {
    private static final String monthlySku = "sub_month";
    private static final String weeklySku = "sub_week";
    private static final String yearlySku = "sub_yearly";
    private BuiMemo51261ActivityVipLayoutBinding binding;
    private String sku = yearlySku;

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    private final TextView getTvRestore() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        TextView textView = buiMemo51261ActivityVipLayoutBinding.tvRestore;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvRestore");
        return textView;
    }

    private final ImageView getIvClose() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        ImageView imageView = buiMemo51261ActivityVipLayoutBinding.ivClose;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
        return imageView;
    }

    private final AppCompatTextView getTvContinue() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        AppCompatTextView appCompatTextView = buiMemo51261ActivityVipLayoutBinding.tvContinue;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvContinue");
        return appCompatTextView;
    }

    private final LinearLayout getLlYearly() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        LinearLayout linearLayout = buiMemo51261ActivityVipLayoutBinding.llYearly;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llYearly");
        return linearLayout;
    }

    private final LinearLayout getLlMonthly() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        LinearLayout linearLayout = buiMemo51261ActivityVipLayoutBinding.llMonthly;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llMonthly");
        return linearLayout;
    }

    private final LinearLayout getLlWeekly() {
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding = null;
        }
        LinearLayout linearLayout = buiMemo51261ActivityVipLayoutBinding.llWeekly;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llWeekly");
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuiMemo51261ActivityVipLayoutBinding inflate = BuiMemo51261ActivityVipLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        initListener();
        Vip51261AActivity vip51261AActivity = this;
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding2 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding2 = null;
        }
        TextView textView = buiMemo51261ActivityVipLayoutBinding2.tvDataPolicy;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvDataPolicy");
        new BillingUISetPolicyClickRequest(vip51261AActivity, textView).post();
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding3 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding3 = null;
        }
        ScrollView scrollView = buiMemo51261ActivityVipLayoutBinding3.svTop;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.svTop");
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding4 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo51261ActivityVipLayoutBinding = buiMemo51261ActivityVipLayoutBinding4;
        }
        TextView textView2 = buiMemo51261ActivityVipLayoutBinding.tvDataPolicy;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvDataPolicy");
        new BillingUIScrollToDataPolicyRequest(scrollView, textView2, null, 4, null).post();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result;
        Float floatOrNull;
        Float floatOrNull2;
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding = null;
        String result2 = new BillingUIGetCurrencyCodeRequest(yearlySku, null, 2, null).toResult();
        if (result2 == null || (result = new BillingUIGetPriceBySkuRequest(yearlySku, null, 2, null).toResult()) == null || (floatOrNull = StringsKt.toFloatOrNull(result)) == null) {
            return;
        }
        float floatValue = floatOrNull.floatValue();
        String result3 = new BillingUIGetPriceBySkuRequest(monthlySku, null, 2, null).toResult();
        if (result3 == null || (floatOrNull2 = StringsKt.toFloatOrNull(result3)) == null) {
            return;
        }
        float floatValue2 = floatOrNull2.floatValue();
        String result4 = new BillingUIGetPriceBySkuRequest(weeklySku, null, 2, null).toResult();
        if (result4 == null) {
            return;
        }
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding2 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding2 = null;
        }
        buiMemo51261ActivityVipLayoutBinding2.tvMonthlyPrice.setText(result2 + result3);
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding3 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding3 = null;
        }
        buiMemo51261ActivityVipLayoutBinding3.tvWeeklyPrice.setText(result2 + result4);
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding4 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding4 = null;
        }
        buiMemo51261ActivityVipLayoutBinding4.tvYearlyPrice.setText(result2 + result);
        BigDecimal scale = new BigDecimal(String.valueOf(floatValue / 12.0f)).setScale(2, RoundingMode.HALF_UP);
        int roundToInt = MathKt.roundToInt((1 - (floatValue / (floatValue2 * 12))) * 100);
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding5 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo51261ActivityVipLayoutBinding5 = null;
        }
        buiMemo51261ActivityVipLayoutBinding5.tvPricePerMonth.setText(getResources().getString(R.string.bui_memo51261_subscription_plan_yearly_monthly_cost, result2 + scale));
        BuiMemo51261ActivityVipLayoutBinding buiMemo51261ActivityVipLayoutBinding6 = this.binding;
        if (buiMemo51261ActivityVipLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo51261ActivityVipLayoutBinding = buiMemo51261ActivityVipLayoutBinding6;
        }
        buiMemo51261ActivityVipLayoutBinding.tvSavePercent.setText(getResources().getString(R.string.bui_memo51261_subscription_plan_yearly_discount, new StringBuilder().append(roundToInt).append('%').toString()));
    }

    private final void initListener() {
        getTvRestore().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$0(view);
            }
        });
        getIvClose().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$1(Vip51261AActivity.this, view);
            }
        });
        getTvContinue().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$2(Vip51261AActivity.this, view);
            }
        });
        getLlYearly().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$3(Vip51261AActivity.this, view);
            }
        });
        getLlMonthly().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$4(Vip51261AActivity.this, view);
            }
        });
        getLlWeekly().setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51261.activity.Vip51261AActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51261AActivity.initListener$lambda$5(Vip51261AActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(View view) {
        new GuideRestoreRequest(false, null, 3, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$1(Vip51261AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackClose();
        this$0.postUiCloseRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(Vip51261AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new GuidePurchaseRequest(this$0.sku, null, 2, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(Vip51261AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sku = yearlySku;
        new GuidePurchaseRequest(this$0.sku, null, 2, null).post();
        this$0.getLlYearly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_19ffffff_stroke_faaf19_r_10);
        this$0.getLlMonthly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_r_10);
        this$0.getLlWeekly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_r_10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$4(Vip51261AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sku = monthlySku;
        new GuidePurchaseRequest(this$0.sku, null, 2, null).post();
        this$0.getLlYearly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_stroke_bdbdbd_r_10);
        this$0.getLlMonthly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_19ffffff_stroke_faaf19_r_10);
        this$0.getLlWeekly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_r_10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$5(Vip51261AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sku = weeklySku;
        new GuidePurchaseRequest(this$0.sku, null, 2, null).post();
        this$0.getLlYearly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_stroke_bdbdbd_r_10);
        this$0.getLlMonthly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_30c4c4c4_r_10);
        this$0.getLlWeekly().setBackgroundResource(R.drawable.bui_memo51261_shape_solid_19ffffff_stroke_faaf19_r_10);
    }
}
