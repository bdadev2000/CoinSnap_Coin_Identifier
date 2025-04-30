package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbw implements Parcelable.Creator<SleepSegmentRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        int i9 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                } else {
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                }
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzbx.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SleepSegmentRequest(arrayList, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentRequest[] newArray(int i9) {
        return new SleepSegmentRequest[i9];
    }
}
