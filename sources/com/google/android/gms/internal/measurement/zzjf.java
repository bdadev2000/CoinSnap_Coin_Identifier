package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, "output");
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzje)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zza(list.get(i13).doubleValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zzb(list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zzjeVar.size(); i15++) {
                i14 += zzjc.zza(zzjeVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zzjeVar.size()) {
                this.zza.zzb(zzjeVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzjeVar.size()) {
            this.zza.zzb(i10, zzjeVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzjw)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zzd(list.get(i13).intValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zzb(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zzjwVar.size(); i15++) {
                i14 += zzjc.zzd(zzjwVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zzjwVar.size()) {
                this.zza.zzb(zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzjwVar.size()) {
            this.zza.zzb(i10, zzjwVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzjw)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zze(list.get(i13).intValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zza(list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zzjwVar.size(); i15++) {
                i14 += zzjc.zze(zzjwVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zzjwVar.size()) {
                this.zza.zza(zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzjwVar.size()) {
            this.zza.zza(i10, zzjwVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzkn)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zzc(list.get(i13).longValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zza(list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zzknVar.size(); i15++) {
                i14 += zzjc.zzc(zzknVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zzknVar.size()) {
                this.zza.zza(zzknVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzknVar.size()) {
            this.zza.zza(i10, zzknVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzjs)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zza(list.get(i13).floatValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zzb(list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zzjsVar.size(); i15++) {
                i14 += zzjc.zza(zzjsVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zzjsVar.size()) {
                this.zza.zzb(zzjsVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zzjsVar.size()) {
            this.zza.zzb(i10, zzjsVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjwVar.size(); i13++) {
                    i12 += zzjc.zzf(zzjwVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjwVar.size()) {
                    this.zza.zzb(zzjwVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjwVar.size()) {
                this.zza.zzb(i10, zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzf(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzknVar.size(); i13++) {
                    i12 += zzjc.zzd(zzknVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzknVar.size()) {
                    this.zza.zzb(zzknVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzknVar.size()) {
                this.zza.zzb(i10, zzknVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzd(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjwVar.size(); i13++) {
                    i12 += zzjc.zzg(zzjwVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjwVar.size()) {
                    this.zza.zza(zzjwVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjwVar.size()) {
                this.zza.zza(i10, zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzg(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzknVar.size(); i13++) {
                    i12 += zzjc.zze(zzknVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzknVar.size()) {
                    this.zza.zza(zzknVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzknVar.size()) {
                this.zza.zza(i10, zzknVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zze(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjwVar.size(); i13++) {
                    i12 += zzjc.zzh(zzjwVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjwVar.size()) {
                    this.zza.zzk(zzjwVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjwVar.size()) {
                this.zza.zzk(i10, zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzh(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzk(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzknVar.size(); i13++) {
                    i12 += zzjc.zzf(zzknVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzknVar.size()) {
                    this.zza.zzh(zzknVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzknVar.size()) {
                this.zza.zzh(i10, zzknVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzf(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzjwVar.size(); i13++) {
                    i12 += zzjc.zzj(zzjwVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzjwVar.size()) {
                    this.zza.zzc(zzjwVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzjwVar.size()) {
                this.zza.zzd(i10, zzjwVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzj(list.get(i15).intValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzc(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < zzknVar.size(); i13++) {
                    i12 += zzjc.zzg(zzknVar.zzb(i13));
                }
                this.zza.zzc(i12);
                while (i11 < zzknVar.size()) {
                    this.zza.zzb(zzknVar.zzb(i11));
                    i11++;
                }
                return;
            }
            while (i11 < zzknVar.size()) {
                this.zza.zzb(i10, zzknVar.zzb(i11));
                i11++;
            }
            return;
        }
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < list.size(); i15++) {
                i14 += zzjc.zzg(list.get(i15).longValue());
            }
            this.zza.zzc(i14);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public static zzjf zza(zzjc zzjcVar) {
        zzjf zzjfVar = zzjcVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, boolean z10) throws IOException {
        this.zza.zza(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof zzii)) {
            if (z10) {
                this.zza.zzc(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += zzjc.zza(list.get(i13).booleanValue());
                }
                this.zza.zzc(i12);
                while (i11 < list.size()) {
                    this.zza.zzb(list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                this.zza.zza(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i14 = 0;
            for (int i15 = 0; i15 < zziiVar.size(); i15++) {
                i14 += zzjc.zza(zziiVar.zzb(i15));
            }
            this.zza.zzc(i14);
            while (i11 < zziiVar.size()) {
                this.zza.zzb(zziiVar.zzb(i11));
                i11++;
            }
            return;
        }
        while (i11 < zziiVar.size()) {
            this.zza.zza(i10, zziiVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i10, int i11) throws IOException {
        this.zza.zza(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i10, int i11) throws IOException {
        this.zza.zzk(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, long j3) throws IOException {
        this.zza.zzb(i10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i10, long j3) throws IOException {
        this.zza.zzb(i10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i10, long j3) throws IOException {
        this.zza.zzh(i10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, Object obj, zzlu zzluVar) throws IOException {
        this.zza.zza(i10, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, zzik zzikVar) throws IOException {
        this.zza.zza(i10, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, List<?> list, zzlu zzluVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, List<zzik> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i10, long j3) throws IOException {
        this.zza.zza(i10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i10) throws IOException {
        this.zza.zzc(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, double d10) throws IOException {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i11 < list.size()) {
                Object zza = zzkjVar.zza(i11);
                if (zza instanceof String) {
                    this.zza.zza(i10, (String) zza);
                } else {
                    this.zza.zza(i10, (zzik) zza);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i10) throws IOException {
        this.zza.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, long j3) throws IOException {
        this.zza.zza(i10, j3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, float f10) throws IOException {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, Object obj, zzlu zzluVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i10, 3);
        zzluVar.zza((zzlu) obj, (zznb) zzjcVar.zza);
        zzjcVar.zzc(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, List<?> list, zzlu zzluVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i10, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, Object obj) throws IOException {
        if (obj instanceof zzik) {
            this.zza.zzb(i10, (zzik) obj);
        } else {
            this.zza.zza(i10, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i10, String str) throws IOException {
        this.zza.zza(i10, str);
    }
}
