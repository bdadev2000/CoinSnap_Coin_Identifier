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

/* loaded from: classes2.dex */
public final class zzfp extends zze {
    private final zzfs zza;
    private boolean zzb;

    public zzfp(zzhj zzhjVar) {
        super(zzhjVar);
        this.zza = new zzfs(this, zza(), "google_app_measurement_local.db");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                long j7 = cursor.getLong(0);
                cursor.close();
                return j7;
            }
            cursor.close();
            return -1L;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
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
            if (zzad != null && (delete = zzad.delete("messages", null, null)) > 0) {
                zzj().zzp().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e4) {
            zzj().zzg().zza("Error resetting local analytics data. error", e4);
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
        int i9 = 5;
        for (int i10 = 0; i10 < 5; i10++) {
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
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i9);
                    i9 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e4) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    zzj().zzg().zza("Error deleting app launch break from local database", e4);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e9) {
                zzj().zzg().zza("Error deleting app launch break from local database", e9);
                this.zzb = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().zzu().zza("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfp.zza(int):java.util.List");
    }

    public final boolean zza(zzae zzaeVar) {
        zzq();
        byte[] zza = zznp.zza((Parcelable) zzaeVar);
        if (zza.length > 131072) {
            zzj().zzm().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zza(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bc, TRY_ENTER, TryCatch #6 {SQLiteDatabaseLockedException -> 0x00bc, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:74:0x004b, B:76:0x0051, B:17:0x006b, B:19:0x008f, B:20:0x00a9), top: B:73:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
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
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfp.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzbd zzbdVar) {
        Parcel obtain = Parcel.obtain();
        zzbdVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzm().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zza(0, marshall);
    }

    public final boolean zza(zzno zznoVar) {
        Parcel obtain = Parcel.obtain();
        zznoVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            zzj().zzm().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zza(1, marshall);
    }
}
