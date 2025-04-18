package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import java.util.Map;
import m5.a;
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
    private float AlY;
    private boolean DSW;
    private String EH;
    private boolean GA;
    private Map<String, Object> Ga;
    private int Ne;
    private int NjR;
    private int Sg;
    private Bundle UZM;
    private int VOe;
    private String Wwa;
    private String YFl;
    private String YI;
    private int YoT;
    private int aIu;
    private JSONArray bZ;
    private String eT;
    private String lG;

    /* renamed from: nc, reason: collision with root package name */
    private String f10486nc;
    private boolean pDU;
    private String qO;
    private String qsH;
    private String rkt;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10487vc;
    private float wN;
    private int wXo;

    /* loaded from: classes.dex */
    public static class Builder {
        private String EH;
        private boolean GA;
        private String Ne;
        private int VOe;
        private String Wwa;
        private String YFl;
        private float YoT;
        private float eT;
        private String lG;

        /* renamed from: nc, reason: collision with root package name */
        private int f10488nc;
        private String pDU;
        private String qsH;
        private String rkt;
        private Bundle wXo;
        private int Sg = 640;
        private int tN = 320;
        private final boolean AlY = true;
        private int wN = 1;

        /* renamed from: vc, reason: collision with root package name */
        private final String f10489vc = "";
        private final int DSW = 0;
        private String NjR = "defaultUser";
        private boolean qO = true;
        private Map<String, Object> aIu = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.YFl = this.YFl;
            adSlot.f10487vc = this.wN;
            adSlot.DSW = true;
            adSlot.Sg = this.Sg;
            adSlot.tN = this.tN;
            float f10 = this.eT;
            if (f10 <= 0.0f) {
                adSlot.AlY = this.Sg;
                adSlot.wN = this.tN;
            } else {
                adSlot.AlY = f10;
                adSlot.wN = this.YoT;
            }
            adSlot.qsH = "";
            adSlot.NjR = 0;
            adSlot.f10486nc = this.qsH;
            adSlot.eT = this.NjR;
            adSlot.YoT = this.f10488nc;
            adSlot.GA = this.qO;
            adSlot.pDU = this.GA;
            adSlot.EH = this.pDU;
            adSlot.rkt = this.EH;
            adSlot.lG = this.rkt;
            adSlot.Wwa = this.lG;
            adSlot.qO = this.Wwa;
            adSlot.Ga = this.aIu;
            adSlot.YI = this.Ne;
            adSlot.VOe = this.VOe;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.GA = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.wN = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.EH = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.YFl = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.rkt = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.VOe = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.eT = f10;
            this.YoT = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.lG = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.Sg = i10;
            this.tN = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.qO = z10;
            return this;
        }

        public Builder setLinkId(String str) {
            this.Ne = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.qsH = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.f10488nc = i10;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.wXo = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.aIu = map;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i10) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }

        public Builder setUserData(String str) {
            this.Wwa = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.NjR = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (YoT.AlY()) {
                a.a(str);
            }
            this.pDU = str;
            return this;
        }
    }

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
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
        return this.f10487vc;
    }

    public String getAdId() {
        return this.rkt;
    }

    public String getBidAdm() {
        return this.EH;
    }

    public JSONArray getBiddingTokens() {
        return this.bZ;
    }

    public String getCodeId() {
        return this.YFl;
    }

    public String getCreativeId() {
        return this.lG;
    }

    public int getDurationSlotType() {
        return this.VOe;
    }

    public float getExpressViewAcceptedHeight() {
        return this.wN;
    }

    public float getExpressViewAcceptedWidth() {
        return this.AlY;
    }

    public String getExt() {
        return this.Wwa;
    }

    public int getImgAcceptedHeight() {
        return this.tN;
    }

    public int getImgAcceptedWidth() {
        return this.Sg;
    }

    public int getIsRotateBanner() {
        return this.aIu;
    }

    public String getLinkId() {
        return this.YI;
    }

    public String getMediaExtra() {
        return this.f10486nc;
    }

    public int getNativeAdType() {
        return this.YoT;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.UZM;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.Ga;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.NjR;
    }

    @Deprecated
    public String getRewardName() {
        return this.qsH;
    }

    public int getRotateOrder() {
        return this.Ne;
    }

    public int getRotateTime() {
        return this.wXo;
    }

    public String getUserData() {
        return this.qO;
    }

    public String getUserID() {
        return this.eT;
    }

    public boolean isAutoPlay() {
        return this.GA;
    }

    public boolean isExpressAd() {
        return this.pDU;
    }

    public boolean isSupportDeepLink() {
        return this.DSW;
    }

    public void setAdCount(int i10) {
        this.f10487vc = i10;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.bZ = jSONArray;
    }

    public void setDurationSlotType(int i10) {
        this.VOe = i10;
    }

    public void setIsRotateBanner(int i10) {
        this.aIu = i10;
    }

    public void setNativeAdType(int i10) {
        this.YoT = i10;
    }

    public void setRotateOrder(int i10) {
        this.Ne = i10;
    }

    public void setRotateTime(int i10) {
        this.wXo = i10;
    }

    public void setUserData(String str) {
        this.qO = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.YFl);
            jSONObject.put("mAdCount", this.f10487vc);
            jSONObject.put("mIsAutoPlay", this.GA);
            jSONObject.put("mImgAcceptedWidth", this.Sg);
            jSONObject.put("mImgAcceptedHeight", this.tN);
            jSONObject.put("mExpressViewAcceptedWidth", this.AlY);
            jSONObject.put("mExpressViewAcceptedHeight", this.wN);
            jSONObject.put("mSupportDeepLink", this.DSW);
            jSONObject.put("mRewardName", this.qsH);
            jSONObject.put("mRewardAmount", this.NjR);
            jSONObject.put("mMediaExtra", this.f10486nc);
            jSONObject.put("mUserID", this.eT);
            jSONObject.put("mNativeAdType", this.YoT);
            jSONObject.put("mIsExpressAd", this.pDU);
            jSONObject.put("mAdId", this.rkt);
            jSONObject.put("mCreativeId", this.lG);
            jSONObject.put("mExt", this.Wwa);
            jSONObject.put("mBidAdm", this.EH);
            jSONObject.put("mUserData", this.qO);
            jSONObject.put("mDurationSlotType", this.VOe);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.GA = true;
        this.pDU = false;
        this.aIu = 0;
        this.wXo = 0;
        this.Ne = 0;
    }
}
