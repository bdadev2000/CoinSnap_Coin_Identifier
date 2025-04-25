package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenPremiumCenterFragmentRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/glority/base/routers/OpenPremiumCenterFragmentRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "from", "", "<init>", "(Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenPremiumCenterFragmentRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    public static final String FROM_HOMEPAGE_PREMIUM_SERVICE = "homepage_premium_service";
    public static final String FROM_ME_PREMIUM_SERVICE = "me_premium_service";
    public static final String FROM_SETTING_MY_PREMIUM_SERVICE = "setting_my_premium_service";
    private final String from;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPremiumCenterFragmentRequest(String from) {
        super(UrlRouter.INSTANCE.getURL_OPEN_PREMIUM_CENTER_FRAGMENT(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(from, "from");
        this.from = from;
        if (Intrinsics.areEqual(from, FROM_HOMEPAGE_PREMIUM_SERVICE) || Intrinsics.areEqual(from, FROM_SETTING_MY_PREMIUM_SERVICE) || Intrinsics.areEqual(from, FROM_ME_PREMIUM_SERVICE)) {
            return;
        }
        LogUtils.e("Parameter 'from' provides an invalid string, which should be one of the following:\n homepage_premium_service setting_my_premium_service me_premium_service", "It is not a strongly restricted rule, but it should also be followed.");
    }

    public final String getFrom() {
        return this.from;
    }
}
