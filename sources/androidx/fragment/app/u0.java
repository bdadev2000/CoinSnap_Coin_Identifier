package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0504n;

/* loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new E3.b(19);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4783c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4784d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4786g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4787h;

    /* renamed from: i, reason: collision with root package name */
    public final String f4788i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4789j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4790k;
    public final boolean l;
    public final boolean m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4791n;

    /* renamed from: o, reason: collision with root package name */
    public final String f4792o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4793p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4794q;

    public u0(Fragment fragment) {
        this.b = fragment.getClass().getName();
        this.f4783c = fragment.mWho;
        this.f4784d = fragment.mFromLayout;
        this.f4785f = fragment.mInDynamicContainer;
        this.f4786g = fragment.mFragmentId;
        this.f4787h = fragment.mContainerId;
        this.f4788i = fragment.mTag;
        this.f4789j = fragment.mRetainInstance;
        this.f4790k = fragment.mRemoving;
        this.l = fragment.mDetached;
        this.m = fragment.mHidden;
        this.f4791n = fragment.mMaxState.ordinal();
        this.f4792o = fragment.mTargetWho;
        this.f4793p = fragment.mTargetRequestCode;
        this.f4794q = fragment.mUserVisibleHint;
    }

    public final Fragment a(P p2, ClassLoader classLoader) {
        Fragment a6 = p2.a(this.b);
        a6.mWho = this.f4783c;
        a6.mFromLayout = this.f4784d;
        a6.mInDynamicContainer = this.f4785f;
        a6.mRestored = true;
        a6.mFragmentId = this.f4786g;
        a6.mContainerId = this.f4787h;
        a6.mTag = this.f4788i;
        a6.mRetainInstance = this.f4789j;
        a6.mRemoving = this.f4790k;
        a6.mDetached = this.l;
        a6.mHidden = this.m;
        a6.mMaxState = EnumC0504n.values()[this.f4791n];
        a6.mTargetWho = this.f4792o;
        a6.mTargetRequestCode = this.f4793p;
        a6.mUserVisibleHint = this.f4794q;
        return a6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.b);
        sb.append(" (");
        sb.append(this.f4783c);
        sb.append(")}:");
        if (this.f4784d) {
            sb.append(" fromLayout");
        }
        if (this.f4785f) {
            sb.append(" dynamicContainer");
        }
        int i9 = this.f4787h;
        if (i9 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i9));
        }
        String str = this.f4788i;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f4789j) {
            sb.append(" retainInstance");
        }
        if (this.f4790k) {
            sb.append(" removing");
        }
        if (this.l) {
            sb.append(" detached");
        }
        if (this.m) {
            sb.append(" hidden");
        }
        String str2 = this.f4792o;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f4793p);
        }
        if (this.f4794q) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeString(this.f4783c);
        parcel.writeInt(this.f4784d ? 1 : 0);
        parcel.writeInt(this.f4785f ? 1 : 0);
        parcel.writeInt(this.f4786g);
        parcel.writeInt(this.f4787h);
        parcel.writeString(this.f4788i);
        parcel.writeInt(this.f4789j ? 1 : 0);
        parcel.writeInt(this.f4790k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.f4791n);
        parcel.writeString(this.f4792o);
        parcel.writeInt(this.f4793p);
        parcel.writeInt(this.f4794q ? 1 : 0);
    }

    public u0(Parcel parcel) {
        this.b = parcel.readString();
        this.f4783c = parcel.readString();
        this.f4784d = parcel.readInt() != 0;
        this.f4785f = parcel.readInt() != 0;
        this.f4786g = parcel.readInt();
        this.f4787h = parcel.readInt();
        this.f4788i = parcel.readString();
        this.f4789j = parcel.readInt() != 0;
        this.f4790k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.f4791n = parcel.readInt();
        this.f4792o = parcel.readString();
        this.f4793p = parcel.readInt();
        this.f4794q = parcel.readInt() != 0;
    }
}
