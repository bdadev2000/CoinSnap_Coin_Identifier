package com.bytedance.sdk.openadsdk.core.YFl;

import com.bytedance.sdk.openadsdk.core.model.Sg;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl implements qO.YFl {
    private final qO.YFl YFl;

    public YFl(qO.YFl yFl) {
        this.YFl = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
    public void YFl(final int i10, final String str) {
        if (this.YFl != null) {
            if (mn.wN()) {
                this.YFl.YFl(i10, str);
            } else {
                mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YFl.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.YFl.YFl(i10, str);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO.YFl
    public void YFl(final com.bytedance.sdk.openadsdk.core.model.YFl yFl, final Sg sg2) {
        if (this.YFl != null) {
            if (mn.wN()) {
                this.YFl.YFl(yFl, sg2);
            } else {
                mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.YFl.YFl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.YFl.YFl(yFl, sg2);
                    }
                });
            }
        }
    }
}
