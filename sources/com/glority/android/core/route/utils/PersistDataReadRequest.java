package com.glority.android.core.route.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: PersistDataReadRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/utils/PersistDataReadRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "key", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PersistDataReadRequest extends RouteRequest<String> {
    private String key;

    public PersistDataReadRequest(String str) {
        super(UrlUtils.INSTANCE.getURL_PERSIST_DATA_READ(), null, null, 6, null);
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        this.key = str;
    }
}
