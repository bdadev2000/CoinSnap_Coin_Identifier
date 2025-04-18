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
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5717b;

    /* renamed from: c, reason: collision with root package name */
    private final SensorManager f5718c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f5719d;

    /* renamed from: f, reason: collision with root package name */
    private final Sensor f5720f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5721g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f5722h;

    /* renamed from: i, reason: collision with root package name */
    private float f5723i;

    public kj(com.applovin.impl.sdk.k kVar) {
        this.f5721g = kVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.k.k().getSystemService("sensor");
        this.f5718c = sensorManager;
        this.f5719d = sensorManager.getDefaultSensor(9);
        this.f5720f = sensorManager.getDefaultSensor(4);
        this.a = ((Integer) kVar.a(oj.f6732p4)).intValue();
        this.f5717b = ((Float) kVar.a(oj.f6724o4)).floatValue();
    }

    public float a() {
        if (this.f5722h == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f5723i;
    }

    public void c() {
        if (Boolean.parseBoolean((String) a4.j.b(this.f5721g, "disable_sensor_data_collection"))) {
            return;
        }
        this.f5718c.unregisterListener(this);
        if (((Boolean) this.f5721g.h0().a(oj.f6700l4)).booleanValue()) {
            a(this.f5719d);
        }
        if (((Boolean) this.f5721g.h0().a(oj.f6708m4)).booleanValue()) {
            a(this.f5720f);
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f5718c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f5722h = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f5723i * this.f5717b;
            this.f5723i = f10;
            this.f5723i = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }

    private void a(Sensor sensor) {
        try {
            this.f5718c.registerListener(this, sensor, (int) TimeUnit.MILLISECONDS.toMicros(this.a));
        } catch (Throwable th2) {
            this.f5721g.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f5721g.L().a("SensorDataManager", "Unable to register sensor listener", th2);
            }
        }
    }
}
