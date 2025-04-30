package com.adjust.sdk;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ResponseData {
    public ActivityKind activityKind;
    public ActivityPackage activityPackage;
    public String adid;
    public Long askIn;
    public AdjustAttribution attribution;
    public Long continueIn;
    public JSONObject jsonResponse;
    public String message;
    public Long retryIn;
    public Map<String, String> sendingParameters;
    public String timestamp;
    public TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5546a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            f5546a = iArr;
            try {
                iArr[ActivityKind.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5546a[ActivityKind.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5546a[ActivityKind.ATTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5546a[ActivityKind.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static ResponseData buildResponseData(ActivityPackage activityPackage, Map<String, String> map) {
        ActivityKind activityKind = activityPackage.getActivityKind();
        int i9 = a.f5546a[activityKind.ordinal()];
        ResponseData responseData = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new ResponseData() : new EventResponseData(activityPackage) : new AttributionResponseData() : new SdkClickResponseData() : new SessionResponseData(activityPackage);
        responseData.activityKind = activityKind;
        responseData.activityPackage = activityPackage;
        responseData.sendingParameters = map;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
