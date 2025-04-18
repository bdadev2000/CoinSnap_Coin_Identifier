package com.bytedance.sdk.openadsdk.core.YoT.Sg;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends tN implements Comparable<YFl> {
    public long YFl;

    /* renamed from: com.bytedance.sdk.openadsdk.core.YoT.Sg.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0117YFl {
        private final long Sg;
        private final String YFl;
        private tN.EnumC0118tN tN = tN.EnumC0118tN.TRACKING_URL;
        private boolean AlY = false;

        public C0117YFl(String str, long j3) {
            this.YFl = str;
            this.Sg = j3;
        }

        public YFl YFl() {
            return new YFl(this.Sg, this.YFl, this.tN, Boolean.valueOf(this.AlY));
        }
    }

    public YFl(long j3, String str, tN.EnumC0118tN enumC0118tN, Boolean bool) {
        super(str, enumC0118tN, bool);
        this.YFl = j3;
    }

    public static int YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) ((Float.parseFloat(split[2]) * 1000.0f) + (Integer.parseInt(split[1]) * 60 * 1000) + (Integer.parseInt(split[0]) * 60 * 60 * 1000));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean YFl(long j3) {
        return this.YFl <= j3 && !wN();
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(YFl yFl) {
        if (yFl == null) {
            return 1;
        }
        long j3 = this.YFl;
        long j10 = yFl.YFl;
        if (j3 > j10) {
            return 1;
        }
        return j3 < j10 ? -1 : 0;
    }

    public JSONObject YFl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, tN());
        jSONObject.put("trackingMilliseconds", this.YFl);
        return jSONObject;
    }
}
