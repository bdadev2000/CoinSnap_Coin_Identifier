package com.glority.android.core.route.membership;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlMembership.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/glority/android/core/route/membership/UrlMembership;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_BILLING_PLATIUM", "getURL_BILLING_PLATIUM", "URL_CONTACT_US", "getURL_CONTACT_US", "URL_GET_VIP_INFO", "getURL_GET_VIP_INFO", "URL_IS_EIGHTH", "getURL_IS_EIGHTH", "URL_LESS_FIFTH", "getURL_LESS_FIFTH", "URL_MEMBERSHIP_FEEDBACK", "getURL_MEMBERSHIP_FEEDBACK", "URL_OPEN", "getURL_OPEN", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlMembership {
    public static final UrlMembership INSTANCE = new UrlMembership();
    private static final String MODULE;
    private static final String URL_BILLING_PLATIUM;
    private static final String URL_CONTACT_US;
    private static final String URL_GET_VIP_INFO;
    private static final String URL_IS_EIGHTH;
    private static final String URL_LESS_FIFTH;
    private static final String URL_MEMBERSHIP_FEEDBACK;
    private static final String URL_OPEN;

    private UrlMembership() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "com.glority.android.membership");
        MODULE = stringPlus;
        URL_OPEN = Intrinsics.stringPlus(stringPlus, "/open");
        URL_IS_EIGHTH = Intrinsics.stringPlus(stringPlus, "/is_eight");
        URL_LESS_FIFTH = Intrinsics.stringPlus(stringPlus, "/less_fifth");
        URL_MEMBERSHIP_FEEDBACK = Intrinsics.stringPlus(stringPlus, "/membership_feedback");
        URL_BILLING_PLATIUM = Intrinsics.stringPlus(stringPlus, "/billing_platium");
        URL_CONTACT_US = Intrinsics.stringPlus(stringPlus, "/contact_us");
        URL_GET_VIP_INFO = Intrinsics.stringPlus(stringPlus, "/get_vip_info");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_OPEN() {
        return URL_OPEN;
    }

    public final String getURL_IS_EIGHTH() {
        return URL_IS_EIGHTH;
    }

    public final String getURL_LESS_FIFTH() {
        return URL_LESS_FIFTH;
    }

    public final String getURL_MEMBERSHIP_FEEDBACK() {
        return URL_MEMBERSHIP_FEEDBACK;
    }

    public final String getURL_BILLING_PLATIUM() {
        return URL_BILLING_PLATIUM;
    }

    public final String getURL_CONTACT_US() {
        return URL_CONTACT_US;
    }

    public final String getURL_GET_VIP_INFO() {
        return URL_GET_VIP_INFO;
    }
}
