package com.glority.android.core.route.abtest;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: AbtestGetLoginUiMemoRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/abtest/AbtestGetLoginUiMemoRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "pageType", "(I)V", "getPageType", "()I", "setPageType", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class AbtestGetLoginUiMemoRequest extends RouteRequest<Integer> {
    private int pageType;

    public AbtestGetLoginUiMemoRequest(int i) {
        super(UrlAbtest.INSTANCE.getURL_ABTEST_LOGIN_UI_MEMO(), null, null, 6, null);
        this.pageType = i;
    }

    public final int getPageType() {
        return this.pageType;
    }

    public final void setPageType(int i) {
        this.pageType = i;
    }
}
