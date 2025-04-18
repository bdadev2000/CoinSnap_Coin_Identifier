package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzxy extends zzci {
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
        new zzxy(new zzxw());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 36);
        Integer.toString(1005, 36);
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

    public static zzxy zzd(Context context) {
        return new zzxy(new zzxw(context));
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxy.class == obj.getClass()) {
            zzxy zzxyVar = (zzxy) obj;
            if (super.equals(zzxyVar) && this.zzC == zzxyVar.zzC && this.zzE == zzxyVar.zzE && this.zzG == zzxyVar.zzG && this.zzL == zzxyVar.zzL && this.zzM == zzxyVar.zzM && this.zzN == zzxyVar.zzN && this.zzP == zzxyVar.zzP) {
                SparseBooleanArray sparseBooleanArray = this.zzS;
                SparseBooleanArray sparseBooleanArray2 = zzxyVar.zzS;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            SparseArray sparseArray = this.zzR;
                            SparseArray sparseArray2 = zzxyVar.zzR;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i3 = 0; i3 < size2; i3++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i3);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwy zzwyVar = (zzwy) entry.getKey();
                                                if (map2.containsKey(zzwyVar) && Objects.equals(entry.getValue(), map2.get(zzwyVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzC ? 1 : 0)) * 961) + (this.zzE ? 1 : 0)) * 961) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzL ? 1 : 0)) * 31) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 961) + (this.zzP ? 1 : 0)) * 31;
    }

    public final zzxw zzc() {
        return new zzxw(this, null);
    }

    @Nullable
    @Deprecated
    public final zzxz zze(int i2, zzwy zzwyVar) {
        Map map = (Map) this.zzR.get(i2);
        if (map != null) {
            return (zzxz) map.get(zzwyVar);
        }
        return null;
    }

    public final boolean zzf(int i2) {
        return this.zzS.get(i2);
    }

    @Deprecated
    public final boolean zzg(int i2, zzwy zzwyVar) {
        Map map = (Map) this.zzR.get(i2);
        return map != null && map.containsKey(zzwyVar);
    }

    private zzxy(zzxw zzxwVar) {
        super(zzxwVar);
        this.zzC = zzxw.zzw(zzxwVar);
        this.zzD = false;
        this.zzE = zzxw.zzs(zzxwVar);
        this.zzF = false;
        this.zzG = zzxw.zzu(zzxwVar);
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = zzxw.zzq(zzxwVar);
        this.zzM = zzxw.zzt(zzxwVar);
        this.zzN = zzxw.zzv(zzxwVar);
        this.zzO = false;
        this.zzP = zzxw.zzr(zzxwVar);
        this.zzQ = false;
        this.zzR = zzxw.zzn(zzxwVar);
        this.zzS = zzxw.zzo(zzxwVar);
    }
}
