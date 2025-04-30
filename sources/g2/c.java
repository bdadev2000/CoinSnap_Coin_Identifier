package G2;

import G7.j;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import u7.AbstractC2816g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1265a = new Object();

    public static final Bundle a(d dVar, String str, List list) {
        if (O2.a.b(c.class)) {
            return null;
        }
        try {
            j.e(str, "applicationId");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, dVar.b);
            bundle.putString(MBridgeConstans.APP_ID, str);
            if (d.CUSTOM_APP_EVENTS == dVar) {
                JSONArray b = f1265a.b(str, list);
                if (b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            O2.a.a(c.class, th);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        boolean equals;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList U8 = AbstractC2816g.U(list);
            B2.b.b(U8);
            boolean z8 = false;
            if (!O2.a.b(this)) {
                try {
                    t f9 = w.f(str, false);
                    if (f9 != null) {
                        z8 = f9.f13658a;
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            }
            Iterator it = U8.iterator();
            while (it.hasNext()) {
                com.facebook.appevents.e eVar = (com.facebook.appevents.e) it.next();
                String str2 = eVar.f13481g;
                JSONObject jSONObject = eVar.b;
                if (str2 == null) {
                    equals = true;
                } else {
                    String jSONObject2 = jSONObject.toString();
                    j.d(jSONObject2, "jsonObject.toString()");
                    equals = L4.f.b(jSONObject2).equals(str2);
                }
                if (equals) {
                    boolean z9 = eVar.f13478c;
                    if ((!z9) || (z9 && z8)) {
                        jSONArray.put(jSONObject);
                    }
                } else {
                    j.j(eVar, "Event with invalid checksum: ");
                    r rVar = r.f13801a;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return null;
        }
    }
}
