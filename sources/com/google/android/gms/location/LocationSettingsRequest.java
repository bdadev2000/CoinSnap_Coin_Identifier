package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();

    @SafeParcelable.Field(getter = "getLocationRequests", id = 1)
    private final List<LocationRequest> zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "alwaysShow", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "needBle", id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getConfiguration", id = 5)
    private zzbj zzd;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final ArrayList<LocationRequest> zza = new ArrayList<>();
        private boolean zzb = false;
        private boolean zzc = false;

        @NonNull
        public Builder addAllLocationRequests(@NonNull Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.zza.add(locationRequest);
                }
            }
            return this;
        }

        @NonNull
        public Builder addLocationRequest(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zza, this.zzb, this.zzc, null);
        }

        @NonNull
        public Builder setAlwaysShow(boolean z8) {
            this.zzb = z8;
            return this;
        }

        @NonNull
        public Builder setNeedBle(boolean z8) {
            this.zzc = z8;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LocationSettingsRequest(@SafeParcelable.Param(id = 1) List<LocationRequest> list, @SafeParcelable.Param(id = 2) boolean z8, @SafeParcelable.Param(id = 3) boolean z9, @Nullable @SafeParcelable.Param(id = 5) zzbj zzbjVar) {
        this.zza = list;
        this.zzb = z8;
        this.zzc = z9;
        this.zzd = zzbjVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i9, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
