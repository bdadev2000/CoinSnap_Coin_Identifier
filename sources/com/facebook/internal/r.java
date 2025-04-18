package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r extends v0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f11070q = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11071p;

    public r(FragmentActivity fragmentActivity, String str, String expectedRedirectUrl) {
        super(fragmentActivity, str);
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.f11106c = expectedRedirectUrl;
    }

    public static void f(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.v0
    public final Bundle b(String str) {
        Bundle F = m0.F(Uri.parse(str).getQuery());
        String string = F.getString("bridge_args");
        F.remove("bridge_args");
        if (!m0.z(string)) {
            try {
                F.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", g.a(new JSONObject(string)));
            } catch (JSONException unused) {
                com.facebook.x xVar = com.facebook.x.a;
            }
        }
        String string2 = F.getString("method_results");
        F.remove("method_results");
        if (!m0.z(string2)) {
            try {
                F.putBundle("com.facebook.platform.protocol.RESULT_ARGS", g.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                com.facebook.x xVar2 = com.facebook.x.a;
            }
        }
        F.remove("version");
        g0 g0Var = g0.a;
        int i10 = 0;
        if (!m6.a.b(g0.class)) {
            try {
                i10 = g0.f11037d[0].intValue();
            } catch (Throwable th2) {
                m6.a.a(g0.class, th2);
            }
        }
        F.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i10);
        return F;
    }

    @Override // com.facebook.internal.v0, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        u0 u0Var = this.f11108f;
        if (this.f11115m && !this.f11113k && u0Var != null && u0Var.isShown()) {
            if (this.f11071p) {
                return;
            }
            this.f11071p = true;
            u0Var.loadUrl(Intrinsics.stringPlus("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.d(this, 22), 1500L);
            return;
        }
        super.cancel();
    }
}
