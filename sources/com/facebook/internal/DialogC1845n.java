package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1845n extends O {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f13622q = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13623p;

    public static void g(DialogC1845n dialogC1845n) {
        G7.j.e(dialogC1845n, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.O
    public final Bundle c(String str) {
        Bundle G3 = H.G(Uri.parse(str).getQuery());
        String string = G3.getString("bridge_args");
        G3.remove("bridge_args");
        if (!H.B(string)) {
            try {
                G3.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", AbstractC1837f.a(new JSONObject(string)));
            } catch (JSONException unused) {
                com.facebook.r rVar = com.facebook.r.f13801a;
            }
        }
        String string2 = G3.getString("method_results");
        G3.remove("method_results");
        if (!H.B(string2)) {
            try {
                G3.putBundle("com.facebook.platform.protocol.RESULT_ARGS", AbstractC1837f.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                com.facebook.r rVar2 = com.facebook.r.f13801a;
            }
        }
        G3.remove("version");
        B b = B.f13569a;
        int i9 = 0;
        if (!O2.a.b(B.class)) {
            try {
                i9 = B.f13571d[0].intValue();
            } catch (Throwable th) {
                O2.a.a(B.class, th);
            }
        }
        G3.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i9);
        return G3;
    }

    @Override // com.facebook.internal.O, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        N n2 = this.f13597f;
        if (this.m && !this.f13602k && n2 != null && n2.isShown()) {
            if (this.f13623p) {
                return;
            }
            this.f13623p = true;
            n2.loadUrl(G7.j.j("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new D3.b(this, 25), 1500L);
            return;
        }
        super.cancel();
    }
}
