package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    private Map<String, Object> AlY;
    private JSONObject Sg;
    private Context YFl;
    private JSONObject tN;

    public void Sg(JSONObject jSONObject) {
        this.tN = jSONObject;
    }

    public void YFl(Context context) {
        this.YFl = context;
    }

    public Map<String, Object> Sg() {
        return this.AlY;
    }

    public void YFl(JSONObject jSONObject) {
        this.Sg = jSONObject;
    }

    public JSONObject YFl() {
        return this.tN;
    }

    public void YFl(Map<String, Object> map) {
        this.AlY = map;
    }
}
