package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzdh;

/* loaded from: classes3.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Geofence build() {
            if (this.zza != null) {
                int i10 = this.zzb;
                if (i10 != 0) {
                    if ((i10 & 4) != 0 && this.zzi < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                    }
                    if (this.zzc != Long.MIN_VALUE) {
                        if (this.zzd != -1) {
                            if (this.zzh >= 0) {
                                return new zzdh(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
                            }
                            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        }
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                    throw new IllegalArgumentException("Expiration not set.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        @NonNull
        public Builder setCircularRegion(double d10, double d11, float f10) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            if (d10 >= -90.0d && d10 <= 90.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "Invalid latitude: " + d10);
            if (d11 >= -180.0d && d11 <= 180.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "Invalid longitude: " + d11);
            if (f10 > 0.0f) {
                z12 = true;
            }
            Preconditions.checkArgument(z12, "Invalid radius: " + f10);
            this.zzd = (short) 1;
            this.zze = d10;
            this.zzf = d11;
            this.zzg = f10;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j3) {
            if (j3 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j3;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i10) {
            this.zzi = i10;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(int i10) {
            this.zzh = i10;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i10) {
            this.zzb = i10;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public @interface GeofenceTransition {
    }

    /* loaded from: classes3.dex */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
