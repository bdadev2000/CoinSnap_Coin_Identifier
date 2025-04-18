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

/* loaded from: classes2.dex */
public class oj implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f25889a;

    /* renamed from: b, reason: collision with root package name */
    private final float f25890b;

    /* renamed from: c, reason: collision with root package name */
    private final SensorManager f25891c;
    private final Sensor d;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f25892f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25893g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f25894h;

    /* renamed from: i, reason: collision with root package name */
    private float f25895i;

    public oj(com.applovin.impl.sdk.j jVar) {
        this.f25893g = jVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.j.l().getSystemService("sensor");
        this.f25891c = sensorManager;
        this.d = sensorManager.getDefaultSensor(9);
        this.f25892f = sensorManager.getDefaultSensor(4);
        this.f25889a = ((Integer) jVar.a(sj.v4)).intValue();
        this.f25890b = ((Float) jVar.a(sj.u4)).floatValue();
    }

    public float a() {
        if (this.f25894h == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f25895i;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f25893g.g0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f25891c.unregisterListener(this);
        if (((Boolean) this.f25893g.h0().a(sj.r4)).booleanValue()) {
            a(this.d);
        }
        if (((Boolean) this.f25893g.h0().a(sj.s4)).booleanValue()) {
            a(this.f25892f);
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f25891c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f25894h = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f2 = this.f25895i * this.f25890b;
            this.f25895i = f2;
            this.f25895i = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f2;
        }
    }

    private void a(Sensor sensor) {
        try {
            this.f25891c.registerListener(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros(this.f25889a));
        } catch (Throwable th) {
            this.f25893g.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f25893g.J().a("SensorDataManager", "Unable to register sensor listener", th);
            }
        }
    }
}
