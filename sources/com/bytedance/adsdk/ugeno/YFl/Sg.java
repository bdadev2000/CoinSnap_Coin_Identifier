package com.bytedance.adsdk.ugeno.YFl;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class Sg {
    private String AlY;
    private String DSW;
    private long Sg;
    private Map<String, TreeMap<Float, String>> YFl;
    private JSONObject qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10261vc;
    private long wN;

    public int AlY() {
        return this.tN;
    }

    public String DSW() {
        return this.DSW;
    }

    public Map<String, TreeMap<Float, String>> Sg() {
        return this.YFl;
    }

    public JSONObject YFl() {
        return this.qsH;
    }

    public long tN() {
        return this.Sg;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb2.append(this.YFl);
        sb2.append(", mDuration=");
        sb2.append(this.Sg);
        sb2.append(", mPlayCount=");
        sb2.append(this.tN);
        sb2.append(", mPlayDirection=");
        sb2.append(this.AlY);
        sb2.append(", mDelay=");
        sb2.append(this.wN);
        sb2.append(", mTransformOrigin='");
        sb2.append(this.f10261vc);
        sb2.append("', mTimingFunction='");
        return e.h(sb2, this.DSW, "'}");
    }

    public long vc() {
        return this.wN;
    }

    public String wN() {
        return this.AlY;
    }

    public void Sg(long j3) {
        this.wN = j3;
    }

    public void YFl(JSONObject jSONObject) {
        this.qsH = jSONObject;
    }

    public void tN(String str) {
        this.DSW = str;
    }

    public void Sg(String str) {
        this.f10261vc = str;
    }

    public void YFl(Map<String, TreeMap<Float, String>> map) {
        this.YFl = map;
    }

    public void YFl(long j3) {
        this.Sg = j3;
    }

    public void YFl(int i10) {
        this.tN = i10;
    }

    public void YFl(String str) {
        this.AlY = str;
    }
}
