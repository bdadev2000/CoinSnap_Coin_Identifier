package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 implements Parcelable {
    public static final Parcelable.Creator<j1> CREATOR = new android.support.v4.media.a(13);

    /* renamed from: b, reason: collision with root package name */
    public final String f1658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1659c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1660d;

    /* renamed from: f, reason: collision with root package name */
    public final int f1661f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1662g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1663h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1664i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1665j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1666k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1667l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1668m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1669n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1670o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1671p;

    public j1(Fragment fragment) {
        this.f1658b = fragment.getClass().getName();
        this.f1659c = fragment.mWho;
        this.f1660d = fragment.mFromLayout;
        this.f1661f = fragment.mFragmentId;
        this.f1662g = fragment.mContainerId;
        this.f1663h = fragment.mTag;
        this.f1664i = fragment.mRetainInstance;
        this.f1665j = fragment.mRemoving;
        this.f1666k = fragment.mDetached;
        this.f1667l = fragment.mHidden;
        this.f1668m = fragment.mMaxState.ordinal();
        this.f1669n = fragment.mTargetWho;
        this.f1670o = fragment.mTargetRequestCode;
        this.f1671p = fragment.mUserVisibleHint;
    }

    public final Fragment a(h0 h0Var, ClassLoader classLoader) {
        Fragment a = h0Var.a(this.f1658b);
        a.mWho = this.f1659c;
        a.mFromLayout = this.f1660d;
        a.mRestored = true;
        a.mFragmentId = this.f1661f;
        a.mContainerId = this.f1662g;
        a.mTag = this.f1663h;
        a.mRetainInstance = this.f1664i;
        a.mRemoving = this.f1665j;
        a.mDetached = this.f1666k;
        a.mHidden = this.f1667l;
        a.mMaxState = androidx.lifecycle.o.values()[this.f1668m];
        a.mTargetWho = this.f1669n;
        a.mTargetRequestCode = this.f1670o;
        a.mUserVisibleHint = this.f1671p;
        return a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1658b);
        sb2.append(" (");
        sb2.append(this.f1659c);
        sb2.append(")}:");
        if (this.f1660d) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f1662g;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f1663h;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f1664i) {
            sb2.append(" retainInstance");
        }
        if (this.f1665j) {
            sb2.append(" removing");
        }
        if (this.f1666k) {
            sb2.append(" detached");
        }
        if (this.f1667l) {
            sb2.append(" hidden");
        }
        String str2 = this.f1669n;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f1670o);
        }
        if (this.f1671p) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1658b);
        parcel.writeString(this.f1659c);
        parcel.writeInt(this.f1660d ? 1 : 0);
        parcel.writeInt(this.f1661f);
        parcel.writeInt(this.f1662g);
        parcel.writeString(this.f1663h);
        parcel.writeInt(this.f1664i ? 1 : 0);
        parcel.writeInt(this.f1665j ? 1 : 0);
        parcel.writeInt(this.f1666k ? 1 : 0);
        parcel.writeInt(this.f1667l ? 1 : 0);
        parcel.writeInt(this.f1668m);
        parcel.writeString(this.f1669n);
        parcel.writeInt(this.f1670o);
        parcel.writeInt(this.f1671p ? 1 : 0);
    }

    public j1(Parcel parcel) {
        this.f1658b = parcel.readString();
        this.f1659c = parcel.readString();
        this.f1660d = parcel.readInt() != 0;
        this.f1661f = parcel.readInt();
        this.f1662g = parcel.readInt();
        this.f1663h = parcel.readString();
        this.f1664i = parcel.readInt() != 0;
        this.f1665j = parcel.readInt() != 0;
        this.f1666k = parcel.readInt() != 0;
        this.f1667l = parcel.readInt() != 0;
        this.f1668m = parcel.readInt();
        this.f1669n = parcel.readString();
        this.f1670o = parcel.readInt();
        this.f1671p = parcel.readInt() != 0;
    }
}
