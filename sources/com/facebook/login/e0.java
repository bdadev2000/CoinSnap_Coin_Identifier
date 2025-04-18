package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.o0;
import com.facebook.internal.q0;
import com.facebook.internal.v0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 extends o0 {

    /* renamed from: g, reason: collision with root package name */
    public String f11199g;

    /* renamed from: h, reason: collision with root package name */
    public q f11200h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f11201i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11202j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11203k;

    /* renamed from: l, reason: collision with root package name */
    public String f11204l;

    /* renamed from: m, reason: collision with root package name */
    public String f11205m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 this$0, FragmentActivity context, String applicationId, Bundle parameters) {
        super(context, applicationId, parameters, 0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f11199g = "fbconnect://success";
        this.f11200h = q.NATIVE_WITH_FALLBACK;
        this.f11201i = b0.FACEBOOK;
    }

    public final v0 a() {
        String str;
        Bundle bundle = this.f11063e;
        if (bundle != null) {
            bundle.putString("redirect_uri", this.f11199g);
            bundle.putString("client_id", this.f11060b);
            String str2 = this.f11204l;
            if (str2 != null) {
                bundle.putString("e2e", str2);
                if (this.f11201i == b0.INSTAGRAM) {
                    str = "token,signed_request,graph_domain,granted_scopes";
                } else {
                    str = "token,signed_request,graph_domain";
                }
                bundle.putString("response_type", str);
                bundle.putString("return_scopes", "true");
                String str3 = this.f11205m;
                if (str3 != null) {
                    bundle.putString("auth_type", str3);
                    bundle.putString("login_behavior", this.f11200h.name());
                    if (this.f11202j) {
                        bundle.putString("fx_app", this.f11201i.f11190b);
                    }
                    if (this.f11203k) {
                        bundle.putString("skip_dedupe", "true");
                    }
                    int i10 = v0.f11104o;
                    Context context = this.a;
                    if (context != null) {
                        b0 targetApp = this.f11201i;
                        q0 q0Var = this.f11062d;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
                        v0.a(context);
                        return new v0(context, "oauth", bundle, targetApp, q0Var);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                }
                Intrinsics.throwUninitializedPropertyAccessException("authType");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("e2e");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }
}
