package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN {
    private int AlY;
    private int DSW;
    private int Sg;
    private int YFl;
    private List<Integer> tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10718vc;
    private List<String> wN;

    public int AlY() {
        return this.YFl;
    }

    public int DSW() {
        return this.AlY;
    }

    public int Sg() {
        int i10 = this.DSW;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public boolean YFl() {
        return this.f10718vc == 1;
    }

    public JSONObject qsH() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.YFl);
            jSONObject.put("interceptor_y", this.Sg);
            if (this.tN != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.tN.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.AlY);
            if (this.wN != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.wN.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.f10718vc);
            jSONObject.put("boc_index", this.DSW);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.Sg(th2.getMessage());
        }
        return jSONObject;
    }

    public List<String> tN() {
        return this.wN;
    }

    public List<Integer> vc() {
        return this.tN;
    }

    public int wN() {
        return this.Sg;
    }

    public void AlY(int i10) {
        this.Sg = i10;
    }

    public void Sg(int i10) {
        this.DSW = i10;
    }

    public void YFl(int i10) {
        this.f10718vc = i10;
    }

    public void tN(int i10) {
        this.YFl = i10;
    }

    public void wN(int i10) {
        this.AlY = i10;
    }

    public void Sg(List<Integer> list) {
        this.tN = list;
    }

    public void YFl(List<String> list) {
        this.wN = list;
    }
}
