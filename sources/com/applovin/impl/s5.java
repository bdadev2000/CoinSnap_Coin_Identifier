package com.applovin.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.p1;
import com.applovin.impl.r1;
import com.applovin.impl.u1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class s5 implements r1 {

    /* renamed from: a0, reason: collision with root package name */
    public static boolean f26416a0;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private p1[] I;
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
    private v1 V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private final n1 f26417a;

    /* renamed from: b, reason: collision with root package name */
    private final b f26418b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26419c;
    private final d3 d;
    private final zo e;

    /* renamed from: f, reason: collision with root package name */
    private final p1[] f26420f;

    /* renamed from: g, reason: collision with root package name */
    private final p1[] f26421g;

    /* renamed from: h, reason: collision with root package name */
    private final ConditionVariable f26422h;

    /* renamed from: i, reason: collision with root package name */
    private final u1 f26423i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque f26424j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f26425k;

    /* renamed from: l, reason: collision with root package name */
    private final int f26426l;

    /* renamed from: m, reason: collision with root package name */
    private i f26427m;

    /* renamed from: n, reason: collision with root package name */
    private final g f26428n;

    /* renamed from: o, reason: collision with root package name */
    private final g f26429o;

    /* renamed from: p, reason: collision with root package name */
    private r1.c f26430p;

    /* renamed from: q, reason: collision with root package name */
    private c f26431q;

    /* renamed from: r, reason: collision with root package name */
    private c f26432r;

    /* renamed from: s, reason: collision with root package name */
    private AudioTrack f26433s;

    /* renamed from: t, reason: collision with root package name */
    private l1 f26434t;

    /* renamed from: u, reason: collision with root package name */
    private f f26435u;

    /* renamed from: v, reason: collision with root package name */
    private f f26436v;
    private ph w;
    private ByteBuffer x;

    /* renamed from: y, reason: collision with root package name */
    private int f26437y;

    /* renamed from: z, reason: collision with root package name */
    private long f26438z;

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioTrack f26439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f26439a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f26439a.flush();
                this.f26439a.release();
            } finally {
                s5.this.f26422h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        long a(long j2);

        ph a(ph phVar);

        boolean a(boolean z2);

        p1[] a();

        long b();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final f9 f26441a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26442b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26443c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26444f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26445g;

        /* renamed from: h, reason: collision with root package name */
        public final int f26446h;

        /* renamed from: i, reason: collision with root package name */
        public final p1[] f26447i;

        public c(f9 f9Var, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, p1[] p1VarArr) {
            this.f26441a = f9Var;
            this.f26442b = i2;
            this.f26443c = i3;
            this.d = i4;
            this.e = i5;
            this.f26444f = i6;
            this.f26445g = i7;
            this.f26447i = p1VarArr;
            this.f26446h = a(i8, z2);
        }

        private int c(long j2) {
            int d = s5.d(this.f26445g);
            if (this.f26445g == 5) {
                d *= 2;
            }
            return (int) ((j2 * d) / 1000000);
        }

        private AudioTrack d(boolean z2, l1 l1Var, int i2) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(a(l1Var, z2)).setAudioFormat(s5.b(this.e, this.f26444f, this.f26445g)).setTransferMode(1).setBufferSizeInBytes(this.f26446h).setSessionId(i2).setOffloadedPlayback(this.f26443c == 1);
            return offloadedPlayback.build();
        }

        public AudioTrack a(boolean z2, l1 l1Var, int i2) {
            try {
                AudioTrack b2 = b(z2, l1Var, i2);
                int state = b2.getState();
                if (state == 1) {
                    return b2;
                }
                try {
                    b2.release();
                } catch (Exception unused) {
                }
                throw new r1.b(state, this.e, this.f26444f, this.f26446h, this.f26441a, b(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new r1.b(0, this.e, this.f26444f, this.f26446h, this.f26441a, b(), e);
            }
        }

        public boolean b() {
            return this.f26443c == 1;
        }

        public long b(long j2) {
            return (j2 * 1000000) / this.e;
        }

        private AudioTrack b(boolean z2, l1 l1Var, int i2) {
            int i3 = xp.f27962a;
            if (i3 >= 29) {
                return d(z2, l1Var, i2);
            }
            if (i3 >= 21) {
                return c(z2, l1Var, i2);
            }
            return a(l1Var, i2);
        }

        private AudioTrack c(boolean z2, l1 l1Var, int i2) {
            return new AudioTrack(a(l1Var, z2), s5.b(this.e, this.f26444f, this.f26445g), this.f26446h, 1, i2);
        }

        public boolean a(c cVar) {
            return cVar.f26443c == this.f26443c && cVar.f26445g == this.f26445g && cVar.e == this.e && cVar.f26444f == this.f26444f && cVar.d == this.d;
        }

        private int a(int i2, boolean z2) {
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.f26443c;
            if (i3 == 0) {
                return a(z2 ? 8.0f : 1.0f);
            }
            if (i3 == 1) {
                return c(50000000L);
            }
            if (i3 == 2) {
                return c(250000L);
            }
            throw new IllegalStateException();
        }

        public long d(long j2) {
            return (j2 * 1000000) / this.f26441a.A;
        }

        private AudioTrack a(l1 l1Var, int i2) {
            int e = xp.e(l1Var.f24971c);
            if (i2 == 0) {
                return new AudioTrack(e, this.e, this.f26444f, this.f26445g, this.f26446h, 1);
            }
            return new AudioTrack(e, this.e, this.f26444f, this.f26445g, this.f26446h, 1, i2);
        }

        public long a(long j2) {
            return (j2 * this.e) / 1000000;
        }

        private static AudioAttributes a(l1 l1Var, boolean z2) {
            if (z2) {
                return a();
            }
            return l1Var.a();
        }

        private int a(float f2) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f26444f, this.f26445g);
            b1.b(minBufferSize != -2);
            int a2 = xp.a(minBufferSize * 4, ((int) a(250000L)) * this.d, Math.max(minBufferSize, ((int) a(750000L)) * this.d));
            return f2 != 1.0f ? Math.round(a2 * f2) : a2;
        }

        private static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final p1[] f26448a;

        /* renamed from: b, reason: collision with root package name */
        private final ak f26449b;

        /* renamed from: c, reason: collision with root package name */
        private final ok f26450c;

        public d(p1... p1VarArr) {
            this(p1VarArr, new ak(), new ok());
        }

        @Override // com.applovin.impl.s5.b
        public p1[] a() {
            return this.f26448a;
        }

        @Override // com.applovin.impl.s5.b
        public long b() {
            return this.f26449b.j();
        }

        public d(p1[] p1VarArr, ak akVar, ok okVar) {
            p1[] p1VarArr2 = new p1[p1VarArr.length + 2];
            this.f26448a = p1VarArr2;
            System.arraycopy(p1VarArr, 0, p1VarArr2, 0, p1VarArr.length);
            this.f26449b = akVar;
            this.f26450c = okVar;
            p1VarArr2[p1VarArr.length] = akVar;
            p1VarArr2[p1VarArr.length + 1] = okVar;
        }

        @Override // com.applovin.impl.s5.b
        public ph a(ph phVar) {
            this.f26450c.b(phVar.f26059a);
            this.f26450c.a(phVar.f26060b);
            return phVar;
        }

        @Override // com.applovin.impl.s5.b
        public boolean a(boolean z2) {
            this.f26449b.a(z2);
            return z2;
        }

        @Override // com.applovin.impl.s5.b
        public long a(long j2) {
            return this.f26450c.a(j2);
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
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final ph f26451a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26452b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26453c;
        public final long d;

        private f(ph phVar, boolean z2, long j2, long j3) {
            this.f26451a = phVar;
            this.f26452b = z2;
            this.f26453c = j2;
            this.d = j3;
        }

        public /* synthetic */ f(ph phVar, boolean z2, long j2, long j3, a aVar) {
            this(phVar, z2, j2, j3);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final long f26454a;

        /* renamed from: b, reason: collision with root package name */
        private Exception f26455b;

        /* renamed from: c, reason: collision with root package name */
        private long f26456c;

        public g(long j2) {
            this.f26454a = j2;
        }

        public void a() {
            this.f26455b = null;
        }

        public void a(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f26455b == null) {
                this.f26455b = exc;
                this.f26456c = this.f26454a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f26456c) {
                Exception exc2 = this.f26455b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f26455b;
                a();
                throw exc3;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h implements u1.a {
        private h() {
        }

        @Override // com.applovin.impl.u1.a
        public void a(long j2, long j3, long j4, long j5) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Spurious audio timestamp (frame position mismatch): ", j2, ", ");
            r2.append(j3);
            r2.append(", ");
            r2.append(j4);
            r2.append(", ");
            r2.append(j5);
            r2.append(", ");
            r2.append(s5.this.q());
            r2.append(", ");
            r2.append(s5.this.r());
            String sb = r2.toString();
            if (!s5.f26416a0) {
                pc.d("DefaultAudioSink", sb);
                return;
            }
            throw new e(sb, null);
        }

        @Override // com.applovin.impl.u1.a
        public void b(long j2, long j3, long j4, long j5) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Spurious audio timestamp (system clock mismatch): ", j2, ", ");
            r2.append(j3);
            r2.append(", ");
            r2.append(j4);
            r2.append(", ");
            r2.append(j5);
            r2.append(", ");
            r2.append(s5.this.q());
            r2.append(", ");
            r2.append(s5.this.r());
            String sb = r2.toString();
            if (!s5.f26416a0) {
                pc.d("DefaultAudioSink", sb);
                return;
            }
            throw new e(sb, null);
        }

        public /* synthetic */ h(s5 s5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.u1.a
        public void a(long j2) {
            if (s5.this.f26430p != null) {
                s5.this.f26430p.a(j2);
            }
        }

        @Override // com.applovin.impl.u1.a
        public void b(long j2) {
            pc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // com.applovin.impl.u1.a
        public void a(int i2, long j2) {
            if (s5.this.f26430p != null) {
                s5.this.f26430p.a(i2, j2, SystemClock.elapsedRealtime() - s5.this.X);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class i {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26458a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f26459b;

        /* loaded from: classes.dex */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s5 f26461a;

            public a(s5 s5Var) {
                this.f26461a = s5Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i2) {
                b1.b(audioTrack == s5.this.f26433s);
                if (s5.this.f26430p == null || !s5.this.S) {
                    return;
                }
                s5.this.f26430p.a();
            }

            public void onTearDown(AudioTrack audioTrack) {
                b1.b(audioTrack == s5.this.f26433s);
                if (s5.this.f26430p == null || !s5.this.S) {
                    return;
                }
                s5.this.f26430p.a();
            }
        }

        public i() {
            this.f26459b = new a(s5.this);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.applovin.impl.uv] */
        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f26458a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: com.applovin.impl.uv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f26459b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f26459b);
            this.f26458a.removeCallbacksAndMessages(null);
        }
    }

    public s5(n1 n1Var, b bVar, boolean z2, boolean z3, int i2) {
        this.f26417a = n1Var;
        this.f26418b = (b) b1.a(bVar);
        int i3 = xp.f27962a;
        this.f26419c = i3 >= 21 && z2;
        this.f26425k = i3 >= 23 && z3;
        this.f26426l = i3 >= 29 ? i2 : 0;
        this.f26422h = new ConditionVariable(true);
        this.f26423i = new u1(new h(this, null));
        d3 d3Var = new d3();
        this.d = d3Var;
        zo zoVar = new zo();
        this.e = zoVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new wi(), d3Var, zoVar);
        Collections.addAll(arrayList, bVar.a());
        this.f26420f = (p1[]) arrayList.toArray(new p1[0]);
        this.f26421g = new p1[]{new c9()};
        this.H = 1.0f;
        this.f26434t = l1.f24967g;
        this.U = 0;
        this.V = new v1(0, 0.0f);
        ph phVar = ph.d;
        this.f26436v = new f(phVar, false, 0L, 0L, null);
        this.w = phVar;
        this.P = -1;
        this.I = new p1[0];
        this.J = new ByteBuffer[0];
        this.f26424j = new ArrayDeque();
        this.f26428n = new g(100L);
        this.f26429o = new g(100L);
    }

    private AudioTrack k() {
        try {
            return ((c) b1.a(this.f26432r)).a(this.W, this.f26434t, this.U);
        } catch (r1.b e2) {
            u();
            r1.c cVar = this.f26430p;
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
            com.applovin.impl.p1[] r5 = r9.I
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.s5.l():boolean");
    }

    private void m() {
        int i2 = 0;
        while (true) {
            p1[] p1VarArr = this.I;
            if (i2 >= p1VarArr.length) {
                return;
            }
            p1 p1Var = p1VarArr[i2];
            p1Var.b();
            this.J[i2] = p1Var.d();
            i2++;
        }
    }

    private ph n() {
        return o().f26451a;
    }

    private f o() {
        f fVar = this.f26435u;
        return fVar != null ? fVar : !this.f26424j.isEmpty() ? (f) this.f26424j.getLast() : this.f26436v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        return this.f26432r.f26443c == 0 ? this.f26438z / r0.f26442b : this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return this.f26432r.f26443c == 0 ? this.B / r0.d : this.C;
    }

    private void s() {
        this.f26422h.block();
        AudioTrack k2 = k();
        this.f26433s = k2;
        if (a(k2)) {
            b(this.f26433s);
            if (this.f26426l != 3) {
                AudioTrack audioTrack = this.f26433s;
                f9 f9Var = this.f26432r.f26441a;
                audioTrack.setOffloadDelayPadding(f9Var.C, f9Var.D);
            }
        }
        this.U = this.f26433s.getAudioSessionId();
        u1 u1Var = this.f26423i;
        AudioTrack audioTrack2 = this.f26433s;
        c cVar = this.f26432r;
        u1Var.a(audioTrack2, cVar.f26443c == 2, cVar.f26445g, cVar.d, cVar.f26446h);
        x();
        int i2 = this.V.f27449a;
        if (i2 != 0) {
            this.f26433s.attachAuxEffect(i2);
            this.f26433s.setAuxEffectSendLevel(this.V.f27450b);
        }
        this.F = true;
    }

    private boolean t() {
        return this.f26433s != null;
    }

    private void u() {
        if (this.f26432r.b()) {
            this.Y = true;
        }
    }

    private void v() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.f26423i.d(r());
        this.f26433s.stop();
        this.f26437y = 0;
    }

    private void w() {
        this.f26438z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.f26436v = new f(n(), p(), 0L, 0L, null);
        this.G = 0L;
        this.f26435u = null;
        this.f26424j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.f26437y = 0;
        this.e.k();
        m();
    }

    private void x() {
        if (t()) {
            if (xp.f27962a >= 21) {
                a(this.f26433s, this.H);
            } else {
                b(this.f26433s, this.H);
            }
        }
    }

    private void y() {
        p1[] p1VarArr = this.f26432r.f26447i;
        ArrayList arrayList = new ArrayList();
        for (p1 p1Var : p1VarArr) {
            if (p1Var.f()) {
                arrayList.add(p1Var);
            } else {
                p1Var.b();
            }
        }
        int size = arrayList.size();
        this.I = (p1[]) arrayList.toArray(new p1[size]);
        this.J = new ByteBuffer[size];
        m();
    }

    private boolean z() {
        return (this.W || !"audio/raw".equals(this.f26432r.f26441a.f23840m) || f(this.f26432r.f26441a.B)) ? false : true;
    }

    @Override // com.applovin.impl.r1
    public void a(r1.c cVar) {
        this.f26430p = cVar;
    }

    @Override // com.applovin.impl.r1
    public void h() {
        if (xp.f27962a < 25) {
            b();
            return;
        }
        this.f26429o.a();
        this.f26428n.a();
        if (t()) {
            w();
            if (this.f26423i.d()) {
                this.f26433s.pause();
            }
            this.f26433s.flush();
            this.f26423i.g();
            u1 u1Var = this.f26423i;
            AudioTrack audioTrack = this.f26433s;
            c cVar = this.f26432r;
            u1Var.a(audioTrack, cVar.f26443c == 2, cVar.f26445g, cVar.d, cVar.f26446h);
            this.F = true;
        }
    }

    @Override // com.applovin.impl.r1
    public void i() {
        this.E = true;
    }

    @Override // com.applovin.impl.r1
    public void j() {
        this.S = true;
        if (t()) {
            this.f26423i.i();
            this.f26433s.play();
        }
    }

    public boolean p() {
        return o().f26452b;
    }

    @Override // com.applovin.impl.r1
    public void pause() {
        this.S = false;
        if (t() && this.f26423i.f()) {
            this.f26433s.pause();
        }
    }

    @Override // com.applovin.impl.r1
    public void reset() {
        b();
        for (p1 p1Var : this.f26420f) {
            p1Var.reset();
        }
        for (p1 p1Var2 : this.f26421g) {
            p1Var2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    private long c(long j2) {
        return j2 + this.f26432r.b(this.f26418b.b());
    }

    private static boolean e(int i2) {
        return (xp.f27962a >= 24 && i2 == -6) || i2 == -32;
    }

    @Override // com.applovin.impl.r1
    public void d() {
        if (this.W) {
            this.W = false;
            b();
        }
    }

    @Override // com.applovin.impl.r1
    public void f() {
        if (!this.Q && t() && l()) {
            v();
            this.Q = true;
        }
    }

    @Override // com.applovin.impl.r1
    public boolean g() {
        return t() && this.f26423i.e(r());
    }

    private long b(long j2) {
        while (!this.f26424j.isEmpty() && j2 >= ((f) this.f26424j.getFirst()).d) {
            this.f26436v = (f) this.f26424j.remove();
        }
        f fVar = this.f26436v;
        long j3 = j2 - fVar.d;
        if (fVar.f26451a.equals(ph.d)) {
            return this.f26436v.f26453c + j3;
        }
        if (this.f26424j.isEmpty()) {
            return this.f26436v.f26453c + this.f26418b.a(j3);
        }
        f fVar2 = (f) this.f26424j.getFirst();
        return fVar2.f26453c - xp.a(fVar2.d - j2, this.f26436v.f26451a.f26059a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i2) {
        switch (i2) {
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
                return 100000;
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

    @Override // com.applovin.impl.r1
    public boolean c() {
        return !t() || (this.Q && !g());
    }

    @Override // com.applovin.impl.r1
    public void e() {
        b1.b(xp.f27962a >= 21);
        b1.b(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        b();
    }

    private void a(long j2) {
        ph phVar;
        if (z()) {
            phVar = this.f26418b.a(n());
        } else {
            phVar = ph.d;
        }
        ph phVar2 = phVar;
        boolean a2 = z() ? this.f26418b.a(p()) : false;
        this.f26424j.add(new f(phVar2, a2, Math.max(0L, j2), this.f26432r.b(r()), null));
        y();
        r1.c cVar = this.f26430p;
        if (cVar != null) {
            cVar.a(a2);
        }
    }

    private static int c(int i2) {
        int i3 = xp.f27962a;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(xp.f27963b) && i2 == 1) {
            i2 = 2;
        }
        return xp.a(i2);
    }

    private void d(long j2) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.J[i2 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = p1.f25953a;
                }
            }
            if (i2 == length) {
                a(byteBuffer, j2);
            } else {
                p1 p1Var = this.I[i2];
                if (i2 > this.P) {
                    p1Var.a(byteBuffer);
                }
                ByteBuffer d2 = p1Var.d();
                this.J[i2] = d2;
                if (d2.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private boolean f(int i2) {
        return this.f26419c && xp.f(i2);
    }

    @Override // com.applovin.impl.r1
    public void a(f9 f9Var, int i2, int[] iArr) {
        int i3;
        p1[] p1VarArr;
        int intValue;
        int i4;
        int i5;
        int intValue2;
        int i6;
        int[] iArr2;
        if ("audio/raw".equals(f9Var.f23840m)) {
            b1.a(xp.g(f9Var.B));
            int b2 = xp.b(f9Var.B, f9Var.f23851z);
            p1[] p1VarArr2 = f(f9Var.B) ? this.f26421g : this.f26420f;
            this.e.a(f9Var.C, f9Var.D);
            if (xp.f27962a < 21 && f9Var.f23851z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.a(iArr2);
            p1.a aVar = new p1.a(f9Var.A, f9Var.f23851z, f9Var.B);
            for (p1 p1Var : p1VarArr2) {
                try {
                    p1.a a2 = p1Var.a(aVar);
                    if (p1Var.f()) {
                        aVar = a2;
                    }
                } catch (p1.b e2) {
                    throw new r1.a(e2, f9Var);
                }
            }
            int i8 = aVar.f25956c;
            i4 = aVar.f25954a;
            intValue2 = xp.a(aVar.f25955b);
            p1VarArr = p1VarArr2;
            intValue = i8;
            i5 = b2;
            i3 = xp.b(i8, aVar.f25955b);
            i6 = 0;
        } else {
            p1[] p1VarArr3 = new p1[0];
            int i9 = f9Var.A;
            i3 = -1;
            if (a(f9Var, this.f26434t)) {
                p1VarArr = p1VarArr3;
                intValue = Cif.b((String) b1.a((Object) f9Var.f23840m), f9Var.f23837j);
                i6 = 1;
                intValue2 = xp.a(f9Var.f23851z);
                i4 = i9;
                i5 = -1;
            } else {
                Pair a3 = a(f9Var, this.f26417a);
                if (a3 != null) {
                    p1VarArr = p1VarArr3;
                    intValue = ((Integer) a3.first).intValue();
                    i4 = i9;
                    i5 = -1;
                    intValue2 = ((Integer) a3.second).intValue();
                    i6 = 2;
                } else {
                    throw new r1.a("Unable to configure passthrough for: " + f9Var, f9Var);
                }
            }
        }
        if (intValue == 0) {
            throw new r1.a("Invalid output encoding (mode=" + i6 + ") for: " + f9Var, f9Var);
        }
        if (intValue2 != 0) {
            this.Y = false;
            c cVar = new c(f9Var, i5, i6, i3, i4, intValue2, intValue, i2, this.f26425k, p1VarArr);
            if (t()) {
                this.f26431q = cVar;
                return;
            } else {
                this.f26432r = cVar;
                return;
            }
        }
        throw new r1.a("Invalid output channel config (mode=" + i6 + ") for: " + f9Var, f9Var);
    }

    @Override // com.applovin.impl.r1
    public void b() {
        if (t()) {
            w();
            if (this.f26423i.d()) {
                this.f26433s.pause();
            }
            if (a(this.f26433s)) {
                ((i) b1.a(this.f26427m)).b(this.f26433s);
            }
            AudioTrack audioTrack = this.f26433s;
            this.f26433s = null;
            if (xp.f27962a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f26431q;
            if (cVar != null) {
                this.f26432r = cVar;
                this.f26431q = null;
            }
            this.f26423i.g();
            this.f26422h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f26429o.a();
        this.f26428n.a();
    }

    @Override // com.applovin.impl.r1
    public int b(f9 f9Var) {
        if (!"audio/raw".equals(f9Var.f23840m)) {
            return ((this.Y || !a(f9Var, this.f26434t)) && !b(f9Var, this.f26417a)) ? 0 : 2;
        }
        if (!xp.g(f9Var.B)) {
            pc.d("DefaultAudioSink", "Invalid PCM encoding: " + f9Var.B);
            return 0;
        }
        int i2 = f9Var.B;
        return (i2 == 2 || (this.f26419c && i2 == 4)) ? 2 : 1;
    }

    private static boolean b(f9 f9Var, n1 n1Var) {
        return a(f9Var, n1Var) != null;
    }

    private void b(AudioTrack audioTrack) {
        if (this.f26427m == null) {
            this.f26427m = new i();
        }
        this.f26427m.a(audioTrack);
    }

    private void b(ph phVar) {
        if (t()) {
            try {
                this.f26433s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(phVar.f26059a).setPitch(phVar.f26060b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                pc.c("DefaultAudioSink", "Failed to set playback params", e2);
            }
            phVar = new ph(this.f26433s.getPlaybackParams().getSpeed(), this.f26433s.getPlaybackParams().getPitch());
            this.f26423i.a(phVar.f26059a);
        }
        this.w = phVar;
    }

    @Override // com.applovin.impl.r1
    public long a(boolean z2) {
        if (!t() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.f26423i.a(z2), this.f26432r.b(r()))));
    }

    private static Pair a(f9 f9Var, n1 n1Var) {
        if (n1Var == null) {
            return null;
        }
        int b2 = Cif.b((String) b1.a((Object) f9Var.f23840m), f9Var.f23837j);
        int i2 = 6;
        if (b2 != 5 && b2 != 6 && b2 != 18 && b2 != 17 && b2 != 7 && b2 != 8 && b2 != 14) {
            return null;
        }
        if (b2 == 18 && !n1Var.a(18)) {
            b2 = 6;
        } else if (b2 == 8 && !n1Var.a(8)) {
            b2 = 7;
        }
        if (!n1Var.a(b2)) {
            return null;
        }
        if (b2 == 18) {
            if (xp.f27962a >= 29 && (i2 = a(18, f9Var.A)) == 0) {
                pc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i2 = f9Var.f23851z;
            if (i2 > n1Var.c()) {
                return null;
            }
        }
        int c2 = c(i2);
        if (c2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(c2));
    }

    @Override // com.applovin.impl.r1
    public void b(boolean z2) {
        a(n(), z2);
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return k.b(byteBuffer);
            case 7:
            case 8:
                return f7.a(byteBuffer);
            case 9:
                int d2 = tf.d(xp.a(byteBuffer, byteBuffer.position()));
                if (d2 != -1) {
                    return d2;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return Opcodes.ACC_STRICT;
            case 13:
            default:
                throw new IllegalStateException(android.support.v4.media.d.i("Unexpected audio encoding: ", i2));
            case 14:
                int a2 = k.a(byteBuffer);
                if (a2 == -1) {
                    return 0;
                }
                return k.a(byteBuffer, a2) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return n.a(byteBuffer);
        }
    }

    @Override // com.applovin.impl.r1
    public ph a() {
        return this.f26425k ? this.w : n();
    }

    @Override // com.applovin.impl.r1
    public boolean a(ByteBuffer byteBuffer, long j2, int i2) {
        ByteBuffer byteBuffer2 = this.K;
        b1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f26431q != null) {
            if (!l()) {
                return false;
            }
            if (!this.f26431q.a(this.f26432r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.f26432r = this.f26431q;
                this.f26431q = null;
                if (a(this.f26433s) && this.f26426l != 3) {
                    this.f26433s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f26433s;
                    f9 f9Var = this.f26432r.f26441a;
                    audioTrack.setOffloadDelayPadding(f9Var.C, f9Var.D);
                    this.Z = true;
                }
            }
            a(j2);
        }
        if (!t()) {
            try {
                s();
            } catch (r1.b e2) {
                if (!e2.f26246b) {
                    this.f26428n.a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.f26428n.a();
        if (this.F) {
            this.G = Math.max(0L, j2);
            this.E = false;
            this.F = false;
            if (this.f26425k && xp.f27962a >= 23) {
                b(this.w);
            }
            a(j2);
            if (this.S) {
                j();
            }
        }
        if (!this.f26423i.g(r())) {
            return false;
        }
        if (this.K == null) {
            b1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f26432r;
            if (cVar.f26443c != 0 && this.D == 0) {
                int a2 = a(cVar.f26445g, byteBuffer);
                this.D = a2;
                if (a2 == 0) {
                    return true;
                }
            }
            if (this.f26435u != null) {
                if (!l()) {
                    return false;
                }
                a(j2);
                this.f26435u = null;
            }
            long d2 = this.G + this.f26432r.d(q() - this.e.j());
            if (!this.E && Math.abs(d2 - j2) > 200000) {
                this.f26430p.a(new r1.d(j2, d2));
                this.E = true;
            }
            if (this.E) {
                if (!l()) {
                    return false;
                }
                long j3 = j2 - d2;
                this.G += j3;
                this.E = false;
                a(j2);
                r1.c cVar2 = this.f26430p;
                if (cVar2 != null && j3 != 0) {
                    cVar2.b();
                }
            }
            if (this.f26432r.f26443c == 0) {
                this.f26438z += byteBuffer.remaining();
            } else {
                this.A += this.D * i2;
            }
            this.K = byteBuffer;
            this.L = i2;
        }
        d(j2);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.f26423i.f(r())) {
            return false;
        }
        pc.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.applovin.impl.r1
    public void a(l1 l1Var) {
        if (this.f26434t.equals(l1Var)) {
            return;
        }
        this.f26434t = l1Var;
        if (this.W) {
            return;
        }
        b();
    }

    private void a(ph phVar, boolean z2) {
        f o2 = o();
        if (phVar.equals(o2.f26451a) && z2 == o2.f26452b) {
            return;
        }
        f fVar = new f(phVar, z2, -9223372036854775807L, -9223372036854775807L, null);
        if (t()) {
            this.f26435u = fVar;
        } else {
            this.f26436v = fVar;
        }
    }

    @Override // com.applovin.impl.r1
    public void a(int i2) {
        if (this.U != i2) {
            this.U = i2;
            this.T = i2 != 0;
            b();
        }
    }

    @Override // com.applovin.impl.r1
    public void a(v1 v1Var) {
        if (this.V.equals(v1Var)) {
            return;
        }
        int i2 = v1Var.f27449a;
        float f2 = v1Var.f27450b;
        AudioTrack audioTrack = this.f26433s;
        if (audioTrack != null) {
            if (this.V.f27449a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.f26433s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = v1Var;
    }

    @Override // com.applovin.impl.r1
    public void a(ph phVar) {
        ph phVar2 = new ph(xp.a(phVar.f26059a, 0.1f, 8.0f), xp.a(phVar.f26060b, 0.1f, 8.0f));
        if (this.f26425k && xp.f27962a >= 23) {
            b(phVar2);
        } else {
            a(phVar2, p());
        }
    }

    @Override // com.applovin.impl.r1
    public void a(float f2) {
        if (this.H != f2) {
            this.H = f2;
            x();
        }
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    @Override // com.applovin.impl.r1
    public boolean a(f9 f9Var) {
        return b(f9Var) != 0;
    }

    private void a(ByteBuffer byteBuffer, long j2) {
        int a2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                b1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (xp.f27962a < 21) {
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
            if (xp.f27962a < 21) {
                int b2 = this.f26423i.b(this.B);
                if (b2 > 0) {
                    a2 = this.f26433s.write(this.N, this.O, Math.min(remaining2, b2));
                    if (a2 > 0) {
                        this.O += a2;
                        byteBuffer.position(byteBuffer.position() + a2);
                    }
                } else {
                    a2 = 0;
                }
            } else if (this.W) {
                b1.b(j2 != -9223372036854775807L);
                a2 = a(this.f26433s, byteBuffer, remaining2, j2);
            } else {
                a2 = a(this.f26433s, byteBuffer, remaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (a2 < 0) {
                boolean e2 = e(a2);
                if (e2) {
                    u();
                }
                r1.e eVar = new r1.e(a2, this.f26432r.f26441a, e2);
                r1.c cVar = this.f26430p;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.f26251b) {
                    this.f26429o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f26429o.a();
            if (a(this.f26433s)) {
                long j3 = this.C;
                if (j3 > 0) {
                    this.Z = false;
                }
                if (this.S && this.f26430p != null && a2 < remaining2 && !this.Z) {
                    this.f26430p.b(this.f26423i.c(j3));
                }
            }
            int i2 = this.f26432r.f26443c;
            if (i2 == 0) {
                this.B += a2;
            }
            if (a2 == remaining2) {
                if (i2 != 0) {
                    b1.b(byteBuffer == this.K);
                    this.C += this.D * this.L;
                }
                this.M = null;
            }
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private static int a(int i2, int i3) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(xp.a(i4)).build(), build);
            if (isDirectPlaybackSupported) {
                return i4;
            }
        }
        return 0;
    }

    private boolean a(f9 f9Var, l1 l1Var) {
        int b2;
        int a2;
        int a3;
        if (xp.f27962a < 29 || this.f26426l == 0 || (b2 = Cif.b((String) b1.a((Object) f9Var.f23840m), f9Var.f23837j)) == 0 || (a2 = xp.a(f9Var.f23851z)) == 0 || (a3 = a(b(f9Var.A, a2, b2), l1Var.a())) == 0) {
            return false;
        }
        if (a3 == 1) {
            return ((f9Var.C != 0 || f9Var.D != 0) && (this.f26426l == 1)) ? false : true;
        }
        if (a3 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i2 = xp.f27962a;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i2 == 30 && xp.d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (xp.f27962a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (xp.f27962a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.x.putInt(1431633921);
        }
        if (this.f26437y == 0) {
            this.x.putInt(4, i2);
            this.x.putLong(8, j2 * 1000);
            this.x.position(0);
            this.f26437y = i2;
        }
        int remaining = this.x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.x, remaining, 1);
            if (write < 0) {
                this.f26437y = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int a2 = a(audioTrack, byteBuffer, i2);
        if (a2 < 0) {
            this.f26437y = 0;
            return a2;
        }
        this.f26437y -= a2;
        return a2;
    }
}
