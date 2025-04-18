package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.l0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public abstract class d5 {

    /* loaded from: classes.dex */
    public class a implements OnSuccessListener {
        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            if (appSetIdInfo != null) {
                com.applovin.impl.sdk.n.a(new n.c(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                com.applovin.impl.sdk.l.a(new l.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                return;
            }
            throw new NullPointerException("info is marked non-null but is null");
        }
    }

    public static void a(Context context) {
        new Thread(new nt(context, 8)).start();
    }

    public static /* synthetic */ void b(Context context) {
        l0.a b3 = l0.b(context);
        com.applovin.impl.sdk.n.a(b3);
        com.applovin.impl.sdk.l.a(b3);
        if (!zp.a("com.google.android.gms.appset.AppSet")) {
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void c(Context context) {
        b(context);
    }
}
