package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a(26);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10920b;

    public WrappedParcelable(Parcel parcel) {
        this.f10920b = parcel.createByteArray();
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f10920b;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f10920b);
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f10920b = marshallParcelable(parcelable);
    }

    public WrappedParcelable(@Nullable byte[] bArr) {
        this.f10920b = bArr;
    }
}
