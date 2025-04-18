package com.instagram.common.viewpoint.core;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Z9 implements Ii, InterfaceC0422Ao, InterfaceC0543Fw, InterfaceC0487De, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"s1XoKYuOWujOozdgD26BdexE0JndoY0p", "ug", "yyipXdVJL0NW5jruXnuLHtd7HNthnOQs", "Np", "T3S7xgCH4xR7Lhcdh7IaJmLB92LvoGO6", "Lv6Qm0KobCIJpmcapSGTsoPqXtQ8zU", "F4ppLo9DkT8dpVqKTMmIcH3FimXW4jNn", "MKgJM"};
    public final /* synthetic */ C0509Eb A00;

    public Z9(C0509Eb c0509Eb) {
        this.A00 = c0509Eb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABE(String str, long j2, long j3) {
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0422Ao) it.next()).ABE(str, j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABF(BH bh) {
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0422Ao) it.next()).ABF(bh);
        }
        C0509Eb.A04(this.A00, null);
        C0509Eb.A06(this.A00, null);
        C0509Eb.A00(this.A00, 0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABG(BH bh) {
        C0509Eb.A06(this.A00, bh);
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0422Ao) it.next()).ABG(bh);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABH(Format format) {
        C0509Eb.A04(this.A00, format);
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0422Ao) it.next()).ABH(format);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABI(int i2) {
        C0509Eb.A00(this.A00, i2);
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0422Ao) it.next()).ABI(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0422Ao
    public final void ABJ(int i2, long j2, long j3) {
        Iterator it = C0509Eb.A0D(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                throw new RuntimeException();
            }
            A01[5] = "pWHwh8J2y";
            if (hasNext) {
                ((InterfaceC0422Ao) it.next()).ABJ(i2, j2, j3);
            } else {
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0543Fw
    public final void ABg(List<C0539Fs> list) {
        C0509Eb.A08(this.A00, list);
        Iterator it = C0509Eb.A09(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            A01[2] = "lmorwd809xRnhQYXqopS36rQVvvPOgfq";
            ((InterfaceC0543Fw) next).ABg(list);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ABo(int i2, long j2) {
        Iterator it = C0509Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((Ii) it.next()).ABo(i2, j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0487De
    public final void ACl(Metadata metadata) {
        Iterator it = C0509Eb.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC0487De) it.next()).ACl(metadata);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADM(Surface surface) {
        if (C0509Eb.A01(this.A00) == surface) {
            Iterator it = C0509Eb.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = C0509Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((Ii) it2.next()).ADM(surface);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADx(String str, long j2, long j3) {
        Iterator it = C0509Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            Ii ii = (Ii) it.next();
            String[] strArr = A01;
            if (strArr[6].charAt(15) == strArr[4].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "98uEWQJnNgSuENriuK2INOdUeiEIyWaZ";
            strArr2[4] = "eHkHjIDMEmUBDLT9VWPNpXXI3kSowk0p";
            ii.ADx(str, j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADy(BH bh) {
        Iterator it = C0509Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[2].charAt(5) != 'd') {
                break;
            }
            A01[2] = "JrZfHdmFrRR6AyhIh3YYEfnATxgqdiz0";
            if (hasNext) {
                Ii ii = (Ii) it.next();
                if (A01[2].charAt(5) != 'd') {
                    break;
                }
                String[] strArr = A01;
                strArr[3] = "VQ";
                strArr[1] = "Nl";
                ii.ADy(bh);
            } else {
                C0509Eb c0509Eb = this.A00;
                String[] strArr2 = A01;
                if (strArr2[6].charAt(15) != strArr2[4].charAt(15)) {
                    A01[0] = "lOLMdoznQQ3DqAD1wG39jRlc0poGBnju";
                    C0509Eb.A03(c0509Eb, null);
                    C0509Eb.A05(this.A00, null);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void ADz(BH bh) {
        C0509Eb.A05(this.A00, bh);
        Iterator it = C0509Eb.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[7] = "IZFKv";
            if (!hasNext) {
                return;
            }
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                A01[2] = "cfU7KdfDtZpXBm3qFW7t619pDkxhYS61";
                ((Ii) next).ADz(bh);
            } else {
                A01[5] = "KzmuGXxm";
                ((Ii) next).ADz(bh);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void AE3(Format format) {
        C0509Eb.A03(this.A00, format);
        Iterator it = C0509Eb.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((Ii) it.next()).AE3(format);
        }
    }

    @Override // com.instagram.common.viewpoint.core.Ii
    public final void AE8(int i2, int i3, int i4, float f2) {
        Iterator it = C0509Eb.A0C(this.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (A01[0].charAt(24) != '0') {
                throw new RuntimeException();
            }
            A01[5] = "XVq90yYfVTt0";
            ((IZ) next).AE8(i2, i3, i4, f2);
        }
        Iterator it2 = C0509Eb.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (A01[2].charAt(5) != 'd') {
                ((Ii) next2).AE8(i2, i3, i4, f2);
            } else {
                A01[0] = "EzBATBLX59597vwh6aXI5FCM0yhDVwG8";
                ((Ii) next2).AE8(i2, i3, i4, f2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0509Eb.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0509Eb.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0509Eb.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0509Eb.A0H(this.A00, null, false);
    }
}
