package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenBillingActivityRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/glority/base/routers/OpenBillingActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "from", "", "page", "requestCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getFrom", "()Ljava/lang/String;", "getPage", "getRequestCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenBillingActivityRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    public static final String From_Capture_Limited_IDS = "limit_photo";
    public static final String From_Login_Policy = "start";
    public static final String PAGE_A = "TurningPage_A";
    private final String from;
    private final String page;
    private final Integer requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenBillingActivityRequest(String from, String str, Integer num) {
        super(UrlRouter.INSTANCE.getURL_OPEN_BILLING_ACTIVITY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(from, "from");
        this.from = from;
        this.page = str;
        this.requestCode = num;
    }

    public /* synthetic */ OpenBillingActivityRequest(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? PAGE_A : str2, (i & 4) != 0 ? null : num);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getPage() {
        return this.page;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }
}
