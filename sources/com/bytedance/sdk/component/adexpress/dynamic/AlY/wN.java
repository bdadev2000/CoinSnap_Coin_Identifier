package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Map;
import vd.e;

/* loaded from: classes.dex */
public class wN {
    public static final Map<String, Integer> YFl;
    private vc AlY;
    private String Sg;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10380vc;
    private vc wN;

    static {
        HashMap hashMap = new HashMap();
        YFl = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put(CampaignEx.JSON_KEY_TITLE, 0);
        hashMap.put("subtitle", 0);
        hashMap.put("source", 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        hashMap.put(MimeTypes.BASE_TYPE_TEXT, 0);
        hashMap.put("tag-group", 17);
        hashMap.put("app-version", 0);
        hashMap.put("development-name", 0);
        hashMap.put("privacy-detail", 23);
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        hashMap.put("icon-download", 1);
        hashMap.put("logoad", 4);
        hashMap.put("logounion", 5);
        hashMap.put("logo-union", 9);
        hashMap.put("dislike", 3);
        hashMap.put("close", 3);
        hashMap.put("close-fill", 3);
        hashMap.put("webview-close", 22);
        hashMap.put("feedback-dislike", 12);
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
        hashMap.put("custom-component-vessel", 6);
        hashMap.put("carousel", 24);
        hashMap.put("carousel-vessel", 26);
        hashMap.put("leisure-interact", 25);
        hashMap.put("video-hd", 7);
        hashMap.put(MimeTypes.BASE_TYPE_VIDEO, 7);
        hashMap.put("video-vd", 7);
        hashMap.put("video-sq", 7);
        hashMap.put("muted", 10);
        hashMap.put("star", 11);
        hashMap.put("skip-countdowns", 19);
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        hashMap.put("skip-with-countdowns-skip-countdown", 20);
        hashMap.put("skip-with-time", 14);
        hashMap.put("skip-with-time-countdown", 13);
        hashMap.put("skip-with-time-skip-btn", 15);
        hashMap.put("skip", 27);
        hashMap.put("timedown", 13);
        hashMap.put(RewardPlus.ICON, 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        hashMap.put("score-count-type-2", 0);
        hashMap.put("lottie", 28);
    }

    public String AlY() {
        return this.f10380vc;
    }

    public vc DSW() {
        return this.wN;
    }

    public String Sg() {
        return this.Sg;
    }

    public int YFl() {
        if (TextUtils.isEmpty(this.Sg)) {
            return 0;
        }
        if (this.Sg.equals("logo")) {
            String str = this.Sg + this.tN;
            this.Sg = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.Sg.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = YFl;
        if (map.get(this.Sg) != null) {
            return map.get(this.Sg).intValue();
        }
        return -1;
    }

    public String tN() {
        return this.tN;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutBrick{type='");
        sb2.append(this.Sg);
        sb2.append("', data='");
        sb2.append(this.tN);
        sb2.append("', value=");
        sb2.append(this.AlY);
        sb2.append(", themeValue=");
        sb2.append(this.wN);
        sb2.append(", dataExtraInfo='");
        return e.h(sb2, this.f10380vc, "'}");
    }

    public int vc() {
        return this.AlY.rE();
    }

    public vc wN() {
        return this.AlY;
    }

    public void Sg(String str) {
        this.tN = str;
    }

    public void tN(String str) {
        this.f10380vc = str;
    }

    public void Sg(vc vcVar) {
        this.wN = vcVar;
    }

    public void YFl(String str) {
        this.Sg = str;
    }

    public void YFl(vc vcVar) {
        this.AlY = vcVar;
    }
}
