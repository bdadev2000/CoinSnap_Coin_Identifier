package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafg {
    public static int zza(int i9) {
        int i10 = 0;
        while (i9 > 0) {
            i9 >>>= 1;
            i10++;
        }
        return i10;
    }

    @Nullable
    public static zzcd zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            int i10 = zzgd.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzfk.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagw.zzb(new zzfu(Base64.decode(split[1], 0))));
                } catch (RuntimeException e4) {
                    zzfk.zzg("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new zzaio(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzcd(arrayList);
    }

    public static zzafd zzc(zzfu zzfuVar, boolean z8, boolean z9) throws zzch {
        if (z8) {
            zzd(3, zzfuVar, false);
        }
        String zzA = zzfuVar.zzA((int) zzfuVar.zzs(), zzfxs.zzc);
        int length = zzA.length();
        long zzs = zzfuVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i9 = length + 15;
        for (int i10 = 0; i10 < zzs; i10++) {
            String zzA2 = zzfuVar.zzA((int) zzfuVar.zzs(), zzfxs.zzc);
            strArr[i10] = zzA2;
            i9 = i9 + 4 + zzA2.length();
        }
        if (z9 && (zzfuVar.zzm() & 1) == 0) {
            throw zzch.zza("framing bit expected to be set", null);
        }
        return new zzafd(zzA, strArr, i9 + 1);
    }

    public static boolean zzd(int i9, zzfu zzfuVar, boolean z8) throws zzch {
        if (zzfuVar.zzb() < 7) {
            if (z8) {
                return false;
            }
            throw zzch.zza("too short header: " + zzfuVar.zzb(), null);
        }
        if (zzfuVar.zzm() != i9) {
            if (z8) {
                return false;
            }
            throw zzch.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i9))), null);
        }
        if (zzfuVar.zzm() == 118 && zzfuVar.zzm() == 111 && zzfuVar.zzm() == 114 && zzfuVar.zzm() == 98 && zzfuVar.zzm() == 105 && zzfuVar.zzm() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw zzch.zza("expected characters 'vorbis'", null);
    }
}
