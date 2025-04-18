package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import vd.e;

/* loaded from: classes3.dex */
public final class zzv implements Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzu();
    public final UUID zza;

    @Nullable
    public final String zzb;
    public final String zzc;

    @Nullable
    public final byte[] zzd;
    private int zze;

    public zzv(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzv)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzv zzvVar = (zzv) obj;
        if (!Objects.equals(this.zzb, zzvVar.zzb) || !Objects.equals(this.zzc, zzvVar.zzc) || !Objects.equals(this.zza, zzvVar.zza) || !Arrays.equals(this.zzd, zzvVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode2 = this.zza.hashCode() * 31;
            String str = this.zzb;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c10 = e.c(this.zzc, (hashCode2 + hashCode) * 31, 31) + Arrays.hashCode(this.zzd);
            this.zze = c10;
            return c10;
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzv(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzbg.zze(str2);
        this.zzd = bArr;
    }
}
