package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.QR.zp.lMd;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private static FilterWord COT(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    FilterWord COT = COT(optJSONArray.optJSONObject(i9));
                    if (COT != null && COT.isValid()) {
                        filterWord.addOption(COT);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.KS HWF(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.KS ks = new com.bytedance.sdk.openadsdk.core.model.KS();
        ks.lMd(jSONObject.optString("app_name"));
        ks.KS(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        ks.zp(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        ks.zp(jSONObject.optDouble("score", -1.0d));
        ks.zp(jSONObject.optInt("comment_num", -1));
        ks.lMd(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        ks.jU(jSONObject.optString("app_category"));
        return ks;
    }

    private static com.bytedance.sdk.openadsdk.core.model.jU KS(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long j7 = 0;
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        if (optLong >= 0) {
            j7 = optLong;
        }
        com.bytedance.sdk.openadsdk.core.model.jU jUVar = new com.bytedance.sdk.openadsdk.core.model.jU();
        jUVar.zp(optInt);
        jUVar.lMd(optInt2);
        jUVar.zp(j7);
        return jUVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.KVG QR(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.KVG kvg = new com.bytedance.sdk.openadsdk.core.model.KVG();
        if (jSONObject == null) {
            kvg.zp(10L);
            kvg.lMd(20L);
            kvg.KS(10L);
            kvg.jU(20L);
            kvg.zp("");
            return kvg;
        }
        kvg.zp(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        kvg.lMd(jSONObject.optLong("straight_lp_showtime", 20L));
        kvg.KS(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        kvg.jU(jSONObject.optLong("straight_agg_showtime", 20L));
        kvg.zp(jSONObject.optString("loading_text", ""));
        return kvg;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.dT YW(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.dT dTVar = new com.bytedance.sdk.openadsdk.core.model.dT();
        dTVar.zp(jSONObject.optString("deeplink_url"));
        dTVar.lMd(jSONObject.optString("fallback_url"));
        dTVar.zp(jSONObject.optInt("fallback_type"));
        return dTVar;
    }

    private static Map<String, Object> dT(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, jSONObject.opt(next));
            }
        }
        return hashMap;
    }

    private static AdSlot jU(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("mCodeId", "");
        int optInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float optDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float optDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int optInt3 = jSONObject.optInt("mAdCount", 6);
        boolean optBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String optString2 = jSONObject.optString("mRewardName", "");
        int optInt4 = jSONObject.optInt("mRewardAmount", 0);
        String optString3 = jSONObject.optString("mMediaExtra", "");
        String optString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int optInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean optBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean optBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String optString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(optString).setImageAcceptedSize(optInt, optInt2).setExpressViewAcceptedSize(optDouble, optDouble2).setAdCount(optInt3).setSupportDeepLink(optBoolean).setRewardName(optString2).setRewardAmount(optInt4).setMediaExtra(optString3).setUserID(optString4).setNativeAdType(optInt5).setIsAutoPlay(optBoolean2).isExpressAd(optBoolean3).withBid(optString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.Bj ku(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.Bj bj = new com.bytedance.sdk.openadsdk.core.model.Bj();
        bj.zp(jSONObject.optInt("if_send_click", 0));
        return bj;
    }

    private static com.bytedance.sdk.openadsdk.core.ugen.COT.zp lMd(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.ugen.COT.zp zpVar = new com.bytedance.sdk.openadsdk.core.ugen.COT.zp();
        zpVar.zp(jSONObject.optString("id"));
        zpVar.lMd(jSONObject.optString("md5"));
        zpVar.KS(jSONObject.optString("url"));
        return zpVar;
    }

    private static boolean zp(int i9) {
        return i9 == 2 || i9 == 3 || i9 == 8;
    }

    @Nullable
    public static Pair<com.bytedance.sdk.openadsdk.core.model.zp, ArrayList<Integer>> zp(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pvr pvrVar, com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.zp zpVar = new com.bytedance.sdk.openadsdk.core.model.zp();
            zpVar.zp(jSONObject.optString("request_id"));
            zpVar.zp(jSONObject.optInt("ret"));
            zpVar.lMd(jSONObject.optString("message"));
            String optString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                zpVar.zp(jSONObject.optJSONObject("choose_ui_data"));
                zpVar.zp(true);
            }
            String optString2 = jSONObject.optString("auction_price");
            if (zpVar.lMd() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                while (i9 < optJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.woN zp = zp(optJSONArray.optJSONObject(i9), adSlot, pvrVar);
                    int zp2 = zp(zp);
                    if (zp2 != 200) {
                        arrayList.add(Integer.valueOf(zp2));
                    } else {
                        zp.YW(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            zp.Lij(optString);
                        }
                        zpVar.zp(zp);
                    }
                    i9++;
                }
                i9 = length;
            }
            zp(i9, zpVar, (ArrayList<Integer>) arrayList, lmd);
            return new Pair<>(zpVar, arrayList);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AdInfoFactory", th.getMessage());
            return null;
        }
    }

    private static boolean lMd(com.bytedance.sdk.openadsdk.core.model.woN won) {
        return (won.Fm() || won.zR()) ? false : true;
    }

    private static void zp(int i9, final com.bytedance.sdk.openadsdk.core.model.zp zpVar, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.lMd lmd) {
        if (zpVar == null || i9 < 2) {
            return;
        }
        final int size = i9 - (zpVar.KS() != null ? zpVar.KS().size() : 0);
        final boolean z8 = zpVar.QR() && zpVar.ku() == null;
        if (size > 0 || z8) {
            com.bytedance.sdk.openadsdk.dT.KS.zp();
            com.bytedance.sdk.openadsdk.dT.KS.zp("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.core.lMd.1
                @Override // com.bytedance.sdk.openadsdk.dT.lMd
                public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.core.model.zp.this.zp());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z8 ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.lMd lmd2 = lmd;
                    if (lmd2 != null) {
                        jSONObject.put("server_res_str", lmd2.zp());
                    }
                    return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("choose_ad_parsing_error").lMd(jSONObject.toString());
                }
            });
        }
    }

    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.woN zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return zp(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.pvr) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0595, code lost:
    
        if (r13.optBoolean("is_html", false) != false) goto L148;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bytedance.sdk.openadsdk.core.model.woN zp(org.json.JSONObject r13, com.bytedance.sdk.openadsdk.AdSlot r14, com.bytedance.sdk.openadsdk.core.model.pvr r15) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lMd.zp(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.pvr):com.bytedance.sdk.openadsdk.core.model.woN");
    }

    private static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void zp(final com.bytedance.sdk.openadsdk.core.model.woN won, final String str, final com.bytedance.sdk.openadsdk.core.QR.zp zpVar, final long j7, final lMd.zp zpVar2) {
        com.bytedance.sdk.openadsdk.lMd.KS.zp(new com.bytedance.sdk.component.ku.ku("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.lMd.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.QR.zp zpVar3 = zpVar;
                    String str2 = "load_vast_fail";
                    if (zpVar3 != null) {
                        if (!TextUtils.isEmpty(zpVar3.YW()) && !TextUtils.isEmpty(zpVar.HWF()) && zpVar.ku() > 0.0d) {
                            jSONObject.put("duration", System.currentTimeMillis() - j7);
                            lMd.zp zpVar4 = zpVar2;
                            if (zpVar4 != null) {
                                jSONObject.put("wrapper_count", zpVar4.lMd);
                                jSONObject.put("impression_links_null", zpVar2.KS);
                            }
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("reason_code", -3);
                        jSONObject.put("error_code", -3);
                    } else {
                        jSONObject.put("reason_code", -2);
                        lMd.zp zpVar5 = zpVar2;
                        if (zpVar5 != null) {
                            jSONObject.put("error_code", zpVar5.zp);
                        }
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.QR.zp zpVar6 = zpVar;
                    if (zpVar6 != null && zpVar6.lMd() != null && TextUtils.isEmpty(zpVar.lMd().HWF())) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("error_code", 1000);
                            jSONObject2.put("description", "1000:Image url is null");
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str, "load_vast_icon_fail", jSONObject2);
                        zpVar.zp((com.bytedance.sdk.openadsdk.core.QR.lMd) null);
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.QR.zp, lMd.zp> zp(String str, int i9, int i10) {
        int i11;
        int i12;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i10 == 1 || i10 == 5) {
            i11 = 0;
            i12 = 0;
        } else {
            i11 = WNy.KS(KVG.zp());
            i12 = WNy.jU(KVG.zp());
            if (i9 == 2) {
                i12 = i11;
                i11 = i12;
            }
        }
        com.bytedance.sdk.openadsdk.core.QR.zp.zp.COT cot = new com.bytedance.sdk.openadsdk.core.QR.zp.zp.COT(KVG.zp(), i11, i12);
        return new Pair<>(cot.zp(str, new ArrayList()), cot.HWF);
    }

    private static void zp(com.bytedance.sdk.openadsdk.core.QR.zp zpVar, com.bytedance.sdk.openadsdk.core.model.woN won) {
        zpVar.zp(won);
        if (!zp(won.oKZ())) {
            won.vwr(2);
        }
        won.jU(1);
        won.zp(zpVar);
        if (!TextUtils.isEmpty(zpVar.jU())) {
            won.dQp(zpVar.jU());
        }
        if (!TextUtils.isEmpty(zpVar.COT())) {
            won.KVG(zpVar.COT());
        }
        won.tG(zpVar.HWF());
        won.zp((com.bytedance.sdk.openadsdk.core.model.KS) null);
        com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
        if (eWG == null) {
            eWG = new com.bykv.vk.openvk.component.video.api.KS.lMd();
        }
        eWG.KS(zpVar.QR());
        eWG.zp(zpVar.ku());
        eWG.HWF((String) null);
        eWG.lMd((String) null);
        eWG.jU((String) null);
        won.zp(eWG);
        if (zpVar.lMd() != null && !TextUtils.isEmpty(zpVar.lMd().COT())) {
            com.bytedance.sdk.openadsdk.core.model.rV rVVar = new com.bytedance.sdk.openadsdk.core.model.rV();
            rVVar.zp(zpVar.lMd().COT());
            rVVar.zp(zpVar.lMd().lMd());
            rVVar.lMd(zpVar.lMd().KS());
            won.zp(rVVar);
            return;
        }
        if (won.BO() == null) {
            com.bytedance.sdk.openadsdk.core.model.rV rVVar2 = new com.bytedance.sdk.openadsdk.core.model.rV();
            rVVar2.zp("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            rVVar2.zp(98);
            rVVar2.lMd(98);
            won.zp(rVVar2);
        }
    }

    @Nullable
    private static com.bykv.vk.openvk.component.video.api.KS.lMd zp(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.woN won, boolean z8) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        com.bykv.vk.openvk.component.video.api.KS.lMd lmd = new com.bykv.vk.openvk.component.video.api.KS.lMd();
        lmd.lMd(jSONObject.optInt("cover_height"));
        lmd.KS(jSONObject.optInt("cover_width"));
        lmd.zp(jSONObject.optString("resolution"));
        lmd.zp(jSONObject.optLong("size"));
        double optDouble = jSONObject.optDouble("video_duration", 0.0d);
        lmd.zp(optDouble);
        int i9 = 1;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble <= 15.0d && won.cz() != 1 && com.bytedance.sdk.openadsdk.core.model.woN.COT(won)) {
            i9 = optInt2;
        }
        lmd.dT(i9);
        lmd.lMd(jSONObject.optString("cover_url"));
        lmd.KS(jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL));
        lmd.jU(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        lmd.COT(jSONObject.optString("playable_download_url"));
        lmd.HWF(jSONObject.optString("file_hash"));
        lmd.ku(jSONObject.optInt("if_playable_loading_show", 0));
        lmd.YW(jSONObject.optInt("remove_loading_page_type", 0));
        lmd.zp(jSONObject.optInt("fallback_endcard_judge", 0));
        lmd.COT(jSONObject.optInt("video_preload_size", 307200));
        lmd.HWF(jSONObject.optInt("reward_video_cached_type", 0));
        lmd.QR(jSONObject.optInt("execute_cached_type", 0));
        if (z8) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        lmd.jU(optInt);
        return lmd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0 != 8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r0 != 50) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int zp(com.bytedance.sdk.openadsdk.core.model.woN r7) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            if (r7 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r7.fgJ()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ldb
            java.lang.String r1 = r7.fgJ()
            int r1 = r1.length()
            r2 = 1
            if (r1 > r2) goto L1c
            goto Ldb
        L1c:
            int r1 = r7.que()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L2f
            com.bytedance.sdk.openadsdk.core.model.dT r1 = r7.fs()
            int r1 = zp(r1)
            if (r1 == r2) goto L30
            return r1
        L2f:
            r1 = r2
        L30:
            boolean r3 = r7.zR()
            if (r3 == 0) goto L71
            int r3 = r7.WJ()
            if (r3 >= 0) goto L4f
            com.bytedance.sdk.openadsdk.AdSlot r3 = r7.QUv()
            if (r3 == 0) goto L4b
            com.bytedance.sdk.openadsdk.AdSlot r3 = r7.QUv()
            int r3 = r3.getDurationSlotType()
            goto L4f
        L4b:
            int r3 = r7.Dp()
        L4f:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.utils.YhE.KS(r3)
            boolean r4 = r7.slc()
            if (r4 == 0) goto L5b
            java.lang.String r3 = "fullscreen_interstitial_ad"
        L5b:
            java.lang.String r4 = r7.HaA()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 0
            if (r4 == 0) goto L6c
            java.lang.String r1 = "load_html_fail"
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(r7, r3, r1, r5)
            return r0
        L6c:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(r7, r3, r0, r5)
        L71:
            int r0 = r7.oKZ()
            r3 = 4
            r4 = 3
            r5 = 2
            if (r0 == r5) goto L8e
            if (r0 == r4) goto L8e
            if (r0 == r3) goto L83
            r6 = 8
            if (r0 == r6) goto L8e
            goto La1
        L83:
            com.bytedance.sdk.openadsdk.core.model.KS r0 = r7.Vjb()
            int r1 = zp(r0)
            if (r1 == r2) goto La1
            return r1
        L8e:
            boolean r0 = lMd(r7)
            if (r0 == 0) goto La1
            java.lang.String r0 = r7.aax()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La1
            r7 = 406(0x196, float:5.69E-43)
            return r7
        La1:
            boolean r0 = r7.Fm()
            if (r0 != 0) goto Lda
            int r0 = r7.mW()
            if (r0 == r5) goto Ld0
            if (r0 == r4) goto Ld0
            if (r0 == r3) goto Ld0
            r3 = 5
            if (r0 == r3) goto Lc1
            r3 = 15
            if (r0 == r3) goto Lc1
            r3 = 16
            if (r0 == r3) goto Ld0
            r3 = 50
            if (r0 == r3) goto Lc1
            goto Lda
        Lc1:
            com.bykv.vk.openvk.component.video.api.KS.lMd r0 = r7.eWG()
            boolean r7 = r7.Fm()
            int r1 = zp(r0, r7)
            if (r1 == r2) goto Lda
            return r1
        Ld0:
            java.util.List r7 = r7.Rg()
            int r1 = zp(r7)
            if (r1 == r2) goto Lda
        Lda:
            return r1
        Ldb:
            r7 = 402(0x192, float:5.63E-43)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lMd.zp(com.bytedance.sdk.openadsdk.core.model.woN):int");
    }

    private static int zp(com.bytedance.sdk.openadsdk.core.model.dT dTVar) {
        if (dTVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(dTVar.zp())) {
            return 403;
        }
        if (TextUtils.isEmpty(dTVar.lMd())) {
            return 404;
        }
        return (dTVar.KS() == 1 || dTVar.KS() == 2) ? 200 : 405;
    }

    private static int zp(com.bykv.vk.openvk.component.video.api.KS.lMd lmd, boolean z8) {
        if (lmd == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(lmd.Bj())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z8 || !TextUtils.isEmpty(lmd.dT())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int zp(com.bytedance.sdk.openadsdk.core.model.KS ks) {
        if (ks == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(ks.zp())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        return 200;
    }

    private static int zp(List<com.bytedance.sdk.openadsdk.core.model.rV> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.rV rVVar : list) {
            if (rVVar == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(rVVar.zp())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }
}
