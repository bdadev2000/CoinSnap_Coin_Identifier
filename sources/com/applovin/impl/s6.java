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
public class s6 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f26463a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f26464b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f26465c;
    private final a d;

    /* renamed from: f, reason: collision with root package name */
    private float f26466f;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public s6(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f26463a = jVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.j.l().getSystemService("sensor");
        this.f26464b = sensorManager;
        this.f26465c = sensorManager.getDefaultSensor(1);
        this.d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f26463a.g0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f26464b.unregisterListener(this);
        this.f26464b.registerListener(this, this.f26465c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f26464b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f26464b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f2 = this.f26466f;
            float f3 = (max * 0.5f) + (f2 * 0.5f);
            this.f26466f = f3;
            if (f2 < 0.8f && f3 > 0.8f) {
                this.d.a();
            } else {
                if (f2 <= -0.8f || f3 >= -0.8f) {
                    return;
                }
                this.d.b();
            }
        }
    }
}
