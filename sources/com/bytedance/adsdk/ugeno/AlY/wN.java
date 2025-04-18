package com.bytedance.adsdk.ugeno.AlY;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.AlY.Sg.YFl;
import com.bytedance.adsdk.ugeno.AlY.YFl.YFl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN implements DSW {
    private com.bytedance.adsdk.ugeno.Sg.Sg Sg;
    private Map<String, com.bytedance.adsdk.ugeno.AlY.Sg.YFl> YFl;
    private boolean tN;

    public wN(com.bytedance.adsdk.ugeno.Sg.Sg sg2, Map<String, com.bytedance.adsdk.ugeno.AlY.Sg.YFl> map) {
        this.Sg = sg2;
        this.YFl = map;
    }

    public void Sg() {
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl = YFl("twist");
        if (YFl != null) {
            YFl.YFl(this);
            YFl.YFl(new Object[0]);
        }
    }

    public void YFl() {
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl = YFl("shake");
        if (YFl != null) {
            YFl.YFl(this);
            YFl.YFl(new Object[0]);
        }
    }

    public void tN() {
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl = YFl("shake");
        if (YFl != null) {
            YFl.YFl(this);
            YFl.YFl(new Object[0]);
        }
    }

    public boolean YFl(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl = YFl("tap");
        if (YFl instanceof com.bytedance.adsdk.ugeno.AlY.Sg.tN) {
            YFl.YFl(this);
            this.tN = YFl.YFl(motionEvent);
        }
        if (this.tN) {
            return true;
        }
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl2 = YFl("slide");
        if (YFl2 instanceof com.bytedance.adsdk.ugeno.AlY.Sg.Sg) {
            YFl2.YFl(this);
            return YFl2.YFl(motionEvent);
        }
        return this.tN;
    }

    private void YFl(String str, List<Sg.YFl> list) {
        com.bytedance.adsdk.ugeno.AlY.YFl.YFl YFl;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Sg.YFl yFl : list) {
            if (yFl != null && (YFl = YFl.C0060YFl.YFl(this.Sg, str, yFl)) != null) {
                YFl.YFl();
            }
        }
    }

    private com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl(String str) {
        Map<String, com.bytedance.adsdk.ugeno.AlY.Sg.YFl> map = this.YFl;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.YFl.get(str);
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.DSW
    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str, List<Sg.YFl> list) {
        YFl(str, list);
    }

    public static wN YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, String str) {
        com.bytedance.adsdk.ugeno.AlY.Sg.YFl YFl;
        if (sg2 != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null && (YFl = YFl.C0059YFl.YFl(sg2.NjR().getContext(), sg2, optJSONObject, sg2.nc())) != null) {
                        hashMap.put(YFl.Sg(), YFl);
                    }
                }
                return new wN(sg2, hashMap);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
