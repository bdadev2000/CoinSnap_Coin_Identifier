package com.glority.android.core.route.agreement;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OpenSubscriptionTermsPageRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/agreement/OpenSubscriptionTermsPageRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "urlPath", "", "(Ljava/lang/String;)V", "getUrlPath", "()Ljava/lang/String;", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenSubscriptionTermsPageRequest extends RouteRequest<Object> {
    private final String urlPath;

    public OpenSubscriptionTermsPageRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OpenSubscriptionTermsPageRequest(String str) {
        super(UrlAgreement.INSTANCE.getURL_OPEN_SUBSCRIPTION_TERMS_PAGE(), null, null, 6, null);
        this.urlPath = str;
    }

    public /* synthetic */ OpenSubscriptionTermsPageRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getUrlPath() {
        return this.urlPath;
    }
}
