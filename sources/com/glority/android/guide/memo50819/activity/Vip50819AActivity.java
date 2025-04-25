package com.glority.android.guide.memo50819.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.core.app.AppContext;
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
import com.glority.android.guide.memo50819.R;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.uitls.TextSizeUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Vip50819AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0016\u0010\u0013\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u001c\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/glority/android/guide/memo50819/activity/Vip50819AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "currentSku", "", "monthlySKU", "weeklySKU", "yearlySKU", "changePrice", "", "changeSKU", LogEventArguments.ARG_SKU, "getBundle1", "Landroid/os/Bundle;", "initMainBodyAnimation", "views", "", "Landroid/view/View;", "initReminder", "initSplashAnimation", "onEnd", "Lkotlin/Function0;", "onCreate", "savedInstanceState", "setPurchaseView", "showBackPressedCloseRetain", "", "textBold", "Landroid/text/SpannableStringBuilder;", "text", "price", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class Vip50819AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = "sub_month";
    private String weeklySKU = "sub_week";
    private String currentSku = "sub_yearly_7dt";

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
        setContentView(R.layout.bui_50819_purchase_layout);
        final List<View> listOf = CollectionsKt.listOf((Object[]) new View[]{findViewById(R.id.logo_iv), findViewById(R.id.line1), findViewById(R.id.line2), findViewById(R.id.line3), findViewById(R.id.line4), findViewById(R.id.purchase_container), findViewById(R.id.reminder_layout), findViewById(R.id.continue_fl), findViewById(R.id.policy_tv)});
        View findViewById = findViewById(R.id.iv_anima);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<LottieAnimationView>(R.id.iv_anima)");
        ((LottieAnimationView) findViewById).setImageAssetsFolder("images");
        setPurchaseView();
        TextView policyView = (TextView) findViewById(R.id.policy_tv);
        View findViewById2 = findViewById(R.id.sv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<ScrollView>(R.id.sv)");
        Intrinsics.checkNotNullExpressionValue(policyView, "policyView");
        new BillingUIScrollToDataPolicyRequest((ScrollView) findViewById2, policyView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyView).post();
        View findViewById3 = findViewById(R.id.tv_restore);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<View>(R.id.tv_restore)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$onCreate$1
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
        View findViewById4 = findViewById(R.id.iv_close);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<View>(R.id.iv_close)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById4, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$onCreate$2
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
                Vip50819AActivity.this.trackClose();
                Vip50819AActivity.this.postUiCloseRequest();
            }
        }, 1, (Object) null);
        initReminder();
        for (View it : listOf) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            it.setAlpha(0.0f);
        }
        initSplashAnimation(new Function0<Unit>() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$onCreate$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Vip50819AActivity.this.initMainBodyAnimation(listOf);
            }
        });
        TextSizeUtils.INSTANCE.autoSizeAndUnify(CollectionsKt.listOf((Object[]) new TextView[]{(TextView) findViewById(R.id.tv_weekly), (TextView) findViewById(R.id.tv_monthly)}), 1, 6.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMainBodyAnimation(List<? extends View> views) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Vip50819AActivity$initMainBodyAnimation$1(views, null), 3, null);
    }

    private final void initSplashAnimation(Function0<Unit> onEnd) {
        TextView tv = (TextView) findViewById(R.id.start_anima_tv);
        View findViewById = findViewById(R.id.start_anima_fl);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.coversionpage_loading_start7dayfreetrial));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FAAF19"));
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        String string = getString(R.string.coversionpage_loading_free);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.coversionpage_loading_free)");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, string, 0, true, 2, (Object) null);
        try {
            spannableStringBuilder.setSpan(foregroundColorSpan, indexOf$default, getString(R.string.coversionpage_loading_free).length() + indexOf$default, 17);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        Intrinsics.checkNotNullExpressionValue(tv, "tv");
        tv.setText(spannableStringBuilder2);
        ScaleAnimation scaleAnimation = new ScaleAnimation(2.2f, 1.0f, 2.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setInterpolator(new FastOutSlowInInterpolator());
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new Vip50819AActivity$initSplashAnimation$2(findViewById, onEnd));
        tv.startAnimation(scaleAnimation);
    }

    private final void initReminder() {
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.switch1);
        final TextView textView = (TextView) findViewById(R.id.tv_reminder_guide);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$initReminder$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z) {
                Bundle bundle1;
                if (z) {
                    textView.setText(R.string.ptandroidzy1_enabledtext_text);
                } else {
                    textView.setText(R.string.text_reminder_guide);
                }
                bundle1 = Vip50819AActivity.this.getBundle1();
                if (!z) {
                    bundle1.putString("status", "close");
                } else {
                    try {
                        Intrinsics.checkNotNullExpressionValue(buttonView, "buttonView");
                        bundle1.putString("status", NotificationManagerCompat.from(buttonView.getContext()).areNotificationsEnabled() ? ExifInterface.GPS_MEASUREMENT_2D : "1");
                    } catch (Throwable unused) {
                        bundle1.putString("status", "error");
                    }
                }
                Unit unit = Unit.INSTANCE;
                new VipEventRequest("vip_reminder_click", bundle1).post();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle getBundle1() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        String countryCode = locale.getCountry();
        Intrinsics.checkNotNullExpressionValue(countryCode, "countryCode");
        if (countryCode.length() == 0) {
            countryCode = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("from", getPageFrom()), TuplesKt.to("name", Integer.valueOf(getPageType())), TuplesKt.to("group", getGroup()), TuplesKt.to(LogEventArguments.ARG_STRING_1, getAbtestId()), TuplesKt.to("code", countryCode), TuplesKt.to(LogEventArguments.ARG_STEP, getOpenTimes()));
    }

    private final void setPurchaseView() {
        View findViewById = findViewById(R.id.ll_weekly_bg);
        View findViewById2 = findViewById(R.id.ll_7_day_free_bg);
        View findViewById3 = findViewById(R.id.ll_monthly_bg);
        View continueFl = findViewById(R.id.continue_fl);
        Intrinsics.checkNotNullExpressionValue(continueFl, "continueFl");
        ViewExtensionsKt.setSingleClickListener$default(continueFl, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$setPurchaseView$1
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
                boolean z;
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(it, "it");
                View findViewById4 = Vip50819AActivity.this.findViewById(R.id.switch1);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<SwitchCompat>(R.id.switch1)");
                if (((SwitchCompat) findViewById4).isChecked()) {
                    str2 = Vip50819AActivity.this.currentSku;
                    str3 = Vip50819AActivity.this.yearlySKU;
                    if (Intrinsics.areEqual(str2, str3)) {
                        z = true;
                        str = Vip50819AActivity.this.currentSku;
                        new GuidePurchaseRequest(str, null, Boolean.valueOf(z), null, 0, 26, null).post();
                    }
                }
                z = false;
                str = Vip50819AActivity.this.currentSku;
                new GuidePurchaseRequest(str, null, Boolean.valueOf(z), null, 0, 26, null).post();
            }
        }, 1, (Object) null);
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$setPurchaseView$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                Vip50819AActivity vip50819AActivity = Vip50819AActivity.this;
                str = vip50819AActivity.yearlySKU;
                vip50819AActivity.changeSKU(str);
                View findViewById4 = Vip50819AActivity.this.findViewById(R.id.switch1);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<SwitchCompat>(R.id.switch1)");
                boolean isChecked = ((SwitchCompat) findViewById4).isChecked();
                str2 = Vip50819AActivity.this.yearlySKU;
                new GuidePurchaseRequest(str2, null, Boolean.valueOf(isChecked), null, 0, 26, null).post();
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$setPurchaseView$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                Vip50819AActivity vip50819AActivity = Vip50819AActivity.this;
                str = vip50819AActivity.weeklySKU;
                vip50819AActivity.changeSKU(str);
                str2 = Vip50819AActivity.this.weeklySKU;
                new GuidePurchaseRequest(str2, null, 2, null).post();
            }
        });
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo50819.activity.Vip50819AActivity$setPurchaseView$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                Vip50819AActivity vip50819AActivity = Vip50819AActivity.this;
                str = vip50819AActivity.monthlySKU;
                vip50819AActivity.changeSKU(str);
                str2 = Vip50819AActivity.this.monthlySKU;
                new GuidePurchaseRequest(str2, null, 2, null).post();
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
            if (result3 == null) {
                result3 = "";
            }
            String result4 = new BillingUIGetPriceBySkuRequest(this.weeklySKU, null, 2, null).toResult();
            String str = result4 != null ? result4 : "";
            View findViewById = findViewById(R.id.tv_weekly_price);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<TextView>(R.id.tv_weekly_price)");
            ((TextView) findViewById).setText(textBold(result + ' ' + str, str));
            View findViewById2 = findViewById(R.id.tv_then_year_price);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.tv_then_year_price)");
            ((TextView) findViewById2).setText(textBold(getString(R.string.base_widget_text_then_s_year, new Object[]{String.valueOf(result + result2)}), result2));
            View findViewById3 = findViewById(R.id.tv_monthly_price);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<TextView>(R.id.tv_monthly_price)");
            ((TextView) findViewById3).setText(textBold(result + ' ' + result3, result3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeSKU(String sku) {
        this.currentSku = sku;
        View findViewById = findViewById(R.id.ll_weekly_bg);
        View findViewById2 = findViewById(R.id.ll_7_day_free_bg);
        View findViewById3 = findViewById(R.id.ll_monthly_bg);
        View findViewById4 = findViewById(R.id.reminder_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<View>(R.id.reminder_layout)");
        findViewById4.setVisibility(Intrinsics.areEqual(sku, this.yearlySKU) ^ true ? 4 : 0);
        TextView textView = (TextView) findViewById(R.id.continue_tv);
        if (Intrinsics.areEqual(sku, this.yearlySKU)) {
            textView.setText(R.string.personal_center_text_try_for_free);
            findViewById2.setBackgroundResource(R.drawable.md5_eb03c351b7994dc36d5b895be3b62813);
            findViewById.setBackgroundResource(R.drawable.md5_ae3ed55d37ef3f1ffdb3264a58b96abf);
            findViewById3.setBackgroundResource(R.drawable.md5_ae3ed55d37ef3f1ffdb3264a58b96abf);
            return;
        }
        if (Intrinsics.areEqual(sku, this.monthlySKU)) {
            textView.setText(R.string.vip_button_continue);
            findViewById2.setBackgroundResource(R.drawable.md5_c54ae63973906ac8dda793f368de1410);
            findViewById.setBackgroundResource(R.drawable.md5_ae3ed55d37ef3f1ffdb3264a58b96abf);
            findViewById3.setBackgroundResource(R.drawable.md5_851039bb722a4c05961dd0107148aec8);
            return;
        }
        if (Intrinsics.areEqual(sku, this.weeklySKU)) {
            textView.setText(R.string.vip_button_continue);
            findViewById2.setBackgroundResource(R.drawable.md5_c54ae63973906ac8dda793f368de1410);
            findViewById.setBackgroundResource(R.drawable.md5_851039bb722a4c05961dd0107148aec8);
            findViewById3.setBackgroundResource(R.drawable.md5_ae3ed55d37ef3f1ffdb3264a58b96abf);
        }
    }

    private final SpannableStringBuilder textBold(String text, String price) {
        String str;
        String str2 = text;
        if (str2 == null || str2.length() == 0 || (str = price) == null || str.length() == 0 || !StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, price, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, price.length() + indexOf$default, 33);
        return spannableStringBuilder;
    }
}
