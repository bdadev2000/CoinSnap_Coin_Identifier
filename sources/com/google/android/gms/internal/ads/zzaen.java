package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaen {
    public static int zza(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i2 >>>= 1;
            i3++;
        }
        return i3;
    }

    @Nullable
    public static zzbk zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = zzeu.zza;
            String[] split = str.split(ImpressionLog.R, 2);
            if (split.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagb.zzb(new zzek(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahs(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbk(arrayList);
    }

    public static zzaek zzc(zzek zzekVar, boolean z2, boolean z3) throws zzbo {
        if (z2) {
            zzd(3, zzekVar, false);
        }
        String zzB = zzekVar.zzB((int) zzekVar.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzekVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i2 = length + 15;
        for (int i3 = 0; i3 < zzs; i3++) {
            String zzB2 = zzekVar.zzB((int) zzekVar.zzs(), StandardCharsets.UTF_8);
            strArr[i3] = zzB2;
            i2 = i2 + 4 + zzB2.length();
        }
        if (z3 && (zzekVar.zzm() & 1) == 0) {
            throw zzbo.zza("framing bit expected to be set", null);
        }
        return new zzaek(zzB, strArr, i2 + 1);
    }

    public static boolean zzd(int i2, zzek zzekVar, boolean z2) throws zzbo {
        if (zzekVar.zzb() < 7) {
            if (z2) {
                return false;
            }
            throw zzbo.zza("too short header: " + zzekVar.zzb(), null);
        }
        if (zzekVar.zzm() != i2) {
            if (z2) {
                return false;
            }
            throw zzbo.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i2))), null);
        }
        if (zzekVar.zzm() == 118 && zzekVar.zzm() == 111 && zzekVar.zzm() == 114 && zzekVar.zzm() == 98 && zzekVar.zzm() == 105 && zzekVar.zzm() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw zzbo.zza("expected characters 'vorbis'", null);
    }
}
