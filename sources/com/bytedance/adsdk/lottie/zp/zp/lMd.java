package com.bytedance.adsdk.lottie.zp.zp;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lMd {
    private final List<FP> zp = new ArrayList();

    public void zp(FP fp) {
        this.zp.add(fp);
    }

    public void zp(Path path) {
        for (int size = this.zp.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.lottie.HWF.HWF.zp(path, this.zp.get(size));
        }
    }
}
