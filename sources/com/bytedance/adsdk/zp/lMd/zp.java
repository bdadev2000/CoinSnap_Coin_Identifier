package com.bytedance.adsdk.zp.lMd;

import com.bytedance.adsdk.zp.lMd.KS.zp.COT;
import com.bytedance.adsdk.zp.lMd.KS.zp.HWF;
import com.bytedance.adsdk.zp.lMd.KS.zp.KS;
import com.bytedance.adsdk.zp.lMd.KS.zp.QR;
import com.bytedance.adsdk.zp.lMd.KS.zp.YW;
import com.bytedance.adsdk.zp.lMd.KS.zp.dT;
import com.bytedance.adsdk.zp.lMd.KS.zp.jU;
import com.bytedance.adsdk.zp.lMd.KS.zp.ku;
import com.bytedance.adsdk.zp.lMd.KS.zp.lMd;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private static final com.bytedance.adsdk.zp.lMd.KS.zp zp;
    private String COT;
    private com.bytedance.adsdk.zp.lMd.lMd.zp KS;
    private Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> jU = new LinkedList();
    private final com.bytedance.adsdk.zp.lMd.KS.zp lMd;

    static {
        int i9 = 8;
        HWF[] hwfArr = {new dT(), new jU(), new YW(), new lMd(), new COT(), new com.bytedance.adsdk.zp.lMd.KS.zp.zp(), new QR(), new KS(), new ku()};
        final com.bytedance.adsdk.zp.lMd.KS.zp zpVar = new com.bytedance.adsdk.zp.lMd.KS.zp() { // from class: com.bytedance.adsdk.zp.lMd.zp.1
            @Override // com.bytedance.adsdk.zp.lMd.KS.zp
            public int zp(String str, int i10, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque) {
                return i10;
            }
        };
        while (i9 >= 0) {
            final HWF hwf = hwfArr[i9];
            i9--;
            zpVar = new com.bytedance.adsdk.zp.lMd.KS.zp() { // from class: com.bytedance.adsdk.zp.lMd.zp.2
                @Override // com.bytedance.adsdk.zp.lMd.KS.zp
                public int zp(String str, int i10, Deque<com.bytedance.adsdk.zp.lMd.lMd.zp> deque) {
                    return HWF.this.zp(str, i10, deque, zpVar);
                }
            };
        }
        zp = zpVar;
    }

    private zp(String str, com.bytedance.adsdk.zp.lMd.KS.zp zpVar) {
        this.lMd = zpVar;
        this.COT = str;
        try {
            zp();
        } catch (Exception e4) {
            throw new com.bytedance.adsdk.zp.zp.lMd(str, e4);
        }
    }

    public static zp zp(String str) {
        return new zp(str, zp);
    }

    private void zp() {
        int length = this.COT.length();
        int i9 = 0;
        while (i9 < length) {
            int zp2 = this.lMd.zp(this.COT, i9, this.jU);
            if (zp2 == i9) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.COT.substring(0, i9));
            }
            i9 = zp2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.zp.lMd.lMd.zp pollFirst = this.jU.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.KS = com.bytedance.adsdk.zp.lMd.COT.lMd.zp(arrayList, this.COT, i9);
                this.jU = null;
                return;
            }
        }
    }

    public <T> T zp(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) zp(hashMap);
    }

    public <T> T zp(Map<String, JSONObject> map) {
        return (T) this.KS.zp(map);
    }
}
