package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes.dex */
public class d6 implements gc {

    /* renamed from: a, reason: collision with root package name */
    private final p5 f7179a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7180c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7181d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7182e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7183f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7184g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7185h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7186i;

    /* renamed from: j, reason: collision with root package name */
    private int f7187j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7188k;

    public d6() {
        this(new p5(true, 65536), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    private static void a(int i9, int i10, String str, String str2) {
        AbstractC0669a1.a(i9 >= i10, str + " cannot be less than " + str2);
    }

    @Override // com.applovin.impl.gc
    public InterfaceC0727n0 b() {
        return this.f7179a;
    }

    @Override // com.applovin.impl.gc
    public void c() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public long d() {
        return this.f7185h;
    }

    @Override // com.applovin.impl.gc
    public void e() {
        a(true);
    }

    @Override // com.applovin.impl.gc
    public void f() {
        a(false);
    }

    public d6(p5 p5Var, int i9, int i10, int i11, int i12, int i13, boolean z8, int i14, boolean z9) {
        a(i11, 0, "bufferForPlaybackMs", "0");
        a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i9, i11, "minBufferMs", "bufferForPlaybackMs");
        a(i9, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i10, i9, "maxBufferMs", "minBufferMs");
        a(i14, 0, "backBufferDurationMs", "0");
        this.f7179a = p5Var;
        this.b = AbstractC0744r2.a(i9);
        this.f7180c = AbstractC0744r2.a(i10);
        this.f7181d = AbstractC0744r2.a(i11);
        this.f7182e = AbstractC0744r2.a(i12);
        this.f7183f = i13;
        this.f7187j = i13 == -1 ? com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE : i13;
        this.f7184g = z8;
        this.f7185h = AbstractC0744r2.a(i14);
        this.f7186i = z9;
    }

    public int a(li[] liVarArr, f8[] f8VarArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < liVarArr.length; i10++) {
            if (f8VarArr[i10] != null) {
                i9 += a(liVarArr[i10].e());
            }
        }
        return Math.max(com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE, i9);
    }

    private static int a(int i9) {
        switch (i9) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE;
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
        int i9 = this.f7183f;
        if (i9 == -1) {
            i9 = a(liVarArr, f8VarArr);
        }
        this.f7187j = i9;
        this.f7179a.a(i9);
    }

    private void a(boolean z8) {
        int i9 = this.f7183f;
        if (i9 == -1) {
            i9 = com.mbridge.msdk.playercommon.exoplayer2.C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f7187j = i9;
        this.f7188k = false;
        if (z8) {
            this.f7179a.e();
        }
    }

    @Override // com.applovin.impl.gc
    public boolean a() {
        return this.f7186i;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j7, long j9, float f9) {
        boolean z8 = true;
        boolean z9 = this.f7179a.d() >= this.f7187j;
        long j10 = this.b;
        if (f9 > 1.0f) {
            j10 = Math.min(yp.a(j10, f9), this.f7180c);
        }
        if (j9 < Math.max(j10, 500000L)) {
            if (!this.f7184g && z9) {
                z8 = false;
            }
            this.f7188k = z8;
            if (!z8 && j9 < 500000) {
                kc.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.f7180c || z9) {
            this.f7188k = false;
        }
        return this.f7188k;
    }

    @Override // com.applovin.impl.gc
    public boolean a(long j7, float f9, boolean z8, long j9) {
        long b = yp.b(j7, f9);
        long j10 = z8 ? this.f7182e : this.f7181d;
        if (j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j10 = Math.min(j9 / 2, j10);
        }
        return j10 <= 0 || b >= j10 || (!this.f7184g && this.f7179a.d() >= this.f7187j);
    }
}
