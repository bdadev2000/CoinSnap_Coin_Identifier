package com.bytedance.sdk.component.qsH;

/* loaded from: classes.dex */
public class wN {
    private static nc YFl = new nc() { // from class: com.bytedance.sdk.component.qsH.wN.1
        @Override // com.bytedance.sdk.component.qsH.nc
        public NjR createThreadFactory(int i10, String str) {
            return new NjR(i10, str);
        }
    };

    public static void YFl(nc ncVar) {
        YFl = ncVar;
    }

    public static nc YFl() {
        return YFl;
    }
}
