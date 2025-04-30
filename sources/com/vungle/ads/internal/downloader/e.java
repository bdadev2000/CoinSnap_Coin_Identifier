package com.vungle.ads.internal.downloader;

import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public final class e {
    public /* synthetic */ e(G7.f fVar) {
        this();
    }

    public final h copy(h hVar) {
        G7.j.e(hVar, NotificationCompat.CATEGORY_PROGRESS);
        h hVar2 = new h();
        hVar2.setStatus(hVar.getStatus());
        hVar2.setProgressPercent(hVar.getProgressPercent());
        hVar2.setTimestampDownloadStart(hVar.getTimestampDownloadStart());
        hVar2.setSizeBytes(hVar.getSizeBytes());
        hVar2.setStartBytes(hVar.getStartBytes());
        return hVar2;
    }

    private e() {
    }
}
