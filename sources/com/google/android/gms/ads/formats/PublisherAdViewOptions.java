package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhp;

@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
/* loaded from: classes3.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    private final zzcm zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", id = 3)
    private final IBinder zzc;

    @Deprecated
    /* loaded from: classes3.dex */
    public static final class Builder {
        @NonNull
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(id = 1) boolean z10, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder2) {
        zzcm zzcmVar;
        this.zza = z10;
        if (iBinder != null) {
            zzcmVar = zzcl.zzd(iBinder);
        } else {
            zzcmVar = null;
        }
        this.zzb = zzcmVar;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        zzcm zzcmVar = this.zzb;
        if (zzcmVar == null) {
            asBinder = null;
        } else {
            asBinder = zzcmVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final zzcm zza() {
        return this.zzb;
    }

    @Nullable
    public final zzbhp zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return zzbho.zzb(iBinder);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
