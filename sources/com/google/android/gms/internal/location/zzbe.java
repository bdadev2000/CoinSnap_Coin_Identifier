package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    @SafeParcelable.Field(getter = "getRequestId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLoiteringDelay", id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i9, @SafeParcelable.Param(id = 3) short s5, @SafeParcelable.Param(id = 4) double d2, @SafeParcelable.Param(id = 5) double d9, @SafeParcelable.Param(id = 6) float f9, @SafeParcelable.Param(id = 2) long j7, @SafeParcelable.Param(id = 8) int i10, @SafeParcelable.Param(id = 9) int i11) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f9 > 0.0f) {
                if (d2 <= 90.0d && d2 >= -90.0d) {
                    if (d9 <= 180.0d && d9 >= -180.0d) {
                        int i12 = i9 & 7;
                        if (i12 != 0) {
                            this.zzc = s5;
                            this.zza = str;
                            this.zzd = d2;
                            this.zze = d9;
                            this.zzf = f9;
                            this.zzb = j7;
                            this.zzg = i12;
                            this.zzh = i10;
                            this.zzi = i11;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i9);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d9);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d2);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f9);
            throw new IllegalArgumentException(sb4.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((Float.floatToIntBits(this.zzf) + ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s5 = this.zzc;
        if (s5 != -1) {
            if (s5 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
