package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.input.a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return a.A("\"", this.zza, "\"");
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
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
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
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[PHI: r19
      0x00c3: PHI (r19v21 char) = 
      (r19v0 char)
      (r19v0 char)
      (r19v6 char)
      (r19v0 char)
      (r19v7 char)
      (r19v0 char)
      (r19v8 char)
      (r19v0 char)
      (r19v9 char)
      (r19v0 char)
      (r19v10 char)
      (r19v0 char)
      (r19v11 char)
      (r19v0 char)
      (r19v12 char)
      (r19v0 char)
      (r19v13 char)
      (r19v0 char)
      (r19v14 char)
      (r19v0 char)
      (r19v15 char)
      (r19v0 char)
      (r19v16 char)
      (r19v0 char)
      (r19v17 char)
      (r19v0 char)
      (r19v18 char)
     binds: [B:39:0x00c0, B:248:0x014a, B:249:0x014e, B:245:0x013f, B:246:0x0142, B:242:0x0135, B:243:0x0138, B:239:0x012b, B:240:0x012e, B:236:0x0121, B:237:0x0124, B:233:0x0117, B:234:0x011a, B:230:0x010d, B:231:0x0110, B:227:0x0103, B:228:0x0106, B:224:0x00f9, B:225:0x00fc, B:221:0x00ef, B:222:0x00f2, B:218:0x00e5, B:219:0x00e8, B:215:0x00db, B:216:0x00de, B:212:0x00d1, B:213:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fc  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzaq zza(java.lang.String r22, com.google.android.gms.internal.measurement.zzh r23, java.util.List<com.google.android.gms.internal.measurement.zzaq> r24) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zza(java.lang.String, com.google.android.gms.internal.measurement.zzh, java.util.List):com.google.android.gms.internal.measurement.zzaq");
    }
}
