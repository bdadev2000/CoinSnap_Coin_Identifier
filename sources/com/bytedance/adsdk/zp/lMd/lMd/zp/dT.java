package com.bytedance.adsdk.zp.lMd.lMd.zp;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT implements com.bytedance.adsdk.zp.lMd.lMd.zp {
    private com.bytedance.adsdk.zp.lMd.zp.zp KS;
    private String lMd;
    private com.bytedance.adsdk.zp.lMd.lMd.zp[] zp;

    public dT(String str) {
        this.lMd = str;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public String lMd() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lMd);
        sb.append("(");
        com.bytedance.adsdk.zp.lMd.lMd.zp[] zpVarArr = this.zp;
        if (zpVarArr != null && zpVarArr.length > 0) {
            int i9 = 0;
            while (true) {
                com.bytedance.adsdk.zp.lMd.lMd.zp[] zpVarArr2 = this.zp;
                if (i9 >= zpVarArr2.length) {
                    break;
                }
                sb.append(zpVarArr2[i9].lMd());
                sb.append(",");
                i9++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void zp(com.bytedance.adsdk.zp.lMd.lMd.zp[] zpVarArr) {
        this.zp = zpVarArr;
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public Object zp(Map<String, JSONObject> map) {
        com.bytedance.adsdk.zp.lMd.zp.zp zpVar = new com.bytedance.adsdk.zp.lMd.zp.zp();
        this.KS = zpVar;
        zpVar.zp(this.lMd);
        Object[] objArr = new Object[this.zp.length];
        int i9 = 0;
        while (true) {
            com.bytedance.adsdk.zp.lMd.lMd.zp[] zpVarArr = this.zp;
            if (i9 < zpVarArr.length) {
                com.bytedance.adsdk.zp.lMd.lMd.zp zpVar2 = zpVarArr[i9];
                if (zpVar2 != null) {
                    objArr[i9] = zpVar2.zp(map);
                }
                i9++;
            } else {
                this.KS.zp(objArr);
                return this.KS;
            }
        }
    }

    @Override // com.bytedance.adsdk.zp.lMd.lMd.zp
    public com.bytedance.adsdk.zp.lMd.jU.COT zp() {
        return com.bytedance.adsdk.zp.lMd.jU.lMd.METHOD;
    }
}
