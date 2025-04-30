package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class kj implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f8699a;
    private final float b;

    /* renamed from: c, reason: collision with root package name */
    private final SensorManager f8700c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f8701d;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f8702f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8703g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f8704h;

    /* renamed from: i, reason: collision with root package name */
    private float f8705i;

    public kj(com.applovin.impl.sdk.k kVar) {
        this.f8703g = kVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.k.k().getSystemService("sensor");
        this.f8700c = sensorManager;
        this.f8701d = sensorManager.getDefaultSensor(9);
        this.f8702f = sensorManager.getDefaultSensor(4);
        this.f8699a = ((Integer) kVar.a(oj.f9826p4)).intValue();
        this.b = ((Float) kVar.a(oj.f9819o4)).floatValue();
    }

    public float a() {
        if (this.f8704h == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f8705i;
    }

    public void c() {
        if (Boolean.parseBoolean((String) Q7.n0.d(this.f8703g, "disable_sensor_data_collection"))) {
            return;
        }
        this.f8700c.unregisterListener(this);
        if (((Boolean) this.f8703g.h0().a(oj.f9801l4)).booleanValue()) {
            a(this.f8701d);
        }
        if (((Boolean) this.f8703g.h0().a(oj.f9806m4)).booleanValue()) {
            a(this.f8702f);
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8700c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f8704h = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f9 = this.f8705i * this.b;
            this.f8705i = f9;
            this.f8705i = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f9;
        }
    }

    private void a(Sensor sensor) {
        try {
            this.f8700c.registerListener(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros(this.f8699a));
        } catch (Throwable th) {
            this.f8703g.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f8703g.L().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }
}
