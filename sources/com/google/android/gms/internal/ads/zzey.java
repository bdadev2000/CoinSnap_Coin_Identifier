package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzey implements zzbj {
    public static final Parcelable.Creator<zzey> CREATOR = new zzew();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzey(Parcel parcel, zzex zzexVar) {
        String readString = parcel.readString();
        int i2 = zzeu.zza;
        this.zza = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.zzb = createByteArray;
        this.zzc = parcel.readInt();
        int readInt = parcel.readInt();
        this.zzd = readInt;
        zzb(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void zzb(String str, byte[] bArr, int i2) {
        char c2;
        byte b2;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            zzdi.zzd(i2 == 23 && bArr.length == 4);
            return;
        }
        if (c2 == 1 || c2 == 2) {
            zzdi.zzd(i2 == 78 && bArr.length == 8);
            return;
        }
        if (c2 == 3) {
            zzdi.zzd(i2 == 0);
            return;
        }
        if (c2 != 4) {
            return;
        }
        if (i2 != 75 || bArr.length != 1 || ((b2 = bArr[0]) != 0 && b2 != 1)) {
            r4 = false;
        }
        zzdi.zzd(r4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzey.class == obj.getClass()) {
            zzey zzeyVar = (zzey) obj;
            if (this.zza.equals(zzeyVar.zza) && Arrays.equals(this.zzb, zzeyVar.zzb) && this.zzc == zzeyVar.zzc && this.zzd == zzeyVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[LOOP:0: B:17:0x0095->B:19:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            int r0 = r6.zzd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L59
            if (r0 == r2) goto L52
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto L8c
        L1a:
            byte[] r0 = r6.zzb
            com.google.android.gms.internal.ads.zzek r1 = new com.google.android.gms.internal.ads.zzek
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L2b:
            byte[] r0 = r6.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L37:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgdu.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L43:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.zzgdu.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lb9
        L52:
            byte[] r0 = r6.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzeu.zzA(r0)
            goto Lb9
        L59:
            java.lang.String r0 = r6.zza
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8c
            byte[] r0 = r6.zzb
            java.lang.String r3 = "track types = "
            java.lang.StringBuilder r3 = androidx.compose.foundation.text.input.a.q(r3)
            r2 = r0[r2]
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L72:
            if (r1 >= r2) goto L82
            int r5 = r1 + 2
            r5 = r0[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
            int r1 = r1 + 1
            goto L72
        L82:
            java.lang.String r0 = ","
            com.google.android.gms.internal.ads.zzfxr.zzb(r3, r4, r0)
            java.lang.String r0 = r3.toString()
            goto Lb9
        L8c:
            byte[] r0 = r6.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        L95:
            int r3 = r0.length
            if (r1 >= r3) goto Lb5
            r3 = r0[r1]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            r3 = r0[r1]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            int r1 = r1 + 1
            goto L95
        Lb5:
            java.lang.String r0 = r2.toString()
        Lb9:
            java.lang.String r1 = r6.zza
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = androidx.compose.foundation.text.input.a.l(r2, r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzey.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public zzey(String str, byte[] bArr, int i2, int i3) {
        zzb(str, bArr, i3);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }
}
