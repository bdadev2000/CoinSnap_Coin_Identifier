package com.glority.android.guide.memo51262.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo51262.R;
import com.glority.android.guide.memo51262.databinding.BuiMemo512621PurchaseLayoutBinding;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Vip51262AActivity.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/guide/memo51262/activity/Vip51262AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "binding", "Lcom/glority/android/guide/memo51262/databinding/BuiMemo512621PurchaseLayoutBinding;", "currentSku", "", "changePrice", "", "initListener", "initMainBodyAnimation", "views", "", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showBackPressedCloseRetain", "", "Companion", "guide-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Vip51262AActivity extends BasePurchaseActivity {
    private static final String weeklySku = "sub_week_3dt";
    private static final String yearlySku = "sub_yearly";
    private BuiMemo512621PurchaseLayoutBinding binding;
    private String currentSku = weeklySku;

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuiMemo512621PurchaseLayoutBinding inflate = BuiMemo512621PurchaseLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding2 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding2 = null;
        }
        buiMemo512621PurchaseLayoutBinding2.setTrialDays(3);
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding3 = null;
        }
        buiMemo512621PurchaseLayoutBinding3.setSelectedIndex(1);
        initListener();
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding4 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512621PurchaseLayoutBinding = buiMemo512621PurchaseLayoutBinding4;
        }
        LinearLayout linearLayout = buiMemo512621PurchaseLayoutBinding.llRootContainer;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llRootContainer");
        List list = SequencesKt.toList(ViewGroupKt.getChildren(linearLayout));
        ((LottieAnimationView) findViewById(R.id.iv_anima)).setImageAssetsFolder("images");
        TextView policyView = (TextView) findViewById(R.id.policy_tv);
        View findViewById = findViewById(R.id.sv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.sv)");
        Intrinsics.checkNotNullExpressionValue(policyView, "policyView");
        new BillingUIScrollToDataPolicyRequest((ScrollView) findViewById, policyView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyView).post();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(0.0f);
        }
        initMainBodyAnimation(list);
    }

    private final void initMainBodyAnimation(Collection<? extends View> views) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Vip51262AActivity$initMainBodyAnimation$1(views, null), 3, null);
    }

    private final void initListener() {
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding = this.binding;
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding2 = null;
        if (buiMemo512621PurchaseLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding = null;
        }
        LinearLayout linearLayout = buiMemo512621PurchaseLayoutBinding.llYearlyYearlyItem;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llYearlyYearlyItem");
        ViewExtensionsKt.setSingleClickListener$default(linearLayout, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51262.activity.Vip51262AActivity$initListener$1
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
                BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding3;
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                buiMemo512621PurchaseLayoutBinding3 = Vip51262AActivity.this.binding;
                if (buiMemo512621PurchaseLayoutBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    buiMemo512621PurchaseLayoutBinding3 = null;
                }
                buiMemo512621PurchaseLayoutBinding3.setSelectedIndex(0);
                Vip51262AActivity.this.currentSku = "sub_yearly";
                str = Vip51262AActivity.this.currentSku;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        }, 1, (Object) null);
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding3 = null;
        }
        LinearLayout linearLayout2 = buiMemo512621PurchaseLayoutBinding3.llYearlyWeeklyItem;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llYearlyWeeklyItem");
        ViewExtensionsKt.setSingleClickListener$default(linearLayout2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51262.activity.Vip51262AActivity$initListener$2
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
                BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding4;
                String str;
                Intrinsics.checkNotNullParameter(it, "it");
                buiMemo512621PurchaseLayoutBinding4 = Vip51262AActivity.this.binding;
                if (buiMemo512621PurchaseLayoutBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    buiMemo512621PurchaseLayoutBinding4 = null;
                }
                buiMemo512621PurchaseLayoutBinding4.setSelectedIndex(1);
                Vip51262AActivity.this.currentSku = "sub_week_3dt";
                str = Vip51262AActivity.this.currentSku;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        }, 1, (Object) null);
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding4 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding4 = null;
        }
        FrameLayout frameLayout = buiMemo512621PurchaseLayoutBinding4.continueFl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.continueFl");
        ViewExtensionsKt.setSingleClickListener$default(frameLayout, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51262.activity.Vip51262AActivity$initListener$3
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
                str = Vip51262AActivity.this.currentSku;
                new GuidePurchaseRequest(str, null, 2, null).post();
            }
        }, 1, (Object) null);
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding5 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding5 = null;
        }
        buiMemo512621PurchaseLayoutBinding5.tvRestore.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51262.activity.Vip51262AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51262AActivity.initListener$lambda$1(view);
            }
        });
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding6 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512621PurchaseLayoutBinding2 = buiMemo512621PurchaseLayoutBinding6;
        }
        buiMemo512621PurchaseLayoutBinding2.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo51262.activity.Vip51262AActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip51262AActivity.initListener$lambda$2(Vip51262AActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$1(View view) {
        new GuideRestoreRequest(false, null, 3, null).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(Vip51262AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackClose();
        this$0.postUiCloseRequest();
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result;
        Float floatOrNull;
        Float floatOrNull2;
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding = null;
        String result2 = new BillingUIGetCurrencyCodeRequest(yearlySku, null, 2, null).toResult();
        if (result2 == null || (result = new BillingUIGetPriceBySkuRequest(yearlySku, null, 2, null).toResult()) == null || (floatOrNull = StringsKt.toFloatOrNull(result)) == null) {
            return;
        }
        float floatValue = floatOrNull.floatValue();
        String result3 = new BillingUIGetPriceBySkuRequest(weeklySku, null, 2, null).toResult();
        if (result3 == null || (floatOrNull2 = StringsKt.toFloatOrNull(result3)) == null) {
            return;
        }
        float floatValue2 = floatOrNull2.floatValue();
        float f = 52;
        float f2 = floatValue / f;
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding2 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding2 = null;
        }
        AppCompatTextView appCompatTextView = buiMemo512621PurchaseLayoutBinding2.tvYearlyCost;
        Resources resources = getResources();
        int i = R.string.bui_memo51262_just_yearly_cost;
        StringBuilder append = new StringBuilder().append(result2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        appCompatTextView.setText(resources.getString(i, append.append(format).toString()));
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding3 = null;
        }
        AppCompatTextView appCompatTextView2 = buiMemo512621PurchaseLayoutBinding3.tvPricePerWeek1;
        Resources resources2 = getResources();
        int i2 = R.string.bui_memo51262_weekly_cost;
        StringBuilder append2 = new StringBuilder().append(result2);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        appCompatTextView2.setText(resources2.getString(i2, append2.append(format2).toString()));
        int roundToInt = MathKt.roundToInt((1 - (floatValue / (f * floatValue2))) * 100);
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding4 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding4 = null;
        }
        buiMemo512621PurchaseLayoutBinding4.setPercentage(new StringBuilder().append(roundToInt).append('%').toString());
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding5 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512621PurchaseLayoutBinding5 = null;
        }
        buiMemo512621PurchaseLayoutBinding5.tvSavePercentage.setText(getResources().getString(R.string.bui_memo51262_save_percentage, new StringBuilder().append(roundToInt).append('%').toString()));
        BuiMemo512621PurchaseLayoutBinding buiMemo512621PurchaseLayoutBinding6 = this.binding;
        if (buiMemo512621PurchaseLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512621PurchaseLayoutBinding = buiMemo512621PurchaseLayoutBinding6;
        }
        AppCompatTextView appCompatTextView3 = buiMemo512621PurchaseLayoutBinding.tvPricePerWeek2;
        Resources resources3 = getResources();
        int i3 = R.string.bui_memo51262_price_then_week;
        StringBuilder append3 = new StringBuilder().append(result2);
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
        appCompatTextView3.setText(resources3.getString(i3, append3.append(format3).toString()));
    }
}
