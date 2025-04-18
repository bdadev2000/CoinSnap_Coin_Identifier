package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Eb */
/* loaded from: assets/audience_network.dex */
public final class C0509Eb implements ZB {
    public static byte[] A0O;
    public static String[] A0P = {"XWeSpGD", "4qgR8lijDNBVXz9BioKUh69RZRfb7E2", "Q4SMfBcJ0bt0", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "TfY1BMlFFTNL7vzfskwyUKT4ej", "mKGGB3e4ANI8fD2ERhdb4BtSA2E0ESmz", "CjFdQ0AURNTGZtxre29PnmyrB2gjoGci", "x"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public AY A08;
    public BH A09;
    public BH A0A;
    public Ev A0B;
    public List<C0539Fs> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final ZB A0F;
    public final Z9 A0G;
    public final Z7 A0H;
    public final CopyOnWriteArraySet<InterfaceC0422Ao> A0I;
    public final CopyOnWriteArraySet<InterfaceC0487De> A0J;
    public final CopyOnWriteArraySet<InterfaceC0543Fw> A0K;
    public final CopyOnWriteArraySet<Ii> A0L;
    public final CopyOnWriteArraySet<IZ> A0M;
    public final ZA[] A0N;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 33);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{-79, -57, -53, -50, -54, -61, -93, -42, -51, -82, -54, -65, -41, -61, -48, -93, -59, -62, -74, -79, -77, -75, -92, -75, -56, -60, -59, -62, -75, -100, -71, -61, -60, -75, -66, -75, -62, 112, -79, -68, -62, -75, -79, -76, -55, 112, -59, -66, -61, -75, -60, 112, -65, -62, 112, -62, -75, -64, -68, -79, -77, -75, -76, 126, -120, -117, -117, 115, -112, -102, -101, -116, -107, -116, -103};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0509Eb(AH ah, AbstractC0559Go abstractC0559Go, InterfaceC04049w interfaceC04049w, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh) {
        this(ah, abstractC0559Go, interfaceC04049w, interfaceC0439Bh, new AN());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0509Eb(AH ah, AbstractC0559Go abstractC0559Go, InterfaceC04049w interfaceC04049w, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, AN an) {
        this(ah, abstractC0559Go, interfaceC04049w, interfaceC0439Bh, an, InterfaceC0579Hi.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C0509Eb(AH ah, AbstractC0559Go abstractC0559Go, InterfaceC04049w interfaceC04049w, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, AN an, InterfaceC0579Hi interfaceC0579Hi) {
        this.A0G = new Z9(this);
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0I = new CopyOnWriteArraySet<>();
        this.A0E = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A0N = ah.A57(this.A0E, this.A0G, this.A0G, this.A0G, this.A0G, interfaceC0439Bh);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = AY.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        this.A0F = A02(this.A0N, abstractC0559Go, interfaceC04049w, interfaceC0579Hi);
        this.A0H = an.A00(this.A0F, interfaceC0579Hi);
        A3m(this.A0H);
        this.A0L.add(this.A0H);
        this.A0I.add(this.A0H);
        A0I(this.A0H);
        if (0 != 0) {
            throw new NullPointerException(A07(64, 11, 6));
        }
    }

    private final C0511Ed A02(ZA[] zaArr, AbstractC0559Go abstractC0559Go, InterfaceC04049w interfaceC04049w, InterfaceC0579Hi interfaceC0579Hi) {
        return new C0511Ed(zaArr, abstractC0559Go, interfaceC04049w, interfaceC0579Hi);
    }

    private void A0E() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 61), A07(15, 49, 47));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0G);
            this.A04 = null;
        }
    }

    public void A0G(Surface surface, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (ZA za : this.A0N) {
            if (za.A8a() == 2) {
                arrayList.add(this.A0F.A51(za).A06(1).A07(surface).A05());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AD) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread currentThread = Thread.currentThread();
                if (A0P[6].charAt(9) != 'N') {
                    throw new RuntimeException();
                }
                A0P[0] = "72REcLj";
                currentThread.interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z2;
    }

    private final void A0I(InterfaceC0487De interfaceC0487De) {
        this.A0J.add(interfaceC0487De);
    }

    public final int A0J() {
        return this.A01;
    }

    public final Format A0K() {
        return this.A06;
    }

    public final Format A0L() {
        return this.A07;
    }

    public final void A0M() {
        AH2(false);
    }

    public final void A0N(float f2) {
        this.A00 = f2;
        for (ZA za : this.A0N) {
            String[] strArr = A0P;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0P;
            strArr2[4] = "DgH7fRCeCljpIo3I4J1ewSbeY9";
            strArr2[1] = "bAFJiNVMQ89hFktOZXBfzPUbCDSZU9u";
            if (za.A8a() == 1) {
                this.A0F.A51(za).A06(2).A07(Float.valueOf(f2)).A05();
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(Ev ev) {
        AEY(ev, true, true);
    }

    public final void A0Q(IZ iz) {
        this.A0M.add(iz);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void A3m(A5 a5) {
        this.A0F.A3m(a5);
    }

    @Override // com.instagram.common.viewpoint.core.ZB
    public final AD A51(AC ac) {
        return this.A0F.A51(ac);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6Z() {
        return this.A0F.A6Z();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A6a() {
        return this.A0F.A6a();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A6w() {
        return this.A0F.A6w();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6y() {
        return this.A0F.A6y();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6z() {
        return this.A0F.A6z();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A71() {
        return this.A0F.A71();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final AM A73() {
        return this.A0F.A73();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A74() {
        return this.A0F.A74();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A7E() {
        return this.A0F.A7E();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final boolean A84() {
        return this.A0F.A84();
    }

    @Override // com.instagram.common.viewpoint.core.ZB
    public final void AEY(Ev ev, boolean z2, boolean z3) {
        if (this.A0B != ev) {
            if (this.A0B != null) {
                this.A0B.AFa(this.A0H);
                this.A0H.A09();
            }
            ev.A3k(this.A0E, this.A0H);
            this.A0B = ev;
        }
        this.A0F.AEY(ev, z2, z3);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AEy() {
        this.A0F.AEy();
        A0E();
        if (this.A03 != null) {
            if (this.A0D) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AG9(long j2) {
        this.A0H.A08();
        this.A0F.AG9(j2);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AGA() {
        this.A0H.A08();
        this.A0F.AGA();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AGZ(boolean z2) {
        this.A0F.AGZ(z2);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AH2(boolean z2) {
        this.A0F.AH2(z2);
        if (this.A0B != null) {
            this.A0B.AFa(this.A0H);
            this.A0B = null;
            this.A0H.A09();
        }
        this.A0C = Collections.emptyList();
    }
}
