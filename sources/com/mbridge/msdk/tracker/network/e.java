package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class e implements z {

    /* renamed from: a, reason: collision with root package name */
    private int f18170a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f18171c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18172d;

    public e() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final int a() {
        return this.f18170a;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final long b() {
        return this.b;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final int c() {
        return this.f18171c;
    }

    public e(int i9, int i10) {
        this(i9, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i10);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final boolean a(ad adVar) {
        int i9 = this.f18171c + 1;
        this.f18171c = i9;
        return i9 <= this.f18172d;
    }

    public e(int i9, long j7, int i10) {
        this.b = j7;
        this.f18170a = i9;
        this.f18172d = i10;
    }
}
