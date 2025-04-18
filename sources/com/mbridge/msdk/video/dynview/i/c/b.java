package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {
    private long a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f15782b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f15783c;

    /* renamed from: d, reason: collision with root package name */
    private a f15784d;

    /* loaded from: classes4.dex */
    public static class a extends CountDownTimer {
        private com.mbridge.msdk.video.dynview.i.c.a a;

        public a(long j3, long j10) {
            super(j3, j10);
        }

        public final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j3) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.a;
            if (aVar != null) {
                aVar.a(j3);
            }
        }
    }

    private void c() {
        a aVar = this.f15784d;
        if (aVar != null) {
            aVar.cancel();
            this.f15784d = null;
        }
        if (this.f15782b <= 0) {
            this.f15782b = this.a + 1000;
        }
        a aVar2 = new a(this.a, this.f15782b);
        this.f15784d = aVar2;
        aVar2.a(this.f15783c);
    }

    public final b a(long j3) {
        if (j3 < 0) {
            j3 = 1000;
        }
        this.f15782b = j3;
        return this;
    }

    public final b b(long j3) {
        this.a = j3;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f15783c = aVar;
        return this;
    }

    public final void b() {
        a aVar = this.f15784d;
        if (aVar != null) {
            aVar.cancel();
            this.f15784d = null;
        }
    }

    public final void a() {
        if (this.f15784d == null) {
            c();
        }
        this.f15784d.start();
    }

    public final void a(long j3, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.a = j3;
        this.f15783c = aVar;
        c();
        a aVar2 = this.f15784d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}
