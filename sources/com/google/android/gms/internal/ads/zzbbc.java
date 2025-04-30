package com.google.android.gms.internal.ads;

import Q7.n0;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzbbc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbbr zze;
    private final zzbbz zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbbc(int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z8) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z8;
        this.zze = new zzbbr(i12);
        this.zzf = new zzbbz(i13, i14, i15);
    }

    private final void zzp(@Nullable String str, boolean z8, float f9, float f10, float f11, float f12) {
        if (str != null) {
            if (str.length() >= this.zzc) {
                synchronized (this.zzg) {
                    try {
                        this.zzh.add(str);
                        this.zzk += str.length();
                        if (z8) {
                            this.zzi.add(str);
                            this.zzj.add(new zzbbn(f9, f10, f11, f12, this.zzi.size() - 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i9) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb.append((String) arrayList.get(i10));
            sb.append(' ');
            i10++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbbc)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzbbc) obj).zzo;
        if (str == null || !str.equals(this.zzo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i9 = this.zzl;
        int i10 = this.zzn;
        int i11 = this.zzk;
        String zzq = zzq(arrayList, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder o3 = n0.o(i9, i10, "ActivityContent fetchId: ", " score:", " total_length:");
        o3.append(i11);
        o3.append("\n text: ");
        o3.append(zzq);
        o3.append("\n viewableText");
        AbstractC2914a.j(o3, zzq2, "\n signture: ", str, "\n viewableSignture: ");
        return n0.l(o3, str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final int zza(int i9, int i10) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i10 * this.zzb) + (i9 * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i9) {
        this.zzl = i9;
    }

    public final void zzk(String str, boolean z8, float f9, float f10, float f11, float f12) {
        zzp(str, z8, f9, f10, f11, f12);
    }

    public final void zzl(String str, boolean z8, float f9, float f10, float f11, float f12) {
        zzp(str, z8, f9, f10, f11, f12);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("ActivityContent: negative number of WebViews.");
                }
                zzm();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            try {
                int zza = zza(this.zzk, this.zzl);
                if (zza > this.zzn) {
                    this.zzn = zza;
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        this.zzo = this.zze.zza(this.zzh);
                        this.zzp = this.zze.zza(this.zzi);
                    }
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            try {
                int zza = zza(this.zzk, this.zzl);
                if (zza > this.zzn) {
                    this.zzn = zza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzo() {
        boolean z8;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }
}
