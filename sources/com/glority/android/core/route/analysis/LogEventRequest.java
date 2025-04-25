package com.glority.android.core.route.analysis;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogEventRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/analysis/LogEventRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventType", "", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "getEventType", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LogEventRequest extends RouteRequest<Boolean> {
    private final Bundle bundle;
    private final String eventType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogEventRequest(String eventType, Bundle bundle) {
        super(UrlTracking.INSTANCE.getURL_LOG_EVENT(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.bundle = bundle;
    }

    public /* synthetic */ LogEventRequest(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getEventType() {
        return this.eventType;
    }
}
