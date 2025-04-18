package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        long j3 = 0;
        long j10 = 0;
        int i10 = 0;
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
                                bundle = SafeParcelReader.createBundle(parcel, readHeader);
                            }
                        } else {
                            i10 = SafeParcelReader.readInt(parcel, readHeader);
                        }
                    } else {
                        j10 = SafeParcelReader.readLong(parcel, readHeader);
                    }
                } else {
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                }
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, DetectedActivity.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ActivityRecognitionResult(arrayList, j3, j10, i10, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityRecognitionResult[i10];
    }
}
