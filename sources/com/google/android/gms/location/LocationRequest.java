package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", id = 4)
    boolean zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", id = 5)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", id = 6)
    int zzf;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", id = 7)
    float zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", id = 8)
    long zzh;

    @SafeParcelable.Field(defaultValue = "false", id = 9)
    boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000L;
        this.zzc = TTAdConstant.AD_MAX_EVENT_TIME;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    @NonNull
    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j7) {
        if (j7 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j7);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j7 = this.zzh;
        long j9 = this.zzb;
        return j7 < j9 ? j9 : j7;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    @NonNull
    public LocationRequest setExpirationDuration(long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = Long.MAX_VALUE;
        if (j7 <= Long.MAX_VALUE - elapsedRealtime) {
            j9 = j7 + elapsedRealtime;
        }
        this.zze = j9;
        if (j9 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setExpirationTime(long j7) {
        this.zze = j7;
        if (j7 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setFastestInterval(long j7) {
        zza(j7);
        this.zzd = true;
        this.zzc = j7;
        return this;
    }

    @NonNull
    public LocationRequest setInterval(long j7) {
        zza(j7);
        this.zzb = j7;
        if (!this.zzd) {
            this.zzc = (long) (j7 / 6.0d);
        }
        return this;
    }

    @NonNull
    public LocationRequest setMaxWaitTime(long j7) {
        zza(j7);
        this.zzh = j7;
        return this;
    }

    @NonNull
    public LocationRequest setNumUpdates(int i9) {
        if (i9 > 0) {
            this.zzf = i9;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    public LocationRequest setPriority(int i9) {
        if (i9 != 100 && i9 != 102 && i9 != 104 && i9 != 105) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("invalid quality: ");
            sb.append(i9);
            throw new IllegalArgumentException(sb.toString());
        }
        this.zza = i9;
        return this;
    }

    @NonNull
    public LocationRequest setSmallestDisplacement(float f9) {
        if (f9 >= 0.0f) {
            this.zzg = f9;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f9);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    public LocationRequest setWaitForAccurateLocation(boolean z8) {
        this.zzi = z8;
        return this;
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Request[");
        int i9 = this.zza;
        if (i9 != 100) {
            if (i9 != 102) {
                if (i9 != 104) {
                    if (i9 != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb.append(str);
        if (this.zza != 105) {
            sb.append(" requested=");
            sb.append(this.zzb);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.zzc);
        sb.append("ms");
        if (this.zzh > this.zzb) {
            sb.append(" maxWait=");
            sb.append(this.zzh);
            sb.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.zzg);
            sb.append("m");
        }
        long j7 = this.zze;
        if (j7 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j7 - elapsedRealtime);
            sb.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.zzf);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) long j7, @SafeParcelable.Param(id = 3) long j9, @SafeParcelable.Param(id = 4) boolean z8, @SafeParcelable.Param(id = 5) long j10, @SafeParcelable.Param(id = 6) int i10, @SafeParcelable.Param(id = 7) float f9, @SafeParcelable.Param(id = 8) long j11, @SafeParcelable.Param(id = 9) boolean z9) {
        this.zza = i9;
        this.zzb = j7;
        this.zzc = j9;
        this.zzd = z8;
        this.zze = j10;
        this.zzf = i10;
        this.zzg = f9;
        this.zzh = j11;
        this.zzi = z9;
    }
}
