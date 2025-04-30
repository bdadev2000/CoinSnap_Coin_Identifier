package com.bytedance.sdk.component.adexpress.dynamic.zp;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicClose;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislike;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLeisureWidget;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoAd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLogoUnion;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicLottie;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicMutedView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicPrivacyView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRoot;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDown;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownBtn;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSkipCountDownContainer;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicSplitLineView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicStarView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuter;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterContainerWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterRewardFullSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTimeOuterSkip;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicUnKnowView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVerticalScrollWidgetImp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicVideoView;
import com.bytedance.sdk.component.adexpress.jU;
import com.bytedance.sdk.component.adexpress.lMd.tG;

/* loaded from: classes.dex */
public class lMd {
    public static DynamicBaseWidget zp(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        tG renderRequest;
        if (context == null || dynamicRootView == null || kuVar == null || kuVar.dT() == null) {
            return null;
        }
        switch (kuVar.dT().zp()) {
            case -1:
                return new DynamicUnKnowView(context, dynamicRootView, kuVar);
            case 0:
                return new DynamicTextView(context, dynamicRootView, kuVar);
            case 1:
                return new DynamicImageView(context, dynamicRootView, kuVar);
            case 2:
                return new DynamicButton(context, dynamicRootView, kuVar);
            case 3:
                return new DynamicDislike(context, dynamicRootView, kuVar);
            case 4:
                return new DynamicLogoAd(context, dynamicRootView, kuVar);
            case 5:
                return new DynamicLogoUnion(context, dynamicRootView, kuVar);
            case 6:
            case 9:
            case 17:
                return new DynamicBaseWidgetImp(context, dynamicRootView, kuVar);
            case 7:
                return new DynamicVideoView(context, dynamicRootView, kuVar);
            case 8:
                return new DynamicRoot(context, dynamicRootView, kuVar);
            case 10:
                return new DynamicMutedView(context, dynamicRootView, kuVar);
            case 11:
                return new DynamicStarView(context, dynamicRootView, kuVar);
            case 12:
                return new DynamicDislikeFeedBack(context, dynamicRootView, kuVar);
            case 13:
                return new DynamicTimeOuter(context, dynamicRootView, kuVar);
            case 14:
                return new DynamicTimeOuterContainerWidgetImp(context, dynamicRootView, kuVar);
            case 15:
                if (jU.lMd()) {
                    return new DynamicTimeOuterRewardFullSkip(context, dynamicRootView, kuVar);
                }
                return new DynamicTimeOuterSkip(context, dynamicRootView, kuVar);
            case 16:
                return new DynamicImageView(context, dynamicRootView, kuVar);
            case 18:
                return new DynamicSplitLineView(context, dynamicRootView, kuVar);
            case 19:
                return new DynamicSkipCountDownContainer(context, dynamicRootView, kuVar);
            case 20:
                return new DynamicSkipCountDown(context, dynamicRootView, kuVar);
            case 21:
                return new DynamicSkipCountDownBtn(context, dynamicRootView, kuVar);
            case 22:
                return new DynamicClose(context, dynamicRootView, kuVar);
            case 23:
                return new DynamicPrivacyView(context, dynamicRootView, kuVar);
            case 24:
                return new DynamicBaseScrollWidgetImp(context, dynamicRootView, kuVar);
            case 25:
                return new DynamicLeisureWidget(context, dynamicRootView, kuVar);
            case 26:
                if ("vertical".equals(kuVar.dT().COT().Ml())) {
                    return new DynamicVerticalScrollWidgetImp(context, dynamicRootView, kuVar);
                }
                return new DynamicBaseInternalScrollWidgetImp(context, dynamicRootView, kuVar);
            case 27:
                return new DynamicTimeOuterSkip(context, dynamicRootView, kuVar);
            case 28:
                if (!jU.lMd() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new DynamicLottie(context, dynamicRootView, kuVar, renderRequest.ot());
            default:
                return null;
        }
    }
}
