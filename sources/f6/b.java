package f6;

import android.util.Log;
import com.facebook.internal.m0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17682b;
    public static final b a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f17683c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f17684d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f17683c).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null && Intrinsics.areEqual(str, aVar.a)) {
                        for (String str3 : aVar.f17681b.keySet()) {
                            if (Intrinsics.areEqual(str2, str3)) {
                                return (String) aVar.f17681b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.w("f6.b", "getMatchedRuleType failed", e2);
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        String str;
        if (m6.a.b(this)) {
            return;
        }
        try {
            z zVar = z.a;
            boolean z10 = false;
            x f10 = z.f(com.facebook.x.b(), false);
            if (f10 != null && (str = f10.f11132m) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    JSONObject jSONObject = new JSONObject(str);
                    ArrayList arrayList = f17683c;
                    arrayList.clear();
                    CopyOnWriteArraySet copyOnWriteArraySet = f17684d;
                    copyOnWriteArraySet.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            a aVar = new a(key, new HashMap());
                            if (optJSONObject != null) {
                                HashMap h10 = m0.h(optJSONObject);
                                Intrinsics.checkNotNullParameter(h10, "<set-?>");
                                aVar.f17681b = h10;
                                arrayList.add(aVar);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                copyOnWriteArraySet.add(aVar.a);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
