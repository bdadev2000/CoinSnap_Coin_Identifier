package com.applovin.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.applovin.impl.InterfaceC0736p1;
import com.applovin.impl.InterfaceC0740q1;
import com.applovin.impl.cd;
import com.applovin.impl.d9;
import com.applovin.impl.li;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class dd extends gd implements bd {

    /* renamed from: J0, reason: collision with root package name */
    private final Context f7275J0;
    private final InterfaceC0736p1.a K0;

    /* renamed from: L0, reason: collision with root package name */
    private final InterfaceC0740q1 f7276L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f7277M0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f7278N0;

    /* renamed from: O0, reason: collision with root package name */
    private d9 f7279O0;
    private long P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f7280Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f7281R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f7282S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f7283T0;

    /* renamed from: U0, reason: collision with root package name */
    private li.a f7284U0;

    public dd(Context context, cd.b bVar, hd hdVar, boolean z8, Handler handler, InterfaceC0736p1 interfaceC0736p1, InterfaceC0740q1 interfaceC0740q1) {
        super(1, bVar, hdVar, z8, 44100.0f);
        this.f7275J0 = context.getApplicationContext();
        this.f7276L0 = interfaceC0740q1;
        this.K0 = new InterfaceC0736p1.a(handler, interfaceC0736p1);
        interfaceC0740q1.a(new b());
    }

    private static boolean c0() {
        if (yp.f12451a == 23) {
            String str = yp.f12453d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void e0() {
        long a6 = this.f7276L0.a(c());
        if (a6 != Long.MIN_VALUE) {
            if (!this.f7281R0) {
                a6 = Math.max(this.P0, a6);
            }
            this.P0 = a6;
            this.f7281R0 = false;
        }
    }

    private static boolean h(String str) {
        if (yp.f12451a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(yp.f12452c)) {
            String str2 = yp.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.gd
    public void Q() {
        super.Q();
        this.f7276L0.i();
    }

    @Override // com.applovin.impl.gd
    public void V() {
        try {
            this.f7276L0.f();
        } catch (InterfaceC0740q1.e e4) {
            throw a(e4, e4.f10127c, e4.b, 5002);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean c() {
        return super.c() && this.f7276L0.c();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        if (!this.f7276L0.g() && !super.d()) {
            return false;
        }
        return true;
    }

    public void d0() {
        this.f7281R0 = true;
    }

    @Override // com.applovin.impl.gd
    public void g(String str) {
        this.K0.a(str);
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.impl.AbstractC0685d2, com.applovin.impl.li
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

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void v() {
        this.f7282S0 = true;
        try {
            this.f7276L0.b();
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

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void w() {
        try {
            super.w();
        } finally {
            if (this.f7282S0) {
                this.f7282S0 = false;
                this.f7276L0.reset();
            }
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void x() {
        super.x();
        this.f7276L0.j();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void y() {
        e0();
        this.f7276L0.pause();
        super.y();
    }

    /* loaded from: classes.dex */
    public final class b implements InterfaceC0740q1.c {
        private b() {
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void a(Exception exc) {
            kc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            dd.this.K0.b(exc);
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void b(long j7) {
            if (dd.this.f7284U0 != null) {
                dd.this.f7284U0.a(j7);
            }
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void a() {
            if (dd.this.f7284U0 != null) {
                dd.this.f7284U0.a();
            }
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void b() {
            dd.this.d0();
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void a(long j7) {
            dd.this.K0.b(j7);
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void a(boolean z8) {
            dd.this.K0.b(z8);
        }

        @Override // com.applovin.impl.InterfaceC0740q1.c
        public void a(int i9, long j7, long j9) {
            dd.this.K0.b(i9, j7, j9);
        }
    }

    @Override // com.applovin.impl.gd
    public o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 a6 = fdVar.a(d9Var, d9Var2);
        int i9 = a6.f9386e;
        if (a(fdVar, d9Var2) > this.f7277M0) {
            i9 |= 64;
        }
        int i10 = i9;
        return new o5(fdVar.f7633a, d9Var, d9Var2, i10 != 0 ? 0 : a6.f9385d, i10);
    }

    @Override // com.applovin.impl.gd
    public void b(n5 n5Var) {
        if (!this.f7280Q0 || n5Var.d()) {
            return;
        }
        if (Math.abs(n5Var.f9275f - this.P0) > 500000) {
            this.P0 = n5Var.f9275f;
        }
        this.f7280Q0 = false;
    }

    @Override // com.applovin.impl.gd
    public boolean c(d9 d9Var) {
        return this.f7276L0.a(d9Var);
    }

    public dd(Context context, hd hdVar, boolean z8, Handler handler, InterfaceC0736p1 interfaceC0736p1, InterfaceC0740q1 interfaceC0740q1) {
        this(context, cd.b.f7084a, hdVar, z8, handler, interfaceC0736p1, interfaceC0740q1);
    }

    private int a(fd fdVar, d9 d9Var) {
        int i9;
        if (!"OMX.google.raw.decoder".equals(fdVar.f7633a) || (i9 = yp.f12451a) >= 24 || (i9 == 23 && yp.d(this.f7275J0))) {
            return d9Var.f7211n;
        }
        return -1;
    }

    public int a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int a6 = a(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            return a6;
        }
        for (d9 d9Var2 : d9VarArr) {
            if (fdVar.a(d9Var, d9Var2).f9385d != 0) {
                a6 = Math.max(a6, a(fdVar, d9Var2));
            }
        }
        return a6;
    }

    @Override // com.applovin.impl.gd
    public float a(float f9, d9 d9Var, d9[] d9VarArr) {
        int i9 = -1;
        for (d9 d9Var2 : d9VarArr) {
            int i10 = d9Var2.f7195A;
            if (i10 != -1) {
                i9 = Math.max(i9, i10);
            }
        }
        if (i9 == -1) {
            return -1.0f;
        }
        return f9 * i9;
    }

    @Override // com.applovin.impl.gd
    public List a(hd hdVar, d9 d9Var, boolean z8) {
        fd a6;
        String str = d9Var.m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f7276L0.a(d9Var) && (a6 = id.a()) != null) {
            return Collections.singletonList(a6);
        }
        List a9 = id.a(hdVar.a(str, z8, false), d9Var);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(a9);
            arrayList.addAll(hdVar.a(MimeTypes.AUDIO_E_AC3, z8, false));
            a9 = arrayList;
        }
        return Collections.unmodifiableList(a9);
    }

    @Override // com.applovin.impl.gd
    public cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f9) {
        this.f7277M0 = a(fdVar, d9Var, t());
        this.f7278N0 = h(fdVar.f7633a);
        MediaFormat a6 = a(d9Var, fdVar.f7634c, this.f7277M0, f9);
        this.f7279O0 = (!MimeTypes.AUDIO_RAW.equals(fdVar.b) || MimeTypes.AUDIO_RAW.equals(d9Var.m)) ? null : d9Var;
        return cd.a.a(fdVar, a6, d9Var, mediaCrypto);
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.f7276L0.a();
    }

    @Override // com.applovin.impl.AbstractC0685d2, com.applovin.impl.oh.b
    public void a(int i9, Object obj) {
        if (i9 == 2) {
            this.f7276L0.a(((Float) obj).floatValue());
            return;
        }
        if (i9 == 3) {
            this.f7276L0.a((C0716k1) obj);
            return;
        }
        if (i9 != 6) {
            switch (i9) {
                case 9:
                    this.f7276L0.b(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f7276L0.a(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f7284U0 = (li.a) obj;
                    return;
                default:
                    super.a(i9, obj);
                    return;
            }
        }
        this.f7276L0.a((C0763u1) obj);
    }

    @Override // com.applovin.impl.gd
    public void a(Exception exc) {
        kc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    @Override // com.applovin.impl.gd
    public void a(String str, long j7, long j9) {
        this.K0.a(str, j7, j9);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void a(boolean z8, boolean z9) {
        super.a(z8, z9);
        this.K0.b(this.f7833E0);
        if (q().f9352a) {
            this.f7276L0.e();
        } else {
            this.f7276L0.d();
        }
    }

    @Override // com.applovin.impl.gd
    public o5 a(e9 e9Var) {
        o5 a6 = super.a(e9Var);
        this.K0.a(e9Var.b, a6);
        return a6;
    }

    @Override // com.applovin.impl.gd
    public void a(d9 d9Var, MediaFormat mediaFormat) {
        int i9;
        int i10;
        d9 d9Var2 = this.f7279O0;
        int[] iArr = null;
        if (d9Var2 != null) {
            d9Var = d9Var2;
        } else if (I() != null) {
            if (MimeTypes.AUDIO_RAW.equals(d9Var.m)) {
                i9 = d9Var.f7196B;
            } else if (yp.f12451a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i9 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i9 = yp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i9 = MimeTypes.AUDIO_RAW.equals(d9Var.m) ? d9Var.f7196B : 2;
            }
            d9 a6 = new d9.b().f(MimeTypes.AUDIO_RAW).j(i9).e(d9Var.f7197C).f(d9Var.f7198D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.f7278N0 && a6.f7223z == 6 && (i10 = d9Var.f7223z) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < d9Var.f7223z; i11++) {
                    iArr[i11] = i11;
                }
            }
            d9Var = a6;
        }
        try {
            this.f7276L0.a(d9Var, 0, iArr);
        } catch (InterfaceC0740q1.a e4) {
            throw a(e4, e4.f10122a, 5001);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.AbstractC0685d2
    public void a(long j7, boolean z8) {
        super.a(j7, z8);
        if (this.f7283T0) {
            this.f7276L0.h();
        } else {
            this.f7276L0.b();
        }
        this.P0 = j7;
        this.f7280Q0 = true;
        this.f7281R0 = true;
    }

    @Override // com.applovin.impl.gd
    public boolean a(long j7, long j9, cd cdVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j10, boolean z8, boolean z9, d9 d9Var) {
        AbstractC0669a1.a(byteBuffer);
        if (this.f7279O0 != null && (i10 & 2) != 0) {
            ((cd) AbstractC0669a1.a(cdVar)).a(i9, false);
            return true;
        }
        if (z8) {
            if (cdVar != null) {
                cdVar.a(i9, false);
            }
            this.f7833E0.f8814f += i11;
            this.f7276L0.i();
            return true;
        }
        try {
            if (!this.f7276L0.a(byteBuffer, j10, i11)) {
                return false;
            }
            if (cdVar != null) {
                cdVar.a(i9, false);
            }
            this.f7833E0.f8813e += i11;
            return true;
        } catch (InterfaceC0740q1.b e4) {
            throw a(e4, e4.f10124c, e4.b, 5001);
        } catch (InterfaceC0740q1.e e9) {
            throw a(e9, d9Var, e9.b, 5002);
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        this.f7276L0.a(mhVar);
    }

    @Override // com.applovin.impl.gd
    public int a(hd hdVar, d9 d9Var) {
        if (!df.g(d9Var.m)) {
            return mi.a(0);
        }
        int i9 = yp.f12451a >= 21 ? 32 : 0;
        boolean z8 = d9Var.f7200F != 0;
        boolean d2 = gd.d(d9Var);
        int i10 = 8;
        if (d2 && this.f7276L0.a(d9Var) && (!z8 || id.a() != null)) {
            return mi.a(4, 8, i9);
        }
        if (MimeTypes.AUDIO_RAW.equals(d9Var.m) && !this.f7276L0.a(d9Var)) {
            return mi.a(1);
        }
        if (!this.f7276L0.a(yp.b(2, d9Var.f7223z, d9Var.f7195A))) {
            return mi.a(1);
        }
        List a6 = a(hdVar, d9Var, false);
        if (a6.isEmpty()) {
            return mi.a(1);
        }
        if (!d2) {
            return mi.a(2);
        }
        fd fdVar = (fd) a6.get(0);
        boolean b8 = fdVar.b(d9Var);
        if (b8 && fdVar.c(d9Var)) {
            i10 = 16;
        }
        return mi.a(b8 ? 4 : 3, i10, i9);
    }

    public MediaFormat a(d9 d9Var, String str, int i9, float f9) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", d9Var.f7223z);
        mediaFormat.setInteger("sample-rate", d9Var.f7195A);
        nd.a(mediaFormat, d9Var.f7212o);
        nd.a(mediaFormat, "max-input-size", i9);
        int i10 = yp.f12451a;
        if (i10 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f9 != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (i10 <= 28 && "audio/ac4".equals(d9Var.m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24 && this.f7276L0.b(yp.b(4, d9Var.f7223z, d9Var.f7195A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
