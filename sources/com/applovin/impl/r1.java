package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface r1 {

    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final f9 f26244a;

        public a(String str, f9 f9Var) {
            super(str);
            this.f26244a = f9Var;
        }

        public a(Throwable th, f9 f9Var) {
            super(th);
            this.f26244a = f9Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f26245a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26246b;

        /* renamed from: c, reason: collision with root package name */
        public final f9 f26247c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(int r4, int r5, int r6, int r7, com.applovin.impl.f9 r8, boolean r9, java.lang.Exception r10) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed "
                java.lang.String r1 = " Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r5 = android.support.v4.media.d.u(r0, r4, r1, r5, r2)
                r5.append(r6)
                r5.append(r2)
                r5.append(r7)
                java.lang.String r6 = ")"
                r5.append(r6)
                if (r9 == 0) goto L1d
                java.lang.String r6 = " (recoverable)"
                goto L1f
            L1d:
                java.lang.String r6 = ""
            L1f:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5, r10)
                r3.f26245a = r4
                r3.f26246b = r9
                r3.f26247c = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.r1.b.<init>(int, int, int, int, com.applovin.impl.f9, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void a(int i2, long j2, long j3);

        void a(long j2);

        void a(Exception exc);

        void a(boolean z2);

        void b();

        void b(long j2);
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final long f26248a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26249b;

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
                java.lang.StringBuilder r0 = androidx.compose.foundation.text.input.a.r(r0, r5, r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.f26248a = r3
                r2.f26249b = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.r1.d.<init>(long, long):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f26250a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26251b;

        /* renamed from: c, reason: collision with root package name */
        public final f9 f26252c;

        public e(int i2, f9 f9Var, boolean z2) {
            super(android.support.v4.media.d.i("AudioTrack write failed: ", i2));
            this.f26251b = z2;
            this.f26250a = i2;
            this.f26252c = f9Var;
        }
    }

    long a(boolean z2);

    ph a();

    void a(float f2);

    void a(int i2);

    void a(f9 f9Var, int i2, int[] iArr);

    void a(l1 l1Var);

    void a(ph phVar);

    void a(c cVar);

    void a(v1 v1Var);

    boolean a(f9 f9Var);

    boolean a(ByteBuffer byteBuffer, long j2, int i2);

    int b(f9 f9Var);

    void b();

    void b(boolean z2);

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
}
