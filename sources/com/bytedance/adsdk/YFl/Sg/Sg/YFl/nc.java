package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class nc implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    private String Sg;
    private com.bytedance.adsdk.YFl.Sg.Sg.YFl[] YFl;
    private com.bytedance.adsdk.YFl.Sg.YFl.YFl tN;

    public nc(String str) {
        this.Sg = str;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.Sg);
        sb2.append("(");
        com.bytedance.adsdk.YFl.Sg.Sg.YFl[] yFlArr = this.YFl;
        if (yFlArr != null && yFlArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.YFl.Sg.Sg.YFl[] yFlArr2 = this.YFl;
                if (i10 >= yFlArr2.length) {
                    break;
                }
                sb2.append(yFlArr2[i10].Sg());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void YFl(com.bytedance.adsdk.YFl.Sg.Sg.YFl[] yFlArr) {
        this.YFl = yFlArr;
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        com.bytedance.adsdk.YFl.Sg.YFl.YFl yFl = new com.bytedance.adsdk.YFl.Sg.YFl.YFl();
        this.tN = yFl;
        yFl.YFl(this.Sg);
        Object[] objArr = new Object[this.YFl.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.YFl.Sg.Sg.YFl[] yFlArr = this.YFl;
            if (i10 < yFlArr.length) {
                com.bytedance.adsdk.YFl.Sg.Sg.YFl yFl2 = yFlArr[i10];
                if (yFl2 != null) {
                    objArr[i10] = yFl2.YFl(map);
                }
                i10++;
            } else {
                this.tN.YFl(objArr);
                return com.bytedance.adsdk.YFl.DSW.YFl(this.Sg).YFl(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.Sg.METHOD;
    }
}
