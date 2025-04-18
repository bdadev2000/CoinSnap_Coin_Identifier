package com.bytedance.adsdk.YFl.Sg;

import com.bytedance.adsdk.YFl.Sg.tN.YFl.AlY;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.DSW;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.NjR;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.Sg;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.nc;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.qsH;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.tN;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.vc;
import com.bytedance.adsdk.YFl.Sg.tN.YFl.wN;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private static final com.bytedance.adsdk.YFl.Sg.tN.YFl YFl;
    private Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> AlY = new LinkedList();
    private final com.bytedance.adsdk.YFl.Sg.tN.YFl Sg;
    private com.bytedance.adsdk.YFl.Sg.Sg.YFl tN;
    private String wN;

    static {
        int i10 = 8;
        vc[] vcVarArr = {new nc(), new AlY(), new NjR(), new Sg(), new wN(), new com.bytedance.adsdk.YFl.Sg.tN.YFl.YFl(), new DSW(), new tN(), new qsH()};
        final com.bytedance.adsdk.YFl.Sg.tN.YFl yFl = new com.bytedance.adsdk.YFl.Sg.tN.YFl() { // from class: com.bytedance.adsdk.YFl.Sg.YFl.1
            @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl
            public int YFl(String str, int i11, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final vc vcVar = vcVarArr[i10];
            i10--;
            yFl = new com.bytedance.adsdk.YFl.Sg.tN.YFl() { // from class: com.bytedance.adsdk.YFl.Sg.YFl.2
                @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl
                public int YFl(String str, int i11, Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> deque) {
                    return vc.this.YFl(str, i11, deque, yFl);
                }
            };
        }
        YFl = yFl;
    }

    private YFl(String str, com.bytedance.adsdk.YFl.Sg.tN.YFl yFl) {
        this.Sg = yFl;
        this.wN = str;
        try {
            YFl();
        } catch (Exception e2) {
            throw new com.bytedance.adsdk.YFl.YFl.Sg(str, e2);
        }
    }

    public static YFl YFl(String str) {
        return new YFl(str, YFl);
    }

    private void YFl() {
        int length = this.wN.length();
        int i10 = 0;
        while (i10 < length) {
            int YFl2 = this.Sg.YFl(this.wN, i10, this.AlY);
            if (YFl2 == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.wN.substring(0, i10));
            }
            i10 = YFl2;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.YFl.Sg.Sg.YFl pollFirst = this.AlY.pollFirst();
            if (pollFirst != null) {
                arrayList.add(0, pollFirst);
            } else {
                this.tN = com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(arrayList, this.wN, i10);
                this.AlY = null;
                return;
            }
        }
    }

    public <T> T YFl(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("default_key", jSONObject);
        return (T) YFl(hashMap);
    }

    public <T> T YFl(Map<String, JSONObject> map) {
        return (T) this.tN.YFl(map);
    }
}
