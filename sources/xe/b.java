package xe;

import android.hardware.Camera;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class b implements Camera.PictureCallback {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        int i10;
        boolean z10 = true;
        e.f27639d.a(1, "take(): got picture callback.");
        try {
            i10 = a6.k.y(new f1.g(new ByteArrayInputStream(bArr)).c());
        } catch (IOException unused) {
            i10 = 0;
        }
        c cVar = this.a;
        fe.k kVar = (fe.k) cVar.a;
        kVar.f17854d = bArr;
        kVar.f17852b = i10;
        e.f27639d.a(1, "take(): starting preview again. ", Thread.currentThread());
        he.g gVar = cVar.f27633f;
        if (gVar.f19029d.f23631f.f23619b < 3) {
            z10 = false;
        }
        if (z10) {
            camera.setPreviewCallbackWithBuffer(gVar);
            ze.b e2 = gVar.e(2);
            if (e2 != null) {
                gVar.K().d(gVar.f19092l, e2, gVar.C);
                camera.startPreview();
            } else {
                throw new IllegalStateException("Preview stream size should never be null here.");
            }
        }
        cVar.m();
    }
}
