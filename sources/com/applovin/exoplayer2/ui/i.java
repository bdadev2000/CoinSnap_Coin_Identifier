package com.applovin.exoplayer2.ui;

/* loaded from: classes.dex */
public interface i {

    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar, long j3);

        void a(i iVar, long j3, boolean z10);

        void b(i iVar, long j3);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j3);

    void setDuration(long j3);

    void setEnabled(boolean z10);

    void setPosition(long j3);
}
