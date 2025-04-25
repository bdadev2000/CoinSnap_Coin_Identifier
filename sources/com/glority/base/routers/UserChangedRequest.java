package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;

/* compiled from: UserChangedRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/glority/base/routers/UserChangedRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "oldUserId", "", "newUserId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getOldUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNewUserId", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class UserChangedRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    private final Long newUserId;
    private final Long oldUserId;

    public UserChangedRequest(Long l, Long l2) {
        super(UrlRouter.INSTANCE.getURL_USER_CHANGED(), null, null, 6, null);
        this.oldUserId = l;
        this.newUserId = l2;
    }

    public final Long getNewUserId() {
        return this.newUserId;
    }

    public final Long getOldUserId() {
        return this.oldUserId;
    }
}
