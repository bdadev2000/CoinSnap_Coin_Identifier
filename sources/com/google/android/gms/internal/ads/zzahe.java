package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzahe extends zzahr {
    public static final Parcelable.Creator<zzahe> CREATOR = new zzahd();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzahe(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzgd.zza
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahe.<init>(android.os.Parcel):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.zzf.equals(zzaheVar.zzf) && Arrays.equals(this.zza, zzaheVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (hashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzahe(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
