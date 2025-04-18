package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes.dex */
public class d6 implements gc {
    private final p5 a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4204b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4205c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4206d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4207e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4208f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4209g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4210h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f4211i;

    /* renamed from: j, reason: collision with root package name */
    private int f4212j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4213k;

    public d6() {
        this(new p5(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    private static void a(int i10, int i11, String str, String str2) {
        a1.a(i10 >= i11, str + " cannot be less than " + str2);
    }

    @Override // com.applovin.impl.gc
    public n0 b() {
        return this.a;
    }

    @Override // com.applovin.impl.gc
    public void c() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public long d() {
        return this.f4210h;
    }

    @Override // com.applovin.impl.gc
    public void e() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public void f() {
        a(false);
    }

    public d6(p5 p5Var, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.a = p5Var;
        this.f4204b = r2.a(i10);
        this.f4205c = r2.a(i11);
        this.f4206d = r2.a(i12);
        this.f4207e = r2.a(i13);
        this.f4208f = i14;
        this.f4212j = i14 == -1 ? C.DEFAULT_VIDEO_BUFFER_SIZE : i14;
        this.f4209g = z10;
        this.f4210h = r2.a(i15);
        this.f4211i = z11;
    }

    public int a(li[] liVarArr, f8[] f8VarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < liVarArr.length; i11++) {
            if (f8VarArr[i11] != null) {
                i10 += a(liVarArr[i11].e());
            }
        }
        return Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i10);
    }

    private static int a(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // com.applovin.impl.gc
    public void a(li[] liVarArr, qo qoVar, f8[] f8VarArr) {
        int i10 = this.f4208f;
        if (i10 == -1) {
            i10 = a(liVarArr, f8VarArr);
        }
        this.f4212j = i10;
        this.a.a(i10);
    }

    private void a(boolean z10) {
        int i10 = this.f4208f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f4212j = i10;
        this.f4213k = false;
        if (z10) {
            this.a.e();
        }
    }

    @Override // com.applovin.impl.gc
    public boolean a() {
        return this.f4211i;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j3, long j10, float f10) {
        boolean z10 = true;
        boolean z11 = this.a.d() >= this.f4212j;
        long j11 = this.f4204b;
        if (f10 > 1.0f) {
            j11 = Math.min(yp.a(j11, f10), this.f4205c);
        }
        if (j10 < Math.max(j11, 500000L)) {
            if (!this.f4209g && z11) {
                z10 = false;
            }
            this.f4213k = z10;
            if (!z10 && j10 < 500000) {
                kc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f4205c || z11) {
            this.f4213k = false;
        }
        return this.f4213k;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j3, float f10, boolean z10, long j10) {
        long b3 = yp.b(j3, f10);
        long j11 = z10 ? this.f4207e : this.f4206d;
        if (j10 != C.TIME_UNSET) {
            j11 = Math.min(j10 / 2, j11);
        }
        return j11 <= 0 || b3 >= j11 || (!this.f4209g && this.a.d() >= this.f4212j);
    }
}
