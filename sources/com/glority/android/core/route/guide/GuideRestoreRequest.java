package com.glority.android.core.route.guide;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GuideRestoreRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/core/route/guide/GuideRestoreRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "isOldUser", "context", "Landroid/content/Context;", "(ZLandroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "()Z", "setOldUser", "(Z)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GuideRestoreRequest extends RouteRequest<Boolean> {
    private final Context context;
    private boolean isOldUser;

    public GuideRestoreRequest() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public GuideRestoreRequest(boolean z, Context context) {
        super(UrlGuide.INSTANCE.getURL_RESTORE(), context, null, 4, null);
        this.isOldUser = z;
        this.context = context;
    }

    public /* synthetic */ GuideRestoreRequest(boolean z, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : context);
    }

    public final Context getContext() {
        return this.context;
    }

    /* renamed from: isOldUser, reason: from getter */
    public final boolean getIsOldUser() {
        return this.isOldUser;
    }

    public final void setOldUser(boolean z) {
        this.isOldUser = z;
    }
}
