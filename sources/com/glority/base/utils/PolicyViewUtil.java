package com.glority.base.utils;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.glority.android.core.route.agreement.OpenPrivacyPolicyPageRequest;
import com.glority.android.core.route.agreement.OpenTermsOfUsePageRequest;
import com.glority.base.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.ui.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PolicyViewUtil.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/glority/base/utils/PolicyViewUtil;", "", "<init>", "()V", "setSSB", "Landroid/text/SpannableStringBuilder;", "template", "", "userPolicy", "privacyPolicy", "setPrivacyStyleShort", "", "textView", "Landroid/widget/TextView;", "setPrivacyStyleLong", "", "setPolicyPosition", "scrollView", "Landroid/widget/ScrollView;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class PolicyViewUtil {
    public static final int $stable = 0;
    public static final PolicyViewUtil INSTANCE = new PolicyViewUtil();

    private PolicyViewUtil() {
    }

    public final SpannableStringBuilder setSSB(String template, String userPolicy, String privacyPolicy) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(userPolicy, "userPolicy");
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        int color = ResUtils.getColor(R.color.Theme);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = template;
        spannableStringBuilder.append((CharSequence) str);
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, userPolicy, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            int length = userPolicy.length() + indexOf$default;
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.utils.PolicyViewUtil$setSSB$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    new OpenTermsOfUsePageRequest(false, 1, null).post();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    ds.setUnderlineText(false);
                }
            }, indexOf$default, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf$default, length, 33);
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, privacyPolicy, 0, false, 6, (Object) null);
        if (indexOf$default2 != -1) {
            int length2 = privacyPolicy.length() + indexOf$default2;
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.utils.PolicyViewUtil$setSSB$2
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    new OpenPrivacyPolicyPageRequest(false, 1, null).post();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    ds.setUnderlineText(false);
                }
            }, indexOf$default2, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf$default2, length2, 33);
        }
        return spannableStringBuilder;
    }

    public final void setPrivacyStyleShort(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        String string = ResUtils.getString(R.string.setting_text_terms_of_use);
        String string2 = ResUtils.getString(R.string.login_text_policy);
        String string3 = ResUtils.getString(R.string.login_text_private_policy_desc, ResUtils.getString(R.string.app_name), "\n" + string, string2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        textView.setText(setSSB(string3, string, string2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setPrivacyStyleLong(TextView textView, int template) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        String string = ResUtils.getString(R.string.setting_text_terms_of_use);
        String string2 = ResUtils.getString(R.string.login_text_policy);
        String string3 = ResUtils.getString(template, string, string2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        textView.setText(setSSB(string3, string, string2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setPolicyPosition(TextView textView, ScrollView scrollView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        textView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        for (int i2 = 0; i2 < 2; i2++) {
            iArr2[i2] = 0;
        }
        scrollView.getLocationOnScreen(iArr2);
        int measuredHeight = ((iArr[1] - scrollView.getMeasuredHeight()) - iArr2[1]) + ViewUtils.dp2px(20.0f);
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        scrollView.smoothScrollTo(0, measuredHeight);
    }
}
