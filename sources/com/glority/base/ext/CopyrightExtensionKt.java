package com.glority.base.ext;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.glority.android.core.route.webview.WebViewOpenRequest;
import com.glority.base.R;
import com.glority.component.generatedAPI.kotlinAPI.cms.Copyright;
import com.glority.utils.app.ResUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CopyrightExtension.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"getCopyrightSSB", "Landroid/text/SpannableStringBuilder;", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/Copyright;", "activity", "Landroid/app/Activity;", "latin", "", "base_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class CopyrightExtensionKt {
    public static /* synthetic */ SpannableStringBuilder getCopyrightSSB$default(Copyright copyright, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getCopyrightSSB(copyright, activity, str);
    }

    public static final SpannableStringBuilder getCopyrightSSB(Copyright copyright, Activity activity, final String str) {
        Intrinsics.checkNotNullParameter(copyright, "<this>");
        if (activity == null) {
            return null;
        }
        final String detailUrl = copyright.getDetailUrl();
        final String author = copyright.getAuthor();
        final String authorlink = copyright.getAuthorlink();
        final String license = copyright.getLicense();
        final String certUrl = copyright.getCertUrl();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = detailUrl;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(author) && TextUtils.isEmpty(authorlink) && TextUtils.isEmpty(license)) {
            return null;
        }
        boolean z = (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) ? false : true;
        if (z) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.ext.CopyrightExtensionKt$getCopyrightSSB$clickableSpan$1
                private long lastClickTime;

                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    String str3;
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    if (System.currentTimeMillis() - this.lastClickTime > 600 && (str3 = detailUrl) != null) {
                        String str4 = str;
                        if (str4 == null) {
                            str4 = "";
                        }
                        new WebViewOpenRequest(str3, str4, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                    }
                }
            }, 0, str != null ? str.length() : 0, 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        boolean z2 = !TextUtils.isEmpty(str2);
        if (z2) {
            spannableStringBuilder.append((CharSequence) "Photo");
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.ext.CopyrightExtensionKt$getCopyrightSSB$clickableSpan$2
                private long lastClickTime;

                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    if (System.currentTimeMillis() - this.lastClickTime <= 600) {
                        return;
                    }
                    this.lastClickTime = System.currentTimeMillis();
                    String str3 = detailUrl;
                    if (str3 == null) {
                        return;
                    }
                    new WebViewOpenRequest(str3, str3, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                }
            }, 0, 5, 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        String str3 = author;
        boolean z3 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(authorlink)) ? false : true;
        if (z3) {
            spannableStringBuilder.append((CharSequence) ResUtils.getString(R.string.text_by));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (TextUtils.isEmpty(str3)) {
                author = ResUtils.getString(R.string.copy_right_text_author);
            }
            spannableStringBuilder.append((CharSequence) author);
            int length2 = spannableStringBuilder.length();
            if (!TextUtils.isEmpty(authorlink)) {
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.ext.CopyrightExtensionKt$getCopyrightSSB$clickableSpan$3
                    private long lastClickTime;

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View widget) {
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        if (System.currentTimeMillis() - this.lastClickTime <= 600) {
                            return;
                        }
                        this.lastClickTime = System.currentTimeMillis();
                        String str4 = authorlink;
                        if (str4 == null) {
                            return;
                        }
                        String str5 = author;
                        if (str5 == null) {
                            str5 = "";
                        }
                        new WebViewOpenRequest(str4, str5, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                    }
                }, length, length2, 33);
            }
        }
        String str4 = license;
        boolean z4 = !TextUtils.isEmpty(str4);
        if (z4 && str4 != null && str4.length() != 0) {
            if (z3) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) ResUtils.getString(R.string.copy_right_text_used_under, license));
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder2, license, 0, false, 6, (Object) null);
            if (indexOf$default >= 0) {
                int length3 = license.length() + indexOf$default;
                if (!TextUtils.isEmpty(certUrl)) {
                    spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.glority.base.ext.CopyrightExtensionKt$getCopyrightSSB$clickableSpan$4
                        private long lastClickTime;

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            if (System.currentTimeMillis() - this.lastClickTime <= 600) {
                                return;
                            }
                            this.lastClickTime = System.currentTimeMillis();
                            String str5 = certUrl;
                            if (str5 == null) {
                                return;
                            }
                            new WebViewOpenRequest(str5, license, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                        }
                    }, indexOf$default, length3, 33);
                }
            }
        }
        if (z || z3 || z4 || z2) {
            spannableStringBuilder.append((CharSequence) RemoteSettings.FORWARD_SLASH_STRING);
            spannableStringBuilder.append((CharSequence) ResUtils.getString(R.string.copy_right_text_crop_from_original));
        }
        return spannableStringBuilder;
    }
}
