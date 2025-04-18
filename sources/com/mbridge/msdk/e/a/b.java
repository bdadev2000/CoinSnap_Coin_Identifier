package com.mbridge.msdk.e.a;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {
    private com.mbridge.msdk.e.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private long f12969b;

    /* renamed from: c, reason: collision with root package name */
    private a f12970c;

    /* renamed from: d, reason: collision with root package name */
    private long f12971d = 0;

    /* loaded from: classes4.dex */
    public static class a extends CountDownTimer {
        private com.mbridge.msdk.e.a.a a;

        public a(long j3, long j10) {
            super(j3, j10);
        }

        public final void a(com.mbridge.msdk.e.a.a aVar) {
            this.a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.e.a.a aVar = this.a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j3) {
            com.mbridge.msdk.e.a.a aVar = this.a;
            if (aVar != null) {
                aVar.onTick(j3);
            }
        }
    }

    public final void a() {
        a aVar = this.f12970c;
        if (aVar != null) {
            aVar.cancel();
            this.f12970c = null;
        }
    }

    public final b b(long j3) {
        this.f12971d = j3;
        return this;
    }

    public final void b() {
        a aVar = this.f12970c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f12970c = null;
            }
            if (this.f12969b <= 0) {
                this.f12969b = this.f12971d + 1000;
            }
            a aVar2 = new a(this.f12971d, this.f12969b);
            this.f12970c = aVar2;
            aVar2.a(this.a);
        }
        this.f12970c.start();
    }

    public final b a(long j3) {
        if (j3 < 0) {
            j3 = 1000;
        }
        this.f12969b = j3;
        return this;
    }

    public final b a(com.mbridge.msdk.e.a.a aVar) {
        this.a = aVar;
        return this;
    }
}
