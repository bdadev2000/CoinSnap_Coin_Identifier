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
public class YFl {
    private long AlY;
    private float Sg;
    private String YFl;
    private List<C0067YFl> tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10272vc;
    private long wN;

    /* renamed from: com.bytedance.adsdk.ugeno.core.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0067YFl {
        private long AlY;
        private float DSW;
        private String NjR;
        private float Sg;
        private long YFl;

        /* renamed from: nc, reason: collision with root package name */
        private String f10274nc;
        private float[] qsH;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private float f10275vc;
        private String wN;

        public long AlY() {
            return this.AlY;
        }

        public float DSW() {
            return this.DSW;
        }

        public String NjR() {
            return this.NjR;
        }

        public float Sg() {
            return this.Sg;
        }

        public long YFl() {
            return this.YFl;
        }

        public String nc() {
            return this.f10274nc;
        }

        public float[] qsH() {
            return this.qsH;
        }

        public String tN() {
            return this.tN;
        }

        public float vc() {
            return this.f10275vc;
        }

        public String wN() {
            return this.wN;
        }

        public void AlY(String str) {
            this.NjR = str;
        }

        public void Sg(long j3) {
            this.AlY = j3;
        }

        public void YFl(long j3) {
            this.YFl = j3;
        }

        public void tN(float f10) {
            this.DSW = f10;
        }

        public void Sg(String str) {
            this.wN = str;
        }

        public void YFl(float f10) {
            this.Sg = f10;
        }

        public void tN(String str) {
            this.f10274nc = str;
        }

        public void Sg(float f10) {
            this.f10275vc = f10;
        }

        public void YFl(String str) {
            this.tN = str;
        }

        public void YFl(float[] fArr) {
            this.qsH = fArr;
        }

        public static C0067YFl YFl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
            if (jSONObject == null) {
                return null;
            }
            C0067YFl c0067YFl = new C0067YFl();
            c0067YFl.YFl(jSONObject.optLong("duration"));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0067YFl.YFl(-1.0f);
            } else {
                try {
                    c0067YFl.YFl(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0067YFl.YFl(0.0f);
                }
            }
            c0067YFl.YFl(jSONObject.optString("loopMode"));
            c0067YFl.Sg(jSONObject.optString("type"));
            if (TextUtils.equals(c0067YFl.wN(), "ripple")) {
                c0067YFl.tN(jSONObject.optString("rippleColor"));
            }
            View NjR = sg2.NjR();
            Context context = NjR != null ? NjR.getContext() : null;
            if (TextUtils.equals(c0067YFl.wN(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String YFl = com.bytedance.adsdk.ugeno.tN.Sg.YFl(jSONObject.optString("valueTo"), sg2.nc());
                int YFl2 = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(jSONObject.optString("valueFrom"));
                int YFl3 = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(YFl);
                c0067YFl.Sg(YFl2);
                c0067YFl.tN(YFl3);
            } else if ((TextUtils.equals(c0067YFl.wN(), "translateX") || TextUtils.equals(c0067YFl.wN(), "translateY")) && context != null) {
                try {
                    float YFl4 = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, (float) jSONObject.optDouble("valueFrom"));
                    float YFl5 = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, (float) jSONObject.optDouble("valueTo"));
                    c0067YFl.Sg(YFl4);
                    c0067YFl.tN(YFl5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0067YFl.Sg((float) jSONObject.optDouble("valueFrom"));
                c0067YFl.tN((float) jSONObject.optDouble("valueTo"));
            }
            c0067YFl.AlY(jSONObject.optString("interpolator"));
            String YFl6 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(jSONObject.optString("startDelay"), sg2.nc());
            Log.d("TAG", "createAnimationModel: ");
            c0067YFl.Sg(com.bytedance.adsdk.ugeno.DSW.tN.YFl(YFl6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0067YFl.wN(), "translateX") || TextUtils.equals(c0067YFl.wN(), "translateY")) && context != null) {
                    while (i10 < optJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.DSW.qsH.YFl(context, (float) optJSONArray.optDouble(i10));
                        i10++;
                    }
                } else {
                    while (i10 < optJSONArray.length()) {
                        fArr[i10] = (float) optJSONArray.optDouble(i10);
                        i10++;
                    }
                }
                c0067YFl.YFl(fArr);
            }
            return c0067YFl;
        }
    }

    public long AlY() {
        return this.AlY;
    }

    public float Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public List<C0067YFl> tN() {
        return this.tN;
    }

    public String vc() {
        return this.f10272vc;
    }

    public long wN() {
        return this.wN;
    }

    public void Sg(long j3) {
        this.wN = j3;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void Sg(String str) {
        this.f10272vc = str;
    }

    public void YFl(float f10) {
        this.Sg = f10;
    }

    public void YFl(List<C0067YFl> list) {
        this.tN = list;
    }

    public void YFl(long j3) {
        this.AlY = j3;
    }

    public static YFl YFl(String str, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return YFl(new JSONObject(str), sg2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static YFl YFl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        return YFl(jSONObject, null, sg2);
    }

    public static YFl YFl(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        if (jSONObject == null) {
            return null;
        }
        YFl yFl = new YFl();
        yFl.YFl(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            yFl.YFl(-1.0f);
        } else {
            try {
                yFl.YFl(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                yFl.YFl(0.0f);
            }
        }
        yFl.YFl(jSONObject.optLong("duration", 0L));
        yFl.Sg(com.bytedance.adsdk.ugeno.DSW.tN.YFl(com.bytedance.adsdk.ugeno.tN.Sg.YFl(jSONObject.optString("startDelay"), sg2.nc()), 0L));
        yFl.Sg(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.DSW.Sg.YFl(jSONObject2, optJSONObject);
                }
                arrayList.add(C0067YFl.YFl(optJSONObject, sg2));
            }
            yFl.YFl(arrayList);
        }
        return yFl;
    }
}
