package com.bytedance.sdk.component.lMd.zp;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class COT extends rV {
    List<String> lMd;
    List<String> zp;

    public COT(List<String> list, List<String> list2) {
        this.zp = list;
        this.lMd = list2;
    }

    /* loaded from: classes.dex */
    public static final class zp {
        private final List<String> zp = new ArrayList();
        private final List<String> lMd = new ArrayList();

        public zp zp(String str, String str2) {
            this.zp.add(str);
            this.lMd.add(str2);
            return this;
        }

        public COT zp() {
            return new COT(this.zp, this.lMd);
        }
    }
}
