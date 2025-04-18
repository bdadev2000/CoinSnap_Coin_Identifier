package com.bytedance.sdk.openadsdk.AlY.wN.Sg;

import com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl<T extends tN> {
    private T AlY;
    private String Sg;
    private Wwa YFl;
    private JSONObject tN;
    private boolean wN = false;

    public YFl(Wwa wwa, String str, JSONObject jSONObject, T t5) {
        this.YFl = wwa;
        this.Sg = str;
        this.tN = jSONObject;
        this.AlY = t5;
    }

    public T AlY() {
        return this.AlY;
    }

    public String Sg() {
        return this.Sg;
    }

    public Wwa YFl() {
        return this.YFl;
    }

    public JSONObject tN() {
        if (this.tN == null) {
            this.tN = new JSONObject();
        }
        return this.tN;
    }

    public boolean wN() {
        return this.wN;
    }

    public void YFl(boolean z10) {
        this.wN = z10;
    }
}
