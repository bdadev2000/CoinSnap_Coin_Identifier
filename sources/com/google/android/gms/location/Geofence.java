package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    @VisibleForTesting
    /* loaded from: classes2.dex */
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
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i2 = this.zzb;
            if (i2 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i2 & 4) != 0 && this.zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j2 = this.zzc;
            if (j2 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i3 = this.zzh;
            if (i3 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i2, (short) 1, this.zze, this.zzf, this.zzg, j2, i3, this.zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange double d, @FloatRange double d2, @FloatRange float f2) {
            boolean z2 = d >= -90.0d && d <= 90.0d;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            Preconditions.checkArgument(z2, sb.toString());
            boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            Preconditions.checkArgument(z3, sb2.toString());
            boolean z4 = f2 > 0.0f;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f2);
            Preconditions.checkArgument(z4, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f2;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j2) {
            if (j2 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j2;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i2) {
            this.zzi = i2;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange int i2) {
            this.zzh = i2;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i2) {
            this.zzb = i2;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public @interface GeofenceTransition {
    }

    /* loaded from: classes2.dex */
    public @interface TransitionTypes {
    }

    @NonNull
    String getRequestId();
}
