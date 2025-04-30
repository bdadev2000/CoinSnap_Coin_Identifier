package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class C implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    private static C f19519f;

    /* renamed from: a, reason: collision with root package name */
    private SensorManager f19520a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f19521c = 0;

    /* renamed from: d, reason: collision with root package name */
    private float[] f19522d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    private List<String> f19523e = new ArrayList();

    private C(Context context) {
        this.f19520a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.f19520a = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.f19520a;
            if (sensorManager != null) {
                int i9 = this.b - 1;
                this.b = i9;
                if (i9 == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void a() {
        StringBuilder sb;
        String str;
        try {
            try {
                synchronized (this) {
                    try {
                        SensorManager sensorManager = this.f19520a;
                        if (sensorManager != null) {
                            if (this.b == 0) {
                                if (this.f19520a.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                                }
                            }
                            this.b++;
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (this) {
                    int i9 = 0;
                    while (this.f19521c == 0 && i9 < 10) {
                        try {
                            i9++;
                            wait(100L);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                sb = new StringBuilder();
                sb.append(decimalFormat.format(this.f19522d[0]));
                sb.append(",");
                sb.append(decimalFormat.format(this.f19522d[1]));
                sb.append(",");
                sb.append(decimalFormat.format(this.f19522d[2]));
            } catch (Throwable unused2) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
                sb = new StringBuilder();
                sb.append(decimalFormat2.format(this.f19522d[0]));
                sb.append(",");
                sb.append(decimalFormat2.format(this.f19522d[1]));
                sb.append(",");
                sb.append(decimalFormat2.format(this.f19522d[2]));
            }
            str = sb.toString();
        } catch (Throwable unused3) {
            str = null;
        }
        c();
        this.f19521c = 0;
        if (str == null) {
            return;
        }
        this.f19523e.add(str);
        try {
            int size = this.f19523e.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f19523e.subList(size - 10, size));
                this.f19523e.clear();
                this.f19523e = arrayList;
            }
        } catch (Throwable unused4) {
        }
    }

    public synchronized String b() {
        String str = "";
        int size = this.f19523e.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f19523e.get(0);
        }
        try {
            List<String> list = this.f19523e;
            int i9 = size - 10;
            if (i9 <= 0) {
                i9 = 0;
            }
            List<String> subList = list.subList(i9, size);
            for (int i10 = 0; i10 < subList.size(); i10++) {
                str = str + subList.get(i10) + "|";
            }
            str = str.substring(0, str.length() - 1);
        } catch (Throwable unused) {
        }
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f19522d = sensorEvent.values;
        this.f19521c = 1;
    }

    public static C a(Context context) {
        if (f19519f == null) {
            synchronized (C.class) {
                try {
                    if (f19519f == null) {
                        f19519f = new C(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19519f;
    }
}
