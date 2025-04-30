package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbv implements Parcelable.Creator<SleepSegmentEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j7 = 0;
        long j9 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                i11 = SafeParcelReader.readInt(parcel, readHeader);
                            }
                        } else {
                            i10 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        i9 = SafeParcelReader.readInt(parcel, readHeader);
                    }
                } else {
                    j9 = SafeParcelReader.readLong(parcel, readHeader);
                }
            } else {
                j7 = SafeParcelReader.readLong(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SleepSegmentEvent(j7, j9, i9, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int i9) {
        return new SleepSegmentEvent[i9];
    }
}
