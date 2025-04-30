package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes2.dex */
public final class zzfss extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfss> CREATOR = new zzfst();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaus zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfss(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i9;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaus zzausVar = this.zzb;
        if (zzausVar != null || this.zzc == null) {
            if (zzausVar != null && this.zzc == null) {
                return;
            }
            if (zzausVar != null && this.zzc != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (zzausVar == null && this.zzc == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaus zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaus.zzf(this.zzc, zzhay.zza());
                this.zzc = null;
            } catch (zzhcd | NullPointerException e4) {
                throw new IllegalStateException(e4);
            }
        }
        zzb();
        return this.zzb;
    }
}
