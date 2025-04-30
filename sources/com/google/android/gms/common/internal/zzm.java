package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z8 = false;
        boolean z9 = false;
        int i9 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.createParcelable(parcel, readHeader, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 3:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 4:
                    iArr = SafeParcelReader.createIntArray(parcel, readHeader);
                    break;
                case 5:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.createIntArray(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z8, z9, iArr, i9, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new ConnectionTelemetryConfiguration[i9];
    }
}
