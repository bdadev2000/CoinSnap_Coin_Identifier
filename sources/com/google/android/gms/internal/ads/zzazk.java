package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzazk {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazz zze;
    private final zzbah zzf;
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

    public zzazk(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = z2;
        this.zze = new zzazz(i5);
        this.zzf = new zzbah(i6, i7, i8);
    }

    private final void zzp(@Nullable String str, boolean z2, float f2, float f3, float f4, float f5) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z2) {
                        this.zzi.add(str);
                        this.zzj.add(new zzazv(f2, f3, f4, f5, this.zzi.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            sb.append((String) arrayList.get(i3));
            sb.append(' ');
            i3++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazk)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzazk) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i2 = this.zzl;
        int i3 = this.zzn;
        int i4 = this.zzk;
        String zzq = zzq(arrayList, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder u2 = d.u("ActivityContent fetchId: ", i2, " score:", i3, " total_length:");
        androidx.compose.foundation.text.input.a.y(u2, i4, "\n text: ", zzq, "\n viewableText");
        u2.append(zzq2);
        u2.append("\n signture: ");
        u2.append(str);
        u2.append("\n viewableSignture: ");
        u2.append(str2);
        u2.append("\n viewableSignatureForVertical: ");
        u2.append(str3);
        return u2.toString();
    }

    @VisibleForTesting
    public final int zza(int i2, int i3) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i3 * this.zzb) + (i2 * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    @VisibleForTesting
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

    public final void zzj(int i2) {
        this.zzl = i2;
    }

    public final void zzk(String str, boolean z2, float f2, float f3, float f4, float f5) {
        zzp(str, z2, f2, f3, f4, f5);
    }

    public final void zzl(String str, boolean z2, float f2, float f3, float f4, float f5) {
        zzp(str, z2, f2, f3, f4, f5);
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
        boolean z2;
        synchronized (this.zzg) {
            z2 = this.zzm == 0;
        }
        return z2;
    }
}
