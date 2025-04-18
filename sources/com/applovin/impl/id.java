package com.applovin.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.impl.f9;
import com.applovin.impl.hd;
import com.applovin.impl.q1;
import com.applovin.impl.qi;
import com.applovin.impl.r1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class id extends ld implements gd {
    private final Context J0;
    private final q1.a K0;
    private final r1 L0;
    private int M0;
    private boolean N0;
    private f9 O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private qi.a U0;

    public id(Context context, hd.b bVar, md mdVar, boolean z2, Handler handler, q1 q1Var, r1 r1Var) {
        super(1, bVar, mdVar, z2, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = r1Var;
        this.K0 = new q1.a(handler, q1Var);
        r1Var.a(new b());
    }

    private static boolean c0() {
        if (xp.f27962a == 23) {
            String str = xp.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void e0() {
        long a2 = this.L0.a(c());
        if (a2 != Long.MIN_VALUE) {
            if (!this.R0) {
                a2 = Math.max(this.P0, a2);
            }
            this.P0 = a2;
            this.R0 = false;
        }
    }

    private static boolean h(String str) {
        if (xp.f27962a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(xp.f27964c)) {
            String str2 = xp.f27963b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.ld
    public void Q() {
        super.Q();
        this.L0.i();
    }

    @Override // com.applovin.impl.ld
    public void V() {
        try {
            this.L0.f();
        } catch (r1.e e) {
            throw a(e, e.f26252c, e.f26251b, 5002);
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.qi
    public boolean c() {
        return super.c() && this.L0.c();
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.qi
    public boolean d() {
        return this.L0.g() || super.d();
    }

    public void d0() {
        this.R0 = true;
    }

    @Override // com.applovin.impl.ld
    public void g(String str) {
        this.K0.a(str);
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.qi
    public gd l() {
        return this;
    }

    @Override // com.applovin.impl.gd
    public long p() {
        if (b() == 2) {
            e0();
        }
        return this.P0;
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void v() {
        this.S0 = true;
        try {
            this.L0.b();
            try {
                super.v();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.v();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void w() {
        try {
            super.w();
        } finally {
            if (this.S0) {
                this.S0 = false;
                this.L0.reset();
            }
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void x() {
        super.x();
        this.L0.j();
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void y() {
        e0();
        this.L0.pause();
        super.y();
    }

    /* loaded from: classes.dex */
    public final class b implements r1.c {
        private b() {
        }

        @Override // com.applovin.impl.r1.c
        public void a(Exception exc) {
            pc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            id.this.K0.b(exc);
        }

        @Override // com.applovin.impl.r1.c
        public void b(long j2) {
            if (id.this.U0 != null) {
                id.this.U0.a(j2);
            }
        }

        @Override // com.applovin.impl.r1.c
        public void a() {
            if (id.this.U0 != null) {
                id.this.U0.a();
            }
        }

        @Override // com.applovin.impl.r1.c
        public void b() {
            id.this.d0();
        }

        @Override // com.applovin.impl.r1.c
        public void a(long j2) {
            id.this.K0.b(j2);
        }

        @Override // com.applovin.impl.r1.c
        public void a(boolean z2) {
            id.this.K0.b(z2);
        }

        @Override // com.applovin.impl.r1.c
        public void a(int i2, long j2, long j3) {
            id.this.K0.b(i2, j2, j3);
        }
    }

    @Override // com.applovin.impl.ld
    public q5 a(kd kdVar, f9 f9Var, f9 f9Var2) {
        q5 a2 = kdVar.a(f9Var, f9Var2);
        int i2 = a2.e;
        if (a(kdVar, f9Var2) > this.M0) {
            i2 |= 64;
        }
        int i3 = i2;
        return new q5(kdVar.f24873a, f9Var, f9Var2, i3 != 0 ? 0 : a2.d, i3);
    }

    @Override // com.applovin.impl.ld
    public void b(p5 p5Var) {
        if (!this.Q0 || p5Var.d()) {
            return;
        }
        if (Math.abs(p5Var.f25964f - this.P0) > 500000) {
            this.P0 = p5Var.f25964f;
        }
        this.Q0 = false;
    }

    @Override // com.applovin.impl.ld
    public boolean c(f9 f9Var) {
        return this.L0.a(f9Var);
    }

    public id(Context context, md mdVar, boolean z2, Handler handler, q1 q1Var, r1 r1Var) {
        this(context, hd.b.f24309a, mdVar, z2, handler, q1Var, r1Var);
    }

    private int a(kd kdVar, f9 f9Var) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(kdVar.f24873a) || (i2 = xp.f27962a) >= 24 || (i2 == 23 && xp.d(this.J0))) {
            return f9Var.f23841n;
        }
        return -1;
    }

    public int a(kd kdVar, f9 f9Var, f9[] f9VarArr) {
        int a2 = a(kdVar, f9Var);
        if (f9VarArr.length == 1) {
            return a2;
        }
        for (f9 f9Var2 : f9VarArr) {
            if (kdVar.a(f9Var, f9Var2).d != 0) {
                a2 = Math.max(a2, a(kdVar, f9Var2));
            }
        }
        return a2;
    }

    @Override // com.applovin.impl.ld
    public float a(float f2, f9 f9Var, f9[] f9VarArr) {
        int i2 = -1;
        for (f9 f9Var2 : f9VarArr) {
            int i3 = f9Var2.A;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return f2 * i2;
    }

    @Override // com.applovin.impl.ld
    public List a(md mdVar, f9 f9Var, boolean z2) {
        kd a2;
        String str = f9Var.f23840m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.L0.a(f9Var) && (a2 = nd.a()) != null) {
            return Collections.singletonList(a2);
        }
        List a3 = nd.a(mdVar.a(str, z2, false), f9Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a3);
            arrayList.addAll(mdVar.a("audio/eac3", z2, false));
            a3 = arrayList;
        }
        return Collections.unmodifiableList(a3);
    }

    @Override // com.applovin.impl.ld
    public hd.a a(kd kdVar, f9 f9Var, MediaCrypto mediaCrypto, float f2) {
        this.M0 = a(kdVar, f9Var, t());
        this.N0 = h(kdVar.f24873a);
        MediaFormat a2 = a(f9Var, kdVar.f24875c, this.M0, f2);
        this.O0 = (!"audio/raw".equals(kdVar.f24874b) || "audio/raw".equals(f9Var.f23840m)) ? null : f9Var;
        return hd.a.a(kdVar, a2, f9Var, mediaCrypto);
    }

    @Override // com.applovin.impl.gd
    public ph a() {
        return this.L0.a();
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i2, Object obj) {
        if (i2 == 2) {
            this.L0.a(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.L0.a((l1) obj);
            return;
        }
        if (i2 != 6) {
            switch (i2) {
                case 9:
                    this.L0.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.L0.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.U0 = (qi.a) obj;
                    return;
                default:
                    super.a(i2, obj);
                    return;
            }
        }
        this.L0.a((v1) obj);
    }

    @Override // com.applovin.impl.ld
    public void a(Exception exc) {
        pc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    @Override // com.applovin.impl.ld
    public void a(String str, long j2, long j3) {
        this.K0.a(str, j2, j3);
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void a(boolean z2, boolean z3) {
        super.a(z2, z3);
        this.K0.b(this.E0);
        if (q().f26902a) {
            this.L0.e();
        } else {
            this.L0.d();
        }
    }

    @Override // com.applovin.impl.ld
    public q5 a(g9 g9Var) {
        q5 a2 = super.a(g9Var);
        this.K0.a(g9Var.f24058b, a2);
        return a2;
    }

    @Override // com.applovin.impl.ld
    public void a(f9 f9Var, MediaFormat mediaFormat) {
        int i2;
        int i3;
        f9 f9Var2 = this.O0;
        int[] iArr = null;
        if (f9Var2 != null) {
            f9Var = f9Var2;
        } else if (I() != null) {
            if ("audio/raw".equals(f9Var.f23840m)) {
                i2 = f9Var.B;
            } else if (xp.f27962a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i2 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i2 = xp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i2 = "audio/raw".equals(f9Var.f23840m) ? f9Var.B : 2;
            }
            f9 a2 = new f9.b().f("audio/raw").j(i2).e(f9Var.C).f(f9Var.D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.N0 && a2.f23851z == 6 && (i3 = f9Var.f23851z) < 6) {
                iArr = new int[i3];
                for (int i4 = 0; i4 < f9Var.f23851z; i4++) {
                    iArr[i4] = i4;
                }
            }
            f9Var = a2;
        }
        try {
            this.L0.a(f9Var, 0, iArr);
        } catch (r1.a e) {
            throw a(e, e.f26244a, 5001);
        }
    }

    @Override // com.applovin.impl.ld, com.applovin.impl.e2
    public void a(long j2, boolean z2) {
        super.a(j2, z2);
        if (this.T0) {
            this.L0.h();
        } else {
            this.L0.b();
        }
        this.P0 = j2;
        this.Q0 = true;
        this.R0 = true;
    }

    @Override // com.applovin.impl.ld
    public boolean a(long j2, long j3, hd hdVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z2, boolean z3, f9 f9Var) {
        b1.a(byteBuffer);
        if (this.O0 != null && (i3 & 2) != 0) {
            ((hd) b1.a(hdVar)).a(i2, false);
            return true;
        }
        if (z2) {
            if (hdVar != null) {
                hdVar.a(i2, false);
            }
            this.E0.f25672f += i4;
            this.L0.i();
            return true;
        }
        try {
            if (!this.L0.a(byteBuffer, j4, i4)) {
                return false;
            }
            if (hdVar != null) {
                hdVar.a(i2, false);
            }
            this.E0.e += i4;
            return true;
        } catch (r1.b e) {
            throw a(e, e.f26247c, e.f26246b, 5001);
        } catch (r1.e e2) {
            throw a(e2, f9Var, e2.f26251b, 5002);
        }
    }

    @Override // com.applovin.impl.gd
    public void a(ph phVar) {
        this.L0.a(phVar);
    }

    @Override // com.applovin.impl.ld
    public int a(md mdVar, f9 f9Var) {
        if (!Cif.g(f9Var.f23840m)) {
            return ri.a(0);
        }
        int i2 = xp.f27962a >= 21 ? 32 : 0;
        boolean z2 = f9Var.F != 0;
        boolean d = ld.d(f9Var);
        int i3 = 8;
        if (d && this.L0.a(f9Var) && (!z2 || nd.a() != null)) {
            return ri.a(4, 8, i2);
        }
        if ("audio/raw".equals(f9Var.f23840m) && !this.L0.a(f9Var)) {
            return ri.a(1);
        }
        if (!this.L0.a(xp.b(2, f9Var.f23851z, f9Var.A))) {
            return ri.a(1);
        }
        List a2 = a(mdVar, f9Var, false);
        if (a2.isEmpty()) {
            return ri.a(1);
        }
        if (!d) {
            return ri.a(2);
        }
        kd kdVar = (kd) a2.get(0);
        boolean b2 = kdVar.b(f9Var);
        if (b2 && kdVar.c(f9Var)) {
            i3 = 16;
        }
        return ri.a(b2 ? 4 : 3, i3, i2);
    }

    public MediaFormat a(f9 f9Var, String str, int i2, float f2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", f9Var.f23851z);
        mediaFormat.setInteger("sample-rate", f9Var.A);
        sd.a(mediaFormat, f9Var.f23842o);
        sd.a(mediaFormat, "max-input-size", i2);
        int i3 = xp.f27962a;
        if (i3 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (i3 <= 28 && "audio/ac4".equals(f9Var.f23840m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i3 >= 24 && this.L0.b(xp.b(4, f9Var.f23851z, f9Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
