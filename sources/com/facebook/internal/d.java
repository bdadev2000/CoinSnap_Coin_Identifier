package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: b */
    public static d f11029b;
    public final Context a;

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }

    public static final /* synthetic */ d a() {
        if (m6.a.b(d.class)) {
            return null;
        }
        try {
            return f11029b;
        } catch (Throwable th2) {
            m6.a.a(d.class, th2);
            return null;
        }
    }

    public final void finalize() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (!m6.a.b(this)) {
                try {
                    m1.b a = m1.b.a(this.a);
                    Intrinsics.checkNotNullExpressionValue(a, "getInstance(applicationContext)");
                    a.d(this);
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (m6.a.b(this)) {
            return;
        }
        try {
            com.facebook.appevents.r rVar = new com.facebook.appevents.r(context);
            Set<String> set = null;
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("event_name");
            }
            String stringPlus = Intrinsics.stringPlus("bf_", stringExtra);
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra("event_args");
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            com.facebook.x xVar = com.facebook.x.a;
            if (com.facebook.u0.b()) {
                rVar.a.d(bundle, stringPlus);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
