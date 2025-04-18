package o9;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.iu;
import com.applovin.impl.su;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.n0;
import com.google.common.collect.z1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import n9.h0;
import s7.f0;
import s7.o2;
import s7.q0;
import s7.r0;
import v8.u0;
import v8.z0;

/* loaded from: classes3.dex */
public final class j extends k8.s {

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f23207p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f23208q1;

    /* renamed from: r1, reason: collision with root package name */
    public static boolean f23209r1;
    public final Context H0;
    public final v I0;
    public final h J0;
    public final i K0;
    public final long L0;
    public final int M0;
    public final boolean N0;
    public a8.b O0;
    public boolean P0;
    public boolean Q0;
    public Surface R0;
    public l S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public long Y0;
    public long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f23210a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f23211b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f23212c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f23213d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f23214e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f23215f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f23216g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f23217h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f23218i1;

    /* renamed from: j1, reason: collision with root package name */
    public z f23219j1;

    /* renamed from: k1, reason: collision with root package name */
    public z f23220k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f23221l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f23222m1;

    /* renamed from: n1, reason: collision with root package name */
    public g f23223n1;

    /* renamed from: o1, reason: collision with root package name */
    public p f23224o1;

    public j(Context context, g0.j jVar, boolean z10, Handler handler, f0 f0Var) {
        super(2, jVar, z10, 30.0f);
        this.L0 = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.M0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        v vVar = new v(applicationContext);
        this.I0 = vVar;
        this.J0 = new h(handler, f0Var);
        this.K0 = new i(vVar, this);
        this.N0 = "NVIDIA".equals(h0.f22545c);
        this.Z0 = C.TIME_UNSET;
        this.U0 = 1;
        this.f23219j1 = z.f23275g;
        this.f23222m1 = 0;
        this.f23220k1 = null;
    }

    public static boolean q0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            if (!f23208q1) {
                f23209r1 = r0();
                f23208q1 = true;
            }
        }
        return f23209r1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean r0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.j.r0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r4.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H265) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int s0(s7.r0 r10, k8.o r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.j.s0(s7.r0, k8.o):int");
    }

    public static List t0(Context context, k8.t tVar, r0 r0Var, boolean z10, boolean z11) {
        List e2;
        String str = r0Var.f24723n;
        if (str == null) {
            n0 n0Var = com.google.common.collect.r0.f12026c;
            return z1.f12062g;
        }
        if (h0.a >= 26 && "video/dolby-vision".equals(str) && !f.a(context)) {
            String b3 = k8.z.b(r0Var);
            if (b3 == null) {
                n0 n0Var2 = com.google.common.collect.r0.f12026c;
                e2 = z1.f12062g;
            } else {
                ((hf.d) tVar).getClass();
                e2 = k8.z.e(b3, z10, z11);
            }
            if (!e2.isEmpty()) {
                return e2;
            }
        }
        return k8.z.g(tVar, r0Var, z10, z11);
    }

    public static int u0(r0 r0Var, k8.o oVar) {
        if (r0Var.f24724o != -1) {
            List list = r0Var.f24725p;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return r0Var.f24724o + i10;
        }
        return s0(r0Var, oVar);
    }

    @Override // k8.s
    public final k8.m A(IllegalStateException illegalStateException, k8.o oVar) {
        return new e(illegalStateException, oVar, this.R0);
    }

    public final void A0(k8.l lVar, int i10, long j3) {
        c6.k.c("releaseOutputBuffer");
        lVar.h(i10, j3);
        c6.k.k();
        this.C0.f26881e++;
        this.f23212c1 = 0;
        this.K0.getClass();
        this.f23215f1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.f23219j1);
        w0();
    }

    public final boolean B0(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f24364i == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.X0 ? !this.V0 : !(!z10 && !this.W0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f23215f1;
        if (this.Z0 == C.TIME_UNSET && j3 >= this.D0.f20341b) {
            if (z11) {
                return true;
            }
            if (z10) {
                if (j10 < -30000) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && elapsedRealtime > 100000) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean C0(k8.o oVar) {
        boolean z10;
        if (h0.a < 23 || this.f23221l1 || q0(oVar.a)) {
            return false;
        }
        if (oVar.f20333f) {
            Context context = this.H0;
            int i10 = l.f23230f;
            synchronized (l.class) {
                if (!l.f23231g) {
                    l.f23230f = l.a(context);
                    l.f23231g = true;
                }
                if (l.f23230f != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void D0(k8.l lVar, int i10) {
        c6.k.c("skipVideoBuffer");
        lVar.k(i10, false);
        c6.k.k();
        this.C0.f26882f++;
    }

    public final void E0(int i10, int i11) {
        w7.f fVar = this.C0;
        fVar.f26884h += i10;
        int i12 = i10 + i11;
        fVar.f26883g += i12;
        this.f23211b1 += i12;
        int i13 = this.f23212c1 + i12;
        this.f23212c1 = i13;
        fVar.f26885i = Math.max(i13, fVar.f26885i);
        int i14 = this.M0;
        if (i14 > 0 && this.f23211b1 >= i14) {
            v0();
        }
    }

    public final void F0(long j3) {
        w7.f fVar = this.C0;
        fVar.f26887k += j3;
        fVar.f26888l++;
        this.f23216g1 += j3;
        this.f23217h1++;
    }

    @Override // k8.s
    public final boolean I() {
        return this.f23221l1 && h0.a < 23;
    }

    @Override // k8.s
    public final float J(float f10, r0[] r0VarArr) {
        float f11 = -1.0f;
        for (r0 r0Var : r0VarArr) {
            float f12 = r0Var.u;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // k8.s
    public final ArrayList K(k8.t tVar, r0 r0Var, boolean z10) {
        List t02 = t0(this.H0, tVar, r0Var, z10, this.f23221l1);
        Pattern pattern = k8.z.a;
        ArrayList arrayList = new ArrayList(t02);
        Collections.sort(arrayList, new k8.u(new androidx.core.app.h(r0Var, 24)));
        return arrayList;
    }

    @Override // k8.s
    public final k8.j L(k8.o oVar, r0 r0Var, MediaCrypto mediaCrypto, float f10) {
        String str;
        int i10;
        int i11;
        b bVar;
        a8.b bVar2;
        boolean z10;
        int i12;
        int i13;
        Point point;
        float f11;
        int i14;
        int i15;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i16;
        boolean z11;
        int i17;
        boolean z12;
        Pair d10;
        int s02;
        l lVar = this.S0;
        if (lVar != null && lVar.f23232b != oVar.f20333f) {
            if (this.R0 == lVar) {
                this.R0 = null;
            }
            lVar.release();
            this.S0 = null;
        }
        String str2 = oVar.f20330c;
        r0[] r0VarArr = this.f24366k;
        r0VarArr.getClass();
        int i18 = r0Var.f24728s;
        int u02 = u0(r0Var, oVar);
        int length = r0VarArr.length;
        float f12 = r0Var.u;
        int i19 = r0Var.f24728s;
        b bVar3 = r0Var.f24734z;
        int i20 = r0Var.f24729t;
        if (length == 1) {
            if (u02 != -1 && (s02 = s0(r0Var, oVar)) != -1) {
                u02 = Math.min((int) (u02 * 1.5f), s02);
            }
            bVar2 = new a8.b(i18, i20, u02);
            str = str2;
            i10 = i20;
            i11 = i19;
            bVar = bVar3;
        } else {
            int length2 = r0VarArr.length;
            int i21 = i20;
            int i22 = 0;
            boolean z13 = false;
            while (i22 < length2) {
                r0 r0Var2 = r0VarArr[i22];
                r0[] r0VarArr2 = r0VarArr;
                if (bVar3 != null && r0Var2.f24734z == null) {
                    q0 q0Var = new q0(r0Var2);
                    q0Var.f24678w = bVar3;
                    r0Var2 = new r0(q0Var);
                }
                if (oVar.b(r0Var, r0Var2).f26899d != 0) {
                    int i23 = r0Var2.f24729t;
                    i16 = length2;
                    int i24 = r0Var2.f24728s;
                    if (i24 != -1 && i23 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    int max = Math.max(i18, i24);
                    i21 = Math.max(i21, i23);
                    i18 = max;
                    u02 = Math.max(u02, u0(r0Var2, oVar));
                } else {
                    i16 = length2;
                }
                i22++;
                r0VarArr = r0VarArr2;
                length2 = i16;
            }
            if (z13) {
                n9.o.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i21);
                if (i20 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12 = i20;
                } else {
                    i12 = i19;
                }
                if (z10) {
                    i13 = i19;
                } else {
                    i13 = i20;
                }
                bVar = bVar3;
                i10 = i20;
                float f13 = i13 / i12;
                int[] iArr = f23207p1;
                str = str2;
                i11 = i19;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = iArr[i25];
                    int[] iArr2 = iArr;
                    int i27 = (int) (i26 * f13);
                    if (i26 <= i12 || i27 <= i13) {
                        break;
                    }
                    int i28 = i12;
                    int i29 = i13;
                    if (h0.a >= 21) {
                        if (z10) {
                            i15 = i27;
                        } else {
                            i15 = i26;
                        }
                        if (!z10) {
                            i26 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f20331d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f11 = f13;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f11 = f13;
                            point2 = new Point((((i15 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i26 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        if (oVar.f(point2.x, point2.y, f12)) {
                            point = point2;
                            break;
                        }
                        i25++;
                        iArr = iArr2;
                        i12 = i28;
                        i13 = i29;
                        f13 = f11;
                    } else {
                        f11 = f13;
                        try {
                            int i30 = (((i26 + 16) - 1) / 16) * 16;
                            int i31 = (((i27 + 16) - 1) / 16) * 16;
                            if (i30 * i31 <= k8.z.j()) {
                                if (z10) {
                                    i14 = i31;
                                } else {
                                    i14 = i30;
                                }
                                if (!z10) {
                                    i30 = i31;
                                }
                                point = new Point(i14, i30);
                            } else {
                                i25++;
                                iArr = iArr2;
                                i12 = i28;
                                i13 = i29;
                                f13 = f11;
                            }
                        } catch (k8.w unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i21 = Math.max(i21, point.y);
                    q0 q0Var2 = new q0(r0Var);
                    q0Var2.f24672p = i18;
                    q0Var2.f24673q = i21;
                    u02 = Math.max(u02, s0(new r0(q0Var2), oVar));
                    n9.o.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i21);
                }
            } else {
                str = str2;
                i10 = i20;
                i11 = i19;
                bVar = bVar3;
            }
            bVar2 = new a8.b(i18, i21, u02);
        }
        this.O0 = bVar2;
        if (this.f23221l1) {
            i17 = this.f23222m1;
        } else {
            i17 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        u0.j0(mediaFormat, r0Var.f24725p);
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        u0.T(mediaFormat, "rotation-degrees", r0Var.f24730v);
        if (bVar != null) {
            b bVar4 = bVar;
            u0.T(mediaFormat, "color-transfer", bVar4.f23187d);
            u0.T(mediaFormat, "color-standard", bVar4.f23185b);
            u0.T(mediaFormat, "color-range", bVar4.f23186c);
            byte[] bArr = bVar4.f23188f;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(r0Var.f24723n) && (d10 = k8.z.d(r0Var)) != null) {
            u0.T(mediaFormat, Scopes.PROFILE, ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.a);
        mediaFormat.setInteger("max-height", bVar2.f310b);
        u0.T(mediaFormat, "max-input-size", bVar2.f311c);
        if (h0.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.N0) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (this.R0 == null) {
            if (C0(oVar)) {
                if (this.S0 == null) {
                    this.S0 = l.b(this.H0, oVar.f20333f);
                }
                this.R0 = this.S0;
            } else {
                throw new IllegalStateException();
            }
        }
        this.K0.getClass();
        return new k8.j(oVar, mediaFormat, r0Var, this.R0, mediaCrypto);
    }

    @Override // k8.s
    public final void M(w7.i iVar) {
        if (!this.Q0) {
            return;
        }
        ByteBuffer byteBuffer = iVar.f26893i;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b3 = byteBuffer.get();
            short s5 = byteBuffer.getShort();
            short s10 = byteBuffer.getShort();
            byte b10 = byteBuffer.get();
            byte b11 = byteBuffer.get();
            byteBuffer.position(0);
            if (b3 == -75 && s5 == 60 && s10 == 1 && b10 == 4) {
                if (b11 == 0 || b11 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k8.l lVar = this.L;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    lVar.g(bundle);
                }
            }
        }
    }

    @Override // k8.s
    public final void Q(Exception exc) {
        n9.o.d("MediaCodecVideoRenderer", "Video codec error", exc);
        h hVar = this.J0;
        Handler handler = (Handler) hVar.a;
        if (handler != null) {
            handler.post(new com.facebook.r0(23, hVar, exc));
        }
    }

    @Override // k8.s
    public final void R(String str, long j3, long j10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        h hVar = this.J0;
        Handler handler = (Handler) hVar.a;
        if (handler != null) {
            handler.post(new su(hVar, str, j3, j10, 3));
        }
        this.P0 = q0(str);
        k8.o oVar = this.S;
        oVar.getClass();
        boolean z10 = false;
        if (h0.a >= 29 && MimeTypes.VIDEO_VP9.equals(oVar.f20329b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f20331d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.Q0 = z10;
        int i11 = h0.a;
        if (i11 >= 23 && this.f23221l1) {
            k8.l lVar = this.L;
            lVar.getClass();
            this.f23223n1 = new g(this, lVar);
        }
        Context context = this.K0.a.H0;
        if (i11 >= 29) {
            int i12 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // k8.s
    public final void S(String str) {
        h hVar = this.J0;
        Handler handler = (Handler) hVar.a;
        if (handler != null) {
            handler.post(new com.facebook.r0(21, hVar, str));
        }
    }

    @Override // k8.s
    public final w7.k T(r4.c cVar) {
        w7.k T = super.T(cVar);
        r0 r0Var = (r0) cVar.f24000d;
        h hVar = this.J0;
        Handler handler = (Handler) hVar.a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.n(15, hVar, r0Var, T));
        }
        return T;
    }

    @Override // k8.s
    public final void U(r0 r0Var, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        k8.l lVar = this.L;
        if (lVar != null) {
            lVar.setVideoScalingMode(this.U0);
        }
        boolean z11 = true;
        if (this.f23221l1) {
            i11 = r0Var.f24728s;
            i10 = r0Var.f24729t;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f10 = r0Var.f24731w;
        if (h0.a < 21) {
            z11 = false;
        }
        i iVar = this.K0;
        int i13 = r0Var.f24730v;
        if (z11) {
            if (i13 != 90 && i13 != 270) {
                i13 = 0;
            } else {
                f10 = 1.0f / f10;
                i13 = 0;
                int i14 = i10;
                i10 = i11;
                i11 = i14;
            }
        } else {
            iVar.getClass();
        }
        this.f23219j1 = new z(i11, i10, i13, f10);
        float f11 = r0Var.u;
        v vVar = this.I0;
        vVar.f23256f = f11;
        d dVar = vVar.a;
        dVar.a.c();
        dVar.f23197b.c();
        dVar.f23198c = false;
        dVar.f23199d = C.TIME_UNSET;
        dVar.f23200e = 0;
        vVar.d();
        iVar.getClass();
    }

    @Override // k8.s
    public final void W(long j3) {
        super.W(j3);
        if (!this.f23221l1) {
            this.f23213d1--;
        }
    }

    @Override // k8.s
    public final void X() {
        p0();
    }

    @Override // k8.s
    public final void Y(w7.i iVar) {
        boolean z10 = this.f23221l1;
        if (!z10) {
            this.f23213d1++;
        }
        if (h0.a < 23 && z10) {
            long j3 = iVar.f26892h;
            o0(j3);
            x0(this.f23219j1);
            this.C0.f26881e++;
            w0();
            W(j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    @Override // k8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(s7.r0 r11) {
        /*
            r10 = this;
            o9.i r0 = r10.K0
            r0.getClass()
            k8.r r1 = r10.D0
            long r1 = r1.f20341b
            boolean r1 = r0.f23206d
            if (r1 != 0) goto Le
            goto L15
        Le:
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.f23204b
            r2 = 0
            if (r1 != 0) goto L16
            r0.f23206d = r2
        L15:
            return
        L16:
            r1 = 0
            n9.h0.j(r1)
            r0.getClass()
            o9.b r3 = r11.f24734z
            o9.j r0 = r0.a
            r0.getClass()
            r4 = 1
            r5 = 6
            r6 = 7
            if (r3 == 0) goto L31
            int r7 = r3.f23187d
            if (r7 == r6) goto L2f
            if (r7 != r5) goto L33
        L2f:
            r7 = r4
            goto L34
        L31:
            o9.b r7 = o9.b.f23179h
        L33:
            r7 = r2
        L34:
            if (r7 != 0) goto L3c
            o9.b r3 = o9.b.f23179h
            android.util.Pair.create(r3, r3)
            goto L5b
        L3c:
            int r7 = r3.f23187d
            if (r7 != r6) goto L58
            y7.c0 r6 = new y7.c0
            r6.<init>(r3, r2)
            r6.f27959e = r5
            o9.b r5 = new o9.b
            int r7 = r6.f27956b
            int r8 = r6.f27957c
            int r9 = r6.f27959e
            byte[] r6 = r6.f27958d
            r5.<init>(r7, r8, r9, r6)
            android.util.Pair.create(r3, r5)
            goto L5b
        L58:
            android.util.Pair.create(r3, r3)
        L5b:
            int r3 = n9.h0.a     // Catch: java.lang.Exception -> Lac
            r5 = 21
            if (r3 < r5) goto L63
            r3 = r4
            goto L64
        L63:
            r3 = r2
        L64:
            if (r3 != 0) goto L92
            int r3 = r11.f24730v     // Catch: java.lang.Exception -> Lac
            if (r3 == 0) goto L92
            float r3 = (float) r3     // Catch: java.lang.Exception -> Lac
            v8.u0.Z()     // Catch: java.lang.Exception -> Lac
            java.lang.reflect.Constructor r5 = v8.u0.a     // Catch: java.lang.Exception -> Lac
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lac
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.Exception -> Lac
            java.lang.reflect.Method r6 = v8.u0.f26296b     // Catch: java.lang.Exception -> Lac
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lac
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> Lac
            r4[r2] = r3     // Catch: java.lang.Exception -> Lac
            r6.invoke(r5, r4)     // Catch: java.lang.Exception -> Lac
            java.lang.reflect.Method r3 = v8.u0.f26297c     // Catch: java.lang.Exception -> Lac
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lac
            java.lang.Object r3 = r3.invoke(r5, r4)     // Catch: java.lang.Exception -> Lac
            r3.getClass()     // Catch: java.lang.Exception -> Lac
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(r3)     // Catch: java.lang.Exception -> Lac
            throw r1     // Catch: java.lang.Exception -> Lac
        L92:
            v8.u0.Z()     // Catch: java.lang.Exception -> Lac
            java.lang.reflect.Constructor r3 = v8.u0.f26298d     // Catch: java.lang.Exception -> Lac
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lac
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> Lac
            java.lang.reflect.Method r4 = v8.u0.f26299e     // Catch: java.lang.Exception -> Lac
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lac
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch: java.lang.Exception -> Lac
            r3.getClass()     // Catch: java.lang.Exception -> Lac
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.u(r3)     // Catch: java.lang.Exception -> Lac
            throw r1     // Catch: java.lang.Exception -> Lac
        Lac:
            r1 = move-exception
            r3 = 7000(0x1b58, float:9.809E-42)
            s7.r r11 = r0.c(r3, r11, r1, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.j.Z(s7.r0):void");
    }

    @Override // k8.s
    public final boolean b0(long j3, long j10, k8.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, r0 r0Var) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        lVar.getClass();
        if (this.Y0 == C.TIME_UNSET) {
            this.Y0 = j3;
        }
        long j12 = this.f23214e1;
        i iVar = this.K0;
        v vVar = this.I0;
        if (j11 != j12) {
            iVar.getClass();
            vVar.c(j11);
            this.f23214e1 = j11;
        }
        long j13 = j11 - this.D0.f20341b;
        if (z10 && !z11) {
            D0(lVar, i10);
            return true;
        }
        if (this.f24364i == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j11 - j3) / this.J);
        if (z12) {
            j14 -= elapsedRealtime - j10;
        }
        if (this.R0 == this.S0) {
            if (j14 < -30000) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                D0(lVar, i10);
                F0(j14);
                return true;
            }
            return false;
        }
        if (B0(j3, j14)) {
            iVar.getClass();
            iVar.getClass();
            long nanoTime = System.nanoTime();
            y0(j13, nanoTime, r0Var);
            if (h0.a >= 21) {
                A0(lVar, i10, nanoTime);
            } else {
                z0(lVar, i10);
            }
            F0(j14);
            return true;
        }
        if (z12 && j3 != this.Y0) {
            long nanoTime2 = System.nanoTime();
            long a = vVar.a((j14 * 1000) + nanoTime2);
            iVar.getClass();
            long j15 = (a - nanoTime2) / 1000;
            if (this.Z0 != C.TIME_UNSET) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (j15 < -500000) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14 && !z11) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                z0 z0Var = this.f24365j;
                z0Var.getClass();
                int skipData = z0Var.skipData(j3 - this.f24367l);
                if (skipData == 0) {
                    z19 = false;
                } else {
                    if (z13) {
                        w7.f fVar = this.C0;
                        fVar.f26880d += skipData;
                        fVar.f26882f += this.f23213d1;
                    } else {
                        this.C0.f26886j++;
                        E0(skipData, this.f23213d1);
                    }
                    if (G()) {
                        O();
                    }
                    z19 = true;
                }
                if (z19) {
                    return false;
                }
            }
            if (j15 < -30000) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16 && !z11) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                if (z13) {
                    D0(lVar, i10);
                    z18 = true;
                } else {
                    c6.k.c("dropVideoBuffer");
                    lVar.k(i10, false);
                    c6.k.k();
                    z18 = true;
                    E0(0, 1);
                }
                F0(j15);
                return z18;
            }
            if (h0.a >= 21) {
                if (j15 < 50000) {
                    if (a == this.f23218i1) {
                        D0(lVar, i10);
                    } else {
                        y0(j13, a, r0Var);
                        A0(lVar, i10, a);
                    }
                    F0(j15);
                    this.f23218i1 = a;
                    return true;
                }
                return false;
            }
            if (j15 < 30000) {
                if (j15 > 11000) {
                    try {
                        Thread.sleep((j15 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                y0(j13, a, r0Var);
                z0(lVar, i10);
                F0(j15);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // s7.g
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    @Override // k8.s
    public final void f0() {
        super.f0();
        this.f23213d1 = 0;
    }

    @Override // s7.g
    public final boolean h() {
        boolean z10 = this.f20375y0;
        this.K0.getClass();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [android.view.Surface] */
    @Override // s7.g, s7.i2
    public final void handleMessage(int i10, Object obj) {
        l lVar;
        l lVar2;
        long j3;
        Surface surface;
        v vVar = this.I0;
        i iVar = this.K0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    n9.y yVar = (n9.y) obj;
                                    if (yVar.a != 0 && yVar.f22602b != 0 && (surface = this.R0) != null) {
                                        Pair pair = iVar.f23205c;
                                        if (pair == null || !((Surface) pair.first).equals(surface) || !((n9.y) iVar.f23205c.second).equals(yVar)) {
                                            iVar.f23205c = Pair.create(surface, yVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            CopyOnWriteArrayList copyOnWriteArrayList = iVar.f23204b;
                            if (copyOnWriteArrayList == null) {
                                iVar.f23204b = new CopyOnWriteArrayList(list);
                                return;
                            } else {
                                copyOnWriteArrayList.clear();
                                iVar.f23204b.addAll(list);
                                return;
                            }
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (vVar.f23260j != intValue) {
                            vVar.f23260j = intValue;
                            vVar.e(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.U0 = intValue2;
                    k8.l lVar3 = this.L;
                    if (lVar3 != null) {
                        lVar3.setVideoScalingMode(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f23222m1 != intValue3) {
                    this.f23222m1 = intValue3;
                    if (this.f23221l1) {
                        d0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f23224o1 = (p) obj;
            return;
        }
        if (obj instanceof Surface) {
            lVar = (Surface) obj;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            l lVar4 = this.S0;
            if (lVar4 != null) {
                lVar = lVar4;
            } else {
                k8.o oVar = this.S;
                if (oVar != null && C0(oVar)) {
                    lVar = l.b(this.H0, oVar.f20333f);
                    this.S0 = lVar;
                }
            }
        }
        Surface surface2 = this.R0;
        h hVar = this.J0;
        if (surface2 != lVar) {
            this.R0 = lVar;
            vVar.getClass();
            if (lVar instanceof l) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (vVar.f23255e != lVar2) {
                vVar.b();
                vVar.f23255e = lVar2;
                vVar.e(true);
            }
            this.T0 = false;
            int i11 = this.f24364i;
            k8.l lVar5 = this.L;
            if (lVar5 != null) {
                iVar.getClass();
                if (h0.a >= 23 && lVar != null && !this.P0) {
                    lVar5.d(lVar);
                } else {
                    d0();
                    O();
                }
            }
            if (lVar != null && lVar != this.S0) {
                z zVar = this.f23220k1;
                if (zVar != null) {
                    hVar.a(zVar);
                }
                p0();
                if (i11 == 2) {
                    long j10 = this.L0;
                    if (j10 > 0) {
                        j3 = SystemClock.elapsedRealtime() + j10;
                    } else {
                        j3 = C.TIME_UNSET;
                    }
                    this.Z0 = j3;
                }
                iVar.getClass();
                return;
            }
            this.f23220k1 = null;
            p0();
            iVar.getClass();
            return;
        }
        if (lVar != null && lVar != this.S0) {
            z zVar2 = this.f23220k1;
            if (zVar2 != null) {
                hVar.a(zVar2);
            }
            if (this.T0) {
                Surface surface3 = this.R0;
                Handler handler = (Handler) hVar.a;
                if (handler != null) {
                    handler.post(new iu(hVar, surface3, SystemClock.elapsedRealtime(), 4));
                }
            }
        }
    }

    @Override // k8.s, s7.g
    public final boolean i() {
        l lVar;
        if (super.i()) {
            this.K0.getClass();
            if (this.V0 || (((lVar = this.S0) != null && this.R0 == lVar) || this.L == null || this.f23221l1)) {
                this.Z0 = C.TIME_UNSET;
                return true;
            }
        }
        if (this.Z0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z0) {
            return true;
        }
        this.Z0 = C.TIME_UNSET;
        return false;
    }

    @Override // k8.s, s7.g
    public final void j() {
        h hVar = this.J0;
        this.f23220k1 = null;
        p0();
        int i10 = 0;
        this.T0 = false;
        this.f23223n1 = null;
        try {
            super.j();
            w7.f fVar = this.C0;
            hVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) hVar.a;
            if (handler != null) {
                handler.post(new w(hVar, fVar, i10));
            }
            hVar.a(z.f23275g);
        } catch (Throwable th2) {
            w7.f fVar2 = this.C0;
            hVar.getClass();
            synchronized (fVar2) {
                Handler handler2 = (Handler) hVar.a;
                if (handler2 != null) {
                    handler2.post(new w(hVar, fVar2, i10));
                }
                hVar.a(z.f23275g);
                throw th2;
            }
        }
    }

    @Override // k8.s
    public final boolean j0(k8.o oVar) {
        return this.R0 != null || C0(oVar);
    }

    @Override // s7.g
    public final void k(boolean z10, boolean z11) {
        boolean z12;
        this.C0 = new w7.f();
        o2 o2Var = this.f24361f;
        o2Var.getClass();
        int i10 = 1;
        boolean z13 = o2Var.a;
        if (z13 && this.f23222m1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        u0.m(z12);
        if (this.f23221l1 != z13) {
            this.f23221l1 = z13;
            d0();
        }
        w7.f fVar = this.C0;
        h hVar = this.J0;
        Handler handler = (Handler) hVar.a;
        if (handler != null) {
            handler.post(new w(hVar, fVar, i10));
        }
        this.W0 = z11;
        this.X0 = false;
    }

    @Override // k8.s, s7.g
    public final void l(long j3, boolean z10) {
        super.l(j3, z10);
        this.K0.getClass();
        p0();
        v vVar = this.I0;
        vVar.f23263m = 0L;
        vVar.f23266p = -1L;
        vVar.f23264n = -1L;
        long j10 = C.TIME_UNSET;
        this.f23214e1 = C.TIME_UNSET;
        this.Y0 = C.TIME_UNSET;
        this.f23212c1 = 0;
        if (z10) {
            long j11 = this.L0;
            if (j11 > 0) {
                j10 = SystemClock.elapsedRealtime() + j11;
            }
            this.Z0 = j10;
            return;
        }
        this.Z0 = C.TIME_UNSET;
    }

    @Override // k8.s
    public final int l0(k8.t tVar, r0 r0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!n9.q.l(r0Var.f24723n)) {
            return s7.g.b(0, 0, 0);
        }
        if (r0Var.f24726q != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.H0;
        List t02 = t0(context, tVar, r0Var, z10, false);
        if (z10 && t02.isEmpty()) {
            t02 = t0(context, tVar, r0Var, false, false);
        }
        if (t02.isEmpty()) {
            return s7.g.b(1, 0, 0);
        }
        int i15 = r0Var.I;
        if (i15 != 0 && i15 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return s7.g.b(2, 0, 0);
        }
        k8.o oVar = (k8.o) t02.get(0);
        boolean d10 = oVar.d(r0Var);
        if (!d10) {
            for (int i16 = 1; i16 < t02.size(); i16++) {
                k8.o oVar2 = (k8.o) t02.get(i16);
                if (oVar2.d(r0Var)) {
                    z12 = false;
                    d10 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z12 = true;
        if (d10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (oVar.e(r0Var)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (oVar.f20334g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z12) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (h0.a >= 26 && "video/dolby-vision".equals(r0Var.f24723n) && !f.a(context)) {
            i13 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (d10) {
            List t03 = t0(context, tVar, r0Var, z10, true);
            if (!t03.isEmpty()) {
                Pattern pattern = k8.z.a;
                ArrayList arrayList = new ArrayList(t03);
                Collections.sort(arrayList, new k8.u(new androidx.core.app.h(r0Var, 24)));
                k8.o oVar3 = (k8.o) arrayList.get(0);
                if (oVar3.d(r0Var) && oVar3.e(r0Var)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override // s7.g
    public final void n() {
        i iVar = this.K0;
        try {
            try {
                B();
                d0();
            } finally {
                x7.n.c(this.F, null);
                this.F = null;
            }
        } finally {
            iVar.getClass();
            l lVar = this.S0;
            if (lVar != null) {
                if (this.R0 == lVar) {
                    this.R0 = null;
                }
                lVar.release();
                this.S0 = null;
            }
        }
    }

    @Override // s7.g
    public final void o() {
        this.f23211b1 = 0;
        this.f23210a1 = SystemClock.elapsedRealtime();
        this.f23215f1 = SystemClock.elapsedRealtime() * 1000;
        this.f23216g1 = 0L;
        this.f23217h1 = 0;
        v vVar = this.I0;
        vVar.f23254d = true;
        vVar.f23263m = 0L;
        vVar.f23266p = -1L;
        vVar.f23264n = -1L;
        r rVar = vVar.f23252b;
        if (rVar != null) {
            u uVar = vVar.f23253c;
            uVar.getClass();
            uVar.f23249c.sendEmptyMessage(1);
            rVar.b(new androidx.core.app.h(vVar, 27));
        }
        vVar.e(false);
    }

    @Override // s7.g
    public final void p() {
        this.Z0 = C.TIME_UNSET;
        v0();
        int i10 = this.f23217h1;
        if (i10 != 0) {
            long j3 = this.f23216g1;
            h hVar = this.J0;
            Handler handler = (Handler) hVar.a;
            if (handler != null) {
                handler.post(new x(hVar, j3, i10));
            }
            this.f23216g1 = 0L;
            this.f23217h1 = 0;
        }
        v vVar = this.I0;
        vVar.f23254d = false;
        r rVar = vVar.f23252b;
        if (rVar != null) {
            rVar.a();
            u uVar = vVar.f23253c;
            uVar.getClass();
            uVar.f23249c.sendEmptyMessage(2);
        }
        vVar.b();
    }

    public final void p0() {
        k8.l lVar;
        this.V0 = false;
        if (h0.a >= 23 && this.f23221l1 && (lVar = this.L) != null) {
            this.f23223n1 = new g(this, lVar);
        }
    }

    @Override // k8.s, s7.g
    public final void s(long j3, long j10) {
        super.s(j3, j10);
        this.K0.getClass();
    }

    @Override // k8.s, s7.g
    public final void v(float f10, float f11) {
        super.v(f10, f11);
        v vVar = this.I0;
        vVar.f23259i = f10;
        vVar.f23263m = 0L;
        vVar.f23266p = -1L;
        vVar.f23264n = -1L;
        vVar.e(false);
    }

    public final void v0() {
        if (this.f23211b1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f23210a1;
            int i10 = this.f23211b1;
            h hVar = this.J0;
            Handler handler = (Handler) hVar.a;
            if (handler != null) {
                handler.post(new x(hVar, i10, j3));
            }
            this.f23211b1 = 0;
            this.f23210a1 = elapsedRealtime;
        }
    }

    public final void w0() {
        this.X0 = true;
        if (!this.V0) {
            this.V0 = true;
            Surface surface = this.R0;
            h hVar = this.J0;
            Handler handler = (Handler) hVar.a;
            if (handler != null) {
                handler.post(new iu(hVar, surface, SystemClock.elapsedRealtime(), 4));
            }
            this.T0 = true;
        }
    }

    public final void x0(z zVar) {
        if (!zVar.equals(z.f23275g) && !zVar.equals(this.f23220k1)) {
            this.f23220k1 = zVar;
            this.J0.a(zVar);
        }
    }

    public final void y0(long j3, long j10, r0 r0Var) {
        p pVar = this.f23224o1;
        if (pVar != null) {
            pVar.a(j3, j10, r0Var, this.N);
        }
    }

    @Override // k8.s
    public final w7.k z(k8.o oVar, r0 r0Var, r0 r0Var2) {
        int i10;
        w7.k b3 = oVar.b(r0Var, r0Var2);
        a8.b bVar = this.O0;
        int i11 = bVar.a;
        int i12 = r0Var2.f24728s;
        int i13 = b3.f26900e;
        if (i12 > i11 || r0Var2.f24729t > bVar.f310b) {
            i13 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (u0(r0Var2, oVar) > this.O0.f311c) {
            i13 |= 64;
        }
        int i14 = i13;
        String str = oVar.a;
        if (i14 != 0) {
            i10 = 0;
        } else {
            i10 = b3.f26899d;
        }
        return new w7.k(str, r0Var, r0Var2, i10, i14);
    }

    public final void z0(k8.l lVar, int i10) {
        c6.k.c("releaseOutputBuffer");
        lVar.k(i10, true);
        c6.k.k();
        this.C0.f26881e++;
        this.f23212c1 = 0;
        this.K0.getClass();
        this.f23215f1 = SystemClock.elapsedRealtime() * 1000;
        x0(this.f23219j1);
        w0();
    }
}
