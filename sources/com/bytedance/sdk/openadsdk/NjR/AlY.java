package com.bytedance.sdk.openadsdk.NjR;

import android.content.Context;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.bytedance.sdk.component.Sg.YFl.eT;
import com.bytedance.sdk.component.Sg.YFl.vc;
import com.bytedance.sdk.component.wN.EH;
import com.bytedance.sdk.component.wN.nc;
import com.bytedance.sdk.component.wN.tN.wN;
import com.bytedance.sdk.component.wN.wXo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.bytedance.sdk.openadsdk.utils.pq;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AlY {

    /* loaded from: classes.dex */
    public static final class YFl {
        private static final EH YFl = YFl(lG.YFl());

        /* JADX INFO: Access modifiers changed from: private */
        public static nc Sg(String str) {
            return YFl(YFl.YFl(str).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static nc Sg(com.bytedance.sdk.openadsdk.core.model.EH eh2) {
            return YFl(YFl.YFl(eh2.YFl()).YFl(eh2.Sg()).Sg(eh2.tN()).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).YFl(eh2.DSW()));
        }

        private static EH YFl(Context context) {
            return com.bytedance.sdk.component.wN.tN.Sg.YFl(context, new wN.YFl().YFl(new com.bytedance.sdk.component.wN.tN.YFl.YFl(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).YFl(new wXo() { // from class: com.bytedance.sdk.openadsdk.NjR.AlY.YFl.2
                @Override // com.bytedance.sdk.component.wN.wXo
                public ExecutorService YFl() {
                    return mn.Sg();
                }
            }).YFl(new com.bytedance.sdk.component.wN.AlY() { // from class: com.bytedance.sdk.openadsdk.NjR.AlY.YFl.1
                @Override // com.bytedance.sdk.component.wN.AlY
                /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.wN.Sg.AlY YFl(com.bytedance.sdk.component.wN.wN wNVar) {
                    com.bytedance.sdk.component.wN.Sg.wN wNVar2;
                    eT wN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().wN();
                    GA Sg = new GA.YFl().Sg(wNVar.YFl()).YFl().Sg();
                    com.bytedance.sdk.component.Sg.YFl.EH eh2 = null;
                    if (wNVar.tN()) {
                        wNVar2 = new com.bytedance.sdk.component.wN.Sg.wN();
                    } else {
                        wNVar2 = null;
                    }
                    if (wNVar2 != null) {
                        wNVar2.YFl(System.currentTimeMillis());
                    }
                    try {
                        eh2 = wN.YFl(Sg).Sg();
                        if (wNVar2 != null) {
                            wNVar2.Sg(System.currentTimeMillis());
                        }
                        Map<String, String> YFl2 = YFl(wNVar, eh2);
                        byte[] AlY = eh2.vc().AlY();
                        if (wNVar2 != null) {
                            wNVar2.tN(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.wN.Sg.AlY alY = new com.bytedance.sdk.component.wN.Sg.AlY(eh2.tN(), AlY, "", YFl2);
                        alY.YFl(wNVar2);
                        return alY;
                    } catch (Throwable th2) {
                        try {
                            return YFl(wNVar2, th2);
                        } finally {
                            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(eh2);
                        }
                    }
                }

                private Map<String, String> YFl(com.bytedance.sdk.component.wN.wN wNVar, com.bytedance.sdk.component.Sg.YFl.EH eh2) {
                    if (!wNVar.Sg()) {
                        return null;
                    }
                    vc DSW = eh2.DSW();
                    HashMap hashMap = new HashMap();
                    int YFl2 = DSW.YFl();
                    for (int i10 = 0; i10 < YFl2; i10++) {
                        String YFl3 = DSW.YFl(i10);
                        String Sg = DSW.Sg(i10);
                        if (YFl3 != null) {
                            hashMap.put(YFl3, Sg);
                        }
                    }
                    return hashMap;
                }

                private com.bytedance.sdk.component.wN.Sg.AlY YFl(com.bytedance.sdk.component.wN.Sg.wN wNVar, Throwable th2) {
                    th2.getMessage();
                    if (wNVar != null) {
                        wNVar.tN(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.wN.Sg.AlY alY = new com.bytedance.sdk.component.wN.Sg.AlY(98765, th2, "net failed");
                    alY.YFl(wNVar);
                    return alY;
                }
            }).YFl());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream Sg(String str, String str2) {
            return YFl.YFl(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean Sg(String str, String str2, String str3) {
            return YFl.YFl(str, str2, str3);
        }

        private static nc YFl(nc ncVar) {
            return pq.YFl() ? ncVar.YFl(new wN()) : ncVar;
        }
    }

    public static nc YFl(String str) {
        return YFl.Sg(str);
    }

    public static nc YFl(com.bytedance.sdk.openadsdk.core.model.EH eh2) {
        return YFl.Sg(eh2);
    }

    public static InputStream YFl(String str, String str2) {
        return YFl.Sg(str, str2);
    }

    public static boolean YFl(String str, String str2, String str3) {
        return YFl.Sg(str, str2, str3);
    }

    public static EH YFl() {
        return YFl.YFl;
    }
}
