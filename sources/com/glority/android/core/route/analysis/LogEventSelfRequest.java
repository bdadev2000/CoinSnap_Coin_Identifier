package com.glority.android.core.route.analysis;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventSelfRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/core/route/analysis/LogEventSelfRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventType", "", "eventId", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "getEventId", "()Ljava/lang/String;", "setEventId", "(Ljava/lang/String;)V", "getEventType", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LogEventSelfRequest extends RouteRequest<Boolean> {
    private final Bundle bundle;
    private String eventId;
    private final String eventType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogEventSelfRequest(String eventType, String eventId, Bundle bundle) {
        super(UrlTracking.INSTANCE.getURL_LOG_EVENT_SELF(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventType = eventType;
        this.eventId = eventId;
        this.bundle = bundle;
    }

    public /* synthetic */ LogEventSelfRequest(String str, String str2, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }
}
