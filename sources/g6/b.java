package g6;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.m0;
import com.facebook.x;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.g;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f18212c;
    public static final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f18211b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f18213d = new AtomicBoolean(false);

    public static final void a(String pathID, String predictedEvent) {
        if (m6.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f18213d.get()) {
                a.c();
            }
            LinkedHashMap linkedHashMap = f18211b;
            linkedHashMap.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f18212c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", m0.D(MapsKt.toMap(linkedHashMap))).apply();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String text) {
        if (m6.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MimeTypes.BASE_TYPE_TEXT, text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = g.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return m0.K(jSONObject.toString());
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (m6.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f18213d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = x.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f18212c = sharedPreferences;
            LinkedHashMap linkedHashMap = f18211b;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
                if (string != null) {
                    str = string;
                }
                linkedHashMap.putAll(m0.C(str));
                atomicBoolean.set(true);
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
            throw null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
