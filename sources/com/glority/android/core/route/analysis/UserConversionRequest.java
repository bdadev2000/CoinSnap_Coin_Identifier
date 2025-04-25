package com.glority.android.core.route.analysis;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.utils.device.CorePersistKey;
import kotlin.Metadata;

/* compiled from: UserConversionRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/glority/android/core/route/analysis/UserConversionRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "isOrganic", CorePersistKey.MEDIA_STORE, "", "installTime", "campaign", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaign", "()Ljava/lang/String;", "setCampaign", "(Ljava/lang/String;)V", "getInstallTime", "setInstallTime", "()Z", "setOrganic", "(Z)V", "getMediaStore", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UserConversionRequest extends RouteRequest<Boolean> {
    private String campaign;
    private String installTime;
    private boolean isOrganic;
    private final String mediaStore;

    public UserConversionRequest(boolean z, String str, String str2, String str3) {
        super(UrlTracking.INSTANCE.getURL_USER_CONVERSION_MESSAGE(), null, null, 6, null);
        this.isOrganic = z;
        this.mediaStore = str;
        this.installTime = str2;
        this.campaign = str3;
    }

    public final String getCampaign() {
        return this.campaign;
    }

    public final String getInstallTime() {
        return this.installTime;
    }

    public final String getMediaStore() {
        return this.mediaStore;
    }

    /* renamed from: isOrganic, reason: from getter */
    public final boolean getIsOrganic() {
        return this.isOrganic;
    }

    public final void setCampaign(String str) {
        this.campaign = str;
    }

    public final void setInstallTime(String str) {
        this.installTime = str;
    }

    public final void setOrganic(boolean z) {
        this.isOrganic = z;
    }
}
