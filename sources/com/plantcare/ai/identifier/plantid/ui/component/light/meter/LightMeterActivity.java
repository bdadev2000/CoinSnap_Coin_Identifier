package com.plantcare.ai.identifier.plantid.ui.component.light.meter;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import fe.j;
import kf.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import mf.a;
import v8.u0;
import x5.i;
import y0.p0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/ui/component/light/meter/LightMeterActivity;", "Lmf/a;", "Lkf/s;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LightMeterActivity extends a implements SensorEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16641h = 0;

    /* renamed from: f, reason: collision with root package name */
    public SensorManager f16642f;

    /* renamed from: g, reason: collision with root package name */
    public Sensor f16643g;

    @Override // mf.a
    public final int m() {
        return R.layout.activity_light_meter;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // h.m, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        j jVar;
        super.onDestroy();
        Handler handler = u0.f26306l;
        if (handler != null && (jVar = u0.f26307m) != null) {
            handler.removeCallbacks(jVar);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        SensorManager sensorManager = this.f16642f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // mf.a, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        SensorManager sensorManager;
        super.onResume();
        Sensor sensor = this.f16643g;
        if (sensor != null && (sensorManager = this.f16642f) != null) {
            sensorManager.registerListener(this, sensor, 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z10;
        Sensor sensor;
        if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensor.getType() == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f10 = sensorEvent.values[0];
            ((s) n()).f20877w.setText(getString(R.string.number_lux, String.valueOf(MathKt.roundToInt(f10))));
            if (f10 <= 430.0f) {
                ((s) n()).f20878x.setText(getString(R.string.light_not_enough));
                return;
            }
            if (f10 > 430.0f && f10 < 1180.0f) {
                ((s) n()).f20878x.setText(getString(R.string.light_optimize_des));
                return;
            } else {
                if (f10 >= 1180.0f) {
                    ((s) n()).f20878x.setText(getString(R.string.light_too_many));
                    return;
                }
                return;
            }
        }
        t();
    }

    @Override // mf.a
    public final void q() {
        SensorManager sensorManager;
        Object systemService = getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        if (sensorManager != null) {
            this.f16642f = sensorManager;
            this.f16643g = sensorManager.getDefaultSensor(5);
            Unit unit = Unit.INSTANCE;
        } else {
            new eg.a(this, 2);
        }
        i.c(new eg.a(this, 0), new eg.a(this, 1));
    }

    @Override // mf.a
    public final void s() {
        ImageView icBack = ((s) n()).u;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        e.p(icBack, new p0(this, 9));
    }

    public final void t() {
        TextView tvLux = ((s) n()).f20877w;
        Intrinsics.checkNotNullExpressionValue(tvLux, "tvLux");
        e.D(tvLux);
        ((s) n()).f20878x.setText(getString(R.string.not_support_sensor));
    }
}
