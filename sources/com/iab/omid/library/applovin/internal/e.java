package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f14422a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f14423c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14424d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f14422a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.f14423c = friendlyObstructionPurpose;
        this.f14424d = str;
    }

    public String a() {
        return this.f14424d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f14423c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f14422a;
    }

    public String d() {
        return this.b;
    }
}
