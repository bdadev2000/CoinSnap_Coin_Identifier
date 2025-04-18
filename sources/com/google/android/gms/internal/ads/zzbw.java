package com.google.android.gms.internal.ads;

import a4.j;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzbw {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzad[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbw(String str, zzad... zzadVarArr) {
        boolean z10;
        int length = zzadVarArr.length;
        int i10 = 1;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        this.zzb = str;
        this.zzd = zzadVarArr;
        this.zza = length;
        int zzb = zzbg.zzb(zzadVarArr[0].zzo);
        this.zzc = zzb == -1 ? zzbg.zzb(zzadVarArr[0].zzn) : zzb;
        String zzc = zzc(zzadVarArr[0].zzd);
        int i11 = zzadVarArr[0].zzf | JsonLexerKt.BATCH_SIZE;
        while (true) {
            zzad[] zzadVarArr2 = this.zzd;
            if (i10 < zzadVarArr2.length) {
                if (!zzc.equals(zzc(zzadVarArr2[i10].zzd))) {
                    zzad[] zzadVarArr3 = this.zzd;
                    zzd("languages", zzadVarArr3[0].zzd, zzadVarArr3[i10].zzd, i10);
                    return;
                } else {
                    zzad[] zzadVarArr4 = this.zzd;
                    if (i11 != (zzadVarArr4[i10].zzf | JsonLexerKt.BATCH_SIZE)) {
                        zzd("role flags", Integer.toBinaryString(zzadVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                        return;
                    }
                    i10++;
                }
            } else {
                return;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        if (str != null && !str.equals(C.LANGUAGE_UNDETERMINED)) {
            return str;
        }
        return "";
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i10) {
        StringBuilder p10 = j.p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        p10.append(str3);
        p10.append("' (track ");
        p10.append(i10);
        p10.append(")");
        zzdt.zzd("TrackGroup", "", new IllegalStateException(p10.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbw.class == obj.getClass()) {
            zzbw zzbwVar = (zzbw) obj;
            if (this.zzb.equals(zzbwVar.zzb) && Arrays.equals(this.zzd, zzbwVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = this.zzb.hashCode() + 527;
            int hashCode2 = Arrays.hashCode(this.zzd) + (hashCode * 31);
            this.zze = hashCode2;
            return hashCode2;
        }
        return i10;
    }

    public final int zza(zzad zzadVar) {
        int i10 = 0;
        while (true) {
            zzad[] zzadVarArr = this.zzd;
            if (i10 >= zzadVarArr.length) {
                return -1;
            }
            if (zzadVar == zzadVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final zzad zzb(int i10) {
        return this.zzd[i10];
    }
}
