package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class zzbae {
    @VisibleForTesting
    public static long zza(long j2, int i2) {
        if (i2 == 1) {
            return j2;
        }
        int i3 = i2 >> 1;
        long j3 = (j2 * j2) % 1073807359;
        return (i2 & 1) == 0 ? zza(j3, i3) % 1073807359 : ((zza(j3, i3) % 1073807359) * j2) % 1073807359;
    }

    @VisibleForTesting
    public static String zzb(String[] strArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (strArr.length < i4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i4 - 1;
            if (i2 >= i5) {
                sb.append(strArr[i5]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(' ');
            i2++;
        }
    }

    public static void zzc(String[] strArr, int i2, int i3, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i2, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i2, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            long zza = zzbaa.zza(strArr[i4 - 1]);
            long zza2 = zzbaa.zza(strArr[i4 + 5]);
            String zzb = zzb(strArr, i4, 6);
            zze = (((zza2 + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((zza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i2, zze, zzb, length2, priorityQueue);
            i4++;
        }
    }

    @VisibleForTesting
    public static void zzd(int i2, long j2, String str, int i3, PriorityQueue priorityQueue) {
        zzbad zzbadVar = new zzbad(j2, str, i3);
        if ((priorityQueue.size() != i2 || (((zzbad) priorityQueue.peek()).zzc <= zzbadVar.zzc && ((zzbad) priorityQueue.peek()).zza <= zzbadVar.zza)) && !priorityQueue.contains(zzbadVar)) {
            priorityQueue.add(zzbadVar);
            if (priorityQueue.size() > i2) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i2, int i3) {
        long zza = (zzbaa.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i4 = 1; i4 < i3; i4++) {
            zza = (((zzbaa.zza(strArr[i4]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
