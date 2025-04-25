package com.glority.android.core.route.loginUi;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginUiLogEventsRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/core/route/loginUi/LoginUiLogEventsRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "eventName", "", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LoginUiLogEventsRequest extends RouteRequest<Boolean> {
    private Bundle bundle;
    private String eventName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginUiLogEventsRequest(String eventName, Bundle bundle) {
        super(UrlLoginUi.INSTANCE.getURL_LOGIN_UI_LOG_EVENTS(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.eventName = eventName;
        this.bundle = bundle;
    }

    public /* synthetic */ LoginUiLogEventsRequest(String str, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Bundle() : bundle);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final void setBundle(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.bundle = bundle;
    }

    public final void setEventName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }
}
