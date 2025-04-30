package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f18643a = 0;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f18644c;

    /* renamed from: d, reason: collision with root package name */
    private a f18645d;

    /* loaded from: classes3.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.i.c.a f18646a;

        public a(long j7, long j9) {
            super(j7, j9);
        }

        public final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.f18646a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f18646a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j7) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f18646a;
            if (aVar != null) {
                aVar.a(j7);
            }
        }
    }

    private void c() {
        a aVar = this.f18645d;
        if (aVar != null) {
            aVar.cancel();
            this.f18645d = null;
        }
        if (this.b <= 0) {
            this.b = this.f18643a + 1000;
        }
        a aVar2 = new a(this.f18643a, this.b);
        this.f18645d = aVar2;
        aVar2.a(this.f18644c);
    }

    public final b a(long j7) {
        if (j7 < 0) {
            j7 = 1000;
        }
        this.b = j7;
        return this;
    }

    public final b b(long j7) {
        this.f18643a = j7;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f18644c = aVar;
        return this;
    }

    public final void b() {
        a aVar = this.f18645d;
        if (aVar != null) {
            aVar.cancel();
            this.f18645d = null;
        }
    }

    public final void a() {
        if (this.f18645d == null) {
            c();
        }
        this.f18645d.start();
    }

    public final void a(long j7, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f18643a = j7;
        this.f18644c = aVar;
        c();
        a aVar2 = this.f18645d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}
