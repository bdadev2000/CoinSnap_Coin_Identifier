package x5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public androidx.fragment.app.e f27408b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            androidx.fragment.app.e eVar = this.f27408b;
            if (eVar != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                    eVar.e();
                }
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
