package com.glority.widget.uitls;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.webview.WebViewOpenRequest;
import com.glority.widget.R;
import com.glority.widget.imagepager.GlImageCopyRight;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CopyrightUtil.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/glority/widget/uitls/CopyrightUtil;", "", "()V", "getCopyrightSsb", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "copyright", "Lcom/glority/widget/imagepager/GlImageCopyRight;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class CopyrightUtil {
    public static final CopyrightUtil INSTANCE = new CopyrightUtil();

    private CopyrightUtil() {
    }

    public final SpannableStringBuilder getCopyrightSsb(Context context, GlImageCopyRight copyright) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (copyright == null) {
            return spannableStringBuilder;
        }
        final String detailUrl = copyright.getDetailUrl();
        final String author = copyright.getAuthor();
        final String authorlink = copyright.getAuthorlink();
        final String license = copyright.getLicense();
        final String certUrl = copyright.getCertUrl();
        String str4 = detailUrl;
        if ((str4 != null && str4.length() != 0) || (((str = author) != null && str.length() != 0) || (((str2 = authorlink) != null && str2.length() != 0) || ((str3 = license) != null && str3.length() != 0)))) {
            boolean z = detailUrl != null && str4.length() > 0;
            if (z) {
                final String str5 = "Photo";
                spannableStringBuilder.append((CharSequence) "Photo");
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.widget.uitls.CopyrightUtil$getCopyrightSsb$clickableSpan$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View widget) {
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        String str6 = detailUrl;
                        if (str6 == null || str6.length() == 0) {
                            return;
                        }
                        new WebViewOpenRequest(detailUrl, str5, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                    }
                }, 0, 5, 33);
                spannableStringBuilder.append((CharSequence) " ");
            }
            boolean z2 = (author != null && author.length() > 0) || (authorlink != null && authorlink.length() > 0);
            if (z2) {
                spannableStringBuilder.append((CharSequence) (context.getString(R.string.base_widget_text_by) + ' '));
                int length = spannableStringBuilder.length();
                String str6 = author;
                if (str6 == null || str6.length() == 0) {
                    author = context.getString(R.string.base_widget_text_author);
                }
                Intrinsics.checkNotNullExpressionValue(author, "if (author.isNullOrEmpty…_text_author) else author");
                spannableStringBuilder.append((CharSequence) author);
                int length2 = spannableStringBuilder.length();
                if (authorlink != null && authorlink.length() > 0) {
                    spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.widget.uitls.CopyrightUtil$getCopyrightSsb$clickableSpan$2
                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            new LogEventRequest("cms_image_author_click", null, 2, null).post();
                            new WebViewOpenRequest(authorlink, author, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                        }
                    }, length, length2, 33);
                }
            }
            boolean z3 = license != null && license.length() > 0;
            if (z3) {
                if (z2) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) context.getString(R.string.base_widget_text_used_under, license));
                String spannableStringBuilder2 = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "ssb.toString()");
                Intrinsics.checkNotNull(license);
                int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, license, 0, false, 6, (Object) null);
                if (indexOf$default >= 0) {
                    int length3 = license.length() + indexOf$default;
                    if (certUrl != null && certUrl.length() > 0) {
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.widget.uitls.CopyrightUtil$getCopyrightSsb$clickableSpan$3
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View widget) {
                                Intrinsics.checkNotNullParameter(widget, "widget");
                                new LogEventRequest("cms_image_cert_click", null, 2, null).post();
                                new WebViewOpenRequest(certUrl, license, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                            }
                        }, indexOf$default, length3, 33);
                    }
                }
            }
            if (z || z2 || z3) {
                spannableStringBuilder.append((CharSequence) RemoteSettings.FORWARD_SLASH_STRING);
                spannableStringBuilder.append((CharSequence) context.getString(R.string.base_widget_text_crop_from_original));
            }
        }
        return spannableStringBuilder;
    }
}
