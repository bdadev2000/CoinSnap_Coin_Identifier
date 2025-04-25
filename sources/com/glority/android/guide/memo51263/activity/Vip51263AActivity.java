package com.glority.android.guide.memo51263.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewGroupKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo51263.R;
import com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Vip51263AActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0016\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/glority/android/guide/memo51263/activity/Vip51263AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "binding", "Lcom/glority/android/guide/memo51263/databinding/BuiMemo512631PurchaseLayoutBinding;", "currentSku", "", "changePrice", "", "getBundle1", "Landroid/os/Bundle;", "initListener", "initMainBodyAnimation", "views", "", "Landroid/view/View;", "notifyOpened", "", "onCreate", "savedInstanceState", "showBackPressedCloseRetain", "Companion", "guide-ui_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class Vip51263AActivity extends BasePurchaseActivity {
    private static final String weeklySku = "sub_week_3dt";
    private static final String yearlySku = "sub_yearly";
    private BuiMemo512631PurchaseLayoutBinding binding;
    private String currentSku = weeklySku;

    @Override // com.glority.android.guide.base.BasePurchaseActivity
    protected boolean showBackPressedCloseRetain() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BuiMemo512631PurchaseLayoutBinding inflate = BuiMemo512631PurchaseLayoutBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding2 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding2 = null;
        }
        buiMemo512631PurchaseLayoutBinding2.setTrialDays(3);
        initListener();
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512631PurchaseLayoutBinding = buiMemo512631PurchaseLayoutBinding3;
        }
        LinearLayout linearLayout = buiMemo512631PurchaseLayoutBinding.llRootContainer;
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
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Vip51263AActivity$initMainBodyAnimation$1(views, null), 3, null);
    }

    private final void initListener() {
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding = this.binding;
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding2 = null;
        if (buiMemo512631PurchaseLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding = null;
        }
        ConstraintLayout constraintLayout = buiMemo512631PurchaseLayoutBinding.clYearlyItem;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clYearlyItem");
        ViewExtensionsKt.setSingleClickListener$default(constraintLayout, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$initListener$1
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
                BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding3;
                Intrinsics.checkNotNullParameter(it, "it");
                buiMemo512631PurchaseLayoutBinding3 = Vip51263AActivity.this.binding;
                if (buiMemo512631PurchaseLayoutBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    buiMemo512631PurchaseLayoutBinding3 = null;
                }
                buiMemo512631PurchaseLayoutBinding3.setSelectedIndex(1);
                Vip51263AActivity.this.currentSku = "sub_yearly";
            }
        }, 1, (Object) null);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding3 = null;
        }
        ConstraintLayout constraintLayout2 = buiMemo512631PurchaseLayoutBinding3.clWeeklyItem;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clWeeklyItem");
        ViewExtensionsKt.setSingleClickListener$default(constraintLayout2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$initListener$2
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
                BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding4;
                Intrinsics.checkNotNullParameter(it, "it");
                buiMemo512631PurchaseLayoutBinding4 = Vip51263AActivity.this.binding;
                if (buiMemo512631PurchaseLayoutBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    buiMemo512631PurchaseLayoutBinding4 = null;
                }
                buiMemo512631PurchaseLayoutBinding4.setSelectedIndex(0);
                Vip51263AActivity.this.currentSku = "sub_week_3dt";
            }
        }, 1, (Object) null);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding4 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding4 = null;
        }
        FrameLayout frameLayout = buiMemo512631PurchaseLayoutBinding4.continueFl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.continueFl");
        ViewExtensionsKt.setSingleClickListener$default(frameLayout, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$initListener$3
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
                boolean notifyOpened;
                Intrinsics.checkNotNullParameter(it, "it");
                str = Vip51263AActivity.this.currentSku;
                notifyOpened = Vip51263AActivity.this.notifyOpened();
                new GuidePurchaseRequest(str, null, Boolean.valueOf(notifyOpened), null, 0, 26, null).post();
            }
        }, 1, (Object) null);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding5 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding5 = null;
        }
        AppCompatTextView appCompatTextView = buiMemo512631PurchaseLayoutBinding5.tvRestore;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvRestore");
        ViewExtensionsKt.setSingleClickListener$default(appCompatTextView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$initListener$4
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
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding6 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding6 = null;
        }
        ImageView imageView = buiMemo512631PurchaseLayoutBinding6.ivClose;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
        ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$initListener$5
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
                Vip51263AActivity.this.trackClose();
                Vip51263AActivity.this.postUiCloseRequest();
            }
        }, 1, (Object) null);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding7 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512631PurchaseLayoutBinding2 = buiMemo512631PurchaseLayoutBinding7;
        }
        buiMemo512631PurchaseLayoutBinding2.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.glority.android.guide.memo51263.activity.Vip51263AActivity$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Vip51263AActivity.initListener$lambda$2(Vip51263AActivity.this, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(Vip51263AActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle1 = this$0.getBundle1();
        if (z) {
            try {
                bundle1.putString("status", NotificationManagerCompat.from(compoundButton.getContext()).areNotificationsEnabled() ? ExifInterface.GPS_MEASUREMENT_2D : "1");
            } catch (Throwable unused) {
                bundle1.putString("status", "error");
            }
        } else {
            bundle1.putString("status", "close");
        }
        new VipEventRequest("vip_reminder_click", bundle1).post();
    }

    private final Bundle getBundle1() {
        String countryCode = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(countryCode, "countryCode");
        if (countryCode.length() == 0) {
            countryCode = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", getPageFrom()), TuplesKt.to("name", Integer.valueOf(getPageType())), TuplesKt.to("group", getGroup()), TuplesKt.to(LogEventArguments.ARG_STRING_1, getAbtestId()), TuplesKt.to("code", countryCode), TuplesKt.to(LogEventArguments.ARG_STEP, getOpenTimes()));
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result;
        Float floatOrNull;
        Float floatOrNull2;
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding = null;
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
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding2 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding2 = null;
        }
        buiMemo512631PurchaseLayoutBinding2.tvYearlyPrice.setText(result2 + result);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding3 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding3 = null;
        }
        buiMemo512631PurchaseLayoutBinding3.setYearlyPrice(result2 + result);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding4 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding4 = null;
        }
        StringBuilder append = new StringBuilder().append(result2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        buiMemo512631PurchaseLayoutBinding4.setPricePerWeek(append.append(format).toString());
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding5 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding5 = null;
        }
        buiMemo512631PurchaseLayoutBinding5.setWeeklyPrice(result2 + result3);
        int roundToInt = MathKt.roundToInt((1 - (floatValue / (floatValue2 * f))) * 100);
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding6 = this.binding;
        if (buiMemo512631PurchaseLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            buiMemo512631PurchaseLayoutBinding = buiMemo512631PurchaseLayoutBinding6;
        }
        buiMemo512631PurchaseLayoutBinding.setPercentage(new StringBuilder().append(roundToInt).append('%').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean notifyOpened() {
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding = this.binding;
        BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding2 = null;
        if (buiMemo512631PurchaseLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            buiMemo512631PurchaseLayoutBinding = null;
        }
        if (buiMemo512631PurchaseLayoutBinding.reminderLayout.getVisibility() == 0) {
            BuiMemo512631PurchaseLayoutBinding buiMemo512631PurchaseLayoutBinding3 = this.binding;
            if (buiMemo512631PurchaseLayoutBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                buiMemo512631PurchaseLayoutBinding2 = buiMemo512631PurchaseLayoutBinding3;
            }
            if (buiMemo512631PurchaseLayoutBinding2.switch1.isChecked()) {
                return true;
            }
        }
        return false;
    }
}
