package com.glority.android.core.route.adjust;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendTrackEventRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/route/adjust/SendTrackEventRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventName", "", "revenue", "", FirebaseAnalytics.Param.CURRENCY, "orderid", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getEventName", "setEventName", "getOrderid", "setOrderid", "getRevenue", "()Ljava/lang/Double;", "setRevenue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SendTrackEventRequest extends RouteRequest<Boolean> {
    private String currency;
    private String eventName;
    private String orderid;
    private Double revenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendTrackEventRequest(String eventName, Double d, String str, String str2) {
        super(UrlAdjust.INSTANCE.getURL_ADJUST_SEND_TRACK_EVENT(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.revenue = d;
        this.currency = str;
        this.orderid = str2;
    }

    public /* synthetic */ SendTrackEventRequest(String str, Double d, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getOrderid() {
        return this.orderid;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setEventName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setOrderid(String str) {
        this.orderid = str;
    }

    public final void setRevenue(Double d) {
        this.revenue = d;
    }
}
