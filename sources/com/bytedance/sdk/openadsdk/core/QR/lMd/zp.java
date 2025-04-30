package com.bytedance.sdk.openadsdk.core.QR.lMd;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends KS implements Comparable<zp> {
    public long zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.QR.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102zp {
        private KS.EnumC0101KS KS = KS.EnumC0101KS.TRACKING_URL;
        private boolean jU = false;
        private final long lMd;
        private final String zp;

        public C0102zp(String str, long j7) {
            this.zp = str;
            this.lMd = j7;
        }

        public zp zp() {
            return new zp(this.lMd, this.zp, this.KS, Boolean.valueOf(this.jU));
        }
    }

    public zp(long j7, String str, KS.EnumC0101KS enumC0101KS, Boolean bool) {
        super(str, enumC0101KS, bool);
        this.zp = j7;
    }

    public static int zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Float.parseFloat(split[2]) * 1000.0f) + (Integer.parseInt(split[1]) * 60000) + (Integer.parseInt(split[0]) * Constants.ONE_HOUR));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean zp(long j7) {
        return this.zp <= j7 && !COT();
    }

    @Override // java.lang.Comparable
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public int compareTo(zp zpVar) {
        if (zpVar == null) {
            return 1;
        }
        long j7 = this.zp;
        long j9 = zpVar.zp;
        if (j7 > j9) {
            return 1;
        }
        return j7 < j9 ? -1 : 0;
    }

    public JSONObject zp() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, KS());
        jSONObject.put("trackingMilliseconds", this.zp);
        return jSONObject;
    }
}
