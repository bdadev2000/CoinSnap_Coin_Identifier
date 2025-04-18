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
public class q6 implements SensorEventListener, AppLovinBroadcastManager.Receiver {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f7125b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f7126c;

    /* renamed from: d, reason: collision with root package name */
    private final a f7127d;

    /* renamed from: f, reason: collision with root package name */
    private float f7128f;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public q6(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.k.k().getSystemService("sensor");
        this.f7125b = sensorManager;
        this.f7126c = sensorManager.getDefaultSensor(1);
        this.f7127d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean((String) a4.j.b(this.a, "disable_sensor_data_collection"))) {
            return;
        }
        this.f7125b.unregisterListener(this);
        this.f7125b.registerListener(this, this.f7126c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f7125b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f7125b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f7128f;
            float f11 = (max * 0.5f) + (f10 * 0.5f);
            this.f7128f = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f7127d.a();
            } else if (f10 > -0.8f && f11 < -0.8f) {
                this.f7127d.b();
            }
        }
    }
}
