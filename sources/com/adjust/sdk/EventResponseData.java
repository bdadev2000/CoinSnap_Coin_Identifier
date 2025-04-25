package com.adjust.sdk;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public class EventResponseData extends ResponseData {
    private String callbackId;
    private String eventToken;
    private String sdkPlatform;

    public EventResponseData(ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustEventFailure getFailureResponseData() {
        JSONObject jSONObject;
        if (this.success) {
            return null;
        }
        AdjustEventFailure adjustEventFailure = new AdjustEventFailure();
        if ("unity".equals(this.sdkPlatform)) {
            String str = this.eventToken;
            if (str == null) {
                str = "";
            }
            adjustEventFailure.eventToken = str;
            String str2 = this.message;
            if (str2 == null) {
                str2 = "";
            }
            adjustEventFailure.message = str2;
            String str3 = this.timestamp;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventFailure.timestamp = str3;
            String str4 = this.adid;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventFailure.adid = str4;
            String str5 = this.callbackId;
            adjustEventFailure.callbackId = str5 != null ? str5 : "";
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            jSONObject = this.jsonResponse;
        }
        adjustEventFailure.jsonResponse = jSONObject;
        return adjustEventFailure;
    }

    public AdjustEventSuccess getSuccessResponseData() {
        JSONObject jSONObject;
        if (!this.success) {
            return null;
        }
        AdjustEventSuccess adjustEventSuccess = new AdjustEventSuccess();
        if ("unity".equals(this.sdkPlatform)) {
            String str = this.eventToken;
            if (str == null) {
                str = "";
            }
            adjustEventSuccess.eventToken = str;
            String str2 = this.message;
            if (str2 == null) {
                str2 = "";
            }
            adjustEventSuccess.message = str2;
            String str3 = this.timestamp;
            if (str3 == null) {
                str3 = "";
            }
            adjustEventSuccess.timestamp = str3;
            String str4 = this.adid;
            if (str4 == null) {
                str4 = "";
            }
            adjustEventSuccess.adid = str4;
            String str5 = this.callbackId;
            adjustEventSuccess.callbackId = str5 != null ? str5 : "";
            jSONObject = this.jsonResponse;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            jSONObject = this.jsonResponse;
        }
        adjustEventSuccess.jsonResponse = jSONObject;
        return adjustEventSuccess;
    }
}
