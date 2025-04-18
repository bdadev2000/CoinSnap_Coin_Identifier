package k8;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;
import n9.h0;
import s7.r0;
import v8.u0;
import v8.z0;
import x7.c0;

/* loaded from: classes3.dex */
public abstract class s extends s7.g {
    public static final byte[] G0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public boolean A0;
    public final e1.b B;
    public s7.r B0;
    public r0 C;
    public w7.f C0;
    public r0 D;
    public r D0;
    public x7.n E;
    public long E0;
    public x7.n F;
    public boolean F0;
    public MediaCrypto G;
    public boolean H;
    public final long I;
    public float J;
    public float K;
    public l L;
    public r0 M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque Q;
    public q R;
    public o S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f20343a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f20344b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20345c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f20346d0;

    /* renamed from: e0, reason: collision with root package name */
    public i f20347e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f20348f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f20349g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f20350h0;

    /* renamed from: i0, reason: collision with root package name */
    public ByteBuffer f20351i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f20352j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f20353k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f20354l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f20355m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f20356n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f20357o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f20358p0;

    /* renamed from: q, reason: collision with root package name */
    public final k f20359q;

    /* renamed from: q0, reason: collision with root package name */
    public int f20360q0;

    /* renamed from: r, reason: collision with root package name */
    public final t f20361r;

    /* renamed from: r0, reason: collision with root package name */
    public int f20362r0;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f20363s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f20364s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f20365t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f20366t0;
    public final w7.i u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f20367u0;

    /* renamed from: v, reason: collision with root package name */
    public final w7.i f20368v;

    /* renamed from: v0, reason: collision with root package name */
    public long f20369v0;

    /* renamed from: w, reason: collision with root package name */
    public final w7.i f20370w;

    /* renamed from: w0, reason: collision with root package name */
    public long f20371w0;

    /* renamed from: x, reason: collision with root package name */
    public final h f20372x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f20373x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f20374y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f20375y0;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f20376z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f20377z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i10, g0.j jVar, boolean z10, float f10) {
        super(i10);
        hf.d dVar = t.f20378g8;
        this.f20359q = jVar;
        this.f20361r = dVar;
        this.f20363s = z10;
        this.f20365t = f10;
        this.u = new w7.i(0);
        this.f20368v = new w7.i(0);
        this.f20370w = new w7.i(2);
        h hVar = new h();
        this.f20372x = hVar;
        this.f20374y = new ArrayList();
        this.f20376z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = C.TIME_UNSET;
        this.A = new ArrayDeque();
        i0(r.f20340d);
        hVar.g(0);
        hVar.f26890f.order(ByteOrder.nativeOrder());
        this.B = new e1.b(2);
        this.P = -1.0f;
        this.T = 0;
        this.f20358p0 = 0;
        this.f20349g0 = -1;
        this.f20350h0 = -1;
        this.f20348f0 = C.TIME_UNSET;
        this.f20369v0 = C.TIME_UNSET;
        this.f20371w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        this.f20360q0 = 0;
        this.f20362r0 = 0;
    }

    public m A(IllegalStateException illegalStateException, o oVar) {
        return new m(illegalStateException, oVar);
    }

    public final void B() {
        this.f20356n0 = false;
        this.f20372x.e();
        this.f20370w.e();
        this.f20355m0 = false;
        this.f20354l0 = false;
        e1.b bVar = this.B;
        bVar.getClass();
        bVar.f17071d = u7.p.a;
        bVar.f17070c = 0;
        bVar.f17069b = 2;
    }

    public final boolean C() {
        if (this.f20364s0) {
            this.f20360q0 = 1;
            if (!this.V && !this.X) {
                this.f20362r0 = 2;
            } else {
                this.f20362r0 = 3;
                return false;
            }
        } else {
            n0();
        }
        return true;
    }

    public final boolean D(long j3, long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        MediaCodec.BufferInfo bufferInfo;
        boolean b02;
        boolean z13;
        int j11;
        boolean z14;
        boolean z15;
        if (this.f20350h0 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f20376z;
        if (!z10) {
            if (this.Y && this.f20366t0) {
                try {
                    j11 = this.L.j(bufferInfo2);
                } catch (IllegalStateException unused) {
                    a0();
                    if (this.f20375y0) {
                        d0();
                    }
                    return false;
                }
            } else {
                j11 = this.L.j(bufferInfo2);
            }
            if (j11 < 0) {
                if (j11 == -2) {
                    this.f20367u0 = true;
                    MediaFormat b3 = this.L.b();
                    if (this.T != 0 && b3.getInteger("width") == 32 && b3.getInteger("height") == 32) {
                        this.f20345c0 = true;
                    } else {
                        if (this.f20343a0) {
                            b3.setInteger("channel-count", 1);
                        }
                        this.N = b3;
                        this.O = true;
                    }
                    return true;
                }
                if (this.f20346d0 && (this.f20373x0 || this.f20360q0 == 2)) {
                    a0();
                }
                return false;
            }
            if (this.f20345c0) {
                this.f20345c0 = false;
                this.L.k(j11, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                a0();
                return false;
            }
            this.f20350h0 = j11;
            ByteBuffer l10 = this.L.l(j11);
            this.f20351i0 = l10;
            if (l10 != null) {
                l10.position(bufferInfo2.offset);
                this.f20351i0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.f20369v0;
                if (j12 != C.TIME_UNSET) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f20374y;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((Long) arrayList.get(i10)).longValue() == j13) {
                        arrayList.remove(i10);
                        z14 = true;
                        break;
                    }
                    i10++;
                } else {
                    z14 = false;
                    break;
                }
            }
            this.f20352j0 = z14;
            long j14 = this.f20371w0;
            long j15 = bufferInfo2.presentationTimeUs;
            if (j14 == j15) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f20353k0 = z15;
            o0(j15);
        }
        if (this.Y && this.f20366t0) {
            try {
                z11 = true;
                z12 = false;
                try {
                    b02 = b0(j3, j10, this.L, this.f20351i0, this.f20350h0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f20352j0, this.f20353k0, this.D);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    a0();
                    if (this.f20375y0) {
                        d0();
                    }
                    return z12;
                }
            } catch (IllegalStateException unused3) {
                z12 = false;
            }
        } else {
            z11 = true;
            z12 = false;
            bufferInfo = bufferInfo2;
            b02 = b0(j3, j10, this.L, this.f20351i0, this.f20350h0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f20352j0, this.f20353k0, this.D);
        }
        if (b02) {
            W(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z13 = z11;
            } else {
                z13 = z12;
            }
            this.f20350h0 = -1;
            this.f20351i0 = null;
            if (!z13) {
                return z11;
            }
            a0();
        }
        return z12;
    }

    public final boolean E() {
        boolean z10;
        w7.d dVar;
        l lVar = this.L;
        if (lVar == null || this.f20360q0 == 2 || this.f20373x0) {
            return false;
        }
        int i10 = this.f20349g0;
        w7.i iVar = this.f20368v;
        if (i10 < 0) {
            int i11 = lVar.i();
            this.f20349g0 = i11;
            if (i11 < 0) {
                return false;
            }
            iVar.f26890f = this.L.c(i11);
            iVar.e();
        }
        if (this.f20360q0 == 1) {
            if (!this.f20346d0) {
                this.f20366t0 = true;
                this.L.m(this.f20349g0, 0, 0L, 4);
                this.f20349g0 = -1;
                iVar.f26890f = null;
            }
            this.f20360q0 = 2;
            return false;
        }
        if (this.f20344b0) {
            this.f20344b0 = false;
            iVar.f26890f.put(G0);
            this.L.m(this.f20349g0, 38, 0L, 0);
            this.f20349g0 = -1;
            iVar.f26890f = null;
            this.f20364s0 = true;
            return true;
        }
        if (this.f20358p0 == 1) {
            for (int i12 = 0; i12 < this.M.f24725p.size(); i12++) {
                iVar.f26890f.put((byte[]) this.M.f24725p.get(i12));
            }
            this.f20358p0 = 2;
        }
        int position = iVar.f26890f.position();
        r4.c cVar = this.f24360d;
        cVar.i();
        try {
            int r6 = r(cVar, iVar, 0);
            if (g() || iVar.c(536870912)) {
                this.f20371w0 = this.f20369v0;
            }
            if (r6 == -3) {
                return false;
            }
            if (r6 == -5) {
                if (this.f20358p0 == 2) {
                    iVar.e();
                    this.f20358p0 = 1;
                }
                T(cVar);
                return true;
            }
            if (iVar.c(4)) {
                if (this.f20358p0 == 2) {
                    iVar.e();
                    this.f20358p0 = 1;
                }
                this.f20373x0 = true;
                if (!this.f20364s0) {
                    a0();
                    return false;
                }
                try {
                    if (!this.f20346d0) {
                        this.f20366t0 = true;
                        this.L.m(this.f20349g0, 0, 0L, 4);
                        this.f20349g0 = -1;
                        iVar.f26890f = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw c(h0.o(e2.getErrorCode()), this.C, e2, false);
                }
            }
            if (!this.f20364s0 && !iVar.c(1)) {
                iVar.e();
                if (this.f20358p0 == 2) {
                    this.f20358p0 = 1;
                }
                return true;
            }
            boolean c10 = iVar.c(1073741824);
            w7.d dVar2 = iVar.f26889d;
            if (c10) {
                if (position == 0) {
                    dVar2.getClass();
                } else {
                    if (dVar2.f26871d == null) {
                        int[] iArr = new int[1];
                        dVar2.f26871d = iArr;
                        dVar2.f26876i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = dVar2.f26871d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.U && !c10) {
                ByteBuffer byteBuffer = iVar.f26890f;
                byte[] bArr = n9.u.a;
                int position2 = byteBuffer.position();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int i15 = i13 + 1;
                    if (i15 < position2) {
                        int i16 = byteBuffer.get(i13) & UByte.MAX_VALUE;
                        if (i14 == 3) {
                            if (i16 == 1 && (byteBuffer.get(i15) & Ascii.US) == 7) {
                                ByteBuffer duplicate = byteBuffer.duplicate();
                                duplicate.position(i13 - 3);
                                duplicate.limit(position2);
                                byteBuffer.position(0);
                                byteBuffer.put(duplicate);
                                break;
                            }
                        } else if (i16 == 0) {
                            i14++;
                        }
                        if (i16 != 0) {
                            i14 = 0;
                        }
                        i13 = i15;
                    } else {
                        byteBuffer.clear();
                        break;
                    }
                }
                if (iVar.f26890f.position() == 0) {
                    return true;
                }
                this.U = false;
            }
            long j3 = iVar.f26892h;
            i iVar2 = this.f20347e0;
            if (iVar2 != null) {
                r0 r0Var = this.C;
                if (iVar2.f20322b == 0) {
                    iVar2.a = j3;
                }
                if (!iVar2.f20323c) {
                    ByteBuffer byteBuffer2 = iVar.f26890f;
                    byteBuffer2.getClass();
                    int i17 = 0;
                    int i18 = 0;
                    for (int i19 = 4; i17 < i19; i19 = 4) {
                        i18 = (i18 << 8) | (byteBuffer2.get(i17) & UByte.MAX_VALUE);
                        i17++;
                    }
                    int M = com.bumptech.glide.c.M(i18);
                    if (M == -1) {
                        iVar2.f20323c = true;
                        iVar2.f20322b = 0L;
                        iVar2.a = iVar.f26892h;
                        n9.o.f("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j3 = iVar.f26892h;
                    } else {
                        z10 = c10;
                        long max = Math.max(0L, ((iVar2.f20322b - 529) * 1000000) / r0Var.B) + iVar2.a;
                        iVar2.f20322b += M;
                        j3 = max;
                        long j10 = this.f20369v0;
                        i iVar3 = this.f20347e0;
                        r0 r0Var2 = this.C;
                        iVar3.getClass();
                        dVar = dVar2;
                        this.f20369v0 = Math.max(j10, Math.max(0L, ((iVar3.f20322b - 529) * 1000000) / r0Var2.B) + iVar3.a);
                    }
                }
                z10 = c10;
                long j102 = this.f20369v0;
                i iVar32 = this.f20347e0;
                r0 r0Var22 = this.C;
                iVar32.getClass();
                dVar = dVar2;
                this.f20369v0 = Math.max(j102, Math.max(0L, ((iVar32.f20322b - 529) * 1000000) / r0Var22.B) + iVar32.a);
            } else {
                z10 = c10;
                dVar = dVar2;
            }
            if (iVar.d()) {
                this.f20374y.add(Long.valueOf(j3));
            }
            if (this.f20377z0) {
                ArrayDeque arrayDeque = this.A;
                if (!arrayDeque.isEmpty()) {
                    ((r) arrayDeque.peekLast()).f20342c.a(j3, this.C);
                } else {
                    this.D0.f20342c.a(j3, this.C);
                }
                this.f20377z0 = false;
            }
            this.f20369v0 = Math.max(this.f20369v0, j3);
            iVar.h();
            if (iVar.c(268435456)) {
                M(iVar);
            }
            Y(iVar);
            try {
                if (z10) {
                    this.L.e(this.f20349g0, dVar, j3);
                } else {
                    this.L.m(this.f20349g0, iVar.f26890f.limit(), j3, 0);
                }
                this.f20349g0 = -1;
                iVar.f26890f = null;
                this.f20364s0 = true;
                this.f20358p0 = 0;
                this.C0.f26879c++;
                return true;
            } catch (MediaCodec.CryptoException e10) {
                throw c(h0.o(e10.getErrorCode()), this.C, e10, false);
            }
        } catch (w7.h e11) {
            Q(e11);
            c0(0);
            F();
            return true;
        }
    }

    public final void F() {
        try {
            this.L.flush();
        } finally {
            f0();
        }
    }

    public final boolean G() {
        boolean z10;
        if (this.L == null) {
            return false;
        }
        int i10 = this.f20362r0;
        if (i10 != 3 && !this.V && ((!this.W || this.f20367u0) && (!this.X || !this.f20366t0))) {
            if (i10 == 2) {
                int i11 = h0.a;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0.m(z10);
                if (i11 >= 23) {
                    try {
                        n0();
                    } catch (s7.r e2) {
                        n9.o.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                        d0();
                        return true;
                    }
                }
            }
            F();
            return false;
        }
        d0();
        return true;
    }

    public final List H(boolean z10) {
        r0 r0Var = this.C;
        t tVar = this.f20361r;
        ArrayList K = K(tVar, r0Var, z10);
        if (K.isEmpty() && z10) {
            K = K(tVar, this.C, false);
            if (!K.isEmpty()) {
                n9.o.f("MediaCodecRenderer", "Drm session requires secure decoder for " + this.C.f24723n + ", but no secure decoder available. Trying to proceed with " + K + ".");
            }
        }
        return K;
    }

    public boolean I() {
        return false;
    }

    public abstract float J(float f10, r0[] r0VarArr);

    public abstract ArrayList K(t tVar, r0 r0Var, boolean z10);

    public abstract j L(o oVar, r0 r0Var, MediaCrypto mediaCrypto, float f10);

    public void M(w7.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ec, code lost:
    
        if ("stvm8".equals(r11) == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03fc, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x038b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0477  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(k8.o r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.N(k8.o, android.media.MediaCrypto):void");
    }

    public final void O() {
        r0 r0Var;
        boolean z10;
        boolean z11;
        if (this.L == null && !this.f20354l0 && (r0Var = this.C) != null) {
            if (this.F == null && k0(r0Var)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                r0 r0Var2 = this.C;
                B();
                String str = r0Var2.f24723n;
                boolean equals = MimeTypes.AUDIO_AAC.equals(str);
                h hVar = this.f20372x;
                if (!equals && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
                    hVar.getClass();
                    hVar.f20321n = 1;
                } else {
                    hVar.getClass();
                    hVar.f20321n = 32;
                }
                this.f20354l0 = true;
                return;
            }
            h0(this.F);
            String str2 = this.C.f24723n;
            x7.n nVar = this.E;
            if (nVar != null) {
                w7.b d10 = nVar.d();
                if (this.G == null) {
                    if (d10 == null) {
                        if (this.E.getError() == null) {
                            return;
                        }
                    } else if (d10 instanceof c0) {
                        c0 c0Var = (c0) d10;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(c0Var.a, c0Var.f27416b);
                            this.G = mediaCrypto;
                            if (!c0Var.f27417c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.H = z11;
                        } catch (MediaCryptoException e2) {
                            throw c(6006, this.C, e2, false);
                        }
                    }
                }
                if (c0.f27415d && (d10 instanceof c0)) {
                    int state = this.E.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        x7.m error = this.E.getError();
                        error.getClass();
                        throw c(error.f27491b, this.C, error, false);
                    }
                }
            }
            try {
                P(this.G, this.H);
            } catch (q e10) {
                throw c(4001, this.C, e10, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(android.media.MediaCrypto r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.P(android.media.MediaCrypto, boolean):void");
    }

    public abstract void Q(Exception exc);

    public abstract void R(String str, long j3, long j10);

    public abstract void S(String str);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013e, code lost:
    
        if (C() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0156, code lost:
    
        if (r0 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r13 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        if (C() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011c, code lost:
    
        if (r5.f24729t == r6.f24729t) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012a, code lost:
    
        if (C() == false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w7.k T(r4.c r13) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.T(r4.c):w7.k");
    }

    public abstract void U(r0 r0Var, MediaFormat mediaFormat);

    public void V() {
    }

    public void W(long j3) {
        this.E0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (!arrayDeque.isEmpty() && j3 >= ((r) arrayDeque.peek()).a) {
                i0((r) arrayDeque.poll());
                X();
            } else {
                return;
            }
        }
    }

    public abstract void X();

    public abstract void Y(w7.i iVar);

    public void Z(r0 r0Var) {
    }

    public final void a0() {
        int i10 = this.f20362r0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f20375y0 = true;
                    e0();
                    return;
                } else {
                    d0();
                    O();
                    return;
                }
            }
            F();
            n0();
            return;
        }
        F();
    }

    public abstract boolean b0(long j3, long j10, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, r0 r0Var);

    public final boolean c0(int i10) {
        r4.c cVar = this.f24360d;
        cVar.i();
        w7.i iVar = this.u;
        iVar.e();
        int r6 = r(cVar, iVar, i10 | 4);
        if (r6 == -5) {
            T(cVar);
            return true;
        }
        if (r6 == -4 && iVar.c(4)) {
            this.f20373x0 = true;
            a0();
            return false;
        }
        return false;
    }

    public final void d0() {
        try {
            l lVar = this.L;
            if (lVar != null) {
                lVar.release();
                this.C0.f26878b++;
                S(this.S.a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void e0() {
    }

    public void f0() {
        this.f20349g0 = -1;
        this.f20368v.f26890f = null;
        this.f20350h0 = -1;
        this.f20351i0 = null;
        this.f20348f0 = C.TIME_UNSET;
        this.f20366t0 = false;
        this.f20364s0 = false;
        this.f20344b0 = false;
        this.f20345c0 = false;
        this.f20352j0 = false;
        this.f20353k0 = false;
        this.f20374y.clear();
        this.f20369v0 = C.TIME_UNSET;
        this.f20371w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        i iVar = this.f20347e0;
        if (iVar != null) {
            iVar.a = 0L;
            iVar.f20322b = 0L;
            iVar.f20323c = false;
        }
        this.f20360q0 = 0;
        this.f20362r0 = 0;
        this.f20358p0 = this.f20357o0 ? 1 : 0;
    }

    public final void g0() {
        f0();
        this.B0 = null;
        this.f20347e0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f20367u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f20343a0 = false;
        this.f20346d0 = false;
        this.f20357o0 = false;
        this.f20358p0 = 0;
        this.H = false;
    }

    public final void h0(x7.n nVar) {
        x7.n.c(this.E, nVar);
        this.E = nVar;
    }

    @Override // s7.g
    public boolean i() {
        boolean isReady;
        boolean z10;
        if (this.C == null) {
            return false;
        }
        if (g()) {
            isReady = this.f24369n;
        } else {
            z0 z0Var = this.f24365j;
            z0Var.getClass();
            isReady = z0Var.isReady();
        }
        if (!isReady) {
            if (this.f20350h0 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (this.f20348f0 == C.TIME_UNSET || SystemClock.elapsedRealtime() >= this.f20348f0)) {
                return false;
            }
        }
        return true;
    }

    public final void i0(r rVar) {
        this.D0 = rVar;
        if (rVar.f20341b != C.TIME_UNSET) {
            this.F0 = true;
            V();
        }
    }

    @Override // s7.g
    public void j() {
        this.C = null;
        i0(r.f20340d);
        this.A.clear();
        G();
    }

    public boolean j0(o oVar) {
        return true;
    }

    public boolean k0(r0 r0Var) {
        return false;
    }

    @Override // s7.g
    public void l(long j3, boolean z10) {
        int i10;
        this.f20373x0 = false;
        this.f20375y0 = false;
        this.A0 = false;
        if (this.f20354l0) {
            this.f20372x.e();
            this.f20370w.e();
            this.f20355m0 = false;
        } else if (G()) {
            O();
        }
        androidx.activity.result.i iVar = this.D0.f20342c;
        synchronized (iVar) {
            i10 = iVar.f609c;
        }
        if (i10 > 0) {
            this.f20377z0 = true;
        }
        this.D0.f20342c.c();
        this.A.clear();
    }

    public abstract int l0(t tVar, r0 r0Var);

    public final boolean m0(r0 r0Var) {
        if (h0.a >= 23 && this.L != null && this.f20362r0 != 3 && this.f24364i != 0) {
            float f10 = this.K;
            r0[] r0VarArr = this.f24366k;
            r0VarArr.getClass();
            float J = J(f10, r0VarArr);
            float f11 = this.P;
            if (f11 == J) {
                return true;
            }
            if (J == -1.0f) {
                if (this.f20364s0) {
                    this.f20360q0 = 1;
                    this.f20362r0 = 3;
                    return false;
                }
                d0();
                O();
                return false;
            }
            if (f11 == -1.0f && J <= this.f20365t) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", J);
            this.L.g(bundle);
            this.P = J;
        }
        return true;
    }

    public final void n0() {
        w7.b d10 = this.F.d();
        if (d10 instanceof c0) {
            try {
                this.G.setMediaDrmSession(((c0) d10).f27416b);
            } catch (MediaCryptoException e2) {
                throw c(6006, this.C, e2, false);
            }
        }
        h0(this.F);
        this.f20360q0 = 0;
        this.f20362r0 = 0;
    }

    public final void o0(long j3) {
        boolean z10;
        Object f10;
        Object obj;
        androidx.activity.result.i iVar = this.D0.f20342c;
        synchronized (iVar) {
            z10 = true;
            f10 = iVar.f(j3, true);
        }
        r0 r0Var = (r0) f10;
        if (r0Var == null && this.F0 && this.N != null) {
            androidx.activity.result.i iVar2 = this.D0.f20342c;
            synchronized (iVar2) {
                if (iVar2.f609c == 0) {
                    obj = null;
                } else {
                    obj = iVar2.i();
                }
            }
            r0Var = (r0) obj;
        }
        if (r0Var != null) {
            this.D = r0Var;
        } else {
            z10 = false;
        }
        if (z10 || (this.O && this.D != null)) {
            U(this.D, this.N);
            this.O = false;
            this.F0 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // s7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(s7.r0[] r6, long r7, long r9) {
        /*
            r5 = this;
            k8.r r6 = r5.D0
            long r6 = r6.f20341b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            k8.r r6 = new k8.r
            r6.<init>(r0, r9)
            r5.i0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque r6 = r5.A
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.f20369v0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.E0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            k8.r r6 = new k8.r
            r6.<init>(r0, r9)
            r5.i0(r6)
            k8.r r6 = r5.D0
            long r6 = r6.f20341b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L4c
            r5.X()
            goto L4c
        L42:
            k8.r r7 = new k8.r
            long r0 = r5.f20369v0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.q(s7.r0[], long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0068 A[LOOP:1: B:33:0x0048->B:42:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[EDGE_INSN: B:43:0x0069->B:44:0x0069 BREAK  A[LOOP:1: B:33:0x0048->B:42:0x0068], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084 A[LOOP:2: B:45:0x0069->B:54:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085 A[EDGE_INSN: B:55:0x0085->B:56:0x0085 BREAK  A[LOOP:2: B:45:0x0069->B:54:0x0084], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    @Override // s7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.s(long, long):void");
    }

    @Override // s7.g
    public void v(float f10, float f11) {
        this.J = f10;
        this.K = f11;
        m0(this.M);
    }

    @Override // s7.g
    public final int w(r0 r0Var) {
        try {
            return l0(this.f20361r, r0Var);
        } catch (w e2) {
            throw d(e2, r0Var);
        }
    }

    @Override // s7.g
    public final int x() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201 A[LOOP:0: B:29:0x0093->B:71:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(long r23, long r25) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.s.y(long, long):boolean");
    }

    public abstract w7.k z(o oVar, r0 r0Var, r0 r0Var2);
}
