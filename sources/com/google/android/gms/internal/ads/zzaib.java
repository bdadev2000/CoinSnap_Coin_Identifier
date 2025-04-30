package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaib extends zzahr {
    public static final Parcelable.Creator<zzaib> CREATOR = new zzaia();

    @Nullable
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaib(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzgd.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaib.<init>(android.os.Parcel):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaib.class == obj.getClass()) {
            zzaib zzaibVar = (zzaib) obj;
            if (this.zzf.equals(zzaibVar.zzf) && zzgd.zzG(this.zza, zzaibVar.zza) && zzgd.zzG(this.zzb, zzaibVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = hashCode * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((i11 + i9) * 31) + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzaib(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
