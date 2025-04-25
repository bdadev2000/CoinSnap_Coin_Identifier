package com.glority.android.core.route.agreement;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OpenPrivacyPolicyPageRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/route/agreement/OpenPrivacyPolicyPageRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "showDeleteAccountCompat", "", "(Z)V", "getShowDeleteAccountCompat", "()Z", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenPrivacyPolicyPageRequest extends RouteRequest<Object> {
    private final boolean showDeleteAccountCompat;

    public OpenPrivacyPolicyPageRequest() {
        this(false, 1, null);
    }

    public OpenPrivacyPolicyPageRequest(boolean z) {
        super(UrlAgreement.INSTANCE.getURL_OPEN_PRIVACY_POLICY_PAGE(), null, null, 6, null);
        this.showDeleteAccountCompat = z;
    }

    public /* synthetic */ OpenPrivacyPolicyPageRequest(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getShowDeleteAccountCompat() {
        return this.showDeleteAccountCompat;
    }
}
