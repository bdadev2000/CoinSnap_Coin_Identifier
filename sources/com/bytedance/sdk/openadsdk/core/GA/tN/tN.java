package com.bytedance.sdk.openadsdk.core.GA.tN;

import com.bytedance.sdk.component.utils.vc;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.openadsdk.Sg.Sg {
    public tN(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.Sg.Sg, com.bytedance.sdk.openadsdk.Sg.YFl
    public void YFl(List<File> list) {
        int size = list.size();
        if (!YFl(0L, size)) {
            for (File file : list) {
                vc.tN(file);
                size--;
                if (YFl(file, 0L, size)) {
                    return;
                }
            }
        }
    }

    public tN(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.YFl = z10;
    }
}
