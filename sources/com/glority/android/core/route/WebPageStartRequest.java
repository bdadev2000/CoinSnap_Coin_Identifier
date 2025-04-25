package com.glority.android.core.route;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: WebPageStartRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/core/route/WebPageStartRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "webUrl", "", "(Ljava/lang/String;)V", "getWebUrl", "()Ljava/lang/String;", "setWebUrl", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebPageStartRequest extends RouteRequest<Boolean> {
    private String webUrl;

    public WebPageStartRequest(String str) {
        super("webPageStart", null, null, 6, null);
        this.webUrl = str;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
