package k6;

import com.facebook.appevents.g;
import com.facebook.b0;
import com.facebook.k0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements b0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20279b;

    public /* synthetic */ b(List list, int i10) {
        this.a = i10;
        this.f20279b = list;
    }

    @Override // com.facebook.b0
    public final void a(k0 response) {
        int i10 = this.a;
        Boolean bool = null;
        List validReports = this.f20279b;
        switch (i10) {
            case 0:
                if (!m6.a.b(c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(validReports, "$validReports");
                        Intrinsics.checkNotNullParameter(response, "response");
                        try {
                            if (response.f11168c == null) {
                                JSONObject jSONObject = response.f11169d;
                                if (jSONObject != null) {
                                    bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                                }
                                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                                    Iterator it = validReports.iterator();
                                    while (it.hasNext()) {
                                        g.e(((j6.c) it.next()).a);
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        m6.a.a(c.class, th2);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f11168c == null) {
                        JSONObject jSONObject2 = response.f11169d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                            Iterator it2 = validReports.iterator();
                            while (it2.hasNext()) {
                                g.e(((j6.c) it2.next()).a);
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
