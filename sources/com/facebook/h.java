package com.facebook;

/* loaded from: classes.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11012b;

    public /* synthetic */ h(int i10) {
        if (i10 != 1) {
            this.a = "oauth/access_token";
            this.f11012b = "fb_extend_sso_token";
        } else {
            this.a = "refresh_access_token";
            this.f11012b = "ig_refresh_token";
        }
    }

    public h(String str, String str2) {
        this.a = str;
        this.f11012b = str2;
    }
}
