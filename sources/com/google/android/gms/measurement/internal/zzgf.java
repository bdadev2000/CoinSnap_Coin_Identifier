package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzgf extends zzh {
    private final zzgi zza;
    private boolean zzb;

    public zzgf(zzhy zzhyVar) {
        super(zzhyVar);
        this.zza = new zzgi(this, zza(), "google_app_measurement_local.db");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    private final SQLiteDatabase zzad() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    private final boolean zzae() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final void zzaa() {
        int delete;
        zzt();
        try {
            SQLiteDatabase zzad = zzad();
            if (zzad != null && (delete = zzad.delete("messages", null, null) + 0) > 0) {
                zzj().zzp().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean zzab() {
        return zza(3, new byte[0]);
    }

    public final boolean zzac() {
        zzt();
        if (this.zzb || !zzae()) {
            return false;
        }
        int i10 = 5;
        for (int i11 = 0; i11 < 5; i11++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase zzad = zzad();
                    if (zzad == null) {
                        this.zzb = true;
                        if (zzad != null) {
                            zzad.close();
                        }
                        return false;
                    }
                    zzad.beginTransaction();
                    zzad.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    zzad.setTransactionSuccessful();
                    zzad.endTransaction();
                    zzad.close();
                    return true;
                } catch (SQLiteFullException e2) {
                    zzj().zzg().zza("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e10) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    zzj().zzg().zza("Error deleting app launch break from local database", e10);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i10);
                i10 += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().zzu().zza("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgf.zza(int):java.util.List");
    }

    public final boolean zza(zzae zzaeVar) {
        zzq();
        byte[] zza = zzos.zza((Parcelable) zzaeVar);
        if (zza.length > 131072) {
            zzj().zzn().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x004b, SQLiteException -> 0x004e, SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b0, TRY_ENTER, TryCatch #7 {SQLiteDatabaseLockedException -> 0x00b0, SQLiteFullException -> 0x0050, SQLiteException -> 0x004e, all -> 0x004b, blocks: (B:74:0x0040, B:76:0x0046, B:17:0x005f, B:19:0x0083, B:20:0x009d), top: B:73:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zza(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgf.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzbf zzbfVar) {
        Parcel obtain = Parcel.obtain();
        zzbfVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzn().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, marshall);
    }

    public final boolean zza(zzon zzonVar) {
        Parcel obtain = Parcel.obtain();
        zzonVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzn().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, marshall);
    }
}
