package M2;

import G7.j;
import com.facebook.F;
import com.facebook.appevents.n;
import com.facebook.v;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1985a;
    public final /* synthetic */ List b;

    public /* synthetic */ c(List list, int i9) {
        this.f1985a = i9;
        this.b = list;
    }

    @Override // com.facebook.v
    public final void a(F f9) {
        Boolean valueOf;
        Boolean valueOf2;
        switch (this.f1985a) {
            case 0:
                List list = this.b;
                if (!O2.a.b(d.class)) {
                    try {
                        j.e(list, "$validReports");
                        try {
                            if (f9.f13407c == null) {
                                JSONObject jSONObject = f9.f13408d;
                                if (jSONObject == null) {
                                    valueOf = null;
                                } else {
                                    valueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                                }
                                if (j.a(valueOf, Boolean.TRUE)) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        n.e(((L2.d) it.next()).f1717a);
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        O2.a.a(d.class, th);
                        return;
                    }
                }
                return;
            default:
                List list2 = this.b;
                j.e(list2, "$validReports");
                try {
                    if (f9.f13407c == null) {
                        JSONObject jSONObject2 = f9.f13408d;
                        if (jSONObject2 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (j.a(valueOf2, Boolean.TRUE)) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                n.e(((L2.d) it2.next()).f1717a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }
}
