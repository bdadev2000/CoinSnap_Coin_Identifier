package com.bytedance.adsdk.ugeno.AlY.Sg;

import android.content.Context;
import com.bytedance.adsdk.ugeno.AlY.DSW;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import com.bytedance.adsdk.ugeno.AlY.vc;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class YFl {
    protected Sg.YFl AlY;
    protected String DSW;
    protected com.bytedance.adsdk.ugeno.Sg.Sg Sg;
    protected DSW YFl;
    protected Context qsH;
    protected com.bytedance.adsdk.ugeno.AlY.Sg tN;

    /* renamed from: vc, reason: collision with root package name */
    protected String f10232vc;
    protected Map<String, String> wN;

    /* renamed from: com.bytedance.adsdk.ugeno.AlY.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0059YFl {
        public static YFl YFl(Context context, com.bytedance.adsdk.ugeno.Sg.Sg sg2, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.AlY.Sg YFl;
            Sg.YFl YFl2;
            com.bytedance.adsdk.ugeno.AlY.tN YFl3;
            if (sg2 == null || jSONObject == null || (YFl = com.bytedance.adsdk.ugeno.AlY.Sg.YFl(jSONObject, jSONObject2)) == null || (YFl2 = YFl.YFl()) == null || (YFl3 = vc.YFl(YFl2.Sg())) == null) {
                return null;
            }
            YFl YFl4 = YFl3.YFl(context);
            YFl4.YFl(sg2);
            YFl4.YFl(YFl);
            YFl4.YFl();
            return YFl4;
        }
    }

    public YFl(Context context) {
        this.qsH = context;
    }

    public String Sg() {
        return this.f10232vc;
    }

    public void YFl() {
        this.AlY = this.tN.YFl();
        com.bytedance.adsdk.ugeno.AlY.Sg sg2 = this.tN;
        if (sg2 == null) {
            return;
        }
        Sg.YFl YFl = sg2.YFl();
        this.AlY = YFl;
        if (YFl == null) {
            return;
        }
        this.wN = YFl.tN();
        this.f10232vc = this.AlY.Sg();
        this.DSW = this.AlY.YFl();
    }

    public abstract boolean YFl(Object... objArr);

    public void YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2) {
        this.Sg = sg2;
    }

    public void YFl(com.bytedance.adsdk.ugeno.AlY.Sg sg2) {
        this.tN = sg2;
    }

    public void YFl(DSW dsw) {
        this.YFl = dsw;
    }
}
