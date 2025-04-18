package com.facebook.appevents.cloudbridge;

import android.support.v4.media.d;
import b1.f0;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.a.g;
import d0.a0;
import e0.e0;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.p;
import w0.e;
import z0.m;

/* loaded from: classes.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;

    @NotNull
    private static final String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static List<Map<String, Object>> transformedEvents;

    @NotNull
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();

    @NotNull
    private static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = f0.q(200, 202);

    @NotNull
    private static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = f0.q(503, 504, 429);

    /* loaded from: classes.dex */
    public static final class CloudBridgeCredentials {

        @NotNull
        private final String accessKey;

        @NotNull
        private final String cloudBridgeURL;

        @NotNull
        private final String datasetID;

        public CloudBridgeCredentials(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            p0.a.s(str, "datasetID");
            p0.a.s(str2, "cloudBridgeURL");
            p0.a.s(str3, "accessKey");
            this.datasetID = str;
            this.cloudBridgeURL = str2;
            this.accessKey = str3;
        }

        public static /* synthetic */ CloudBridgeCredentials copy$default(CloudBridgeCredentials cloudBridgeCredentials, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i2 & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i2 & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.datasetID;
        }

        @NotNull
        public final String component2() {
            return this.cloudBridgeURL;
        }

        @NotNull
        public final String component3() {
            return this.accessKey;
        }

        @NotNull
        public final CloudBridgeCredentials copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            p0.a.s(str, "datasetID");
            p0.a.s(str2, "cloudBridgeURL");
            p0.a.s(str3, "accessKey");
            return new CloudBridgeCredentials(str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloudBridgeCredentials)) {
                return false;
            }
            CloudBridgeCredentials cloudBridgeCredentials = (CloudBridgeCredentials) obj;
            return p0.a.g(this.datasetID, cloudBridgeCredentials.datasetID) && p0.a.g(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && p0.a.g(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        @NotNull
        public final String getAccessKey() {
            return this.accessKey;
        }

        @NotNull
        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        @NotNull
        public final String getDatasetID() {
            return this.datasetID;
        }

        public int hashCode() {
            return this.accessKey.hashCode() + androidx.compose.foundation.text.input.a.b(this.cloudBridgeURL, this.datasetID.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb.append(this.datasetID);
            sb.append(", cloudBridgeURL=");
            sb.append(this.cloudBridgeURL);
            sb.append(", accessKey=");
            return d.q(sb, this.accessKey, ')');
        }
    }

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    public static /* synthetic */ void a(GraphRequest graphRequest) {
        m461transformGraphRequestAndSendToCAPIGEndPoint$lambda0(graphRequest);
    }

    public static final void configure(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        p0.a.s(str, "datasetID");
        p0.a.s(str2, "url");
        p0.a.s(str3, "accessKey");
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new CloudBridgeCredentials(str, str2, str3));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new ArrayList());
    }

    @Nullable
    public static final String getCredentials() {
        try {
            CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release == null) {
                return null;
            }
            return credentials$facebook_core_release.toString();
        } catch (a0 unused) {
            return null;
        }
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, Integer num, List list, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i2);
    }

    public static /* synthetic */ void makeHttpRequest$facebook_core_release$default(AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, String str, String str2, String str3, Map map, int i2, p pVar, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = TIMEOUT_INTERVAL;
        }
        appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, str2, str3, map, i2, pVar);
    }

    private final List<Map<String, Object>> transformAppEventRequestForCAPIG(GraphRequest graphRequest) {
        JSONObject graphObject = graphRequest.getGraphObject();
        if (graphObject == null) {
            return null;
        }
        LinkedHashMap z2 = e0.z(Utility.convertJSONObjectToHashMap(graphObject));
        Object tag = graphRequest.getTag();
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        z2.put("custom_events", tag);
        StringBuilder sb = new StringBuilder();
        for (String str : z2.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(z2.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        Logger.Companion.log(LoggingBehavior.APP_EVENTS, TAG, "\nGraph Request data: \n\n%s \n\n", sb);
        return AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(z2);
    }

    public static final void transformGraphRequestAndSendToCAPIGEndPoint(@NotNull GraphRequest graphRequest) {
        p0.a.s(graphRequest, "request");
        Utility.runOnNonUiThread(new androidx.compose.material.ripple.a(graphRequest, 13));
    }

    /* renamed from: transformGraphRequestAndSendToCAPIGEndPoint$lambda-0 */
    public static final void m461transformGraphRequestAndSendToCAPIGEndPoint$lambda0(GraphRequest graphRequest) {
        List Z0;
        p0.a.s(graphRequest, "$request");
        String graphPath = graphRequest.getGraphPath();
        List o12 = graphPath == null ? null : m.o1(graphPath, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, 0, 6);
        if (o12 == null || o12.size() != 2) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            List<Map<String, Object>> transformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(graphRequest);
            if (transformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(transformAppEventRequestForCAPIG);
            int min = Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            List<Map<String, Object>> transformedEvents$facebook_core_release = appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release();
            e eVar = new e(0, min - 1, 1);
            p0.a.s(transformedEvents$facebook_core_release, "<this>");
            if (eVar.isEmpty()) {
                Z0 = w.f30218a;
            } else {
                Integer num = 0;
                Z0 = u.Z0(transformedEvents$facebook_core_release.subList(num.intValue(), Integer.valueOf(eVar.f31407b).intValue() + 1));
            }
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) Z0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            p0.a.r(jSONObject2, "jsonBodyStr.toString(2)");
            companion.log(loggingBehavior, TAG, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            Map<String, String> singletonMap = Collections.singletonMap("Content-Type", "application/json");
            p0.a.r(singletonMap, "singletonMap(...)");
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, g.f29074c, jSONObject3, singletonMap, TIMEOUT_INTERVAL, new AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(Z0));
        } catch (a0 e) {
            Logger.Companion.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    public final void appendEvents$facebook_core_release(@Nullable List<? extends Map<String, ? extends Object>> list) {
        if (list != null) {
            getTransformedEvents$facebook_core_release().addAll(list);
        }
        int max = Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (max > 0) {
            setTransformedEvents$facebook_core_release(kotlin.jvm.internal.e.d(u.B0(getTransformedEvents$facebook_core_release(), max)));
        }
    }

    @NotNull
    public final CloudBridgeCredentials getCredentials$facebook_core_release() {
        CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        p0.a.B0("credentials");
        throw null;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    @NotNull
    public final List<Map<String, Object>> getTransformedEvents$facebook_core_release() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        p0.a.B0("transformedEvents");
        throw null;
    }

    public final void handleError$facebook_core_release(@Nullable Integer num, @NotNull List<? extends Map<String, ? extends Object>> list, int i2) {
        p0.a.s(list, "processedEvents");
        if (u.A0(RETRY_EVENTS_HTTP_RESPONSE, num)) {
            if (currentRetryCount >= i2) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
            } else {
                getTransformedEvents$facebook_core_release().addAll(0, list);
                currentRetryCount++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3 A[Catch: IOException -> 0x0045, UnknownHostException -> 0x0048, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x0048, IOException -> 0x0045, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x004b, B:10:0x0059, B:14:0x0069, B:16:0x00a3, B:22:0x00bd, B:29:0x00c3, B:30:0x00c6, B:32:0x00c7, B:34:0x00ea, B:38:0x0022, B:41:0x0029, B:42:0x002f, B:44:0x0035, B:46:0x00f6, B:47:0x00fd), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[Catch: IOException -> 0x0045, UnknownHostException -> 0x0048, TryCatch #4 {UnknownHostException -> 0x0048, IOException -> 0x0045, blocks: (B:3:0x000f, B:5:0x001a, B:8:0x004b, B:10:0x0059, B:14:0x0069, B:16:0x00a3, B:22:0x00bd, B:29:0x00c3, B:30:0x00c6, B:32:0x00c7, B:34:0x00ea, B:38:0x0022, B:41:0x0029, B:42:0x002f, B:44:0x0035, B:46:0x00f6, B:47:0x00fd), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void makeHttpRequest$facebook_core_release(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r9, int r10, @org.jetbrains.annotations.Nullable q0.p r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, q0.p):void");
    }

    public final void setCredentials$facebook_core_release(@NotNull CloudBridgeCredentials cloudBridgeCredentials) {
        p0.a.s(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i2) {
        currentRetryCount = i2;
    }

    public final void setTransformedEvents$facebook_core_release(@NotNull List<Map<String, Object>> list) {
        p0.a.s(list, "<set-?>");
        transformedEvents = list;
    }
}
