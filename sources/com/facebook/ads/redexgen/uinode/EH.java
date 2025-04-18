package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class EH implements Y6 {
    public static byte[] A0O;
    public static String[] A0P = {"lFtWnCG46R5C0jFE4zUJTczpshBUtUUT", "lFOjdTcG38zZaGgojgc5eL5kqXnhZEZM", "wiGcXWoorOPZSjIllCfsaL8Ty45qvpEz", "HHU7rub9nESY9ymWNpU", "JQeT3oVWTWkCraIQT5Bxb1arMPILFYIY", "gEu", "Qio0MMI", "OwWxnbSWAOR1YegRtIWYLQC56lcDaoDA"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public Format A06;
    public Format A07;
    public AT A08;
    public BC A09;
    public BC A0A;
    public InterfaceC0568Eq A0B;
    public List<C0589Fn> A0C;
    public boolean A0D;
    public final Handler A0E;
    public final Y6 A0F;
    public final Y4 A0G;
    public final Y2 A0H;
    public final CopyOnWriteArraySet<InterfaceC0473Aj> A0I;
    public final CopyOnWriteArraySet<DZ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0593Fr> A0K;
    public final CopyOnWriteArraySet<InterfaceC0655Id> A0L;
    public final CopyOnWriteArraySet<IU> A0M;
    public final Y5[] A0N;

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0O = new byte[]{126, -108, -104, -101, -105, -112, 112, -93, -102, 123, -105, -116, -92, -112, -99, -101, -67, -70, -82, -87, -85, -83, -100, -83, -64, -68, -67, -70, -83, -108, -79, -69, -68, -83, -74, -83, -70, 104, -87, -76, -70, -83, -87, -84, -63, 104, -67, -74, -69, -83, -68, 104, -73, -70, 104, -70, -83, -72, -76, -87, -85, -83, -84, 118, -65, -62, -62, -86, -57, -47, -46, -61, -52, -61, -48};
    }

    static {
        A0F();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public EH(AC ac2, AbstractC0610Gj abstractC0610Gj, InterfaceC04559r interfaceC04559r, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc) {
        this(ac2, abstractC0610Gj, interfaceC04559r, interfaceC0492Bc, new AI());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public EH(AC ac2, AbstractC0610Gj abstractC0610Gj, InterfaceC04559r interfaceC04559r, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc, AI ai2) {
        this(ac2, abstractC0610Gj, interfaceC04559r, interfaceC0492Bc, ai2, InterfaceC0629Hd.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public EH(AC ac2, AbstractC0610Gj abstractC0610Gj, InterfaceC04559r interfaceC04559r, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc, AI ai2, InterfaceC0629Hd interfaceC0629Hd) {
        Y4 y4 = new Y4(this);
        this.A0G = y4;
        this.A0M = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<InterfaceC0655Id> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.A0L = copyOnWriteArraySet;
        CopyOnWriteArraySet<InterfaceC0473Aj> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.A0I = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A0E = handler;
        Y5[] A4l = ac2.A4l(handler, y4, y4, y4, y4, interfaceC0492Bc);
        this.A0N = A4l;
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A08 = AT.A04;
        this.A02 = 1;
        this.A0C = Collections.emptyList();
        EJ A02 = A02(A4l, abstractC0610Gj, interfaceC04559r, interfaceC0629Hd);
        this.A0F = A02;
        Y2 A00 = ai2.A00(A02, interfaceC0629Hd);
        this.A0H = A00;
        A3Q(A00);
        copyOnWriteArraySet.add(A00);
        copyOnWriteArraySet2.add(A00);
        A0I(A00);
        if (0 != 0) {
            throw new NullPointerException(A07(64, 11, 51));
        }
    }

    private final EJ A02(Y5[] y5Arr, AbstractC0610Gj abstractC0610Gj, InterfaceC04559r interfaceC04559r, InterfaceC0629Hd interfaceC0629Hd) {
        return new EJ(y5Arr, abstractC0610Gj, interfaceC04559r, interfaceC0629Hd);
    }

    private void A0E() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.A0G) {
                Log.w(A07(0, 15, 0), A07(15, 49, 29));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        SurfaceHolder surfaceHolder = this.A04;
        String[] strArr = A0P;
        if (strArr[6].length() != strArr[5].length()) {
            String[] strArr2 = A0P;
            strArr2[1] = "ra3xydJ7kWhmMtg1TaM66w1JFa1gUTH7";
            strArr2[7] = "B2AnWPBfK4McGvg4VvevfKURx5PgHrL6";
            if (surfaceHolder != null) {
                Y4 y4 = this.A0G;
                if (A0P[3].length() != 30) {
                    A0P[2] = "TkNVmSJ94eiWQtufXtm52Md27gR86DeI";
                    surfaceHolder.removeCallback(y4);
                    this.A04 = null;
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (Y5 y52 : this.A0N) {
            if (y52.A8C() == 2) {
                arrayList.add(this.A0F.A4f(y52).A06(1).A07(surface).A05());
            }
        }
        Surface surface2 = this.A03;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((A8) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0D) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0D = z10;
    }

    private final void A0I(DZ dz) {
        this.A0J.add(dz);
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
        AGa(false);
    }

    public final void A0N(float f10) {
        this.A00 = f10;
        for (Y5 y52 : this.A0N) {
            if (y52.A8C() == 1) {
                this.A0F.A4f(y52).A06(2).A07(Float.valueOf(f10)).A05();
            }
        }
    }

    public final void A0O(Surface surface) {
        A0E();
        A0G(surface, false);
    }

    public final void A0P(InterfaceC0568Eq interfaceC0568Eq) {
        AE5(interfaceC0568Eq, true, true);
    }

    public final void A0Q(IU iu) {
        this.A0M.add(iu);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void A3Q(A0 a02) {
        this.A0F.A3Q(a02);
    }

    @Override // com.facebook.ads.redexgen.uinode.Y6
    public final A8 A4f(A7 a72) {
        return this.A0F.A4f(a72);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6B() {
        return this.A0F.A6B();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6C() {
        return this.A0F.A6C();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6Y() {
        return this.A0F.A6Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6a() {
        return this.A0F.A6a();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6b() {
        return this.A0F.A6b();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6d() {
        return this.A0F.A6d();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final AH A6f() {
        return this.A0F.A6f();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final int A6g() {
        return this.A0F.A6g();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final long A6q() {
        return this.A0F.A6q();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final boolean A7g() {
        return this.A0F.A7g();
    }

    @Override // com.facebook.ads.redexgen.uinode.Y6
    public final void AE5(InterfaceC0568Eq interfaceC0568Eq, boolean z10, boolean z11) {
        InterfaceC0568Eq interfaceC0568Eq2 = this.A0B;
        if (interfaceC0568Eq2 != interfaceC0568Eq) {
            if (interfaceC0568Eq2 != null) {
                interfaceC0568Eq2.AF7(this.A0H);
                String[] strArr = A0P;
                if (strArr[4].charAt(10) == strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0P;
                strArr2[1] = "neQjHr0c3Z22xWgcFsXV6yKpgIjCxRiM";
                strArr2[7] = "AZ8qNXqb66h1W9gn2ceQeQQ6zfm9Ofoh";
                this.A0H.A09();
            }
            Handler handler = this.A0E;
            if (A0P[3].length() == 30) {
                throw new RuntimeException();
            }
            A0P[2] = "hi3Z2rNIRXiwDW9NFTlP7K1BOJYRm9rY";
            interfaceC0568Eq.A3O(handler, this.A0H);
            this.A0B = interfaceC0568Eq;
        }
        this.A0F.AE5(interfaceC0568Eq, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AEV() {
        this.A0F.AEV();
        A0E();
        Surface surface = this.A03;
        if (surface != null) {
            if (this.A0D) {
                surface.release();
            }
            this.A03 = null;
        }
        InterfaceC0568Eq interfaceC0568Eq = this.A0B;
        String[] strArr = A0P;
        if (strArr[6].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[1] = "3XPFavn3G5vCuxghg4tFItjGBt49wsdt";
        strArr2[7] = "vQrNoD9lPBn1b9gsSKOopZ1BvxRWCtpJ";
        if (interfaceC0568Eq != null) {
            interfaceC0568Eq.AF7(this.A0H);
        }
        this.A0C = Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AFj(long j3) {
        this.A0H.A08();
        this.A0F.AFj(j3);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AFk() {
        this.A0H.A08();
        this.A0F.AFk();
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AG9(boolean z10) {
        this.A0F.AG9(z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.A5
    public final void AGa(boolean z10) {
        this.A0F.AGa(z10);
        InterfaceC0568Eq interfaceC0568Eq = this.A0B;
        if (interfaceC0568Eq != null) {
            interfaceC0568Eq.AF7(this.A0H);
            this.A0B = null;
            this.A0H.A09();
        }
        this.A0C = Collections.emptyList();
    }
}
