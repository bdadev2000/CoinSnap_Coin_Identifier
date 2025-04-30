package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzgtn {
    private ArrayList zza = new ArrayList();
    private zzgtk zzb = zzgtk.zza;
    private Integer zzc = null;

    public final zzgtn zza(zzghk zzghkVar, int i9, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgtp(zzghkVar, i9, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgtn zzb(zzgtk zzgtkVar) {
        if (this.zza != null) {
            this.zzb = zzgtkVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgtn zzc(int i9) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i9);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgtr zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    int zza = ((zzgtp) arrayList.get(i9)).zza();
                    i9++;
                    if (zza == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgtr zzgtrVar = new zzgtr(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgtrVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
