package com.applovin.exoplayer2.ui;

/* loaded from: classes.dex */
public interface i {

    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar, long j7);

        void a(i iVar, long j7, boolean z8);

        void b(i iVar, long j7);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i9);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j7);

    void setDuration(long j7);

    void setEnabled(boolean z8);

    void setPosition(long j7);
}
