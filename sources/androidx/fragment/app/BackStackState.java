package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final List f19668a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19669b;

    /* renamed from: androidx.fragment.app.BackStackState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f19668a = parcel.createStringArrayList();
        this.f19669b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f19668a);
        parcel.writeTypedList(this.f19669b);
    }
}
