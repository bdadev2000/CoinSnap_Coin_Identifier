package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes3.dex */
public final class zzfqz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfqz> CREATOR = new zzfra();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzata zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfqz(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzata zzataVar = this.zzb;
        if (zzataVar != null || this.zzc == null) {
            if (zzataVar != null && this.zzc == null) {
                return;
            }
            if (zzataVar != null && this.zzc != null) {
                throw new IllegalStateException("Invalid internal representation - full");
            }
            if (zzataVar == null && this.zzc == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzata zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzata.zzd(this.zzc, zzgyh.zza());
                this.zzc = null;
            } catch (zzgzm | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }
}
