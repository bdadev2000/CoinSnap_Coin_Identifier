package com.bytedance.sdk.component.QR.KS;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class COT {
    private static final Object jU = new Object();
    private int COT;
    private boolean KS;
    private jU lMd = new jU();
    private Context zp;

    public COT(Context context, boolean z8, int i9) {
        this.zp = context;
        this.KS = z8;
        this.COT = i9;
    }

    public jU KS() {
        return this.lMd;
    }

    public void lMd() {
        try {
            String zp = com.bytedance.sdk.component.QR.jU.jU.zp(this.zp, 1, this.COT);
            if (TextUtils.isEmpty(zp)) {
                return;
            }
            jU lMd = lMd(new JSONObject(zp));
            if (lMd != null) {
                lMd.toString();
            }
            if (lMd != null) {
                this.lMd = lMd;
            }
        } catch (Throwable th) {
            th.getMessage();
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
    public void zp(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.QR.KS.COT.zp(org.json.JSONObject):void");
    }

    private jU lMd(JSONObject jSONObject) {
        try {
            jU jUVar = new jU();
            if (jSONObject.has("local_enable")) {
                jUVar.zp = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                jUVar.lMd = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        String string = jSONArray.getString(i9);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                jUVar.KS = hashMap;
            } else {
                jUVar.KS = null;
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
                jUVar.jU = hashMap2;
            } else {
                jUVar.jU = null;
            }
            jUVar.COT = jSONObject.optInt("req_to_cnt", jUVar.COT);
            jUVar.HWF = jSONObject.optInt("req_to_api_cnt", jUVar.HWF);
            jUVar.QR = jSONObject.optInt("req_to_ip_cnt", jUVar.QR);
            jUVar.ku = jSONObject.optInt("req_err_cnt", jUVar.ku);
            jUVar.YW = jSONObject.optInt("req_err_api_cnt", jUVar.YW);
            jUVar.dT = jSONObject.optInt("req_err_ip_cnt", jUVar.dT);
            jUVar.Bj = jSONObject.optInt("update_interval", jUVar.Bj);
            jUVar.vDp = jSONObject.optInt("update_random_range", jUVar.vDp);
            jUVar.tG = jSONObject.optString("http_code_black", jUVar.tG);
            return jUVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void zp() {
        if (this.KS) {
            String string = this.zp.getSharedPreferences(ku.zp().zp(this.COT).zp(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                jU lMd = lMd(new JSONObject(string));
                if (lMd != null) {
                    this.lMd = lMd;
                }
                if (lMd == null) {
                    return;
                }
                lMd.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
