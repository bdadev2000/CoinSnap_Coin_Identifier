package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;
import eb.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "-1", getter = "getMaxUpdateAgeMillis", id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 13)
    private final int zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", id = 14)
    private final String zzl;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 15)
    private final boolean zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 16)
    private final WorkSource zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 17)
    private final com.google.android.gms.internal.location.zzd zzo;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, TTAdConstant.AD_MAX_EVENT_TIME, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    @NonNull
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, TTAdConstant.AD_MAX_EVENT_TIME, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j3) {
        if (j3 == Long.MAX_VALUE) {
            return "∞";
        }
        return zzdj.zza(j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.zze;
        long j10 = elapsedRealtime + j3;
        if (((elapsedRealtime ^ j10) & (j3 ^ j10)) < 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    public boolean isBatched() {
        long j3 = this.zzd;
        return j3 > 0 && (j3 >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationDuration(long j3) {
        boolean z10;
        if (j3 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "durationMillis must be greater than 0");
        this.zze = j3;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j3) {
        this.zze = Math.max(1L, j3 - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setFastestInterval(long j3) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "illegal fastest interval: %d", Long.valueOf(j3));
        this.zzc = j3;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setInterval(long j3) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "intervalMillis must be greater than or equal to 0");
        long j10 = this.zzc;
        long j11 = this.zzb;
        if (j10 == j11 / 6) {
            this.zzc = j3 / 6;
        }
        if (this.zzi == j11) {
            this.zzi = j3;
        }
        this.zzb = j3;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setMaxWaitTime(long j3) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "illegal max wait time: %d", Long.valueOf(j3));
        this.zzd = j3;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setNumUpdates(int i10) {
        if (i10 > 0) {
            this.zzf = i10;
            return this;
        }
        throw new IllegalArgumentException(j.i("invalid numUpdates: ", i10));
    }

    @NonNull
    @Deprecated
    public LocationRequest setPriority(int i10) {
        zzae.zza(i10);
        this.zza = i10;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f10) {
        if (f10 >= 0.0f) {
            this.zzg = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    @NonNull
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z10) {
        this.zzh = z10;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder m10 = j.m("Request[");
        if (isPassive()) {
            m10.append(zzae.zzb(this.zza));
        } else {
            m10.append("@");
            if (isBatched()) {
                zzdj.zzb(this.zzb, m10);
                m10.append("/");
                zzdj.zzb(this.zzd, m10);
            } else {
                zzdj.zzb(this.zzb, m10);
            }
            m10.append(" ");
            m10.append(zzae.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            m10.append(", minUpdateInterval=");
            m10.append(zzf(this.zzc));
        }
        if (this.zzg > 0.0d) {
            m10.append(", minUpdateDistance=");
            m10.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            m10.append(", maxUpdateAge=");
            m10.append(zzf(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            m10.append(", duration=");
            zzdj.zzb(this.zze, m10);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            m10.append(", maxUpdates=");
            m10.append(this.zzf);
        }
        if (this.zzk != 0) {
            m10.append(", ");
            m10.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            m10.append(", ");
            m10.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            m10.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            m10.append(", bypass");
        }
        if (this.zzl != null) {
            m10.append(", moduleId=");
            m10.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            m10.append(", ");
            m10.append(this.zzn);
        }
        if (this.zzo != null) {
            m10.append(", impersonation=");
            m10.append(this.zzo);
        }
        m10.append(AbstractJsonLexerKt.END_LIST);
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzk;
    }

    @NonNull
    public final WorkSource zzb() {
        return this.zzn;
    }

    @Nullable
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzo;
    }

    @Nullable
    @Deprecated
    public final String zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzm;
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;

        @Nullable
        private String zzl;
        private boolean zzm;

        @Nullable
        private WorkSource zzn;

        @Nullable
        private com.google.android.gms.internal.location.zzd zzo;

        public Builder(int i10, long j3) {
            Preconditions.checkArgument(j3 >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i10);
            this.zza = i10;
            this.zzb = j3;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        @NonNull
        public LocationRequest build() {
            long j3;
            int i10 = this.zza;
            long j10 = this.zzb;
            long j11 = this.zzc;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.zzd, this.zzb);
            long j12 = this.zze;
            int i11 = this.zzf;
            float f10 = this.zzg;
            boolean z10 = this.zzh;
            long j13 = this.zzi;
            if (j13 == -1) {
                j3 = this.zzb;
            } else {
                j3 = j13;
            }
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z10, j3, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        @NonNull
        public Builder setDurationMillis(long j3) {
            boolean z10;
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "durationMillis must be greater than 0");
            this.zze = j3;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i10) {
            zzo.zza(i10);
            this.zzj = i10;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(long j3) {
            boolean z10;
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "intervalMillis must be greater than or equal to 0");
            this.zzb = j3;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j3) {
            boolean z10 = true;
            if (j3 != -1 && j3 < 0) {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j3;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(long j3) {
            boolean z10;
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j3;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(int i10) {
            boolean z10;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxUpdates must be greater than 0");
            this.zzf = i10;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(float f10) {
            boolean z10;
            if (f10 >= 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f10;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(long j3) {
            boolean z10 = true;
            if (j3 != -1 && j3 < 0) {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j3;
            return this;
        }

        @NonNull
        public Builder setPriority(int i10) {
            zzae.zza(i10);
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setWaitForAccurateLocation(boolean z10) {
            this.zzh = z10;
            return this;
        }

        @NonNull
        @RequiresPermission(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        public final Builder zza(boolean z10) {
            this.zzm = z10;
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzb(@Nullable String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        @NonNull
        public final Builder zzc(int i10) {
            int i11;
            boolean z10;
            if (i10 != 0 && i10 != 1) {
                i11 = 2;
                if (i10 == 2) {
                    z10 = true;
                    i10 = 2;
                } else {
                    i11 = i10;
                    z10 = false;
                }
            } else {
                i11 = i10;
                z10 = true;
            }
            Preconditions.checkArgument(z10, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.zzk = i11;
            return this;
        }

        @NonNull
        @RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        public final Builder zzd(@Nullable WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }

        public Builder(long j3) {
            Preconditions.checkArgument(j3 >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j3;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Integer.MAX_VALUE;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(@NonNull LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) long j3, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 8) long j11, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 5) long j12, @SafeParcelable.Param(id = 10) long j13, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) float f10, @SafeParcelable.Param(id = 9) boolean z10, @SafeParcelable.Param(id = 11) long j14, @SafeParcelable.Param(id = 12) int i12, @SafeParcelable.Param(id = 13) int i13, @Nullable @SafeParcelable.Param(id = 14) String str, @SafeParcelable.Param(id = 15) boolean z11, @SafeParcelable.Param(id = 16) WorkSource workSource, @Nullable @SafeParcelable.Param(id = 17) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = i10;
        long j15 = j3;
        this.zzb = j15;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12 == Long.MAX_VALUE ? j13 : Math.min(Math.max(1L, j12 - SystemClock.elapsedRealtime()), j13);
        this.zzf = i11;
        this.zzg = f10;
        this.zzh = z10;
        this.zzi = j14 != -1 ? j14 : j15;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = str;
        this.zzm = z11;
        this.zzn = workSource;
        this.zzo = zzdVar;
    }
}
