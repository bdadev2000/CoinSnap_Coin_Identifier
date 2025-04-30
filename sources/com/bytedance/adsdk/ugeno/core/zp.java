package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private long COT;
    private String HWF;
    private List<C0067zp> KS;
    private long jU;
    private float lMd;
    private String zp;

    /* renamed from: com.bytedance.adsdk.ugeno.core.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0067zp {
        private String COT;
        private float HWF;
        private String KS;
        private float QR;
        private String YW;
        private String dT;
        private long jU;
        private float[] ku;
        private float lMd;
        private long zp;

        public String COT() {
            return this.COT;
        }

        public float HWF() {
            return this.HWF;
        }

        public String KS() {
            return this.KS;
        }

        public float QR() {
            return this.QR;
        }

        public String YW() {
            return this.YW;
        }

        public String dT() {
            return this.dT;
        }

        public long jU() {
            return this.jU;
        }

        public float[] ku() {
            return this.ku;
        }

        public float lMd() {
            return this.lMd;
        }

        public long zp() {
            return this.zp;
        }

        public void KS(float f9) {
            this.QR = f9;
        }

        public void jU(String str) {
            this.YW = str;
        }

        public void lMd(long j7) {
            this.jU = j7;
        }

        public void zp(long j7) {
            this.zp = j7;
        }

        public void KS(String str) {
            this.dT = str;
        }

        public void lMd(String str) {
            this.COT = str;
        }

        public void zp(float f9) {
            this.lMd = f9;
        }

        public void lMd(float f9) {
            this.HWF = f9;
        }

        public void zp(String str) {
            this.KS = str;
        }

        public void zp(float[] fArr) {
            this.ku = fArr;
        }

        public static C0067zp zp(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.lMd lmd) {
            if (jSONObject == null) {
                return null;
            }
            C0067zp c0067zp = new C0067zp();
            c0067zp.zp(jSONObject.optLong("duration"));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0067zp.zp(-1.0f);
            } else {
                try {
                    c0067zp.zp(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0067zp.zp(0.0f);
                }
            }
            c0067zp.zp(jSONObject.optString("loopMode"));
            c0067zp.lMd(jSONObject.optString("type"));
            if (TextUtils.equals(c0067zp.COT(), "ripple")) {
                c0067zp.KS(jSONObject.optString("rippleColor"));
            }
            View YW = lmd.YW();
            Context context = YW != null ? YW.getContext() : null;
            if (TextUtils.equals(c0067zp.COT(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String zp = com.bytedance.adsdk.ugeno.zp.KS.zp(jSONObject.optString("valueTo"), lmd.dT());
                int zp2 = com.bytedance.adsdk.ugeno.lMd.zp.zp(jSONObject.optString("valueFrom"));
                int zp3 = com.bytedance.adsdk.ugeno.lMd.zp.zp(zp);
                c0067zp.lMd(zp2);
                c0067zp.KS(zp3);
            } else if ((TextUtils.equals(c0067zp.COT(), "translateX") || TextUtils.equals(c0067zp.COT(), "translateY")) && context != null) {
                try {
                    float zp4 = com.bytedance.adsdk.ugeno.lMd.ku.zp(context, (float) jSONObject.optDouble("valueFrom"));
                    float zp5 = com.bytedance.adsdk.ugeno.lMd.ku.zp(context, (float) jSONObject.optDouble("valueTo"));
                    c0067zp.lMd(zp4);
                    c0067zp.KS(zp5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0067zp.lMd((float) jSONObject.optDouble("valueFrom"));
                c0067zp.KS((float) jSONObject.optDouble("valueTo"));
            }
            c0067zp.jU(jSONObject.optString("interpolator"));
            String zp6 = com.bytedance.adsdk.ugeno.zp.KS.zp(jSONObject.optString("startDelay"), lmd.dT());
            Log.d("TAG", "createAnimationModel: ");
            c0067zp.lMd(com.bytedance.adsdk.ugeno.lMd.KS.zp(zp6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i9 = 0;
                if ((TextUtils.equals(c0067zp.COT(), "translateX") || TextUtils.equals(c0067zp.COT(), "translateY")) && context != null) {
                    while (i9 < optJSONArray.length()) {
                        fArr[i9] = com.bytedance.adsdk.ugeno.lMd.ku.zp(context, (float) optJSONArray.optDouble(i9));
                        i9++;
                    }
                } else {
                    while (i9 < optJSONArray.length()) {
                        fArr[i9] = (float) optJSONArray.optDouble(i9);
                        i9++;
                    }
                }
                c0067zp.zp(fArr);
            }
            return c0067zp;
        }
    }

    public long COT() {
        return this.COT;
    }

    public String HWF() {
        return this.HWF;
    }

    public List<C0067zp> KS() {
        return this.KS;
    }

    public long jU() {
        return this.jU;
    }

    public float lMd() {
        return this.lMd;
    }

    public String zp() {
        return this.zp;
    }

    public void lMd(long j7) {
        this.COT = j7;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void lMd(String str) {
        this.HWF = str;
    }

    public void zp(float f9) {
        this.lMd = f9;
    }

    public void zp(List<C0067zp> list) {
        this.KS = list;
    }

    public void zp(long j7) {
        this.jU = j7;
    }

    public static zp zp(String str, com.bytedance.adsdk.ugeno.component.lMd lmd) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return zp(new JSONObject(str), lmd);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static zp zp(JSONObject jSONObject, com.bytedance.adsdk.ugeno.component.lMd lmd) {
        return zp(jSONObject, null, lmd);
    }

    public static zp zp(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.component.lMd lmd) {
        if (jSONObject == null) {
            return null;
        }
        zp zpVar = new zp();
        zpVar.zp(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            zpVar.zp(-1.0f);
        } else {
            try {
                zpVar.zp(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                zpVar.zp(0.0f);
            }
        }
        zpVar.zp(jSONObject.optLong("duration", 0L));
        zpVar.lMd(com.bytedance.adsdk.ugeno.lMd.KS.zp(com.bytedance.adsdk.ugeno.zp.KS.zp(jSONObject.optString("startDelay"), lmd.dT()), 0L));
        zpVar.lMd(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.lMd.lMd.zp(jSONObject2, optJSONObject);
                }
                arrayList.add(C0067zp.zp(optJSONObject, lmd));
            }
            zpVar.zp(arrayList);
        }
        return zpVar;
    }
}
