package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.facebook.share.internal.ShareConstants;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.c;
import java.util.Collections;

@KeepForSdk
/* loaded from: classes3.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.Configuration$Builder, java.lang.Object] */
    private static void zzb(Context context) {
        try {
            WorkManagerImpl.c(context.getApplicationContext(), new Configuration(new Object()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            WorkManagerImpl b2 = WorkManagerImpl.b(context);
            b2.getClass();
            b2.d.b(CancelWorkRunnable.c(b2));
            Constraints.Builder builder = new Constraints.Builder();
            builder.f21860a = NetworkType.f21882b;
            Constraints a2 = builder.a();
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(OfflinePingSender.class);
            builder2.f21908b.f22153j = a2;
            builder2.f21909c.add("offline_ping_sender_work");
            b2.a(Collections.singletonList((OneTimeWorkRequest) builder2.a()));
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        Constraints.Builder builder = new Constraints.Builder();
        builder.f21860a = NetworkType.f21882b;
        Constraints a2 = builder.a();
        Data.Builder builder2 = new Data.Builder();
        builder2.f21868a.put(ShareConstants.MEDIA_URI, zzaVar.zza);
        builder2.f21868a.put("gws_query_id", zzaVar.zzb);
        builder2.f21868a.put(c.f29374h, zzaVar.zzc);
        Data a3 = builder2.a();
        OneTimeWorkRequest.Builder builder3 = new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class);
        WorkSpec workSpec = builder3.f21908b;
        workSpec.f22153j = a2;
        workSpec.e = a3;
        builder3.f21909c.add("offline_notification_work");
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) builder3.a();
        try {
            WorkManagerImpl b2 = WorkManagerImpl.b(context);
            b2.getClass();
            b2.a(Collections.singletonList(oneTimeWorkRequest));
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
