package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.b;
import androidx.work.d;
import androidx.work.g;
import androidx.work.q;
import androidx.work.r;
import androidx.work.s;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import d6.h;
import h.c;
import java.util.Collections;
import java.util.HashMap;
import m2.k;
import u2.j;
import v2.a;

@KeepForSdk
/* loaded from: classes3.dex */
public class WorkManagerUtil extends zzbp {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            k.w(context.getApplicationContext(), new b(new h()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbq
    public final void zze(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            k v10 = k.v(context);
            ((c) v10.f21461l).r(new a(v10, "offline_ping_sender_work", 1));
            androidx.work.c cVar = new androidx.work.c();
            cVar.a = q.CONNECTED;
            d dVar = new d(cVar);
            r rVar = new r(OfflinePingSender.class);
            rVar.f2243b.f25460j = dVar;
            rVar.f2244c.add("offline_ping_sender_work");
            v10.u(Collections.singletonList(rVar.a()));
        } catch (IllegalStateException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbq
    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbq
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        androidx.work.c cVar = new androidx.work.c();
        cVar.a = q.CONNECTED;
        d dVar = new d(cVar);
        g gVar = new g();
        String str = zzaVar.zza;
        HashMap hashMap = gVar.a;
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", zzaVar.zzb);
        hashMap.put(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc);
        androidx.work.h b3 = gVar.b();
        r rVar = new r(OfflineNotificationPoster.class);
        j jVar = rVar.f2243b;
        jVar.f25460j = dVar;
        jVar.f25455e = b3;
        rVar.f2244c.add("offline_notification_work");
        s a = rVar.a();
        try {
            k.v(context).u(Collections.singletonList(a));
            return true;
        } catch (IllegalStateException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }
}
