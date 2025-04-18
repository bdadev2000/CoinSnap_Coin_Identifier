package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzer implements zzbc {
    public static final Parcelable.Creator<zzer> CREATOR = new zzep();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzer(Parcel parcel, zzeq zzeqVar) {
        String readString = parcel.readString();
        int i10 = zzen.zza;
        this.zza = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.zzb = createByteArray;
        this.zzc = parcel.readInt();
        int readInt = parcel.readInt();
        this.zzd = readInt;
        zzb(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void zzb(String str, byte[] bArr, int i10) {
        char c10;
        byte b3;
        boolean z10 = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1 && c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        return;
                    }
                    if (i10 != 75 || bArr.length != 1 || ((b3 = bArr[0]) != 0 && b3 != 1)) {
                        z10 = false;
                    }
                    zzdb.zzd(z10);
                    return;
                }
                if (i10 != 0) {
                    z10 = false;
                }
                zzdb.zzd(z10);
                return;
            }
            if (i10 != 78 || bArr.length != 8) {
                z10 = false;
            }
            zzdb.zzd(z10);
            return;
        }
        if (i10 != 23 || bArr.length != 4) {
            z10 = false;
        }
        zzdb.zzd(z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzer.class == obj.getClass()) {
            zzer zzerVar = (zzer) obj;
            if (this.zza.equals(zzerVar.zza) && Arrays.equals(this.zzb, zzerVar.zzb) && this.zzc == zzerVar.zzc && this.zzd == zzerVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return ((((Arrays.hashCode(this.zzb) + (hashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa A[LOOP:0: B:17:0x00a7->B:19:0x00aa, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.zzd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L53
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto L9e
        L1a:
            byte[] r0 = r5.zzb
            com.google.android.gms.internal.ads.zzed r1 = new com.google.android.gms.internal.ads.zzed
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L2b:
            byte[] r0 = r5.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L37:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgcr.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L43:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgcr.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L53:
            byte[] r0 = r5.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzen.zzB(r0)
            goto Lcb
        L5a:
            java.lang.String r0 = r5.zza
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r5.zza
            boolean r0 = r0.equals(r3)
            java.lang.String r3 = "Metadata is not an editable tracks map"
            com.google.android.gms.internal.ads.zzdb.zzg(r0, r3)
            byte[] r0 = r5.zzb
            r0 = r0[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L78:
            if (r1 >= r0) goto L8a
            byte[] r3 = r5.zzb
            int r4 = r1 + 2
            r3 = r3[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L78
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "track types = "
            r0.append(r1)
            java.lang.String r1 = ","
            com.google.android.gms.internal.ads.zzfwi.zzb(r0, r2, r1)
            java.lang.String r0 = r0.toString()
            goto Lcb
        L9e:
            byte[] r0 = r5.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        La7:
            int r3 = r0.length
            if (r1 >= r3) goto Lc7
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
            goto La7
        Lc7:
            java.lang.String r0 = r2.toString()
        Lcb:
            java.lang.String r1 = r5.zza
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = eb.j.l(r2, r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzer.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }

    public zzer(String str, byte[] bArr, int i10, int i11) {
        zzb(str, bArr, i11);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }
}
