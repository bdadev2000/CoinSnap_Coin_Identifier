package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        return this.zza.equals(((zzas) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return AbstractC2914a.e("\"", this.zza, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0303  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List<com.google.android.gms.internal.measurement.zzaq> r24) {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }
}
