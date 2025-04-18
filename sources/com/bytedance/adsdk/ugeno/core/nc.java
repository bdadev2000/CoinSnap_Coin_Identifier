package com.bytedance.adsdk.ugeno.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc {
    private nc AlY;
    private int Sg;
    private com.bytedance.adsdk.ugeno.Sg.Sg YFl;
    private JSONObject tN;
    private nc wN;

    public nc AlY() {
        return this.AlY;
    }

    public int Sg() {
        return this.Sg;
    }

    public com.bytedance.adsdk.ugeno.Sg.Sg YFl() {
        return this.YFl;
    }

    public JSONObject tN() {
        return this.tN;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.YFl + ", mEventType=" + this.Sg + ", mEvent=" + this.tN + AbstractJsonLexerKt.END_OBJ;
    }

    public void Sg(nc ncVar) {
        this.wN = ncVar;
    }

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.YFl = sg2;
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    public void YFl(JSONObject jSONObject) {
        this.tN = jSONObject;
    }

    public void YFl(nc ncVar) {
        this.AlY = ncVar;
    }
}
