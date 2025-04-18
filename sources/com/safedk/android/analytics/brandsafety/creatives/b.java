package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29502b = "MraidParser";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29503c = "markup";
    private static final String d = "advDomain";
    private static final String e = "creativeId";

    /* renamed from: f, reason: collision with root package name */
    private static final String f29504f = "content";

    /* renamed from: a, reason: collision with root package name */
    protected JSONObject f29505a;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f29506a;

        /* renamed from: b, reason: collision with root package name */
        public String f29507b;

        /* renamed from: c, reason: collision with root package name */
        public String f29508c;
        public String d;
        public String e;

        public a() {
        }
    }

    public b(JSONObject jSONObject) {
        this.f29505a = jSONObject;
    }

    public a a() {
        a aVar = new a();
        if (this.f29505a != null) {
            try {
                String string = this.f29505a.getString("content");
                aVar.f29506a = this.f29505a.getString(e);
                aVar.f29508c = this.f29505a.optString(d, null);
                aVar.d = a(new JSONObject(string));
                Logger.d(f29502b, "mraid Markup (url encoded)=" + aVar.d);
                aVar.f29507b = a(aVar.d);
                Logger.d(f29502b, "mraid clickURL = " + aVar.f29507b);
                aVar.e = b(aVar.d);
                Logger.d(f29502b, "mraid videoUrl = " + aVar.e);
            } catch (JSONException e2) {
                Logger.d(f29502b, "mraid error " + e2.getMessage() + " parsing" + this.f29505a.toString());
            }
        }
        return aVar;
    }

    protected String a(JSONObject jSONObject) throws JSONException {
        return jSONObject.getString("markup");
    }

    private String a(String str) {
        Matcher matcher = com.safedk.android.utils.f.ax().matcher(str);
        if (matcher.find()) {
            return c(matcher.group(0));
        }
        return null;
    }

    private String b(String str) {
        Matcher matcher = com.safedk.android.utils.f.ay().matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String c(String str) {
        String e2 = k.e(com.safedk.android.utils.f.az(), str);
        Logger.d(f29502b, "found click url: " + e2);
        return e2;
    }
}
