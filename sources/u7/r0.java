package u7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s7.b2;

/* loaded from: classes3.dex */
public final class r0 implements w {

    /* renamed from: g0, reason: collision with root package name */
    public static final Object f25606g0 = new Object();

    /* renamed from: h0, reason: collision with root package name */
    public static ExecutorService f25607h0;

    /* renamed from: i0, reason: collision with root package name */
    public static int f25608i0;
    public l0 A;
    public b2 B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public a0 Y;
    public h0 Z;
    public final Context a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f25609a0;

    /* renamed from: b, reason: collision with root package name */
    public final h.c f25610b;

    /* renamed from: b0, reason: collision with root package name */
    public long f25611b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25612c;

    /* renamed from: c0, reason: collision with root package name */
    public long f25613c0;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f25614d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f25615d0;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f25616e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f25617e0;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f25618f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f25619f0;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f25620g;

    /* renamed from: h, reason: collision with root package name */
    public final a4.g0 f25621h;

    /* renamed from: i, reason: collision with root package name */
    public final z f25622i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f25623j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25624k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25625l;

    /* renamed from: m, reason: collision with root package name */
    public q0 f25626m;

    /* renamed from: n, reason: collision with root package name */
    public final m0 f25627n;

    /* renamed from: o, reason: collision with root package name */
    public final m0 f25628o;

    /* renamed from: p, reason: collision with root package name */
    public final s0 f25629p;

    /* renamed from: q, reason: collision with root package name */
    public t7.x f25630q;

    /* renamed from: r, reason: collision with root package name */
    public f.a f25631r;

    /* renamed from: s, reason: collision with root package name */
    public k0 f25632s;

    /* renamed from: t, reason: collision with root package name */
    public k0 f25633t;
    public m u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f25634v;

    /* renamed from: w, reason: collision with root package name */
    public h f25635w;

    /* renamed from: x, reason: collision with root package name */
    public l f25636x;

    /* renamed from: y, reason: collision with root package name */
    public e f25637y;

    /* renamed from: z, reason: collision with root package name */
    public l0 f25638z;

    public r0(j0 j0Var) {
        h hVar;
        boolean z10;
        int i10;
        Context context = j0Var.a;
        this.a = context;
        if (context != null) {
            hVar = h.a(context);
        } else {
            hVar = j0Var.f25562b;
        }
        this.f25635w = hVar;
        this.f25610b = j0Var.f25563c;
        int i11 = n9.h0.a;
        if (i11 >= 21 && j0Var.f25564d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25612c = z10;
        this.f25624k = i11 >= 23 && j0Var.f25565e;
        if (i11 >= 29) {
            i10 = j0Var.f25566f;
        } else {
            i10 = 0;
        }
        this.f25625l = i10;
        this.f25629p = j0Var.f25567g;
        a4.g0 g0Var = new a4.g0();
        this.f25621h = g0Var;
        g0Var.c();
        this.f25622i = new z(new n0(this));
        c0 c0Var = new c0();
        this.f25614d = c0Var;
        a1 a1Var = new a1();
        this.f25616e = a1Var;
        this.f25618f = com.google.common.collect.r0.q(new z0(), c0Var, a1Var);
        this.f25620g = com.google.common.collect.r0.o(new y0());
        this.N = 1.0f;
        this.f25637y = e.f25551i;
        this.X = 0;
        this.Y = new a0();
        b2 b2Var = b2.f24301f;
        this.A = new l0(b2Var, 0L, 0L);
        this.B = b2Var;
        this.C = false;
        this.f25623j = new ArrayDeque();
        this.f25627n = new m0();
        this.f25628o = new m0();
    }

    public static AudioFormat f(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        return n9.h0.a >= 29 && ba.a.w(audioTrack);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r16) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r0.a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        if ((r3 & r6) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:
    
        if (r22 > 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018a, code lost:
    
        if (r5 > 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r5 < 0) goto L95;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x015a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(s7.r0 r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r0.b(s7.r0, int[]):void");
    }

    public final boolean c() {
        if (!this.u.c()) {
            ByteBuffer byteBuffer = this.Q;
            if (byteBuffer == null) {
                return true;
            }
            x(byteBuffer, Long.MIN_VALUE);
            if (this.Q != null) {
                return false;
            }
            return true;
        }
        m mVar = this.u;
        if (mVar.c() && !mVar.f25590d) {
            mVar.f25590d = true;
            ((p) mVar.f25588b.get(0)).queueEndOfStream();
        }
        p(Long.MIN_VALUE);
        if (!this.u.b()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    public final void d() {
        boolean z10;
        if (m()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.f25617e0 = false;
            this.J = 0;
            this.A = new l0(this.B, 0L, 0L);
            this.M = 0L;
            this.f25638z = null;
            this.f25623j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.f25616e.f25535o = 0L;
            u();
            AudioTrack audioTrack = this.f25622i.f25714c;
            audioTrack.getClass();
            int i10 = 1;
            if (audioTrack.getPlayState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f25634v.pause();
            }
            if (n(this.f25634v)) {
                q0 q0Var = this.f25626m;
                q0Var.getClass();
                this.f25634v.unregisterStreamEventCallback(q0Var.f25601b);
                q0Var.a.removeCallbacksAndMessages(null);
            }
            if (n9.h0.a < 21 && !this.W) {
                this.X = 0;
            }
            k0 k0Var = this.f25632s;
            if (k0Var != null) {
                this.f25633t = k0Var;
                this.f25632s = null;
            }
            z zVar = this.f25622i;
            zVar.d();
            zVar.f25714c = null;
            zVar.f25717f = null;
            AudioTrack audioTrack2 = this.f25634v;
            a4.g0 g0Var = this.f25621h;
            synchronized (g0Var) {
                g0Var.a = false;
            }
            synchronized (f25606g0) {
                try {
                    if (f25607h0 == null) {
                        f25607h0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", i10));
                    }
                    f25608i0++;
                    f25607h0.execute(new com.facebook.r0(16, audioTrack2, g0Var));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f25634v = null;
        }
        this.f25628o.a = null;
        this.f25627n.a = null;
    }

    public final h e() {
        Context context;
        h b3;
        j jVar;
        if (this.f25636x == null && (context = this.a) != null) {
            this.f25619f0 = Looper.myLooper();
            l lVar = new l(context, new d0(this));
            this.f25636x = lVar;
            if (lVar.f25585h) {
                b3 = lVar.f25584g;
                b3.getClass();
            } else {
                lVar.f25585h = true;
                k kVar = lVar.f25583f;
                if (kVar != null) {
                    kVar.a.registerContentObserver(kVar.f25568b, false, kVar);
                }
                int i10 = n9.h0.a;
                Handler handler = lVar.f25580c;
                Context context2 = lVar.a;
                if (i10 >= 23 && (jVar = lVar.f25581d) != null) {
                    i.a(context2, jVar, handler);
                }
                h.c0 c0Var = lVar.f25582e;
                Intent intent = null;
                if (c0Var != null) {
                    intent = context2.registerReceiver(c0Var, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                b3 = h.b(context2, intent);
                lVar.f25584g = b3;
            }
            this.f25635w = b3;
        }
        return this.f25635w;
    }

    public final int g(s7.r0 r0Var) {
        boolean z10 = true;
        if (MimeTypes.AUDIO_RAW.equals(r0Var.f24723n)) {
            int i10 = r0Var.C;
            if (!n9.h0.F(i10)) {
                n9.o.f("DefaultAudioSink", "Invalid PCM encoding: " + i10);
                return 0;
            }
            if (i10 != 2 && (!this.f25612c || i10 != 4)) {
                return 1;
            }
            return 2;
        }
        if (!this.f25615d0 && w(r0Var, this.f25637y)) {
            return 2;
        }
        if (e().c(r0Var) == null) {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        return 2;
    }

    public final long h() {
        if (this.f25633t.f25571c == 0) {
            return this.F / r0.f25570b;
        }
        return this.G;
    }

    public final long i() {
        if (this.f25633t.f25571c == 0) {
            return this.H / r0.f25572d;
        }
        return this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0105, code lost:
    
        if (r8.b() == 0) goto L69;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x017d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0321 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r0.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        if (m() && this.f25622i.c(i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r0.l():boolean");
    }

    public final boolean m() {
        return this.f25634v != null;
    }

    public final void o() {
        if (!this.U) {
            this.U = true;
            long i10 = i();
            z zVar = this.f25622i;
            zVar.A = zVar.b();
            zVar.f25735y = SystemClock.elapsedRealtime() * 1000;
            zVar.B = i10;
            this.f25634v.stop();
            this.E = 0;
        }
    }

    public final void p(long j3) {
        ByteBuffer byteBuffer;
        if (!this.u.c()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                byteBuffer2 = p.a;
            }
            x(byteBuffer2, j3);
            return;
        }
        while (!this.u.b()) {
            do {
                m mVar = this.u;
                if (!mVar.c()) {
                    byteBuffer = p.a;
                } else {
                    ByteBuffer byteBuffer3 = mVar.f25589c[r1.length - 1];
                    if (!byteBuffer3.hasRemaining()) {
                        mVar.d(p.a);
                    }
                    byteBuffer = byteBuffer3;
                }
                if (byteBuffer.hasRemaining()) {
                    x(byteBuffer, j3);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 != null && byteBuffer4.hasRemaining()) {
                        m mVar2 = this.u;
                        ByteBuffer byteBuffer5 = this.O;
                        if (mVar2.c() && !mVar2.f25590d) {
                            mVar2.d(byteBuffer5);
                        }
                    } else {
                        return;
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void q() {
        d();
        com.google.common.collect.n0 listIterator = this.f25618f.listIterator(0);
        while (listIterator.hasNext()) {
            ((p) listIterator.next()).reset();
        }
        com.google.common.collect.n0 listIterator2 = this.f25620g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((p) listIterator2.next()).reset();
        }
        m mVar = this.u;
        if (mVar != null) {
            int i10 = 0;
            while (true) {
                com.google.common.collect.r0 r0Var = mVar.a;
                if (i10 >= r0Var.size()) {
                    break;
                }
                p pVar = (p) r0Var.get(i10);
                pVar.flush();
                pVar.reset();
                i10++;
            }
            mVar.f25589c = new ByteBuffer[0];
            n nVar = n.f25592e;
            mVar.f25590d = false;
        }
        this.V = false;
        this.f25615d0 = false;
    }

    public final void r(b2 b2Var) {
        l0 l0Var = new l0(b2Var, C.TIME_UNSET, C.TIME_UNSET);
        if (m()) {
            this.f25638z = l0Var;
        } else {
            this.A = l0Var;
        }
    }

    public final void s() {
        if (m()) {
            try {
                this.f25634v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.f24302b).setPitch(this.B.f24303c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                n9.o.g("DefaultAudioSink", "Failed to set playback params", e2);
            }
            b2 b2Var = new b2(this.f25634v.getPlaybackParams().getSpeed(), this.f25634v.getPlaybackParams().getPitch());
            this.B = b2Var;
            z zVar = this.f25622i;
            zVar.f25721j = b2Var.f24302b;
            y yVar = zVar.f25717f;
            if (yVar != null) {
                yVar.a();
            }
            zVar.d();
        }
    }

    public final void t() {
        if (m()) {
            if (n9.h0.a >= 21) {
                this.f25634v.setVolume(this.N);
                return;
            }
            AudioTrack audioTrack = this.f25634v;
            float f10 = this.N;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final void u() {
        m mVar = this.f25633t.f25577i;
        this.u = mVar;
        ArrayList arrayList = mVar.f25588b;
        arrayList.clear();
        int i10 = 0;
        mVar.f25590d = false;
        int i11 = 0;
        while (true) {
            com.google.common.collect.r0 r0Var = mVar.a;
            if (i11 >= r0Var.size()) {
                break;
            }
            p pVar = (p) r0Var.get(i11);
            pVar.flush();
            if (pVar.isActive()) {
                arrayList.add(pVar);
            }
            i11++;
        }
        mVar.f25589c = new ByteBuffer[arrayList.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = mVar.f25589c;
            if (i10 <= byteBufferArr.length - 1) {
                byteBufferArr[i10] = ((p) arrayList.get(i10)).getOutput();
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean v() {
        k0 k0Var = this.f25633t;
        return k0Var != null && k0Var.f25578j && n9.h0.a >= 23;
    }

    public final boolean w(s7.r0 r0Var, e eVar) {
        int i10;
        int m10;
        int i11;
        boolean z10;
        boolean z11;
        int i12 = n9.h0.a;
        if (i12 < 29 || (i10 = this.f25625l) == 0) {
            return false;
        }
        String str = r0Var.f24723n;
        str.getClass();
        int c10 = n9.q.c(str, r0Var.f24720k);
        if (c10 == 0 || (m10 = n9.h0.m(r0Var.A)) == 0) {
            return false;
        }
        AudioFormat f10 = f(r0Var.B, m10, c10);
        AudioAttributes audioAttributes = (AudioAttributes) eVar.a().f20640c;
        if (i12 >= 31) {
            i11 = androidx.core.app.c.b(f10, audioAttributes);
        } else if (!ba.a.A(f10, audioAttributes)) {
            i11 = 0;
        } else if (i12 == 30 && n9.h0.f22546d.startsWith("Pixel")) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        if (i11 == 0) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (r0Var.D == 0 && r0Var.E == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ee, code lost:
    
        if (r15 < r14) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.nio.ByteBuffer r13, long r14) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r0.x(java.nio.ByteBuffer, long):void");
    }
}
