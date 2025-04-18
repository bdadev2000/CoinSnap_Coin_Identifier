package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class YFl {
    public static void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl, int i10, boolean z10) {
        if (yFl == null || yFl.tN() == null || yFl.tN().size() <= 0) {
            return;
        }
        if (i10 >= yFl.tN().size()) {
            i10 = 0;
        }
        Wwa wwa = yFl.tN().get(i10);
        Context YFl = lG.YFl();
        YFl(wwa, !TextUtils.isEmpty(z10 ? eT.YFl(YFl).YFl(wwa) : AlY.YFl(YFl).YFl(wwa)), z10);
    }

    public static void YFl(final Wwa wwa, final boolean z10, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                if (Wwa.this == null) {
                    return;
                }
                try {
                    Context YFl = lG.YFl();
                    AdSlot pq = Wwa.this.pq();
                    if (pq != null) {
                        int Sg = wN.Sg();
                        if (Sg == 0 || Sg == 2) {
                            if (z11) {
                                YoT.YFl(YFl).YFl(pq.getCodeId(), Wwa.this);
                            } else {
                                wN.YFl(YFl).YFl(pq.getCodeId(), Wwa.this);
                            }
                        }
                        if (z10) {
                            if (z11) {
                                YoT.YFl(YFl).YFl(pq);
                            } else {
                                wN.YFl(YFl).YFl(pq);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
