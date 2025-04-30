package com.google.ads.mediation.applovin;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements AppLovinSdk.SdkInitializationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13856a;
    public final /* synthetic */ f b;

    public d(f fVar, String str) {
        this.b = fVar;
        this.f13856a = str;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        f fVar = this.b;
        HashMap hashMap = fVar.b;
        String str = this.f13856a;
        hashMap.put(str, 2);
        ArrayList arrayList = (ArrayList) fVar.f13859c.get(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onInitializeSuccess(str);
            }
            arrayList.clear();
        }
    }
}
