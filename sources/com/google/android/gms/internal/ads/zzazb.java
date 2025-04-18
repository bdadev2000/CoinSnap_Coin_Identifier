package com.google.android.gms.internal.ads;

import a4.j;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzazb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazq zze;
    private final zzazy zzf;
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

    public zzazb(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = new zzazq(i13);
        this.zzf = new zzazy(i14, i15, i16);
    }

    private final void zzm(@Nullable String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() >= this.zzc) {
                synchronized (this.zzg) {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z10) {
                        this.zzi.add(str);
                        this.zzj.add(new zzazm(f10, f11, f12, f13, this.zzi.size() - 1));
                    }
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazb) obj).zzo;
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
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String zzn = zzn(arrayList, 100);
        String zzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder n10 = j.n("ActivityContent fetchId: ", i10, " score:", i11, " total_length:");
        n10.append(i12);
        n10.append("\n text: ");
        n10.append(zzn);
        n10.append("\n viewableText");
        n10.append(zzn2);
        n10.append("\n signture: ");
        n10.append(str);
        n10.append("\n viewableSignture: ");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(n10, str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final int zza(int i10, int i11) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i11 * this.zzb) + (i10 * this.zza);
    }

    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i10) {
        this.zzl = i10;
    }

    public final void zzh(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
    }

    public final void zzi(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzm(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("ActivityContent: negative number of WebViews.");
            }
            zzj();
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
