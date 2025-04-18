package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public class e {
    private final com.iab.omid.library.bytedance2.weakreference.a a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12257b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f12258c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12259d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f12257b = view.getClass().getCanonicalName();
        this.f12258c = friendlyObstructionPurpose;
        this.f12259d = str;
    }

    public String a() {
        return this.f12259d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f12258c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.a;
    }

    public String d() {
        return this.f12257b;
    }
}
