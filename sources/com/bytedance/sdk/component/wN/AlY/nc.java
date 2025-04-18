package com.bytedance.sdk.component.wN.AlY;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.wN.Wwa;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class nc extends YFl {
    private Bitmap Sg(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        Collection<Wwa> YFl = tNVar.qO().YFl();
        Bitmap bitmap = null;
        if (YFl == null) {
            return null;
        }
        Iterator<Wwa> it = YFl.iterator();
        while (it.hasNext() && (bitmap = it.next().YFl(tNVar.wN())) == null) {
        }
        return bitmap;
    }

    private Bitmap tN(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        return tNVar.qO().YFl(tNVar.aIu()).YFl(tNVar.wN());
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public String YFl() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.wN.AlY.NjR
    public void YFl(com.bytedance.sdk.component.wN.tN.tN tNVar) {
        Bitmap Sg;
        int YoT = tNVar.YoT();
        if (YoT != 2 && YoT != 1) {
            Sg = null;
        } else if (!tNVar.wXo() && !tNVar.aIu().vc()) {
            Sg = tN(tNVar);
        } else {
            Sg = Sg(tNVar);
        }
        if (Sg == null) {
            tNVar.YFl(new YoT());
        } else {
            tNVar.YFl(new GA(Sg, null, false));
        }
    }
}
