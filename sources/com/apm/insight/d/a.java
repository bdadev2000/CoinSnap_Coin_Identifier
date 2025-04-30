package com.apm.insight.d;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.g;
import com.apm.insight.i;
import com.apm.insight.k.d;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.p;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static void a(String str) {
        a(str, null, null, null);
    }

    public static void a(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable g gVar) {
        a(str, map, map2, null, gVar);
    }

    public static void a(final String str, @Nullable final Map<? extends String, ? extends String> map, @Nullable final Map<String, String> map2, @Nullable final Map<String, String> map3, @Nullable final g gVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.d.a.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean z8;
                    try {
                        com.apm.insight.entity.a a6 = f.a().a(CrashType.DART, com.apm.insight.entity.a.a(currentTimeMillis, i.g(), str));
                        if (map != null) {
                            JSONObject optJSONObject = a6.h().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            com.apm.insight.entity.a.a(optJSONObject, (Map<? extends String, ? extends String>) map);
                            a6.a("custom", optJSONObject);
                        }
                        if (map2 != null) {
                            JSONObject optJSONObject2 = a6.h().optJSONObject("custom_long");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            com.apm.insight.entity.a.a(optJSONObject2, (Map<? extends String, ? extends String>) map2);
                            a6.a("custom_long", optJSONObject2);
                        }
                        if (map3 != null) {
                            JSONObject optJSONObject3 = a6.h().optJSONObject("filters");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new JSONObject();
                                a6.a("filters", optJSONObject3);
                            }
                            com.apm.insight.entity.a.a(optJSONObject3, (Map<? extends String, ? extends String>) map3);
                        }
                        z8 = d.a().a(currentTimeMillis, a6.h());
                    } catch (Throwable unused) {
                        z8 = false;
                    }
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        try {
                            gVar2.a(z8);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
