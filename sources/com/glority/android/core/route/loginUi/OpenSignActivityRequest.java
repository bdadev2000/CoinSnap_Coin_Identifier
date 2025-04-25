package com.glority.android.core.route.loginUi;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OpenSignActivityRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/glority/android/core/route/loginUi/OpenSignActivityRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "signType", "", "(I)V", "getSignType", "()I", "setSignType", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class OpenSignActivityRequest extends RouteRequest<Boolean> {
    private int signType;

    public OpenSignActivityRequest() {
        this(0, 1, null);
    }

    public OpenSignActivityRequest(int i) {
        super(UrlLoginUi.INSTANCE.getOPEN_SIGN_ACTIVITY(), null, null, 6, null);
        this.signType = i;
    }

    public /* synthetic */ OpenSignActivityRequest(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getSignType() {
        return this.signType;
    }

    public final void setSignType(int i) {
        this.signType = i;
    }
}
