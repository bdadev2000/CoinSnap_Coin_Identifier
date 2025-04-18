package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes4.dex */
public final class e implements z {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private long f15427b;

    /* renamed from: c, reason: collision with root package name */
    private int f15428c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15429d;

    public e() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final int a() {
        return this.a;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final long b() {
        return this.f15427b;
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final int c() {
        return this.f15428c;
    }

    public e(int i10, int i11) {
        this(i10, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.z
    public final boolean a(ad adVar) {
        int i10 = this.f15428c + 1;
        this.f15428c = i10;
        return i10 <= this.f15429d;
    }

    public e(int i10, long j3, int i11) {
        this.f15427b = j3;
        this.a = i10;
        this.f15429d = i11;
    }
}
