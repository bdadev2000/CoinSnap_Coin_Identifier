package com.glority.android.core.route.agreement;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: GetLegalConfigRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/core/route/agreement/GetLegalConfigRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "()V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GetLegalConfigRequest extends RouteRequest<String> {
    public GetLegalConfigRequest() {
        super(UrlAgreement.INSTANCE.getURL_GET_CONFIG(), null, null, 6, null);
    }
}
