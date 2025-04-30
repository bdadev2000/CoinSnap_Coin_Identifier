package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.L;
import com.bytedance.sdk.component.embedapplog.PangleEncryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.woN;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.cW;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class vwr implements woN<com.bytedance.sdk.openadsdk.lMd.zp> {
    private final Context zp;

    /* loaded from: classes.dex */
    public static class lMd {
        public final com.bytedance.sdk.openadsdk.core.model.yRU KS;
        public final boolean lMd;
        public final int zp;

        private lMd(int i9, boolean z8, com.bytedance.sdk.openadsdk.core.model.yRU yru) {
            this.zp = i9;
            this.lMd = z8;
            this.KS = yru;
        }

        public static lMd zp(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("code");
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.bytedance.sdk.openadsdk.core.model.yRU yru = new com.bytedance.sdk.openadsdk.core.model.yRU();
            if (optJSONObject != null) {
                try {
                    yru.zp(optJSONObject.optInt("reason"));
                    yru.lMd(optJSONObject.optInt("corp_type"));
                    yru.KS(optJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    yru.zp(optJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", th.getMessage());
                }
            }
            return new lMd(optInt, optBoolean, yru);
        }
    }

    public vwr(Context context) {
        this.zp = context;
    }

    private boolean COT(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    @DungeonFlag
    private void HWF(JSONObject jSONObject) {
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, YhE.COT());
            jSONObject.put("version_code", YhE.HWF());
            jSONObject.put("version", YhE.QR());
        } catch (Exception unused) {
        }
    }

    private boolean KS(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    private boolean jU(String str) {
        if (com.bytedance.sdk.openadsdk.core.jU.lMd.zp()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.jU.lMd.zp(str)) {
            return false;
        }
        String lMd2 = com.bytedance.sdk.openadsdk.core.jU.lMd.lMd();
        if (!TextUtils.isEmpty(lMd2)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd2, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, final int i9, final woN.zp zpVar) {
        String str;
        tG.HWF();
        final com.bytedance.sdk.openadsdk.core.model.lMd lmd = new com.bytedance.sdk.openadsdk.core.model.lMd();
        lmd.zp(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
            if (zpVar != null) {
                zpVar.zp(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                lmd.zp(1000);
                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                return;
            }
            return;
        }
        if (!KVG.jU().Rg()) {
            if (zpVar != null) {
                zpVar.zp(-16, QR.zp(-16));
                lmd.zp(1001);
                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                return;
            }
            return;
        }
        if (zpVar == null) {
            return;
        }
        if (jU(adSlot.getCodeId())) {
            zpVar.zp(-8, QR.zp(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !pvrVar.HWF) {
            lmd.lMd(2);
            lmd.zp(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.tG.jU()) {
                com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(adSlot.getBidAdm());
            }
            if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
                YhE.zp("Pangle_Debug_Mode", adSlot.getBidAdm(), this.zp);
            }
            try {
                JSONObject lMd2 = lMd(new JSONObject(adSlot.getBidAdm()));
                if (lMd2 == null) {
                    zp(zpVar, lmd);
                    return;
                }
                zp zp2 = zp.zp(lMd2, adSlot, pvrVar, lmd);
                lmd.zp(zp2.dT);
                Bj.zp(this.zp, zp2.YW);
                int i10 = zp2.jU;
                if (i10 != 20000) {
                    zpVar.zp(i10, zp2.COT);
                    lmd.zp(zp2.jU);
                    com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.zp zpVar2 = zp2.ku;
                if (zpVar2 == null) {
                    zp(zpVar, lmd);
                    return;
                }
                if (zpVar2.KS() != null && zp2.ku.KS().size() > 0) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp(zp2.ku.KS().get(0));
                }
                zp2.ku.KS(lMd2.toString());
                zpVar.zp(zp2.ku, lmd);
                Map<String, com.bytedance.sdk.openadsdk.core.model.woN> zp3 = com.bytedance.sdk.openadsdk.core.model.zp.zp(zp2.ku);
                if (zp3 != null) {
                    com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(zp3);
                }
                zp(zp2.ku);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "get ad error: ", th);
                zp(zpVar, lmd);
                return;
            }
        }
        JSONObject zp4 = zp(adSlot, pvrVar, i9);
        if (zp4 == null) {
            zpVar.zp(-9, QR.zp(-9));
            lmd.zp(-9);
            com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
            return;
        }
        if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
            YhE.zp("Pangle_Debug_Mode", zp4.toString(), this.zp);
        }
        if (adSlot.getBiddingTokens() != null) {
            str = "/api/ad/union/mediation/get_ads/";
        } else {
            str = "/api/ad/union/sdk/get_ads/";
        }
        String zp5 = YhE.zp(str, true);
        com.bytedance.sdk.component.QR.lMd.jU lMd3 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        final com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(2);
        try {
            String zp6 = com.bytedance.sdk.openadsdk.COT.jU.zp(lMd3, zp5);
            lMd3.lMd(zp6);
            jUVar.zp(zp6);
        } catch (Exception unused) {
        }
        lMd3.zp(zp4.toString(), KVG.jU().vwr());
        jUVar.zp(lMd3.KS()).zp();
        Map<String, String> zp7 = com.bytedance.sdk.openadsdk.core.COT.KS.zp(zp5, zp4.toString());
        if (zp7 != null && zp7.size() > 0) {
            for (String str2 : zp7.keySet()) {
                try {
                    lMd3.lMd(str2, zp7.get(str2));
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e4.getMessage());
                }
            }
        }
        try {
            lMd3.lMd(Command.HTTP_HEADER_USER_AGENT, YhE.KS());
        } catch (Exception unused2) {
        }
        final cW zp8 = cW.zp();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z8 = ku.lMd().woN() && requestExtraMap != null;
        if (z8) {
            requestExtraMap.put("pgad_start", zp8);
        }
        if (adSlot.getBiddingTokens() != null) {
            zp(adSlot, pvrVar, lMd3, requestExtraMap, z8, zp8, zpVar);
            return;
        }
        lMd3.zp(10);
        lMd3.zp("get_ad");
        final boolean z9 = z8;
        lMd3.zp(new com.bytedance.sdk.component.QR.zp.lMd() { // from class: com.bytedance.sdk.openadsdk.core.vwr.2
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd2) {
                com.bytedance.sdk.openadsdk.core.model.ot otVar;
                System.currentTimeMillis();
                jUVar.lMd();
                if (z9) {
                    requestExtraMap.put("pgad_end", zp8);
                }
                if (lmd2 != null) {
                    if (lmd2.HWF()) {
                        com.bytedance.sdk.openadsdk.lMd.zp.HWF.lMd.incrementAndGet();
                        com.bytedance.sdk.openadsdk.lMd.zp.HWF.zp.incrementAndGet();
                        try {
                            cW zp9 = cW.zp();
                            String jU = lmd2.jU();
                            JSONObject jSONObject = new JSONObject(jU);
                            if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
                                YhE.zp("Pangle_Debug_Mode", jSONObject.toString(), vwr.this.zp);
                            }
                            lmd.zp(jU);
                            JSONObject lMd4 = vwr.this.lMd(jSONObject);
                            if (lMd4 == null) {
                                vwr.this.zp(zpVar, lmd);
                                lmd2.QR();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.HWF.incrementAndGet();
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                                jUVar.zp(true).zp(lmd2.zp()).KS(jU).KS();
                                return;
                            }
                            zp zp10 = zp.zp(lMd4, adSlot, pvrVar, lmd);
                            lmd.zp(zp10.dT);
                            Bj.zp(vwr.this.zp, zp10.YW);
                            int i11 = zp10.jU;
                            if (i11 != 20000) {
                                lmd.zp(i11);
                                if (!KVG.jU().WNy() && zp10.jU == 40029) {
                                    zpVar.zp(-100, QR.zp(-100));
                                } else {
                                    zpVar.zp(zp10.jU, zp10.COT);
                                }
                                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                                lmd2.QR();
                                adSlot.getCodeId();
                                String.valueOf(zp10.HWF);
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.HWF.incrementAndGet();
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                                jUVar.zp(true).zp(lmd2.zp()).KS(jU).KS();
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.model.zp zpVar3 = zp10.ku;
                            if (zpVar3 == null) {
                                vwr.this.zp(zpVar, lmd);
                                lmd2.QR();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.COT.incrementAndGet();
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                                jUVar.zp(true).zp(lmd2.zp()).KS(jU).KS();
                                return;
                            }
                            zpVar3.KS(lMd4.toString());
                            cW zp11 = cW.zp();
                            com.bytedance.sdk.openadsdk.core.model.pvr pvrVar2 = pvrVar;
                            if (pvrVar2 != null && (otVar = pvrVar2.dT) != null) {
                                otVar.zp(zp8, zp9, zp10.zp, zp11);
                            }
                            zpVar.zp(zp10.ku, lmd);
                            vwr.this.zp(zp10.ku);
                            Map<String, com.bytedance.sdk.openadsdk.core.model.woN> zp12 = com.bytedance.sdk.openadsdk.core.model.zp.zp(zp10.ku);
                            if (zp12 != null) {
                                com.bytedance.sdk.openadsdk.jU.lMd.zp().zp(zp12);
                            }
                            if (zp10.ku.KS() != null && !zp10.ku.KS().isEmpty()) {
                                vwr.this.zp(lmd2.ku(), pvrVar, zp8, zp9, zp10.zp, zp11, zp10.ku.KS().get(0), YhE.KS(i9), zp10.ku.QR());
                                com.bytedance.sdk.openadsdk.lMd.zp.HWF.jU.incrementAndGet();
                            }
                            com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                            jUVar.zp(true).zp(lmd2.zp()).KS(jU).KS();
                            return;
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "get ad error: ", th2);
                            vwr.this.zp(zpVar, lmd);
                            lmd2.QR();
                            adSlot.getCodeId();
                            com.bytedance.sdk.openadsdk.lMd.zp.HWF.COT.incrementAndGet();
                            com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                            jUVar.zp(lmd2.HWF()).zp(lmd2.zp()).KS(lmd2.jU()).jU(th2.getMessage()).KS();
                            return;
                        }
                    }
                    int zp13 = lmd2.zp();
                    String lMd5 = lmd2.lMd();
                    zpVar.zp(zp13, lMd5);
                    lmd.zp(zp13);
                    com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                    lmd2.QR();
                    adSlot.getCodeId();
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.ku.incrementAndGet();
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS.incrementAndGet();
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.zp.incrementAndGet();
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.COT();
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.zp(zp13, lMd5);
                    com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                    jUVar.zp(false).zp(zp13).jU(lMd5).KS(lmd2.jU()).KS();
                }
            }

            @Override // com.bytedance.sdk.component.QR.zp.lMd
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException, com.bytedance.sdk.component.QR.lMd lmd2) {
                String str3;
                int i11;
                jUVar.lMd();
                if (lmd2 != null) {
                    str3 = lmd2.lMd();
                } else if (iOException != null) {
                    str3 = iOException.getMessage();
                } else {
                    str3 = "";
                }
                cW zp9 = cW.zp();
                if (z9) {
                    requestExtraMap.put("pgad_end", Long.valueOf(zp9.zp));
                }
                if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
                    YhE.zp("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, vwr.this.zp);
                }
                if (lmd2 != null) {
                    i11 = lmd2.zp();
                } else {
                    i11 = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
                }
                woN.zp zpVar3 = zpVar;
                if (zpVar3 != null) {
                    zpVar3.zp(i11, str3);
                }
                lmd.zp(i11);
                com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
                zp9.zp(zp8);
                adSlot.getCodeId();
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS.incrementAndGet();
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.zp.incrementAndGet();
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.QR.incrementAndGet();
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.COT();
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.zp(i11, str3);
                com.bytedance.sdk.openadsdk.lMd.zp.HWF.KS();
                jUVar.jU(str3).zp(false).KS();
            }
        });
    }

    private byte[] COT(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e4) {
                                com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e4.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e9) {
                            e = e9;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e10) {
                                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e10.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e11) {
                                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e11.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e12) {
                                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e12.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (IOException e14) {
                e = e14;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e15) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e15.toString());
        }
        return bArr;
    }

    @DungeonFlag
    private JSONObject KS() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", ku.lMd().jU());
            jSONObject.put("name", ku.lMd().COT());
            HWF(jSONObject);
            Context zp2 = KVG.zp();
            String str = "";
            if (zp2 != null) {
                try {
                    str = zp2.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", str);
            jSONObject.put("is_paid_app", ku.lMd().dT());
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.zp.QR());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - tG.zp()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.YW(this.zp));
            int i9 = 0;
            jSONObject.put("is_init", tG.COT() ? 1 : 0);
            if (zp2 != null) {
                int rotation = ((WindowManager) zp2.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i9 = 1;
                } else if (rotation == 1) {
                    i9 = 3;
                } else if (rotation == 2) {
                    i9 = 2;
                } else if (rotation == 3) {
                    i9 = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i9));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    private Map<String, String> jU(JSONObject jSONObject) {
        HashMap m = L.m("Content-Type", "application/json; charset=utf-8");
        if (KS(jSONObject)) {
            m.put("Content-Encoding", "union_sdk_encode");
        }
        return m;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:2|3|(13:8|9|(1:(1:14))(2:37|(1:(1:42))(2:43|(1:48)))|15|16|(1:19)|(1:24)|25|(1:28)|29|(1:31)|32|33)|49|9|(0)(0)|15|16|(1:19)|(2:22|24)|25|(1:28)|29|(0)|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:3:0x000b, B:5:0x0012, B:8:0x001b, B:12:0x0029, B:14:0x002d, B:22:0x0075, B:24:0x007b, B:25:0x00a7, B:28:0x010a, B:29:0x011a, B:31:0x0129, B:32:0x0136, B:40:0x0037, B:42:0x003b, B:46:0x0044, B:48:0x0048, B:49:0x001e), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0031  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject zp(com.bytedance.sdk.openadsdk.AdSlot r11, com.bytedance.sdk.openadsdk.core.model.pvr r12, int r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.vwr.zp(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.pvr, int):org.json.JSONObject");
    }

    /* loaded from: classes.dex */
    public static class zp {
        final String COT;
        final int HWF;
        final long KS;
        final String QR;
        final String YW;
        final ArrayList<Integer> dT;
        final int jU;

        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.zp ku;
        final long lMd;
        final int zp;

        private zp(String str, int i9, int i10, String str2, int i11, String str3, @Nullable com.bytedance.sdk.openadsdk.core.model.zp zpVar, long j7, long j9, ArrayList<Integer> arrayList) {
            this.zp = i9;
            this.jU = i10;
            this.COT = str2;
            this.QR = str3;
            this.ku = zpVar;
            this.YW = str;
            this.HWF = i11;
            this.lMd = j7;
            this.KS = j9;
            this.dT = arrayList;
        }

        public static zp zp(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
            Object obj;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.zp, ArrayList<Integer>> zp = com.bytedance.sdk.openadsdk.core.lMd.zp(jSONObject, adSlot, pvrVar, lmd);
            if (zp != null && (obj = zp.first) != null) {
                ((com.bytedance.sdk.openadsdk.core.model.zp) obj).zp(jSONObject.optLong("request_after"));
            }
            if (zp == null) {
                return new zp(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new zp(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.zp) zp.first, optLong, optLong2, (ArrayList) zp.second);
        }

        public static zp zp(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar) {
            JSONArray jSONArray;
            int i9;
            String str;
            long j7;
            long j9;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            if (adSlot != null && adSlot.getBiddingTokens() != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("adn_bid_result");
                com.bytedance.sdk.openadsdk.core.model.zp zpVar = new com.bytedance.sdk.openadsdk.core.model.zp();
                if (optJSONArray != null) {
                    int i10 = 0;
                    while (i10 < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                        if (optJSONObject != null) {
                            String optString4 = optJSONObject.optString("name");
                            String optString5 = optJSONObject.optString("render_data");
                            jSONArray = optJSONArray;
                            String optString6 = optJSONObject.optString(BidResponsed.KEY_PRICE);
                            j9 = optLong2;
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("win_notice");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("loss_notice");
                            j7 = optLong;
                            String optString7 = optJSONObject.optString(BidResponsedEx.KEY_CID);
                            String optString8 = optJSONObject.optString("crid");
                            str = optString3;
                            JSONArray optJSONArray4 = optJSONObject.optJSONArray("adomain");
                            i9 = optInt3;
                            String optString9 = optJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.QR qr = new com.bytedance.sdk.openadsdk.core.model.QR();
                            qr.zp(optString4);
                            qr.lMd(optString5);
                            qr.KS(optString6);
                            qr.jU(optString7);
                            qr.COT(optString8);
                            qr.HWF(optString9);
                            if (optJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i11 = 0; i11 < optJSONArray4.length(); i11++) {
                                    arrayList.add(optJSONArray4.optString(i11));
                                }
                                qr.KS(arrayList);
                            }
                            if (optJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                                    arrayList2.add(optJSONArray2.optString(i12));
                                }
                                qr.zp(arrayList2);
                            }
                            if (optJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i13 = 0; i13 < optJSONArray3.length(); i13++) {
                                    arrayList3.add(optJSONArray3.optString(i13));
                                }
                                qr.lMd(arrayList3);
                            }
                            zpVar.zp(qr);
                        } else {
                            jSONArray = optJSONArray;
                            i9 = optInt3;
                            str = optString3;
                            j7 = optLong;
                            j9 = optLong2;
                        }
                        i10++;
                        optJSONArray = jSONArray;
                        optString3 = str;
                        optLong2 = j9;
                        optLong = j7;
                        optInt3 = i9;
                    }
                }
                return new zp(optString, optInt, optInt2, optString2, optInt3, optString3, zpVar, optLong, optLong2, null);
            }
            return new zp(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
        }
    }

    public static JSONArray KS(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.ugen.zp.zp> zp2 = com.bytedance.sdk.openadsdk.core.ugen.zp.lMd.zp().zp(str);
            if (zp2 != null && zp2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.ugen.zp.zp zpVar : zp2) {
                    if (zpVar != null) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = zpVar.zp().split("_");
                        if (split.length == 2) {
                            jSONObject.put("id", split[1]);
                            jSONObject.put("md5", zpVar.lMd());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "getUgenParentTplIds: ", e4);
            return null;
        }
    }

    private void zp(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar) {
        JSONArray jSONArray;
        if (pvrVar != null && (jSONArray = pvrVar.COT) != null) {
            try {
                jSONObject.put("source_temai_product_ids", jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public void zp(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, final int i9, woN.zp zpVar) {
        final com.bytedance.sdk.openadsdk.core.zp.zp zpVar2 = new com.bytedance.sdk.openadsdk.core.zp.zp(zpVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            tG.lMd().post(new com.bytedance.sdk.component.ku.ku("getAd") { // from class: com.bytedance.sdk.openadsdk.core.vwr.1
                @Override // java.lang.Runnable
                public void run() {
                    vwr.this.lMd(adSlot, pvrVar, i9, zpVar2);
                }
            });
        } else {
            lMd(adSlot, pvrVar, i9, zpVar2);
        }
    }

    private void zp(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, com.bytedance.sdk.component.QR.lMd.jU jUVar, final Map<String, Object> map, final boolean z8, final cW cWVar, final woN.zp zpVar) {
        jUVar.zp(new com.bytedance.sdk.component.QR.zp.lMd() { // from class: com.bytedance.sdk.openadsdk.core.vwr.3
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                if (z8) {
                    map.put("pgad_end", cWVar);
                }
                if (lmd == null || !lmd.HWF()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(lmd.jU());
                    if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
                        YhE.zp("Pangle_Debug_Mode", jSONObject.toString(), vwr.this.zp);
                    }
                    JSONObject lMd2 = vwr.this.lMd(jSONObject);
                    if (lMd2 == null) {
                        zpVar.zp(-1, QR.zp(-1));
                        return;
                    }
                    zp zp2 = zp.zp(lMd2, adSlot, pvrVar);
                    if (zp2.jU != 20000) {
                        if (!KVG.jU().WNy() && zp2.jU == 40029) {
                            zpVar.zp(-100, QR.zp(-100));
                            return;
                        } else {
                            zpVar.zp(zp2.jU, zp2.COT);
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.model.zp zpVar2 = zp2.ku;
                    if (zpVar2 == null) {
                        zpVar.zp(-1, QR.zp(-1));
                        return;
                    }
                    zpVar2.KS(lMd2.toString());
                    zpVar.zp(zp2.ku, new com.bytedance.sdk.openadsdk.core.model.lMd());
                    vwr.this.zp(zp2.ku);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "get ad error: ", th);
                    zpVar.zp(-1, QR.zp(-1));
                }
            }

            @Override // com.bytedance.sdk.component.QR.zp.lMd
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException, com.bytedance.sdk.component.QR.lMd lmd) {
                String str;
                cW zp2 = cW.zp();
                if (z8) {
                    map.put("pgad_end", Long.valueOf(zp2.zp));
                }
                if (KVG.jU().rCC() && yRU.zp().QR() == 1) {
                    YhE.zp("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, vwr.this.zp);
                }
                if (lmd != null) {
                    zpVar.zp(lmd.zp(), lmd.lMd());
                    return;
                }
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "";
                }
                zpVar.zp(601, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
        List<com.bytedance.sdk.openadsdk.core.model.woN> KS = zpVar.KS();
        if (KS == null || KS.size() == 0) {
            return;
        }
        for (int i9 = 0; i9 < KS.size(); i9++) {
            com.bytedance.sdk.openadsdk.core.model.woN won = KS.get(i9);
            if (won != null && won.YW() == null) {
                zp("", 0, 0, won.BO(), won);
                zp("", 0, 0, won.Iv(), won);
                List<com.bytedance.sdk.openadsdk.core.model.rV> Rg = won.Rg();
                if (Rg != null && Rg.size() > 0) {
                    for (int i10 = 0; i10 < Rg.size(); i10++) {
                        zp(won, Rg.get(i10));
                    }
                }
                if (won.eWG() != null) {
                    zp(won.eWG().dT(), won.eWG().KS(), won.eWG().lMd(), (com.bytedance.sdk.openadsdk.core.model.rV) null, won);
                }
            }
        }
    }

    private void zp(String str, int i9, int i10, com.bytedance.sdk.openadsdk.core.model.rV rVVar, com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.HWF.jU.zp(str).zp(i9).lMd(i10).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, str, null), 4);
        } else {
            if (rVVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.HWF.jU.zp(rVVar).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, rVVar.zp(), null), 4);
        }
    }

    @DungeonFlag
    private JSONObject lMd(@NonNull String str, List<FilterWord> list, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", "dislike");
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", zp(list));
            if (com.bytedance.sdk.openadsdk.core.settings.dQp.etV().gH() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.zp.zp(new JSONObject(str2)).toString());
                jSONObject2.put("feedback_type", 1);
                jSONObject2.put("user_description", str3);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void zp(com.bytedance.sdk.openadsdk.core.model.woN won, com.bytedance.sdk.openadsdk.core.model.rV rVVar) {
        if (rVVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.HWF.jU.zp(rVVar).KS(2).zp(new com.bytedance.sdk.openadsdk.HWF.lMd(won, rVVar.zp(), new com.bytedance.sdk.component.COT.KVG() { // from class: com.bytedance.sdk.openadsdk.core.vwr.4
            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(int i9, String str, @Nullable Throwable th) {
            }

            @Override // com.bytedance.sdk.component.COT.KVG
            public void zp(com.bytedance.sdk.component.COT.Bj bj) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:23:0x001b, B:25:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:14:0x0068, B:16:0x006e, B:17:0x0096), top: B:22:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:23:0x001b, B:25:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:14:0x0068, B:16:0x006e, B:17:0x0096), top: B:22:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:23:0x001b, B:25:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:14:0x0068, B:16:0x006e, B:17:0x0096), top: B:22:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zp(com.bytedance.sdk.component.lMd.zp.dT r13, com.bytedance.sdk.openadsdk.core.model.pvr r14, com.bytedance.sdk.openadsdk.utils.cW r15, com.bytedance.sdk.openadsdk.utils.cW r16, int r17, com.bytedance.sdk.openadsdk.utils.cW r18, com.bytedance.sdk.openadsdk.core.model.woN r19, java.lang.String r20, boolean r21) {
        /*
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            com.bytedance.sdk.openadsdk.core.settings.COT r5 = com.bytedance.sdk.openadsdk.core.KVG.jU()
            boolean r5 = r5.oB()
            if (r5 != 0) goto L12
            return
        L12:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = 0
            if (r1 == 0) goto L33
            com.bytedance.sdk.openadsdk.utils.cW r8 = r1.YW     // Catch: java.lang.Exception -> La4
            long r9 = r8.zp     // Catch: java.lang.Exception -> La4
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L33
            java.lang.String r9 = "client_start_time"
            long r10 = r15.zp(r8)     // Catch: java.lang.Exception -> La4
            r5.put(r9, r10)     // Catch: java.lang.Exception -> La4
            com.bytedance.sdk.openadsdk.utils.cW r1 = r1.YW     // Catch: java.lang.Exception -> La4
            long r8 = r4.zp(r1)     // Catch: java.lang.Exception -> La4
            goto L34
        L33:
            r8 = r6
        L34:
            java.lang.String r1 = "network_time"
            long r10 = r3.zp(r15)     // Catch: java.lang.Exception -> La4
            r5.put(r1, r10)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "sever_time"
            r2 = r17
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "client_end_time"
            long r2 = r4.zp(r3)     // Catch: java.lang.Exception -> La4
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La4
            r1 = 1
            if (r21 == 0) goto L55
            java.lang.String r2 = "is_choose_ad"
            r5.put(r2, r1)     // Catch: java.lang.Exception -> La4
        L55:
            java.lang.String r1 = "open_ad"
            r2 = r20
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto L68
            java.lang.String r1 = "is_icon_only"
            boolean r3 = r19.hG()     // Catch: java.lang.Exception -> La4
            r5.put(r1, r3)     // Catch: java.lang.Exception -> La4
        L68:
            long r3 = r0.lMd     // Catch: java.lang.Exception -> La4
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 <= 0) goto L96
            java.lang.String r1 = "enqueue_2_run_ts"
            long r6 = r0.KS     // Catch: java.lang.Exception -> La4
            long r6 = r6 - r3
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "run_2_connect_end_ts"
            long r3 = r0.COT     // Catch: java.lang.Exception -> La4
            long r6 = r0.lMd     // Catch: java.lang.Exception -> La4
            long r3 = r3 - r6
            r5.put(r1, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "connect_end_2_response_end_ts"
            long r3 = r0.HWF     // Catch: java.lang.Exception -> La4
            long r6 = r0.COT     // Catch: java.lang.Exception -> La4
            long r3 = r3 - r6
            r5.put(r1, r3)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "response_end_2_callback_end_ts"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> La4
            long r6 = r0.HWF     // Catch: java.lang.Exception -> La4
            long r3 = r3 - r6
            r5.put(r1, r3)     // Catch: java.lang.Exception -> La4
        L96:
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r16 = r8
            r18 = r5
            com.bytedance.sdk.openadsdk.lMd.KS.zp(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> La4
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.vwr.zp(com.bytedance.sdk.component.lMd.zp.dT, com.bytedance.sdk.openadsdk.core.model.pvr, com.bytedance.sdk.openadsdk.utils.cW, com.bytedance.sdk.openadsdk.utils.cW, int, com.bytedance.sdk.openadsdk.utils.cW, com.bytedance.sdk.openadsdk.core.model.woN, java.lang.String, boolean):void");
    }

    @NonNull
    private Map<String, String> lMd() {
        return L.m("Content-Type", "application/octet-stream;tt-data=a");
    }

    private static String lMd(AdSlot adSlot) {
        String vDp = ku.lMd().vDp();
        if (adSlot == null) {
            return TextUtils.isEmpty(vDp) ? "" : vDp;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(vDp)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return vDp;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(vDp);
                int length2 = jSONArray2.length();
                for (int i10 = 0; i10 < length2; i10++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i10);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return vDp;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.lMd.COT zp(JSONObject jSONObject, String str, boolean z8) {
        boolean z9;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = null;
            if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
                return null;
            }
            com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
            lMd2.lMd(str);
            if (com.bytedance.sdk.openadsdk.core.settings.dQp.etV().bQm()) {
                lMd2.lMd("_disable_retry", "1");
            }
            if (z8) {
                byte[] COT = COT(jSONObject.toString());
                byte[] encrypt = PangleEncryptUtils.encrypt(COT, COT.length);
                if (encrypt == null) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "V3 encrypt failed");
                    JSONObject zp2 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
                    if (!KS(zp2)) {
                        zp2 = jSONObject;
                    }
                    zp(jU(zp2), lMd2);
                    lMd2.zp(zp2.toString(), KVG.jU().vwr());
                } else {
                    zp(lMd(), lMd2);
                    lMd2.zp("application/octet-stream;tt-data=a", encrypt);
                }
            } else {
                JSONObject zp3 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
                if (!KS(zp3)) {
                    zp3 = jSONObject;
                }
                zp(jU(zp3), lMd2);
                lMd2.zp(zp3.toString(), KVG.jU().vwr());
            }
            com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(3);
            jUVar.zp(str).zp(lMd2.KS()).zp();
            com.bytedance.sdk.component.QR.lMd zp4 = lMd2.zp();
            boolean COT2 = (zp4 == null || !zp4.HWF() || TextUtils.isEmpty(zp4.jU())) ? false : COT(new JSONObject(zp4.jU()));
            String str3 = "error unknown";
            int zp5 = zp4 != null ? zp4.zp() : 0;
            boolean z10 = true;
            if (!COT2 && zp5 == 200) {
                str3 = "server say not success";
                z9 = true;
            } else {
                if (zp4 != null && zp4.lMd() != null) {
                    str3 = zp4.lMd();
                }
                z9 = false;
            }
            boolean z11 = zp4 == null;
            if (z11 || !zp4.HWF()) {
                z10 = false;
            }
            com.bytedance.sdk.openadsdk.dT.zp.jU zp6 = jUVar.zp(z10).KS(z11 ? null : zp4.jU()).zp(z11 ? com.bytedance.sdk.openadsdk.dT.zp.jU.zp : zp5);
            if (!z11) {
                str2 = zp4.lMd();
            }
            zp6.jU(str2).KS();
            zp(jSONObject, z8);
            com.bytedance.sdk.openadsdk.lMd.zp.zp.zp(com.bytedance.sdk.openadsdk.lMd.zp.zp.zp, COT2, zp5, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.lMd.COT(COT2, zp5, str3, z9);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.lMd.COT(false, 509, "service_busy", false);
        }
    }

    public JSONObject lMd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("auction_price", "");
            if (optInt == 3) {
                optString = com.bytedance.sdk.component.utils.zp.KS(optString);
            }
            if (TextUtils.isEmpty(optString)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(optString);
            try {
                jSONObject2.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static JSONArray lMd(String str) {
        try {
            Set<String> lMd2 = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.lMd(str);
            if (lMd2 != null && lMd2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = lMd2.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.zp.KS.lMd zp2 = com.bytedance.sdk.component.adexpress.zp.lMd.lMd.zp(it.next());
                    if (zp2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", zp2.lMd());
                        jSONObject.put("md5", zp2.KS());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "getParentTplIds: ", e4);
            return null;
        }
    }

    private void zp(Map<String, String> map, com.bytedance.sdk.component.QR.lMd.jU jUVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    jUVar.lMd(entry.getKey(), entry.getValue());
                } catch (Exception e4) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "ADD header exceptopn", e4.getMessage());
                }
            }
        }
        try {
            jUVar.lMd(Command.HTTP_HEADER_USER_AGENT, YhE.KS());
        } catch (Exception e9) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "ADD header exceptopn", e9.getMessage());
        }
    }

    private void zp(JSONObject jSONObject, boolean z8) {
        if (ku.lMd().woN()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "reportETEvent error", e4.getMessage());
            }
            com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
            lMd2.lMd(YhE.tG());
            if (z8) {
                byte[] COT = COT(jSONObject.toString());
                byte[] encrypt = PangleEncryptUtils.encrypt(COT, COT.length);
                if (encrypt == null) {
                    com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", "V3 encrypt failed");
                    JSONObject zp2 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
                    if (KS(zp2)) {
                        jSONObject = zp2;
                    }
                    zp(jU(jSONObject), lMd2);
                    lMd2.zp(jSONObject.toString(), KVG.jU().vwr());
                } else {
                    zp(lMd(), lMd2);
                    lMd2.zp("application/octet-stream;tt-data=a", encrypt);
                }
            } else {
                JSONObject zp3 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
                if (KS(zp3)) {
                    jSONObject = zp3;
                }
                zp(jU(jSONObject), lMd2);
                lMd2.zp(jSONObject.toString(), KVG.jU().vwr());
            }
            lMd2.zp(7);
            lMd2.zp("et_applog");
            lMd2.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.vwr.5
                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                    if (lmd == null || !lmd.HWF()) {
                        return;
                    }
                    lmd.jU();
                }

                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public void zp(@NonNull String str, List<FilterWord> list, String str2, String str3) {
        JSONObject lMd2;
        if (com.bytedance.sdk.openadsdk.core.settings.Bj.zp() && (lMd2 = lMd(str, list, str2, str3)) != null) {
            com.bytedance.sdk.component.QR.lMd.jU lMd3 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
            String jU = YhE.jU("/api/ad/union/dislike_event/");
            String jSONObject = com.bytedance.sdk.component.utils.zp.zp(lMd2).toString();
            lMd3.lMd(jU);
            lMd3.jU(jSONObject);
            final com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(6);
            jUVar.zp(jU).lMd(jSONObject).zp();
            lMd3.zp(7);
            lMd3.zp("dislike");
            lMd3.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.vwr.6
                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                    if (lmd != null) {
                        jUVar.zp(lmd.HWF()).zp(lmd.zp()).jU(lmd.lMd()).KS(lmd.jU()).KS();
                    } else {
                        jUVar.zp(false).zp(com.bytedance.sdk.openadsdk.dT.zp.jU.zp).KS();
                    }
                }

                @Override // com.bytedance.sdk.component.QR.zp.zp
                public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                    jUVar.zp(false).jU(iOException != null ? iOException.getMessage() : null).KS();
                }
            });
        }
    }

    private JSONArray zp(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(woN.zp zpVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
        zpVar.zp(-1, QR.zp(-1));
        lmd.zp(-1);
        com.bytedance.sdk.openadsdk.core.model.lMd.zp(lmd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(woN.lMd lmd) {
        lmd.zp(-1, QR.zp(-1));
    }

    public static JSONObject zp(AdSlot adSlot) {
        pvr pvrVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", KVG.jU().si());
            jSONObject.put("lmt", DeviceUtils.KS());
            jSONObject.put("coppa", ku.lMd().YW());
            jSONObject.put("gdpr", ku.lMd().ku());
            jSONObject.put("is_gdpr_user", KVG.jU().Iv());
            jSONObject.put("ccpa", ku.lMd().cz());
            if (adSlot != null && pvr.zp.containsKey(Integer.valueOf(adSlot.getCodeId())) && (pvrVar = pvr.zp.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", pvrVar.lMd());
                jSONObject.put("lastbundle", pvrVar.KS());
                jSONObject.put("lastclick", pvrVar.jU());
                jSONObject.put("lastskip", pvrVar.COT());
            }
            zp(jSONObject, "keywords", ku.lMd().Bj());
            zp(jSONObject, DataSchemeDataSource.SCHEME_DATA, lMd(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void zp(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject zp(AdSlot adSlot, int i9, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i9);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (pvrVar != null) {
                jSONObject.put("render_method", pvrVar.ku);
                int i10 = pvrVar.ku;
                if (i10 == 1) {
                    zp(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i10 == 2) {
                    zp(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                zp(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", lMd(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", KS(adSlot.getCodeId()));
            jSONObject.put("pos", AdSlot.getPosition(i9));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i9 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (pvrVar != null && (obj = pvrVar.QR) != null) {
                jSONObject.put("session_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i9 == 7 || i9 == 8) {
                adCount = 1;
            }
            if (pvrVar != null && pvrVar.COT != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i9 == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void zp(JSONObject jSONObject, String str, int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i9);
            jSONObject2.put("height", i10);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void zp(JSONObject jSONObject, String str, float f9, float f10) {
        if (f9 < 0.0f || f10 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f9);
            jSONObject2.put("height", (int) f10);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public void zp(JSONObject jSONObject, final woN.lMd lmd) {
        if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
            if (lmd != null) {
                lmd.zp(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                return;
            }
            return;
        }
        if (jSONObject == null || lmd == null) {
            return;
        }
        JSONObject zp2 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
        final com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(5);
        com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        try {
            String zp3 = com.bytedance.sdk.openadsdk.COT.jU.zp(lMd2, YhE.jU("/api/ad/union/sdk/reward_video/reward/"));
            lMd2.lMd(zp3);
            jUVar.zp(zp3);
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e4.getMessage());
        }
        lMd2.jU(zp2.toString());
        jUVar.zp(lMd2.KS()).zp();
        lMd2.zp(10);
        lMd2.zp("reward");
        lMd2.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.vwr.7
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd2) {
                if (lmd2 != null) {
                    if (lmd2.HWF() && !TextUtils.isEmpty(lmd2.jU())) {
                        jUVar.zp(true).zp(lmd2.zp()).KS(lmd2.jU()).KS();
                        try {
                            JSONObject jSONObject2 = new JSONObject(lmd2.jU());
                            String KS = jSONObject2.optInt("cypher", -1) == 3 ? com.bytedance.sdk.component.utils.zp.KS(jSONObject2.optString("message")) : null;
                            if (!TextUtils.isEmpty(KS)) {
                                try {
                                    jSONObject2 = new JSONObject(KS);
                                } catch (Throwable unused) {
                                }
                            }
                            lMd zp4 = lMd.zp(jSONObject2);
                            int i9 = zp4.zp;
                            if (i9 != 20000) {
                                lmd.zp(i9, QR.zp(i9));
                                return;
                            } else if (zp4.KS == null) {
                                vwr.this.zp(lmd);
                                return;
                            } else {
                                lmd.zp(zp4);
                                return;
                            }
                        } catch (JSONException e9) {
                            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e9.getMessage());
                            vwr.this.zp(lmd);
                            return;
                        }
                    }
                    jUVar.zp(lmd2.HWF()).KS(lmd2.jU()).zp(lmd2.zp()).jU(lmd2.lMd()).KS();
                    String zp5 = QR.zp(-2);
                    int zp6 = lmd2.zp();
                    if (!lmd2.HWF() && !TextUtils.isEmpty(lmd2.lMd())) {
                        zp5 = lmd2.lMd();
                    }
                    lmd.zp(zp6, zp5);
                    return;
                }
                jUVar.zp(false).zp(com.bytedance.sdk.openadsdk.dT.zp.jU.zp).KS();
                vwr.this.zp(lmd);
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                String str;
                if (iOException != null) {
                    str = iOException.getMessage();
                } else {
                    str = "";
                }
                jUVar.zp(false).jU(str).KS();
                lmd.zp(-2, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public com.bytedance.sdk.openadsdk.lMd.COT zp(JSONObject jSONObject) {
        boolean z8;
        boolean z9;
        int i9;
        String str = "error unknown";
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(4);
        JSONObject zp2 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
        com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        boolean z10 = false;
        try {
            lMd2.zp(zp2.toString(), KVG.jU().vwr());
            String jU = YhE.jU("/api/ad/union/sdk/stats/batch/");
            jUVar.zp(jU).zp(lMd2.KS()).zp();
            lMd2.lMd(jU);
            lMd2.lMd(Command.HTTP_HEADER_USER_AGENT, YhE.KS());
            if (com.bytedance.sdk.openadsdk.core.settings.dQp.etV().Eg()) {
                lMd2.lMd("_disable_retry", "1");
            }
            com.bytedance.sdk.component.QR.lMd zp3 = lMd2.zp();
            try {
            } catch (Throwable unused) {
                z8 = false;
                z9 = false;
                i9 = 0;
            }
            if (zp3 == null) {
                return new com.bytedance.sdk.openadsdk.lMd.COT(false, 0, "error unknown", false);
            }
            if (!zp3.HWF() || TextUtils.isEmpty(zp3.jU())) {
                z8 = false;
                z9 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(zp3.jU());
                int optInt = jSONObject2.optInt("code", -1);
                str = jSONObject2.optString(DataSchemeDataSource.SCHEME_DATA, "");
                z8 = optInt == 20000;
                z9 = optInt == 60005;
            }
            try {
                i9 = zp3.zp();
                try {
                    if (!zp3.HWF()) {
                        str = zp3.lMd();
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                i9 = 0;
            }
            boolean z11 = zp3 == null;
            if (!z11 && zp3.HWF()) {
                z10 = true;
            }
            jUVar.zp(z10).KS(z11 ? null : zp3.jU()).zp(z11 ? com.bytedance.sdk.openadsdk.dT.zp.jU.zp : i9).jU(z11 ? null : zp3.lMd()).KS();
            com.bytedance.sdk.openadsdk.lMd.zp.zp.zp(com.bytedance.sdk.openadsdk.lMd.zp.zp.lMd, z8, i9, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.lMd.COT(z8, i9, str, z9);
        } catch (Throwable unused4) {
            com.bytedance.sdk.openadsdk.lMd.zp.zp.zp(com.bytedance.sdk.openadsdk.lMd.zp.zp.lMd, false, 0, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.lMd.COT(false, 0, "error unknown", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public com.bytedance.sdk.component.adexpress.zp.KS.zp zp() {
        com.bytedance.sdk.component.adexpress.zp.KS.zp zpVar = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tpl_fetch_model", "date", 0L);
        String oKZ = KVG.jU().oKZ();
        String lMd2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("tpl_fetch_model", "last_url", "");
        if (currentTimeMillis <= KVG.jU().QUv() && currentTimeMillis >= 0 && TextUtils.equals(oKZ, lMd2)) {
            String lMd3 = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(lMd3)) {
                    return com.bytedance.sdk.component.adexpress.zp.KS.zp.jU(lMd3);
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
        try {
            KS.lMd(com.bytedance.sdk.openadsdk.COT.jU.zp(KS, oKZ));
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("NetApiImpl", e4.getMessage());
        }
        com.bytedance.sdk.component.QR.lMd zp2 = KS.zp();
        if (zp2 == null) {
            return null;
        }
        try {
            if (!zp2.HWF()) {
                return null;
            }
            String jU = zp2.jU();
            zpVar = com.bytedance.sdk.component.adexpress.zp.KS.zp.jU(jU);
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tpl_fetch_model", "model", jU);
            com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tpl_fetch_model", "last_url", oKZ);
            return zpVar;
        } catch (Exception unused2) {
            return zpVar;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public void zp(String str) {
        com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
        KS.lMd(str);
        KS.zp("upload_bidding");
        KS.zp(7);
        KS.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.vwr.8
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                lmd.jU();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.woN
    public void zp(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        lMd2.lMd(str);
        lMd2.zp(jSONObject);
        lMd2.zp(5);
        lMd2.zp("apm_pv");
        lMd2.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.vwr.9
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                lmd.jU();
            }
        });
    }
}
