package com.bytedance.sdk.openadsdk.qO;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vc {
    private WeakReference<qsH> Sg;
    private Context YFl;
    private Map<String, YFl> tN = new HashMap();
    private SensorEventListener AlY = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.qO.vc.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            qsH AlY;
            if (sensorEvent.sensor.getType() != 1 || (AlY = vc.this.AlY()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                AlY.YFl("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener wN = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.qO.vc.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            qsH AlY;
            if (sensorEvent.sensor.getType() != 4 || (AlY = vc.this.AlY()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                AlY.YFl("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: vc, reason: collision with root package name */
    private SensorEventListener f10800vc = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.qO.vc.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            qsH AlY;
            if (sensorEvent.sensor.getType() != 10 || (AlY = vc.this.AlY()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                AlY.YFl("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener DSW = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.qO.vc.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = nc.Sg;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = nc.tN;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = nc.AlY;
            SensorManager.getRotationMatrix(fArr5, null, nc.Sg, nc.tN);
            float[] fArr6 = nc.wN;
            SensorManager.getOrientation(fArr5, fArr6);
            qsH AlY = vc.this.AlY();
            if (AlY == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                AlY.YFl("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* loaded from: classes.dex */
    public interface YFl {
        JSONObject YFl(JSONObject jSONObject) throws Throwable;
    }

    public vc(qsH qsh) {
        this.YFl = qsh.YFl();
        this.Sg = new WeakReference<>(qsh);
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qsH AlY() {
        WeakReference<qsH> weakReference = this.Sg;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void tN() {
        this.tN.put("adInfo", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.45
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                if (AlY != null) {
                    JSONObject qO = AlY.qO();
                    if (qO != null) {
                        qO.put("code", 1);
                        return qO;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.tN.put("appInfo", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.56
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = vc.this.YFl().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                qsH AlY = vc.this.AlY();
                if (AlY != null) {
                    jSONObject2.put("deviceId", AlY.DSW());
                    jSONObject2.put("netType", AlY.rkt());
                    jSONObject2.put("innerAppName", AlY.AlY());
                    jSONObject2.put("appName", AlY.wN());
                    jSONObject2.put("appVersion", AlY.vc());
                    Map<String, String> Sg = AlY.Sg();
                    for (String str : Sg.keySet()) {
                        jSONObject2.put(str, Sg.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.tN.put("playableSDKInfo", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.61
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.tN.put("subscribe_app_ad", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.62
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("download_app_ad", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.63
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("isViewable", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.2
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                if (AlY == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", AlY.NjR());
                return jSONObject3;
            }
        });
        this.tN.put("getVolume", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.3
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                if (AlY == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", AlY.qsH());
                return jSONObject3;
            }
        });
        this.tN.put("getScreenSize", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.4
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                if (AlY == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject Wwa = AlY.Wwa();
                Wwa.put("code", 1);
                return Wwa;
            }
        });
        this.tN.put("start_accelerometer_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.5
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        DSW.YFl("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nc.YFl(vc.this.YFl, vc.this.AlY, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("close_accelerometer_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.6
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, vc.this.AlY);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("start_gyro_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.7
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        DSW.YFl("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nc.Sg(vc.this.YFl, vc.this.wN, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("close_gyro_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.8
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, vc.this.wN);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("start_accelerometer_grativityless_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.9
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        DSW.YFl("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nc.tN(vc.this.YFl, vc.this.f10800vc, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("close_accelerometer_grativityless_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.10
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, vc.this.f10800vc);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("start_rotation_vector_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.11
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i10 = 2;
                if (jSONObject != null) {
                    try {
                        i10 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        DSW.YFl("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nc.AlY(vc.this.YFl, vc.this.DSW, i10);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("close_rotation_vector_observer", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.13
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, vc.this.DSW);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("device_shake", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.14
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("device_shake_short", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.15
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nc.YFl(vc.this.YFl, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    DSW.YFl("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.tN.put("playable_style", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.16
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY != null) {
                    JSONObject tN = AlY.tN();
                    tN.put("code", 1);
                    return tN;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.tN.put("sendReward", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.17
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY != null) {
                    AlY.wXo();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.tN.put("webview_time_track", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.18
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.tN.put("playable_event", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.19
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY != null && jSONObject != null) {
                    AlY.Sg(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.tN.put("reportAd", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.20
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("close", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.21
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("openAdLandPageLinks", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.22
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("get_viewport", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.24
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject aIu = AlY.aIu();
                aIu.put("code", 1);
                return aIu;
            }
        });
        this.tN.put("jssdk_load_finish", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.25
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.hQ();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_material_render_result", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.26
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.NjR(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("detect_change_playable_click", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.27
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject nc2 = AlY.nc();
                nc2.put("code", 1);
                return nc2;
            }
        });
        this.tN.put("check_camera_permission", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.28
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject GA = AlY.GA();
                GA.put("code", 1);
                return GA;
            }
        });
        this.tN.put("check_external_storage", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.29
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject pDU = AlY.pDU();
                if (pDU.isNull("result")) {
                    pDU.put("code", -1);
                } else {
                    pDU.put("code", 1);
                }
                return pDU;
            }
        });
        this.tN.put("playable_open_camera", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.30
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_pick_photo", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.31
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_download_media_in_photos", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.32
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.YFl(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_preventTouchEvent", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.33
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.Sg(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_settings_info", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.35
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject EH = AlY.EH();
                EH.put("code", 1);
                return EH;
            }
        });
        this.tN.put("playable_load_main_scene", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.36
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.Ne();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_enter_section", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.37
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.AlY(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_end", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.38
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.VOe();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_finish_play_playable", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.39
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.bZ();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_transfrom_module_show", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.40
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.UZM();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_transfrom_module_change_color", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.41
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.YI();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_set_scroll_rect", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.42
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_click_area", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.43
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.wN(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_real_play_start", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.44
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_material_first_frame_show", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.46
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.Ga();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_stuck_check_pong", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.47
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.dXO();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_material_adnormal_mask", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.48
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                AlY.vc(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_long_press_panel", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.49
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_alpha_player_play", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.50
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_transfrom_module_highlight", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.51
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_send_click_event", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.52
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_query_media_permission_declare", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.53
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject DSW = AlY.DSW(jSONObject);
                DSW.put("code", 1);
                return DSW;
            }
        });
        this.tN.put("playable_query_media_permission_enable", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.54
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                qsH AlY = vc.this.AlY();
                JSONObject jSONObject2 = new JSONObject();
                if (AlY == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject qsH = AlY.qsH(jSONObject);
                qsH.put("code", 1);
                return qsH;
            }
        });
        this.tN.put("playable_apply_media_permission", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.55
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_start_kws", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.57
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_close_kws", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.58
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_video_preload_task_add", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.59
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.tN.put("playable_video_preload_task_cancel", new YFl() { // from class: com.bytedance.sdk.openadsdk.qO.vc.60
            @Override // com.bytedance.sdk.openadsdk.qO.vc.YFl
            public JSONObject YFl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.qO.YFl wN = vc.this.wN();
                JSONObject jSONObject2 = new JSONObject();
                if (wN == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.qO.YFl wN() {
        qsH AlY = AlY();
        if (AlY == null) {
            return null;
        }
        return AlY.lG();
    }

    public Set<String> YFl() {
        return this.tN.keySet();
    }

    public JSONObject YFl(String str, JSONObject jSONObject) {
        try {
            YFl yFl = this.tN.get(str);
            if (yFl == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return yFl.YFl(jSONObject);
        } catch (Throwable th2) {
            DSW.YFl("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }
}
