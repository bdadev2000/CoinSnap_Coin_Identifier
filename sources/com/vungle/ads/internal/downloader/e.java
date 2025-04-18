package com.vungle.ads.internal.downloader;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    private e() {
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final h copy(h progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        h hVar = new h();
        hVar.setStatus(progress.getStatus());
        hVar.setProgressPercent(progress.getProgressPercent());
        hVar.setTimestampDownloadStart(progress.getTimestampDownloadStart());
        hVar.setSizeBytes(progress.getSizeBytes());
        hVar.setStartBytes(progress.getStartBytes());
        return hVar;
    }
}
