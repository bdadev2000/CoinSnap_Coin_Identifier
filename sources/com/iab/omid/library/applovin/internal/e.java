package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class e {
    private final com.iab.omid.library.applovin.weakreference.a a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12162b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12163c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12164d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f12162b = view.getClass().getCanonicalName();
        this.f12163c = friendlyObstructionPurpose;
        this.f12164d = str;
    }

    public String a() {
        return this.f12164d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12163c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.a;
    }

    public String d() {
        return this.f12162b;
    }
}
