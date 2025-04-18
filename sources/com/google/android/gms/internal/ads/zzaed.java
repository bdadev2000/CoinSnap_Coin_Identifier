package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaed {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    @Nullable
    public static zzbd zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzen.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzdt.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafr.zzb(new zzed(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    zzdt.zzg("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zzahi(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbd(arrayList);
    }

    public static zzaea zzc(zzed zzedVar, boolean z10, boolean z11) throws zzbh {
        if (z10) {
            zzd(3, zzedVar, false);
        }
        String zzB = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzedVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i10 = length + 15;
        for (int i11 = 0; i11 < zzs; i11++) {
            String zzB2 = zzedVar.zzB((int) zzedVar.zzs(), StandardCharsets.UTF_8);
            strArr[i11] = zzB2;
            i10 = i10 + 4 + zzB2.length();
        }
        if (z11 && (zzedVar.zzm() & 1) == 0) {
            throw zzbh.zza("framing bit expected to be set", null);
        }
        return new zzaea(zzB, strArr, i10 + 1);
    }

    public static boolean zzd(int i10, zzed zzedVar, boolean z10) throws zzbh {
        if (zzedVar.zzb() < 7) {
            if (z10) {
                return false;
            }
            throw zzbh.zza("too short header: " + zzedVar.zzb(), null);
        }
        if (zzedVar.zzm() != i10) {
            if (z10) {
                return false;
            }
            throw zzbh.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzedVar.zzm() == 118 && zzedVar.zzm() == 111 && zzedVar.zzm() == 114 && zzedVar.zzm() == 98 && zzedVar.zzm() == 105 && zzedVar.zzm() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzbh.zza("expected characters 'vorbis'", null);
    }
}
