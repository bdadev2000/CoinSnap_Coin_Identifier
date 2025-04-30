package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zaa = {DataSchemeDataSource.SCHEME_DATA};
    private final Parcelable.Creator zab;

    @KeepForSdk
    public DataBufferSafeParcelable(@NonNull DataHolder dataHolder, @NonNull Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zab = creator;
    }

    @KeepForSdk
    public static <T extends SafeParcelable> void addValue(@NonNull DataHolder.Builder builder, @NonNull T t9) {
        Parcel obtain = Parcel.obtain();
        t9.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    @NonNull
    @KeepForSdk
    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zaa);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public T get(int i9) {
        DataHolder dataHolder = (DataHolder) Preconditions.checkNotNull(this.mDataHolder);
        byte[] byteArray = dataHolder.getByteArray(DataSchemeDataSource.SCHEME_DATA, i9, dataHolder.getWindowIndex(i9));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T t9 = (T) this.zab.createFromParcel(obtain);
        obtain.recycle();
        return t9;
    }
}
