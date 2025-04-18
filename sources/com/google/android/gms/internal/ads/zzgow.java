package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzgow {
    private ArrayList zza = new ArrayList();
    private zzgot zzb = zzgot.zza;
    private Integer zzc = null;

    public final zzgow zza(zzghf zzghfVar, int i2, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzgoy(zzghfVar, i2, str, str2, null));
        return this;
    }

    public final zzgow zzb(zzgot zzgotVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgotVar;
        return this;
    }

    public final zzgow zzc(int i2) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i2);
        return this;
    }

    public final zzgpa zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int zza = ((zzgoy) arrayList.get(i2)).zza();
                i2++;
                if (zza == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzgpa zzgpaVar = new zzgpa(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgpaVar;
    }
}
