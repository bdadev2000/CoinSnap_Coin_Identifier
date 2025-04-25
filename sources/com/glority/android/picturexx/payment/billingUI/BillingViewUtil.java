package com.glority.android.picturexx.payment.billingUI;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.core.route.agreement.OpenPrivacyPolicyPageRequest;
import com.glority.android.core.route.agreement.OpenTermsOfUsePageRequest;
import com.glority.android.picturexx.payment.R;
import com.glority.android.picturexx.payment.billingUI.BillingViewUtil;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: BillingViewUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/glority/android/picturexx/payment/billingUI/BillingViewUtil;", "", "<init>", "()V", "Companion", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class BillingViewUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final void scrollToDataPolicy(ScrollView scrollView, View view) {
        INSTANCE.scrollToDataPolicy(scrollView, view);
    }

    @JvmStatic
    public static final void setPolicyClick(FragmentActivity fragmentActivity, TextView textView) {
        INSTANCE.setPolicyClick(fragmentActivity, textView);
    }

    @JvmStatic
    public static final void setPolicyClick(FragmentActivity fragmentActivity, TextView textView, boolean z) {
        INSTANCE.setPolicyClick(fragmentActivity, textView, z);
    }

    @JvmStatic
    public static final void setPriceBold(Context context, TextView textView, String str, String str2) {
        INSTANCE.setPriceBold(context, textView, str, str2);
    }

    /* compiled from: BillingViewUtil.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¨\u0006\u0018"}, d2 = {"Lcom/glority/android/picturexx/payment/billingUI/BillingViewUtil$Companion;", "", "<init>", "()V", "scrollToDataPolicy", "", "sv_top", "Landroid/widget/ScrollView;", "tv_data_policy", "Landroid/view/View;", "setPolicyClick", "activity", "Landroidx/fragment/app/FragmentActivity;", "policyTv", "Landroid/widget/TextView;", "containTrial", "", "setPriceBold", "context", "Landroid/content/Context;", "tv_price", "currencyCode", "", "price", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void scrollToDataPolicy(final ScrollView sv_top, final View tv_data_policy) {
            Intrinsics.checkNotNullParameter(sv_top, "sv_top");
            Intrinsics.checkNotNullParameter(tv_data_policy, "tv_data_policy");
            sv_top.post(new Runnable() { // from class: com.glority.android.picturexx.payment.billingUI.BillingViewUtil$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BillingViewUtil.Companion.scrollToDataPolicy$lambda$0(tv_data_policy, sv_top);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void scrollToDataPolicy$lambda$0(View tv_data_policy, ScrollView sv_top) {
            Intrinsics.checkNotNullParameter(tv_data_policy, "$tv_data_policy");
            Intrinsics.checkNotNullParameter(sv_top, "$sv_top");
            int[] iArr = new int[2];
            for (int i = 0; i < 2; i++) {
                iArr[i] = 0;
            }
            tv_data_policy.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            for (int i2 = 0; i2 < 2; i2++) {
                iArr2[i2] = 0;
            }
            sv_top.getLocationOnScreen(iArr2);
            int measuredHeight = ((iArr[1] - sv_top.getMeasuredHeight()) - iArr2[1]) + ((int) ResUtils.getDimension(R.dimen.x40));
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            sv_top.smoothScrollTo(0, measuredHeight);
        }

        @JvmStatic
        public final void setPolicyClick(FragmentActivity activity, TextView policyTv) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(policyTv, "policyTv");
            setPolicyClick(activity, policyTv, true);
        }

        @JvmStatic
        public final void setPolicyClick(FragmentActivity activity, TextView policyTv, boolean containTrial) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(policyTv, "policyTv");
            String string = activity.getString(R.string.bui_common_notice_terms_of_use);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = activity.getString(R.string.bui_common_notice_privacy_policy);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = activity.getString(containTrial ? R.string.bui_common_notice_pay_with_trial : R.string.bui_common_notice_pay_direct, new Object[]{string, string2});
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String str = string3;
            SpannableString spannableString = new SpannableString(str);
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null);
            int length = string.length() + indexOf$default;
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), indexOf$default, length, 33);
            spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.picturexx.payment.billingUI.BillingViewUtil$Companion$setPolicyClick$termsClickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    new OpenTermsOfUsePageRequest(false, 1, null).post();
                }
            }, indexOf$default, length, 33);
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, string2, 0, false, 6, (Object) null);
            int length2 = string2.length() + indexOf$default2;
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#333333")), indexOf$default2, length2, 33);
            spannableString.setSpan(new ClickableSpan() { // from class: com.glority.android.picturexx.payment.billingUI.BillingViewUtil$Companion$setPolicyClick$privacyClickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    new OpenPrivacyPolicyPageRequest(false, 1, null).post();
                }
            }, indexOf$default2, length2, 33);
            policyTv.setText(spannableString);
            policyTv.setClickable(true);
            policyTv.setMovementMethod(LinkMovementMethod.getInstance());
        }

        @JvmStatic
        public final void setPriceBold(Context context, TextView tv_price, String currencyCode, String price) {
            String str;
            Intrinsics.checkNotNull(tv_price);
            String[] strArr = (String[]) new Regex("%s").split(tv_price.getText().toString(), 0).toArray(new String[0]);
            if (strArr.length == 0 || strArr.length == 1) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(price);
            if (price != null) {
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, price.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strArr[0] + currencyCode);
            tv_price.setMovementMethod(LinkMovementMethod.getInstance());
            if (strArr.length == 3) {
                str = strArr[1] + currencyCode + strArr[2];
            } else {
                str = strArr[1];
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(str);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder3);
            tv_price.setText(spannableStringBuilder2);
        }
    }
}
