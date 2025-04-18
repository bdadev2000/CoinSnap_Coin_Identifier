package com.vungle.ads.internal.downloader;

import com.vungle.ads.g3;
import com.vungle.ads.s;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class n {
    private final bh.c asset;
    private final AtomicBoolean cancelled;
    private final String creativeId;
    private g3 downloadDuration;
    private final String eventId;
    private final String placementId;
    private final m priority;

    public n(m priority, bh.c asset, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final bh.c getAsset() {
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
    public final m m20getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isMainVideo() {
        return Intrinsics.areEqual(this.asset.getAdIdentifier(), "MAIN_VIDEO");
    }

    public final boolean isTemplate() {
        return this.asset.getFileType() == bh.a.ZIP;
    }

    public final void startRecord() {
        g3 g3Var = new g3(com.vungle.ads.internal.protos.n.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = g3Var;
        g3Var.markStart();
    }

    public final void stopRecord() {
        g3 g3Var = this.downloadDuration;
        if (g3Var != null) {
            g3Var.markEnd();
            s.INSTANCE.logMetric$vungle_ads_release(g3Var, this.placementId, this.creativeId, this.eventId, this.asset.getServerPath());
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadRequest{, priority=");
        sb2.append(this.priority);
        sb2.append(", url='");
        sb2.append(this.asset.getServerPath());
        sb2.append("', path='");
        sb2.append(this.asset.getLocalPath());
        sb2.append("', cancelled=");
        sb2.append(this.cancelled);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", creativeId=");
        sb2.append(this.creativeId);
        sb2.append(", eventId=");
        return com.applovin.impl.mediation.ads.e.g(sb2, this.eventId, AbstractJsonLexerKt.END_OBJ);
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ n(m mVar, bh.c cVar, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, cVar, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}
