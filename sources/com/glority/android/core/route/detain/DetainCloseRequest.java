package com.glority.android.core.route.detain;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DetainCloseRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/detain/DetainCloseRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "payResult", "", "bundle", "Landroid/os/Bundle;", "(ZLandroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "getPayResult", "()Z", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DetainCloseRequest extends RouteRequest<String> {
    private final Bundle bundle;
    private final boolean payResult;

    public DetainCloseRequest(boolean z, Bundle bundle) {
        super(UrlDetain.INSTANCE.getURL_DETAIN_CLOSE(), null, null, 6, null);
        this.payResult = z;
        this.bundle = bundle;
    }

    public /* synthetic */ DetainCloseRequest(boolean z, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bundle);
    }

    public final Bundle getBundle() {
        return this.bundle;
    }

    public final boolean getPayResult() {
        return this.payResult;
    }
}
