package com.facebook.login;

import com.facebook.C1849l;
import com.facebook.F;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements com.facebook.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13703a;
    public final /* synthetic */ j b;

    public /* synthetic */ e(j jVar, int i9) {
        this.f13703a = i9;
        this.b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.login.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.facebook.l, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.login.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.login.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.RuntimeException] */
    @Override // com.facebook.v
    public final void a(F f9) {
        switch (this.f13703a) {
            case 0:
                ?? r12 = this.b;
                G7.j.e(r12, "this$0");
                if (!r12.f13717g.get()) {
                    com.facebook.p pVar = f9.f13407c;
                    if (pVar != null) {
                        int i9 = pVar.f13793d;
                        if (i9 == 1349174 || i9 == 1349172) {
                            r12.i();
                            return;
                        }
                        if (i9 == 1349152) {
                            h hVar = r12.f13720j;
                            if (hVar != null) {
                                J2.b bVar = J2.b.f1569a;
                                J2.b.a(hVar.f13710c);
                            }
                            q qVar = r12.m;
                            if (qVar != null) {
                                r12.k(qVar);
                                return;
                            } else {
                                r12.e();
                                return;
                            }
                        }
                        if (i9 == 1349173) {
                            r12.e();
                            return;
                        }
                        C1849l c1849l = pVar.f13799k;
                        C1849l c1849l2 = c1849l;
                        if (c1849l == null) {
                            c1849l2 = new RuntimeException();
                        }
                        r12.f(c1849l2);
                        return;
                    }
                    try {
                        JSONObject jSONObject = f9.b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        G7.j.d(string, "resultObject.getString(\"access_token\")");
                        r12.g(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e4) {
                        r12.f(new RuntimeException(e4));
                        return;
                    }
                }
                return;
            default:
                ?? r13 = this.b;
                G7.j.e(r13, "this$0");
                if (!r13.f13721k) {
                    com.facebook.p pVar2 = f9.f13407c;
                    if (pVar2 != null) {
                        C1849l c1849l3 = pVar2.f13799k;
                        C1849l c1849l4 = c1849l3;
                        if (c1849l3 == null) {
                            c1849l4 = new RuntimeException();
                        }
                        r13.f(c1849l4);
                        return;
                    }
                    JSONObject jSONObject2 = f9.b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    ?? obj = new Object();
                    try {
                        String string2 = jSONObject2.getString("user_code");
                        obj.f13710c = string2;
                        obj.b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                        obj.f13711d = jSONObject2.getString("code");
                        obj.f13712f = jSONObject2.getLong("interval");
                        r13.j(obj);
                        return;
                    } catch (JSONException e9) {
                        r13.f(new RuntimeException(e9));
                        return;
                    }
                }
                return;
        }
    }
}
