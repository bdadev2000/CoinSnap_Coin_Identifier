package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: DataCollectMessageRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/analysis/DataCollectMessageRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "appsFlyerId", "", "advertisingId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdvertisingId", "()Ljava/lang/String;", "setAdvertisingId", "(Ljava/lang/String;)V", "getAppsFlyerId", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DataCollectMessageRequest extends RouteRequest<Boolean> {
    private String advertisingId;
    private final String appsFlyerId;

    public DataCollectMessageRequest(String str, String str2) {
        super(UrlTracking.INSTANCE.getURL_DATA_COLLECT_MESSAGE(), null, null, 6, null);
        this.appsFlyerId = str;
        this.advertisingId = str2;
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final String getAppsFlyerId() {
        return this.appsFlyerId;
    }

    public final void setAdvertisingId(String str) {
        this.advertisingId = str;
    }
}
