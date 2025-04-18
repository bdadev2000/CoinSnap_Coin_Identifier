package xe;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public final class h implements Camera.PreviewCallback {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        i iVar = this.a;
        iVar.l(false);
        fe.k kVar = (fe.k) iVar.a;
        int i10 = kVar.f17852b;
        ze.b bVar = kVar.f17853c;
        ze.b e2 = iVar.f27645e.e(2);
        if (e2 != null) {
            te.i.a("FallbackCameraThread").f25394c.post(new g(this, bArr, e2, i10, bVar));
            camera.setPreviewCallbackWithBuffer(null);
            camera.setPreviewCallbackWithBuffer(iVar.f27645e);
            iVar.f27645e.K().d(iVar.f27648h, e2, iVar.f27645e.C);
            return;
        }
        throw new IllegalStateException("Preview stream size should never be null here.");
    }
}
