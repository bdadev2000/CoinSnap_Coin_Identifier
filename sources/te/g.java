package te;

import android.hardware.display.DisplayManager;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import s7.s2;

/* loaded from: classes4.dex */
public final class g implements DisplayManager.DisplayListener {
    public final /* synthetic */ s2 a;

    public g(s2 s2Var) {
        this.a = s2Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        s2 s2Var = this.a;
        int i11 = s2Var.f24753d;
        int a = s2Var.a();
        if (a != i11) {
            s2Var.f24753d = a;
            c1 c1Var = (c1) s2Var.f24755f;
            if (((CameraView) c1Var.f11925d).e()) {
                ((fe.c) c1Var.f11924c).a(2, "onDisplayOffsetChanged", "restarting the camera.");
                ((CameraView) c1Var.f11925d).close();
                ((CameraView) c1Var.f11925d).open();
            }
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
