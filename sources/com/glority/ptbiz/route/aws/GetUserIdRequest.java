package com.glority.ptbiz.route.aws;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.aws.UrlAws;
import kotlin.Metadata;

/* compiled from: GetUserIdRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/ptbiz/route/aws/GetUserIdRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "()V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class GetUserIdRequest extends RouteRequest<Long> {
    public GetUserIdRequest() {
        super(UrlAws.INSTANCE.getURL_GET_USER_ID(), null, null, 6, null);
    }
}
