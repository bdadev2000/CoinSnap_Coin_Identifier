package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class h implements e {
    public final /* synthetic */ HashSet a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f11454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InitializationCompleteCallback f11455c;

    public h(HashSet hashSet, HashSet hashSet2, InitializationCompleteCallback initializationCompleteCallback) {
        this.a = hashSet;
        this.f11454b = hashSet2;
        this.f11455c = initializationCompleteCallback;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess(String str) {
        HashSet hashSet = this.a;
        hashSet.add(str);
        if (hashSet.equals(this.f11454b)) {
            this.f11455c.onInitializationSucceeded();
        }
    }
}
