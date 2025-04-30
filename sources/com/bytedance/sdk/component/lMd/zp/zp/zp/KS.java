package com.bytedance.sdk.component.lMd.zp.zp.zp;

import com.bytedance.sdk.component.lMd.zp.dQp;
import com.bytedance.sdk.component.lMd.zp.ku;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class KS implements ku.zp {
    int KS = 0;
    tG lMd;
    List<com.bytedance.sdk.component.lMd.zp.ku> zp;

    public KS(List<com.bytedance.sdk.component.lMd.zp.ku> list, tG tGVar) {
        this.zp = list;
        this.lMd = tGVar;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.ku.zp
    public tG zp() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.ku.zp
    public dQp zp(tG tGVar) throws IOException {
        this.lMd = tGVar;
        int i9 = this.KS + 1;
        this.KS = i9;
        if (i9 >= this.zp.size()) {
            return null;
        }
        return this.zp.get(this.KS).zp(this);
    }
}
