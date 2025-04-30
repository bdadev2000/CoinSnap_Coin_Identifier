package com.bytedance.sdk.component.COT.jU;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.COT.vwr;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class dT extends zp {
    private Bitmap KS(com.bytedance.sdk.component.COT.KS.KS ks) {
        return ks.pvr().zp(ks.cz()).zp(ks.COT());
    }

    private Bitmap lMd(com.bytedance.sdk.component.COT.KS.KS ks) {
        Collection<vwr> zp = ks.pvr().zp();
        Bitmap bitmap = null;
        if (zp == null) {
            return null;
        }
        Iterator<vwr> it = zp.iterator();
        while (it.hasNext() && (bitmap = it.next().zp(ks.COT())) == null) {
        }
        return bitmap;
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public void zp(com.bytedance.sdk.component.COT.KS.KS ks) {
        Bitmap lMd;
        int vDp = ks.vDp();
        if (vDp != 2 && vDp != 1) {
            lMd = null;
        } else if (!ks.FP() && !ks.cz().HWF()) {
            lMd = KS(ks);
        } else {
            lMd = lMd(ks);
        }
        if (lMd == null) {
            ks.zp(new vDp());
        } else {
            ks.zp(new tG(lMd, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.COT.jU.YW
    public String zp() {
        return "memory_cache";
    }
}
