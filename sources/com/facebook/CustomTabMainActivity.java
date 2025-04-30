package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C1835d;
import u0.C2747b;

/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13392d = G7.j.j(".extra_action", "CustomTabMainActivity");

    /* renamed from: f, reason: collision with root package name */
    public static final String f13393f = G7.j.j(".extra_params", "CustomTabMainActivity");

    /* renamed from: g, reason: collision with root package name */
    public static final String f13394g = G7.j.j(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: h, reason: collision with root package name */
    public static final String f13395h = G7.j.j(".extra_url", "CustomTabMainActivity");

    /* renamed from: i, reason: collision with root package name */
    public static final String f13396i = G7.j.j(".extra_targetApp", "CustomTabMainActivity");

    /* renamed from: j, reason: collision with root package name */
    public static final String f13397j = G7.j.j(".action_refresh", "CustomTabMainActivity");

    /* renamed from: k, reason: collision with root package name */
    public static final String f13398k = G7.j.j(".no_activity_exception", "CustomTabMainActivity");
    public boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public C1835d f13399c;

    public final void a(int i9, Intent intent) {
        Bundle bundle;
        C1835d c1835d = this.f13399c;
        if (c1835d != null) {
            C2747b.a(this).d(c1835d);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f13395h);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = com.facebook.internal.H.G(parse.getQuery());
                bundle.putAll(com.facebook.internal.H.G(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            com.facebook.internal.B b = com.facebook.internal.B.f13569a;
            Intent intent2 = getIntent();
            G7.j.d(intent2, "intent");
            Intent e4 = com.facebook.internal.B.e(intent2, bundle, null);
            if (e4 != null) {
                intent = e4;
            }
            setResult(i9, intent);
        } else {
            com.facebook.internal.B b8 = com.facebook.internal.B.f13569a;
            Intent intent3 = getIntent();
            G7.j.d(intent3, "intent");
            setResult(i9, com.facebook.internal.B.e(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        G7.j.e(intent, "intent");
        super.onNewIntent(intent);
        if (G7.j.a(f13397j, intent.getAction())) {
            C2747b.a(this).c(new Intent(CustomTabActivity.f13391d));
            a(-1, intent);
        } else if (G7.j.a(CustomTabActivity.f13390c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.b) {
            a(0, null);
        }
        this.b = true;
    }
}
