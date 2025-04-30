package com.vungle.ads.internal.downloader;

import c7.C0620c;
import c7.EnumC0616a;
import com.applovin.impl.L;
import com.vungle.ads.C2137s;
import com.vungle.ads.h1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class n {
    private final C0620c asset;
    private final AtomicBoolean cancelled;
    private final String creativeId;
    private h1 downloadDuration;
    private final String eventId;
    private final String placementId;
    private final m priority;

    public n(m mVar, C0620c c0620c, String str, String str2, String str3) {
        G7.j.e(mVar, "priority");
        G7.j.e(c0620c, "asset");
        this.priority = mVar;
        this.asset = c0620c;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final C0620c getAsset() {
        return this.asset;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: getPriority, reason: collision with other method in class */
    public final m m39getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isMainVideo() {
        return G7.j.a(this.asset.getAdIdentifier(), "MAIN_VIDEO");
    }

    public final boolean isTemplate() {
        if (this.asset.getFileType() == EnumC0616a.ZIP) {
            return true;
        }
        return false;
    }

    public final void startRecord() {
        h1 h1Var = new h1(com.vungle.ads.internal.protos.n.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = h1Var;
        h1Var.markStart();
    }

    public final void stopRecord() {
        h1 h1Var = this.downloadDuration;
        if (h1Var != null) {
            h1Var.markEnd();
            C2137s.INSTANCE.logMetric$vungle_ads_release(h1Var, this.placementId, this.creativeId, this.eventId, this.asset.getServerPath());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadRequest{, priority=");
        sb.append(this.priority);
        sb.append(", url='");
        sb.append(this.asset.getServerPath());
        sb.append("', path='");
        sb.append(this.asset.getLocalPath());
        sb.append("', cancelled=");
        sb.append(this.cancelled);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", eventId=");
        return L.k(sb, this.eventId, '}');
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ n(m mVar, C0620c c0620c, String str, String str2, String str3, int i9, G7.f fVar) {
        this(mVar, c0620c, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : str3);
    }
}
