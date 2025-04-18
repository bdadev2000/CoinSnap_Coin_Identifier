package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j3 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ j3(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return new k3(parcel, classLoader);
            case 1:
                return new y3(parcel, classLoader);
            case 2:
                return new b0.f(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return w0.b.f26665c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new androidx.fragment.app.b0(parcel, classLoader);
            case 5:
                return new androidx.recyclerview.widget.g1(parcel, classLoader);
            case 6:
                return new androidx.viewpager.widget.i(parcel, classLoader);
            case 7:
                return new j2.q(parcel, classLoader);
            case 8:
                return new t9.a(parcel, classLoader);
            case 9:
                return new v9.c(parcel, classLoader);
            case 10:
                return new w9.b(parcel, classLoader);
            case 11:
                return new ea.a(parcel, classLoader);
            case 12:
                return new la.d(parcel, classLoader);
            default:
                return new na.y(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new k3[i10];
            case 1:
                return new y3[i10];
            case 2:
                return new b0.f[i10];
            case 3:
                return new w0.b[i10];
            case 4:
                return new androidx.fragment.app.b0[i10];
            case 5:
                return new androidx.recyclerview.widget.g1[i10];
            case 6:
                return new androidx.viewpager.widget.i[i10];
            case 7:
                return new j2.q[i10];
            case 8:
                return new t9.a[i10];
            case 9:
                return new v9.c[i10];
            case 10:
                return new w9.b[i10];
            case 11:
                return new ea.a[i10];
            case 12:
                return new la.d[i10];
            default:
                return new na.y[i10];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new k3(parcel, null);
            case 1:
                return new y3(parcel, null);
            case 2:
                return new b0.f(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return w0.b.f26665c;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new androidx.fragment.app.b0(parcel, null);
            case 5:
                return new androidx.recyclerview.widget.g1(parcel, null);
            case 6:
                return new androidx.viewpager.widget.i(parcel, null);
            case 7:
                return new j2.q(parcel, null);
            case 8:
                return new t9.a(parcel, null);
            case 9:
                return new v9.c(parcel, (ClassLoader) null);
            case 10:
                return new w9.b(parcel, null);
            case 11:
                return new ea.a(parcel, null);
            case 12:
                return new la.d(parcel, (ClassLoader) null);
            default:
                return new na.y(parcel, null);
        }
    }
}
