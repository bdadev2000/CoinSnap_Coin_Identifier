package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.l0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f11248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f11249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11250d;

    public m(Bundle bundle, n nVar, r rVar) {
        this.f11248b = bundle;
        this.f11249c = nVar;
        this.f11250d = rVar;
    }

    @Override // com.facebook.internal.l0
    public final void a(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f11248b;
        n nVar = this.f11249c;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e2) {
                nVar.f().e(ni.a.q(nVar.f().f11301i, "Caught exception", e2.getMessage(), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        nVar.o(bundle, this.f11250d);
    }

    @Override // com.facebook.internal.l0
    public final void b(com.facebook.q qVar) {
        String message;
        n nVar = this.f11249c;
        u f10 = nVar.f();
        r rVar = nVar.f().f11301i;
        if (qVar == null) {
            message = null;
        } else {
            message = qVar.getMessage();
        }
        f10.e(ni.a.q(rVar, "Caught exception", message, null));
    }
}
