package com.glority.base.routers;

import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: RemindUserToAttentionTrialByEmailRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/glority/base/routers/RemindUserToAttentionTrialByEmailRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "email", "", LogEventArguments.ARG_SKU, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getSku", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class RemindUserToAttentionTrialByEmailRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    private final String email;
    private final String sku;

    public RemindUserToAttentionTrialByEmailRequest(String str, String str2) {
        super(UrlRouter.INSTANCE.getURL_REMIND_USER_BY_EMAIL(), null, null, 6, null);
        this.email = str;
        this.sku = str2;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getSku() {
        return this.sku;
    }
}
