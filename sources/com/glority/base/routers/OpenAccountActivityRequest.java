package com.glority.base.routers;

import com.glority.android.core.route.RouteRequest;
import com.glority.android.picturexx.settings.AccountActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OpenAccountActivityRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/glority/base/routers/OpenAccountActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "requestCode", "", AccountActivity.tagForceShowLogin, "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getRequestCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getForceShowLogin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class OpenAccountActivityRequest extends RouteRequest<Boolean> {
    public static final int $stable = 0;
    private final Boolean forceShowLogin;
    private final Integer requestCode;

    public OpenAccountActivityRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public OpenAccountActivityRequest(Integer num, Boolean bool) {
        super(UrlRouter.INSTANCE.getURL_OPEN_ACCOUNT_ACTIVITY(), null, null, 6, null);
        this.requestCode = num;
        this.forceShowLogin = bool;
    }

    public /* synthetic */ OpenAccountActivityRequest(Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool);
    }

    public final Boolean getForceShowLogin() {
        return this.forceShowLogin;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }
}
