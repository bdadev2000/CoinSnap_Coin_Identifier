package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface q1 {

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7065b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f7066c;

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
                java.lang.StringBuilder r5 = a4.j.n(r0, r4, r1, r5, r2)
                java.lang.String r0 = ")"
                a4.j.y(r5, r6, r2, r7, r0)
                if (r9 == 0) goto L14
                java.lang.String r6 = " (recoverable)"
                goto L16
            L14:
                java.lang.String r6 = ""
            L16:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5, r10)
                r3.a = r4
                r3.f7065b = r9
                r3.f7066c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q1.b.<init>(int, int, int, int, com.applovin.impl.d9, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i10, long j3, long j10);

        void a(long j3);

        void a(Exception exc);

        void a(boolean z10);

        void b();

        void b(long j3);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {
        public final long a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7067b;

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
                java.lang.StringBuilder r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o(r0, r5, r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.a = r3
                r2.f7067b = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q1.d.<init>(long, long):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7068b;

        /* renamed from: c, reason: collision with root package name */
        public final d9 f7069c;

        public e(int i10, d9 d9Var, boolean z10) {
            super(eb.j.i("AudioTrack write failed: ", i10));
            this.f7068b = z10;
            this.a = i10;
            this.f7069c = d9Var;
        }
    }

    long a(boolean z10);

    mh a();

    void a(float f10);

    void a(int i10);

    void a(d9 d9Var, int i10, int[] iArr);

    void a(k1 k1Var);

    void a(mh mhVar);

    void a(c cVar);

    void a(u1 u1Var);

    boolean a(d9 d9Var);

    boolean a(ByteBuffer byteBuffer, long j3, int i10);

    int b(d9 d9Var);

    void b();

    void b(boolean z10);

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

    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public final d9 a;

        public a(String str, d9 d9Var) {
            super(str);
            this.a = d9Var;
        }

        public a(Throwable th2, d9 d9Var) {
            super(th2);
            this.a = d9Var;
        }
    }
}
