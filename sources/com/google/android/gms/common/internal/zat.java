package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
/* loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private final Account zab;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final int zac;

    @Nullable
    @SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    private final GoogleSignInAccount zad;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i10, @Nullable @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zaa = i9;
        this.zab = account;
        this.zac = i10;
        this.zad = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i9, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i9, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zat(Account account, int i9, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i9, googleSignInAccount);
    }
}
