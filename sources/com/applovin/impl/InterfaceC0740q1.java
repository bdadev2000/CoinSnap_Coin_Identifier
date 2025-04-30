package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0740q1 {

    /* renamed from: com.applovin.impl.q1$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f10123a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f10124c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, com.applovin.impl.d9 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed "
                java.lang.String r1 = " Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = Q7.n0.o(r4, r5, r0, r1, r2)
                java.lang.String r0 = ")"
                Q7.n0.t(r5, r6, r2, r7, r0)
                if (r9 == 0) goto L14
                java.lang.String r6 = " (recoverable)"
                goto L16
            L14:
                java.lang.String r6 = ""
            L16:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5, r10)
                r3.f10123a = r4
                r3.b = r9
                r3.f10124c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.InterfaceC0740q1.b.<init>(int, int, int, int, com.applovin.impl.d9, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: com.applovin.impl.q1$c */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i9, long j7, long j9);

        void a(long j7);

        void a(Exception exc);

        void a(boolean z8);

        void b();

        void b(long j7);
    }

    /* renamed from: com.applovin.impl.q1$d */
    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f10125a;
        public final long b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(long r3, long r5) {
            /*
                r2 = this;
                java.lang.String r0 = "Unexpected audio track timestamp discontinuity: expected "
                java.lang.String r1 = ", got "
                java.lang.StringBuilder r0 = y.AbstractC2933a.a(r0, r5, r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f10125a = r3
                r2.b = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.InterfaceC0740q1.d.<init>(long, long):void");
        }
    }

    /* renamed from: com.applovin.impl.q1$e */
    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f10126a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f10127c;

        public e(int i9, d9 d9Var, boolean z8) {
            super(com.mbridge.msdk.foundation.entity.o.h(i9, "AudioTrack write failed: "));
            this.b = z8;
            this.f10126a = i9;
            this.f10127c = d9Var;
        }
    }

    long a(boolean z8);

    mh a();

    void a(float f9);

    void a(int i9);

    void a(d9 d9Var, int i9, int[] iArr);

    void a(C0716k1 c0716k1);

    void a(mh mhVar);

    void a(c cVar);

    void a(C0763u1 c0763u1);

    boolean a(d9 d9Var);

    boolean a(ByteBuffer byteBuffer, long j7, int i9);

    int b(d9 d9Var);

    void b();

    void b(boolean z8);

    boolean c();

    void d();

    void e();

    void f();

    boolean g();

    void h();

    void i();

    void j();

    void pause();

    void reset();

    /* renamed from: com.applovin.impl.q1$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final d9 f10122a;

        public a(String str, d9 d9Var) {
            super(str);
            this.f10122a = d9Var;
        }

        public a(Throwable th, d9 d9Var) {
            super(th);
            this.f10122a = d9Var;
        }
    }
}
