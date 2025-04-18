package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19655a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19656b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f19657c;
    public final int[] d;

    /* renamed from: f, reason: collision with root package name */
    public final int f19658f;

    /* renamed from: g, reason: collision with root package name */
    public final String f19659g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19660h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19661i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f19662j;

    /* renamed from: k, reason: collision with root package name */
    public final int f19663k;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f19664l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f19665m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f19666n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19667o;

    /* renamed from: androidx.fragment.app.BackStackRecordState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    }

    public BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f19808a.size();
        this.f19655a = new int[size * 6];
        if (backStackRecord.f19812g) {
            this.f19656b = new ArrayList(size);
            this.f19657c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) backStackRecord.f19808a.get(i3);
                int i4 = i2 + 1;
                this.f19655a[i2] = op.f19821a;
                ArrayList arrayList = this.f19656b;
                Fragment fragment = op.f19822b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f19655a;
                iArr[i4] = op.f19823c ? 1 : 0;
                iArr[i2 + 2] = op.d;
                iArr[i2 + 3] = op.e;
                int i5 = i2 + 5;
                iArr[i2 + 4] = op.f19824f;
                i2 += 6;
                iArr[i5] = op.f19825g;
                this.f19657c[i3] = op.f19826h.ordinal();
                this.d[i3] = op.f19827i.ordinal();
            }
            this.f19658f = backStackRecord.f19811f;
            this.f19659g = backStackRecord.f19813h;
            this.f19660h = backStackRecord.f19653r;
            this.f19661i = backStackRecord.f19814i;
            this.f19662j = backStackRecord.f19815j;
            this.f19663k = backStackRecord.f19816k;
            this.f19664l = backStackRecord.f19817l;
            this.f19665m = backStackRecord.f19818m;
            this.f19666n = backStackRecord.f19819n;
            this.f19667o = backStackRecord.f19820o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.FragmentTransaction$Op, java.lang.Object] */
    public final void b(BackStackRecord backStackRecord) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f19655a;
            boolean z2 = true;
            if (i2 >= iArr.length) {
                backStackRecord.f19811f = this.f19658f;
                backStackRecord.f19813h = this.f19659g;
                backStackRecord.f19812g = true;
                backStackRecord.f19814i = this.f19661i;
                backStackRecord.f19815j = this.f19662j;
                backStackRecord.f19816k = this.f19663k;
                backStackRecord.f19817l = this.f19664l;
                backStackRecord.f19818m = this.f19665m;
                backStackRecord.f19819n = this.f19666n;
                backStackRecord.f19820o = this.f19667o;
                return;
            }
            ?? obj = new Object();
            int i4 = i2 + 1;
            obj.f19821a = iArr[i2];
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + iArr[i4]);
            }
            obj.f19826h = Lifecycle.State.values()[this.f19657c[i3]];
            obj.f19827i = Lifecycle.State.values()[this.d[i3]];
            int i5 = i2 + 2;
            if (iArr[i4] == 0) {
                z2 = false;
            }
            obj.f19823c = z2;
            int i6 = iArr[i5];
            obj.d = i6;
            int i7 = iArr[i2 + 3];
            obj.e = i7;
            int i8 = i2 + 5;
            int i9 = iArr[i2 + 4];
            obj.f19824f = i9;
            i2 += 6;
            int i10 = iArr[i8];
            obj.f19825g = i10;
            backStackRecord.f19809b = i6;
            backStackRecord.f19810c = i7;
            backStackRecord.d = i9;
            backStackRecord.e = i10;
            backStackRecord.b(obj);
            i3++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f19655a);
        parcel.writeStringList(this.f19656b);
        parcel.writeIntArray(this.f19657c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f19658f);
        parcel.writeString(this.f19659g);
        parcel.writeInt(this.f19660h);
        parcel.writeInt(this.f19661i);
        TextUtils.writeToParcel(this.f19662j, parcel, 0);
        parcel.writeInt(this.f19663k);
        TextUtils.writeToParcel(this.f19664l, parcel, 0);
        parcel.writeStringList(this.f19665m);
        parcel.writeStringList(this.f19666n);
        parcel.writeInt(this.f19667o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f19655a = parcel.createIntArray();
        this.f19656b = parcel.createStringArrayList();
        this.f19657c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f19658f = parcel.readInt();
        this.f19659g = parcel.readString();
        this.f19660h = parcel.readInt();
        this.f19661i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f19662j = (CharSequence) creator.createFromParcel(parcel);
        this.f19663k = parcel.readInt();
        this.f19664l = (CharSequence) creator.createFromParcel(parcel);
        this.f19665m = parcel.createStringArrayList();
        this.f19666n = parcel.createStringArrayList();
        this.f19667o = parcel.readInt() != 0;
    }
}
