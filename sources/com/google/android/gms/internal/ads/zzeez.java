package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.appevents.o;
import com.google.android.gms.ads.MobileAds;
import kotlin.jvm.internal.Intrinsics;
import t1.d;

/* loaded from: classes3.dex */
public final class zzeez {
    private final Context zza;

    public zzeez(Context context) {
        this.zza = context;
    }

    public final ua.b zza(boolean z10) {
        d dVar;
        try {
            new x5.c();
            Intrinsics.checkNotNullParameter(MobileAds.ERROR_DOMAIN, "adsSdkName");
            t1.a aVar = new t1.a(MobileAds.ERROR_DOMAIN, z10);
            Context context = this.zza;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            r1.b bVar = null;
            if (o.z() >= 5) {
                dVar = new d(context, 1);
            } else if (o.z() == 4) {
                dVar = new d(context, 0);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                bVar = new r1.b(dVar);
            }
            if (bVar != null) {
                return bVar.a(aVar);
            }
            return zzgei.zzg(new IllegalStateException());
        } catch (Exception e2) {
            return zzgei.zzg(e2);
        }
    }
}
