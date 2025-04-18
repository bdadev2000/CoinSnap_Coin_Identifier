package com.bytedance.sdk.openadsdk.core.GA.wN;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sg.YFl.DSW;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.NjR;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.YoT;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.eT;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.nc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.pDU.tN;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.facebook.b;
import org.json.JSONObject;
import r5.c;

/* loaded from: classes.dex */
public class YFl {
    public static final c YFl = new b(29);

    private static void Sg(p5.c cVar, Wwa wwa, AdSlot adSlot) {
        if (YFl(cVar)) {
            tN.YFl("load_video_start", new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wwa, Sco.tN(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(wwa, (String) null, -1, cVar), new eT(cVar.GA(), cVar.nc() ? cVar.NjR() : cVar.tN())));
        }
    }

    private static boolean YFl(p5.c cVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN(p5.c cVar, Wwa wwa, AdSlot adSlot) {
        if (!YFl(cVar)) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.Sg((com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl<NjR>) new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wwa, Sco.tN(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(wwa, (String) null, -1, cVar), new NjR(cVar.GA(), cVar.tN())));
    }

    public static void YFl(final p5.c cVar, final r5.b bVar) {
        Wwa wwa;
        AdSlot adSlot;
        if ((cVar.tN() > 0 || cVar.nc()) && cVar.EH() != -2) {
            if (cVar.EH() != 1) {
                cVar.AlY(6000);
                cVar.wN(6000);
                cVar.vc(6000);
                boolean z10 = cVar.wN("material_meta") != null && (cVar.wN("material_meta") instanceof Wwa);
                boolean z11 = cVar.wN("ad_slot") != null && (cVar.wN("ad_slot") instanceof AdSlot);
                if (z10 && z11) {
                    wwa = (Wwa) cVar.wN("material_meta");
                    AdSlot adSlot2 = (AdSlot) cVar.wN("ad_slot");
                    Sg(cVar, wwa, adSlot2);
                    adSlot = adSlot2;
                } else {
                    wwa = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final Wwa wwa2 = wwa;
                final AdSlot adSlot3 = adSlot;
                final r5.b bVar2 = new r5.b() { // from class: com.bytedance.sdk.openadsdk.core.GA.wN.YFl.1
                    @Override // r5.b
                    public void Sg(p5.c cVar2, int i10) {
                        AdSlot adSlot4;
                        r5.b bVar3 = r5.b.this;
                        if (bVar3 != null) {
                            bVar3.YFl(cVar2, i10);
                        }
                        Wwa wwa3 = wwa2;
                        if (wwa3 != null && (adSlot4 = adSlot3) != null) {
                            YFl.tN(cVar, wwa3, adSlot4);
                        }
                        cVar.pDU();
                    }

                    @Override // r5.b
                    public void YFl(p5.c cVar2, int i10) {
                        r5.b bVar3 = r5.b.this;
                        if (bVar3 != null) {
                            bVar3.YFl(cVar2, i10);
                        }
                        if (wwa2 == null || adSlot3 == null) {
                            return;
                        }
                        YFl.Sg(cVar, wwa2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // r5.b
                    public void YFl(p5.c cVar2, int i10, String str) {
                        r5.b bVar3 = r5.b.this;
                        if (bVar3 != null) {
                            bVar3.YFl(cVar2, i10, str);
                        }
                        if (wwa2 == null || adSlot3 == null) {
                            return;
                        }
                        YFl.Sg(cVar, wwa2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i10, str);
                    }
                };
                if (!YFl(cVar.GA())) {
                    if (bVar != null) {
                        bVar.YFl(cVar, 404, "unexpected url: " + cVar.GA());
                    }
                    Sg(cVar, wwa, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                }
                qsH qsh = new qsH("VideoPreload") { // from class: com.bytedance.sdk.openadsdk.core.GA.wN.YFl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ((b) YFl.YFl).r(lG.YFl(), cVar, bVar2);
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                    }
                };
                if (mn.wN()) {
                    mn.Sg(qsh);
                    return;
                } else {
                    qsh.run();
                    return;
                }
            }
        }
        if (bVar != null) {
            bVar.YFl(cVar, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(p5.c cVar, Wwa wwa, AdSlot adSlot, long j3, int i10, String str) {
        if (YFl(cVar)) {
            String tN = Sco.tN(adSlot.getDurationSlotType());
            JSONObject YFl2 = com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(wwa, (String) null, -1, cVar);
            nc ncVar = new nc();
            ncVar.YFl(cVar.GA());
            ncVar.YFl(cVar.tN());
            ncVar.Sg(j3);
            ncVar.YFl(i10);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            ncVar.Sg(str);
            ncVar.tN("");
            com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl((com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl<nc>) new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wwa, tN, YFl2, ncVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(p5.c cVar, Wwa wwa, AdSlot adSlot, long j3) {
        if (YFl(cVar)) {
            String tN = Sco.tN(adSlot.getDurationSlotType());
            JSONObject YFl2 = com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(wwa, (String) null, -1, cVar);
            YoT yoT = new YoT();
            yoT.YFl(cVar.GA());
            yoT.YFl(cVar.tN());
            yoT.Sg(j3);
            if (cVar.qO() == 1) {
                yoT.tN(1L);
            } else {
                yoT.tN(0L);
            }
            tN.YFl("load_video_success", new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wwa, tN, YFl2, yoT));
        }
    }

    public static boolean YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return DSW.tN(str) != null;
    }
}
