package com.bytedance.sdk.openadsdk.core.video.jU;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.COT.zp;
import com.bykv.vk.openvk.component.video.api.KS.KS;
import com.bytedance.sdk.component.lMd.zp.QR;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.Bj;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.YW;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dT;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.vDp;
import com.bytedance.sdk.openadsdk.utils.YhE;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    public static final com.bykv.vk.openvk.component.video.api.COT.zp zp = new com.bykv.vk.openvk.component.video.zp.zp.lMd.zp();

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS(KS ks, woN won, AdSlot adSlot) {
        if (!zp(ks)) {
            return;
        }
        com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.lMd((com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp<YW>) new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(won, YhE.KS(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(won, (String) null, -1, ks), new YW(ks.tG(), ks.KS())));
    }

    private static void lMd(KS ks, woN won, AdSlot adSlot) {
        if (zp(ks)) {
            com.bytedance.sdk.openadsdk.dT.KS.zp("load_video_start", new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(won, YhE.KS(adSlot.getDurationSlotType()), com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(won, (String) null, -1, ks), new Bj(ks.tG(), ks.dT() ? ks.YW() : ks.KS())));
        }
    }

    private static boolean zp(KS ks) {
        return true;
    }

    public static void zp(final KS ks, final zp.InterfaceC0049zp interfaceC0049zp) {
        woN won;
        AdSlot adSlot;
        if ((ks.KS() > 0 || ks.dT()) && ks.dQp() != -2) {
            if (ks.dQp() != 1) {
                ks.jU(6000);
                ks.COT(6000);
                ks.HWF(6000);
                boolean z8 = ks.COT("material_meta") != null && (ks.COT("material_meta") instanceof woN);
                boolean z9 = ks.COT("ad_slot") != null && (ks.COT("ad_slot") instanceof AdSlot);
                if (z8 && z9) {
                    won = (woN) ks.COT("material_meta");
                    AdSlot adSlot2 = (AdSlot) ks.COT("ad_slot");
                    lMd(ks, won, adSlot2);
                    adSlot = adSlot2;
                } else {
                    won = null;
                    adSlot = null;
                }
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final woN won2 = won;
                final AdSlot adSlot3 = adSlot;
                zp.InterfaceC0049zp interfaceC0049zp2 = new zp.InterfaceC0049zp() { // from class: com.bytedance.sdk.openadsdk.core.video.jU.zp.1
                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void lMd(KS ks2, int i9) {
                        AdSlot adSlot4;
                        zp.InterfaceC0049zp interfaceC0049zp3 = zp.InterfaceC0049zp.this;
                        if (interfaceC0049zp3 != null) {
                            interfaceC0049zp3.zp(ks2, i9);
                        }
                        woN won3 = won2;
                        if (won3 != null && (adSlot4 = adSlot3) != null) {
                            zp.KS(ks, won3, adSlot4);
                        }
                        ks.rV();
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(KS ks2, int i9) {
                        zp.InterfaceC0049zp interfaceC0049zp3 = zp.InterfaceC0049zp.this;
                        if (interfaceC0049zp3 != null) {
                            interfaceC0049zp3.zp(ks2, i9);
                        }
                        if (won2 == null || adSlot3 == null) {
                            return;
                        }
                        zp.lMd(ks, won2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime);
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.COT.zp.InterfaceC0049zp
                    public void zp(KS ks2, int i9, String str) {
                        zp.InterfaceC0049zp interfaceC0049zp3 = zp.InterfaceC0049zp.this;
                        if (interfaceC0049zp3 != null) {
                            interfaceC0049zp3.zp(ks2, i9, str);
                        }
                        if (won2 == null || adSlot3 == null) {
                            return;
                        }
                        zp.lMd(ks, won2, adSlot3, SystemClock.elapsedRealtime() - elapsedRealtime, i9, str);
                    }
                };
                if (!zp(ks.tG())) {
                    if (interfaceC0049zp != null) {
                        interfaceC0049zp.zp(ks, 404, "unexpected url: " + ks.tG());
                    }
                    lMd(ks, won, adSlot, SystemClock.elapsedRealtime() - elapsedRealtime, -1, "video url is invalid");
                    return;
                }
                try {
                    zp.zp(KVG.zp(), ks, interfaceC0049zp2);
                    return;
                } catch (Exception e4) {
                    e4.getMessage();
                    return;
                }
            }
        }
        if (interfaceC0049zp != null) {
            interfaceC0049zp.zp(ks, 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(KS ks, woN won, AdSlot adSlot, long j7, int i9, String str) {
        if (zp(ks)) {
            String KS = YhE.KS(adSlot.getDurationSlotType());
            JSONObject zp2 = com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(won, (String) null, -1, ks);
            dT dTVar = new dT();
            dTVar.zp(ks.tG());
            dTVar.zp(ks.KS());
            dTVar.lMd(j7);
            dTVar.zp(i9);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            dTVar.lMd(str);
            dTVar.KS("");
            com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp((com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp<dT>) new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(won, KS, zp2, dTVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(KS ks, woN won, AdSlot adSlot, long j7) {
        if (zp(ks)) {
            String KS = YhE.KS(adSlot.getDurationSlotType());
            JSONObject zp2 = com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.zp(won, (String) null, -1, ks);
            vDp vdp = new vDp();
            vdp.zp(ks.tG());
            vdp.zp(ks.KS());
            vdp.lMd(j7);
            if (ks.pvr() == 1) {
                vdp.KS(1L);
            } else {
                vdp.KS(0L);
            }
            com.bytedance.sdk.openadsdk.dT.KS.zp("load_video_success", new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(won, KS, zp2, vdp));
        }
    }

    public static boolean zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        return QR.KS(str) != null;
    }
}
