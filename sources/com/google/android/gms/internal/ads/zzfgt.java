package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import com.applovin.sdk.AppLovinEventParameters;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfgt {
    public final String zzA;
    public final zzcac zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfhr zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbvm zzae;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;

    @Nullable
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final boolean zzas;
    public final int zzat;
    public final String zzau;
    public final List zzav;
    public final boolean zzaw;
    public final Map zzax;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;

    @Nullable
    public final zzbyt zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;

    @Nullable
    public final zzfgy zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0672. Please report as an issue. */
    public zzfgt(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        String str;
        List list;
        List list2;
        char c9;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgbc zzm = zzgbc.zzm();
        zzgbc zzm2 = zzgbc.zzm();
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        List list3 = zzm;
        List list4 = zzm2;
        Map map = hashMap;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i10 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        int i12 = 0;
        boolean z26 = false;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        zzfgy zzfgyVar = null;
        zzcac zzcacVar = null;
        zzbvm zzbvmVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str20 = null;
        int i13 = -1;
        int i14 = -1;
        List list5 = emptyList11;
        List list6 = emptyList12;
        List list7 = emptyList13;
        List list8 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        int i15 = 0;
        int i16 = 0;
        String str21 = str19;
        String str22 = str21;
        zzbyt zzbytVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName == null) {
                str = "";
            } else {
                str = nextName;
            }
            switch (str.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_name")) {
                        c9 = ';';
                        break;
                    }
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_signals")) {
                        c9 = 28;
                        break;
                    }
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("omid_settings")) {
                        c9 = ')';
                        break;
                    }
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("recursive_server_response_data")) {
                        c9 = 'E';
                        break;
                    }
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_consent")) {
                        c9 = 'G';
                        break;
                    }
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("play_prewarm_options")) {
                        c9 = '1';
                        break;
                    }
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("parallel_key")) {
                        c9 = 'I';
                        break;
                    }
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_name")) {
                        c9 = '9';
                        break;
                    }
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_interscroller")) {
                        c9 = '5';
                        break;
                    }
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("backend_query_id")) {
                        c9 = '/';
                        break;
                    }
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("nofill_urls")) {
                        c9 = '\r';
                        break;
                    }
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_custom_close_blocked")) {
                        c9 = '#';
                        break;
                    }
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("orientation")) {
                        c9 = '%';
                        break;
                    }
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("enable_omid")) {
                        c9 = '\'';
                        break;
                    }
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("buffer_click_url_as_ready_to_ping")) {
                        c9 = 'C';
                        break;
                    }
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("showable_impression_type")) {
                        c9 = ',';
                        break;
                    }
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_cover")) {
                        c9 = '6';
                        break;
                    }
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_sizes")) {
                        c9 = 19;
                        break;
                    }
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapters")) {
                        c9 = 20;
                        break;
                    }
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("test_mode_enabled")) {
                        c9 = '\"';
                        break;
                    }
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("extras")) {
                        c9 = 29;
                        break;
                    }
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_event_value")) {
                        c9 = '3';
                        break;
                    }
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_rendered_attribution")) {
                        c9 = 30;
                        break;
                    }
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_urls")) {
                        c9 = 14;
                        break;
                    }
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_type")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_scroll_aware")) {
                        c9 = '+';
                        break;
                    }
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("fill_urls")) {
                        c9 = '\f';
                        break;
                    }
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allocation_id")) {
                        c9 = 21;
                        break;
                    }
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_complete_urls")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("active_view")) {
                        c9 = 25;
                        break;
                    }
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("valid_from_timestamp")) {
                        c9 = '\n';
                        break;
                    }
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_source_instance_id")) {
                        c9 = '<';
                        break;
                    }
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("click_urls")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("late_load_urls")) {
                        c9 = 'J';
                        break;
                    }
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("safe_browsing")) {
                        c9 = 26;
                        break;
                    }
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("imp_urls")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rtb_native_required_assets")) {
                        c9 = '>';
                        break;
                    }
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_timeout_ms")) {
                        c9 = '&';
                        break;
                    }
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_close_time_ms")) {
                        c9 = '-';
                        break;
                    }
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("content_url")) {
                        c9 = '@';
                        break;
                    }
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_close_button_enabled")) {
                        c9 = '2';
                        break;
                    }
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("force_disable_hardware_acceleration")) {
                        c9 = 'A';
                        break;
                    }
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                        c9 = '.';
                        break;
                    }
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("native_required_asset_viewability")) {
                        c9 = '?';
                        break;
                    }
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_offline_ad")) {
                        c9 = '=';
                        break;
                    }
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_custom_click_gesture")) {
                        c9 = ' ';
                        break;
                    }
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad")) {
                        c9 = 18;
                        break;
                    }
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("id")) {
                        c9 = 23;
                        break;
                    }
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(DataSchemeDataSource.SCHEME_DATA)) {
                        c9 = 22;
                        break;
                    }
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("request_id")) {
                        c9 = 'D';
                        break;
                    }
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("render_test_label")) {
                        c9 = '!';
                        break;
                    }
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("qdata")) {
                        c9 = 24;
                        break;
                    }
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_load_urls")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_closable_area_disabled")) {
                        c9 = '$';
                        break;
                    }
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("consent_form_action_identifier")) {
                        c9 = 'H';
                        break;
                    }
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("presentation_error_timeout_ms")) {
                        c9 = 16;
                        break;
                    }
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("debug_dialog_string")) {
                        c9 = 27;
                        break;
                    }
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("container_sizes")) {
                        c9 = 17;
                        break;
                    }
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("impression_type")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 805095541:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("analytics_event_name_to_parameters_map")) {
                        c9 = 'L';
                        break;
                    }
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rewards")) {
                        c9 = 11;
                        break;
                    }
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("adapter_response_info_key")) {
                        c9 = '8';
                        break;
                    }
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("cache_hit_urls")) {
                        c9 = 'B';
                        break;
                    }
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("allow_pub_owned_ad_view")) {
                        c9 = 31;
                        break;
                    }
                    break;
                case 1422388341:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_collapsible")) {
                        c9 = 'F';
                        break;
                    }
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals(CampaignEx.JSON_KEY_AD_SOURCE_ID)) {
                        c9 = ':';
                        break;
                    }
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("bid_response")) {
                        c9 = '(';
                        break;
                    }
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_start_urls")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("ad_network_class_name")) {
                        c9 = '7';
                        break;
                    }
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("video_reward_urls")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("use_third_party_container_height")) {
                        c9 = '0';
                        break;
                    }
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("renderers")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("is_analytics_logging_enabled")) {
                        c9 = '*';
                        break;
                    }
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("rule_line_external_id")) {
                        c9 = '4';
                        break;
                    }
                    break;
                case 2072888499:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str.equals("manual_tracking_urls")) {
                        c9 = 15;
                        break;
                    }
                    break;
                case 2075506442:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str.equals("render_serially")) {
                        c9 = 'K';
                        break;
                    }
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 1:
                    i15 = zzb(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 5:
                    i16 = zzc(jsonReader.nextInt());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\t':
                    str22 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\n':
                    str21 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 11:
                    zzbytVar = zzbyt.zza(com.google.android.gms.ads.internal.util.zzbw.zzf(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    break;
                case 14:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case 15:
                    list5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 16:
                    i9 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 17:
                    list6 = zzfgu.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 18:
                    zzfgyVar = new zzfgy(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 19:
                    list8 = zzfgu.zza(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 20:
                    list7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader).toString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 26:
                    zzcacVar = zzcac.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    z8 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 31:
                    z9 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ' ':
                    z10 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '!':
                    z11 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\"':
                    z12 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '#':
                    z13 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '$':
                    z14 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '%':
                    i13 = zzd(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    i10 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\'':
                    z15 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '*':
                    z16 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    z17 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ',':
                    i11 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '-':
                    i14 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    str8 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    str9 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '0':
                    z18 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '1':
                    zzbvmVar = zzbvm.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '3':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '5':
                    z19 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '8':
                    str18 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '9':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ':':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ';':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '<':
                    if (((Boolean) zzbep.zzgX.zzl()).booleanValue()) {
                        str15 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '=':
                    z20 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '>':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbw.zzi(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '?':
                    z21 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '@':
                    str20 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'A':
                    z22 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'B':
                    list3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'C':
                    z23 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'D':
                    str16 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'E':
                    str17 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'F':
                    z24 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'G':
                    z25 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'H':
                    i12 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'I':
                    str19 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'J':
                    list4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'K':
                    z26 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'L':
                    if (((Boolean) zzbep.zzZ.zzl()).booleanValue()) {
                        map = com.google.android.gms.ads.internal.util.zzbw.zze(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i15;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i16;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str22;
        this.zzl = str21;
        this.zzm = zzbytVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list5;
        this.zzr = i9;
        this.zzs = list6;
        this.zzt = zzfgyVar;
        this.zzu = list7;
        this.zzv = list8;
        this.zzx = str2;
        this.zzw = jSONObject12;
        this.zzy = str3;
        this.zzz = str4;
        this.zzA = str5;
        this.zzB = zzcacVar;
        this.zzC = str6;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z8;
        this.zzL = z9;
        this.zzM = z10;
        this.zzN = z11;
        this.zzO = z12;
        this.zzP = z13;
        this.zzQ = z14;
        this.zzR = i13;
        this.zzS = i10;
        this.zzU = z15;
        this.zzV = str7;
        this.zzW = new zzfhr(jSONObject9);
        this.zzX = z16;
        this.zzY = z17;
        this.zzZ = i11;
        this.zzaa = str8;
        this.zzab = i14;
        this.zzac = str9;
        this.zzad = z18;
        this.zzae = zzbvmVar;
        this.zzaf = zzsVar;
        this.zzag = str10;
        this.zzah = z19;
        this.zzai = jSONObject10;
        this.zzF = str11;
        this.zzG = str12;
        this.zzH = str13;
        this.zzI = str14;
        this.zzJ = str15;
        this.zzaj = z20;
        this.zzak = jSONObject11;
        this.zzal = z21;
        this.zzam = str20;
        this.zzan = z22;
        this.zze = list3;
        this.zzT = z23;
        this.zzao = str16;
        this.zzap = str17;
        this.zzaq = str18;
        this.zzar = z24;
        this.zzas = z25;
        this.zzat = i12;
        this.zzav = list4;
        this.zzau = str19;
        this.zzaw = z26;
        this.zzax = map;
    }

    public static String zza(int i9) {
        switch (i9) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        if ("rewarded_interstitial".equals(str)) {
            return 7;
        }
        return 0;
    }

    private static int zzc(int i9) {
        if (i9 == 0 || i9 == 1 || i9 == 3) {
            return i9;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            return 7;
        }
        return -1;
    }
}
