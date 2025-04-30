package I2;

import G7.j;
import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.H;
import com.facebook.r;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f1434c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f1433a = new Object();
    public static final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f1435d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (O2.a.b(b.class)) {
            return;
        }
        try {
            j.e(str2, "predictedEvent");
            if (!f1435d.get()) {
                f1433a.c();
            }
            LinkedHashMap linkedHashMap = b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = f1434c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", H.F(AbstractC2829t.c0(linkedHashMap))).apply();
            } else {
                j.k("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            O2.a.a(b.class, th);
        }
    }

    public static final String b(View view, String str) {
        if (O2.a.b(b.class)) {
            return null;
        }
        try {
            j.e(str, MimeTypes.BASE_TYPE_TEXT);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MimeTypes.BASE_TYPE_TEXT, str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = A2.g.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return H.M(jSONObject.toString());
        } catch (Throwable th) {
            O2.a.a(b.class, th);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (O2.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f1435d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = r.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            j.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f1434c = sharedPreferences;
            LinkedHashMap linkedHashMap = b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(H.E(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
