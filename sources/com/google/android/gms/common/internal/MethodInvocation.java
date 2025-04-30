package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long zad;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long zae;

    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    private final String zaf;

    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    private final String zag;

    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int zah;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    private final int zai;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i9, int i10, int i11, long j7, long j9, @Nullable String str, @Nullable String str2, int i12) {
        this(i9, i10, i11, j7, j9, str, str2, i12, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i9) {
        int i10 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zah);
        SafeParcelWriter.writeInt(parcel, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) long j7, @SafeParcelable.Param(id = 5) long j9, @Nullable @SafeParcelable.Param(id = 6) String str, @Nullable @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) int i12, @SafeParcelable.Param(id = 9) int i13) {
        this.zaa = i9;
        this.zab = i10;
        this.zac = i11;
        this.zad = j7;
        this.zae = j9;
        this.zaf = str;
        this.zag = str2;
        this.zah = i12;
        this.zai = i13;
    }
}
