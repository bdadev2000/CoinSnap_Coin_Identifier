package com.glority.camera;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SensorController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 +2\u00020\u0001:\u0004+,-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0015J\u0010\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\rJ\u0006\u0010)\u001a\u00020\u0019J\u0006\u0010*\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/glority/camera/SensorController;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lightIntensity", "", "mAcceleratorSensor", "Landroid/hardware/Sensor;", "mLightSensor", "mOnOrientationChangedListener", "Lcom/glority/camera/SensorController$OnOrientationChangedListener;", "mSensorListener", "Lcom/glority/camera/SensorController$SensorListener;", "mSensorManager", "Landroid/hardware/SensorManager;", "mX", "", "mY", "mZ", "onLightChangedListener", "Lcom/glority/camera/SensorController$OnLightChangedListener;", "orientation", "status", "calculateLightIntensity", "", NotificationCompat.CATEGORY_EVENT, "Landroid/hardware/SensorEvent;", "calculateOrientation", "calculateStatus", "getOrientation", "getStatus", "onAccuracyChanged", "sensor", "accuracy", "onSensorChanged", "setOnLightChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnOrientationChangedListener", "setSensorListener", "sensorListener", "start", "stop", "Companion", "OnLightChangedListener", "OnOrientationChangedListener", "SensorListener", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class SensorController implements SensorEventListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int STATUS_MOVE = 2;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_STATIC = 1;
    private float lightIntensity;
    private Sensor mAcceleratorSensor;
    private Sensor mLightSensor;
    private OnOrientationChangedListener mOnOrientationChangedListener;
    private SensorListener mSensorListener;
    private SensorManager mSensorManager;
    private int mX;
    private int mY;
    private int mZ;
    private OnLightChangedListener onLightChangedListener;
    private int orientation;
    private int status;

    /* compiled from: SensorController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/camera/SensorController$OnLightChangedListener;", "", "onLightChanged", "", "sensorController", "Lcom/glority/camera/SensorController;", "light", "", "camera_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes6.dex */
    public interface OnLightChangedListener {
        void onLightChanged(SensorController sensorController, float light);
    }

    /* compiled from: SensorController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/camera/SensorController$OnOrientationChangedListener;", "", "onOrientationChanged", "", "sensorController", "Lcom/glority/camera/SensorController;", "orientation", "", "camera_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes6.dex */
    public interface OnOrientationChangedListener {
        void onOrientationChanged(SensorController sensorController, int orientation);
    }

    /* compiled from: SensorController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/camera/SensorController$SensorListener;", "", "onStatusChanged", "", "sensorController", "Lcom/glority/camera/SensorController;", "status", "", "camera_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes6.dex */
    public interface SensorListener {
        void onStatusChanged(SensorController sensorController, int status);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Intrinsics.checkParameterIsNotNull(sensor, "sensor");
    }

    /* compiled from: SensorController.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/glority/camera/SensorController$Companion;", "", "()V", "STATUS_MOVE", "", "STATUS_NONE", "STATUS_STATIC", "hasTorch", "", "context", "Landroid/content/Context;", "camera_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasTorch(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
    }

    public SensorController(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Object systemService = context.getSystemService("sensor");
        SensorManager sensorManager = (SensorManager) (systemService instanceof SensorManager ? systemService : null);
        this.mSensorManager = sensorManager;
        if (sensorManager != null) {
            this.mAcceleratorSensor = sensorManager.getDefaultSensor(1);
            this.mLightSensor = sensorManager.getDefaultSensor(5);
        }
    }

    public final void start() {
        SensorManager sensorManager;
        SensorManager sensorManager2;
        this.status = 0;
        this.mX = 0;
        this.mY = 0;
        this.mZ = 0;
        Sensor sensor = this.mAcceleratorSensor;
        if (sensor != null && (sensorManager2 = this.mSensorManager) != null) {
            sensorManager2.registerListener(this, sensor, 3);
        }
        Sensor sensor2 = this.mLightSensor;
        if (sensor2 == null || (sensorManager = this.mSensorManager) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor2, 3);
    }

    public final void stop() {
        SensorManager sensorManager;
        SensorManager sensorManager2;
        Sensor sensor = this.mAcceleratorSensor;
        if (sensor != null && (sensorManager2 = this.mSensorManager) != null) {
            sensorManager2.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.mLightSensor;
        if (sensor2 == null || (sensorManager = this.mSensorManager) == null) {
            return;
        }
        sensorManager.unregisterListener(this, sensor2);
    }

    public final void setSensorListener(SensorListener sensorListener) {
        this.mSensorListener = sensorListener;
    }

    public final void setOnOrientationChangedListener(OnOrientationChangedListener listener) {
        this.mOnOrientationChangedListener = listener;
    }

    public final void setOnLightChangedListener(OnLightChangedListener listener) {
        this.onLightChangedListener = listener;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event.sensor == null) {
            return;
        }
        Sensor sensor = event.sensor;
        Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
        int type = sensor.getType();
        if (type != 1) {
            if (type != 5) {
                return;
            }
            calculateLightIntensity(event);
        } else {
            calculateStatus(event);
            calculateOrientation(event);
            this.mX = (int) event.values[0];
            this.mY = (int) event.values[1];
            this.mZ = (int) event.values[2];
        }
    }

    private final void calculateStatus(SensorEvent event) {
        if (this.status == 0) {
            this.status = 1;
            return;
        }
        int i = (int) event.values[0];
        int i2 = (int) event.values[1];
        int i3 = (int) event.values[2];
        int abs = Math.abs(this.mX - i);
        int abs2 = Math.abs(this.mY - i2);
        int abs3 = Math.abs(this.mZ - i3);
        if (Math.sqrt((abs * abs) + (abs2 * abs2) + (abs3 * abs3)) > 1.0d) {
            this.status = 2;
            SensorListener sensorListener = this.mSensorListener;
            if (sensorListener != null) {
                sensorListener.onStatusChanged(this, 2);
                return;
            }
            return;
        }
        this.status = 1;
        SensorListener sensorListener2 = this.mSensorListener;
        if (sensorListener2 != null) {
            sensorListener2.onStatusChanged(this, 1);
        }
    }

    private final void calculateOrientation(SensorEvent event) {
        Sensor sensor = event.sensor;
        Intrinsics.checkExpressionValueIsNotNull(sensor, "event.sensor");
        if (1 != sensor.getType()) {
            return;
        }
        float[] fArr = event.values;
        float f = fArr[0];
        float f2 = fArr[1];
        double sqrt = f / Math.sqrt((f * f) + (f2 * f2));
        if (sqrt > 1) {
            sqrt = 1.0d;
        } else if (sqrt < -1) {
            sqrt = -1.0d;
        }
        int acos = (int) ((Math.acos(sqrt) * 180) / 3.141592653589793d);
        this.orientation = acos;
        if (f2 < 0) {
            this.orientation = 360 - acos;
        }
        OnOrientationChangedListener onOrientationChangedListener = this.mOnOrientationChangedListener;
        if (onOrientationChangedListener != null) {
            onOrientationChangedListener.onOrientationChanged(this, this.orientation);
        }
    }

    private final void calculateLightIntensity(SensorEvent event) {
        float f = event.values[0];
        this.lightIntensity = f;
        OnLightChangedListener onLightChangedListener = this.onLightChangedListener;
        if (onLightChangedListener != null) {
            onLightChangedListener.onLightChanged(this, f);
        }
    }
}
