package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.component.video.api.HWF.lMd;
import com.bytedance.sdk.component.utils.tG;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private String Bj;
    private float COT;
    private int FP;
    private Map<String, Object> Gzh;
    private int HWF;
    private int KS;
    private String KVG;
    private String Lij;
    private boolean QR;
    private Bundle RCv;
    private int YW;
    private int cz;
    private String dQp;
    private String dT;
    private float jU;
    private String ku;
    private int lMd;
    private int ot;
    private JSONArray ox;
    private String pvr;
    private boolean rV;
    private boolean tG;
    private int vDp;
    private String vwr;
    private String woN;
    private int yRU;
    private String zp;

    /* loaded from: classes.dex */
    public static class Builder {
        private float Bj;
        private Bundle FP;
        private String KVG;
        private String dQp;
        private int dT;
        private String ku;
        private String ot;
        private String rV;
        private boolean tG;
        private float vDp;
        private String vwr;
        private String woN;
        private int yRU;
        private String zp;
        private int lMd = 640;
        private int KS = 320;
        private final boolean jU = true;
        private int COT = 1;
        private final String HWF = "";
        private final int QR = 0;
        private String YW = "defaultUser";
        private boolean pvr = true;
        private Map<String, Object> cz = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.zp = this.zp;
            adSlot.HWF = this.COT;
            adSlot.QR = true;
            adSlot.lMd = this.lMd;
            adSlot.KS = this.KS;
            float f9 = this.Bj;
            if (f9 <= 0.0f) {
                adSlot.jU = this.lMd;
                adSlot.COT = this.KS;
            } else {
                adSlot.jU = f9;
                adSlot.COT = this.vDp;
            }
            adSlot.ku = "";
            adSlot.YW = 0;
            adSlot.dT = this.ku;
            adSlot.Bj = this.YW;
            adSlot.vDp = this.dT;
            adSlot.tG = this.pvr;
            adSlot.rV = this.tG;
            adSlot.dQp = this.rV;
            adSlot.KVG = this.dQp;
            adSlot.woN = this.KVG;
            adSlot.vwr = this.woN;
            adSlot.pvr = this.vwr;
            adSlot.Gzh = this.cz;
            adSlot.Lij = this.ot;
            adSlot.yRU = this.yRU;
            return adSlot;
        }

        public Builder isExpressAd(boolean z8) {
            this.tG = z8;
            return this;
        }

        public Builder setAdCount(int i9) {
            if (i9 <= 0) {
                i9 = 1;
            }
            if (i9 > 20) {
                i9 = 20;
            }
            this.COT = i9;
            return this;
        }

        public Builder setAdId(String str) {
            this.dQp = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.zp = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.KVG = str;
            return this;
        }

        public Builder setDurationSlotType(int i9) {
            this.yRU = i9;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f9, float f10) {
            this.Bj = f9;
            this.vDp = f10;
            return this;
        }

        public Builder setExt(String str) {
            this.woN = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i9, int i10) {
            this.lMd = i9;
            this.KS = i10;
            return this;
        }

        public Builder setIsAutoPlay(boolean z8) {
            this.pvr = z8;
            return this;
        }

        public Builder setLinkId(String str) {
            this.ot = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.ku = str;
            return this;
        }

        public Builder setNativeAdType(int i9) {
            this.dT = i9;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.FP = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.cz = map;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i9) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z8) {
            return this;
        }

        public Builder setUserData(String str) {
            this.vwr = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.YW = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (tG.jU()) {
                lMd.zp(str);
            }
            this.rV = str;
            return this;
        }
    }

    public static int getPosition(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return (i9 == 3 || i9 == 4 || i9 == 7 || i9 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public int getAdCount() {
        return this.HWF;
    }

    public String getAdId() {
        return this.KVG;
    }

    public String getBidAdm() {
        return this.dQp;
    }

    public JSONArray getBiddingTokens() {
        return this.ox;
    }

    public String getCodeId() {
        return this.zp;
    }

    public String getCreativeId() {
        return this.woN;
    }

    public int getDurationSlotType() {
        return this.yRU;
    }

    public float getExpressViewAcceptedHeight() {
        return this.COT;
    }

    public float getExpressViewAcceptedWidth() {
        return this.jU;
    }

    public String getExt() {
        return this.vwr;
    }

    public int getImgAcceptedHeight() {
        return this.KS;
    }

    public int getImgAcceptedWidth() {
        return this.lMd;
    }

    public int getIsRotateBanner() {
        return this.cz;
    }

    public String getLinkId() {
        return this.Lij;
    }

    public String getMediaExtra() {
        return this.dT;
    }

    public int getNativeAdType() {
        return this.vDp;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.RCv;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.Gzh;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.YW;
    }

    @Deprecated
    public String getRewardName() {
        return this.ku;
    }

    public int getRotateOrder() {
        return this.ot;
    }

    public int getRotateTime() {
        return this.FP;
    }

    public String getUserData() {
        return this.pvr;
    }

    public String getUserID() {
        return this.Bj;
    }

    public boolean isAutoPlay() {
        return this.tG;
    }

    public boolean isExpressAd() {
        return this.rV;
    }

    public boolean isSupportDeepLink() {
        return this.QR;
    }

    public void setAdCount(int i9) {
        this.HWF = i9;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.ox = jSONArray;
    }

    public void setDurationSlotType(int i9) {
        this.yRU = i9;
    }

    public void setIsRotateBanner(int i9) {
        this.cz = i9;
    }

    public void setNativeAdType(int i9) {
        this.vDp = i9;
    }

    public void setRotateOrder(int i9) {
        this.ot = i9;
    }

    public void setRotateTime(int i9) {
        this.FP = i9;
    }

    public void setUserData(String str) {
        this.pvr = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.zp);
            jSONObject.put("mAdCount", this.HWF);
            jSONObject.put("mIsAutoPlay", this.tG);
            jSONObject.put("mImgAcceptedWidth", this.lMd);
            jSONObject.put("mImgAcceptedHeight", this.KS);
            jSONObject.put("mExpressViewAcceptedWidth", this.jU);
            jSONObject.put("mExpressViewAcceptedHeight", this.COT);
            jSONObject.put("mSupportDeepLink", this.QR);
            jSONObject.put("mRewardName", this.ku);
            jSONObject.put("mRewardAmount", this.YW);
            jSONObject.put("mMediaExtra", this.dT);
            jSONObject.put("mUserID", this.Bj);
            jSONObject.put("mNativeAdType", this.vDp);
            jSONObject.put("mIsExpressAd", this.rV);
            jSONObject.put("mAdId", this.KVG);
            jSONObject.put("mCreativeId", this.woN);
            jSONObject.put("mExt", this.vwr);
            jSONObject.put("mBidAdm", this.dQp);
            jSONObject.put("mUserData", this.pvr);
            jSONObject.put("mDurationSlotType", this.yRU);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.tG = true;
        this.rV = false;
        this.cz = 0;
        this.FP = 0;
        this.ot = 0;
    }
}
