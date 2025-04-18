package com.bytedance.adsdk.ugeno.YFl.YFl;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class YFl {
    protected com.bytedance.adsdk.ugeno.Sg.Sg Sg;
    protected JSONObject YFl;
    private String tN;

    /* renamed from: com.bytedance.adsdk.ugeno.YFl.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0066YFl {
        public static YFl YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject) {
            if (sg2 == null || jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            optString.getClass();
            if (!optString.equals("ripple")) {
                if (!optString.equals("shine")) {
                    return null;
                }
                return new tN(sg2, jSONObject);
            }
            return new Sg(sg2, jSONObject);
        }
    }

    public YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject) {
        this.YFl = jSONObject;
        this.Sg = sg2;
        YFl();
    }

    public String AlY() {
        return this.tN;
    }

    public abstract void Sg();

    public void YFl() {
        this.tN = this.YFl.optString("type");
        Sg();
    }

    public abstract void YFl(int i10, int i11);

    public abstract void YFl(Canvas canvas);

    public abstract List<PropertyValuesHolder> tN();
}
