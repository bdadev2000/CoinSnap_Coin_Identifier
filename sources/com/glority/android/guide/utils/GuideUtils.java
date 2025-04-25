package com.glority.android.guide.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase$$ExternalSyntheticBackportWithForwarding0;
import com.glority.android.core.route.guide.IsJapaneseRequest;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GuideUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¨\u0006\u0013"}, d2 = {"Lcom/glority/android/guide/utils/GuideUtils;", "", "()V", "formatPrice", "", "priceAmountMicros", "", "getCurrencySymbol", "currencyCode", "prominentPrice", "", "context", "Landroid/content/Context;", "view", "Landroid/widget/TextView;", "str", "sizeDefault", "", "sizeProminent", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GuideUtils {
    public static final GuideUtils INSTANCE = new GuideUtils();

    private GuideUtils() {
    }

    public final String formatPrice(long priceAmountMicros) {
        double d = priceAmountMicros / 1000000.0d;
        if (new IsJapaneseRequest(null, 1, null).toResult().booleanValue()) {
            return APIModelBase$$ExternalSyntheticBackportWithForwarding0.m(BigDecimal.valueOf(d)).toPlainString();
        }
        return String.valueOf(d);
    }

    public final void prominentPrice(Context context, TextView view, String str, float sizeDefault, float sizeProminent) {
        String str2;
        char c;
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        String str3 = "$";
        SpannableStringBuilder spannableStringBuilder = null;
        List<String> split$default = str == null ? null : StringsKt.split$default((CharSequence) str, new String[]{"$"}, false, 0, 6, (Object) null);
        if (split$default != null) {
            int i2 = 0;
            int i3 = 0;
            for (String str4 : split$default) {
                int i4 = i3 + 1;
                if (i3 == 0) {
                    spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, sizeDefault)), i2, ((String) split$default.get(i3)).length(), 33);
                    i3 = i4;
                } else {
                    int i5 = i2;
                    for (String str5 : StringsKt.split$default((CharSequence) split$default.get(i3), new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null)) {
                        int i6 = i5 + 1;
                        if (i5 == 0) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(Intrinsics.stringPlus(str3, str5));
                            str2 = str3;
                            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, sizeProminent)), 0, str5.length() + 1, 33);
                            if (spannableStringBuilder != null) {
                                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                            }
                            c = '!';
                            i = 0;
                        } else {
                            str2 = str3;
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(Intrinsics.stringPlus(RemoteSettings.FORWARD_SLASH_STRING, str5));
                            AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(DensityUtil.dip2px(context, sizeDefault));
                            int length = str5.length() + 1;
                            c = '!';
                            i = 0;
                            spannableStringBuilder3.setSpan(absoluteSizeSpan, 0, length, 33);
                            if (spannableStringBuilder != null) {
                                spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                            }
                        }
                        i5 = i6;
                        i2 = i;
                        str3 = str2;
                    }
                    i3 = i4;
                    i2 = i2;
                }
            }
        }
        view.setText(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getCurrencySymbol(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L5c
            int r0 = r2.hashCode()
            switch(r0) {
                case 65168: goto L51;
                case 66470: goto L48;
                case 69026: goto L3b;
                case 70357: goto L2e;
                case 71585: goto L25;
                case 77816: goto L1c;
                case 82032: goto L13;
                case 84326: goto La;
                default: goto L9;
            }
        L9:
            goto L5c
        La:
            java.lang.String r0 = "USD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L13:
            java.lang.String r0 = "SGD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L1c:
            java.lang.String r0 = "NZD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L25:
            java.lang.String r0 = "HKD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L2e:
            java.lang.String r0 = "GBP"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L37
            goto L5c
        L37:
            java.lang.String r2 = "£"
            goto L5c
        L3b:
            java.lang.String r0 = "EUR"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L44
            goto L5c
        L44:
            java.lang.String r2 = "€"
            goto L5c
        L48:
            java.lang.String r0 = "CAD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L51:
            java.lang.String r0 = "AUD"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            java.lang.String r2 = "$"
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.guide.utils.GuideUtils.getCurrencySymbol(java.lang.String):java.lang.String");
    }
}
