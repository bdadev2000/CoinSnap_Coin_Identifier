package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenManageMembershipActivityRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lcom/glority/base/routers/OpenManageMembershipActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "from", "", "memo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getMemo", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenManageMembershipActivityRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    public static final String FROM_PREMIUM_PRIVILEGES = "premium_privileges";
    public static final String FROM_SETTINGS_MANAGE_MEMBERSHIP = "setting_manage_membership";
    private final String from;
    private final String memo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenManageMembershipActivityRequest(String from, String str) {
        super(UrlRouter.INSTANCE.getURL_OPEN_MANAGE_MEMBERSHIP_ACTIVITY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(from, "from");
        this.from = from;
        this.memo = str;
        if (Intrinsics.areEqual(from, FROM_PREMIUM_PRIVILEGES)) {
            return;
        }
        Intrinsics.areEqual(from, FROM_SETTINGS_MANAGE_MEMBERSHIP);
    }

    public /* synthetic */ OpenManageMembershipActivityRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getMemo() {
        return this.memo;
    }
}
