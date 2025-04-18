package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.Class(creator = "ProgramResponseCreator")
/* loaded from: classes3.dex */
public final class zzfri extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfri> CREATOR = new zzfrj();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final byte[] zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzfri(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfri(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
