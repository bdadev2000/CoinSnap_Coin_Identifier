package com.facebook;

import android.content.Intent;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;
import q4.C2645d;
import u0.C2747b;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: d, reason: collision with root package name */
    public static final C2645d f13424d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static volatile J f13425e;

    /* renamed from: a, reason: collision with root package name */
    public final C2747b f13426a;
    public final U4.A b;

    /* renamed from: c, reason: collision with root package name */
    public I f13427c;

    public J(C2747b c2747b, U4.A a6) {
        this.f13426a = c2747b;
        this.b = a6;
    }

    public final void a(I i9, boolean z8) {
        boolean equals;
        I i10 = this.f13427c;
        this.f13427c = i9;
        if (z8) {
            U4.A a6 = this.b;
            if (i9 != null) {
                a6.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", i9.b);
                    jSONObject.put("first_name", i9.f13418c);
                    jSONObject.put("middle_name", i9.f13419d);
                    jSONObject.put("last_name", i9.f13420f);
                    jSONObject.put("name", i9.f13421g);
                    Uri uri = i9.f13422h;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = i9.f13423i;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    a6.f3244a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                a6.f3244a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (i10 == null) {
            if (i9 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = i10.equals(i9);
        }
        if (!equals) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", i10);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", i9);
            this.f13426a.c(intent);
        }
    }
}
