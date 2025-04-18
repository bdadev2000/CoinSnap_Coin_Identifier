package com.bytedance.sdk.component.wN.YFl;

import com.bytedance.sdk.component.wN.NjR;
import com.bytedance.sdk.component.wN.YoT;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Sg {
    public static YoT YFl() {
        return new YoT() { // from class: com.bytedance.sdk.component.wN.YFl.Sg.1
            private WeakHashMap<String, String> YFl = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.wN.YoT
            public String Sg(NjR njR) {
                return YFl(njR.YFl());
            }

            @Override // com.bytedance.sdk.component.wN.YoT
            public String YFl(NjR njR) {
                return YFl(njR.YFl() + "#width=" + njR.Sg() + "#height=" + njR.tN() + "#scaletype=" + njR.AlY() + "#bitmapConfig=" + njR.vc());
            }

            private String YFl(String str) {
                String str2 = this.YFl.get(str);
                if (str2 != null) {
                    return str2;
                }
                String YFl = com.bytedance.sdk.component.wN.tN.tN.tN.YFl(str);
                this.YFl.put(str, YFl);
                return YFl;
            }
        };
    }
}
