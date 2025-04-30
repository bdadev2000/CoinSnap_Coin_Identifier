package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zziw implements zzna {
    private final zzit zza;

    private zziw(zzit zzitVar) {
        zzit zzitVar2 = (zzit) zzjm.zza(zzitVar, "output");
        this.zza = zzitVar2;
        zzitVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, List<Double> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zziv)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zza(list.get(i12).doubleValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).doubleValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        zziv zzivVar = (zziv) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzivVar.size(); i14++) {
                i13 += zzit.zza(zzivVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzivVar.size()) {
                this.zza.zzb(zzivVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzivVar.size()) {
            this.zza.zzb(i9, zzivVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjn)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zzd(list.get(i12).intValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzjnVar.size(); i14++) {
                i13 += zzit.zzd(zzjnVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzjnVar.size()) {
                this.zza.zzb(zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzjnVar.size()) {
            this.zza.zzb(i9, zzjnVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjn)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zze(list.get(i12).intValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zza(list.get(i10).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zza(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        zzjn zzjnVar = (zzjn) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzjnVar.size(); i14++) {
                i13 += zzit.zze(zzjnVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzjnVar.size()) {
                this.zza.zza(zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzjnVar.size()) {
            this.zza.zza(i9, zzjnVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzke)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zzc(list.get(i12).longValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zza(list.get(i10).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zza(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        zzke zzkeVar = (zzke) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzkeVar.size(); i14++) {
                i13 += zzit.zzc(zzkeVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzkeVar.size()) {
                this.zza.zza(zzkeVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzkeVar.size()) {
            this.zza.zza(i9, zzkeVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzf(int i9, List<Float> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzjj)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zza(list.get(i12).floatValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).floatValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        zzjj zzjjVar = (zzjj) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzjjVar.size(); i14++) {
                i13 += zzit.zza(zzjjVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzjjVar.size()) {
                this.zza.zzb(zzjjVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzjjVar.size()) {
            this.zza.zzb(i9, zzjjVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzg(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzjnVar.size(); i12++) {
                    i11 += zzit.zzf(zzjnVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzjnVar.size()) {
                    this.zza.zzb(zzjnVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzjnVar.size()) {
                this.zza.zzb(i9, zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzf(list.get(i14).intValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzb(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzh(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzkeVar.size(); i12++) {
                    i11 += zzit.zzd(zzkeVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzkeVar.size()) {
                    this.zza.zzb(zzkeVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzkeVar.size()) {
                this.zza.zzb(i9, zzkeVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzd(list.get(i14).longValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzb(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzi(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzjnVar.size(); i12++) {
                    i11 += zzit.zzg(zzjnVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzjnVar.size()) {
                    this.zza.zza(zzjnVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzjnVar.size()) {
                this.zza.zza(i9, zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzg(list.get(i14).intValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zza(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzj(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzkeVar.size(); i12++) {
                    i11 += zzit.zze(zzkeVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzkeVar.size()) {
                    this.zza.zza(zzkeVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzkeVar.size()) {
                this.zza.zza(i9, zzkeVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zze(list.get(i14).longValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zza(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zza(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzk(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzjnVar.size(); i12++) {
                    i11 += zzit.zzh(zzjnVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzjnVar.size()) {
                    this.zza.zzk(zzjnVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzjnVar.size()) {
                this.zza.zzk(i9, zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzh(list.get(i14).intValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzk(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzk(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzl(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzkeVar.size(); i12++) {
                    i11 += zzit.zzf(zzkeVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzkeVar.size()) {
                    this.zza.zzh(zzkeVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzkeVar.size()) {
                this.zza.zzh(i9, zzkeVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzf(list.get(i14).longValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzh(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzh(i9, list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzm(int i9, List<Integer> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzjnVar.size(); i12++) {
                    i11 += zzit.zzj(zzjnVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzjnVar.size()) {
                    this.zza.zzc(zzjnVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzjnVar.size()) {
                this.zza.zzd(i9, zzjnVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzj(list.get(i14).intValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzc(list.get(i10).intValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzd(i9, list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzn(int i9, List<Long> list, boolean z8) throws IOException {
        int i10 = 0;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < zzkeVar.size(); i12++) {
                    i11 += zzit.zzg(zzkeVar.zzb(i12));
                }
                this.zza.zzc(i11);
                while (i10 < zzkeVar.size()) {
                    this.zza.zzb(zzkeVar.zzb(i10));
                    i10++;
                }
                return;
            }
            while (i10 < zzkeVar.size()) {
                this.zza.zzb(i9, zzkeVar.zzb(i10));
                i10++;
            }
            return;
        }
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += zzit.zzg(list.get(i14).longValue());
            }
            this.zza.zzc(i13);
            while (i10 < list.size()) {
                this.zza.zzb(list.get(i10).longValue());
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zzb(i9, list.get(i10).longValue());
            i10++;
        }
    }

    public static zziw zza(zzit zzitVar) {
        zziw zziwVar = zzitVar.zza;
        return zziwVar != null ? zziwVar : new zziw(zzitVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, boolean z8) throws IOException {
        this.zza.zza(i9, z8);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, List<Boolean> list, boolean z8) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzhy)) {
            if (z8) {
                this.zza.zzc(i9, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += zzit.zza(list.get(i12).booleanValue());
                }
                this.zza.zzc(i11);
                while (i10 < list.size()) {
                    this.zza.zzb(list.get(i10).booleanValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                this.zza.zza(i9, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        zzhy zzhyVar = (zzhy) list;
        if (z8) {
            this.zza.zzc(i9, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < zzhyVar.size(); i14++) {
                i13 += zzit.zza(zzhyVar.zzb(i14));
            }
            this.zza.zzc(i13);
            while (i10 < zzhyVar.size()) {
                this.zza.zzb(zzhyVar.zzb(i10));
                i10++;
            }
            return;
        }
        while (i10 < zzhyVar.size()) {
            this.zza.zza(i9, zzhyVar.zzb(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, int i10) throws IOException {
        this.zza.zza(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i9, int i10) throws IOException {
        this.zza.zza(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i9, int i10) throws IOException {
        this.zza.zzk(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzf(int i9, int i10) throws IOException {
        this.zza.zzd(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, long j7) throws IOException {
        this.zza.zzb(i9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zze(int i9, long j7) throws IOException {
        this.zza.zzb(i9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzd(int i9, long j7) throws IOException {
        this.zza.zzh(i9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, Object obj, zzll zzllVar) throws IOException {
        this.zza.zza(i9, (zzkt) obj, zzllVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, zzia zziaVar) throws IOException {
        this.zza.zza(i9, zziaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, List<?> list, zzll zzllVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzb(i9, list.get(i10), zzllVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i9, int i10) throws IOException {
        this.zza.zzb(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, List<zzia> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zza(i9, list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzc(int i9, long j7) throws IOException {
        this.zza.zza(i9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    @Deprecated
    public final void zzb(int i9) throws IOException {
        this.zza.zzc(i9, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, double d2) throws IOException {
        this.zza.zzb(i9, d2);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zzb(int i9, List<String> list) throws IOException {
        int i10 = 0;
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            while (i10 < list.size()) {
                Object zza = zzkaVar.zza(i10);
                if (zza instanceof String) {
                    this.zza.zza(i9, (String) zza);
                } else {
                    this.zza.zza(i9, (zzia) zza);
                }
                i10++;
            }
            return;
        }
        while (i10 < list.size()) {
            this.zza.zza(i9, list.get(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    @Deprecated
    public final void zza(int i9) throws IOException {
        this.zza.zzc(i9, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, int i10) throws IOException {
        this.zza.zzb(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, long j7) throws IOException {
        this.zza.zza(i9, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, float f9) throws IOException {
        this.zza.zzb(i9, f9);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, Object obj, zzll zzllVar) throws IOException {
        zzit zzitVar = this.zza;
        zzitVar.zzc(i9, 3);
        zzllVar.zza((zzll) obj, (zzna) zzitVar.zza);
        zzitVar.zzc(i9, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, List<?> list, zzll zzllVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zza(i9, list.get(i10), zzllVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final <K, V> void zza(int i9, zzkk<K, V> zzkkVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i9, 2);
            this.zza.zzc(zzkl.zza(zzkkVar, entry.getKey(), entry.getValue()));
            zzkl.zza(this.zza, zzkkVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, Object obj) throws IOException {
        if (obj instanceof zzia) {
            this.zza.zzb(i9, (zzia) obj);
        } else {
            this.zza.zza(i9, (zzkt) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzna
    public final void zza(int i9, String str) throws IOException {
        this.zza.zza(i9, str);
    }
}
