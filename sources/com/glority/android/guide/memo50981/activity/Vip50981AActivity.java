package com.glority.android.guide.memo50981.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
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
import com.glority.android.core.route.guide.BillingUIGetIntroductoryPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.BillingUIScrollToDataPolicyRequest;
import com.glority.android.core.route.guide.BillingUISetPolicyClickRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.core.route.vipEvent.VipEventRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.guide.memo50981.R;
import com.glority.android.picturexx.skumanager.SkuConfig;
import com.glority.utils.stability.LogUtils;
import java.util.Arrays;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: Vip50981AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u0016\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/android/guide/memo50981/activity/Vip50981AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "()V", "currentSku", "", "monthlySKU", "yearlySKU", "changePrice", "", "changeSKU", LogEventArguments.ARG_SKU, "getBundle1", "Landroid/os/Bundle;", "initMainBodyAnimation", "views", "", "Landroid/view/View;", "initReminder", "initSplashAnimation", "onEnd", "Lkotlin/Function0;", "notifyOpened", "", "onCreate", "savedInstanceState", "showBackPressedCloseRetain", "guide-ui_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class Vip50981AActivity extends BasePurchaseActivity {
    private HashMap _$_findViewCache;
    private String yearlySKU = "sub_yearly_7dt";
    private String monthlySKU = SkuConfig.SUB_YEARLY_1MT;
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
        setContentView(R.layout.bui_509811_purchase_layout);
        final List<View> listOf = CollectionsKt.listOf((Object[]) new View[]{findViewById(R.id.title), findViewById(R.id.line1), findViewById(R.id.line2), findViewById(R.id.line3), findViewById(R.id.line4), findViewById(R.id.purchase_container), findViewById(R.id.reminder_layout), findViewById(R.id.continue_fl), findViewById(R.id.price_container), findViewById(R.id.policy_tv)});
        View findViewById = findViewById(R.id.iv_anima);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<LottieAnimationView>(R.id.iv_anima)");
        ((LottieAnimationView) findViewById).setImageAssetsFolder("images");
        TextView policyView = (TextView) findViewById(R.id.policy_tv);
        View findViewById2 = findViewById(R.id.sv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<ScrollView>(R.id.sv)");
        Intrinsics.checkNotNullExpressionValue(policyView, "policyView");
        new BillingUIScrollToDataPolicyRequest((ScrollView) findViewById2, policyView, null, 4, null).post();
        new BillingUISetPolicyClickRequest(this, policyView).post();
        View findViewById3 = findViewById(R.id.tv_restore);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<View>(R.id.tv_restore)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById3, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$1
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
        ViewExtensionsKt.setSingleClickListener$default(findViewById4, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$2
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
                Vip50981AActivity.this.trackClose();
                Vip50981AActivity.this.postUiCloseRequest();
            }
        }, 1, (Object) null);
        View findViewById5 = findViewById(R.id.free_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById<View>(R.id.free_container)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById5, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$3
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
                Vip50981AActivity vip50981AActivity = Vip50981AActivity.this;
                str = vip50981AActivity.yearlySKU;
                vip50981AActivity.changeSKU(str);
            }
        }, 1, (Object) null);
        View findViewById6 = findViewById(R.id.month_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById<View>(R.id.month_container)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById6, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$4
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
                Vip50981AActivity vip50981AActivity = Vip50981AActivity.this;
                str = vip50981AActivity.monthlySKU;
                vip50981AActivity.changeSKU(str);
            }
        }, 1, (Object) null);
        View findViewById7 = findViewById(R.id.continue_fl);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById<View>(R.id.continue_fl)");
        ViewExtensionsKt.setSingleClickListener$default(findViewById7, 0L, new Function1<View, Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$5
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
                str = Vip50981AActivity.this.currentSku;
                notifyOpened = Vip50981AActivity.this.notifyOpened();
                new GuidePurchaseRequest(str, null, Boolean.valueOf(notifyOpened), null, 0, 26, null).post();
            }
        }, 1, (Object) null);
        initReminder();
        for (View it : listOf) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            it.setAlpha(0.0f);
        }
        initSplashAnimation(new Function0<Unit>() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$onCreate$7
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
                Vip50981AActivity.this.initMainBodyAnimation(listOf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initMainBodyAnimation(List<? extends View> views) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new Vip50981AActivity$initMainBodyAnimation$1(views, null), 3, null);
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
        scaleAnimation.setAnimationListener(new Vip50981AActivity$initSplashAnimation$2(findViewById, onEnd));
        tv.startAnimation(scaleAnimation);
    }

    private final void initReminder() {
        ((SwitchCompat) findViewById(R.id.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.glority.android.guide.memo50981.activity.Vip50981AActivity$initReminder$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z) {
                Bundle bundle1;
                bundle1 = Vip50981AActivity.this.getBundle1();
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
            String result4 = new BillingUIGetIntroductoryPriceBySkuRequest(this.monthlySKU, null, 2, null).toResult();
            String str = result4 != null ? result4 : "";
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            double d = 12;
            String format = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(result2) / d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(result3) / d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
            View findViewById = findViewById(R.id.price_text1);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<TextView>(R.id.price_text1)");
            ((TextView) findViewById).setText(getString(R.string.conversionpage_price_7dayfree, new Object[]{result + result2, result + format}));
            View findViewById2 = findViewById(R.id.price_text2);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.price_text2)");
            ((TextView) findViewById2).setText(getString(R.string.conversionpage_price_firstmonth, new Object[]{result + str, result + result3, result + format2}));
            View findViewById3 = findViewById(R.id.month_price_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<TextView>(R.id.month_price_tv)");
            ((TextView) findViewById3).setText(result + ' ' + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeSKU(String sku) {
        this.currentSku = sku;
        if (Intrinsics.areEqual(sku, this.yearlySKU)) {
            ((TextView) findViewById(R.id.text1)).setText(R.string.coin_new_enjoy);
            ((ImageView) findViewById(R.id.free_select_iv)).setImageResource(R.drawable.md5_bcd859cf504296b32d3ed5afc672f8dd);
            ((ImageView) findViewById(R.id.month_select_iv)).setImageResource(R.drawable.md5_41737b6be67802fe0fca853a9baf80d7);
            ((TextView) findViewById(R.id.tv_reminder_guide)).setText(R.string.text_reminder_guide);
            ((TextView) findViewById(R.id.continue_tv)).setText(R.string.personal_center_text_try_for_free);
            View findViewById = findViewById(R.id.price_text1);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<TextView>(R.id.price_text1)");
            ((TextView) findViewById).setVisibility(0);
            View findViewById2 = findViewById(R.id.price_text2);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.price_text2)");
            ((TextView) findViewById2).setVisibility(8);
            View findViewById3 = findViewById(R.id.reminder_layout);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<View>(R.id.reminder_layout)");
            findViewById3.setVisibility(0);
            return;
        }
        ((TextView) findViewById(R.id.text1)).setText(R.string.conversionpage_text_firstmonth);
        ((ImageView) findViewById(R.id.month_select_iv)).setImageResource(R.drawable.md5_bcd859cf504296b32d3ed5afc672f8dd);
        ((ImageView) findViewById(R.id.free_select_iv)).setImageResource(R.drawable.md5_41737b6be67802fe0fca853a9baf80d7);
        ((TextView) findViewById(R.id.tv_reminder_guide)).setText(R.string.conversionpage_reminder_monthtrialend);
        ((TextView) findViewById(R.id.continue_tv)).setText(R.string.text_continue);
        View findViewById4 = findViewById(R.id.price_text1);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<TextView>(R.id.price_text1)");
        ((TextView) findViewById4).setVisibility(8);
        View findViewById5 = findViewById(R.id.price_text2);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById<TextView>(R.id.price_text2)");
        ((TextView) findViewById5).setVisibility(0);
        View findViewById6 = findViewById(R.id.reminder_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById<View>(R.id.reminder_layout)");
        findViewById6.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean notifyOpened() {
        View findViewById = findViewById(R.id.reminder_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<View>(R.id.reminder_layout)");
        if (findViewById.getVisibility() == 0) {
            View findViewById2 = findViewById(R.id.switch1);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<SwitchCompat>(R.id.switch1)");
            if (((SwitchCompat) findViewById2).isChecked()) {
                return true;
            }
        }
        return false;
    }
}
