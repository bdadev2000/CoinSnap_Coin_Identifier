package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzxp extends zzcb {
    public final boolean zzC;
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    private final SparseArray zzR;
    private final SparseBooleanArray zzS;

    static {
        new zzxp(new zzxo());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public static zzxp zzd(Context context) {
        return new zzxp(new zzxo(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxp.class == obj.getClass()) {
            zzxp zzxpVar = (zzxp) obj;
            if (super.equals(zzxpVar) && this.zzC == zzxpVar.zzC && this.zzE == zzxpVar.zzE && this.zzG == zzxpVar.zzG && this.zzL == zzxpVar.zzL && this.zzM == zzxpVar.zzM && this.zzN == zzxpVar.zzN && this.zzP == zzxpVar.zzP) {
                SparseBooleanArray sparseBooleanArray = this.zzS;
                SparseBooleanArray sparseBooleanArray2 = zzxpVar.zzS;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        } else {
                            SparseArray sparseArray = this.zzR;
                            SparseArray sparseArray2 = zzxpVar.zzR;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwr zzwrVar = (zzwr) entry.getKey();
                                                if (map2.containsKey(zzwrVar) && Objects.equals(entry.getValue(), map2.get(zzwrVar))) {
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

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzC ? 1 : 0)) * 961) + (this.zzE ? 1 : 0)) * 961) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzL ? 1 : 0)) * 31) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 961) + (this.zzP ? 1 : 0)) * 31;
    }

    public final zzxo zzc() {
        return new zzxo(this, null);
    }

    @Nullable
    @Deprecated
    public final zzxq zze(int i10, zzwr zzwrVar) {
        Map map = (Map) this.zzR.get(i10);
        if (map != null) {
            return (zzxq) map.get(zzwrVar);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzS.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzwr zzwrVar) {
        Map map = (Map) this.zzR.get(i10);
        if (map != null && map.containsKey(zzwrVar)) {
            return true;
        }
        return false;
    }

    private zzxp(zzxo zzxoVar) {
        super(zzxoVar);
        this.zzC = zzxo.zzw(zzxoVar);
        this.zzD = false;
        this.zzE = zzxo.zzs(zzxoVar);
        this.zzF = false;
        this.zzG = zzxo.zzu(zzxoVar);
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = zzxo.zzq(zzxoVar);
        this.zzM = zzxo.zzt(zzxoVar);
        this.zzN = zzxo.zzv(zzxoVar);
        this.zzO = false;
        this.zzP = zzxo.zzr(zzxoVar);
        this.zzQ = false;
        this.zzR = zzxo.zzn(zzxoVar);
        this.zzS = zzxo.zzo(zzxoVar);
    }
}
