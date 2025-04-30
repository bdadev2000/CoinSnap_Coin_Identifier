package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0504n;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453b implements Parcelable {
    public static final Parcelable.Creator<C0453b> CREATOR = new E3.b(15);
    public final int[] b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4696c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4697d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4698f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4699g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4700h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4701i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4702j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f4703k;
    public final int l;
    public final CharSequence m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4704n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f4705o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4706p;

    public C0453b(C0451a c0451a) {
        int size = c0451a.mOps.size();
        this.b = new int[size * 6];
        if (c0451a.mAddToBackStack) {
            this.f4696c = new ArrayList(size);
            this.f4697d = new int[size];
            this.f4698f = new int[size];
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                y0 y0Var = c0451a.mOps.get(i10);
                int i11 = i9 + 1;
                this.b[i9] = y0Var.f4805a;
                ArrayList arrayList = this.f4696c;
                Fragment fragment = y0Var.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.b;
                iArr[i11] = y0Var.f4806c ? 1 : 0;
                iArr[i9 + 2] = y0Var.f4807d;
                iArr[i9 + 3] = y0Var.f4808e;
                int i12 = i9 + 5;
                iArr[i9 + 4] = y0Var.f4809f;
                i9 += 6;
                iArr[i12] = y0Var.f4810g;
                this.f4697d[i10] = y0Var.f4811h.ordinal();
                this.f4698f[i10] = y0Var.f4812i.ordinal();
            }
            this.f4699g = c0451a.mTransition;
            this.f4700h = c0451a.mName;
            this.f4701i = c0451a.f4694c;
            this.f4702j = c0451a.mBreadCrumbTitleRes;
            this.f4703k = c0451a.mBreadCrumbTitleText;
            this.l = c0451a.mBreadCrumbShortTitleRes;
            this.m = c0451a.mBreadCrumbShortTitleText;
            this.f4704n = c0451a.mSharedElementSourceNames;
            this.f4705o = c0451a.mSharedElementTargetNames;
            this.f4706p = c0451a.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.y0, java.lang.Object] */
    public final void a(C0451a c0451a) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.b;
            boolean z8 = true;
            if (i9 < iArr.length) {
                ?? obj = new Object();
                int i11 = i9 + 1;
                obj.f4805a = iArr[i9];
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Instantiate " + c0451a + " op #" + i10 + " base fragment #" + iArr[i11]);
                }
                obj.f4811h = EnumC0504n.values()[this.f4697d[i10]];
                obj.f4812i = EnumC0504n.values()[this.f4698f[i10]];
                int i12 = i9 + 2;
                if (iArr[i11] == 0) {
                    z8 = false;
                }
                obj.f4806c = z8;
                int i13 = iArr[i12];
                obj.f4807d = i13;
                int i14 = iArr[i9 + 3];
                obj.f4808e = i14;
                int i15 = i9 + 5;
                int i16 = iArr[i9 + 4];
                obj.f4809f = i16;
                i9 += 6;
                int i17 = iArr[i15];
                obj.f4810g = i17;
                c0451a.mEnterAnim = i13;
                c0451a.mExitAnim = i14;
                c0451a.mPopEnterAnim = i16;
                c0451a.mPopExitAnim = i17;
                c0451a.addOp(obj);
                i10++;
            } else {
                c0451a.mTransition = this.f4699g;
                c0451a.mName = this.f4700h;
                c0451a.mAddToBackStack = true;
                c0451a.mBreadCrumbTitleRes = this.f4702j;
                c0451a.mBreadCrumbTitleText = this.f4703k;
                c0451a.mBreadCrumbShortTitleRes = this.l;
                c0451a.mBreadCrumbShortTitleText = this.m;
                c0451a.mSharedElementSourceNames = this.f4704n;
                c0451a.mSharedElementTargetNames = this.f4705o;
                c0451a.mReorderingAllowed = this.f4706p;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.f4696c);
        parcel.writeIntArray(this.f4697d);
        parcel.writeIntArray(this.f4698f);
        parcel.writeInt(this.f4699g);
        parcel.writeString(this.f4700h);
        parcel.writeInt(this.f4701i);
        parcel.writeInt(this.f4702j);
        TextUtils.writeToParcel(this.f4703k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.f4704n);
        parcel.writeStringList(this.f4705o);
        parcel.writeInt(this.f4706p ? 1 : 0);
    }

    public C0453b(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.f4696c = parcel.createStringArrayList();
        this.f4697d = parcel.createIntArray();
        this.f4698f = parcel.createIntArray();
        this.f4699g = parcel.readInt();
        this.f4700h = parcel.readString();
        this.f4701i = parcel.readInt();
        this.f4702j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4703k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.f4704n = parcel.createStringArrayList();
        this.f4705o = parcel.createStringArrayList();
        this.f4706p = parcel.readInt() != 0;
    }
}
