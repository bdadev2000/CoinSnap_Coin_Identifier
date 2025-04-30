package com.bytedance.sdk.openadsdk.core.video.lMd;

import com.bytedance.sdk.component.utils.HWF;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class KS extends com.bytedance.sdk.openadsdk.zp.lMd {
    public KS(int i9, int i10) {
        super(i9, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.zp.lMd, com.bytedance.sdk.openadsdk.zp.zp
    public void zp(List<File> list) {
        int size = list.size();
        if (!zp(0L, size)) {
            for (File file : list) {
                HWF.KS(file);
                size--;
                if (zp(file, 0L, size)) {
                    return;
                }
            }
        }
    }
}
