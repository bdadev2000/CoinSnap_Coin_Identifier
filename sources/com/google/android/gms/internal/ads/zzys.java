package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzys extends zzdl {
    public static final zzys zzF;

    @Deprecated
    public static final zzys zzG;

    @Deprecated
    public static final zzn zzH;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    private static final String zzap;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    private final SparseArray zzaq;
    private final SparseBooleanArray zzar;

    static {
        zzys zzysVar = new zzys(new zzyq());
        zzF = zzysVar;
        zzG = zzysVar;
        zzX = Integer.toString(1000, 36);
        zzY = Integer.toString(1001, 36);
        zzZ = Integer.toString(1002, 36);
        zzaa = Integer.toString(1003, 36);
        zzab = Integer.toString(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 36);
        zzac = Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        zzad = Integer.toString(1006, 36);
        zzae = Integer.toString(1007, 36);
        zzaf = Integer.toString(1008, 36);
        zzag = Integer.toString(1009, 36);
        zzah = Integer.toString(1010, 36);
        zzai = Integer.toString(1011, 36);
        zzaj = Integer.toString(1012, 36);
        zzak = Integer.toString(1013, 36);
        zzal = Integer.toString(1014, 36);
        zzam = Integer.toString(1015, 36);
        zzan = Integer.toString(1016, 36);
        zzao = Integer.toString(1017, 36);
        zzap = Integer.toString(1018, 36);
        zzH = new zzn() { // from class: com.google.android.gms.internal.ads.zzyo
        };
    }

    public /* synthetic */ zzys(zzyq zzyqVar, zzyr zzyrVar) {
        this(zzyqVar);
    }

    public static zzys zzd(Context context) {
        return new zzys(new zzyq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzys.class == obj.getClass()) {
            zzys zzysVar = (zzys) obj;
            if (super.equals(zzysVar) && this.zzI == zzysVar.zzI && this.zzK == zzysVar.zzK && this.zzM == zzysVar.zzM && this.zzR == zzysVar.zzR && this.zzS == zzysVar.zzS && this.zzT == zzysVar.zzT && this.zzV == zzysVar.zzV) {
                SparseBooleanArray sparseBooleanArray = this.zzar;
                SparseBooleanArray sparseBooleanArray2 = zzysVar.zzar;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                                break;
                            }
                            i9++;
                        } else {
                            SparseArray sparseArray = this.zzaq;
                            SparseArray sparseArray2 = zzysVar.zzaq;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i10);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzxr zzxrVar = (zzxr) entry.getKey();
                                                if (map2.containsKey(zzxrVar) && zzgd.zzG(entry.getValue(), map2.get(zzxrVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 28629151) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 31) + (this.zzT ? 1 : 0)) * 961) + (this.zzV ? 1 : 0)) * 31;
    }

    public final zzyq zzc() {
        return new zzyq(this, null);
    }

    @Nullable
    @Deprecated
    public final zzyu zze(int i9, zzxr zzxrVar) {
        Map map = (Map) this.zzaq.get(i9);
        if (map != null) {
            return (zzyu) map.get(zzxrVar);
        }
        return null;
    }

    public final boolean zzf(int i9) {
        return this.zzar.get(i9);
    }

    @Deprecated
    public final boolean zzg(int i9, zzxr zzxrVar) {
        Map map = (Map) this.zzaq.get(i9);
        if (map != null && map.containsKey(zzxrVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzys(zzyq zzyqVar) {
        super(zzyqVar);
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z8 = zzyqVar.zza;
        this.zzI = z8;
        this.zzJ = false;
        z9 = zzyqVar.zzb;
        this.zzK = z9;
        this.zzL = false;
        z10 = zzyqVar.zzc;
        this.zzM = z10;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        z11 = zzyqVar.zzd;
        this.zzR = z11;
        z12 = zzyqVar.zze;
        this.zzS = z12;
        z13 = zzyqVar.zzf;
        this.zzT = z13;
        this.zzU = false;
        z14 = zzyqVar.zzg;
        this.zzV = z14;
        this.zzW = false;
        sparseArray = zzyqVar.zzh;
        this.zzaq = sparseArray;
        sparseBooleanArray = zzyqVar.zzi;
        this.zzar = sparseBooleanArray;
    }
}
