package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    @KeepForSdk
    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }

    @NonNull
    @KeepForSdk
    public StringToIntConverter add(@NonNull String str, int i10) {
        this.zab.put(str, Integer.valueOf(i10));
        this.zac.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.zab.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.zab.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @Nullable
    public final /* bridge */ /* synthetic */ Object zac(@NonNull Object obj) {
        Integer num = (Integer) this.zab.get((String) obj);
        if (num == null) {
            return (Integer) this.zab.get("gms_unknown");
        }
        return num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    public final /* bridge */ /* synthetic */ Object zad(@NonNull Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        if (str == null && this.zab.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) ArrayList arrayList) {
        this.zaa = i10;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zac zacVar = (zac) arrayList.get(i11);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
