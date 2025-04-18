package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzgng {
    private ArrayList zza = new ArrayList();
    private zzgnd zzb = zzgnd.zza;
    private Integer zzc = null;

    public final zzgng zza(zzgfy zzgfyVar, int i10, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgnh(zzgfyVar, i10, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgng zzb(zzgnd zzgndVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgndVar;
        return this;
    }

    public final zzgng zzc(int i10) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgnj zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int zza = ((zzgnh) arrayList.get(i10)).zza();
                    i10++;
                    if (zza == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgnj zzgnjVar = new zzgnj(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgnjVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
