package com.bytedance.sdk.openadsdk.vDp;

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
public class HWF {
    private WeakReference<ku> lMd;
    private Context zp;
    private Map<String, zp> KS = new HashMap();
    private SensorEventListener jU = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ku jU;
            if (sensorEvent.sensor.getType() != 1 || (jU = HWF.this.jU()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f9);
                jSONObject.put("y", f10);
                jSONObject.put("z", f11);
                jU.zp("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener COT = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ku jU;
            if (sensorEvent.sensor.getType() != 4 || (jU = HWF.this.jU()) == null) {
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
                jU.zp("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener HWF = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ku jU;
            if (sensorEvent.sensor.getType() != 10 || (jU = HWF.this.jU()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f9);
                jSONObject.put("y", f10);
                jSONObject.put("z", f11);
                jU.zp("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener QR = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = dT.lMd;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = dT.KS;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = dT.jU;
            SensorManager.getRotationMatrix(fArr5, null, dT.lMd, dT.KS);
            float[] fArr6 = dT.COT;
            SensorManager.getOrientation(fArr5, fArr6);
            ku jU = HWF.this.jU();
            if (jU == null) {
                return;
            }
            float f9 = fArr6[0];
            float f10 = fArr6[1];
            float f11 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f9);
                jSONObject.put("beta", f10);
                jSONObject.put("gamma", f11);
                jU.zp("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    /* loaded from: classes.dex */
    public interface zp {
        JSONObject zp(JSONObject jSONObject) throws Throwable;
    }

    public HWF(ku kuVar) {
        this.zp = kuVar.zp();
        this.lMd = new WeakReference<>(kuVar);
        KS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.vDp.zp COT() {
        ku jU = jU();
        if (jU == null) {
            return null;
        }
        return jU.woN();
    }

    private void KS() {
        this.KS.put("adInfo", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.45
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                if (jU != null) {
                    JSONObject pvr = jU.pvr();
                    if (pvr != null) {
                        pvr.put("code", 1);
                        return pvr;
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
        this.KS.put("appInfo", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.56
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = HWF.this.zp().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                ku jU = HWF.this.jU();
                if (jU != null) {
                    jSONObject2.put("deviceId", jU.QR());
                    jSONObject2.put("netType", jU.KVG());
                    jSONObject2.put("innerAppName", jU.jU());
                    jSONObject2.put("appName", jU.COT());
                    jSONObject2.put("appVersion", jU.HWF());
                    Map<String, String> lMd = jU.lMd();
                    for (String str : lMd.keySet()) {
                        jSONObject2.put(str, lMd.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.KS.put("playableSDKInfo", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.61
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.KS.put("subscribe_app_ad", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.62
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("download_app_ad", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.63
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("isViewable", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.2
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                if (jU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", jU.YW());
                return jSONObject3;
            }
        });
        this.KS.put("getVolume", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.3
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                if (jU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", jU.ku());
                return jSONObject3;
            }
        });
        this.KS.put("getScreenSize", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.4
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                if (jU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject vwr = jU.vwr();
                vwr.put("code", 1);
                return vwr;
            }
        });
        this.KS.put("start_accelerometer_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.5
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i9 = 2;
                if (jSONObject != null) {
                    try {
                        i9 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        QR.zp("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                dT.zp(HWF.this.zp, HWF.this.jU, i9);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("close_accelerometer_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.6
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, HWF.this.jU);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("start_gyro_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.7
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i9 = 2;
                if (jSONObject != null) {
                    try {
                        i9 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        QR.zp("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                dT.lMd(HWF.this.zp, HWF.this.COT, i9);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("close_gyro_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.8
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, HWF.this.COT);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("start_accelerometer_grativityless_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.9
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i9 = 2;
                if (jSONObject != null) {
                    try {
                        i9 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        QR.zp("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                dT.KS(HWF.this.zp, HWF.this.HWF, i9);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("close_accelerometer_grativityless_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.10
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, HWF.this.HWF);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("start_rotation_vector_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.11
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i9 = 2;
                if (jSONObject != null) {
                    try {
                        i9 = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        QR.zp("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                dT.jU(HWF.this.zp, HWF.this.QR, i9);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("close_rotation_vector_observer", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.13
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, HWF.this.QR);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("device_shake", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.14
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("device_shake_short", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.15
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    dT.zp(HWF.this.zp, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    QR.zp("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.KS.put("playable_style", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.16
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU != null) {
                    JSONObject KS = jU.KS();
                    KS.put("code", 1);
                    return KS;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.KS.put("sendReward", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.17
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU != null) {
                    jU.FP();
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.KS.put("webview_time_track", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.18
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.KS.put("playable_event", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.19
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU != null && jSONObject != null) {
                    jU.lMd(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                }
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
        });
        this.KS.put("reportAd", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.20
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("close", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.21
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("openAdLandPageLinks", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.22
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("get_viewport", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.24
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject cz = jU.cz();
                cz.put("code", 1);
                return cz;
            }
        });
        this.KS.put("jssdk_load_finish", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.25
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.cW();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_material_render_result", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.26
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.YW(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("detect_change_playable_click", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.27
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject dT = jU.dT();
                dT.put("code", 1);
                return dT;
            }
        });
        this.KS.put("check_camera_permission", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.28
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject tG = jU.tG();
                tG.put("code", 1);
                return tG;
            }
        });
        this.KS.put("check_external_storage", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.29
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject rV = jU.rV();
                if (rV.isNull("result")) {
                    rV.put("code", -1);
                } else {
                    rV.put("code", 1);
                }
                return rV;
            }
        });
        this.KS.put("playable_open_camera", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.30
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_pick_photo", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.31
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_download_media_in_photos", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.32
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.zp(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_preventTouchEvent", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.33
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.lMd(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_settings_info", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.35
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject dQp = jU.dQp();
                dQp.put("code", 1);
                return dQp;
            }
        });
        this.KS.put("playable_load_main_scene", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.36
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.ot();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_enter_section", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.37
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.jU(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_end", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.38
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.yRU();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_finish_play_playable", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.39
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.ox();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_transfrom_module_show", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.40
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.RCv();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_transfrom_module_change_color", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.41
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.Lij();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_set_scroll_rect", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.42
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_click_area", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.43
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.COT(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_real_play_start", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.44
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_material_first_frame_show", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.46
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.Gzh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_stuck_check_pong", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.47
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.irS();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_material_adnormal_mask", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.48
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jU.HWF(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_long_press_panel", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.49
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_alpha_player_play", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.50
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_transfrom_module_highlight", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.51
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_send_click_event", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.52
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_query_media_permission_declare", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.53
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject QR = jU.QR(jSONObject);
                QR.put("code", 1);
                return QR;
            }
        });
        this.KS.put("playable_query_media_permission_enable", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.54
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                ku jU = HWF.this.jU();
                JSONObject jSONObject2 = new JSONObject();
                if (jU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject ku = jU.ku(jSONObject);
                ku.put("code", 1);
                return ku;
            }
        });
        this.KS.put("playable_apply_media_permission", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.55
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_start_kws", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.57
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_close_kws", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.58
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_video_preload_task_add", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.59
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.KS.put("playable_video_preload_task_cancel", new zp() { // from class: com.bytedance.sdk.openadsdk.vDp.HWF.60
            @Override // com.bytedance.sdk.openadsdk.vDp.HWF.zp
            public JSONObject zp(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.vDp.zp COT = HWF.this.COT();
                JSONObject jSONObject2 = new JSONObject();
                if (COT == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ku jU() {
        WeakReference<ku> weakReference = this.lMd;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void lMd() {
        dT.zp(this.zp, this.jU);
        dT.zp(this.zp, this.COT);
        dT.zp(this.zp, this.HWF);
        dT.zp(this.zp, this.QR);
    }

    public Set<String> zp() {
        return this.KS.keySet();
    }

    public JSONObject zp(String str, JSONObject jSONObject) {
        try {
            zp zpVar = this.KS.get(str);
            if (zpVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return zpVar.zp(jSONObject);
        } catch (Throwable th) {
            QR.zp("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
