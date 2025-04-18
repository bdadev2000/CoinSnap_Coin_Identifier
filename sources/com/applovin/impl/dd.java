package com.applovin.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.applovin.impl.cd;
import com.applovin.impl.d9;
import com.applovin.impl.li;
import com.applovin.impl.p1;
import com.applovin.impl.q1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class dd extends gd implements bd {
    private final Context J0;
    private final p1.a K0;
    private final q1 L0;
    private int M0;
    private boolean N0;
    private d9 O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private li.a U0;

    public dd(Context context, cd.b bVar, hd hdVar, boolean z10, Handler handler, p1 p1Var, q1 q1Var) {
        super(1, bVar, hdVar, z10, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = q1Var;
        this.K0 = new p1.a(handler, p1Var);
        q1Var.a(new b());
    }

    private static boolean c0() {
        if (yp.a == 23) {
            String str = yp.f9255d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void e0() {
        long a10 = this.L0.a(c());
        if (a10 != Long.MIN_VALUE) {
            if (!this.R0) {
                a10 = Math.max(this.P0, a10);
            }
            this.P0 = a10;
            this.R0 = false;
        }
    }

    private static boolean h(String str) {
        if (yp.a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(yp.f9254c)) {
            String str2 = yp.f9253b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.gd
    public void Q() {
        super.Q();
        this.L0.i();
    }

    @Override // com.applovin.impl.gd
    public void V() {
        try {
            this.L0.f();
        } catch (q1.e e2) {
            throw a(e2, e2.f7069c, e2.f7068b, 5002);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean c() {
        return super.c() && this.L0.c();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        return this.L0.g() || super.d();
    }

    public void d0() {
        this.R0 = true;
    }

    @Override // com.applovin.impl.gd
    public void g(String str) {
        this.K0.a(str);
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.li
    public bd l() {
        return this;
    }

    @Override // com.applovin.impl.bd
    public long p() {
        if (b() == 2) {
            e0();
        }
        return this.P0;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void v() {
        this.S0 = true;
        try {
            this.L0.b();
            try {
                super.v();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.v();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
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

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void x() {
        super.x();
        this.L0.j();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void y() {
        e0();
        this.L0.pause();
        super.y();
    }

    /* loaded from: classes.dex */
    public final class b implements q1.c {
        private b() {
        }

        @Override // com.applovin.impl.q1.c
        public void a(Exception exc) {
            kc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            dd.this.K0.b(exc);
        }

        @Override // com.applovin.impl.q1.c
        public void b(long j3) {
            if (dd.this.U0 != null) {
                dd.this.U0.a(j3);
            }
        }

        @Override // com.applovin.impl.q1.c
        public void a() {
            if (dd.this.U0 != null) {
                dd.this.U0.a();
            }
        }

        @Override // com.applovin.impl.q1.c
        public void b() {
            dd.this.d0();
        }

        @Override // com.applovin.impl.q1.c
        public void a(long j3) {
            dd.this.K0.b(j3);
        }

        @Override // com.applovin.impl.q1.c
        public void a(boolean z10) {
            dd.this.K0.b(z10);
        }

        @Override // com.applovin.impl.q1.c
        public void a(int i10, long j3, long j10) {
            dd.this.K0.b(i10, j3, j10);
        }
    }

    @Override // com.applovin.impl.gd
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 a10 = fdVar.a(d9Var, d9Var2);
        int i10 = a10.f6456e;
        if (a(fdVar, d9Var2) > this.M0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new o5(fdVar.a, d9Var, d9Var2, i11 != 0 ? 0 : a10.f6455d, i11);
    }

    @Override // com.applovin.impl.gd
    public void b(n5 n5Var) {
        if (!this.Q0 || n5Var.d()) {
            return;
        }
        if (Math.abs(n5Var.f6353f - this.P0) > 500000) {
            this.P0 = n5Var.f6353f;
        }
        this.Q0 = false;
    }

    @Override // com.applovin.impl.gd
    public boolean c(d9 d9Var) {
        return this.L0.a(d9Var);
    }

    public dd(Context context, hd hdVar, boolean z10, Handler handler, p1 p1Var, q1 q1Var) {
        this(context, cd.b.a, hdVar, z10, handler, p1Var, q1Var);
    }

    private int a(fd fdVar, d9 d9Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(fdVar.a) || (i10 = yp.a) >= 24 || (i10 == 23 && yp.d(this.J0))) {
            return d9Var.f4229n;
        }
        return -1;
    }

    public int a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a10 = a(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            return a10;
        }
        for (d9 d9Var2 : d9VarArr) {
            if (fdVar.a(d9Var, d9Var2).f6455d != 0) {
                a10 = Math.max(a10, a(fdVar, d9Var2));
            }
        }
        return a10;
    }

    @Override // com.applovin.impl.gd
    public float a(float f10, d9 d9Var, d9[] d9VarArr) {
        int i10 = -1;
        for (d9 d9Var2 : d9VarArr) {
            int i11 = d9Var2.A;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // com.applovin.impl.gd
    public List a(hd hdVar, d9 d9Var, boolean z10) {
        fd a10;
        String str = d9Var.f4228m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.L0.a(d9Var) && (a10 = id.a()) != null) {
            return Collections.singletonList(a10);
        }
        List a11 = id.a(hdVar.a(str, z10, false), d9Var);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(a11);
            arrayList.addAll(hdVar.a(MimeTypes.AUDIO_E_AC3, z10, false));
            a11 = arrayList;
        }
        return Collections.unmodifiableList(a11);
    }

    @Override // com.applovin.impl.gd
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10) {
        this.M0 = a(fdVar, d9Var, t());
        this.N0 = h(fdVar.a);
        MediaFormat a10 = a(d9Var, fdVar.f4685c, this.M0, f10);
        this.O0 = (!MimeTypes.AUDIO_RAW.equals(fdVar.f4684b) || MimeTypes.AUDIO_RAW.equals(d9Var.f4228m)) ? null : d9Var;
        return cd.a.a(fdVar, a10, d9Var, mediaCrypto);
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.L0.a();
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i10, Object obj) {
        if (i10 == 2) {
            this.L0.a(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.L0.a((k1) obj);
            return;
        }
        if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.L0.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.L0.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.U0 = (li.a) obj;
                    return;
                default:
                    super.a(i10, obj);
                    return;
            }
        }
        this.L0.a((u1) obj);
    }

    @Override // com.applovin.impl.gd
    public void a(Exception exc) {
        kc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    @Override // com.applovin.impl.gd
    public void a(String str, long j3, long j10) {
        this.K0.a(str, j3, j10);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        this.K0.b(this.E0);
        if (q().a) {
            this.L0.e();
        } else {
            this.L0.d();
        }
    }

    @Override // com.applovin.impl.gd
    public o5 a(e9 e9Var) {
        o5 a10 = super.a(e9Var);
        this.K0.a(e9Var.f4413b, a10);
        return a10;
    }

    @Override // com.applovin.impl.gd
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        d9 d9Var2 = this.O0;
        int[] iArr = null;
        if (d9Var2 != null) {
            d9Var = d9Var2;
        } else if (I() != null) {
            if (MimeTypes.AUDIO_RAW.equals(d9Var.f4228m)) {
                i10 = d9Var.B;
            } else if (yp.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = yp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = MimeTypes.AUDIO_RAW.equals(d9Var.f4228m) ? d9Var.B : 2;
            }
            d9 a10 = new d9.b().f(MimeTypes.AUDIO_RAW).j(i10).e(d9Var.C).f(d9Var.D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.N0 && a10.f4240z == 6 && (i11 = d9Var.f4240z) < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < d9Var.f4240z; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            }
            d9Var = a10;
        }
        try {
            this.L0.a(d9Var, 0, iArr);
        } catch (q1.a e2) {
            throw a(e2, e2.a, 5001);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    public void a(long j3, boolean z10) {
        super.a(j3, z10);
        if (this.T0) {
            this.L0.h();
        } else {
            this.L0.b();
        }
        this.P0 = j3;
        this.Q0 = true;
        this.R0 = true;
    }

    @Override // com.applovin.impl.gd
    public boolean a(long j3, long j10, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, d9 d9Var) {
        a1.a(byteBuffer);
        if (this.O0 != null && (i11 & 2) != 0) {
            ((cd) a1.a(cdVar)).a(i10, false);
            return true;
        }
        if (z10) {
            if (cdVar != null) {
                cdVar.a(i10, false);
            }
            this.E0.f5847f += i12;
            this.L0.i();
            return true;
        }
        try {
            if (!this.L0.a(byteBuffer, j11, i12)) {
                return false;
            }
            if (cdVar != null) {
                cdVar.a(i10, false);
            }
            this.E0.f5846e += i12;
            return true;
        } catch (q1.b e2) {
            throw a(e2, e2.f7066c, e2.f7065b, 5001);
        } catch (q1.e e10) {
            throw a(e10, d9Var, e10.f7068b, 5002);
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        this.L0.a(mhVar);
    }

    @Override // com.applovin.impl.gd
    public int a(hd hdVar, d9 d9Var) {
        if (!df.g(d9Var.f4228m)) {
            return mi.a(0);
        }
        int i10 = yp.a >= 21 ? 32 : 0;
        boolean z10 = d9Var.F != 0;
        boolean d10 = gd.d(d9Var);
        int i11 = 8;
        if (d10 && this.L0.a(d9Var) && (!z10 || id.a() != null)) {
            return mi.a(4, 8, i10);
        }
        if (MimeTypes.AUDIO_RAW.equals(d9Var.f4228m) && !this.L0.a(d9Var)) {
            return mi.a(1);
        }
        if (!this.L0.a(yp.b(2, d9Var.f4240z, d9Var.A))) {
            return mi.a(1);
        }
        List a10 = a(hdVar, d9Var, false);
        if (a10.isEmpty()) {
            return mi.a(1);
        }
        if (!d10) {
            return mi.a(2);
        }
        fd fdVar = (fd) a10.get(0);
        boolean b3 = fdVar.b(d9Var);
        if (b3 && fdVar.c(d9Var)) {
            i11 = 16;
        }
        return mi.a(b3 ? 4 : 3, i11, i10);
    }

    public MediaFormat a(d9 d9Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", d9Var.f4240z);
        mediaFormat.setInteger("sample-rate", d9Var.A);
        nd.a(mediaFormat, d9Var.f4230o);
        nd.a(mediaFormat, "max-input-size", i10);
        int i11 = yp.a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(d9Var.f4228m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.L0.b(yp.b(4, d9Var.f4240z, d9Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
