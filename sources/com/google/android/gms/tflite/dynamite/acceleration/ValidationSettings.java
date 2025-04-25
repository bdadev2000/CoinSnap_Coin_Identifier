package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public class ValidationSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValidationSettings> CREATOR = new zzf();
    private final Integer zza;
    private final long zzb;

    public ValidationSettings(Integer num, long j) {
        this.zza = num;
        this.zzb = j;
    }

    public final String toString() {
        return "ValidationSettings{batchSize=" + this.zza + ", inferenceTimeoutMillis=" + this.zzb + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
