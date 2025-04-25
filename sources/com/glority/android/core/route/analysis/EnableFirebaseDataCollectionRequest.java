package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: EnableFirebaseDataCollectionRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/core/route/analysis/EnableFirebaseDataCollectionRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "enable", "userId", "", "(ZLjava/lang/String;)V", "getEnable", "()Z", "getUserId", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class EnableFirebaseDataCollectionRequest extends RouteRequest<Boolean> {
    private final boolean enable;
    private final String userId;

    public EnableFirebaseDataCollectionRequest(boolean z, String str) {
        super(UrlTracking.INSTANCE.getURL_ENABLE_FIREBASE_DATA_COLLECTION(), null, null, 6, null);
        this.enable = z;
        this.userId = str;
    }

    public /* synthetic */ EnableFirebaseDataCollectionRequest(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getUserId() {
        return this.userId;
    }
}
