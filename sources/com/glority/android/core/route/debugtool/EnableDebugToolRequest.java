package com.glority.android.core.route.debugtool;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: EnableDebugToolRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/core/route/debugtool/EnableDebugToolRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "enable", "(Z)V", "getEnable", "()Z", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class EnableDebugToolRequest extends RouteRequest<Boolean> {
    private final boolean enable;

    public EnableDebugToolRequest(boolean z) {
        super(UrlDebugTool.INSTANCE.getURL_ENABLE_DEBUG_TOOL(), null, null, 6, null);
        this.enable = z;
    }

    public final boolean getEnable() {
        return this.enable;
    }
}
