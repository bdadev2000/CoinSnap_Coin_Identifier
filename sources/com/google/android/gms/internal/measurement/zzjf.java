package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.jacoco.core.runtime.AgentOptions;

/* loaded from: classes3.dex */
final class zzjf implements zznb {
    private final zzjc zza;

    private zzjf(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) zzjv.zza(zzjcVar, AgentOptions.OUTPUT);
        this.zza = zzjcVar2;
        zzjcVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<Double> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzje)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zza(list.get(i5).doubleValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zzb(list.get(i3).doubleValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        zzje zzjeVar = (zzje) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zzjeVar.size(); i7++) {
                i6 += zzjc.zza(zzjeVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zzjeVar.size()) {
                this.zza.zzb(zzjeVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzjeVar.size()) {
            this.zza.zzb(i2, zzjeVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zzd(list.get(i5).intValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zzb(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
                i6 += zzjc.zzd(zzjwVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zzjwVar.size()) {
                this.zza.zzb(zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzjwVar.size()) {
            this.zza.zzb(i2, zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zze(list.get(i5).intValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zza(list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
                i6 += zzjc.zze(zzjwVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zzjwVar.size()) {
                this.zza.zza(zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzjwVar.size()) {
            this.zza.zza(i2, zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zzc(list.get(i5).longValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zza(list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zzknVar.size(); i7++) {
                i6 += zzjc.zzc(zzknVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zzknVar.size()) {
                this.zza.zza(zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzknVar.size()) {
            this.zza.zza(i2, zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i2, List<Float> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjs)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zza(list.get(i5).floatValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zzb(list.get(i3).floatValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zzb(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        zzjs zzjsVar = (zzjs) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zzjsVar.size(); i7++) {
                i6 += zzjc.zza(zzjsVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zzjsVar.size()) {
                this.zza.zzb(zzjsVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zzjsVar.size()) {
            this.zza.zzb(i2, zzjsVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzg(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzf(list.get(i5).intValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzb(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
            i6 += zzjc.zzf(zzjwVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzjwVar.size()) {
            this.zza.zzb(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzh(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzd(list.get(i5).longValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzb(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzknVar.size(); i7++) {
            i6 += zzjc.zzd(zzknVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzi(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzg(list.get(i5).intValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zza(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
            i6 += zzjc.zzg(zzjwVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzjwVar.size()) {
            this.zza.zza(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzj(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zza(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zze(list.get(i5).longValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zza(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zza(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzknVar.size(); i7++) {
            i6 += zzjc.zze(zzknVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzknVar.size()) {
            this.zza.zza(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzk(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzk(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzh(list.get(i5).intValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzk(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzk(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
            i6 += zzjc.zzh(zzjwVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzjwVar.size()) {
            this.zza.zzk(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzl(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzh(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzf(list.get(i5).longValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzh(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzh(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzknVar.size(); i7++) {
            i6 += zzjc.zzf(zzknVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzknVar.size()) {
            this.zza.zzh(zzknVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzm(int i2, List<Integer> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzjw)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzd(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzj(list.get(i5).intValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzc(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) list;
        if (!z2) {
            while (i3 < zzjwVar.size()) {
                this.zza.zzd(i2, zzjwVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzjwVar.size(); i7++) {
            i6 += zzjc.zzj(zzjwVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzjwVar.size()) {
            this.zza.zzc(zzjwVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzn(int i2, List<Long> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzkn)) {
            if (!z2) {
                while (i3 < list.size()) {
                    this.zza.zzb(i2, list.get(i3).longValue());
                    i3++;
                }
                return;
            }
            this.zza.zzc(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += zzjc.zzg(list.get(i5).longValue());
            }
            this.zza.zzc(i4);
            while (i3 < list.size()) {
                this.zza.zzb(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        zzkn zzknVar = (zzkn) list;
        if (!z2) {
            while (i3 < zzknVar.size()) {
                this.zza.zzb(i2, zzknVar.zzb(i3));
                i3++;
            }
            return;
        }
        this.zza.zzc(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < zzknVar.size(); i7++) {
            i6 += zzjc.zzg(zzknVar.zzb(i7));
        }
        this.zza.zzc(i6);
        while (i3 < zzknVar.size()) {
            this.zza.zzb(zzknVar.zzb(i3));
            i3++;
        }
    }

    public static zzjf zza(zzjc zzjcVar) {
        zzjf zzjfVar = zzjcVar.zza;
        return zzjfVar != null ? zzjfVar : new zzjf(zzjcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, boolean z2) throws IOException {
        this.zza.zza(i2, z2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<Boolean> list, boolean z2) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzii)) {
            if (z2) {
                this.zza.zzc(i2, 2);
                int i4 = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    i4 += zzjc.zza(list.get(i5).booleanValue());
                }
                this.zza.zzc(i4);
                while (i3 < list.size()) {
                    this.zza.zzb(list.get(i3).booleanValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                this.zza.zza(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        zzii zziiVar = (zzii) list;
        if (z2) {
            this.zza.zzc(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < zziiVar.size(); i7++) {
                i6 += zzjc.zza(zziiVar.zzb(i7));
            }
            this.zza.zzc(i6);
            while (i3 < zziiVar.size()) {
                this.zza.zzb(zziiVar.zzb(i3));
                i3++;
            }
            return;
        }
        while (i3 < zziiVar.size()) {
            this.zza.zza(i2, zziiVar.zzb(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, int i3) throws IOException {
        this.zza.zza(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, int i3) throws IOException {
        this.zza.zza(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, int i3) throws IOException {
        this.zza.zzk(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzf(int i2, int i3) throws IOException {
        this.zza.zzd(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, long j2) throws IOException {
        this.zza.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzd(int i2, long j2) throws IOException {
        this.zza.zzh(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zze(int i2, long j2) throws IOException {
        this.zza.zzb(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, Object obj, zzlu zzluVar) throws IOException {
        this.zza.zza(i2, (zzlc) obj, zzluVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<?> list, zzlu zzluVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzb(i2, list.get(i3), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, zzik zzikVar) throws IOException {
        this.zza.zza(i2, zzikVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<zzik> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.zza.zza(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zzb(int i2) throws IOException {
        this.zza.zzc(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzc(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zzb(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i3 < list.size()) {
                Object zza = zzkjVar.zza(i3);
                if (zza instanceof String) {
                    this.zza.zza(i2, (String) zza);
                } else {
                    this.zza.zza(i2, (zzik) zza);
                }
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.zza.zza(i2, list.get(i3));
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, double d) throws IOException {
        this.zza.zzb(i2, d);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    @Deprecated
    public final void zza(int i2) throws IOException {
        this.zza.zzc(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, int i3) throws IOException {
        this.zza.zzb(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, long j2) throws IOException {
        this.zza.zza(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, float f2) throws IOException {
        this.zza.zzb(i2, f2);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, Object obj, zzlu zzluVar) throws IOException {
        zzjc zzjcVar = this.zza;
        zzjcVar.zzc(i2, 3);
        zzluVar.zza((zzlu) obj, (zznb) zzjcVar.zza);
        zzjcVar.zzc(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, List<?> list, zzlu zzluVar) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            zza(i2, list.get(i3), zzluVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final <K, V> void zza(int i2, zzkt<K, V> zzktVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzc(i2, 2);
            this.zza.zzc(zzku.zza(zzktVar, entry.getKey(), entry.getValue()));
            zzku.zza(this.zza, zzktVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, Object obj) throws IOException {
        if (obj instanceof zzik) {
            this.zza.zzb(i2, (zzik) obj);
        } else {
            this.zza.zza(i2, (zzlc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznb
    public final void zza(int i2, String str) throws IOException {
        this.zza.zza(i2, str);
    }
}
