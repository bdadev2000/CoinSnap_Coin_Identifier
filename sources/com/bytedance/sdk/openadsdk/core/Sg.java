package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.YoT.YFl.Sg;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.a;

/* loaded from: classes.dex */
public class Sg {

    /* loaded from: classes.dex */
    public static class YFl {
        public int Sg;
        public String YFl;

        public YFl(String str, int i10) {
            this.YFl = str;
            this.Sg = i10;
        }
    }

    private static AdSlot AlY(JSONObject jSONObject) {
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
    private static com.bytedance.sdk.openadsdk.core.model.lG DSW(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.lG lGVar = new com.bytedance.sdk.openadsdk.core.model.lG();
        if (jSONObject == null) {
            lGVar.YFl(10L);
            lGVar.Sg(20L);
            lGVar.tN(10L);
            lGVar.AlY(20L);
            lGVar.YFl("");
            return lGVar;
        }
        lGVar.YFl(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        lGVar.Sg(jSONObject.optLong("straight_lp_showtime", 20L));
        lGVar.tN(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        lGVar.AlY(jSONObject.optLong("straight_agg_showtime", 20L));
        lGVar.YFl(jSONObject.optString("loading_text", ""));
        return lGVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.YoT NjR(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.YoT yoT = new com.bytedance.sdk.openadsdk.core.model.YoT();
        yoT.YFl(jSONObject.optInt("if_send_click", 0));
        return yoT;
    }

    private static com.bytedance.sdk.openadsdk.core.eT.vc.YFl Sg(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.eT.vc.YFl yFl = new com.bytedance.sdk.openadsdk.core.eT.vc.YFl();
        yFl.YFl(jSONObject.optString("id"));
        yFl.Sg(jSONObject.optString("md5"));
        yFl.tN(jSONObject.optString("url"));
        return yFl;
    }

    private static boolean YFl(int i10) {
        return i10 == 2 || i10 == 3 || i10 == 8;
    }

    private static Map<String, Object> eT(JSONObject jSONObject) {
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

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.eT nc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.eT eTVar = new com.bytedance.sdk.openadsdk.core.model.eT();
        eTVar.YFl(jSONObject.optString("deeplink_url"));
        eTVar.Sg(jSONObject.optString("fallback_url"));
        eTVar.YFl(jSONObject.optInt("fallback_type"));
        return eTVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.wN qsH(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.wN wNVar = new com.bytedance.sdk.openadsdk.core.model.wN();
        if (jSONObject == null) {
            wNVar.tN(0);
            wNVar.AlY(0);
            wNVar.Sg(new ArrayList());
            wNVar.wN(0);
            wNVar.YFl(new ArrayList());
            wNVar.Sg(0);
            wNVar.YFl(0);
            return wNVar;
        }
        wNVar.tN(jSONObject.optInt("interceptor_x", 0));
        wNVar.AlY(jSONObject.optInt("interceptor_y", 0));
        JSONArray optJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(optJSONArray.optInt(i10)));
            }
        }
        wNVar.Sg(arrayList);
        wNVar.wN(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                arrayList2.add(optJSONArray2.optString(i11));
            }
        }
        wNVar.YFl(arrayList2);
        wNVar.Sg(jSONObject.optInt("boc_index", 0));
        wNVar.YFl(jSONObject.optInt("is_act", 0));
        return wNVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.AlY tN(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("splash_clickarea", 2);
        int optInt2 = jSONObject.optInt("splash_layout_id", 1);
        long optLong = jSONObject.optLong("load_wait_time", 0L);
        long j3 = optLong >= 0 ? optLong : 0L;
        com.bytedance.sdk.openadsdk.core.model.AlY alY = new com.bytedance.sdk.openadsdk.core.model.AlY();
        alY.YFl(optInt);
        alY.Sg(optInt2);
        alY.YFl(j3);
        return alY;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.tN vc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.tN tNVar = new com.bytedance.sdk.openadsdk.core.model.tN();
        tNVar.Sg(jSONObject.optString("app_name"));
        tNVar.tN(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        tNVar.YFl(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        tNVar.YFl(jSONObject.optDouble("score", -1.0d));
        tNVar.YFl(jSONObject.optInt("comment_num", -1));
        tNVar.Sg(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        tNVar.AlY(jSONObject.optString("app_category"));
        return tNVar;
    }

    private static FilterWord wN(JSONObject jSONObject) {
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
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    FilterWord wN = wN(optJSONArray.optJSONObject(i10));
                    if (wN != null && wN.isValid()) {
                        filterWord.addOption(wN);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Pair<com.bytedance.sdk.openadsdk.core.model.YFl, ArrayList<Integer>> YFl(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.aIu aiu, com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
        com.bytedance.sdk.openadsdk.core.model.Sg sg3;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.YFl yFl = new com.bytedance.sdk.openadsdk.core.model.YFl();
            yFl.YFl(jSONObject.optString("request_id"));
            yFl.YFl(jSONObject.optInt("ret"));
            int i10 = 0;
            yFl.Sg(jSONObject.optInt("multi_ad_style", 0));
            yFl.Sg(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String optString = jSONObject.optString("gdid_encrypted");
            if (jSONObject.has("choose_ui_data")) {
                yFl.YFl(jSONObject.optJSONObject("choose_ui_data"));
                yFl.YFl(true);
            }
            String optString2 = jSONObject.optString("auction_price");
            if (yFl.Sg() != 0) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = yFl.eT() ? new ArrayList() : null;
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    com.bytedance.sdk.openadsdk.core.model.Wwa YFl2 = YFl(optJSONArray.optJSONObject(i11), adSlot, aiu);
                    if (YFl2 != null && yFl.eT()) {
                        if (YFl2.rkt() == 30) {
                            YFl2.NjR(true);
                        } else {
                            yFl.Sg(0);
                            arrayList2 = null;
                        }
                    }
                    int YFl3 = YFl(YFl2);
                    if (YFl3 != 200) {
                        if (YFl2 != null) {
                            com.bytedance.sdk.openadsdk.AlY.tN.Sg(YFl2, Sco.tN(YFl2.JGG()), YFl3);
                        } else {
                            com.bytedance.sdk.openadsdk.AlY.tN.Sg((com.bytedance.sdk.openadsdk.core.model.Wwa) null, "", YFl3);
                        }
                        arrayList.add(Integer.valueOf(YFl3));
                        if (arrayList2 != null && YFl2 != null) {
                            arrayList2.add(new YFl(YFl2.kYz(), YFl3));
                        }
                    } else {
                        YFl2.NjR(optString2);
                        if (!TextUtils.isEmpty(optString)) {
                            YFl2.YI(optString);
                        }
                        yFl.YFl(YFl2);
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    YFl((ArrayList<YFl>) arrayList2);
                }
                sg3 = sg2;
                i10 = length;
            } else {
                sg3 = sg2;
            }
            YFl(i10, yFl, (ArrayList<Integer>) arrayList, sg3);
            return new Pair<>(yFl, arrayList);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.AdInfoFactory", th2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r3 != 8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int Sg(com.bytedance.sdk.openadsdk.core.model.Wwa r8) {
        /*
            int r0 = r8.JGG()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.Sco.tN(r0)
            int r1 = r8.Ja()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1c
            com.bytedance.sdk.openadsdk.core.model.eT r1 = r8.Bn()
            int r1 = YFl(r1)
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            int r3 = r8.ko()
            r4 = 2
            r5 = 406(0x196, float:5.69E-43)
            r6 = 407(0x197, float:5.7E-43)
            r7 = 417(0x1a1, float:5.84E-43)
            if (r3 == r4) goto L79
            r4 = 3
            if (r3 == r4) goto L79
            r4 = 4
            if (r3 == r4) goto L35
            r4 = 8
            if (r3 == r4) goto L79
            goto L8d
        L35:
            com.bytedance.sdk.openadsdk.core.model.tN r3 = r8.in()
            if (r3 != 0) goto L40
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r6)
            r1 = r6
            goto L8d
        L40:
            java.lang.String r4 = r3.tN()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            java.lang.String r4 = r3.YFl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r7)
            r1 = r7
            goto L8d
        L59:
            java.lang.String r4 = r3.tN()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L69
            r1 = 416(0x1a0, float:5.83E-43)
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r1)
            goto L8d
        L69:
            java.lang.String r3 = r3.YFl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            r1 = 408(0x198, float:5.72E-43)
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r1)
            goto L8d
        L79:
            boolean r3 = AlY(r8)
            if (r3 == 0) goto L8d
            java.lang.String r3 = r8.Cqy()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r8, r0, r5)
            r1 = r5
        L8d:
            if (r1 == r7) goto L9a
            if (r1 == r6) goto L9a
            if (r1 != r5) goto L94
            goto L9a
        L94:
            if (r1 == r2) goto L99
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(r8, r0, r1)
        L99:
            return r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Sg.Sg(com.bytedance.sdk.openadsdk.core.model.Wwa):int");
    }

    private static int tN(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        int i10;
        String tN = Sco.tN(wwa.JGG());
        if (wwa.Ja() == 0) {
            i10 = YFl(wwa.Bn());
            if (i10 != 200) {
                com.bytedance.sdk.openadsdk.AlY.tN.tN(wwa, tN, i10);
                return i10;
            }
        } else {
            i10 = 200;
        }
        int ko = wwa.ko();
        if (ko != 2 && ko != 3) {
            if (ko == 4) {
                int YFl2 = YFl(wwa.in());
                if (YFl2 == 200) {
                    return YFl2;
                }
                com.bytedance.sdk.openadsdk.AlY.tN.tN(wwa, tN, YFl2);
                return YFl2;
            }
            if (ko != 8) {
                return i10;
            }
        }
        if (!AlY(wwa) || !TextUtils.isEmpty(wwa.Cqy())) {
            return i10;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.tN(wwa, tN, 406);
        return 406;
    }

    private static boolean AlY(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        return (wwa.yn() || wwa.ZS()) ? false : true;
    }

    private static void YFl(int i10, final com.bytedance.sdk.openadsdk.core.model.YFl yFl, final ArrayList<Integer> arrayList, final com.bytedance.sdk.openadsdk.core.model.Sg sg2) {
        if (yFl == null || i10 < 2 || !yFl.DSW()) {
            return;
        }
        final int size = i10 - (yFl.tN() != null ? yFl.tN().size() : 0);
        final boolean z10 = yFl.qsH() == null;
        if (size > 0 || z10) {
            com.bytedance.sdk.openadsdk.pDU.tN.YFl();
            com.bytedance.sdk.openadsdk.pDU.tN.YFl("choose_ad_parsing_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.Sg.1
                @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", com.bytedance.sdk.openadsdk.core.model.YFl.this.YFl());
                    jSONObject.put("material_error", size);
                    jSONObject.put("choose_ui_error", z10 ? 1 : 0);
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) arrayList).toString());
                    }
                    com.bytedance.sdk.openadsdk.core.model.Sg sg3 = sg2;
                    if (sg3 != null) {
                        jSONObject.put("server_res_str", sg3.YFl());
                    }
                    return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("choose_ad_parsing_error").Sg(jSONObject.toString());
                }
            });
        }
    }

    private static int YFl(a aVar, boolean z10) {
        if (aVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(aVar.f23462g)) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(aVar.f23461f)) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.Wwa YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return YFl(jSONObject, (AdSlot) null, (com.bytedance.sdk.openadsdk.core.model.aIu) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x05ab, code lost:
    
        if (r13.optBoolean("is_html", false) != false) goto L141;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.bytedance.sdk.openadsdk.core.model.Wwa YFl(org.json.JSONObject r13, com.bytedance.sdk.openadsdk.AdSlot r14, com.bytedance.sdk.openadsdk.core.model.aIu r15) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Sg.YFl(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.aIu):com.bytedance.sdk.openadsdk.core.model.Wwa");
    }

    private static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void YFl(final com.bytedance.sdk.openadsdk.core.model.Wwa wwa, final String str, final com.bytedance.sdk.openadsdk.core.YoT.YFl yFl, final long j3, final Sg.YFl yFl2) {
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("vast_parser") { // from class: com.bytedance.sdk.openadsdk.core.Sg.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    com.bytedance.sdk.openadsdk.core.YoT.YFl yFl3 = yFl;
                    String str2 = "load_vast_fail";
                    if (yFl3 != null) {
                        if (!TextUtils.isEmpty(yFl3.NjR()) && !TextUtils.isEmpty(yFl.vc()) && yFl.qsH() > 0.0d) {
                            jSONObject.put("duration", System.currentTimeMillis() - j3);
                            Sg.YFl yFl4 = yFl2;
                            if (yFl4 != null) {
                                jSONObject.put("wrapper_count", yFl4.Sg);
                                jSONObject.put("impression_links_null", yFl2.tN);
                            }
                            str2 = "load_vast_success";
                        }
                        jSONObject.put("reason_code", -3);
                        jSONObject.put("error_code", -3);
                    } else {
                        jSONObject.put("reason_code", -2);
                        Sg.YFl yFl5 = yFl2;
                        if (yFl5 != null) {
                            jSONObject.put("error_code", yFl5.YFl);
                        }
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.YoT.YFl yFl6 = yFl;
                    if (yFl6 != null && yFl6.Sg() != null && TextUtils.isEmpty(yFl.Sg().vc())) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("error_code", 1000);
                            jSONObject2.put("description", "1000:Image url is null");
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str, "load_vast_icon_fail", jSONObject2);
                        yFl.YFl((com.bytedance.sdk.openadsdk.core.YoT.Sg) null);
                    }
                } catch (Exception unused2) {
                }
            }
        });
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.YoT.YFl, Sg.YFl> YFl(String str, int i10, int i11) {
        int i12;
        int i13;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i11 == 1 || i11 == 5) {
            i12 = 0;
            i13 = 0;
        } else {
            i12 = GS.tN(lG.YFl());
            i13 = GS.AlY(lG.YFl());
            if (i10 == 2) {
                i13 = i12;
                i12 = i13;
            }
        }
        com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.wN(lG.YFl(), i12, i13);
        return new Pair<>(wNVar.YFl(str, new ArrayList()), wNVar.f10656vc);
    }

    private static void YFl(com.bytedance.sdk.openadsdk.core.YoT.YFl yFl, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        yFl.YFl(wwa);
        if (!YFl(wwa.ko())) {
            wwa.qO(2);
        }
        wwa.AlY(1);
        wwa.YFl(yFl);
        if (!TextUtils.isEmpty(yFl.AlY())) {
            wwa.EH(yFl.AlY());
        }
        if (!TextUtils.isEmpty(yFl.wN())) {
            wwa.rkt(yFl.wN());
        }
        wwa.GA(yFl.vc());
        wwa.YFl((com.bytedance.sdk.openadsdk.core.model.tN) null);
        a BPI = wwa.BPI();
        if (BPI == null) {
            BPI = new a();
        }
        BPI.f23462g = yFl.DSW();
        BPI.f23459d = yFl.qsH();
        BPI.f23465j = null;
        BPI.f23461f = null;
        BPI.f23463h = null;
        wwa.YFl(BPI);
        if (yFl.Sg() != null && !TextUtils.isEmpty(yFl.Sg().wN())) {
            com.bytedance.sdk.openadsdk.core.model.EH eh2 = new com.bytedance.sdk.openadsdk.core.model.EH();
            eh2.YFl(yFl.Sg().wN());
            eh2.YFl(yFl.Sg().Sg());
            eh2.Sg(yFl.Sg().tN());
            wwa.YFl(eh2);
            return;
        }
        if (wwa.dGX() == null) {
            com.bytedance.sdk.openadsdk.core.model.EH eh3 = new com.bytedance.sdk.openadsdk.core.model.EH();
            eh3.YFl("https://sf16-fe-tos-sg.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/2023620white.jpeg");
            eh3.YFl(98);
            eh3.Sg(98);
            wwa.YFl(eh3);
        }
    }

    @Nullable
    private static a YFl(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, boolean z10) {
        int optInt;
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.a = jSONObject.optInt("cover_height");
        aVar.f23457b = jSONObject.optInt("cover_width");
        aVar.f23460e = jSONObject.optString("resolution");
        aVar.f23458c = jSONObject.optLong("size");
        double optDouble = jSONObject.optDouble("video_duration", 0.0d);
        aVar.f23459d = optDouble;
        int optInt2 = jSONObject.optInt("replay_time", 1);
        if (optDouble > 15.0d || wwa.Ne() == 1 || !com.bytedance.sdk.openadsdk.core.model.Wwa.wN(wwa)) {
            optInt2 = 1;
        }
        aVar.f23473r = Math.min(4, Math.max(1, optInt2));
        aVar.f23461f = jSONObject.optString("cover_url");
        aVar.f23462g = jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL);
        aVar.f23463h = jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        aVar.f23464i = jSONObject.optString("playable_download_url");
        aVar.f23465j = jSONObject.optString("file_hash");
        aVar.f23468m = jSONObject.optInt("if_playable_loading_show", 0);
        aVar.f23469n = jSONObject.optInt("remove_loading_page_type", 0);
        aVar.f23466k = jSONObject.optInt("fallback_endcard_judge", 0);
        aVar.f23472q = jSONObject.optInt("video_preload_size", 307200);
        aVar.f23470o = jSONObject.optInt("reward_video_cached_type", 0);
        aVar.f23471p = jSONObject.optInt("execute_cached_type", 0);
        if (z10) {
            optInt = jSONObject.optInt("endcard_render", 0);
        } else {
            optInt = jSONObject.optInt("endcard_render", -1);
        }
        aVar.f23467l = optInt;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        if (r0 != 50) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int YFl(com.bytedance.sdk.openadsdk.core.model.Wwa r5) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r1, r5, r0)
            return r0
        Lb:
            int r2 = r5.JGG()
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.Sco.tN(r2)
            java.lang.String r3 = r5.zz()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lbd
            java.lang.String r3 = r5.zz()
            int r3 = r3.length()
            r4 = 1
            if (r3 > r4) goto L2a
            goto Lbd
        L2a:
            boolean r3 = r5.ZS()
            if (r3 == 0) goto L64
            int r3 = r5.JGG()
            if (r3 >= 0) goto L47
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.pq()
            if (r3 == 0) goto L44
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.pq()
            r3.getDurationSlotType()
            goto L47
        L44:
            r5.Uv()
        L47:
            boolean r3 = r5.Pj()
            if (r3 == 0) goto L4f
            java.lang.String r2 = "fullscreen_interstitial_ad"
        L4f:
            java.lang.String r3 = r5.PT()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "load_html_fail"
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(r5, r2, r3, r1)
            return r0
        L5f:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(r5, r2, r0, r1)
        L64:
            int r0 = r5.Ja()
            if (r0 != 0) goto La9
            int r0 = r5.ZLB()
            r1 = 2
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L9b
            r1 = 3
            if (r0 == r1) goto L9b
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 5
            if (r0 == r1) goto L89
            r1 = 15
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L9b
            r1 = 50
            if (r0 == r1) goto L89
            goto La9
        L89:
            p5.a r0 = r5.BPI()
            boolean r1 = r5.yn()
            int r0 = YFl(r0, r1)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r5, r2, r0)
            return r0
        L9b:
            java.util.List r0 = r5.VB()
            int r0 = YFl(r0)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r5, r2, r0)
            return r0
        La9:
            com.bytedance.sdk.openadsdk.core.settings.vc r0 = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO()
            boolean r0 = r0.yn()
            if (r0 == 0) goto Lb8
            int r5 = tN(r5)
            goto Lbc
        Lb8:
            int r5 = Sg(r5)
        Lbc:
            return r5
        Lbd:
            r0 = 402(0x192, float:5.63E-43)
            com.bytedance.sdk.openadsdk.AlY.tN.tN(r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.Sg.YFl(com.bytedance.sdk.openadsdk.core.model.Wwa):int");
    }

    private static int YFl(com.bytedance.sdk.openadsdk.core.model.eT eTVar) {
        if (eTVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(eTVar.YFl())) {
            return 403;
        }
        if (TextUtils.isEmpty(eTVar.Sg())) {
            return 404;
        }
        return (eTVar.tN() == 1 || eTVar.tN() == 2) ? 200 : 405;
    }

    private static int YFl(com.bytedance.sdk.openadsdk.core.model.tN tNVar) {
        if (tNVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(tNVar.YFl())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        if (TextUtils.isEmpty(tNVar.tN())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int YFl(List<com.bytedance.sdk.openadsdk.core.model.EH> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.EH eh2 : list) {
            if (eh2 == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(eh2.YFl())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void YFl(final ArrayList<YFl> arrayList) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.Sg.3
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    YFl yFl = (YFl) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, yFl.YFl);
                    jSONObject2.put("error_msg", yFl.Sg);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("multiple_ads_parsing_error").Sg(jSONObject.toString());
            }
        });
    }
}
