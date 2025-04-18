package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzxw extends zzch {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxw() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public static /* bridge */ /* synthetic */ SparseArray zzn(zzxw zzxwVar) {
        return zzxwVar.zzh;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzo(zzxw zzxwVar) {
        return zzxwVar.zzi;
    }

    public static /* bridge */ /* synthetic */ boolean zzq(zzxw zzxwVar) {
        return zzxwVar.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzxw zzxwVar) {
        return zzxwVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzxw zzxwVar) {
        return zzxwVar.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzxw zzxwVar) {
        return zzxwVar.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzxw zzxwVar) {
        return zzxwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzv(zzxw zzxwVar) {
        return zzxwVar.zzf;
    }

    public static /* bridge */ /* synthetic */ boolean zzw(zzxw zzxwVar) {
        return zzxwVar.zza;
    }

    private final void zzx() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzxw zzp(int i2, boolean z2) {
        if (this.zzi.get(i2) != z2) {
            if (z2) {
                this.zzi.put(i2, true);
            } else {
                this.zzi.delete(i2);
            }
        }
        return this;
    }

    public zzxw(Context context) {
        super.zze(context);
        Point zzv = zzeu.zzv(context);
        super.zzf(zzv.x, zzv.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public /* synthetic */ zzxw(zzxy zzxyVar, zzxv zzxvVar) {
        super(zzxyVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzxyVar.zzC;
        this.zzb = zzxyVar.zzE;
        this.zzc = zzxyVar.zzG;
        this.zzd = zzxyVar.zzL;
        this.zze = zzxyVar.zzM;
        this.zzf = zzxyVar.zzN;
        this.zzg = zzxyVar.zzP;
        sparseArray = zzxyVar.zzR;
        SparseArray sparseArray2 = new SparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), new HashMap((Map) sparseArray.valueAt(i2)));
        }
        this.zzh = sparseArray2;
        sparseBooleanArray = zzxyVar.zzS;
        this.zzi = sparseBooleanArray.clone();
    }
}
