package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FirebaseSetUserPropertyRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/glority/android/core/route/analysis/FirebaseSetUserPropertyRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class FirebaseSetUserPropertyRequest extends RouteRequest<Boolean> {
    private final String key;
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSetUserPropertyRequest(String key, String str) {
        super(UrlTracking.INSTANCE.getURL_FIREBASE_SET_USER_PROPERTY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }
}
