package com.google.ads.mediation.applovin;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements AppLovinSdk.SdkInitializationListener {
    public final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f11450b;

    public d(f fVar, String str) {
        this.f11450b = fVar;
        this.a = str;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        f fVar = this.f11450b;
        HashMap hashMap = fVar.f11452b;
        String str = this.a;
        hashMap.put(str, 2);
        ArrayList arrayList = (ArrayList) fVar.f11453c.get(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onInitializeSuccess(str);
            }
            arrayList.clear();
        }
    }
}
