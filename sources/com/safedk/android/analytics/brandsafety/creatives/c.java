package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.b;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29510b = "bundleId";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29511c = "dynamicMarkup";

    public c(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    public b.a a() {
        b.a a2 = super.a();
        if (this.f29505a.optString(f29510b, null) == null) {
            a2.f29507b = a(a2.d);
        }
        return a2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.b
    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString(f29511c);
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.K().matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        return matcher.group(1);
    }
}
