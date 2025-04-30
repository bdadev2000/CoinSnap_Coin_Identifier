package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f14524a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f14525c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14526d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f14524a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.f14525c = friendlyObstructionPurpose;
        this.f14526d = str;
    }

    public String a() {
        return this.f14526d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f14525c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f14524a;
    }

    public String d() {
        return this.b;
    }
}
