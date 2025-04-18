package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.content.Context;
import com.bytedance.sdk.component.vc.YFl.YFl;
import com.bytedance.sdk.openadsdk.core.lG;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AlY {
    public static AtomicInteger YFl = new AtomicInteger(0);
    public static final AtomicBoolean Sg = new AtomicBoolean(false);

    public static void Sg() {
        com.bytedance.sdk.component.vc.YFl.Sg.tN();
    }

    public static void YFl(Context context, boolean z10) {
        if (Sg.compareAndSet(false, true)) {
            com.bytedance.sdk.component.vc.YFl.Sg.YFl(new YFl.C0093YFl().YFl(new nc()).Sg(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl.tN()).tN(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl.wN()).YFl(com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl.AlY()).YFl(z10).YFl(new eT()).YFl(qsH.YFl).Sg(lG.AlY().pDU()).YFl(lG.AlY().EH()).YFl(lG.AlY().ZLB()).YFl(), context);
            Sg();
        }
    }

    public static void tN() {
        try {
            com.bytedance.sdk.component.vc.YFl.Sg.AlY();
            com.bytedance.sdk.component.vc.YFl.Sg.wN();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.AlY.YFl yFl) {
        com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl yFl2 = new com.bytedance.sdk.component.vc.YFl.AlY.YFl.YFl(yFl.AlY(), yFl);
        yFl2.Sg(yFl.wN() ? (byte) 1 : (byte) 2);
        yFl2.YFl((byte) 0);
        if (com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
            YFl(lG.YFl(), com.bytedance.sdk.openadsdk.multipro.Sg.tN());
        }
        com.bytedance.sdk.component.vc.YFl.Sg.YFl(yFl2);
    }

    public static com.bytedance.sdk.openadsdk.pDU.tN.Sg YFl() {
        return YoT.YFl;
    }

    public static void YFl(final List<String> list, final int i10, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("track") { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
                    AlY.YFl(lG.YFl(), com.bytedance.sdk.openadsdk.multipro.Sg.tN());
                }
                com.bytedance.sdk.component.vc.YFl.Sg.YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl()), list, true, i10, str);
            }
        });
    }

    public static void YFl(String str) {
        YFl(str, false);
    }

    public static void YFl(String str, boolean z10) {
        if (com.bytedance.sdk.component.vc.YFl.Sg.Sg()) {
            YFl(lG.YFl(), com.bytedance.sdk.openadsdk.multipro.Sg.tN());
        }
        com.bytedance.sdk.component.vc.YFl.Sg.YFl(str, z10);
    }
}
