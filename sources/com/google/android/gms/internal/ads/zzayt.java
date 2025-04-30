package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzayt extends zzazs {
    public zzayt(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "2/TrxXzdli4Us4FPDPyGZmc5MrxtH8QgmFF/OAjS44SLVVLbzYRftaNDX3sVzVmu", "9ObkV+9nuY0gPBNLH25GoxM7YATuF1pi7IORvVFb3+Q=", zzatpVar, i9, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzn(-1L);
        this.zze.zzm(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzb());
        synchronized (this.zze) {
            try {
                this.zze.zzn(iArr[0]);
                this.zze.zzm(iArr[1]);
                int i9 = iArr[2];
                if (i9 != Integer.MIN_VALUE) {
                    this.zze.zzl(i9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
