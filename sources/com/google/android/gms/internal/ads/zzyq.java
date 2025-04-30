package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzyq extends zzdk {
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
    public zzyq() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
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

    public final zzyq zzp(int i9, boolean z8) {
        if (this.zzi.get(i9) != z8) {
            if (z8) {
                this.zzi.put(i9, true);
            } else {
                this.zzi.delete(i9);
            }
        }
        return this;
    }

    public zzyq(Context context) {
        zze(context);
        Point zzv = zzgd.zzv(context);
        zzf(zzv.x, zzv.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public /* synthetic */ zzyq(zzys zzysVar, zzyp zzypVar) {
        super(zzysVar);
        this.zza = zzysVar.zzI;
        this.zzb = zzysVar.zzK;
        this.zzc = zzysVar.zzM;
        this.zzd = zzysVar.zzR;
        this.zze = zzysVar.zzS;
        this.zzf = zzysVar.zzT;
        this.zzg = zzysVar.zzV;
        SparseArray zza = zzys.zza(zzysVar);
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < zza.size(); i9++) {
            sparseArray.put(zza.keyAt(i9), new HashMap((Map) zza.valueAt(i9)));
        }
        this.zzh = sparseArray;
        this.zzi = zzys.zzb(zzysVar).clone();
    }
}
