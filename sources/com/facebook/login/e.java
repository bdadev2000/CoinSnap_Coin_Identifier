package com.facebook.login;

import com.facebook.k0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements com.facebook.b0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11198b;

    public /* synthetic */ e(i iVar, int i10) {
        this.a = i10;
        this.f11198b = iVar;
    }

    @Override // com.facebook.b0
    public final void a(k0 response) {
        boolean z10 = false;
        switch (this.a) {
            case 0:
                i this$0 = this.f11198b;
                int i10 = i.f11223n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$0.f11228g.get()) {
                    com.facebook.u uVar = response.f11168c;
                    if (uVar != null) {
                        int i11 = uVar.f11406d;
                        if (i11 == 1349174 || i11 == 1349172) {
                            z10 = true;
                        }
                        if (z10) {
                            this$0.k();
                            return;
                        }
                        if (i11 == 1349152) {
                            g gVar = this$0.f11231j;
                            if (gVar != null) {
                                h6.b bVar = h6.b.a;
                                h6.b.a(gVar.f11214c);
                            }
                            r rVar = this$0.f11234m;
                            if (rVar != null) {
                                this$0.m(rVar);
                                return;
                            } else {
                                this$0.g();
                                return;
                            }
                        }
                        if (i11 == 1349173) {
                            this$0.g();
                            return;
                        }
                        com.facebook.q qVar = uVar.f11412k;
                        if (qVar == null) {
                            qVar = new com.facebook.q();
                        }
                        this$0.h(qVar);
                        return;
                    }
                    try {
                        JSONObject jSONObject = response.f11167b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                        this$0.i(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e2) {
                        this$0.h(new com.facebook.q(e2));
                        return;
                    }
                }
                return;
            default:
                int i12 = i.f11223n;
                i this$02 = this.f11198b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$02.f11232k) {
                    com.facebook.u uVar2 = response.f11168c;
                    if (uVar2 != null) {
                        com.facebook.q qVar2 = uVar2.f11412k;
                        if (qVar2 == null) {
                            qVar2 = new com.facebook.q();
                        }
                        this$02.h(qVar2);
                        return;
                    }
                    JSONObject jSONObject2 = response.f11167b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    g gVar2 = new g();
                    try {
                        String string2 = jSONObject2.getString("user_code");
                        gVar2.f11214c = string2;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        gVar2.f11213b = format;
                        gVar2.f11215d = jSONObject2.getString("code");
                        gVar2.f11216f = jSONObject2.getLong("interval");
                        this$02.l(gVar2);
                        return;
                    } catch (JSONException e10) {
                        this$02.h(new com.facebook.q(e10));
                        return;
                    }
                }
                return;
        }
    }
}
