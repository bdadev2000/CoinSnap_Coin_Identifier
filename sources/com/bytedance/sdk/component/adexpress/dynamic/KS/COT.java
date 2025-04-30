package com.bytedance.sdk.component.adexpress.dynamic.KS;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class COT {
    public static final Map<String, Integer> zp;
    private HWF COT;
    private String HWF;
    private String KS;
    private HWF jU;
    private String lMd;

    static {
        HashMap hashMap = new HashMap();
        zp = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put(CampaignEx.JSON_KEY_TITLE, 0);
        hashMap.put("subtitle", 0);
        hashMap.put("source", 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        o.y(hashMap, MimeTypes.BASE_TYPE_TEXT, 0, 17, "tag-group");
        hashMap.put("app-version", 0);
        o.y(hashMap, "development-name", 0, 23, "privacy-detail");
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        o.y(hashMap, "icon-download", 1, 4, "logoad");
        o.t(5, hashMap, "logounion", 9, "logo-union");
        hashMap.put("dislike", 3);
        hashMap.put("close", 3);
        hashMap.put("close-fill", 3);
        o.t(22, hashMap, "webview-close", 12, "feedback-dislike");
        hashMap.put("button", 2);
        hashMap.put("downloadWithIcon", 2);
        hashMap.put("downloadButton", 2);
        hashMap.put("fillButton", 2);
        hashMap.put("laceButton", 2);
        hashMap.put("cardButton", 2);
        hashMap.put("colourMixtureButton", 2);
        hashMap.put("arrowButton", 1);
        hashMap.put("download-progress-button", 2);
        hashMap.put("vessel", 6);
        hashMap.put("image-group", 6);
        o.y(hashMap, "custom-component-vessel", 6, 24, "carousel");
        o.t(26, hashMap, "carousel-vessel", 25, "leisure-interact");
        hashMap.put("video-hd", 7);
        hashMap.put(MimeTypes.BASE_TYPE_VIDEO, 7);
        hashMap.put("video-vd", 7);
        o.y(hashMap, "video-sq", 7, 10, "muted");
        o.t(11, hashMap, "star", 19, "skip-countdowns");
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        o.t(20, hashMap, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        o.y(hashMap, "skip-with-time-countdown", 13, 15, "skip-with-time-skip-btn");
        hashMap.put("skip", 27);
        hashMap.put("timedown", 13);
        hashMap.put(RewardPlus.ICON, 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        o.y(hashMap, "score-count-type-2", 0, 28, "lottie");
    }

    public HWF COT() {
        return this.jU;
    }

    public int HWF() {
        return this.jU.Eg();
    }

    public String KS() {
        return this.KS;
    }

    public HWF QR() {
        return this.COT;
    }

    public String jU() {
        return this.HWF;
    }

    public String lMd() {
        return this.lMd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicLayoutBrick{type='");
        sb.append(this.lMd);
        sb.append("', data='");
        sb.append(this.KS);
        sb.append("', value=");
        sb.append(this.jU);
        sb.append(", themeValue=");
        sb.append(this.COT);
        sb.append(", dataExtraInfo='");
        return AbstractC2914a.h(sb, this.HWF, "'}");
    }

    public int zp() {
        if (TextUtils.isEmpty(this.lMd)) {
            return 0;
        }
        if (this.lMd.equals("logo")) {
            String str = this.lMd + this.KS;
            this.lMd = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.lMd.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = zp;
        if (map.get(this.lMd) != null) {
            return map.get(this.lMd).intValue();
        }
        return -1;
    }

    public void KS(String str) {
        this.HWF = str;
    }

    public void lMd(String str) {
        this.KS = str;
    }

    public void lMd(HWF hwf) {
        this.COT = hwf;
    }

    public void zp(String str) {
        this.lMd = str;
    }

    public void zp(HWF hwf) {
        this.jU = hwf;
    }
}
