package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzxo extends zzca {
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
    public zzxo() {
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

    public final zzxo zzp(int i10, boolean z10) {
        if (this.zzi.get(i10) != z10) {
            if (z10) {
                this.zzi.put(i10, true);
            } else {
                this.zzi.delete(i10);
            }
        }
        return this;
    }

    public zzxo(Context context) {
        super.zze(context);
        Point zzw = zzen.zzw(context);
        super.zzf(zzw.x, zzw.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    public /* synthetic */ zzxo(zzxp zzxpVar, zzya zzyaVar) {
        super(zzxpVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzxpVar.zzC;
        this.zzb = zzxpVar.zzE;
        this.zzc = zzxpVar.zzG;
        this.zzd = zzxpVar.zzL;
        this.zze = zzxpVar.zzM;
        this.zzf = zzxpVar.zzN;
        this.zzg = zzxpVar.zzP;
        sparseArray = zzxpVar.zzR;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.zzh = sparseArray2;
        sparseBooleanArray = zzxpVar.zzS;
        this.zzi = sparseBooleanArray.clone();
    }
}
