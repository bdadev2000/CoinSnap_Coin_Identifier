package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class AcquireRewardPopViewParameters {
    public AcquireRewardPopViewBehaviourListener behaviourListener;
    public String failTip;
    public String failTitle;
    public String language;
    public String placementId;
    public List<String> rightAnswerList;
    public String slideSuccessTitle;
    public String slideTip;
    public String slideTitle;
    public String successTip;
    public String successTitle;
    public String tips;
    public String title;
    public String unitId;
    public int viewType;
    public List<String> wrongAnswerList;
    public int autoDismissTime = 5;
    public int reduceTime = 0;
    public boolean canClickMaskArea = true;
    public int viewBackLayerTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFC27A;
    public int viewBackLayerBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF932B;
    public int viewForegroundTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBE2;
    public int viewForegroundBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFE0B5;
    public int buttonBackgroundLightColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF8B00;
    public int buttonBackgroundDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_33EF7601;
    public int titleTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_E56F19;
    public int tipTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_89664C;
    public int buttonTextLightColor = -1;
    public int buttonTextDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_D26700;
    public int successTipTextColor = -1;
    public int failTipTextColor = -1;
    public int containerBackgroundColor = AcquireRewardPopViewConst.DEFAULT_COLOR_50000000;
    public int successTitleGradientStartColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
    public int successTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
    public int successTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
    public int successTitleTextSize = 40;
    public float successTitleShadowRadius = 3.0f;
    public float successTitleShadowDx = 1.5f;
    public float successTitleShadowDy = 1.8f;
    public int failTitleGradientStartColor = -1;
    public int failTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_8B6B45;
    public int failTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_3B3127;
    public int failTitleTextSize = 40;
    public float failTitleShadowRadius = 3.0f;
    public float failTitleShadowDx = 1.5f;
    public float failTitleShadowDy = 1.8f;

    /* loaded from: classes4.dex */
    public static class Builder {
        private AcquireRewardPopViewParameters a;

        /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Builder(java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters.Builder.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
        }

        public AcquireRewardPopViewParameters build() {
            return this.a;
        }

        public Builder setAutoDismissTime(int i10) {
            this.a.autoDismissTime = i10;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i10) {
            this.a.buttonBackgroundDarkColor = i10;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i10) {
            this.a.buttonBackgroundLightColor = i10;
            return this;
        }

        public Builder setButtonTextDarkColor(int i10) {
            this.a.buttonTextDarkColor = i10;
            return this;
        }

        public Builder setButtonTextLightColor(int i10) {
            this.a.buttonTextLightColor = i10;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z10) {
            this.a.canClickMaskArea = z10;
            return this;
        }

        public Builder setContainerBackgroundColor(int i10) {
            this.a.containerBackgroundColor = i10;
            return this;
        }

        public Builder setFailTip(String str) {
            this.a.failTip = str;
            return this;
        }

        public Builder setFailTipTextColor(int i10) {
            this.a.failTipTextColor = i10;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.a.failTitle = str;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i10) {
            this.a.failTitleGradientEndColor = i10;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i10) {
            this.a.failTitleGradientStartColor = i10;
            return this;
        }

        public Builder setFailTitleShadowColor(int i10) {
            this.a.failTitleShadowColor = i10;
            return this;
        }

        public Builder setFailTitleShadowDx(float f10) {
            this.a.failTitleShadowDx = f10;
            return this;
        }

        public Builder setFailTitleShadowDy(float f10) {
            this.a.failTitleShadowDy = f10;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f10) {
            this.a.failTitleShadowRadius = f10;
            return this;
        }

        public Builder setFailTitleTextSize(int i10) {
            this.a.failTitleTextSize = i10;
            return this;
        }

        public Builder setReduceTime(int i10) {
            this.a.reduceTime = i10;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.a.slideSuccessTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.a.slideTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.a.slideTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.a.successTip = str;
            return this;
        }

        public Builder setSuccessTipTextColor(int i10) {
            this.a.successTipTextColor = i10;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.a.successTitle = str;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i10) {
            this.a.successTitleGradientEndColor = i10;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i10) {
            this.a.successTitleGradientStartColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i10) {
            this.a.successTitleShadowColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f10) {
            this.a.successTitleShadowDx = f10;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f10) {
            this.a.successTitleShadowDy = f10;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f10) {
            this.a.successTitleShadowRadius = f10;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i10) {
            this.a.successTitleTextSize = i10;
            return this;
        }

        public Builder setTipTextColor(int i10) {
            this.a.tipTextColor = i10;
            return this;
        }

        public Builder setTips(String str) {
            this.a.tips = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.a.title = str;
            return this;
        }

        public Builder setTitleTextColor(int i10) {
            this.a.titleTextColor = i10;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i10) {
            this.a.viewBackLayerBottomColor = i10;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i10) {
            this.a.viewBackLayerTopColor = i10;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i10) {
            this.a.viewForegroundBottomColor = i10;
            return this;
        }

        public Builder setViewForegroundTopColor(int i10) {
            this.a.viewForegroundTopColor = i10;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.a.wrongAnswerList = arrayList;
            return this;
        }
    }

    public static Builder builder(String str, String str2, int i10, String str3) {
        if (TextUtils.isEmpty(str2)) {
            ad.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i10, str3);
    }
}
