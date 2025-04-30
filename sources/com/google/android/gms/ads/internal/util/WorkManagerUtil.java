package com.google.android.gms.ads.internal.util;

import C.c;
import V0.k;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.b;
import androidx.work.e;
import androidx.work.g;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import d1.C2168i;
import e1.C2209a;
import java.util.HashMap;
import java.util.HashSet;
import q4.C2645d;

@KeepForSdk
/* loaded from: classes2.dex */
public class WorkManagerUtil extends zzbs {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            k.w(context.getApplicationContext(), new b(new C2645d()));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.work.c, java.lang.Object] */
    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final void zze(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            k v6 = k.v(context);
            ((c) v6.f3419d).p(new C2209a(v6));
            e eVar = new e();
            ?? obj = new Object();
            obj.f5203a = 1;
            obj.f5207f = -1L;
            obj.f5208g = -1L;
            new HashSet();
            obj.b = false;
            obj.f5204c = false;
            obj.f5203a = 2;
            obj.f5205d = false;
            obj.f5206e = false;
            obj.f5209h = eVar;
            obj.f5207f = -1L;
            obj.f5208g = -1L;
            c cVar = new c(OfflinePingSender.class);
            ((C2168i) cVar.f348d).f19809j = obj;
            ((HashSet) cVar.f349f).add("offline_ping_sender_work");
            v6.g(cVar.k());
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e4);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.work.c, java.lang.Object] */
    @Override // com.google.android.gms.ads.internal.util.zzbt
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        e eVar = new e();
        ?? obj = new Object();
        obj.f5203a = 1;
        obj.f5207f = -1L;
        obj.f5208g = -1L;
        new HashSet();
        obj.b = false;
        obj.f5204c = false;
        obj.f5203a = 2;
        obj.f5205d = false;
        obj.f5206e = false;
        obj.f5209h = eVar;
        obj.f5207f = -1L;
        obj.f5208g = -1L;
        HashMap hashMap = new HashMap();
        hashMap.put("uri", zzaVar.zza);
        hashMap.put("gws_query_id", zzaVar.zzb);
        hashMap.put(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc);
        g gVar = new g(hashMap);
        g.c(gVar);
        c cVar = new c(OfflineNotificationPoster.class);
        C2168i c2168i = (C2168i) cVar.f348d;
        c2168i.f19809j = obj;
        c2168i.f19804e = gVar;
        ((HashSet) cVar.f349f).add("offline_notification_work");
        try {
            k.v(context).g(cVar.k());
            return true;
        } catch (IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e4);
            return false;
        }
    }
}
