package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f19785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19786b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19787c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int f19788f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19789g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19791i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19792j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19793k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19794l;

    /* renamed from: m, reason: collision with root package name */
    public final String f19795m;

    /* renamed from: n, reason: collision with root package name */
    public final int f19796n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19797o;

    /* renamed from: androidx.fragment.app.FragmentState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f19785a = fragment.getClass().getName();
        this.f19786b = fragment.mWho;
        this.f19787c = fragment.mFromLayout;
        this.d = fragment.mFragmentId;
        this.f19788f = fragment.mContainerId;
        this.f19789g = fragment.mTag;
        this.f19790h = fragment.mRetainInstance;
        this.f19791i = fragment.mRemoving;
        this.f19792j = fragment.mDetached;
        this.f19793k = fragment.mHidden;
        this.f19794l = fragment.mMaxState.ordinal();
        this.f19795m = fragment.mTargetWho;
        this.f19796n = fragment.mTargetRequestCode;
        this.f19797o = fragment.mUserVisibleHint;
    }

    public final Fragment b(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment instantiate = fragmentFactory.instantiate(classLoader, this.f19785a);
        instantiate.mWho = this.f19786b;
        instantiate.mFromLayout = this.f19787c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.d;
        instantiate.mContainerId = this.f19788f;
        instantiate.mTag = this.f19789g;
        instantiate.mRetainInstance = this.f19790h;
        instantiate.mRemoving = this.f19791i;
        instantiate.mDetached = this.f19792j;
        instantiate.mHidden = this.f19793k;
        instantiate.mMaxState = Lifecycle.State.values()[this.f19794l];
        instantiate.mTargetWho = this.f19795m;
        instantiate.mTargetRequestCode = this.f19796n;
        instantiate.mUserVisibleHint = this.f19797o;
        return instantiate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f19785a);
        sb.append(" (");
        sb.append(this.f19786b);
        sb.append(")}:");
        if (this.f19787c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f19788f;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f19789g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f19790h) {
            sb.append(" retainInstance");
        }
        if (this.f19791i) {
            sb.append(" removing");
        }
        if (this.f19792j) {
            sb.append(" detached");
        }
        if (this.f19793k) {
            sb.append(" hidden");
        }
        String str2 = this.f19795m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f19796n);
        }
        if (this.f19797o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f19785a);
        parcel.writeString(this.f19786b);
        parcel.writeInt(this.f19787c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f19788f);
        parcel.writeString(this.f19789g);
        parcel.writeInt(this.f19790h ? 1 : 0);
        parcel.writeInt(this.f19791i ? 1 : 0);
        parcel.writeInt(this.f19792j ? 1 : 0);
        parcel.writeInt(this.f19793k ? 1 : 0);
        parcel.writeInt(this.f19794l);
        parcel.writeString(this.f19795m);
        parcel.writeInt(this.f19796n);
        parcel.writeInt(this.f19797o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f19785a = parcel.readString();
        this.f19786b = parcel.readString();
        this.f19787c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f19788f = parcel.readInt();
        this.f19789g = parcel.readString();
        this.f19790h = parcel.readInt() != 0;
        this.f19791i = parcel.readInt() != 0;
        this.f19792j = parcel.readInt() != 0;
        this.f19793k = parcel.readInt() != 0;
        this.f19794l = parcel.readInt();
        this.f19795m = parcel.readString();
        this.f19796n = parcel.readInt();
        this.f19797o = parcel.readInt() != 0;
    }
}
