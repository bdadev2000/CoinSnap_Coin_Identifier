package com.glority.android.core.route.detain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetainOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/glority/android/core/route/detain/DetainOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "paramString", LogEventArguments.ARG_SKU, "pageFrom", "pageType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageFrom", "()Ljava/lang/String;", "setPageFrom", "(Ljava/lang/String;)V", "getPageType", "setPageType", "getParamString", "setParamString", "getSku", "setSku", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DetainOpenRequest extends RouteRequest<String> {
    private String pageFrom;
    private String pageType;
    private String paramString;
    private String sku;

    public final String getParamString() {
        return this.paramString;
    }

    public final void setParamString(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.paramString = str;
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setSku(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sku = str;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageFrom = str;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final void setPageType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pageType = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetainOpenRequest(String paramString, String sku, String pageFrom, String pageType) {
        super(UrlDetain.INSTANCE.getURL_DETAIN_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(paramString, "paramString");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.paramString = paramString;
        this.sku = sku;
        this.pageFrom = pageFrom;
        this.pageType = pageType;
    }
}
