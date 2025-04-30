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

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10208a;
    private final SensorManager b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f10209c;

    /* renamed from: d, reason: collision with root package name */
    private final a f10210d;

    /* renamed from: f, reason: collision with root package name */
    private float f10211f;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    public q6(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f10208a = kVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.k.k().getSystemService("sensor");
        this.b = sensorManager;
        this.f10209c = sensorManager.getDefaultSensor(1);
        this.f10210d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean((String) Q7.n0.d(this.f10208a, "disable_sensor_data_collection"))) {
            return;
        }
        this.b.unregisterListener(this);
        this.b.registerListener(this, this.f10209c, (int) TimeUnit.MILLISECONDS.toMicros(50L));
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.b.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f9 = this.f10211f;
            float f10 = (max * 0.5f) + (f9 * 0.5f);
            this.f10211f = f10;
            if (f9 < 0.8f && f10 > 0.8f) {
                this.f10210d.a();
            } else if (f9 > -0.8f && f10 < -0.8f) {
                this.f10210d.b();
            }
        }
    }
}
