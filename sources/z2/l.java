package z2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class l implements SensorEventListener {
    public F2.e b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i9) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(sensor, "sensor");
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(sensorEvent, NotificationCompat.CATEGORY_EVENT);
            F2.e eVar = this.b;
            if (eVar != null) {
                float[] fArr = sensorEvent.values;
                double d2 = fArr[0] / 9.80665f;
                double d9 = fArr[1] / 9.80665f;
                double d10 = fArr[2] / 9.80665f;
                if (Math.sqrt((d10 * d10) + (d9 * d9) + (d2 * d2)) > 2.3d) {
                    eVar.b();
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
