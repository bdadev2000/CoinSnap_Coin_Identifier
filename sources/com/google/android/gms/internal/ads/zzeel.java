package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbcb;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzeel {
    private final zzbbu zza;
    private final Context zzb;
    private final zzedq zzc;
    private final VersionInfoParcel zzd;

    public zzeel(Context context, VersionInfoParcel versionInfoParcel, zzbbu zzbbuVar, zzedq zzedqVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbuVar;
        this.zzc = zzedqVar;
    }

    public final /* synthetic */ Void zza(boolean z2, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z2) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbcb.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhbt e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbcb.zzaf.zzc zzi = zzbcb.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzeef.zza(sQLiteDatabase, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzeef.zza(sQLiteDatabase, 1));
            zzi.zzx(zzeef.zza(sQLiteDatabase, 3));
            zzi.zzF(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
            zzi.zzB(zzeef.zzb(sQLiteDatabase, 2));
            final zzbcb.zzaf zzbr = zzi.zzbr();
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbcb.zzaf.zza zzaVar = (zzbcb.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzk() == zzbcb.zzq.ENUM_TRUE && zzaVar.zze() > j2) {
                    j2 = zzaVar.zze();
                }
            }
            if (j2 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j2));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzeej
                @Override // com.google.android.gms.internal.ads.zzbbt
                public final void zza(zzbcb.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzbcb.zzaf.this);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbcb.zzar.zza zzd = zzbcb.zzar.zzd();
            zzd.zzg(versionInfoParcel.buddyApkVersion);
            zzd.zzi(this.zzd.clientJarVersion);
            zzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbcb.zzar zzbr2 = zzd.zzbr();
            this.zza.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzeek
                @Override // com.google.android.gms.internal.ads.zzbbt
                public final void zza(zzbcb.zzt.zza zzaVar2) {
                    zzbcb.zzm.zza zzbM = zzaVar2.zzg().zzbM();
                    zzbM.zzw(zzbcb.zzar.this);
                    zzaVar2.zzK(zzbM);
                }
            });
            this.zza.zzc(10004);
            zzeef.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z2) {
        try {
            this.zzc.zza(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzeei
                @Override // com.google.android.gms.internal.ads.zzfkj
                public final Object zza(Object obj) {
                    zzeel.this.zza(z2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
