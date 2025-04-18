package com.mbridge.msdk.scheme.applet;

import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public final void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(d<JSONObject> dVar) {
            super.onSuccess(dVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (dVar != null && dVar.f13367c != null) {
                try {
                    this.appletsModel.handlerSchemeRequestResult(dVar);
                    return;
                } catch (SchemeRequestException e2) {
                    this.appletsModel.handlerSchemeRequestFailed(-2, e2.getMessage());
                    return;
                }
            }
            this.appletsModel.handlerRequestNetworkError();
        }
    }

    /* loaded from: classes4.dex */
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
    public void changeRequestingState(boolean z10) {
        this.isRequesting = z10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:11|(8:12|13|(4:15|16|(2:44|45)(10:20|21|22|23|(2:34|35)|27|28|(1:30)|31|32)|33)(1:52)|46|47|48|(1:50)|51)|53|54|55|(1:57)|58|59|60|61|(1:63)|64|65|66|67|(1:69)|70|71|72|73|(1:75)|76|(1:78)|79|80|81|51) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00f9, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fb, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0100, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00df, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00e1, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e6, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0130, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0132, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0113, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0115, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011a, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> getAppletsParamsAndBuildRequest(com.mbridge.msdk.foundation.entity.CampaignEx r20) {
        /*
            Method dump skipped, instructions count: 440
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
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler request network error exception ", e2);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i10, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            ad.a(TAG, String.format("handlerSchemeRequestFailed network error by code %s and %s", String.valueOf(i10), str));
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i10, str, this.reBuildClickUrl);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme failed exception  ", e2);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), String.format("network error by code %s and %s", String.valueOf(i10), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i10;
        String str;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i10 = aVar.a;
            str = aVar.getMessage();
            if (i10 == 10) {
                str = "request timeout";
            }
        } else {
            i10 = -1;
            str = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            ad.a(TAG, String.format("handlerSchemeRequestNetworkError network error by code %s and %s", String.valueOf(i10), str));
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i10, "network error: " + str, this.reBuildClickUrl);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme network error exception ", e2);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), String.format("network error by code %s and %s", String.valueOf(i10), str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(d<JSONObject> dVar) throws SchemeRequestException {
        JSONObject jSONObject = dVar.f13367c;
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
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme start exception ", e2);
            }
        }
        AppletsReport.reportAppletsLoadState(c.m().c(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            e.A("handlerSchemeRequestSuccess: ", str, TAG);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, "handler wx scheme success exception ", e2);
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
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b(TAG, "query wx_miniprogram from click url exception ", e2);
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
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b(TAG, "query reqwxurl from template url exception ", e2);
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder(), com.mbridge.msdk.foundation.same.net.e.d.f().a, "?", str);
    }

    public boolean can(int i10) {
        if (isRequesting() || !canRequestWxScheme(i10)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i11 = this.lastRequestType;
        if ((i11 != 0 || i10 != 1) && (i11 != 1 || i10 != 1 || !this.isUserClick)) {
            return false;
        }
        return true;
    }

    public boolean canRequestWxScheme(int i10) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i10 != 0) {
            if (i10 != 1) {
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
        boolean z10;
        if (!this.isSupportWxScheme) {
            if (isCanRequestByClickUrl("1") && isCanRequestByLinkType()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isSupportWxScheme = z10;
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i10, IAppletSchemeCallBack iAppletSchemeCallBack) {
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
                this.lastRequestType = i10;
                appletSchemeRequest.get(1, com.mbridge.msdk.foundation.same.net.e.d.f().a, this.params, new DefaultAppletSchemeResponse(this), "applets_model", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            }
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z10) {
        this.isUserClick = z10;
    }
}
