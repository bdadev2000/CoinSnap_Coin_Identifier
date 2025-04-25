package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-tflite-impl@@16.1.0 */
/* loaded from: classes12.dex */
public class CustomerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new zzb();
    private final String zza;
    private final String zzb;
    private final Integer zzc;

    public CustomerInfo(String str, String str2, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
