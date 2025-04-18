package p9;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes3.dex */
public final class d implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23498b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f23499c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23500d = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public final float[] f23501f = new float[3];

    /* renamed from: g, reason: collision with root package name */
    public final Display f23502g;

    /* renamed from: h, reason: collision with root package name */
    public final c[] f23503h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23504i;

    public d(Display display, c... cVarArr) {
        this.f23502g = display;
        this.f23503h = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f23498b;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f23502g.getRotation();
        float[] fArr3 = this.f23499c;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i11 = 130;
                        i10 = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f23501f;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(this.f23498b, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr5 = this.f23498b;
        if (!this.f23504i) {
            h3.a.d(this.f23500d, fArr5);
            this.f23504i = true;
        }
        System.arraycopy(fArr5, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr5, 0, this.f23499c, 0, this.f23500d, 0);
        for (c cVar : this.f23503h) {
            cVar.a(fArr2, f10);
        }
    }
}
