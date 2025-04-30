package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* loaded from: classes2.dex */
public final class zzbbw {
    public static long zza(long j7, int i9) {
        if (i9 == 1) {
            return j7;
        }
        int i10 = i9 >> 1;
        long j9 = (j7 * j7) % 1073807359;
        return (i9 & 1) == 0 ? zza(j9, i10) % 1073807359 : ((zza(j9, i10) % 1073807359) * j7) % 1073807359;
    }

    public static String zzb(String[] strArr, int i9, int i10) {
        int i11 = i10 + i9;
        if (strArr.length < i11) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i12 = i11 - 1;
            if (i9 < i12) {
                sb.append(strArr[i9]);
                sb.append(' ');
                i9++;
            } else {
                sb.append(strArr[i12]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i9, int i10, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i9, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i9, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i11 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i11 < length2 - 5) {
                long zza = zzbbs.zza(strArr[i11 - 1]);
                long zza2 = zzbbs.zza(strArr[i11 + 5]);
                String zzb = zzb(strArr, i11, 6);
                zze = (((zza2 + 2147483647L) % 1073807359) + (((((zze + 1073807359) - ((((zza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                zzd(i9, zze, zzb, length2, priorityQueue);
                i11++;
            } else {
                return;
            }
        }
    }

    public static void zzd(int i9, long j7, String str, int i10, PriorityQueue priorityQueue) {
        zzbbv zzbbvVar = new zzbbv(j7, str, i10);
        if ((priorityQueue.size() != i9 || (((zzbbv) priorityQueue.peek()).zzc <= zzbbvVar.zzc && ((zzbbv) priorityQueue.peek()).zza <= zzbbvVar.zza)) && !priorityQueue.contains(zzbbvVar)) {
            priorityQueue.add(zzbbvVar);
            if (priorityQueue.size() > i9) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i9, int i10) {
        long zza = (zzbbs.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            zza = (((zzbbs.zza(strArr[i11]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
