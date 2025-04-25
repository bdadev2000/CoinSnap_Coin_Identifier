package com.glority.android.core.route.debugtool;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DebugLogEventRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/core/route/debugtool/DebugLogEventRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventType", "", "bundle", "Landroid/os/Bundle;", "configBundle", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "getConfigBundle", "getEventType", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DebugLogEventRequest extends RouteRequest<Boolean> {
    private final Bundle bundle;
    private final Bundle configBundle;
    private final String eventType;

    public DebugLogEventRequest(String str, Bundle bundle, Bundle bundle2) {
        super(UrlDebugTool.INSTANCE.getURL_LOG_EVENT(), null, null, 6, null);
        this.eventType = str;
        this.bundle = bundle;
        this.configBundle = bundle2;
    }

    public /* synthetic */ DebugLogEventRequest(String str, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : bundle2);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final Bundle getConfigBundle() {
        return this.configBundle;
    }

    public final String getEventType() {
        return this.eventType;
    }
}
