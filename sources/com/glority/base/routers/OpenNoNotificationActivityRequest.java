package com.glority.base.routers;

import android.os.Bundle;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenNoNotificationActivityRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/glority/base/routers/OpenNoNotificationActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "logEventBundle", "Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "getLogEventBundle", "()Landroid/os/Bundle;", "setLogEventBundle", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenNoNotificationActivityRequest extends RouteRequest<Boolean> {
    public static final int $stable = 8;
    private Bundle logEventBundle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenNoNotificationActivityRequest(Bundle logEventBundle) {
        super(UrlRouter.INSTANCE.getURL_OPEN_NO_NOTIFICATION_ACCESS_ACTIVITY(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(logEventBundle, "logEventBundle");
        this.logEventBundle = logEventBundle;
    }

    public final Bundle getLogEventBundle() {
        return this.logEventBundle;
    }

    public final void setLogEventBundle(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.logEventBundle = bundle;
    }
}
