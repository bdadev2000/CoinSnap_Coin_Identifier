package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
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

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private AcquireRewardPopViewParameters f15171a;

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
            return this.f15171a;
        }

        public Builder setAutoDismissTime(int i9) {
            this.f15171a.autoDismissTime = i9;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.f15171a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i9) {
            this.f15171a.buttonBackgroundDarkColor = i9;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i9) {
            this.f15171a.buttonBackgroundLightColor = i9;
            return this;
        }

        public Builder setButtonTextDarkColor(int i9) {
            this.f15171a.buttonTextDarkColor = i9;
            return this;
        }

        public Builder setButtonTextLightColor(int i9) {
            this.f15171a.buttonTextLightColor = i9;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z8) {
            this.f15171a.canClickMaskArea = z8;
            return this;
        }

        public Builder setContainerBackgroundColor(int i9) {
            this.f15171a.containerBackgroundColor = i9;
            return this;
        }

        public Builder setFailTip(String str) {
            this.f15171a.failTip = str;
            return this;
        }

        public Builder setFailTipTextColor(int i9) {
            this.f15171a.failTipTextColor = i9;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.f15171a.failTitle = str;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i9) {
            this.f15171a.failTitleGradientEndColor = i9;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i9) {
            this.f15171a.failTitleGradientStartColor = i9;
            return this;
        }

        public Builder setFailTitleShadowColor(int i9) {
            this.f15171a.failTitleShadowColor = i9;
            return this;
        }

        public Builder setFailTitleShadowDx(float f9) {
            this.f15171a.failTitleShadowDx = f9;
            return this;
        }

        public Builder setFailTitleShadowDy(float f9) {
            this.f15171a.failTitleShadowDy = f9;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f9) {
            this.f15171a.failTitleShadowRadius = f9;
            return this;
        }

        public Builder setFailTitleTextSize(int i9) {
            this.f15171a.failTitleTextSize = i9;
            return this;
        }

        public Builder setReduceTime(int i9) {
            this.f15171a.reduceTime = i9;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.f15171a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.f15171a.slideSuccessTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.f15171a.slideTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.f15171a.slideTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.f15171a.successTip = str;
            return this;
        }

        public Builder setSuccessTipTextColor(int i9) {
            this.f15171a.successTipTextColor = i9;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.f15171a.successTitle = str;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i9) {
            this.f15171a.successTitleGradientEndColor = i9;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i9) {
            this.f15171a.successTitleGradientStartColor = i9;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i9) {
            this.f15171a.successTitleShadowColor = i9;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f9) {
            this.f15171a.successTitleShadowDx = f9;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f9) {
            this.f15171a.successTitleShadowDy = f9;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f9) {
            this.f15171a.successTitleShadowRadius = f9;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i9) {
            this.f15171a.successTitleTextSize = i9;
            return this;
        }

        public Builder setTipTextColor(int i9) {
            this.f15171a.tipTextColor = i9;
            return this;
        }

        public Builder setTips(String str) {
            this.f15171a.tips = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.f15171a.title = str;
            return this;
        }

        public Builder setTitleTextColor(int i9) {
            this.f15171a.titleTextColor = i9;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i9) {
            this.f15171a.viewBackLayerBottomColor = i9;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i9) {
            this.f15171a.viewBackLayerTopColor = i9;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i9) {
            this.f15171a.viewForegroundBottomColor = i9;
            return this;
        }

        public Builder setViewForegroundTopColor(int i9) {
            this.f15171a.viewForegroundTopColor = i9;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.f15171a.wrongAnswerList = arrayList;
            return this;
        }
    }

    public static Builder builder(String str, String str2, int i9, String str3) {
        if (TextUtils.isEmpty(str2)) {
            ad.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i9 == 0) {
            i9 = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i9, str3);
    }
}
