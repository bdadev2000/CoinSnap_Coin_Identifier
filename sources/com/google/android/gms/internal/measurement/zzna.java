package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
interface zzna {
    int zza();

    @Deprecated
    void zza(int i9) throws IOException;

    void zza(int i9, double d2) throws IOException;

    void zza(int i9, float f9) throws IOException;

    void zza(int i9, int i10) throws IOException;

    void zza(int i9, long j7) throws IOException;

    void zza(int i9, zzia zziaVar) throws IOException;

    <K, V> void zza(int i9, zzkk<K, V> zzkkVar, Map<K, V> map) throws IOException;

    void zza(int i9, Object obj) throws IOException;

    @Deprecated
    void zza(int i9, Object obj, zzll zzllVar) throws IOException;

    void zza(int i9, String str) throws IOException;

    void zza(int i9, List<zzia> list) throws IOException;

    @Deprecated
    void zza(int i9, List<?> list, zzll zzllVar) throws IOException;

    void zza(int i9, List<Boolean> list, boolean z8) throws IOException;

    void zza(int i9, boolean z8) throws IOException;

    @Deprecated
    void zzb(int i9) throws IOException;

    void zzb(int i9, int i10) throws IOException;

    void zzb(int i9, long j7) throws IOException;

    void zzb(int i9, Object obj, zzll zzllVar) throws IOException;

    void zzb(int i9, List<String> list) throws IOException;

    void zzb(int i9, List<?> list, zzll zzllVar) throws IOException;

    void zzb(int i9, List<Double> list, boolean z8) throws IOException;

    void zzc(int i9, int i10) throws IOException;

    void zzc(int i9, long j7) throws IOException;

    void zzc(int i9, List<Integer> list, boolean z8) throws IOException;

    void zzd(int i9, int i10) throws IOException;

    void zzd(int i9, long j7) throws IOException;

    void zzd(int i9, List<Integer> list, boolean z8) throws IOException;

    void zze(int i9, int i10) throws IOException;

    void zze(int i9, long j7) throws IOException;

    void zze(int i9, List<Long> list, boolean z8) throws IOException;

    void zzf(int i9, int i10) throws IOException;

    void zzf(int i9, List<Float> list, boolean z8) throws IOException;

    void zzg(int i9, List<Integer> list, boolean z8) throws IOException;

    void zzh(int i9, List<Long> list, boolean z8) throws IOException;

    void zzi(int i9, List<Integer> list, boolean z8) throws IOException;

    void zzj(int i9, List<Long> list, boolean z8) throws IOException;

    void zzk(int i9, List<Integer> list, boolean z8) throws IOException;

    void zzl(int i9, List<Long> list, boolean z8) throws IOException;

    void zzm(int i9, List<Integer> list, boolean z8) throws IOException;

    void zzn(int i9, List<Long> list, boolean z8) throws IOException;
}
