package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhp;

@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
/* loaded from: classes3.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 2)
    private final IBinder zzb;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean zza = false;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z10) {
            this.zza = z10;
            return this;
        }
    }

    public /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzbhp zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return zzbho.zzb(iBinder);
    }

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(id = 1) boolean z10, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = z10;
        this.zzb = iBinder;
    }
}
