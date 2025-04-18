package com.bytedance.sdk.component.DSW.tN;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN {
    private static final Object AlY = new Object();
    private AlY Sg = new AlY();
    private Context YFl;
    private boolean tN;
    private int wN;

    public wN(Context context, boolean z10, int i10) {
        this.YFl = context;
        this.tN = z10;
        this.wN = i10;
    }

    public void Sg() {
        try {
            String YFl = com.bytedance.sdk.component.DSW.AlY.AlY.YFl(this.YFl, 1, this.wN);
            if (TextUtils.isEmpty(YFl)) {
                return;
            }
            AlY Sg = Sg(new JSONObject(YFl));
            if (Sg != null) {
                Sg.toString();
            }
            if (Sg != null) {
                this.Sg = Sg;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:7:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:21:0x006c, B:24:0x006f, B:26:0x0075, B:27:0x007e, B:29:0x0084, B:30:0x008e, B:32:0x0094, B:35:0x00a3, B:38:0x00c1, B:51:0x00fd, B:62:0x00c8, B:64:0x00af, B:66:0x00bc), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.DSW.tN.wN.YFl(org.json.JSONObject):void");
    }

    public AlY tN() {
        return this.Sg;
    }

    private AlY Sg(JSONObject jSONObject) {
        try {
            AlY alY = new AlY();
            if (jSONObject.has("local_enable")) {
                alY.YFl = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                alY.Sg = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String string = jSONArray.getString(i10);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                alY.tN = hashMap;
            } else {
                alY.tN = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                alY.AlY = hashMap2;
            } else {
                alY.AlY = null;
            }
            alY.wN = jSONObject.optInt("req_to_cnt", alY.wN);
            alY.f10315vc = jSONObject.optInt("req_to_api_cnt", alY.f10315vc);
            alY.DSW = jSONObject.optInt("req_to_ip_cnt", alY.DSW);
            alY.qsH = jSONObject.optInt("req_err_cnt", alY.qsH);
            alY.NjR = jSONObject.optInt("req_err_api_cnt", alY.NjR);
            alY.f10314nc = jSONObject.optInt("req_err_ip_cnt", alY.f10314nc);
            alY.eT = jSONObject.optInt("update_interval", alY.eT);
            alY.YoT = jSONObject.optInt("update_random_range", alY.YoT);
            alY.GA = jSONObject.optString("http_code_black", alY.GA);
            return alY;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void YFl() {
        if (this.tN) {
            String string = this.YFl.getSharedPreferences(qsH.YFl().YFl(this.wN).YFl(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                AlY Sg = Sg(new JSONObject(string));
                if (Sg != null) {
                    this.Sg = Sg;
                }
                if (Sg == null) {
                    return;
                }
                Sg.toString();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
