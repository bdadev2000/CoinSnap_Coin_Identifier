package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbwx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwx> CREATOR = new zzbwy();

    @SafeParcelable.Field(id = 2)
    public final boolean zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final List zzb;

    public zzbwx() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        boolean z8 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z8);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbwx(@SafeParcelable.Param(id = 2) boolean z8, @SafeParcelable.Param(id = 3) List list) {
        this.zza = z8;
        this.zzb = list;
    }
}
