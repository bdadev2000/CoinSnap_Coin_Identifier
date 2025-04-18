package kd;

import a6.k;
import androidx.appcompat.widget.r3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public final i a;

    public a(i iVar) {
        this.a = iVar;
    }

    public static a a(b bVar) {
        i iVar = (i) bVar;
        com.facebook.internal.i.a(bVar, "AdSession is null");
        if (iVar.f20672e.f23595c == null) {
            com.facebook.internal.i.h(iVar);
            a aVar = new a(iVar);
            iVar.f20672e.f23595c = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public final void b() {
        boolean z10;
        boolean z11;
        i iVar = this.a;
        com.facebook.internal.i.h(iVar);
        com.facebook.internal.i.o(iVar);
        if (iVar.f20673f && !iVar.f20674g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            try {
                iVar.f();
            } catch (Exception unused) {
            }
        }
        if (iVar.f20673f && !iVar.f20674g) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!iVar.f20676i) {
                pd.a aVar = iVar.f20672e;
                b6.b.f2297i.a(aVar.f(), "publishImpressionEvent", aVar.a);
                iVar.f20676i = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public final void c() {
        i iVar = this.a;
        com.facebook.internal.i.d(iVar);
        com.facebook.internal.i.o(iVar);
        if (!iVar.f20677j) {
            pd.a aVar = iVar.f20672e;
            b6.b.f2297i.a(aVar.f(), "publishLoadedEvent", null, aVar.a);
            iVar.f20677j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    public final void d(r3 r3Var) {
        i iVar = this.a;
        com.facebook.internal.i.d(iVar);
        com.facebook.internal.i.o(iVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", r3Var.f1010b);
            if (r3Var.f1010b) {
                jSONObject.put("skipOffset", (Float) r3Var.f1012d);
            }
            jSONObject.put("autoPlay", r3Var.f1011c);
            jSONObject.put("position", (ld.d) r3Var.f1013e);
        } catch (JSONException e2) {
            k.b("VastProperties: JSON error", e2);
        }
        if (!iVar.f20677j) {
            pd.a aVar = iVar.f20672e;
            b6.b.f2297i.a(aVar.f(), "publishLoadedEvent", jSONObject, aVar.a);
            iVar.f20677j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
