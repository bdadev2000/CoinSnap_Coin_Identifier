package com.facebook;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f11356d = new c(11, 0);

    /* renamed from: e, reason: collision with root package name */
    public static volatile p0 f11357e;
    public final m1.b a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f11358b;

    /* renamed from: c, reason: collision with root package name */
    public n0 f11359c;

    public p0(m1.b localBroadcastManager, o0 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.a = localBroadcastManager;
        this.f11358b = profileCache;
    }

    public final void a(n0 profile, boolean z10) {
        n0 n0Var = this.f11359c;
        this.f11359c = profile;
        if (z10) {
            o0 o0Var = this.f11358b;
            if (profile != null) {
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(profile, "profile");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f11347b);
                    jSONObject.put("first_name", profile.f11348c);
                    jSONObject.put("middle_name", profile.f11349d);
                    jSONObject.put("last_name", profile.f11350f);
                    jSONObject.put("name", profile.f11351g);
                    Uri uri = profile.f11352h;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.f11353i;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    o0Var.a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                o0Var.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!com.facebook.internal.m0.a(n0Var, profile)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", n0Var);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            this.a.c(intent);
        }
    }
}
