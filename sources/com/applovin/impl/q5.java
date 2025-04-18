package com.applovin.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.o1;
import com.applovin.impl.q1;
import com.applovin.impl.t1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class q5 implements q1 {

    /* renamed from: a0, reason: collision with root package name */
    public static boolean f7081a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private o1[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private int L;
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private u1 V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;
    private final m1 a;

    /* renamed from: b, reason: collision with root package name */
    private final b f7082b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7083c;

    /* renamed from: d, reason: collision with root package name */
    private final b3 f7084d;

    /* renamed from: e, reason: collision with root package name */
    private final ap f7085e;

    /* renamed from: f, reason: collision with root package name */
    private final o1[] f7086f;

    /* renamed from: g, reason: collision with root package name */
    private final o1[] f7087g;

    /* renamed from: h, reason: collision with root package name */
    private final ConditionVariable f7088h;

    /* renamed from: i, reason: collision with root package name */
    private final t1 f7089i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque f7090j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7091k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7092l;

    /* renamed from: m, reason: collision with root package name */
    private i f7093m;

    /* renamed from: n, reason: collision with root package name */
    private final g f7094n;

    /* renamed from: o, reason: collision with root package name */
    private final g f7095o;

    /* renamed from: p, reason: collision with root package name */
    private q1.c f7096p;

    /* renamed from: q, reason: collision with root package name */
    private c f7097q;

    /* renamed from: r, reason: collision with root package name */
    private c f7098r;

    /* renamed from: s, reason: collision with root package name */
    private AudioTrack f7099s;

    /* renamed from: t, reason: collision with root package name */
    private k1 f7100t;
    private f u;

    /* renamed from: v, reason: collision with root package name */
    private f f7101v;

    /* renamed from: w, reason: collision with root package name */
    private mh f7102w;

    /* renamed from: x, reason: collision with root package name */
    private ByteBuffer f7103x;

    /* renamed from: y, reason: collision with root package name */
    private int f7104y;

    /* renamed from: z, reason: collision with root package name */
    private long f7105z;

    /* loaded from: classes.dex */
    public class a extends Thread {
        final /* synthetic */ AudioTrack a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.a.flush();
                this.a.release();
            } finally {
                q5.this.f7088h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        long a(long j3);

        mh a(mh mhVar);

        boolean a(boolean z10);

        o1[] a();

        long b();
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final d9 a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7107b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7108c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7109d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7110e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7111f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7112g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7113h;

        /* renamed from: i, reason: collision with root package name */
        public final o1[] f7114i;

        public c(d9 d9Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, o1[] o1VarArr) {
            this.a = d9Var;
            this.f7107b = i10;
            this.f7108c = i11;
            this.f7109d = i12;
            this.f7110e = i13;
            this.f7111f = i14;
            this.f7112g = i15;
            this.f7114i = o1VarArr;
            this.f7113h = a(i16, z10);
        }

        private int c(long j3) {
            int d10 = q5.d(this.f7112g);
            if (this.f7112g == 5) {
                d10 *= 2;
            }
            return (int) ((j3 * d10) / 1000000);
        }

        private AudioTrack d(boolean z10, k1 k1Var, int i10) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(a(k1Var, z10)).setAudioFormat(q5.b(this.f7110e, this.f7111f, this.f7112g)).setTransferMode(1).setBufferSizeInBytes(this.f7113h).setSessionId(i10).setOffloadedPlayback(this.f7108c == 1);
            return offloadedPlayback.build();
        }

        public AudioTrack a(boolean z10, k1 k1Var, int i10) {
            try {
                AudioTrack b3 = b(z10, k1Var, i10);
                int state = b3.getState();
                if (state == 1) {
                    return b3;
                }
                try {
                    b3.release();
                } catch (Exception unused) {
                }
                throw new q1.b(state, this.f7110e, this.f7111f, this.f7113h, this.a, b(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new q1.b(0, this.f7110e, this.f7111f, this.f7113h, this.a, b(), e2);
            }
        }

        public long b(long j3) {
            return (j3 * 1000000) / this.f7110e;
        }

        public boolean b() {
            return this.f7108c == 1;
        }

        private AudioTrack b(boolean z10, k1 k1Var, int i10) {
            int i11 = yp.a;
            if (i11 >= 29) {
                return d(z10, k1Var, i10);
            }
            if (i11 >= 21) {
                return c(z10, k1Var, i10);
            }
            return a(k1Var, i10);
        }

        private AudioTrack c(boolean z10, k1 k1Var, int i10) {
            return new AudioTrack(a(k1Var, z10), q5.b(this.f7110e, this.f7111f, this.f7112g), this.f7113h, 1, i10);
        }

        public boolean a(c cVar) {
            return cVar.f7108c == this.f7108c && cVar.f7112g == this.f7112g && cVar.f7110e == this.f7110e && cVar.f7111f == this.f7111f && cVar.f7109d == this.f7109d;
        }

        private int a(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f7108c;
            if (i11 == 0) {
                return a(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                return c(50000000L);
            }
            if (i11 == 2) {
                return c(250000L);
            }
            throw new IllegalStateException();
        }

        public long d(long j3) {
            return (j3 * 1000000) / this.a.A;
        }

        private AudioTrack a(k1 k1Var, int i10) {
            int e2 = yp.e(k1Var.f5585c);
            if (i10 == 0) {
                return new AudioTrack(e2, this.f7110e, this.f7111f, this.f7112g, this.f7113h, 1);
            }
            return new AudioTrack(e2, this.f7110e, this.f7111f, this.f7112g, this.f7113h, 1, i10);
        }

        public long a(long j3) {
            return (j3 * this.f7110e) / 1000000;
        }

        private static AudioAttributes a(k1 k1Var, boolean z10) {
            if (z10) {
                return a();
            }
            return k1Var.a();
        }

        private int a(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f7110e, this.f7111f, this.f7112g);
            a1.b(minBufferSize != -2);
            int a = yp.a(minBufferSize * 4, ((int) a(250000L)) * this.f7109d, Math.max(minBufferSize, ((int) a(750000L)) * this.f7109d));
            return f10 != 1.0f ? Math.round(a * f10) : a;
        }

        private static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {
        private final o1[] a;

        /* renamed from: b, reason: collision with root package name */
        private final xj f7115b;

        /* renamed from: c, reason: collision with root package name */
        private final lk f7116c;

        public d(o1... o1VarArr) {
            this(o1VarArr, new xj(), new lk());
        }

        @Override // com.applovin.impl.q5.b
        public mh a(mh mhVar) {
            this.f7116c.b(mhVar.a);
            this.f7116c.a(mhVar.f6273b);
            return mhVar;
        }

        @Override // com.applovin.impl.q5.b
        public long b() {
            return this.f7115b.j();
        }

        public d(o1[] o1VarArr, xj xjVar, lk lkVar) {
            o1[] o1VarArr2 = new o1[o1VarArr.length + 2];
            this.a = o1VarArr2;
            System.arraycopy(o1VarArr, 0, o1VarArr2, 0, o1VarArr.length);
            this.f7115b = xjVar;
            this.f7116c = lkVar;
            o1VarArr2[o1VarArr.length] = xjVar;
            o1VarArr2[o1VarArr.length + 1] = lkVar;
        }

        @Override // com.applovin.impl.q5.b
        public boolean a(boolean z10) {
            this.f7115b.a(z10);
            return z10;
        }

        @Override // com.applovin.impl.q5.b
        public o1[] a() {
            return this.a;
        }

        @Override // com.applovin.impl.q5.b
        public long a(long j3) {
            return this.f7116c.a(j3);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RuntimeException {
        private e(String str) {
            super(str);
        }

        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        private final long a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f7120b;

        /* renamed from: c, reason: collision with root package name */
        private long f7121c;

        public g(long j3) {
            this.a = j3;
        }

        public void a() {
            this.f7120b = null;
        }

        public void a(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7120b == null) {
                this.f7120b = exc;
                this.f7121c = this.a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f7121c) {
                Exception exc2 = this.f7120b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f7120b;
                a();
                throw exc3;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h implements t1.a {
        private h() {
        }

        @Override // com.applovin.impl.t1.a
        public void a(long j3, long j10, long j11, long j12) {
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Spurious audio timestamp (frame position mismatch): ", j3, ", ");
            o10.append(j10);
            o10.append(", ");
            o10.append(j11);
            o10.append(", ");
            o10.append(j12);
            o10.append(", ");
            o10.append(q5.this.q());
            o10.append(", ");
            o10.append(q5.this.r());
            String sb2 = o10.toString();
            if (!q5.f7081a0) {
                kc.d("DefaultAudioSink", sb2);
                return;
            }
            throw new e(sb2, null);
        }

        @Override // com.applovin.impl.t1.a
        public void b(long j3, long j10, long j11, long j12) {
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Spurious audio timestamp (system clock mismatch): ", j3, ", ");
            o10.append(j10);
            o10.append(", ");
            o10.append(j11);
            o10.append(", ");
            o10.append(j12);
            o10.append(", ");
            o10.append(q5.this.q());
            o10.append(", ");
            o10.append(q5.this.r());
            String sb2 = o10.toString();
            if (!q5.f7081a0) {
                kc.d("DefaultAudioSink", sb2);
                return;
            }
            throw new e(sb2, null);
        }

        public /* synthetic */ h(q5 q5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.t1.a
        public void a(long j3) {
            if (q5.this.f7096p != null) {
                q5.this.f7096p.a(j3);
            }
        }

        @Override // com.applovin.impl.t1.a
        public void b(long j3) {
            kc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j3);
        }

        @Override // com.applovin.impl.t1.a
        public void a(int i10, long j3) {
            if (q5.this.f7096p != null) {
                q5.this.f7096p.a(i10, j3, SystemClock.elapsedRealtime() - q5.this.X);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class i {
        private final Handler a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f7122b;

        /* loaded from: classes.dex */
        public class a extends AudioTrack.StreamEventCallback {
            final /* synthetic */ q5 a;

            public a(q5 q5Var) {
                this.a = q5Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                boolean z10;
                if (audioTrack == q5.this.f7099s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a1.b(z10);
                if (q5.this.f7096p != null && q5.this.S) {
                    q5.this.f7096p.a();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                boolean z10;
                if (audioTrack == q5.this.f7099s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a1.b(z10);
                if (q5.this.f7096p != null && q5.this.S) {
                    q5.this.f7096p.a();
                }
            }
        }

        public i() {
            this.f7122b = new a(q5.this);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.applovin.impl.uu] */
        public void a(AudioTrack audioTrack) {
            final Handler handler = this.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: com.applovin.impl.uu
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f7122b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f7122b);
            this.a.removeCallbacksAndMessages(null);
        }
    }

    public q5(m1 m1Var, b bVar, boolean z10, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        int i11;
        this.a = m1Var;
        this.f7082b = (b) a1.a(bVar);
        int i12 = yp.a;
        if (i12 >= 21 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f7083c = z12;
        if (i12 >= 23 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f7091k = z13;
        if (i12 >= 29) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        this.f7092l = i11;
        this.f7088h = new ConditionVariable(true);
        this.f7089i = new t1(new h(this, null));
        b3 b3Var = new b3();
        this.f7084d = b3Var;
        ap apVar = new ap();
        this.f7085e = apVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ri(), b3Var, apVar);
        Collections.addAll(arrayList, bVar.a());
        this.f7086f = (o1[]) arrayList.toArray(new o1[0]);
        this.f7087g = new o1[]{new a9()};
        this.H = 1.0f;
        this.f7100t = k1.f5582g;
        this.U = 0;
        this.V = new u1(0, 0.0f);
        mh mhVar = mh.f6271d;
        this.f7101v = new f(mhVar, false, 0L, 0L, null);
        this.f7102w = mhVar;
        this.P = -1;
        this.I = new o1[0];
        this.J = new ByteBuffer[0];
        this.f7090j = new ArrayDeque();
        this.f7094n = new g(100L);
        this.f7095o = new g(100L);
    }

    private AudioTrack k() {
        try {
            return ((c) a1.a(this.f7098r)).a(this.W, this.f7100t, this.U);
        } catch (q1.b e2) {
            u();
            q1.c cVar = this.f7096p;
            if (cVar != null) {
                cVar.a(e2);
            }
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean l() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.P
            com.applovin.impl.o1[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.d(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.P
            int r0 = r0 + r1
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q5.l():boolean");
    }

    private void m() {
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.I;
            if (i10 < o1VarArr.length) {
                o1 o1Var = o1VarArr[i10];
                o1Var.b();
                this.J[i10] = o1Var.d();
                i10++;
            } else {
                return;
            }
        }
    }

    private mh n() {
        return o().a;
    }

    private f o() {
        f fVar = this.u;
        if (fVar == null) {
            if (!this.f7090j.isEmpty()) {
                return (f) this.f7090j.getLast();
            }
            return this.f7101v;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        if (this.f7098r.f7108c == 0) {
            return this.f7105z / r0.f7107b;
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        if (this.f7098r.f7108c == 0) {
            return this.B / r0.f7109d;
        }
        return this.C;
    }

    private void s() {
        boolean z10;
        this.f7088h.block();
        AudioTrack k10 = k();
        this.f7099s = k10;
        if (a(k10)) {
            b(this.f7099s);
            if (this.f7092l != 3) {
                AudioTrack audioTrack = this.f7099s;
                d9 d9Var = this.f7098r.a;
                audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
            }
        }
        this.U = this.f7099s.getAudioSessionId();
        t1 t1Var = this.f7089i;
        AudioTrack audioTrack2 = this.f7099s;
        c cVar = this.f7098r;
        if (cVar.f7108c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1Var.a(audioTrack2, z10, cVar.f7112g, cVar.f7109d, cVar.f7113h);
        x();
        int i10 = this.V.a;
        if (i10 != 0) {
            this.f7099s.attachAuxEffect(i10);
            this.f7099s.setAuxEffectSendLevel(this.V.f8323b);
        }
        this.F = true;
    }

    private boolean t() {
        return this.f7099s != null;
    }

    private void u() {
        if (!this.f7098r.b()) {
            return;
        }
        this.Y = true;
    }

    private void v() {
        if (!this.R) {
            this.R = true;
            this.f7089i.d(r());
            this.f7099s.stop();
            this.f7104y = 0;
        }
    }

    private void w() {
        this.f7105z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.f7101v = new f(n(), p(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.f7090j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f7103x = null;
        this.f7104y = 0;
        this.f7085e.k();
        m();
    }

    private void x() {
        if (t()) {
            if (yp.a >= 21) {
                a(this.f7099s, this.H);
            } else {
                b(this.f7099s, this.H);
            }
        }
    }

    private void y() {
        o1[] o1VarArr = this.f7098r.f7114i;
        ArrayList arrayList = new ArrayList();
        for (o1 o1Var : o1VarArr) {
            if (o1Var.f()) {
                arrayList.add(o1Var);
            } else {
                o1Var.b();
            }
        }
        int size = arrayList.size();
        this.I = (o1[]) arrayList.toArray(new o1[size]);
        this.J = new ByteBuffer[size];
        m();
    }

    private boolean z() {
        if (!this.W && MimeTypes.AUDIO_RAW.equals(this.f7098r.a.f4228m) && !f(this.f7098r.a.B)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.q1
    public void h() {
        boolean z10;
        if (yp.a < 25) {
            b();
            return;
        }
        this.f7095o.a();
        this.f7094n.a();
        if (!t()) {
            return;
        }
        w();
        if (this.f7089i.d()) {
            this.f7099s.pause();
        }
        this.f7099s.flush();
        this.f7089i.g();
        t1 t1Var = this.f7089i;
        AudioTrack audioTrack = this.f7099s;
        c cVar = this.f7098r;
        if (cVar.f7108c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        t1Var.a(audioTrack, z10, cVar.f7112g, cVar.f7109d, cVar.f7113h);
        this.F = true;
    }

    @Override // com.applovin.impl.q1
    public void i() {
        this.E = true;
    }

    @Override // com.applovin.impl.q1
    public void j() {
        this.S = true;
        if (t()) {
            this.f7089i.i();
            this.f7099s.play();
        }
    }

    public boolean p() {
        return o().f7117b;
    }

    @Override // com.applovin.impl.q1
    public void pause() {
        this.S = false;
        if (t() && this.f7089i.f()) {
            this.f7099s.pause();
        }
    }

    @Override // com.applovin.impl.q1
    public void reset() {
        b();
        for (o1 o1Var : this.f7086f) {
            o1Var.reset();
        }
        for (o1 o1Var2 : this.f7087g) {
            o1Var2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    private long c(long j3) {
        return j3 + this.f7098r.b(this.f7082b.b());
    }

    private static boolean e(int i10) {
        return (yp.a >= 24 && i10 == -6) || i10 == -32;
    }

    @Override // com.applovin.impl.q1
    public void d() {
        if (this.W) {
            this.W = false;
            b();
        }
    }

    @Override // com.applovin.impl.q1
    public void f() {
        if (!this.Q && t() && l()) {
            v();
            this.Q = true;
        }
    }

    @Override // com.applovin.impl.q1
    public boolean g() {
        return t() && this.f7089i.e(r());
    }

    private void a(long j3) {
        mh mhVar;
        if (z()) {
            mhVar = this.f7082b.a(n());
        } else {
            mhVar = mh.f6271d;
        }
        mh mhVar2 = mhVar;
        boolean a10 = z() ? this.f7082b.a(p()) : false;
        this.f7090j.add(new f(mhVar2, a10, Math.max(0L, j3), this.f7098r.b(r()), null));
        y();
        q1.c cVar = this.f7096p;
        if (cVar != null) {
            cVar.a(a10);
        }
    }

    private long b(long j3) {
        while (!this.f7090j.isEmpty() && j3 >= ((f) this.f7090j.getFirst()).f7119d) {
            this.f7101v = (f) this.f7090j.remove();
        }
        f fVar = this.f7101v;
        long j10 = j3 - fVar.f7119d;
        if (fVar.a.equals(mh.f6271d)) {
            return this.f7101v.f7118c + j10;
        }
        if (this.f7090j.isEmpty()) {
            return this.f7101v.f7118c + this.f7082b.a(j10);
        }
        f fVar2 = (f) this.f7090j.getFirst();
        return fVar2.f7118c - yp.a(fVar2.f7119d - j3, this.f7101v.a.a);
    }

    @Override // com.applovin.impl.q1
    public void e() {
        a1.b(yp.a >= 21);
        a1.b(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        b();
    }

    @Override // com.applovin.impl.q1
    public boolean c() {
        return !t() || (this.Q && !g());
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final mh a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7117b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7118c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7119d;

        private f(mh mhVar, boolean z10, long j3, long j10) {
            this.a = mhVar;
            this.f7117b = z10;
            this.f7118c = j3;
            this.f7119d = j10;
        }

        public /* synthetic */ f(mh mhVar, boolean z10, long j3, long j10, a aVar) {
            this(mhVar, z10, j3, j10);
        }
    }

    private static int c(int i10) {
        int i11 = yp.a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(yp.f9253b) && i10 == 1) {
            i10 = 2;
        }
        return yp.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    private boolean f(int i10) {
        return this.f7083c && yp.f(i10);
    }

    private void d(long j3) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = o1.a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j3);
            } else {
                o1 o1Var = this.I[i10];
                if (i10 > this.P) {
                    o1Var.a(byteBuffer);
                }
                ByteBuffer d10 = o1Var.d();
                this.J[i10] = d10;
                if (d10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @Override // com.applovin.impl.q1
    public void a(d9 d9Var, int i10, int[] iArr) {
        int i11;
        o1[] o1VarArr;
        int intValue;
        int i12;
        int i13;
        int intValue2;
        int i14;
        o1[] o1VarArr2;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(d9Var.f4228m)) {
            a1.a(yp.g(d9Var.B));
            int b3 = yp.b(d9Var.B, d9Var.f4240z);
            if (f(d9Var.B)) {
                o1VarArr2 = this.f7087g;
            } else {
                o1VarArr2 = this.f7086f;
            }
            this.f7085e.a(d9Var.C, d9Var.D);
            if (yp.a < 21 && d9Var.f4240z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i15 = 0; i15 < 6; i15++) {
                    iArr2[i15] = i15;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7084d.a(iArr2);
            o1.a aVar = new o1.a(d9Var.A, d9Var.f4240z, d9Var.B);
            for (o1 o1Var : o1VarArr2) {
                try {
                    o1.a a10 = o1Var.a(aVar);
                    if (o1Var.f()) {
                        aVar = a10;
                    }
                } catch (o1.b e2) {
                    throw new q1.a(e2, d9Var);
                }
            }
            int i16 = aVar.f6449c;
            i12 = aVar.a;
            intValue2 = yp.a(aVar.f6448b);
            o1VarArr = o1VarArr2;
            intValue = i16;
            i13 = b3;
            i11 = yp.b(i16, aVar.f6448b);
            i14 = 0;
        } else {
            o1[] o1VarArr3 = new o1[0];
            int i17 = d9Var.A;
            i11 = -1;
            if (a(d9Var, this.f7100t)) {
                o1VarArr = o1VarArr3;
                intValue = df.b((String) a1.a((Object) d9Var.f4228m), d9Var.f4225j);
                i14 = 1;
                intValue2 = yp.a(d9Var.f4240z);
                i12 = i17;
                i13 = -1;
            } else {
                Pair a11 = a(d9Var, this.a);
                if (a11 != null) {
                    o1VarArr = o1VarArr3;
                    intValue = ((Integer) a11.first).intValue();
                    i12 = i17;
                    i13 = -1;
                    intValue2 = ((Integer) a11.second).intValue();
                    i14 = 2;
                } else {
                    throw new q1.a("Unable to configure passthrough for: " + d9Var, d9Var);
                }
            }
        }
        if (intValue == 0) {
            throw new q1.a("Invalid output encoding (mode=" + i14 + ") for: " + d9Var, d9Var);
        }
        if (intValue2 != 0) {
            this.Y = false;
            c cVar = new c(d9Var, i13, i14, i11, i12, intValue2, intValue, i10, this.f7091k, o1VarArr);
            if (t()) {
                this.f7097q = cVar;
                return;
            } else {
                this.f7098r = cVar;
                return;
            }
        }
        throw new q1.a("Invalid output channel config (mode=" + i14 + ") for: " + d9Var, d9Var);
    }

    @Override // com.applovin.impl.q1
    public void b() {
        if (t()) {
            w();
            if (this.f7089i.d()) {
                this.f7099s.pause();
            }
            if (a(this.f7099s)) {
                ((i) a1.a(this.f7093m)).b(this.f7099s);
            }
            AudioTrack audioTrack = this.f7099s;
            this.f7099s = null;
            if (yp.a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f7097q;
            if (cVar != null) {
                this.f7098r = cVar;
                this.f7097q = null;
            }
            this.f7089i.g();
            this.f7088h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f7095o.a();
        this.f7094n.a();
    }

    @Override // com.applovin.impl.q1
    public int b(d9 d9Var) {
        if (!MimeTypes.AUDIO_RAW.equals(d9Var.f4228m)) {
            return ((this.Y || !a(d9Var, this.f7100t)) && !b(d9Var, this.a)) ? 0 : 2;
        }
        if (!yp.g(d9Var.B)) {
            kc.d("DefaultAudioSink", "Invalid PCM encoding: " + d9Var.B);
            return 0;
        }
        int i10 = d9Var.B;
        return (i10 == 2 || (this.f7083c && i10 == 4)) ? 2 : 1;
    }

    private static boolean b(d9 d9Var, m1 m1Var) {
        return a(d9Var, m1Var) != null;
    }

    private void b(AudioTrack audioTrack) {
        if (this.f7093m == null) {
            this.f7093m = new i();
        }
        this.f7093m.a(audioTrack);
    }

    private void b(mh mhVar) {
        if (t()) {
            try {
                this.f7099s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(mhVar.a).setPitch(mhVar.f6273b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                kc.c("DefaultAudioSink", "Failed to set playback params", e2);
            }
            mhVar = new mh(this.f7099s.getPlaybackParams().getSpeed(), this.f7099s.getPlaybackParams().getPitch());
            this.f7089i.a(mhVar.a);
        }
        this.f7102w = mhVar;
    }

    @Override // com.applovin.impl.q1
    public long a(boolean z10) {
        if (!t() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.f7089i.a(z10), this.f7098r.b(r()))));
    }

    private static Pair a(d9 d9Var, m1 m1Var) {
        if (m1Var == null) {
            return null;
        }
        int b3 = df.b((String) a1.a((Object) d9Var.f4228m), d9Var.f4225j);
        int i10 = 6;
        if (b3 != 5 && b3 != 6 && b3 != 18 && b3 != 17 && b3 != 7 && b3 != 8 && b3 != 14) {
            return null;
        }
        if (b3 == 18 && !m1Var.a(18)) {
            b3 = 6;
        } else if (b3 == 8 && !m1Var.a(8)) {
            b3 = 7;
        }
        if (!m1Var.a(b3)) {
            return null;
        }
        if (b3 == 18) {
            if (yp.a >= 29 && (i10 = a(18, d9Var.A)) == 0) {
                kc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i10 = d9Var.f4240z;
            if (i10 > m1Var.c()) {
                return null;
            }
        }
        int c10 = c(i10);
        if (c10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b3), Integer.valueOf(c10));
    }

    @Override // com.applovin.impl.q1
    public void b(boolean z10) {
        a(n(), z10);
    }

    private static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private static int a(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return k.b(byteBuffer);
            case 7:
            case 8:
                return d7.a(byteBuffer);
            case 9:
                int d10 = of.d(yp.a(byteBuffer, byteBuffer.position()));
                if (d10 != -1) {
                    return d10;
                }
                throw new IllegalArgumentException();
            case 10:
                return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException(eb.j.i("Unexpected audio encoding: ", i10));
            case 14:
                int a10 = k.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return k.a(byteBuffer, a10) * 16;
            case 15:
                return 512;
            case 16:
                return LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            case 17:
                return n.a(byteBuffer);
        }
    }

    @Override // com.applovin.impl.q1
    public mh a() {
        if (this.f7091k) {
            return this.f7102w;
        }
        return n();
    }

    @Override // com.applovin.impl.q1
    public boolean a(ByteBuffer byteBuffer, long j3, int i10) {
        ByteBuffer byteBuffer2 = this.K;
        a1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7097q != null) {
            if (!l()) {
                return false;
            }
            if (!this.f7097q.a(this.f7098r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.f7098r = this.f7097q;
                this.f7097q = null;
                if (a(this.f7099s) && this.f7092l != 3) {
                    this.f7099s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f7099s;
                    d9 d9Var = this.f7098r.a;
                    audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
                    this.Z = true;
                }
            }
            a(j3);
        }
        if (!t()) {
            try {
                s();
            } catch (q1.b e2) {
                if (!e2.f7065b) {
                    this.f7094n.a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.f7094n.a();
        if (this.F) {
            this.G = Math.max(0L, j3);
            this.E = false;
            this.F = false;
            if (this.f7091k && yp.a >= 23) {
                b(this.f7102w);
            }
            a(j3);
            if (this.S) {
                j();
            }
        }
        if (!this.f7089i.g(r())) {
            return false;
        }
        if (this.K == null) {
            a1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f7098r;
            if (cVar.f7108c != 0 && this.D == 0) {
                int a10 = a(cVar.f7112g, byteBuffer);
                this.D = a10;
                if (a10 == 0) {
                    return true;
                }
            }
            if (this.u != null) {
                if (!l()) {
                    return false;
                }
                a(j3);
                this.u = null;
            }
            long d10 = this.G + this.f7098r.d(q() - this.f7085e.j());
            if (!this.E && Math.abs(d10 - j3) > 200000) {
                this.f7096p.a(new q1.d(j3, d10));
                this.E = true;
            }
            if (this.E) {
                if (!l()) {
                    return false;
                }
                long j10 = j3 - d10;
                this.G += j10;
                this.E = false;
                a(j3);
                q1.c cVar2 = this.f7096p;
                if (cVar2 != null && j10 != 0) {
                    cVar2.b();
                }
            }
            if (this.f7098r.f7108c == 0) {
                this.f7105z += byteBuffer.remaining();
            } else {
                this.A += this.D * i10;
            }
            this.K = byteBuffer;
            this.L = i10;
        }
        d(j3);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.f7089i.f(r())) {
            return false;
        }
        kc.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.applovin.impl.q1
    public void a(k1 k1Var) {
        if (this.f7100t.equals(k1Var)) {
            return;
        }
        this.f7100t = k1Var;
        if (this.W) {
            return;
        }
        b();
    }

    private void a(mh mhVar, boolean z10) {
        f o10 = o();
        if (mhVar.equals(o10.a) && z10 == o10.f7117b) {
            return;
        }
        f fVar = new f(mhVar, z10, C.TIME_UNSET, C.TIME_UNSET, null);
        if (t()) {
            this.u = fVar;
        } else {
            this.f7101v = fVar;
        }
    }

    @Override // com.applovin.impl.q1
    public void a(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            b();
        }
    }

    @Override // com.applovin.impl.q1
    public void a(u1 u1Var) {
        if (this.V.equals(u1Var)) {
            return;
        }
        int i10 = u1Var.a;
        float f10 = u1Var.f8323b;
        AudioTrack audioTrack = this.f7099s;
        if (audioTrack != null) {
            if (this.V.a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f7099s.setAuxEffectSendLevel(f10);
            }
        }
        this.V = u1Var;
    }

    @Override // com.applovin.impl.q1
    public void a(q1.c cVar) {
        this.f7096p = cVar;
    }

    @Override // com.applovin.impl.q1
    public void a(mh mhVar) {
        mh mhVar2 = new mh(yp.a(mhVar.a, 0.1f, 8.0f), yp.a(mhVar.f6273b, 0.1f, 8.0f));
        if (this.f7091k && yp.a >= 23) {
            b(mhVar2);
        } else {
            a(mhVar2, p());
        }
    }

    @Override // com.applovin.impl.q1
    public void a(float f10) {
        if (this.H != f10) {
            this.H = f10;
            x();
        }
    }

    private static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    @Override // com.applovin.impl.q1
    public boolean a(d9 d9Var) {
        return b(d9Var) != 0;
    }

    private void a(ByteBuffer byteBuffer, long j3) {
        int a10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                a1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (yp.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < remaining) {
                        this.N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.N, 0, remaining);
                    byteBuffer.position(position);
                    this.O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (yp.a < 21) {
                int b3 = this.f7089i.b(this.B);
                if (b3 > 0) {
                    a10 = this.f7099s.write(this.N, this.O, Math.min(remaining2, b3));
                    if (a10 > 0) {
                        this.O += a10;
                        byteBuffer.position(byteBuffer.position() + a10);
                    }
                } else {
                    a10 = 0;
                }
            } else if (this.W) {
                a1.b(j3 != C.TIME_UNSET);
                a10 = a(this.f7099s, byteBuffer, remaining2, j3);
            } else {
                a10 = a(this.f7099s, byteBuffer, remaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (a10 < 0) {
                boolean e2 = e(a10);
                if (e2) {
                    u();
                }
                q1.e eVar = new q1.e(a10, this.f7098r.a, e2);
                q1.c cVar = this.f7096p;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.f7068b) {
                    this.f7095o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f7095o.a();
            if (a(this.f7099s)) {
                long j10 = this.C;
                if (j10 > 0) {
                    this.Z = false;
                }
                if (this.S && this.f7096p != null && a10 < remaining2 && !this.Z) {
                    this.f7096p.b(this.f7089i.c(j10));
                }
            }
            int i10 = this.f7098r.f7108c;
            if (i10 == 0) {
                this.B += a10;
            }
            if (a10 == remaining2) {
                if (i10 != 0) {
                    a1.b(byteBuffer == this.K);
                    this.C += this.D * this.L;
                }
                this.M = null;
            }
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private static int a(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(yp.a(i12)).build(), build);
            if (isDirectPlaybackSupported) {
                return i12;
            }
        }
        return 0;
    }

    private boolean a(d9 d9Var, k1 k1Var) {
        int b3;
        int a10;
        int a11;
        if (yp.a < 29 || this.f7092l == 0 || (b3 = df.b((String) a1.a((Object) d9Var.f4228m), d9Var.f4225j)) == 0 || (a10 = yp.a(d9Var.f4240z)) == 0 || (a11 = a(b(d9Var.A, a10, b3), k1Var.a())) == 0) {
            return false;
        }
        if (a11 == 1) {
            return ((d9Var.C != 0 || d9Var.D != 0) && (this.f7092l == 1)) ? false : true;
        }
        if (a11 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i10 = yp.a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i10 == 30 && yp.f9255d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (yp.a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j3) {
        if (yp.a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j3 * 1000);
        }
        if (this.f7103x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f7103x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f7103x.putInt(1431633921);
        }
        if (this.f7104y == 0) {
            this.f7103x.putInt(4, i10);
            this.f7103x.putLong(8, j3 * 1000);
            this.f7103x.position(0);
            this.f7104y = i10;
        }
        int remaining = this.f7103x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f7103x, remaining, 1);
            if (write < 0) {
                this.f7104y = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int a10 = a(audioTrack, byteBuffer, i10);
        if (a10 < 0) {
            this.f7104y = 0;
            return a10;
        }
        this.f7104y -= a10;
        return a10;
    }
}
