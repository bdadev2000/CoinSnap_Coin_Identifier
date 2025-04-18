package xe;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public final class a implements Camera.ShutterCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.Camera.ShutterCallback
    public final void onShutter() {
        e.f27639d.a(1, "take(): got onShutter callback.");
        this.a.l(true);
    }
}
