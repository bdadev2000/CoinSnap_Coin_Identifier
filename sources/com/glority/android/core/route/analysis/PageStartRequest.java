package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;

/* compiled from: PageStartRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/analysis/PageStartRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", Args.pageName, "", "(Ljava/lang/String;)V", "getPageName", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PageStartRequest extends RouteRequest<Boolean> {
    private final String pageName;

    public PageStartRequest(String str) {
        super(UrlTracking.INSTANCE.getURL_PAGE_START(), null, null, 6, null);
        this.pageName = str;
    }

    public final String getPageName() {
        return this.pageName;
    }
}
