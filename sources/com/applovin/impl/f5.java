package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes3.dex */
public abstract class f5 {

    /* loaded from: classes3.dex */
    public class a implements OnSuccessListener {
        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            com.applovin.impl.sdk.k.a(new k.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(Context context) {
        new Thread(new mt(context, 9)).start();
    }

    public static /* synthetic */ void b(Context context) {
        com.applovin.impl.sdk.k.a(l0.b(context));
        if (yp.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
