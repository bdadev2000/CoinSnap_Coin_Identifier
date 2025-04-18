package com.applovin.exoplayer2.ui;

/* loaded from: classes2.dex */
public interface i {

    /* loaded from: classes2.dex */
    public interface a {
        void a(i iVar, long j2);

        void a(i iVar, long j2, boolean z2);

        void b(i iVar, long j2);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i2);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j2);

    void setDuration(long j2);

    void setEnabled(boolean z2);

    void setPosition(long j2);
}
