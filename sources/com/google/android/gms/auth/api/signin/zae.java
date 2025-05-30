package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.createParcelable(parcel, readHeader, Account.CREATOR);
                    break;
                case 4:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GoogleSignInOptions(i9, arrayList, account, z8, z9, z10, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        return new GoogleSignInOptions[i9];
    }
}
