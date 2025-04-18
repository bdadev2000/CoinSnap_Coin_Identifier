package le;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;

/* loaded from: classes4.dex */
public abstract class b extends ie.e {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21363e = true;

    @Override // ie.e
    public final void i(ie.b bVar) {
        MeteringRectangle meteringRectangle;
        this.f19605c = bVar;
        if (this.f21363e) {
            meteringRectangle = new MeteringRectangle((Rect) j(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect()), 0);
        } else {
            meteringRectangle = null;
        }
        m(bVar, meteringRectangle);
    }

    public abstract void m(ie.b bVar, MeteringRectangle meteringRectangle);
}
