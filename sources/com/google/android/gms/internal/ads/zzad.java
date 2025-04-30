package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzad implements Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzac();
    public final UUID zza;

    @Nullable
    public final String zzb;
    public final String zzc;

    @Nullable
    public final byte[] zzd;
    private int zze;

    public zzad(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i9 = zzgd.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzad zzadVar = (zzad) obj;
        if (!zzgd.zzG(this.zzb, zzadVar.zzb) || !zzgd.zzG(this.zzc, zzadVar.zzc) || !zzgd.zzG(this.zza, zzadVar.zza) || !Arrays.equals(this.zzd, zzadVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = this.zze;
        if (i9 == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int b = AbstractC2914a.b((hashCode2 + hashCode) * 31, 31, this.zzc) + Arrays.hashCode(this.zzd);
            this.zze = b;
            return b;
        }
        return i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzad(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzcg.zze(str2);
        this.zzd = bArr;
    }
}
