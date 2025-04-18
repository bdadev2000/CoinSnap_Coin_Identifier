package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1569b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1570c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1571d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1572f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1573g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1574h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1575i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1576j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1577k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1578l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f1579m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1580n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1581o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1582p;

    public b(a aVar) {
        int size = aVar.mOps.size();
        this.f1569b = new int[size * 6];
        if (aVar.mAddToBackStack) {
            this.f1570c = new ArrayList(size);
            this.f1571d = new int[size];
            this.f1572f = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                m1 m1Var = aVar.mOps.get(i10);
                int i12 = i11 + 1;
                this.f1569b[i11] = m1Var.a;
                ArrayList arrayList = this.f1570c;
                Fragment fragment = m1Var.f1687b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1569b;
                int i13 = i12 + 1;
                iArr[i12] = m1Var.f1688c ? 1 : 0;
                int i14 = i13 + 1;
                iArr[i13] = m1Var.f1689d;
                int i15 = i14 + 1;
                iArr[i14] = m1Var.f1690e;
                int i16 = i15 + 1;
                iArr[i15] = m1Var.f1691f;
                iArr[i16] = m1Var.f1692g;
                this.f1571d[i10] = m1Var.f1693h.ordinal();
                this.f1572f[i10] = m1Var.f1694i.ordinal();
                i10++;
                i11 = i16 + 1;
            }
            this.f1573g = aVar.mTransition;
            this.f1574h = aVar.mName;
            this.f1575i = aVar.f1563c;
            this.f1576j = aVar.mBreadCrumbTitleRes;
            this.f1577k = aVar.mBreadCrumbTitleText;
            this.f1578l = aVar.mBreadCrumbShortTitleRes;
            this.f1579m = aVar.mBreadCrumbShortTitleText;
            this.f1580n = aVar.mSharedElementSourceNames;
            this.f1581o = aVar.mSharedElementTargetNames;
            this.f1582p = aVar.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1569b;
            boolean z10 = true;
            if (i10 < iArr.length) {
                m1 m1Var = new m1();
                int i12 = i10 + 1;
                m1Var.a = iArr[i10];
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                }
                m1Var.f1693h = androidx.lifecycle.o.values()[this.f1571d[i11]];
                m1Var.f1694i = androidx.lifecycle.o.values()[this.f1572f[i11]];
                int i13 = i12 + 1;
                if (iArr[i12] == 0) {
                    z10 = false;
                }
                m1Var.f1688c = z10;
                int i14 = i13 + 1;
                int i15 = iArr[i13];
                m1Var.f1689d = i15;
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                m1Var.f1690e = i17;
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                m1Var.f1691f = i19;
                int i20 = iArr[i18];
                m1Var.f1692g = i20;
                aVar.mEnterAnim = i15;
                aVar.mExitAnim = i17;
                aVar.mPopEnterAnim = i19;
                aVar.mPopExitAnim = i20;
                aVar.addOp(m1Var);
                i11++;
                i10 = i18 + 1;
            } else {
                aVar.mTransition = this.f1573g;
                aVar.mName = this.f1574h;
                aVar.mAddToBackStack = true;
                aVar.mBreadCrumbTitleRes = this.f1576j;
                aVar.mBreadCrumbTitleText = this.f1577k;
                aVar.mBreadCrumbShortTitleRes = this.f1578l;
                aVar.mBreadCrumbShortTitleText = this.f1579m;
                aVar.mSharedElementSourceNames = this.f1580n;
                aVar.mSharedElementTargetNames = this.f1581o;
                aVar.mReorderingAllowed = this.f1582p;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1569b);
        parcel.writeStringList(this.f1570c);
        parcel.writeIntArray(this.f1571d);
        parcel.writeIntArray(this.f1572f);
        parcel.writeInt(this.f1573g);
        parcel.writeString(this.f1574h);
        parcel.writeInt(this.f1575i);
        parcel.writeInt(this.f1576j);
        TextUtils.writeToParcel(this.f1577k, parcel, 0);
        parcel.writeInt(this.f1578l);
        TextUtils.writeToParcel(this.f1579m, parcel, 0);
        parcel.writeStringList(this.f1580n);
        parcel.writeStringList(this.f1581o);
        parcel.writeInt(this.f1582p ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1569b = parcel.createIntArray();
        this.f1570c = parcel.createStringArrayList();
        this.f1571d = parcel.createIntArray();
        this.f1572f = parcel.createIntArray();
        this.f1573g = parcel.readInt();
        this.f1574h = parcel.readString();
        this.f1575i = parcel.readInt();
        this.f1576j = parcel.readInt();
        this.f1577k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1578l = parcel.readInt();
        this.f1579m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1580n = parcel.createStringArrayList();
        this.f1581o = parcel.createStringArrayList();
        this.f1582p = parcel.readInt() != 0;
    }
}
