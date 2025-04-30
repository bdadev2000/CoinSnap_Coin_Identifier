package L2;

import G7.j;
import U4.r;
import com.facebook.F;
import com.facebook.appevents.n;
import com.facebook.v;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1709a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i9) {
        this.f1709a = i9;
        this.b = obj;
    }

    @Override // com.facebook.v
    public final void a(F f9) {
        Boolean valueOf;
        Boolean valueOf2;
        switch (this.f1709a) {
            case 0:
                d dVar = (d) this.b;
                j.e(dVar, "$instrumentData");
                try {
                    if (f9.f13407c == null) {
                        JSONObject jSONObject = f9.f13408d;
                        if (jSONObject == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                        }
                        if (j.a(valueOf, Boolean.TRUE)) {
                            n.e(dVar.f1717a);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                j.e(arrayList, "$validReports");
                try {
                    if (f9.f13407c == null) {
                        JSONObject jSONObject2 = f9.f13408d;
                        if (jSONObject2 == null) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (j.a(valueOf2, Boolean.TRUE)) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                n.e(((P2.a) it.next()).f2412a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
            default:
                r rVar = (r) this.b;
                j.e(rVar, "$refreshResult");
                JSONObject jSONObject3 = f9.f13408d;
                if (jSONObject3 != null) {
                    rVar.f3324a = jSONObject3.optString("access_token");
                    rVar.b = jSONObject3.optInt("expires_at");
                    rVar.f3325c = jSONObject3.optInt("expires_in");
                    rVar.f3327e = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    rVar.f3326d = jSONObject3.optString("graph_domain", null);
                    return;
                }
                return;
        }
    }
}
