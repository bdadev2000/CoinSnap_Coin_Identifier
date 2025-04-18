package com.vungle.ads.internal.downloader;

/* loaded from: classes4.dex */
public final class h {
    public static final e Companion = new e(null);
    private int progressPercent;
    private long sizeBytes;
    private long startBytes;
    private int status;
    private long timestampDownloadStart;

    @g
    public static /* synthetic */ void getStatus$annotations() {
    }

    public final int getProgressPercent() {
        return this.progressPercent;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final long getStartBytes() {
        return this.startBytes;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimestampDownloadStart() {
        return this.timestampDownloadStart;
    }

    public final void setProgressPercent(int i10) {
        this.progressPercent = i10;
    }

    public final void setSizeBytes(long j3) {
        this.sizeBytes = j3;
    }

    public final void setStartBytes(long j3) {
        this.startBytes = j3;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }

    public final void setTimestampDownloadStart(long j3) {
        this.timestampDownloadStart = j3;
    }
}
