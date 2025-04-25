package com.glority.android.guide.utils;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.guide.OpenPrivacyPolicyRequest;
import com.glority.android.core.route.guide.OpenServerTermsRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: PolicyUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/glority/android/guide/utils/PolicyUtil;", "", "()V", "setPolicy", "", "context", "Landroid/content/Context;", "tv_data_policy", "Landroid/widget/TextView;", "TextClick", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PolicyUtil {
    public static final PolicyUtil INSTANCE = new PolicyUtil();

    private PolicyUtil() {
    }

    public final void setPolicy(Context context, TextView tv_data_policy) {
        Intrinsics.checkNotNull(tv_data_policy);
        Object[] array = new Regex(" · ").split(tv_data_policy.getText().toString(), 0).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" · ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#979797")), 0, 3, 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, 12.0f)), 0, 3, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strArr[0]);
            tv_data_policy.setMovementMethod(LinkMovementMethod.getInstance());
            spannableStringBuilder2.setSpan(new TextClick(0), 0, strArr[0].length(), 33);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#979797")), 0, strArr[0].length(), 33);
            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, 12.0f)), 0, strArr[0].length(), 33);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strArr[1]);
            spannableStringBuilder3.setSpan(new TextClick(1), 0, strArr[1].length(), 33);
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#979797")), 0, strArr[1].length(), 33);
            spannableStringBuilder3.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, 12.0f)), 0, strArr[1].length(), 33);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) spannableStringBuilder3);
            tv_data_policy.setText(spannableStringBuilder2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* compiled from: PolicyUtil.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/android/guide/utils/PolicyUtil$TextClick;", "Landroid/text/style/ClickableSpan;", "postiton", "", "(I)V", "onClick", "", "view", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes3.dex */
    private static final class TextClick extends ClickableSpan {
        private final int postiton;

        public TextClick(int i) {
            this.postiton = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.postiton == 0) {
                new OpenServerTermsRequest(null, 1, null).post();
            } else {
                new OpenPrivacyPolicyRequest(null, 1, null).post();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            Intrinsics.checkNotNullParameter(ds, "ds");
            ds.setUnderlineText(false);
        }
    }
}
