package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes12.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        Float f2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                num = SafeParcelReader.readIntegerObject(parcel, readHeader);
            } else if (fieldId == 2) {
                num2 = SafeParcelReader.readIntegerObject(parcel, readHeader);
            } else if (fieldId == 3) {
                f = SafeParcelReader.readFloatObject(parcel, readHeader);
            } else if (fieldId == 4) {
                f2 = SafeParcelReader.readFloatObject(parcel, readHeader);
            } else {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new FeatureStyle(num, num2, f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureStyle[i];
    }
}
