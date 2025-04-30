package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzefm {
    private final zzbdm zza;
    private final Context zzb;
    private final zzeer zzc;
    private final VersionInfoParcel zzd;

    public zzefm(Context context, VersionInfoParcel versionInfoParcel, zzbdm zzbdmVar, zzeer zzeerVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbdmVar;
        this.zzc = zzeerVar;
    }

    public final /* synthetic */ Void zza(boolean z8, SQLiteDatabase sQLiteDatabase) throws Exception {
        int i9;
        if (z8) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbdv.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhcd e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e4.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbdv.zzaf.zzc zzi = zzbdv.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzefg.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzefg.zza(sQLiteDatabase, 1));
            zzi.zzx(zzefg.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzi.zzB(zzefg.zzb(sQLiteDatabase, 2));
            final zzbdv.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j7 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                zzbdv.zzaf.zza zzaVar = (zzbdv.zzaf.zza) arrayList.get(i10);
                if (zzaVar.zzk() == zzbdv.zzq.ENUM_TRUE && zzaVar.zze() > j7) {
                    j7 = zzaVar.zze();
                }
            }
            if (j7 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j7));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbdv.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbdv.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbdv.zzar.zza zzd = zzbdv.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(this.zzd.clientJarVersion);
            if (true != this.zzd.isClientJar) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            zzd.zzh(i9);
            final zzbdv.zzar zzbr2 = zzd.zzbr();
            this.zza.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzefl
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbdv.zzt.zza zzaVar2) {
                    zzbdv.zzm.zza zzcZ = zzaVar2.zzg().zzcZ();
                    zzcZ.zzw(zzbdv.zzar.this);
                    zzaVar2.zzK(zzcZ);
                }
            });
            this.zza.zzb(zzbdo.OFFLINE_UPLOAD);
            zzefg.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z8) {
        try {
            this.zzc.zza(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefj
                @Override // com.google.android.gms.internal.ads.zzfkw
                public final Object zza(Object obj) {
                    zzefm.this.zza(z8, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e4.getMessage())));
        }
    }
}
