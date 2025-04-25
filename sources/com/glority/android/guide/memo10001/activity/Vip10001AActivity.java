package com.glority.android.guide.memo10001.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.agreement.OpenPrivacyPolicyPageRequest;
import com.glority.android.core.route.agreement.OpenTermsOfUsePageRequest;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.guide.base.BasePurchaseActivity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityPurchase1Binding;
import com.glority.android.picturexx.payment.billingUI.BillingGuideUtils;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Vip10001AActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/glority/android/guide/memo10001/activity/Vip10001AActivity;", "Lcom/glority/android/guide/base/BasePurchaseActivity;", "<init>", "()V", "yearlySKU", "", "activityPurchase1Binding", "Lcom/glority/android/picturexx/business/databinding/ActivityPurchase1Binding;", "getActivityPurchase1Binding", "()Lcom/glority/android/picturexx/business/databinding/ActivityPurchase1Binding;", "setActivityPurchase1Binding", "(Lcom/glority/android/picturexx/business/databinding/ActivityPurchase1Binding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setPolicyView", "changePrice", "onBackPressed", "finish", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10001AActivity extends BasePurchaseActivity {
    public static final int $stable = 8;
    public ActivityPurchase1Binding activityPurchase1Binding;
    private String yearlySKU = "sub_yearly_7dt";

    @Override // com.glority.android.guide.base.BasePurchaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public final ActivityPurchase1Binding getActivityPurchase1Binding() {
        ActivityPurchase1Binding activityPurchase1Binding = this.activityPurchase1Binding;
        if (activityPurchase1Binding != null) {
            return activityPurchase1Binding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityPurchase1Binding");
        return null;
    }

    public final void setActivityPurchase1Binding(ActivityPurchase1Binding activityPurchase1Binding) {
        Intrinsics.checkNotNullParameter(activityPurchase1Binding, "<set-?>");
        this.activityPurchase1Binding = activityPurchase1Binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.guide.base.BasePurchaseActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        setActivityPurchase1Binding(ActivityPurchase1Binding.inflate(getLayoutInflater()));
        setContentView(getActivityPurchase1Binding().getRoot());
        getActivityPurchase1Binding().countTv.setText(getString(R.string.identifyresult_addtocollectionlimit_text_coinscollected, new Object[]{String.valueOf(CoinAbTestUtils.INSTANCE.getCollectionPayCount())}));
        getActivityPurchase1Binding().continueTv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip10001AActivity.onCreate$lambda$0(Vip10001AActivity.this, view);
            }
        });
        getActivityPurchase1Binding().giveUpTv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Vip10001AActivity.onCreate$lambda$2(Vip10001AActivity.this, view);
            }
        });
        ScrollView scrollView = getActivityPurchase1Binding().sv;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$onCreate$3$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ScrollView sv = Vip10001AActivity.this.getActivityPurchase1Binding().sv;
                Intrinsics.checkNotNullExpressionValue(sv, "sv");
                sv.setVisibility(0);
            }
        });
        scrollView.startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(Vip10001AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BillingGuideUtils.startPurchase$default(BillingGuideUtils.INSTANCE, this$0.yearlySKU, 0, false, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(final Vip10001AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackClose();
        ScrollView scrollView = this$0.getActivityPurchase1Binding().sv;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$onCreate$2$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Vip10001AActivity.this.finish();
            }
        });
        scrollView.startAnimation(scaleAnimation);
    }

    private final void setPolicyView() {
        String string = getString(R.string.bui_common_notice_terms_of_use);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.bui_common_notice_privacy_policy);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("Restore purchase " + getString(R.string.vip_bottom_tip_content_google, new Object[]{string, string2}));
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$setPolicyView$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                new GuideRestoreRequest(false, null, 3, null).post();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setUnderlineText(true);
            }
        }, 0, 16, 18);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, string, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$setPolicyView$termsClickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                new OpenTermsOfUsePageRequest(false, 1, null).post();
            }
        }, indexOf$default, string.length() + indexOf$default, 33);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, string2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$setPolicyView$privacyClickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                Intrinsics.checkNotNullParameter(widget, "widget");
                new OpenPrivacyPolicyPageRequest(false, 1, null).post();
            }
        }, indexOf$default2, string2.length() + indexOf$default2, 33);
        getActivityPurchase1Binding().policyTv.setText(spannableStringBuilder2);
        getActivityPurchase1Binding().policyTv.setClickable(true);
        getActivityPurchase1Binding().policyTv.setMovementMethod(LinkMovementMethod.getInstance());
        getActivityPurchase1Binding().policyTv.setMaxLines(Integer.MAX_VALUE);
    }

    @Override // com.glority.android.guide.iface.IBillingListener
    public void changePrice() {
        String result = new BillingUIGetCurrencyCodeRequest(this.yearlySKU, null, 2, null).toResult();
        if (result == null) {
            return;
        }
        String result2 = new BillingUIGetPriceBySkuRequest(this.yearlySKU, null, 2, null).toResult();
        if (result2 == null) {
            result2 = "";
        }
        float parseFloat = ((int) ((Float.parseFloat(result2) / 365) * 100)) / 100.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.text_price_2, new Object[]{result + result2}));
        try {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.25f), StringsKt.indexOf$default((CharSequence) spannableStringBuilder, result + result2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableStringBuilder, result + result2, 0, false, 6, (Object) null) + result.length() + result2.length(), 18);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        getActivityPurchase1Binding().yearTv.setText(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getString(R.string.text_less_than_day, new Object[]{result + parseFloat}));
        try {
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#30C29A")), StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, result + parseFloat, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, result + parseFloat, 0, false, 6, (Object) null) + (result + parseFloat).length(), 18);
            Unit unit2 = Unit.INSTANCE;
        } catch (Exception e2) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e2));
            }
        }
        getActivityPurchase1Binding().dayTv.setText(spannableStringBuilder2);
        getActivityPurchase1Binding().sv.post(new Runnable() { // from class: com.glority.android.guide.memo10001.activity.Vip10001AActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Vip10001AActivity.changePrice$lambda$7(Vip10001AActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changePrice$lambda$7(Vip10001AActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScrollView sv = this$0.getActivityPurchase1Binding().sv;
        Intrinsics.checkNotNullExpressionValue(sv, "sv");
        ScrollView scrollView = sv;
        ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this$0.getActivityPurchase1Binding().sv.getMeasuredHeight();
            scrollView.setLayoutParams(layoutParams);
            this$0.setPolicyView();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // android.app.Activity
    public void finish() {
        View root = getActivityPurchase1Binding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(8);
        super.finish();
    }
}
