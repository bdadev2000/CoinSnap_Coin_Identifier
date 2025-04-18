package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.firebase.components.ComponentRegistrar;
import db.a;
import db.j;
import db.l;
import h.q0;
import java.util.Arrays;
import java.util.List;
import s7.h1;
import va.g;
import va.h;
import za.b;
import zb.c;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(db.b bVar) {
        g gVar = (g) bVar.b(g.class);
        Context context = (Context) bVar.b(Context.class);
        c cVar = (c) bVar.b(c.class);
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (za.c.f28713c == null) {
            synchronized (za.c.class) {
                if (za.c.f28713c == null) {
                    Bundle bundle = new Bundle(1);
                    gVar.a();
                    if ("[DEFAULT]".equals(gVar.f26388b)) {
                        ((l) cVar).a(new q0(3), new b6.b());
                        bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                    }
                    za.c.f28713c = new za.c(zzdy.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                }
            }
        }
        return za.c.f28713c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<a> getComponents() {
        h1 b3 = a.b(b.class);
        b3.a(j.b(g.class));
        b3.a(j.b(Context.class));
        b3.a(j.b(c.class));
        b3.f24390f = new h(4);
        b3.g(2);
        return Arrays.asList(b3.b(), com.facebook.appevents.g.d("fire-analytics", "22.1.2"));
    }
}
