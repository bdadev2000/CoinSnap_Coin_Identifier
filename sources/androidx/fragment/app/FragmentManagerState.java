package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f19773a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f19774b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f19775c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public String f19776f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f19777g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f19778h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f19779i;

    /* renamed from: androidx.fragment.app.FragmentManagerState$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentManagerState> {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.FragmentManagerState, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            ?? obj = new Object();
            obj.f19776f = null;
            obj.f19777g = new ArrayList();
            obj.f19778h = new ArrayList();
            obj.f19773a = parcel.createStringArrayList();
            obj.f19774b = parcel.createStringArrayList();
            obj.f19775c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
            obj.d = parcel.readInt();
            obj.f19776f = parcel.readString();
            obj.f19777g = parcel.createStringArrayList();
            obj.f19778h = parcel.createTypedArrayList(BackStackState.CREATOR);
            obj.f19779i = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
            return obj;
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f19773a);
        parcel.writeStringList(this.f19774b);
        parcel.writeTypedArray(this.f19775c, i2);
        parcel.writeInt(this.d);
        parcel.writeString(this.f19776f);
        parcel.writeStringList(this.f19777g);
        parcel.writeTypedList(this.f19778h);
        parcel.writeTypedList(this.f19779i);
    }
}
