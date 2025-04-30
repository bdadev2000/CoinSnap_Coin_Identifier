package com.mbridge.msdk.e.a;

import android.os.CountDownTimer;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.e.a.a f15326a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private a f15327c;

    /* renamed from: d, reason: collision with root package name */
    private long f15328d = 0;

    /* loaded from: classes3.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.e.a.a f15329a;

        public a(long j7, long j9) {
            super(j7, j9);
        }

        public final void a(com.mbridge.msdk.e.a.a aVar) {
            this.f15329a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.e.a.a aVar = this.f15329a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j7) {
            com.mbridge.msdk.e.a.a aVar = this.f15329a;
            if (aVar != null) {
                aVar.onTick(j7);
            }
        }
    }

    public final void a() {
        a aVar = this.f15327c;
        if (aVar != null) {
            aVar.cancel();
            this.f15327c = null;
        }
    }

    public final b b(long j7) {
        this.f15328d = j7;
        return this;
    }

    public final void b() {
        a aVar = this.f15327c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f15327c = null;
            }
            if (this.b <= 0) {
                this.b = this.f15328d + 1000;
            }
            a aVar2 = new a(this.f15328d, this.b);
            this.f15327c = aVar2;
            aVar2.a(this.f15326a);
        }
        this.f15327c.start();
    }

    public final b a(long j7) {
        if (j7 < 0) {
            j7 = 1000;
        }
        this.b = j7;
        return this;
    }

    public final b a(com.mbridge.msdk.e.a.a aVar) {
        this.f15326a = aVar;
        return this;
    }
}
