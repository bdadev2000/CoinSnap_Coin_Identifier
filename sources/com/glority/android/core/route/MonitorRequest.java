package com.glority.android.core.route;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: MonitorRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/MonitorRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventType", "", "properties", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getEventType", "()Ljava/lang/String;", "getProperties", "()Lorg/json/JSONObject;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class MonitorRequest extends RouteRequest<Boolean> {
    private final String eventType;
    private final JSONObject properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitorRequest(String eventType, JSONObject properties) {
        super("monitor", null, null, 6, null);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.eventType = eventType;
        this.properties = properties;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final JSONObject getProperties() {
        return this.properties;
    }
}
