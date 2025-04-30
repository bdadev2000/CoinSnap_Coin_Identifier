package com.google.firebase.analytics.connector.internal;

import K4.c;
import R2.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import j2.f;
import java.util.Arrays;
import java.util.List;
import k4.C2434c;
import k4.InterfaceC2433b;
import o4.C2495a;
import o4.C2496b;
import o4.C2502h;
import o4.C2504j;
import o4.InterfaceC2497c;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC2433b lambda$getComponents$0(InterfaceC2497c interfaceC2497c) {
        C2296f c2296f = (C2296f) interfaceC2497c.b(C2296f.class);
        Context context = (Context) interfaceC2497c.b(Context.class);
        c cVar = (c) interfaceC2497c.b(c.class);
        Preconditions.checkNotNull(c2296f);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(cVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C2434c.f21471c == null) {
            synchronized (C2434c.class) {
                try {
                    if (C2434c.f21471c == null) {
                        Bundle bundle = new Bundle(1);
                        c2296f.a();
                        if ("[DEFAULT]".equals(c2296f.b)) {
                            ((C2504j) cVar).a(new f(3), new L4.f(27));
                            bundle.putBoolean("dataCollectionDefaultEnabled", c2296f.h());
                        }
                        C2434c.f21471c = new C2434c(zzdq.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return C2434c.f21471c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C2496b> getComponents() {
        C2495a a6 = C2496b.a(InterfaceC2433b.class);
        a6.a(C2502h.b(C2296f.class));
        a6.a(C2502h.b(Context.class));
        a6.a(C2502h.b(c.class));
        a6.f21942f = new L4.f(28);
        a6.c(2);
        return Arrays.asList(a6.b(), b.k("fire-analytics", "22.0.2"));
    }
}
