package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
interface zznb {
    int zza();

    @Deprecated
    void zza(int i10) throws IOException;

    void zza(int i10, double d10) throws IOException;

    void zza(int i10, float f10) throws IOException;

    void zza(int i10, int i11) throws IOException;

    void zza(int i10, long j3) throws IOException;

    void zza(int i10, zzik zzikVar) throws IOException;

    <K, V> void zza(int i10, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException;

    void zza(int i10, Object obj) throws IOException;

    @Deprecated
    void zza(int i10, Object obj, zzlu zzluVar) throws IOException;

    void zza(int i10, String str) throws IOException;

    void zza(int i10, List<zzik> list) throws IOException;

    @Deprecated
    void zza(int i10, List<?> list, zzlu zzluVar) throws IOException;

    void zza(int i10, List<Boolean> list, boolean z10) throws IOException;

    void zza(int i10, boolean z10) throws IOException;

    @Deprecated
    void zzb(int i10) throws IOException;

    void zzb(int i10, int i11) throws IOException;

    void zzb(int i10, long j3) throws IOException;

    void zzb(int i10, Object obj, zzlu zzluVar) throws IOException;

    void zzb(int i10, List<String> list) throws IOException;

    void zzb(int i10, List<?> list, zzlu zzluVar) throws IOException;

    void zzb(int i10, List<Double> list, boolean z10) throws IOException;

    void zzc(int i10, int i11) throws IOException;

    void zzc(int i10, long j3) throws IOException;

    void zzc(int i10, List<Integer> list, boolean z10) throws IOException;

    void zzd(int i10, int i11) throws IOException;

    void zzd(int i10, long j3) throws IOException;

    void zzd(int i10, List<Integer> list, boolean z10) throws IOException;

    void zze(int i10, int i11) throws IOException;

    void zze(int i10, long j3) throws IOException;

    void zze(int i10, List<Long> list, boolean z10) throws IOException;

    void zzf(int i10, int i11) throws IOException;

    void zzf(int i10, List<Float> list, boolean z10) throws IOException;

    void zzg(int i10, List<Integer> list, boolean z10) throws IOException;

    void zzh(int i10, List<Long> list, boolean z10) throws IOException;

    void zzi(int i10, List<Integer> list, boolean z10) throws IOException;

    void zzj(int i10, List<Long> list, boolean z10) throws IOException;

    void zzk(int i10, List<Integer> list, boolean z10) throws IOException;

    void zzl(int i10, List<Long> list, boolean z10) throws IOException;

    void zzm(int i10, List<Integer> list, boolean z10) throws IOException;

    void zzn(int i10, List<Long> list, boolean z10) throws IOException;
}
