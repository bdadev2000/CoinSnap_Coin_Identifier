package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f28962a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28963b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f28964c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f28962a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f28963b = view.getClass().getCanonicalName();
        this.f28964c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f28964c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f28962a;
    }

    public String d() {
        return this.f28963b;
    }
}
