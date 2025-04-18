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
import com.google.android.gms.internal.location.zzdj;
import eb.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "LastLocationRequestCreator")
/* loaded from: classes3.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzv();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 5)
    private final com.google.android.gms.internal.location.zzd zze;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;

        @Nullable
        private String zzd;

        @Nullable
        private com.google.android.gms.internal.location.zzd zze;

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
            this.zze = null;
        }

        @NonNull
        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @NonNull
        public Builder setGranularity(int i10) {
            zzo.zza(i10);
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j3) {
            boolean z10;
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j3;
            return this;
        }

        public Builder(@NonNull LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zzc();
            this.zzd = lastLocationRequest.zzb();
            this.zze = lastLocationRequest.zza();
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j3, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) boolean z10, @Nullable @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = j3;
        this.zzb = i10;
        this.zzc = z10;
        this.zzd = str;
        this.zze = zzdVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.zza != lastLocationRequest.zza || this.zzb != lastLocationRequest.zzb || this.zzc != lastLocationRequest.zzc || !Objects.equal(this.zzd, lastLocationRequest.zzd) || !Objects.equal(this.zze, lastLocationRequest.zze)) {
            return false;
        }
        return true;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder m10 = j.m("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            m10.append("maxAge=");
            zzdj.zzb(this.zza, m10);
        }
        if (this.zzb != 0) {
            m10.append(", ");
            m10.append(zzo.zzb(this.zzb));
        }
        if (this.zzc) {
            m10.append(", bypass");
        }
        if (this.zzd != null) {
            m10.append(", moduleId=");
            m10.append(this.zzd);
        }
        if (this.zze != null) {
            m10.append(", impersonation=");
            m10.append(this.zze);
        }
        m10.append(AbstractJsonLexerKt.END_LIST);
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final com.google.android.gms.internal.location.zzd zza() {
        return this.zze;
    }

    @Nullable
    @Deprecated
    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzc;
    }
}
