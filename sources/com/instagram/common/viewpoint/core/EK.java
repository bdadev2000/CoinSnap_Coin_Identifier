package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* loaded from: assets/audience_network.dex */
public final class EK {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final DownloadAction A04;
    public final Throwable A05;

    public EK(int i2, DownloadAction downloadAction, int i3, float f2, long j2, Throwable th) {
        this.A02 = i2;
        this.A04 = downloadAction;
        this.A01 = i3;
        this.A00 = f2;
        this.A03 = j2;
        this.A05 = th;
    }

    public /* synthetic */ EK(int i2, DownloadAction downloadAction, int i3, float f2, long j2, Throwable th, EA ea) {
        this(i2, downloadAction, i3, f2, j2, th);
    }
}
