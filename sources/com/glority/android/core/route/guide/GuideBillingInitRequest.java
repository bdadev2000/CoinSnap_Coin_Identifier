package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GuideBillingInitRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006B\u0013\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007B\u0007\b\u0016¢\u0006\u0002\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/guide/GuideBillingInitRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "context", "Landroid/content/Context;", "isInapp", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;)V", "()V", "getContext", "()Landroid/content/Context;", "setContext", "()Z", "setInapp", "(Z)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GuideBillingInitRequest extends RouteRequest<Boolean> {
    private Context context;
    private boolean isInapp;

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    /* renamed from: isInapp, reason: from getter */
    public final boolean getIsInapp() {
        return this.isInapp;
    }

    public final void setInapp(boolean z) {
        this.isInapp = z;
    }

    public GuideBillingInitRequest(Context context, boolean z) {
        super(UrlGuide.INSTANCE.getURL_BILLING_INIT(), context, null, 4, null);
        this.context = context;
        this.isInapp = z;
    }

    public /* synthetic */ GuideBillingInitRequest(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? false : z);
    }

    public GuideBillingInitRequest(Context context) {
        super(UrlGuide.INSTANCE.getURL_BILLING_INIT(), context, null, 4, null);
        this.context = context;
    }

    public /* synthetic */ GuideBillingInitRequest(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context);
    }

    public GuideBillingInitRequest() {
        super(UrlGuide.INSTANCE.getURL_BILLING_INIT(), null, null, 4, null);
    }
}
