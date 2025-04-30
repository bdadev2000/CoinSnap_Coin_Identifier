package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.ar;
import com.applovin.impl.be;
import com.applovin.impl.ce;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.de;
import com.applovin.impl.ee;
import com.applovin.impl.ie;
import com.applovin.impl.jo;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.t3;
import com.applovin.impl.ve;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0756h implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final k f10818a;
    private final AppLovinCommunicator b;

    public C0756h(k kVar) {
        this.f10818a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.k());
        this.b = appLovinCommunicator;
        if (((Boolean) kVar.a(oj.f9584E6)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, jo.f8489a);
        }
    }

    public void a(be beVar, String str) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("ad_callback_blocked_after_hidden")) {
            Bundle a6 = a(beVar);
            a6.putString("callback_name", str);
            a(a6, "ad_callback_blocked_after_hidden");
        }
    }

    public void b(be beVar, String str) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("max_ad_events")) {
            Bundle a6 = a(beVar);
            a6.putString("type", str);
            this.f10818a.L();
            if (t.a()) {
                this.f10818a.L().a("CommunicatorService", "Sending \"max_ad_events\" message: " + a6);
            }
            a(a6, "max_ad_events");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long longValue;
        long longValue2;
        Map<String, Object> map;
        long j7;
        int i9;
        Map A8;
        Map l;
        JSONObject jSONObject;
        Map a6;
        if (!((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue()) {
            return;
        }
        if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
            Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
            Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
            String string = messageData.getString("id", "");
            if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10818a.d0());
            }
            this.f10818a.Z().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f10818a.a(oj.f9790j5)).booleanValue()).b(string).a());
            return;
        }
        if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            if (messageData2.containsKey("timeout_sec")) {
                longValue = TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec"));
            } else {
                longValue = ((Long) this.f10818a.a(oj.f9848s3)).longValue();
            }
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f10818a.a(oj.f9854t3)).intValue());
            if (messageData2.containsKey("retry_delay_sec")) {
                longValue2 = TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec"));
            } else {
                longValue2 = ((Long) this.f10818a.a(oj.f9862u3)).longValue();
            }
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j9 = longValue2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f10818a.y() != null) {
                        a6 = this.f10818a.y().a(null, false, false);
                    } else {
                        a6 = this.f10818a.x().a(null, false, false);
                    }
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(a6)));
                }
                j7 = longValue;
                i9 = i10;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    if (this.f10818a.y() != null) {
                        A8 = this.f10818a.y().b();
                        l = this.f10818a.y().d();
                    } else {
                        A8 = this.f10818a.x().A();
                        l = this.f10818a.x().l();
                    }
                    if (l.containsKey("idfv") && l.containsKey("idfv_scope")) {
                        i9 = i10;
                        String str = (String) l.get("idfv");
                        j7 = longValue;
                        Integer num = (Integer) l.get("idfv_scope");
                        num.getClass();
                        l.remove("idfv");
                        l.remove("idfv_scope");
                        A8.put("idfv", str);
                        A8.put("idfv_scope", num);
                    } else {
                        j7 = longValue;
                        i9 = i10;
                    }
                    A8.put("server_installed_at", this.f10818a.a(oj.f9851t));
                    A8.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10818a.d0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, A8);
                    map.put("device", l);
                } else {
                    j7 = longValue;
                    i9 = i10;
                }
            }
            a.C0036a a9 = com.applovin.impl.sdk.network.a.a(this.f10818a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers")));
            if (map != null) {
                jSONObject = new JSONObject(map);
            } else {
                jSONObject = null;
            }
            this.f10818a.l0().a((xl) new t3(appLovinCommunicatorMessage.getPublisherId(), a9.a(jSONObject).c((int) j7).a(i9).b((int) j9).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f10818a), sm.b.OTHER);
            return;
        }
        if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f10818a.i().addCustomQueryParams(zp.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
        } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f10818a.i().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
        } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            this.f10818a.S().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
        }
    }

    public void a(JSONObject jSONObject, boolean z8) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("safedk_init")) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f10818a.d0());
            bundle.putString("applovin_random_token", this.f10818a.c0());
            bundle.putString("compass_random_token", this.f10818a.p());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(k.k()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z8));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(ve.a(this.f10818a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f10818a.t0().c());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f10818a.a(oj.f9590F6)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f10818a.L();
            if (t.a()) {
                this.f10818a.L().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(be beVar) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("max_revenue_events")) {
            Bundle a6 = a(beVar);
            a6.putAll(JsonUtils.toBundle(beVar.P()));
            a6.putString("country_code", this.f10818a.q().getCountryCode());
            if (this.f10818a.r0() != null) {
                BundleUtils.putStringIfValid("user_segment", this.f10818a.r0().getName(), a6);
            }
            a(a6, "max_revenue_events");
        }
    }

    public void b(String str, String str2) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("user_info")) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    public void b(List list) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("test_mode_networks_updated")) {
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
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("live_networks_updated")) {
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
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("responses")) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i9, Object obj, String str3, boolean z8) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i9);
            bundle.putBundle(TtmlNode.TAG_BODY, JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z8);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (((Boolean) this.f10818a.a(oj.f9584E6)).booleanValue() && this.b.hasSubscriber(str)) {
            this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this));
        }
    }

    public boolean a(String str) {
        return jo.f8489a.contains(str);
    }

    private Bundle a(be beVar) {
        View view;
        Bundle bundle = new Bundle();
        bundle.putString("id", beVar.Q());
        bundle.putString("network_name", beVar.c());
        bundle.putString("max_ad_unit_id", beVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", beVar.S());
        bundle.putString("ad_format", beVar.getFormat().getLabel());
        BundleUtils.putStringIfValid(CampaignEx.JSON_KEY_CREATIVE_ID, beVar.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", beVar.u(), bundle);
        BundleUtils.putStringIfValid("dsp_name", beVar.getDspName(), bundle);
        if (beVar.X()) {
            BundleUtils.putStringIfValid("hybrid_ad_format", beVar.H().getLabel(), bundle);
        }
        if (beVar.Y()) {
            bundle.putString("custom_js_network_name", beVar.getNetworkName());
        } else if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(beVar.c())) {
            bundle.putString("custom_sdk_network_name", beVar.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(beVar.w()));
        if (beVar instanceof ie) {
            if (beVar instanceof ce) {
                view = ((ce) beVar).x();
            } else {
                if (beVar instanceof ee) {
                    ee eeVar = (ee) beVar;
                    if (!eeVar.r0()) {
                        view = eeVar.l0() != null ? eeVar.l0() : eeVar.m0();
                    }
                }
                view = null;
            }
            bundle.putString("ad_view", view != null ? ar.a(view) : "N/A");
        } else if (beVar instanceof de) {
            Bundle bundle2 = ((de) beVar).j0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
