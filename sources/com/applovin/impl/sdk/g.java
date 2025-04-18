package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.af;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.ge;
import com.applovin.impl.he;
import com.applovin.impl.ie;
import com.applovin.impl.io;
import com.applovin.impl.je;
import com.applovin.impl.ne;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tm;
import com.applovin.impl.v3;
import com.applovin.impl.yl;
import com.applovin.impl.yp;
import com.applovin.impl.zq;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final j f26621a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f26622b;

    public g(j jVar) {
        this.f26621a = jVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(j.l());
        this.f26622b = appLovinCommunicator;
        if (((Boolean) jVar.a(sj.N6)).booleanValue()) {
            appLovinCommunicator.a(jVar);
            appLovinCommunicator.subscribe(this, io.f24524a);
        }
    }

    public void a(ge geVar, String str) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle a2 = a(geVar);
            a2.putString("callback_name", str);
            a(a2, "ad_callback_blocked_after_hidden");
        }
    }

    public void b(ge geVar, String str) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("max_ad_events")) {
            Bundle a2 = a(geVar);
            a2.putString("type", str);
            this.f26621a.J();
            if (n.a()) {
                this.f26621a.J().a("CommunicatorService", "Sending \"max_ad_events\" message: " + a2);
            }
            a(a2, "max_ad_events");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j2;
        int i2;
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey("sdk_key")) {
                    map2.put("sdk_key", this.f26621a.b0());
                }
                this.f26621a.X().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f26621a.a(sj.o5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f26621a.i().addCustomQueryParams(yp.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f26621a.i().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f26621a.Q().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", com.safedk.android.a.g.f29074c);
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f26621a.a(sj.B3)).longValue();
            int i3 = messageData2.getInt("retry_count", ((Integer) this.f26621a.a(sj.C3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f26621a.a(sj.D3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j3 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f26621a.y().a(null, false, false))));
                }
                j2 = millis;
                i2 = i3;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map A = this.f26621a.y().A();
                    Map l2 = this.f26621a.y().l();
                    if (l2.containsKey("idfv") && l2.containsKey("idfv_scope")) {
                        i2 = i3;
                        String str = (String) l2.get("idfv");
                        j2 = millis;
                        Integer num = (Integer) l2.get("idfv_scope");
                        num.intValue();
                        l2.remove("idfv");
                        l2.remove("idfv_scope");
                        A.put("idfv", str);
                        A.put("idfv_scope", num);
                    } else {
                        j2 = millis;
                        i2 = i3;
                    }
                    A.put("server_installed_at", this.f26621a.a(sj.f26943p));
                    A.put("sdk_key", this.f26621a.b0());
                    map.put("app", A);
                    map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, l2);
                } else {
                    j2 = millis;
                    i2 = i3;
                }
            }
            this.f26621a.j0().a((yl) new v3(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f26621a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j2).a(i2).b((int) j3).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f26621a), tm.b.OTHER);
        }
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("safedk_init")) {
            Bundle bundle = new Bundle();
            bundle.putString("sdk_key", this.f26621a.b0());
            bundle.putString("applovin_random_token", this.f26621a.a0());
            bundle.putString("compass_random_token", this.f26621a.q());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(j.l()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z2));
            bundle.putParcelableArrayList(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, JsonUtils.toBundle(af.a(this.f26621a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f26621a.q0().c());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f26621a.a(sj.O6)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, com.safedk.android.internal.d.x, true);
                JsonUtils.putJSONObject(jSONObject3, com.safedk.android.internal.d.f29953v, jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f26621a.J();
            if (n.a()) {
                this.f26621a.J().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(ge geVar) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("max_revenue_events")) {
            Bundle a2 = a(geVar);
            a2.putAll(JsonUtils.toBundle(geVar.R()));
            a2.putString("country_code", this.f26621a.r().getCountryCode());
            a(a2, "max_revenue_events");
        }
    }

    public void b(String str, String str2) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("user_info")) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void b(List list) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "test_mode_networks_updated");
        }
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("adapter_initialization_status")) {
            Bundle c2 = androidx.compose.foundation.text.input.a.c("adapter_class", str);
            c2.putInt("init_status", initializationStatus.getCode());
            a(c2, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("live_networks", new ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i2, Object obj, String str3, boolean z2) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i2);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z2);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f26621a.a(sj.N6)).booleanValue() && this.f26622b.hasSubscriber(str)) {
            this.f26622b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public boolean a(String str) {
        return io.f24524a.contains(str);
    }

    private Bundle a(ge geVar) {
        View view;
        Bundle bundle = new Bundle();
        bundle.putString("id", geVar.S());
        bundle.putString(BrandSafetyEvent.ad, geVar.c());
        bundle.putString(BrandSafetyEvent.f29785l, geVar.getAdUnitId());
        bundle.putString(BrandSafetyEvent.f29784k, geVar.U());
        bundle.putString("ad_format", geVar.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", geVar.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", geVar.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", geVar.getDspName(), bundle);
        if (geVar.a0()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", geVar.I().getLabel(), bundle);
        }
        if (geVar.b0()) {
            bundle.putString(BrandSafetyEvent.af, geVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(geVar.c())) {
            bundle.putString("custom_sdk_network_name", geVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(geVar.x()));
        if (geVar instanceof ne) {
            if (geVar instanceof he) {
                view = ((he) geVar).y();
            } else {
                if (geVar instanceof je) {
                    je jeVar = (je) geVar;
                    if (!jeVar.w0()) {
                        view = jeVar.q0() != null ? jeVar.q0() : jeVar.r0();
                    }
                }
                view = null;
            }
            bundle.putString("ad_view", view != null ? zq.a(view) : "N/A");
        } else if (geVar instanceof ie) {
            Bundle bundle2 = ((ie) geVar).o0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
