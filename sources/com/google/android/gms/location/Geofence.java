package com.google.android.gms.location;

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
            if (str != null) {
                int i9 = this.zzb;
                if (i9 != 0) {
                    if ((i9 & 4) != 0 && this.zzi < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                    }
                    long j7 = this.zzc;
                    if (j7 != Long.MIN_VALUE) {
                        if (this.zzd != -1) {
                            int i10 = this.zzh;
                            if (i10 >= 0) {
                                return new com.google.android.gms.internal.location.zzbe(str, i9, (short) 1, this.zze, this.zzf, this.zzg, j7, i10, this.zzi);
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
        public Builder setCircularRegion(double d2, double d9, float f9) {
            boolean z8;
            boolean z9;
            boolean z10 = false;
            if (d2 >= -90.0d && d2 <= 90.0d) {
                z8 = true;
            } else {
                z8 = false;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d2);
            Preconditions.checkArgument(z8, sb.toString());
            if (d9 >= -180.0d && d9 <= 180.0d) {
                z9 = true;
            } else {
                z9 = false;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d9);
            Preconditions.checkArgument(z9, sb2.toString());
            if (f9 > 0.0f) {
                z10 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f9);
            Preconditions.checkArgument(z10, sb3.toString());
            this.zzd = (short) 1;
            this.zze = d2;
            this.zzf = d9;
            this.zzg = f9;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j7) {
            if (j7 < 0) {
                this.zzc = -1L;
            } else {
                this.zzc = DefaultClock.getInstance().elapsedRealtime() + j7;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i9) {
            this.zzi = i9;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(int i9) {
            this.zzh = i9;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i9) {
            this.zzb = i9;
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
