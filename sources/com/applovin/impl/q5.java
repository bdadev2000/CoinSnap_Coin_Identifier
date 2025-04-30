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
import com.applovin.impl.C0759t1;
import com.applovin.impl.InterfaceC0732o1;
import com.applovin.impl.InterfaceC0740q1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import y.AbstractC2933a;

/* loaded from: classes.dex */
public final class q5 implements InterfaceC0740q1 {

    /* renamed from: a0, reason: collision with root package name */
    public static boolean f10139a0 = false;

    /* renamed from: A, reason: collision with root package name */
    private long f10140A;

    /* renamed from: B, reason: collision with root package name */
    private long f10141B;

    /* renamed from: C, reason: collision with root package name */
    private long f10142C;

    /* renamed from: D, reason: collision with root package name */
    private int f10143D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f10144E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f10145F;

    /* renamed from: G, reason: collision with root package name */
    private long f10146G;

    /* renamed from: H, reason: collision with root package name */
    private float f10147H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC0732o1[] f10148I;

    /* renamed from: J, reason: collision with root package name */
    private ByteBuffer[] f10149J;

    /* renamed from: K, reason: collision with root package name */
    private ByteBuffer f10150K;

    /* renamed from: L, reason: collision with root package name */
    private int f10151L;

    /* renamed from: M, reason: collision with root package name */
    private ByteBuffer f10152M;

    /* renamed from: N, reason: collision with root package name */
    private byte[] f10153N;
    private int O;

    /* renamed from: P, reason: collision with root package name */
    private int f10154P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f10155Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f10156R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f10157S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f10158T;

    /* renamed from: U, reason: collision with root package name */
    private int f10159U;

    /* renamed from: V, reason: collision with root package name */
    private C0763u1 f10160V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f10161W;

    /* renamed from: X, reason: collision with root package name */
    private long f10162X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f10163Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f10164Z;

    /* renamed from: a, reason: collision with root package name */
    private final C0724m1 f10165a;
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f10166c;

    /* renamed from: d, reason: collision with root package name */
    private final C0676b3 f10167d;

    /* renamed from: e, reason: collision with root package name */
    private final ap f10168e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC0732o1[] f10169f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC0732o1[] f10170g;

    /* renamed from: h, reason: collision with root package name */
    private final ConditionVariable f10171h;

    /* renamed from: i, reason: collision with root package name */
    private final C0759t1 f10172i;

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque f10173j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f10174k;
    private final int l;
    private i m;

    /* renamed from: n, reason: collision with root package name */
    private final g f10175n;

    /* renamed from: o, reason: collision with root package name */
    private final g f10176o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC0740q1.c f10177p;

    /* renamed from: q, reason: collision with root package name */
    private c f10178q;

    /* renamed from: r, reason: collision with root package name */
    private c f10179r;

    /* renamed from: s, reason: collision with root package name */
    private AudioTrack f10180s;

    /* renamed from: t, reason: collision with root package name */
    private C0716k1 f10181t;

    /* renamed from: u, reason: collision with root package name */
    private f f10182u;

    /* renamed from: v, reason: collision with root package name */
    private f f10183v;

    /* renamed from: w, reason: collision with root package name */
    private mh f10184w;

    /* renamed from: x, reason: collision with root package name */
    private ByteBuffer f10185x;

    /* renamed from: y, reason: collision with root package name */
    private int f10186y;

    /* renamed from: z, reason: collision with root package name */
    private long f10187z;

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioTrack f10188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f10188a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f10188a.flush();
                this.f10188a.release();
            } finally {
                q5.this.f10171h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        long a(long j7);

        mh a(mh mhVar);

        boolean a(boolean z8);

        InterfaceC0732o1[] a();

        long b();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d9 f10189a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10190c;

        /* renamed from: d, reason: collision with root package name */
        public final int f10191d;

        /* renamed from: e, reason: collision with root package name */
        public final int f10192e;

        /* renamed from: f, reason: collision with root package name */
        public final int f10193f;

        /* renamed from: g, reason: collision with root package name */
        public final int f10194g;

        /* renamed from: h, reason: collision with root package name */
        public final int f10195h;

        /* renamed from: i, reason: collision with root package name */
        public final InterfaceC0732o1[] f10196i;

        public c(d9 d9Var, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z8, InterfaceC0732o1[] interfaceC0732o1Arr) {
            this.f10189a = d9Var;
            this.b = i9;
            this.f10190c = i10;
            this.f10191d = i11;
            this.f10192e = i12;
            this.f10193f = i13;
            this.f10194g = i14;
            this.f10196i = interfaceC0732o1Arr;
            this.f10195h = a(i15, z8);
        }

        private int c(long j7) {
            int d2 = q5.d(this.f10194g);
            if (this.f10194g == 5) {
                d2 *= 2;
            }
            return (int) ((j7 * d2) / 1000000);
        }

        private AudioTrack d(boolean z8, C0716k1 c0716k1, int i9) {
            AudioTrack.Builder offloadedPlayback;
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(a(c0716k1, z8)).setAudioFormat(q5.b(this.f10192e, this.f10193f, this.f10194g)).setTransferMode(1).setBufferSizeInBytes(this.f10195h).setSessionId(i9).setOffloadedPlayback(this.f10190c == 1);
            return offloadedPlayback.build();
        }

        public AudioTrack a(boolean z8, C0716k1 c0716k1, int i9) {
            try {
                AudioTrack b = b(z8, c0716k1, i9);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC0740q1.b(state, this.f10192e, this.f10193f, this.f10195h, this.f10189a, b(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                throw new InterfaceC0740q1.b(0, this.f10192e, this.f10193f, this.f10195h, this.f10189a, b(), e4);
            }
        }

        public long b(long j7) {
            return (j7 * 1000000) / this.f10192e;
        }

        public boolean b() {
            return this.f10190c == 1;
        }

        private AudioTrack b(boolean z8, C0716k1 c0716k1, int i9) {
            int i10 = yp.f12451a;
            if (i10 >= 29) {
                return d(z8, c0716k1, i9);
            }
            if (i10 >= 21) {
                return c(z8, c0716k1, i9);
            }
            return a(c0716k1, i9);
        }

        private AudioTrack c(boolean z8, C0716k1 c0716k1, int i9) {
            return new AudioTrack(a(c0716k1, z8), q5.b(this.f10192e, this.f10193f, this.f10194g), this.f10195h, 1, i9);
        }

        public boolean a(c cVar) {
            return cVar.f10190c == this.f10190c && cVar.f10194g == this.f10194g && cVar.f10192e == this.f10192e && cVar.f10193f == this.f10193f && cVar.f10191d == this.f10191d;
        }

        private int a(int i9, boolean z8) {
            if (i9 != 0) {
                return i9;
            }
            int i10 = this.f10190c;
            if (i10 == 0) {
                return a(z8 ? 8.0f : 1.0f);
            }
            if (i10 == 1) {
                return c(50000000L);
            }
            if (i10 == 2) {
                return c(250000L);
            }
            throw new IllegalStateException();
        }

        public long d(long j7) {
            return (j7 * 1000000) / this.f10189a.f7195A;
        }

        private AudioTrack a(C0716k1 c0716k1, int i9) {
            int e4 = yp.e(c0716k1.f8532c);
            if (i9 == 0) {
                return new AudioTrack(e4, this.f10192e, this.f10193f, this.f10194g, this.f10195h, 1);
            }
            return new AudioTrack(e4, this.f10192e, this.f10193f, this.f10194g, this.f10195h, 1, i9);
        }

        public long a(long j7) {
            return (j7 * this.f10192e) / 1000000;
        }

        private static AudioAttributes a(C0716k1 c0716k1, boolean z8) {
            if (z8) {
                return a();
            }
            return c0716k1.a();
        }

        private int a(float f9) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f10192e, this.f10193f, this.f10194g);
            AbstractC0669a1.b(minBufferSize != -2);
            int a6 = yp.a(minBufferSize * 4, ((int) a(250000L)) * this.f10191d, Math.max(minBufferSize, ((int) a(750000L)) * this.f10191d));
            return f9 != 1.0f ? Math.round(a6 * f9) : a6;
        }

        private static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0732o1[] f10197a;
        private final xj b;

        /* renamed from: c, reason: collision with root package name */
        private final lk f10198c;

        public d(InterfaceC0732o1... interfaceC0732o1Arr) {
            this(interfaceC0732o1Arr, new xj(), new lk());
        }

        @Override // com.applovin.impl.q5.b
        public mh a(mh mhVar) {
            this.f10198c.b(mhVar.f9208a);
            this.f10198c.a(mhVar.b);
            return mhVar;
        }

        @Override // com.applovin.impl.q5.b
        public long b() {
            return this.b.j();
        }

        public d(InterfaceC0732o1[] interfaceC0732o1Arr, xj xjVar, lk lkVar) {
            InterfaceC0732o1[] interfaceC0732o1Arr2 = new InterfaceC0732o1[interfaceC0732o1Arr.length + 2];
            this.f10197a = interfaceC0732o1Arr2;
            System.arraycopy(interfaceC0732o1Arr, 0, interfaceC0732o1Arr2, 0, interfaceC0732o1Arr.length);
            this.b = xjVar;
            this.f10198c = lkVar;
            interfaceC0732o1Arr2[interfaceC0732o1Arr.length] = xjVar;
            interfaceC0732o1Arr2[interfaceC0732o1Arr.length + 1] = lkVar;
        }

        @Override // com.applovin.impl.q5.b
        public boolean a(boolean z8) {
            this.b.a(z8);
            return z8;
        }

        @Override // com.applovin.impl.q5.b
        public InterfaceC0732o1[] a() {
            return this.f10197a;
        }

        @Override // com.applovin.impl.q5.b
        public long a(long j7) {
            return this.f10198c.a(j7);
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

        /* renamed from: a, reason: collision with root package name */
        private final long f10202a;
        private Exception b;

        /* renamed from: c, reason: collision with root package name */
        private long f10203c;

        public g(long j7) {
            this.f10202a = j7;
        }

        public void a() {
            this.b = null;
        }

        public void a(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exc;
                this.f10203c = this.f10202a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f10203c) {
                Exception exc2 = this.b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.b;
                a();
                throw exc3;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class h implements C0759t1.a {
        private h() {
        }

        @Override // com.applovin.impl.C0759t1.a
        public void a(long j7) {
            if (q5.this.f10177p != null) {
                q5.this.f10177p.a(j7);
            }
        }

        @Override // com.applovin.impl.C0759t1.a
        public void b(long j7, long j9, long j10, long j11) {
            StringBuilder a6 = AbstractC2933a.a("Spurious audio timestamp (system clock mismatch): ", j7, ", ");
            a6.append(j9);
            a6.append(", ");
            a6.append(j10);
            a6.append(", ");
            a6.append(j11);
            a6.append(", ");
            a6.append(q5.this.q());
            a6.append(", ");
            a6.append(q5.this.r());
            String sb = a6.toString();
            if (!q5.f10139a0) {
                kc.d("DefaultAudioSink", sb);
                return;
            }
            throw new e(sb, null);
        }

        public /* synthetic */ h(q5 q5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.C0759t1.a
        public void a(int i9, long j7) {
            if (q5.this.f10177p != null) {
                q5.this.f10177p.a(i9, j7, SystemClock.elapsedRealtime() - q5.this.f10162X);
            }
        }

        @Override // com.applovin.impl.C0759t1.a
        public void a(long j7, long j9, long j10, long j11) {
            StringBuilder a6 = AbstractC2933a.a("Spurious audio timestamp (frame position mismatch): ", j7, ", ");
            a6.append(j9);
            a6.append(", ");
            a6.append(j10);
            a6.append(", ");
            a6.append(j11);
            a6.append(", ");
            a6.append(q5.this.q());
            a6.append(", ");
            a6.append(q5.this.r());
            String sb = a6.toString();
            if (!q5.f10139a0) {
                kc.d("DefaultAudioSink", sb);
                return;
            }
            throw new e(sb, null);
        }

        @Override // com.applovin.impl.C0759t1.a
        public void b(long j7) {
            kc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j7);
        }
    }

    /* loaded from: classes.dex */
    public final class i {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f10205a = new Handler();
        private final AudioTrack$StreamEventCallback b;

        /* loaded from: classes.dex */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q5 f10207a;

            public a(q5 q5Var) {
                this.f10207a = q5Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i9) {
                boolean z8;
                if (audioTrack == q5.this.f10180s) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0669a1.b(z8);
                if (q5.this.f10177p != null && q5.this.f10157S) {
                    q5.this.f10177p.a();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                boolean z8;
                if (audioTrack == q5.this.f10180s) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0669a1.b(z8);
                if (q5.this.f10177p != null && q5.this.f10157S) {
                    q5.this.f10177p.a();
                }
            }
        }

        public i() {
            this.b = new a(q5.this);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.applovin.impl.K1] */
        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f10205a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: com.applovin.impl.K1
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.f10205a.removeCallbacksAndMessages(null);
        }
    }

    public q5(C0724m1 c0724m1, b bVar, boolean z8, boolean z9, int i9) {
        boolean z10;
        boolean z11;
        int i10;
        this.f10165a = c0724m1;
        this.b = (b) AbstractC0669a1.a(bVar);
        int i11 = yp.f12451a;
        if (i11 >= 21 && z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10166c = z10;
        if (i11 >= 23 && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f10174k = z11;
        if (i11 >= 29) {
            i10 = i9;
        } else {
            i10 = 0;
        }
        this.l = i10;
        this.f10171h = new ConditionVariable(true);
        this.f10172i = new C0759t1(new h(this, null));
        C0676b3 c0676b3 = new C0676b3();
        this.f10167d = c0676b3;
        ap apVar = new ap();
        this.f10168e = apVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ri(), c0676b3, apVar);
        Collections.addAll(arrayList, bVar.a());
        this.f10169f = (InterfaceC0732o1[]) arrayList.toArray(new InterfaceC0732o1[0]);
        this.f10170g = new InterfaceC0732o1[]{new a9()};
        this.f10147H = 1.0f;
        this.f10181t = C0716k1.f8529g;
        this.f10159U = 0;
        this.f10160V = new C0763u1(0, 0.0f);
        mh mhVar = mh.f9206d;
        this.f10183v = new f(mhVar, false, 0L, 0L, null);
        this.f10184w = mhVar;
        this.f10154P = -1;
        this.f10148I = new InterfaceC0732o1[0];
        this.f10149J = new ByteBuffer[0];
        this.f10173j = new ArrayDeque();
        this.f10175n = new g(100L);
        this.f10176o = new g(100L);
    }

    private AudioTrack k() {
        try {
            return ((c) AbstractC0669a1.a(this.f10179r)).a(this.f10161W, this.f10181t, this.f10159U);
        } catch (InterfaceC0740q1.b e4) {
            u();
            InterfaceC0740q1.c cVar = this.f10177p;
            if (cVar != null) {
                cVar.a(e4);
            }
            throw e4;
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
            int r0 = r9.f10154P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f10154P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f10154P
            com.applovin.impl.o1[] r5 = r9.f10148I
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
            int r0 = r9.f10154P
            int r0 = r0 + r1
            r9.f10154P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f10152M
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.f10152M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.f10154P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q5.l():boolean");
    }

    private void m() {
        int i9 = 0;
        while (true) {
            InterfaceC0732o1[] interfaceC0732o1Arr = this.f10148I;
            if (i9 < interfaceC0732o1Arr.length) {
                InterfaceC0732o1 interfaceC0732o1 = interfaceC0732o1Arr[i9];
                interfaceC0732o1.b();
                this.f10149J[i9] = interfaceC0732o1.d();
                i9++;
            } else {
                return;
            }
        }
    }

    private mh n() {
        return o().f10199a;
    }

    private f o() {
        f fVar = this.f10182u;
        if (fVar == null) {
            if (!this.f10173j.isEmpty()) {
                return (f) this.f10173j.getLast();
            }
            return this.f10183v;
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        if (this.f10179r.f10190c == 0) {
            return this.f10187z / r0.b;
        }
        return this.f10140A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        if (this.f10179r.f10190c == 0) {
            return this.f10141B / r0.f10191d;
        }
        return this.f10142C;
    }

    private void s() {
        boolean z8;
        this.f10171h.block();
        AudioTrack k6 = k();
        this.f10180s = k6;
        if (a(k6)) {
            b(this.f10180s);
            if (this.l != 3) {
                AudioTrack audioTrack = this.f10180s;
                d9 d9Var = this.f10179r.f10189a;
                audioTrack.setOffloadDelayPadding(d9Var.f7197C, d9Var.f7198D);
            }
        }
        this.f10159U = this.f10180s.getAudioSessionId();
        C0759t1 c0759t1 = this.f10172i;
        AudioTrack audioTrack2 = this.f10180s;
        c cVar = this.f10179r;
        if (cVar.f10190c == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        c0759t1.a(audioTrack2, z8, cVar.f10194g, cVar.f10191d, cVar.f10195h);
        x();
        int i9 = this.f10160V.f11534a;
        if (i9 != 0) {
            this.f10180s.attachAuxEffect(i9);
            this.f10180s.setAuxEffectSendLevel(this.f10160V.b);
        }
        this.f10145F = true;
    }

    private boolean t() {
        if (this.f10180s != null) {
            return true;
        }
        return false;
    }

    private void u() {
        if (!this.f10179r.b()) {
            return;
        }
        this.f10163Y = true;
    }

    private void v() {
        if (!this.f10156R) {
            this.f10156R = true;
            this.f10172i.d(r());
            this.f10180s.stop();
            this.f10186y = 0;
        }
    }

    private void w() {
        this.f10187z = 0L;
        this.f10140A = 0L;
        this.f10141B = 0L;
        this.f10142C = 0L;
        this.f10164Z = false;
        this.f10143D = 0;
        this.f10183v = new f(n(), p(), 0L, 0L, null);
        this.f10146G = 0L;
        this.f10182u = null;
        this.f10173j.clear();
        this.f10150K = null;
        this.f10151L = 0;
        this.f10152M = null;
        this.f10156R = false;
        this.f10155Q = false;
        this.f10154P = -1;
        this.f10185x = null;
        this.f10186y = 0;
        this.f10168e.k();
        m();
    }

    private void x() {
        if (t()) {
            if (yp.f12451a >= 21) {
                a(this.f10180s, this.f10147H);
            } else {
                b(this.f10180s, this.f10147H);
            }
        }
    }

    private void y() {
        InterfaceC0732o1[] interfaceC0732o1Arr = this.f10179r.f10196i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0732o1 interfaceC0732o1 : interfaceC0732o1Arr) {
            if (interfaceC0732o1.f()) {
                arrayList.add(interfaceC0732o1);
            } else {
                interfaceC0732o1.b();
            }
        }
        int size = arrayList.size();
        this.f10148I = (InterfaceC0732o1[]) arrayList.toArray(new InterfaceC0732o1[size]);
        this.f10149J = new ByteBuffer[size];
        m();
    }

    private boolean z() {
        if (!this.f10161W && MimeTypes.AUDIO_RAW.equals(this.f10179r.f10189a.m) && !f(this.f10179r.f10189a.f7196B)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void h() {
        boolean z8;
        if (yp.f12451a < 25) {
            b();
            return;
        }
        this.f10176o.a();
        this.f10175n.a();
        if (!t()) {
            return;
        }
        w();
        if (this.f10172i.d()) {
            this.f10180s.pause();
        }
        this.f10180s.flush();
        this.f10172i.g();
        C0759t1 c0759t1 = this.f10172i;
        AudioTrack audioTrack = this.f10180s;
        c cVar = this.f10179r;
        if (cVar.f10190c == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        c0759t1.a(audioTrack, z8, cVar.f10194g, cVar.f10191d, cVar.f10195h);
        this.f10145F = true;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void i() {
        this.f10144E = true;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void j() {
        this.f10157S = true;
        if (t()) {
            this.f10172i.i();
            this.f10180s.play();
        }
    }

    public boolean p() {
        return o().b;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void pause() {
        this.f10157S = false;
        if (t() && this.f10172i.f()) {
            this.f10180s.pause();
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void reset() {
        b();
        for (InterfaceC0732o1 interfaceC0732o1 : this.f10169f) {
            interfaceC0732o1.reset();
        }
        for (InterfaceC0732o1 interfaceC0732o12 : this.f10170g) {
            interfaceC0732o12.reset();
        }
        this.f10157S = false;
        this.f10163Y = false;
    }

    private long c(long j7) {
        return j7 + this.f10179r.b(this.b.b());
    }

    private static boolean e(int i9) {
        return (yp.f12451a >= 24 && i9 == -6) || i9 == -32;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void d() {
        if (this.f10161W) {
            this.f10161W = false;
            b();
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void f() {
        if (!this.f10155Q && t() && l()) {
            v();
            this.f10155Q = true;
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public boolean g() {
        return t() && this.f10172i.e(r());
    }

    private void a(long j7) {
        mh mhVar;
        if (z()) {
            mhVar = this.b.a(n());
        } else {
            mhVar = mh.f9206d;
        }
        mh mhVar2 = mhVar;
        boolean a6 = z() ? this.b.a(p()) : false;
        this.f10173j.add(new f(mhVar2, a6, Math.max(0L, j7), this.f10179r.b(r()), null));
        y();
        InterfaceC0740q1.c cVar = this.f10177p;
        if (cVar != null) {
            cVar.a(a6);
        }
    }

    private long b(long j7) {
        while (!this.f10173j.isEmpty() && j7 >= ((f) this.f10173j.getFirst()).f10201d) {
            this.f10183v = (f) this.f10173j.remove();
        }
        f fVar = this.f10183v;
        long j9 = j7 - fVar.f10201d;
        if (fVar.f10199a.equals(mh.f9206d)) {
            return this.f10183v.f10200c + j9;
        }
        if (this.f10173j.isEmpty()) {
            return this.f10183v.f10200c + this.b.a(j9);
        }
        f fVar2 = (f) this.f10173j.getFirst();
        return fVar2.f10200c - yp.a(fVar2.f10201d - j7, this.f10183v.f10199a.f9208a);
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void e() {
        AbstractC0669a1.b(yp.f12451a >= 21);
        AbstractC0669a1.b(this.f10158T);
        if (this.f10161W) {
            return;
        }
        this.f10161W = true;
        b();
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public boolean c() {
        return !t() || (this.f10155Q && !g());
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final mh f10199a;
        public final boolean b;

        /* renamed from: c, reason: collision with root package name */
        public final long f10200c;

        /* renamed from: d, reason: collision with root package name */
        public final long f10201d;

        private f(mh mhVar, boolean z8, long j7, long j9) {
            this.f10199a = mhVar;
            this.b = z8;
            this.f10200c = j7;
            this.f10201d = j9;
        }

        public /* synthetic */ f(mh mhVar, boolean z8, long j7, long j9, a aVar) {
            this(mhVar, z8, j7, j9);
        }
    }

    private static int c(int i9) {
        int i10 = yp.f12451a;
        if (i10 <= 28) {
            if (i9 == 7) {
                i9 = 8;
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                i9 = 6;
            }
        }
        if (i10 <= 26 && "fugu".equals(yp.b) && i9 == 1) {
            i9 = 2;
        }
        return yp.a(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i9) {
        switch (i9) {
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

    private boolean f(int i9) {
        return this.f10166c && yp.f(i9);
    }

    private void d(long j7) {
        ByteBuffer byteBuffer;
        int length = this.f10148I.length;
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.f10149J[i9 - 1];
            } else {
                byteBuffer = this.f10150K;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC0732o1.f9376a;
                }
            }
            if (i9 == length) {
                a(byteBuffer, j7);
            } else {
                InterfaceC0732o1 interfaceC0732o1 = this.f10148I[i9];
                if (i9 > this.f10154P) {
                    interfaceC0732o1.a(byteBuffer);
                }
                ByteBuffer d2 = interfaceC0732o1.d();
                this.f10149J[i9] = d2;
                if (d2.hasRemaining()) {
                    i9++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i9--;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(d9 d9Var, int i9, int[] iArr) {
        int i10;
        InterfaceC0732o1[] interfaceC0732o1Arr;
        int intValue;
        int i11;
        int i12;
        int intValue2;
        int i13;
        InterfaceC0732o1[] interfaceC0732o1Arr2;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(d9Var.m)) {
            AbstractC0669a1.a(yp.g(d9Var.f7196B));
            int b8 = yp.b(d9Var.f7196B, d9Var.f7223z);
            if (f(d9Var.f7196B)) {
                interfaceC0732o1Arr2 = this.f10170g;
            } else {
                interfaceC0732o1Arr2 = this.f10169f;
            }
            this.f10168e.a(d9Var.f7197C, d9Var.f7198D);
            if (yp.f12451a < 21 && d9Var.f7223z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.f10167d.a(iArr2);
            InterfaceC0732o1.a aVar = new InterfaceC0732o1.a(d9Var.f7195A, d9Var.f7223z, d9Var.f7196B);
            for (InterfaceC0732o1 interfaceC0732o1 : interfaceC0732o1Arr2) {
                try {
                    InterfaceC0732o1.a a6 = interfaceC0732o1.a(aVar);
                    if (interfaceC0732o1.f()) {
                        aVar = a6;
                    }
                } catch (InterfaceC0732o1.b e4) {
                    throw new InterfaceC0740q1.a(e4, d9Var);
                }
            }
            int i15 = aVar.f9379c;
            i11 = aVar.f9378a;
            intValue2 = yp.a(aVar.b);
            interfaceC0732o1Arr = interfaceC0732o1Arr2;
            intValue = i15;
            i12 = b8;
            i10 = yp.b(i15, aVar.b);
            i13 = 0;
        } else {
            InterfaceC0732o1[] interfaceC0732o1Arr3 = new InterfaceC0732o1[0];
            int i16 = d9Var.f7195A;
            i10 = -1;
            if (a(d9Var, this.f10181t)) {
                interfaceC0732o1Arr = interfaceC0732o1Arr3;
                intValue = df.b((String) AbstractC0669a1.a((Object) d9Var.m), d9Var.f7209j);
                i13 = 1;
                intValue2 = yp.a(d9Var.f7223z);
                i11 = i16;
                i12 = -1;
            } else {
                Pair a9 = a(d9Var, this.f10165a);
                if (a9 != null) {
                    interfaceC0732o1Arr = interfaceC0732o1Arr3;
                    intValue = ((Integer) a9.first).intValue();
                    i11 = i16;
                    i12 = -1;
                    intValue2 = ((Integer) a9.second).intValue();
                    i13 = 2;
                } else {
                    throw new InterfaceC0740q1.a("Unable to configure passthrough for: " + d9Var, d9Var);
                }
            }
        }
        if (intValue == 0) {
            throw new InterfaceC0740q1.a("Invalid output encoding (mode=" + i13 + ") for: " + d9Var, d9Var);
        }
        if (intValue2 != 0) {
            this.f10163Y = false;
            c cVar = new c(d9Var, i12, i13, i10, i11, intValue2, intValue, i9, this.f10174k, interfaceC0732o1Arr);
            if (t()) {
                this.f10178q = cVar;
                return;
            } else {
                this.f10179r = cVar;
                return;
            }
        }
        throw new InterfaceC0740q1.a("Invalid output channel config (mode=" + i13 + ") for: " + d9Var, d9Var);
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void b() {
        if (t()) {
            w();
            if (this.f10172i.d()) {
                this.f10180s.pause();
            }
            if (a(this.f10180s)) {
                ((i) AbstractC0669a1.a(this.m)).b(this.f10180s);
            }
            AudioTrack audioTrack = this.f10180s;
            this.f10180s = null;
            if (yp.f12451a < 21 && !this.f10158T) {
                this.f10159U = 0;
            }
            c cVar = this.f10178q;
            if (cVar != null) {
                this.f10179r = cVar;
                this.f10178q = null;
            }
            this.f10172i.g();
            this.f10171h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f10176o.a();
        this.f10175n.a();
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public int b(d9 d9Var) {
        if (!MimeTypes.AUDIO_RAW.equals(d9Var.m)) {
            return ((this.f10163Y || !a(d9Var, this.f10181t)) && !b(d9Var, this.f10165a)) ? 0 : 2;
        }
        if (!yp.g(d9Var.f7196B)) {
            kc.d("DefaultAudioSink", "Invalid PCM encoding: " + d9Var.f7196B);
            return 0;
        }
        int i9 = d9Var.f7196B;
        return (i9 == 2 || (this.f10166c && i9 == 4)) ? 2 : 1;
    }

    private static boolean b(d9 d9Var, C0724m1 c0724m1) {
        return a(d9Var, c0724m1) != null;
    }

    private void b(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new i();
        }
        this.m.a(audioTrack);
    }

    private void b(mh mhVar) {
        if (t()) {
            try {
                this.f10180s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(mhVar.f9208a).setPitch(mhVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                kc.c("DefaultAudioSink", "Failed to set playback params", e4);
            }
            mhVar = new mh(this.f10180s.getPlaybackParams().getSpeed(), this.f10180s.getPlaybackParams().getPitch());
            this.f10172i.a(mhVar.f9208a);
        }
        this.f10184w = mhVar;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public long a(boolean z8) {
        if (!t() || this.f10145F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.f10172i.a(z8), this.f10179r.b(r()))));
    }

    private static Pair a(d9 d9Var, C0724m1 c0724m1) {
        if (c0724m1 == null) {
            return null;
        }
        int b8 = df.b((String) AbstractC0669a1.a((Object) d9Var.m), d9Var.f7209j);
        int i9 = 6;
        if (b8 != 5 && b8 != 6 && b8 != 18 && b8 != 17 && b8 != 7 && b8 != 8 && b8 != 14) {
            return null;
        }
        if (b8 == 18 && !c0724m1.a(18)) {
            b8 = 6;
        } else if (b8 == 8 && !c0724m1.a(8)) {
            b8 = 7;
        }
        if (!c0724m1.a(b8)) {
            return null;
        }
        if (b8 == 18) {
            if (yp.f12451a >= 29 && (i9 = a(18, d9Var.f7195A)) == 0) {
                kc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i9 = d9Var.f7223z;
            if (i9 > c0724m1.c()) {
                return null;
            }
        }
        int c9 = c(i9);
        if (c9 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b8), Integer.valueOf(c9));
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void b(boolean z8) {
        a(n(), z8);
    }

    private static void b(AudioTrack audioTrack, float f9) {
        audioTrack.setStereoVolume(f9, f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    private static int a(int i9, ByteBuffer byteBuffer) {
        switch (i9) {
            case 5:
            case 6:
            case 18:
                return AbstractC0714k.b(byteBuffer);
            case 7:
            case 8:
                return d7.a(byteBuffer);
            case 9:
                int d2 = of.d(yp.a(byteBuffer, byteBuffer.position()));
                if (d2 != -1) {
                    return d2;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.h(i9, "Unexpected audio encoding: "));
            case 14:
                int a6 = AbstractC0714k.a(byteBuffer);
                if (a6 == -1) {
                    return 0;
                }
                return AbstractC0714k.a(byteBuffer, a6) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return AbstractC0726n.a(byteBuffer);
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public mh a() {
        if (this.f10174k) {
            return this.f10184w;
        }
        return n();
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public boolean a(ByteBuffer byteBuffer, long j7, int i9) {
        ByteBuffer byteBuffer2 = this.f10150K;
        AbstractC0669a1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f10178q != null) {
            if (!l()) {
                return false;
            }
            if (!this.f10178q.a(this.f10179r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.f10179r = this.f10178q;
                this.f10178q = null;
                if (a(this.f10180s) && this.l != 3) {
                    this.f10180s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f10180s;
                    d9 d9Var = this.f10179r.f10189a;
                    audioTrack.setOffloadDelayPadding(d9Var.f7197C, d9Var.f7198D);
                    this.f10164Z = true;
                }
            }
            a(j7);
        }
        if (!t()) {
            try {
                s();
            } catch (InterfaceC0740q1.b e4) {
                if (!e4.b) {
                    this.f10175n.a(e4);
                    return false;
                }
                throw e4;
            }
        }
        this.f10175n.a();
        if (this.f10145F) {
            this.f10146G = Math.max(0L, j7);
            this.f10144E = false;
            this.f10145F = false;
            if (this.f10174k && yp.f12451a >= 23) {
                b(this.f10184w);
            }
            a(j7);
            if (this.f10157S) {
                j();
            }
        }
        if (!this.f10172i.g(r())) {
            return false;
        }
        if (this.f10150K == null) {
            AbstractC0669a1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f10179r;
            if (cVar.f10190c != 0 && this.f10143D == 0) {
                int a6 = a(cVar.f10194g, byteBuffer);
                this.f10143D = a6;
                if (a6 == 0) {
                    return true;
                }
            }
            if (this.f10182u != null) {
                if (!l()) {
                    return false;
                }
                a(j7);
                this.f10182u = null;
            }
            long d2 = this.f10146G + this.f10179r.d(q() - this.f10168e.j());
            if (!this.f10144E && Math.abs(d2 - j7) > 200000) {
                this.f10177p.a(new InterfaceC0740q1.d(j7, d2));
                this.f10144E = true;
            }
            if (this.f10144E) {
                if (!l()) {
                    return false;
                }
                long j9 = j7 - d2;
                this.f10146G += j9;
                this.f10144E = false;
                a(j7);
                InterfaceC0740q1.c cVar2 = this.f10177p;
                if (cVar2 != null && j9 != 0) {
                    cVar2.b();
                }
            }
            if (this.f10179r.f10190c == 0) {
                this.f10187z += byteBuffer.remaining();
            } else {
                this.f10140A += this.f10143D * i9;
            }
            this.f10150K = byteBuffer;
            this.f10151L = i9;
        }
        d(j7);
        if (!this.f10150K.hasRemaining()) {
            this.f10150K = null;
            this.f10151L = 0;
            return true;
        }
        if (!this.f10172i.f(r())) {
            return false;
        }
        kc.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(C0716k1 c0716k1) {
        if (this.f10181t.equals(c0716k1)) {
            return;
        }
        this.f10181t = c0716k1;
        if (this.f10161W) {
            return;
        }
        b();
    }

    private void a(mh mhVar, boolean z8) {
        f o3 = o();
        if (mhVar.equals(o3.f10199a) && z8 == o3.b) {
            return;
        }
        f fVar = new f(mhVar, z8, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, null);
        if (t()) {
            this.f10182u = fVar;
        } else {
            this.f10183v = fVar;
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(int i9) {
        if (this.f10159U != i9) {
            this.f10159U = i9;
            this.f10158T = i9 != 0;
            b();
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(C0763u1 c0763u1) {
        if (this.f10160V.equals(c0763u1)) {
            return;
        }
        int i9 = c0763u1.f11534a;
        float f9 = c0763u1.b;
        AudioTrack audioTrack = this.f10180s;
        if (audioTrack != null) {
            if (this.f10160V.f11534a != i9) {
                audioTrack.attachAuxEffect(i9);
            }
            if (i9 != 0) {
                this.f10180s.setAuxEffectSendLevel(f9);
            }
        }
        this.f10160V = c0763u1;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(InterfaceC0740q1.c cVar) {
        this.f10177p = cVar;
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(mh mhVar) {
        mh mhVar2 = new mh(yp.a(mhVar.f9208a, 0.1f, 8.0f), yp.a(mhVar.b, 0.1f, 8.0f));
        if (this.f10174k && yp.f12451a >= 23) {
            b(mhVar2);
        } else {
            a(mhVar2, p());
        }
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public void a(float f9) {
        if (this.f10147H != f9) {
            this.f10147H = f9;
            x();
        }
    }

    private static void a(AudioTrack audioTrack, float f9) {
        audioTrack.setVolume(f9);
    }

    @Override // com.applovin.impl.InterfaceC0740q1
    public boolean a(d9 d9Var) {
        return b(d9Var) != 0;
    }

    private void a(ByteBuffer byteBuffer, long j7) {
        int a6;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f10152M;
            if (byteBuffer2 != null) {
                AbstractC0669a1.a(byteBuffer2 == byteBuffer);
            } else {
                this.f10152M = byteBuffer;
                if (yp.f12451a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f10153N;
                    if (bArr == null || bArr.length < remaining) {
                        this.f10153N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f10153N, 0, remaining);
                    byteBuffer.position(position);
                    this.O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (yp.f12451a < 21) {
                int b8 = this.f10172i.b(this.f10141B);
                if (b8 > 0) {
                    a6 = this.f10180s.write(this.f10153N, this.O, Math.min(remaining2, b8));
                    if (a6 > 0) {
                        this.O += a6;
                        byteBuffer.position(byteBuffer.position() + a6);
                    }
                } else {
                    a6 = 0;
                }
            } else if (this.f10161W) {
                AbstractC0669a1.b(j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                a6 = a(this.f10180s, byteBuffer, remaining2, j7);
            } else {
                a6 = a(this.f10180s, byteBuffer, remaining2);
            }
            this.f10162X = SystemClock.elapsedRealtime();
            if (a6 < 0) {
                boolean e4 = e(a6);
                if (e4) {
                    u();
                }
                InterfaceC0740q1.e eVar = new InterfaceC0740q1.e(a6, this.f10179r.f10189a, e4);
                InterfaceC0740q1.c cVar = this.f10177p;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.b) {
                    this.f10176o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f10176o.a();
            if (a(this.f10180s)) {
                long j9 = this.f10142C;
                if (j9 > 0) {
                    this.f10164Z = false;
                }
                if (this.f10157S && this.f10177p != null && a6 < remaining2 && !this.f10164Z) {
                    this.f10177p.b(this.f10172i.c(j9));
                }
            }
            int i9 = this.f10179r.f10190c;
            if (i9 == 0) {
                this.f10141B += a6;
            }
            if (a6 == remaining2) {
                if (i9 != 0) {
                    AbstractC0669a1.b(byteBuffer == this.f10150K);
                    this.f10142C += this.f10143D * this.f10151L;
                }
                this.f10152M = null;
            }
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9) {
        return audioTrack.write(byteBuffer, i9, 1);
    }

    private static int a(int i9, int i10) {
        boolean isDirectPlaybackSupported;
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i11 = 8; i11 > 0; i11--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(yp.a(i11)).build(), build);
            if (isDirectPlaybackSupported) {
                return i11;
            }
        }
        return 0;
    }

    private boolean a(d9 d9Var, C0716k1 c0716k1) {
        int b8;
        int a6;
        int a9;
        if (yp.f12451a < 29 || this.l == 0 || (b8 = df.b((String) AbstractC0669a1.a((Object) d9Var.m), d9Var.f7209j)) == 0 || (a6 = yp.a(d9Var.f7223z)) == 0 || (a9 = a(b(d9Var.f7195A, a6, b8), c0716k1.a())) == 0) {
            return false;
        }
        if (a9 == 1) {
            return ((d9Var.f7197C != 0 || d9Var.f7198D != 0) && (this.l == 1)) ? false : true;
        }
        if (a9 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
        int i9 = yp.f12451a;
        if (i9 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            return playbackOffloadSupport;
        }
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (isOffloadedPlaybackSupported) {
            return (i9 == 30 && yp.f12453d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean a(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (yp.f12451a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i9, long j7) {
        if (yp.f12451a >= 26) {
            return audioTrack.write(byteBuffer, i9, 1, j7 * 1000);
        }
        if (this.f10185x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f10185x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f10185x.putInt(1431633921);
        }
        if (this.f10186y == 0) {
            this.f10185x.putInt(4, i9);
            this.f10185x.putLong(8, j7 * 1000);
            this.f10185x.position(0);
            this.f10186y = i9;
        }
        int remaining = this.f10185x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f10185x, remaining, 1);
            if (write < 0) {
                this.f10186y = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int a6 = a(audioTrack, byteBuffer, i9);
        if (a6 < 0) {
            this.f10186y = 0;
            return a6;
        }
        this.f10186y -= a6;
        return a6;
    }
}
