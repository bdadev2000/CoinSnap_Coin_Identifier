package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbwv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwv> CREATOR = new zzbww();

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbwv(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Nullable
    public static zzbwv zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            return new zzbwv(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwv)) {
            zzbwv zzbwvVar = (zzbwv) obj;
            if (Objects.equal(this.zza, zzbwvVar.zza)) {
                if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbwvVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
