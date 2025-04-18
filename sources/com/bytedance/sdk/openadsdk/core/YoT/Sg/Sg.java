package com.bytedance.sdk.openadsdk.core.YoT.Sg;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg extends tN implements Comparable<Sg> {
    private final float YFl;

    /* loaded from: classes.dex */
    public static class YFl {
        private final float Sg;
        private final String YFl;
        private tN.EnumC0118tN tN = tN.EnumC0118tN.TRACKING_URL;
        private boolean AlY = false;

        public YFl(String str, float f10) {
            this.YFl = str;
            this.Sg = f10;
        }

        public Sg YFl() {
            return new Sg(this.Sg, this.YFl, this.tN, Boolean.valueOf(this.AlY));
        }
    }

    public JSONObject Sg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, tN());
        jSONObject.put("trackingFraction", this.YFl);
        return jSONObject;
    }

    public boolean YFl(float f10) {
        return this.YFl <= f10 && !wN();
    }

    @Override // com.bytedance.sdk.openadsdk.core.YoT.Sg.tN
    public void j_() {
        super.j_();
    }

    private Sg(float f10, String str, tN.EnumC0118tN enumC0118tN, Boolean bool) {
        super(str, enumC0118tN, bool);
        this.YFl = f10;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(Sg sg2) {
        if (sg2 == null) {
            return 1;
        }
        float f10 = this.YFl;
        float f11 = sg2.YFl;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
