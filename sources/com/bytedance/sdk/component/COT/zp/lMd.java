package com.bytedance.sdk.component.COT.zp;

import com.bytedance.sdk.component.COT.YW;
import com.bytedance.sdk.component.COT.vDp;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class lMd {
    public static vDp zp() {
        return new vDp() { // from class: com.bytedance.sdk.component.COT.zp.lMd.1
            private WeakHashMap<String, String> zp = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.COT.vDp
            public String lMd(YW yw) {
                return zp(yw.zp());
            }

            @Override // com.bytedance.sdk.component.COT.vDp
            public String zp(YW yw) {
                return zp(yw.zp() + "#width=" + yw.lMd() + "#height=" + yw.KS() + "#scaletype=" + yw.jU() + "#bitmapConfig=" + yw.HWF());
            }

            private String zp(String str) {
                String str2 = this.zp.get(str);
                if (str2 != null) {
                    return str2;
                }
                String zp = com.bytedance.sdk.component.COT.KS.KS.KS.zp(str);
                this.zp.put(str, zp);
                return zp;
            }
        };
    }
}
