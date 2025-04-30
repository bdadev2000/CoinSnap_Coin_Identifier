package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int zzb;

    /* loaded from: classes2.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @NonNull
        public ActivityTransition build() {
            boolean z8;
            boolean z9 = false;
            if (this.zza != -1) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8, "Activity type not set.");
            if (this.zzb != -1) {
                z9 = true;
            }
            Preconditions.checkState(z9, "Activity transition type not set.");
            return new ActivityTransition(this.zza, this.zzb);
        }

        @NonNull
        public Builder setActivityTransition(int i9) {
            ActivityTransition.zza(i9);
            this.zzb = i9;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i9) {
            this.zza = i9;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = i9;
        this.zzb = i10;
    }

    public static void zza(int i9) {
        boolean z8 = false;
        if (i9 >= 0 && i9 <= 1) {
            z8 = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i9);
        sb.append(" is not valid.");
        Preconditions.checkArgument(z8, sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.zza == activityTransition.zza && this.zzb == activityTransition.zzb) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    @NonNull
    public String toString() {
        int i9 = this.zza;
        int i10 = this.zzb;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i9);
        sb.append(", mTransitionType=");
        sb.append(i10);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
