package com.bytedance.sdk.openadsdk.core;

import a4.j;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.qO;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
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
import m5.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aIu implements qO<com.bytedance.sdk.openadsdk.AlY.YFl> {
    private final Context YFl;

    /* loaded from: classes.dex */
    public static class Sg {
        public final boolean Sg;
        public final int YFl;
        public final com.bytedance.sdk.openadsdk.core.model.YI tN;

        private Sg(int i10, boolean z10, com.bytedance.sdk.openadsdk.core.model.YI yi) {
            this.YFl = i10;
            this.Sg = z10;
            this.tN = yi;
        }

        public static Sg YFl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("code");
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            com.bytedance.sdk.openadsdk.core.model.YI yi = new com.bytedance.sdk.openadsdk.core.model.YI();
            if (optJSONObject != null) {
                try {
                    yi.YFl(optJSONObject.optInt("reason"));
                    yi.Sg(optJSONObject.optInt("corp_type"));
                    yi.tN(optJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    yi.YFl(optJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", th2.getMessage());
                }
            }
            return new Sg(optInt, optBoolean, yi);
        }
    }

    public aIu(Context context) {
        this.YFl = context;
    }

    @NonNull
    private Map<String, String> AlY(JSONObject jSONObject) {
        HashMap q10 = j.q("Content-Type", "application/json; charset=utf-8");
        if (tN(jSONObject)) {
            q10.put("Content-Encoding", "union_sdk_encode");
        }
        return q10;
    }

    @NonNull
    private Map<String, String> Sg() {
        return j.q("Content-Type", "application/octet-stream;tt-data=a");
    }

    private boolean tN(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @DungeonFlag
    private void vc(JSONObject jSONObject) {
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, Sco.wN());
            jSONObject.put("version_code", Sco.vc());
            jSONObject.put("version", Sco.DSW());
        } catch (Exception unused) {
        }
    }

    private boolean wN(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString(PglCryptUtils.KEY_MESSAGE).equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    @DungeonFlag
    private JSONObject tN() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", NjR.Sg().AlY());
            jSONObject.put("name", NjR.Sg().vc());
            vc(jSONObject);
            Context YFl2 = lG.YFl();
            String str = "";
            if (YFl2 != null) {
                try {
                    str = YFl2.getPackageResourcePath();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "failed to get the application installation package path. error: " + th2.getMessage());
                }
            }
            jSONObject.put("package_install_path", str);
            jSONObject.put("is_paid_app", NjR.Sg().eT());
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.YFl.DSW());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - pDU.YFl()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.NjR(this.YFl));
            int i10 = 0;
            jSONObject.put("is_init", pDU.wN() ? 1 : 0);
            if (YFl2 != null) {
                int rotation = ((WindowManager) YFl2.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i10 = 1;
                } else if (rotation == 1) {
                    i10 = 3;
                } else if (rotation == 2) {
                    i10 = 2;
                } else if (rotation == 3) {
                    i10 = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i10));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private byte[] wN(String str) {
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
                            } catch (IOException e2) {
                                com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e2.toString());
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e10) {
                            e = e10;
                            gZIPOutputStream = gZIPOutputStream2;
                            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e11) {
                                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e11.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                bArr = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return bArr;
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e12) {
                                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e12.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e13) {
                                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e13.toString());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (IOException e15) {
                e = e15;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e16) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e16.toString());
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.aIu aiu, final int i10, final qO.YFl yFl) {
        pDU.vc();
        final com.bytedance.sdk.openadsdk.core.model.Sg sg2 = new com.bytedance.sdk.openadsdk.core.model.Sg();
        sg2.YFl(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            if (yFl != null) {
                yFl.YFl(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                sg2.YFl(1000);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                return;
            }
            return;
        }
        if (!lG.AlY().BPI()) {
            if (yFl != null) {
                yFl.YFl(-16, qsH.YFl(-16));
                sg2.YFl(1001);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                return;
            }
            return;
        }
        if (yFl == null) {
            return;
        }
        if (AlY(adSlot.getCodeId())) {
            yFl.YFl(-8, qsH.YFl(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !aiu.f10702vc) {
            sg2.Sg(2);
            sg2.YFl(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.YoT.AlY()) {
                a.a(adSlot.getBidAdm());
            }
            if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                Sco.YFl("Pangle_Debug_Mode", adSlot.getBidAdm(), this.YFl);
            }
            try {
                JSONObject Sg2 = Sg(new JSONObject(adSlot.getBidAdm()));
                if (Sg2 == null) {
                    YFl(yFl, sg2);
                    return;
                }
                YFl YFl2 = YFl.YFl(Sg2, adSlot, aiu, sg2);
                sg2.YFl(YFl2.f10664nc);
                YoT.YFl(this.YFl, YFl2.NjR);
                int i11 = YFl2.AlY;
                if (i11 != 20000) {
                    yFl.YFl(i11, YFl2.wN);
                    sg2.YFl(YFl2.AlY);
                    com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.model.YFl yFl2 = YFl2.qsH;
                if (yFl2 == null) {
                    YFl(yFl, sg2);
                    return;
                }
                if (yFl2.tN() != null && YFl2.qsH.tN().size() > 0) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl(YFl2.qsH.tN().get(0));
                }
                YFl2.qsH.tN(Sg2.toString());
                yFl.YFl(YFl2.qsH, sg2);
                Map<String, com.bytedance.sdk.openadsdk.core.model.Wwa> YFl3 = com.bytedance.sdk.openadsdk.core.model.YFl.YFl(YFl2.qsH);
                if (YFl3 != null) {
                    com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(YFl3);
                }
                YFl(YFl2.qsH);
                com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().YFl(YFl2.qsH);
                return;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "get ad error: ", th2);
                YFl(yFl, sg2);
                return;
            }
        }
        JSONObject YFl4 = YFl(adSlot, aiu, i10);
        if (YFl4 == null) {
            yFl.YFl(-9, qsH.YFl(-9));
            sg2.YFl(-9);
            com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
            return;
        }
        if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
            Sco.YFl("Pangle_Debug_Mode", YFl4.toString(), this.YFl);
        }
        String YFl5 = Sco.YFl(adSlot.getBiddingTokens() != null ? "/api/ad/union/mediation/get_ads/" : "/api/ad/union/sdk/get_ads/", true);
        com.bytedance.sdk.component.DSW.Sg.AlY Sg3 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        final com.bytedance.sdk.openadsdk.pDU.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.pDU.YFl.wN(2);
        try {
            String YFl6 = com.bytedance.sdk.openadsdk.qsH.AlY.YFl(Sg3, YFl5);
            Sg3.Sg(YFl6);
            wNVar.YFl(YFl6);
        } catch (Exception unused) {
        }
        Sg3.YFl(YFl4.toString(), lG.AlY().lG());
        wNVar.YFl(Sg3.AlY()).YFl();
        Map<String, String> YFl7 = com.bytedance.sdk.openadsdk.core.NjR.tN.YFl(YFl5, YFl4.toString());
        if (YFl7 != null && YFl7.size() > 0) {
            for (String str : YFl7.keySet()) {
                try {
                    Sg3.Sg(str, YFl7.get(str));
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e2.getMessage());
                }
            }
        }
        try {
            Sg3.Sg(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
            YFl(Sg3, YFl4);
        } catch (Exception unused2) {
        }
        final com.bytedance.sdk.openadsdk.utils.zB YFl8 = com.bytedance.sdk.openadsdk.utils.zB.YFl();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z10 = NjR.Sg().lG() && requestExtraMap != null;
        if (z10) {
            requestExtraMap.put("pgad_start", YFl8);
        }
        if (adSlot.getBiddingTokens() != null) {
            YFl(adSlot, aiu, Sg3, requestExtraMap, z10, YFl8, yFl);
            return;
        }
        Sg3.YFl(10);
        Sg3.YFl("get_ad");
        com.bytedance.sdk.openadsdk.rkt.tN.YFl(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.aIu.3
            @Override // com.bytedance.sdk.openadsdk.rkt.AlY
            public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl3 = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                yFl3.Sg("get_ad");
                yFl3.tN(adSlot.getCodeId());
                yFl3.AlY(Sco.tN(adSlot.getDurationSlotType()));
                return yFl3;
            }
        });
        final boolean z11 = z10;
        Sg3.YFl(new com.bytedance.sdk.component.DSW.YFl.Sg() { // from class: com.bytedance.sdk.openadsdk.core.aIu.4
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg3) {
                com.bytedance.sdk.openadsdk.core.model.bZ bZVar;
                System.currentTimeMillis();
                wNVar.Sg();
                if (z11) {
                    requestExtraMap.put("pgad_end", YFl8);
                }
                if (sg3 != null) {
                    if (sg3.vc()) {
                        com.bytedance.sdk.openadsdk.rkt.tN.Sg(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.aIu.4.1
                            @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                            public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                                com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl3 = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                yFl3.Sg("get_ad");
                                yFl3.tN(adSlot.getCodeId());
                                yFl3.AlY(Sco.tN(adSlot.getDurationSlotType()));
                                yFl3.YFl(BuildConfig.VERSION_NAME);
                                return yFl3;
                            }
                        });
                        com.bytedance.sdk.openadsdk.AlY.YFl.vc.Sg.incrementAndGet();
                        com.bytedance.sdk.openadsdk.AlY.YFl.vc.YFl.incrementAndGet();
                        try {
                            com.bytedance.sdk.openadsdk.utils.zB YFl9 = com.bytedance.sdk.openadsdk.utils.zB.YFl();
                            String AlY = sg3.AlY();
                            JSONObject jSONObject = new JSONObject(AlY);
                            if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                                Sco.YFl("Pangle_Debug_Mode", jSONObject.toString(), aIu.this.YFl);
                            }
                            sg2.YFl(AlY);
                            JSONObject Sg4 = aIu.this.Sg(jSONObject);
                            if (Sg4 == null) {
                                aIu.this.YFl(yFl, sg2);
                                sg3.DSW();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.f10497vc.incrementAndGet();
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                                wNVar.YFl(true).YFl(sg3.YFl()).tN(AlY).tN();
                                return;
                            }
                            YFl YFl10 = YFl.YFl(Sg4, adSlot, aiu, sg2);
                            sg2.YFl(YFl10.f10664nc);
                            YoT.YFl(aIu.this.YFl, YFl10.NjR);
                            int i12 = YFl10.AlY;
                            if (i12 != 20000) {
                                sg2.YFl(i12);
                                if (!lG.AlY().hQ() && YFl10.AlY == 40029) {
                                    yFl.YFl(-100, qsH.YFl(-100));
                                } else {
                                    yFl.YFl(YFl10.AlY, YFl10.wN);
                                }
                                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                                sg3.DSW();
                                adSlot.getCodeId();
                                String.valueOf(YFl10.f10665vc);
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.f10497vc.incrementAndGet();
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                                wNVar.YFl(true).YFl(sg3.YFl()).tN(AlY).tN();
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.model.YFl yFl3 = YFl10.qsH;
                            if (yFl3 == null) {
                                aIu.this.YFl(yFl, sg2);
                                sg3.DSW();
                                adSlot.getCodeId();
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.wN.incrementAndGet();
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                                wNVar.YFl(true).YFl(sg3.YFl()).tN(AlY).tN();
                                return;
                            }
                            yFl3.tN(Sg4.toString());
                            com.bytedance.sdk.openadsdk.utils.zB YFl11 = com.bytedance.sdk.openadsdk.utils.zB.YFl();
                            com.bytedance.sdk.openadsdk.core.model.aIu aiu2 = aiu;
                            if (aiu2 != null && (bZVar = aiu2.f10701nc) != null) {
                                bZVar.YFl(YFl8, YFl9, YFl10.YFl, YFl11);
                            }
                            yFl.YFl(YFl10.qsH, sg2);
                            aIu.this.YFl(YFl10.qsH);
                            com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().YFl(YFl10.qsH);
                            Map<String, com.bytedance.sdk.openadsdk.core.model.Wwa> YFl12 = com.bytedance.sdk.openadsdk.core.model.YFl.YFl(YFl10.qsH);
                            if (YFl12 != null) {
                                com.bytedance.sdk.openadsdk.DSW.Sg.YFl().YFl(YFl12);
                            }
                            if (YFl10.qsH.tN() != null && !YFl10.qsH.tN().isEmpty()) {
                                aIu.this.YFl(sg3.qsH(), aiu, YFl8, YFl9, YFl10.YFl, YFl11, YFl10.qsH.tN().get(0), Sco.tN(i10), YFl10.qsH.DSW());
                                com.bytedance.sdk.openadsdk.AlY.YFl.vc.AlY.incrementAndGet();
                            }
                            com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                            wNVar.YFl(true).YFl(sg3.YFl()).tN(AlY).tN();
                            return;
                        } catch (Throwable th3) {
                            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "get ad error: ", th3);
                            aIu.this.YFl(yFl, sg2);
                            sg3.DSW();
                            adSlot.getCodeId();
                            com.bytedance.sdk.openadsdk.AlY.YFl.vc.wN.incrementAndGet();
                            com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                            wNVar.YFl(sg3.vc()).YFl(sg3.YFl()).tN(sg3.AlY()).AlY(th3.getMessage()).tN();
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.aIu.4.2
                        @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                        public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                            com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl4 = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                            yFl4.Sg("get_ad");
                            yFl4.tN(adSlot.getCodeId());
                            yFl4.AlY(Sco.tN(adSlot.getDurationSlotType()));
                            yFl4.YFl(BuildConfig.VERSION_NAME);
                            return yFl4;
                        }
                    });
                    int YFl13 = sg3.YFl();
                    String Sg5 = sg3.Sg();
                    yFl.YFl(YFl13, Sg5);
                    sg2.YFl(YFl13);
                    com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                    sg3.DSW();
                    adSlot.getCodeId();
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.qsH.incrementAndGet();
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN.incrementAndGet();
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.YFl.incrementAndGet();
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.wN();
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.YFl(YFl13, Sg5);
                    com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                    wNVar.YFl(false).YFl(YFl13).AlY(Sg5).tN(sg3.AlY()).tN();
                }
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.Sg
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException, com.bytedance.sdk.component.DSW.Sg sg3) {
                String message;
                int i12;
                com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.aIu.4.3
                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl3 = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                        yFl3.Sg("get_ad");
                        yFl3.tN(adSlot.getCodeId());
                        yFl3.AlY(Sco.tN(adSlot.getDurationSlotType()));
                        yFl3.YFl(BuildConfig.VERSION_NAME);
                        return yFl3;
                    }
                });
                wNVar.Sg();
                if (sg3 != null) {
                    message = sg3.Sg();
                } else {
                    message = iOException != null ? iOException.getMessage() : "";
                }
                com.bytedance.sdk.openadsdk.utils.zB YFl9 = com.bytedance.sdk.openadsdk.utils.zB.YFl();
                if (z11) {
                    requestExtraMap.put("pgad_end", Long.valueOf(YFl9.YFl));
                }
                if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                    Sco.YFl("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, aIu.this.YFl);
                }
                if (sg3 != null) {
                    i12 = sg3.YFl();
                } else {
                    i12 = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
                }
                qO.YFl yFl3 = yFl;
                if (yFl3 != null) {
                    yFl3.YFl(i12, message);
                }
                sg2.YFl(i12);
                com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
                YFl9.YFl(YFl8);
                adSlot.getCodeId();
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN.incrementAndGet();
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.YFl.incrementAndGet();
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.DSW.incrementAndGet();
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.wN();
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.YFl(i12, message);
                com.bytedance.sdk.openadsdk.AlY.YFl.vc.tN();
                wNVar.AlY(message).YFl(false).tN();
            }
        });
    }

    private boolean AlY(String str) {
        if (com.bytedance.sdk.openadsdk.core.DSW.Sg.YFl()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.DSW.Sg.YFl(str)) {
            return false;
        }
        String Sg2 = com.bytedance.sdk.openadsdk.core.DSW.Sg.Sg();
        if (!TextUtils.isEmpty(Sg2)) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg2, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|2|3|(16:8|9|(1:(1:14))(2:43|(1:(1:48))(2:49|(1:54)))|15|16|(1:19)|(1:24)|25|(1:27)(1:41)|28|(1:31)|32|(1:34)|35|(1:37)|39)|55|9|(0)(0)|15|16|(1:19)|(2:22|24)|25|(0)(0)|28|(1:31)|32|(0)|35|(0)|39) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:12:0x002b, B:14:0x002f, B:22:0x0077, B:24:0x007d, B:25:0x00a9, B:28:0x00c3, B:31:0x0132, B:32:0x0142, B:34:0x0151, B:35:0x015e, B:37:0x016d, B:46:0x0039, B:48:0x003d, B:52:0x0046, B:54:0x004a, B:55:0x0020), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #1 {all -> 0x0176, blocks: (B:3:0x000d, B:5:0x0014, B:8:0x001d, B:12:0x002b, B:14:0x002f, B:22:0x0077, B:24:0x007d, B:25:0x00a9, B:28:0x00c3, B:31:0x0132, B:32:0x0142, B:34:0x0151, B:35:0x015e, B:37:0x016d, B:46:0x0039, B:48:0x003d, B:52:0x0046, B:54:0x004a, B:55:0x0020), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0033  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject YFl(com.bytedance.sdk.openadsdk.AdSlot r13, com.bytedance.sdk.openadsdk.core.model.aIu r14, int r15) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.aIu.YFl(com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.aIu, int):org.json.JSONObject");
    }

    /* loaded from: classes.dex */
    public static class YFl {
        final int AlY;
        final String DSW;
        final String NjR;
        final long Sg;
        final int YFl;

        /* renamed from: nc, reason: collision with root package name */
        final ArrayList<Integer> f10664nc;

        @Nullable
        public final com.bytedance.sdk.openadsdk.core.model.YFl qsH;
        final long tN;

        /* renamed from: vc, reason: collision with root package name */
        final int f10665vc;
        final String wN;

        private YFl(String str, int i10, int i11, String str2, int i12, String str3, @Nullable com.bytedance.sdk.openadsdk.core.model.YFl yFl, long j3, long j10, ArrayList<Integer> arrayList) {
            this.YFl = i10;
            this.AlY = i11;
            this.wN = str2;
            this.DSW = str3;
            this.qsH = yFl;
            this.NjR = str;
            this.f10665vc = i12;
            this.Sg = j3;
            this.tN = j10;
            this.f10664nc = arrayList;
        }

        public static YFl YFl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.aIu aiu, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
            Object obj;
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String optString3 = jSONObject.optString("request_id");
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.YFl, ArrayList<Integer>> YFl = com.bytedance.sdk.openadsdk.core.Sg.YFl(jSONObject, adSlot, aiu, sg2);
            if (YFl != null && (obj = YFl.first) != null) {
                ((com.bytedance.sdk.openadsdk.core.model.YFl) obj).YFl(jSONObject.optLong("request_after"));
            }
            if (YFl == null) {
                return new YFl(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new YFl(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.YFl) YFl.first, optLong, optLong2, (ArrayList) YFl.second);
        }

        public static YFl YFl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.aIu aiu) {
            JSONArray jSONArray;
            int i10;
            String str;
            long j3;
            long j10;
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
                com.bytedance.sdk.openadsdk.core.model.YFl yFl = new com.bytedance.sdk.openadsdk.core.model.YFl();
                if (optJSONArray != null) {
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            String optString4 = optJSONObject.optString("name");
                            String optString5 = optJSONObject.optString("render_data");
                            jSONArray = optJSONArray;
                            String optString6 = optJSONObject.optString(BidResponsed.KEY_PRICE);
                            j10 = optLong2;
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("win_notice");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("loss_notice");
                            j3 = optLong;
                            String optString7 = optJSONObject.optString(BidResponsedEx.KEY_CID);
                            String optString8 = optJSONObject.optString("crid");
                            str = optString3;
                            JSONArray optJSONArray4 = optJSONObject.optJSONArray("adomain");
                            i10 = optInt3;
                            String optString9 = optJSONObject.optString("adn_response_id");
                            com.bytedance.sdk.openadsdk.core.model.qsH qsh = new com.bytedance.sdk.openadsdk.core.model.qsH();
                            qsh.YFl(optString4);
                            qsh.Sg(optString5);
                            qsh.tN(optString6);
                            qsh.AlY(optString7);
                            qsh.wN(optString8);
                            qsh.vc(optString9);
                            if (optJSONArray4 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i12 = 0; i12 < optJSONArray4.length(); i12++) {
                                    arrayList.add(optJSONArray4.optString(i12));
                                }
                                qsh.tN(arrayList);
                            }
                            if (optJSONArray2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (int i13 = 0; i13 < optJSONArray2.length(); i13++) {
                                    arrayList2.add(optJSONArray2.optString(i13));
                                }
                                qsh.YFl(arrayList2);
                            }
                            if (optJSONArray3 != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i14 = 0; i14 < optJSONArray3.length(); i14++) {
                                    arrayList3.add(optJSONArray3.optString(i14));
                                }
                                qsh.Sg(arrayList3);
                            }
                            yFl.YFl(qsh);
                        } else {
                            jSONArray = optJSONArray;
                            i10 = optInt3;
                            str = optString3;
                            j3 = optLong;
                            j10 = optLong2;
                        }
                        i11++;
                        optJSONArray = jSONArray;
                        optString3 = str;
                        optLong2 = j10;
                        optLong = j3;
                        optInt3 = i10;
                    }
                }
                return new YFl(optString, optInt, optInt2, optString2, optInt3, optString3, yFl, optLong, optLong2, null);
            }
            return new YFl(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
        }
    }

    public static JSONArray tN(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.eT.YFl.YFl> YFl2 = com.bytedance.sdk.openadsdk.core.eT.YFl.Sg.YFl().YFl(str);
            if (YFl2 != null && YFl2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.eT.YFl.YFl yFl : YFl2) {
                    if (yFl != null && !TextUtils.isEmpty(yFl.wN())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = yFl.YFl().split("_");
                        if (split.length == 2) {
                            jSONObject.put("id", split[1]);
                            jSONObject.put("md5", yFl.Sg());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "getUgenParentTplIds: ", e2);
            return null;
        }
    }

    private void YFl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.aIu aiu) {
        JSONArray jSONArray;
        if (aiu != null && (jSONArray = aiu.wN) != null) {
            try {
                jSONObject.put("source_temai_product_ids", jSONArray);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public void YFl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.aIu aiu, final int i10, qO.YFl yFl) {
        final com.bytedance.sdk.openadsdk.core.YFl.YFl yFl2 = new com.bytedance.sdk.openadsdk.core.YFl.YFl(yFl);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pDU.Sg().post(new com.bytedance.sdk.component.qsH.qsH("getAd") { // from class: com.bytedance.sdk.openadsdk.core.aIu.1
                @Override // java.lang.Runnable
                public void run() {
                    aIu.this.Sg(adSlot, aiu, i10, yFl2);
                }
            });
        } else {
            Sg(adSlot, aiu, i10, yFl2);
        }
    }

    private void YFl(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.aIu aiu, com.bytedance.sdk.component.DSW.Sg.AlY alY, final Map<String, Object> map, final boolean z10, final com.bytedance.sdk.openadsdk.utils.zB zBVar, final qO.YFl yFl) {
        alY.YFl(new com.bytedance.sdk.component.DSW.YFl.Sg() { // from class: com.bytedance.sdk.openadsdk.core.aIu.5
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                if (z10) {
                    map.put("pgad_end", zBVar);
                }
                if (sg2 == null || !sg2.vc()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(sg2.AlY());
                    if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                        Sco.YFl("Pangle_Debug_Mode", jSONObject.toString(), aIu.this.YFl);
                    }
                    JSONObject Sg2 = aIu.this.Sg(jSONObject);
                    if (Sg2 == null) {
                        yFl.YFl(-1, qsH.YFl(-1));
                        return;
                    }
                    YFl YFl2 = YFl.YFl(Sg2, adSlot, aiu);
                    if (YFl2.AlY != 20000) {
                        if (!lG.AlY().hQ() && YFl2.AlY == 40029) {
                            yFl.YFl(-100, qsH.YFl(-100));
                            return;
                        } else {
                            yFl.YFl(YFl2.AlY, YFl2.wN);
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.model.YFl yFl2 = YFl2.qsH;
                    if (yFl2 == null) {
                        yFl.YFl(-1, qsH.YFl(-1));
                        return;
                    }
                    yFl2.tN(Sg2.toString());
                    yFl.YFl(YFl2.qsH, new com.bytedance.sdk.openadsdk.core.model.Sg());
                    aIu.this.YFl(YFl2.qsH);
                    com.bytedance.sdk.openadsdk.core.AlY.YFl.YFl().YFl(YFl2.qsH);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "get ad error: ", th2);
                    yFl.YFl(-1, qsH.YFl(-1));
                }
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.Sg
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException, com.bytedance.sdk.component.DSW.Sg sg2) {
                com.bytedance.sdk.openadsdk.utils.zB YFl2 = com.bytedance.sdk.openadsdk.utils.zB.YFl();
                if (z10) {
                    map.put("pgad_end", Long.valueOf(YFl2.YFl));
                }
                if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                    Sco.YFl("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, aIu.this.YFl);
                }
                if (sg2 != null) {
                    yFl.YFl(sg2.YFl(), sg2.Sg());
                } else {
                    yFl.YFl(601, iOException != null ? iOException.getMessage() : "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        List<com.bytedance.sdk.openadsdk.core.model.Wwa> tN = yFl.tN();
        if (tN == null || tN.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < tN.size(); i10++) {
            com.bytedance.sdk.openadsdk.core.model.Wwa wwa = tN.get(i10);
            if (wwa != null && wwa.eT() == null) {
                YFl("", 0, 0, wwa.dGX(), wwa);
                YFl("", 0, 0, wwa.Ld(), wwa);
                List<com.bytedance.sdk.openadsdk.core.model.EH> VB = wwa.VB();
                if (VB != null && VB.size() > 0) {
                    for (int i11 = 0; i11 < VB.size(); i11++) {
                        YFl(wwa, VB.get(i11));
                    }
                }
                if (wwa.BPI() != null) {
                    YFl(wwa.BPI().f23461f, wwa.BPI().f23457b, wwa.BPI().a, (com.bytedance.sdk.openadsdk.core.model.EH) null, wwa);
                }
            }
        }
    }

    @DungeonFlag
    private JSONObject Sg(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(CampaignEx.JSON_KEY_TIMESTAMP, System.currentTimeMillis());
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("extra", str);
            jSONObject2.put("filter_words", YFl(list));
            jSONObject2.put("dislike_source", str4);
            if (com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().iY() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                jSONObject2.put("creative_info", com.bytedance.sdk.component.utils.YFl.YFl(new JSONObject(str2)).toString());
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

    private void YFl(String str, int i10, int i11, com.bytedance.sdk.openadsdk.core.model.EH eh2, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str).YFl(i10).Sg(i11).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, str, null), 4);
        } else {
            if (eh2 == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.NjR.AlY.YFl(eh2).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, eh2.YFl(), null), 4);
        }
    }

    private void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, com.bytedance.sdk.openadsdk.core.model.EH eh2) {
        if (eh2 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(eh2).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, eh2.YFl(), new com.bytedance.sdk.component.wN.rkt() { // from class: com.bytedance.sdk.openadsdk.core.aIu.6
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i10, String str, @Nullable Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(com.bytedance.sdk.component.wN.eT eTVar) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:16:0x0069, B:18:0x006c, B:20:0x0072, B:21:0x009a), top: B:26:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:16:0x0069, B:18:0x006c, B:20:0x0072, B:21:0x009a), top: B:26:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:27:0x001b, B:29:0x0023, B:8:0x0034, B:10:0x0050, B:11:0x0055, B:13:0x005f, B:16:0x0069, B:18:0x006c, B:20:0x0072, B:21:0x009a), top: B:26:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(com.bytedance.sdk.component.Sg.YFl.nc r13, com.bytedance.sdk.openadsdk.core.model.aIu r14, com.bytedance.sdk.openadsdk.utils.zB r15, com.bytedance.sdk.openadsdk.utils.zB r16, int r17, com.bytedance.sdk.openadsdk.utils.zB r18, com.bytedance.sdk.openadsdk.core.model.Wwa r19, java.lang.String r20, boolean r21) {
        /*
            r12 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r18
            com.bytedance.sdk.openadsdk.core.settings.vc r5 = com.bytedance.sdk.openadsdk.core.lG.AlY()
            boolean r5 = r5.Ld()
            if (r5 != 0) goto L12
            return
        L12:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r6 = 0
            if (r1 == 0) goto L33
            com.bytedance.sdk.openadsdk.utils.zB r8 = r1.NjR     // Catch: java.lang.Exception -> La8
            long r9 = r8.YFl     // Catch: java.lang.Exception -> La8
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L33
            java.lang.String r9 = "client_start_time"
            long r10 = r15.YFl(r8)     // Catch: java.lang.Exception -> La8
            r5.put(r9, r10)     // Catch: java.lang.Exception -> La8
            com.bytedance.sdk.openadsdk.utils.zB r1 = r1.NjR     // Catch: java.lang.Exception -> La8
            long r8 = r4.YFl(r1)     // Catch: java.lang.Exception -> La8
            goto L34
        L33:
            r8 = r6
        L34:
            java.lang.String r1 = "network_time"
            long r10 = r3.YFl(r15)     // Catch: java.lang.Exception -> La8
            r5.put(r1, r10)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "sever_time"
            r2 = r17
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "client_end_time"
            long r2 = r4.YFl(r3)     // Catch: java.lang.Exception -> La8
            r5.put(r1, r2)     // Catch: java.lang.Exception -> La8
            r1 = 1
            if (r21 == 0) goto L55
            java.lang.String r2 = "is_choose_ad"
            r5.put(r2, r1)     // Catch: java.lang.Exception -> La8
        L55:
            java.lang.String r2 = "open_ad"
            r3 = r20
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Exception -> La8
            if (r2 == 0) goto L6c
            java.lang.String r2 = "is_icon_only"
            boolean r4 = r19.Zu()     // Catch: java.lang.Exception -> La8
            if (r4 == 0) goto L68
            goto L69
        L68:
            r1 = 0
        L69:
            r5.put(r2, r1)     // Catch: java.lang.Exception -> La8
        L6c:
            long r1 = r0.Sg     // Catch: java.lang.Exception -> La8
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 <= 0) goto L9a
            java.lang.String r4 = "enqueue_2_run_ts"
            long r6 = r0.tN     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r1
            r5.put(r4, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "run_2_connect_end_ts"
            long r6 = r0.wN     // Catch: java.lang.Exception -> La8
            long r10 = r0.Sg     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "connect_end_2_response_end_ts"
            long r6 = r0.f10337vc     // Catch: java.lang.Exception -> La8
            long r10 = r0.wN     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "response_end_2_callback_end_ts"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> La8
            long r10 = r0.f10337vc     // Catch: java.lang.Exception -> La8
            long r6 = r6 - r10
            r5.put(r1, r6)     // Catch: java.lang.Exception -> La8
        L9a:
            java.lang.String r0 = "load_ad_time"
            r13 = r19
            r14 = r20
            r15 = r0
            r16 = r8
            r18 = r5
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(r13, r14, r15, r16, r18)     // Catch: java.lang.Exception -> La8
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.aIu.YFl(com.bytedance.sdk.component.Sg.YFl.nc, com.bytedance.sdk.openadsdk.core.model.aIu, com.bytedance.sdk.openadsdk.utils.zB, com.bytedance.sdk.openadsdk.utils.zB, int, com.bytedance.sdk.openadsdk.utils.zB, com.bytedance.sdk.openadsdk.core.model.Wwa, java.lang.String, boolean):void");
    }

    private static String Sg(AdSlot adSlot) {
        String GA = NjR.Sg().GA();
        if (adSlot == null) {
            return TextUtils.isEmpty(GA) ? "" : GA;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(GA)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return GA;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(GA);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i11);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return GA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0181, TRY_ENTER, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0009, B:7:0x0015, B:9:0x002e, B:12:0x0038, B:14:0x004c, B:16:0x0052, B:18:0x0056, B:20:0x005c, B:23:0x0079, B:69:0x00a5, B:70:0x00a9, B:73:0x00b1, B:25:0x00da, B:27:0x00f5, B:29:0x00fb, B:31:0x0105, B:34:0x0118, B:42:0x013c, B:45:0x0144, B:48:0x0150, B:50:0x0156, B:51:0x015a, B:54:0x0165, B:56:0x0161, B:58:0x014c, B:62:0x012a, B:64:0x0130, B:76:0x00c9, B:78:0x008b, B:80:0x0091, B:81:0x009c, B:83:0x0064, B:84:0x006e), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008b A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0009, B:7:0x0015, B:9:0x002e, B:12:0x0038, B:14:0x004c, B:16:0x0052, B:18:0x0056, B:20:0x005c, B:23:0x0079, B:69:0x00a5, B:70:0x00a9, B:73:0x00b1, B:25:0x00da, B:27:0x00f5, B:29:0x00fb, B:31:0x0105, B:34:0x0118, B:42:0x013c, B:45:0x0144, B:48:0x0150, B:50:0x0156, B:51:0x015a, B:54:0x0165, B:56:0x0161, B:58:0x014c, B:62:0x012a, B:64:0x0130, B:76:0x00c9, B:78:0x008b, B:80:0x0091, B:81:0x009c, B:83:0x0064, B:84:0x006e), top: B:2:0x0009, inners: #1 }] */
    @Override // com.bytedance.sdk.openadsdk.core.qO
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.AlY.wN YFl(org.json.JSONObject r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.aIu.YFl(org.json.JSONObject, java.lang.String, boolean):com.bytedance.sdk.openadsdk.AlY.wN");
    }

    public JSONObject Sg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            String optString2 = jSONObject.optString("auction_price", "");
            String Sg2 = Sg(optInt, optString);
            if (TextUtils.isEmpty(Sg2)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(Sg2);
            try {
                jSONObject2.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String Sg(int i10, String str) {
        Object obj;
        if (i10 == 3) {
            return com.bytedance.sdk.component.utils.YFl.tN(str);
        }
        if (i10 == 4) {
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(str);
            if (decryptType4 != null && (obj = decryptType4.second) != null) {
                String str2 = (String) obj;
                Ne.YFl(true);
                return str2;
            }
            Ne.YFl(false);
            Ne.YFl(2, PangleEncryptConstant.CryptDataScene.GET_ADS, decryptType4 != null ? ((Integer) decryptType4.first).intValue() : 0);
        }
        return null;
    }

    public static JSONArray Sg(String str) {
        try {
            Set<String> Sg2 = com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.Sg(str);
            if (Sg2 != null && Sg2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = Sg2.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.YFl.tN.Sg YFl2 = com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(it.next());
                    if (YFl2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", YFl2.Sg());
                        jSONObject.put("md5", YFl2.tN());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "getParentTplIds: ", e2);
            return null;
        }
    }

    private void YFl(Map<String, String> map, com.bytedance.sdk.component.DSW.Sg.AlY alY) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    alY.Sg(entry.getKey(), entry.getValue());
                } catch (Exception e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "ADD header exceptopn", e2.getMessage());
                }
            }
        }
        try {
            alY.Sg(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "ADD header exceptopn", e10.getMessage());
        }
    }

    private void YFl(JSONObject jSONObject, boolean z10) {
        Object obj;
        if (NjR.Sg().lG()) {
            try {
                jSONObject.getJSONObject("header").put("aid", "4562");
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "reportETEvent error", e2.getMessage());
            }
            com.bytedance.sdk.component.DSW.Sg.AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
            Sg2.Sg(Sco.GA());
            byte[] bArr = null;
            if (z10) {
                com.bytedance.sdk.openadsdk.core.settings.vc JwO = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO();
                PangleEncryptConstant.CryptDataScene cryptDataScene = PangleEncryptConstant.CryptDataScene.APP_LOG;
                boolean YFl2 = JwO.YFl(cryptDataScene);
                byte[] wN = wN(jSONObject.toString());
                if (YFl2) {
                    Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(wN);
                    if (encryptType4WithoutBase64 != null && (obj = encryptType4WithoutBase64.second) != null && ((byte[]) obj).length > 0) {
                        Ne.Sg(true);
                        bArr = (byte[]) obj;
                    } else {
                        int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                        Ne.Sg(false);
                        Ne.YFl(1, cryptDataScene, intValue);
                    }
                }
                if (bArr != null) {
                    Sg2.Sg("Content-Encoding", "union_sdk_encode");
                    Sg2.Sg("x-pgli18n", "4");
                    Sg2.YFl("application/octet-stream;tt-data=a", bArr);
                } else {
                    bArr = PangleEncryptManager.encryptV3(wN);
                    if (bArr != null) {
                        YFl(Sg(), Sg2);
                        Sg2.YFl("application/octet-stream;tt-data=a", bArr);
                    } else {
                        com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", "V3 encrypt failed");
                    }
                }
            }
            if (bArr == null) {
                JSONObject YFl3 = com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
                if (tN(YFl3)) {
                    jSONObject = YFl3;
                }
                YFl(AlY(jSONObject), Sg2);
                Sg2.YFl(jSONObject.toString(), lG.AlY().lG());
            }
            Sg2.YFl(7);
            Sg2.YFl("et_applog");
            Sg2.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.aIu.7
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                    if (sg2 == null || !sg2.vc()) {
                        return;
                    }
                    sg2.AlY();
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public void YFl(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        JSONObject Sg2;
        if (com.bytedance.sdk.openadsdk.core.settings.YoT.YFl() && (Sg2 = Sg(str, list, str2, str3, str4)) != null) {
            com.bytedance.sdk.component.DSW.Sg.AlY Sg3 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
            String AlY = Sco.AlY("/api/ad/union/dislike_event/");
            JSONObject YFl2 = YFl(PangleEncryptConstant.CryptDataScene.DISLIKE, Sg2);
            String jSONObject = YFl2 != null ? YFl2.toString() : null;
            YFl(Sg3, YFl2);
            Sg3.Sg(AlY);
            Sg3.AlY(jSONObject);
            final com.bytedance.sdk.openadsdk.pDU.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.pDU.YFl.wN(6);
            wNVar.YFl(AlY).Sg(jSONObject).YFl();
            Sg3.YFl(7);
            Sg3.YFl("dislike");
            Sg3.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.aIu.8
                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                    if (sg2 != null) {
                        wNVar.YFl(sg2.vc()).YFl(sg2.YFl()).AlY(sg2.Sg()).tN(sg2.AlY()).tN();
                    } else {
                        wNVar.YFl(false).YFl(com.bytedance.sdk.openadsdk.pDU.YFl.wN.YFl).tN();
                    }
                }

                @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                    wNVar.YFl(false).AlY(iOException != null ? iOException.getMessage() : null).tN();
                }
            });
            try {
                String optString = new JSONObject(str).optString(BidResponsedEx.KEY_CID, "");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl("dislike", optString, (String) null, (String) null);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.Sg(e2.getMessage());
            }
        }
    }

    private static JSONObject YFl(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(cryptDataScene)) {
            JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new wXo(cryptDataScene));
            Ne.YFl(encryptType4);
            return encryptType4;
        }
        return com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
    }

    private JSONArray YFl(List<FilterWord> list) {
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
    public void YFl(qO.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
        yFl.YFl(-1, qsH.YFl(-1));
        sg2.YFl(-1);
        com.bytedance.sdk.openadsdk.core.model.Sg.YFl(sg2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(qO.Sg sg2) {
        sg2.YFl(-1, qsH.YFl(-1));
    }

    public static JSONObject YFl(AdSlot adSlot) {
        VOe vOe;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", lG.AlY().zG());
            jSONObject.put("lmt", DeviceUtils.tN());
            jSONObject.put("coppa", NjR.Sg().nc());
            jSONObject.put("gdpr", NjR.Sg().NjR());
            jSONObject.put("is_gdpr_user", lG.AlY().UI());
            jSONObject.put("ccpa", NjR.Sg().aIu());
            if (adSlot != null && VOe.YFl.containsKey(Integer.valueOf(adSlot.getCodeId())) && (vOe = VOe.YFl.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", vOe.Sg());
                jSONObject.put("lastbundle", vOe.tN());
                jSONObject.put("lastclick", vOe.AlY());
                jSONObject.put("lastskip", vOe.wN());
            }
            YFl(jSONObject, "keywords", NjR.Sg().YoT());
            YFl(jSONObject, DataSchemeDataSource.SCHEME_DATA, Sg(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void YFl(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private JSONObject YFl(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.core.model.aIu aiu) {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i10);
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
            if (aiu != null) {
                jSONObject.put("render_method", aiu.qsH);
                int i11 = aiu.qsH;
                if (i11 == 1) {
                    YFl(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (i11 == 2) {
                    YFl(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                YFl(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", Sg(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", tN(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", tN(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i10));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (adSlot.getNativeAdType() > 0 || i10 == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (aiu != null && (obj = aiu.DSW) != null) {
                jSONObject.put("session_params", obj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i10 == 7 || i10 == 8) {
                adCount = 1;
            }
            if (aiu != null && aiu.wN != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i10 == 1) {
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

    private void YFl(JSONObject jSONObject, String str, int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i10);
            jSONObject2.put("height", i11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void YFl(JSONObject jSONObject, String str, float f10, float f11) {
        if (f10 < 0.0f || f11 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f10);
            jSONObject2.put("height", (int) f11);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public void YFl(JSONObject jSONObject, final qO.Sg sg2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            if (sg2 != null) {
                sg2.YFl(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
                return;
            }
            return;
        }
        if (jSONObject == null || sg2 == null) {
            return;
        }
        JSONObject YFl2 = YFl(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        final com.bytedance.sdk.openadsdk.pDU.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.pDU.YFl.wN(5);
        com.bytedance.sdk.component.DSW.Sg.AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        try {
            String YFl3 = com.bytedance.sdk.openadsdk.qsH.AlY.YFl(Sg2, Sco.AlY("/api/ad/union/sdk/reward_video/reward/"));
            Sg2.Sg(YFl3);
            wNVar.YFl(YFl3);
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e2.getMessage());
        }
        YFl(Sg2, YFl2);
        Sg2.AlY(YFl2 != null ? YFl2.toString() : "");
        wNVar.YFl(Sg2.AlY()).YFl();
        Sg2.YFl(10);
        Sg2.YFl("reward");
        Sg2.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.aIu.9
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg3) {
                if (sg3 != null) {
                    if (sg3.vc() && !TextUtils.isEmpty(sg3.AlY())) {
                        wNVar.YFl(true).YFl(sg3.YFl()).tN(sg3.AlY()).tN();
                        try {
                            JSONObject jSONObject2 = new JSONObject(sg3.AlY());
                            String Sg3 = aIu.Sg(jSONObject2.optInt("cypher", -1), jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(Sg3)) {
                                try {
                                    jSONObject2 = new JSONObject(Sg3);
                                } catch (Throwable unused) {
                                }
                            }
                            Sg YFl4 = Sg.YFl(jSONObject2);
                            int i10 = YFl4.YFl;
                            if (i10 != 20000) {
                                sg2.YFl(i10, qsH.YFl(i10));
                                return;
                            } else if (YFl4.tN == null) {
                                aIu.this.YFl(sg2);
                                return;
                            } else {
                                sg2.YFl(YFl4);
                                return;
                            }
                        } catch (JSONException e10) {
                            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e10.getMessage());
                            aIu.this.YFl(sg2);
                            return;
                        }
                    }
                    wNVar.YFl(sg3.vc()).tN(sg3.AlY()).YFl(sg3.YFl()).AlY(sg3.Sg()).tN();
                    String YFl5 = qsH.YFl(-2);
                    int YFl6 = sg3.YFl();
                    if (!sg3.vc() && !TextUtils.isEmpty(sg3.Sg())) {
                        YFl5 = sg3.Sg();
                    }
                    sg2.YFl(YFl6, YFl5);
                    return;
                }
                wNVar.YFl(false).YFl(com.bytedance.sdk.openadsdk.pDU.YFl.wN.YFl).tN();
                aIu.this.YFl(sg2);
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                String message = iOException != null ? iOException.getMessage() : "";
                wNVar.YFl(false).AlY(message).tN();
                sg2.YFl(-2, message);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public com.bytedance.sdk.openadsdk.AlY.wN YFl(JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        int i10;
        String str = "error unknown";
        long currentTimeMillis = System.currentTimeMillis();
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.pDU.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.pDU.YFl.wN(4);
        JSONObject YFl2 = YFl(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
        com.bytedance.sdk.component.DSW.Sg.AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        boolean z12 = false;
        try {
            Sg2.YFl(YFl2.toString(), lG.AlY().lG());
            String AlY = Sco.AlY("/api/ad/union/sdk/stats/batch/");
            wNVar.YFl(AlY).YFl(Sg2.AlY()).YFl();
            Sg2.Sg(AlY);
            YFl(Sg2, YFl2);
            Sg2.Sg(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
            if (com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().DjU()) {
                Sg2.Sg("_disable_retry", "1");
            }
            com.bytedance.sdk.component.DSW.Sg YFl3 = Sg2.YFl();
            try {
            } catch (Throwable unused) {
                z10 = false;
                z11 = false;
                i10 = 0;
            }
            if (YFl3 == null) {
                return new com.bytedance.sdk.openadsdk.AlY.wN(false, 0, "error unknown", false);
            }
            if (!YFl3.vc() || TextUtils.isEmpty(YFl3.AlY())) {
                z10 = false;
                z11 = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(YFl3.AlY());
                int optInt = jSONObject2.optInt("code", -1);
                str = jSONObject2.optString(DataSchemeDataSource.SCHEME_DATA, "");
                z10 = optInt == 20000;
                z11 = optInt == 60005;
            }
            try {
                i10 = YFl3.YFl();
                try {
                    if (!YFl3.vc()) {
                        str = YFl3.Sg();
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                i10 = 0;
            }
            boolean z13 = YFl3 == null;
            if (!z13 && YFl3.vc()) {
                z12 = true;
            }
            wNVar.YFl(z12).tN(z13 ? null : YFl3.AlY()).YFl(z13 ? com.bytedance.sdk.openadsdk.pDU.YFl.wN.YFl : i10).AlY(z13 ? null : YFl3.Sg()).tN();
            com.bytedance.sdk.openadsdk.AlY.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.AlY.YFl.YFl.Sg, z10, i10, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.AlY.wN(z10, i10, str, z11);
        } catch (Throwable unused4) {
            com.bytedance.sdk.openadsdk.AlY.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.AlY.YFl.YFl.Sg, false, 0, System.currentTimeMillis() - currentTimeMillis);
            return new com.bytedance.sdk.openadsdk.AlY.wN(false, 0, "error unknown", false);
        }
    }

    private void YFl(com.bytedance.sdk.component.DSW.Sg.AlY alY, JSONObject jSONObject) {
        try {
            if (tN(jSONObject) && jSONObject.optInt("cypher") == 4) {
                alY.Sg("x-pgli18n", "4");
                alY.Sg("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public com.bytedance.sdk.component.adexpress.YFl.tN.YFl YFl() {
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tpl_fetch_model", "date", 0L);
        String lu = lG.AlY().lu();
        String Sg2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tpl_fetch_model", "last_url", "");
        if (currentTimeMillis <= lG.AlY().dXO() && currentTimeMillis >= 0 && TextUtils.equals(lu, Sg2)) {
            String Sg3 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(Sg3)) {
                    return com.bytedance.sdk.component.adexpress.YFl.tN.YFl.AlY(Sg3);
                }
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
        try {
            tN.Sg(com.bytedance.sdk.openadsdk.qsH.AlY.YFl(tN, lu));
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("NetApiImpl", e2.getMessage());
        }
        com.bytedance.sdk.component.DSW.Sg YFl2 = tN.YFl();
        if (YFl2 == null) {
            return null;
        }
        try {
            if (!YFl2.vc()) {
                return null;
            }
            String AlY = YFl2.AlY();
            yFl = com.bytedance.sdk.component.adexpress.YFl.tN.YFl.AlY(AlY);
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tpl_fetch_model", "model", AlY);
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tpl_fetch_model", "last_url", lu);
            return yFl;
        } catch (Exception unused2) {
            return yFl;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public void YFl(String str) {
        com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
        tN.Sg(str);
        tN.YFl("upload_bidding");
        tN.YFl(7);
        tN.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.aIu.10
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                sg2.AlY();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.qO
    public void YFl(JSONObject jSONObject, String str) {
        com.bytedance.sdk.component.DSW.Sg.AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        Sg2.Sg(str);
        Sg2.YFl(jSONObject);
        Sg2.YFl(5);
        Sg2.YFl("apm_pv");
        Sg2.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.aIu.2
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                sg2.AlY();
            }
        });
    }
}
