package com.meta.analytics.dsp.uinode;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Y4 implements InterfaceC1221Id, InterfaceC1039Aj, InterfaceC1159Fr, DZ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"nMHZhEZSp5EcTMzj890UQSIKsf7nOssk", "WLzxKTE2vNTMCpqDs", "SfczCGFglH", "X5aT15p3N3rGxVL5g", "GbnJfxrb9aQYK7s9S1Y8QTSWgx7P8ZxV", "tLWa3XxeFvyx8wOT4", "wILb6N7ReXeeP8cmU", "dyBLf42uqj"};
    public final /* synthetic */ EH A00;

    public Y4(EH eh) {
        this.A00 = eh;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAo(String str, long j7, long j9) {
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1039Aj) it.next()).AAo(str, j7, j9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAp(BC bc) {
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            InterfaceC1039Aj interfaceC1039Aj = (InterfaceC1039Aj) it.next();
            String[] strArr = A01;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A01[4] = "5uZ3F86UAJ67QZD2oUJwcWpEFJTFqeup";
            interfaceC1039Aj.AAp(bc);
        }
        EH.A04(this.A00, null);
        EH.A06(this.A00, null);
        EH.A00(this.A00, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAq(BC bc) {
        EH.A06(this.A00, bc);
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1039Aj) it.next()).AAq(bc);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAr(Format format) {
        EH.A04(this.A00, format);
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1039Aj) it.next()).AAr(format);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAs(int i9) {
        EH.A00(this.A00, i9);
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1039Aj) it.next()).AAs(i9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1039Aj
    public final void AAt(int i9, long j7, long j9) {
        Iterator it = EH.A0D(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1039Aj) it.next()).AAt(i9, j7, j9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1159Fr
    public final void ABF(List<C1155Fn> list) {
        EH.A08(this.A00, list);
        Iterator it = EH.A09(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1159Fr) it.next()).ABF(list);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ABN(int i9, long j7) {
        Iterator it = EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1221Id) it.next()).ABN(i9, j7);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.DZ
    public final void ACK(Metadata metadata) {
        Iterator it = EH.A0A(this.A00).iterator();
        while (it.hasNext()) {
            ((DZ) it.next()).ACK(metadata);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ACt(Surface surface) {
        if (EH.A01(this.A00) == surface) {
            Iterator it = EH.A0C(this.A00).iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = EH.A0B(this.A00).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1221Id) it2.next()).ACt(surface);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADU(String str, long j7, long j9) {
        Iterator it = EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1221Id) it.next()).ADU(str, j7, j9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADV(BC bc) {
        Iterator it = EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1221Id) it.next()).ADV(bc);
        }
        EH.A03(this.A00, null);
        String[] strArr = A01;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A01[0] = "zG8NefRqMKYqbgzRufdCrC4W5rqrDhRZ";
        EH.A05(this.A00, null);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADW(BC bc) {
        EH.A05(this.A00, bc);
        Iterator it = EH.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].charAt(5) == '7') {
                throw new RuntimeException();
            }
            A01[4] = "B3QwduSxUwudXX0SLqqw26pCzLpqq2sU";
            if (hasNext) {
                ((InterfaceC1221Id) it.next()).ADW(bc);
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADa(Format format) {
        EH.A03(this.A00, format);
        Iterator it = EH.A0B(this.A00).iterator();
        while (it.hasNext()) {
            ((InterfaceC1221Id) it.next()).ADa(format);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1221Id
    public final void ADf(int i9, int i10, int i11, float f9) {
        Iterator it = EH.A0C(this.A00).iterator();
        while (it.hasNext()) {
            ((IU) it.next()).ADf(i9, i10, i11, f9);
        }
        Iterator it2 = EH.A0B(this.A00).iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A01;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[4] = "2vUTxC8fdDWhhRkArIujhTo4qLvFXYNt";
            if (hasNext) {
                ((InterfaceC1221Id) it2.next()).ADf(i9, i10, i11, f9);
            } else {
                return;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        EH.A0H(this.A00, new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        EH.A0H(this.A00, null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        EH.A0H(this.A00, surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        EH.A0H(this.A00, null, false);
    }
}
