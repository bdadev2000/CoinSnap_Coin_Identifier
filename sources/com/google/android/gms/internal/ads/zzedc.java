package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzedc {
    private final zzbbl zza;
    private final Context zzb;
    private final zzech zzc;
    private final VersionInfoParcel zzd;

    public zzedc(Context context, VersionInfoParcel versionInfoParcel, zzbbl zzbblVar, zzech zzechVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbblVar;
        this.zzc = zzechVar;
    }

    public final /* synthetic */ Void zza(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        int i10;
        if (z10) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbbs.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgzm e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e2.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbbs.zzaf.zzc zzi = zzbbs.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzecw.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzecw.zza(sQLiteDatabase, 1));
            zzi.zzx(zzecw.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            zzi.zzB(zzecw.zzb(sQLiteDatabase, 2));
            final zzbbs.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                zzbbs.zzaf.zza zzaVar = (zzbbs.zzaf.zza) arrayList.get(i11);
                if (zzaVar.zzk() == zzbbs.zzq.ENUM_TRUE && zzaVar.zze() > j3) {
                    j3 = zzaVar.zze();
                }
            }
            if (j3 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j3));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzeda
                @Override // com.google.android.gms.internal.ads.zzbbk
                public final void zza(zzbbs.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbbs.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbs.zzar.zza zzd = zzbbs.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(this.zzd.clientJarVersion);
            if (true != this.zzd.isClientJar) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            zzd.zzh(i10);
            final zzbbs.zzar zzbr2 = zzd.zzbr();
            this.zza.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzedb
                @Override // com.google.android.gms.internal.ads.zzbbk
                public final void zza(zzbbs.zzt.zza zzaVar2) {
                    zzbbs.zzm.zza zzbM = zzaVar2.zzg().zzbM();
                    zzbM.zzw(zzbbs.zzar.this);
                    zzaVar2.zzK(zzbM);
                }
            });
            this.zza.zzc(10004);
            zzecw.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // com.google.android.gms.internal.ads.zzfiv
                public final Object zza(Object obj) {
                    zzedc.this.zza(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
