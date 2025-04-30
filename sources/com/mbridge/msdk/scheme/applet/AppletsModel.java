package com.mbridge.msdk.scheme.applet;

import Q7.n0;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.a.a;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    /* loaded from: classes3.dex */
    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public final void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                this.appletsModel.handlerSchemeRequestNetworkError(aVar);
            }
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(d<JSONObject> dVar) {
            super.onSuccess(dVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel != null) {
                appletsModel.changeRequestingState(false);
                if (dVar == null || dVar.f15778c == null) {
                    this.appletsModel.handlerRequestNetworkError();
                    return;
                }
                try {
                    this.appletsModel.handlerSchemeRequestResult(dVar);
                } catch (SchemeRequestException e4) {
                    this.appletsModel.handlerSchemeRequestFailed(-2, e4.getMessage());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z8) {
        this.isRequesting = z8;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:11|(8:12|13|(4:15|16|(2:44|45)(10:20|21|22|23|(2:34|35)|27|28|(1:30)|31|32)|33)(1:52)|46|47|48|(1:50)|51)|53|54|55|(1:57)|58|59|60|61|(1:63)|64|65|66|67|(1:69)|70|71|72|73|(1:75)|76|77|(1:79)|80|81|82|51) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f9, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00fb, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0100, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00df, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e1, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e6, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0134, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0136, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0113, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011a, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.scheme.applet.AppletsModel.getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler request network error exception ", e4);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i9, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a(TAG, "handlerSchemeRequestFailed network error by code " + String.valueOf(i9) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i9, str, this.reBuildClickUrl);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme failed exception  ", e4);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), AbstractC2914a.k("network error by code ", String.valueOf(i9), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i9;
        String str;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i9 = aVar.f15773a;
            str = aVar.getMessage();
            if (i9 == 10) {
                str = "request timeout";
            }
        } else {
            i9 = -1;
            str = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            ad.a(TAG, "handlerSchemeRequestNetworkError network error by code " + String.valueOf(i9) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i9, "network error: " + str, this.reBuildClickUrl);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme network error exception ", e4);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), AbstractC2914a.k("network error by code ", String.valueOf(i9), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(d<JSONObject> dVar) throws SchemeRequestException {
        JSONObject jSONObject = dVar.f15778c;
        if (MBridgeConstans.DEBUG) {
            ad.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(optString)) {
                this.isRequestSuccess = true;
                handlerSchemeRequestSuccess(optString);
                return;
            }
            throw new SchemeRequestException("wx_scheme value is null");
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(optInt, optString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme start exception ", e4);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            L.C("handlerSchemeRequestSuccess: ", str, TAG);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme success exception ", e4);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(ao.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b(TAG, "query wx_miniprogram from click url exception ", e4);
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        if (linkType != 8 && linkType != 9) {
            return false;
        }
        return true;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.e())) {
                return TextUtils.equals(ao.a(rewardTemplateMode.e(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b(TAG, "query reqwxurl from template url exception ", e4);
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return n0.l(new StringBuilder(), com.mbridge.msdk.foundation.same.net.e.d.f().f15826a, "?", str);
    }

    public boolean can(int i9) {
        if (isRequesting() || !canRequestWxScheme(i9)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i10 = this.lastRequestType;
        if ((i10 != 0 || i9 != 1) && (i10 != 1 || i9 != 1 || !this.isUserClick)) {
            return false;
        }
        return true;
    }

    public boolean canRequestWxScheme(int i9) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            return true;
        }
        return isCanRequestByTemplateUrl(MBridgeConstans.API_REUQEST_CATEGORY_APP);
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        boolean z8;
        if (!this.isSupportWxScheme) {
            if (isCanRequestByClickUrl("1") && isCanRequestByLinkType()) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.isSupportWxScheme = z8;
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i9, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx != null && !TextUtils.isEmpty(this.unitID)) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "start request wx scheme");
            }
            this.isRequesting = true;
            if (iAppletSchemeCallBack != null) {
                this.appletSchemeCallBack = iAppletSchemeCallBack;
            }
            handlerSchemeRequestStart();
            AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.m().c());
            if (this.params == null) {
                this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
            }
            if (this.params == null) {
                return;
            }
            if (isRequestTimesMaxPerDay()) {
                handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
            } else {
                this.lastRequestType = i9;
                appletSchemeRequest.get(1, com.mbridge.msdk.foundation.same.net.e.d.f().f15826a, this.params, new DefaultAppletSchemeResponse(this), "applets_model", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            }
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z8) {
        this.isUserClick = z8;
    }
}
