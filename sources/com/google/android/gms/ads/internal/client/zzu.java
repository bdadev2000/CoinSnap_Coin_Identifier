package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "AdValueParcelCreator")
/* loaded from: classes3.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j3) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = j3;
    }

    public static zzu zza(JSONObject jSONObject) throws JSONException {
        return new zzu(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(AppLovinEventParameters.REVENUE_CURRENCY), jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
