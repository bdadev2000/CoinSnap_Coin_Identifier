package B3;

import U3.B;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.G;
import androidx.recyclerview.widget.h0;
import b0.AbstractC0547b;
import q.W0;

/* loaded from: classes2.dex */
public final class i implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287a;

    public /* synthetic */ i(int i9) {
        this.f287a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View$BaseSavedState, S0.o, java.lang.Object] */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f287a) {
            case 0:
                return new j(parcel, classLoader);
            case 1:
                return new C3.b(parcel, classLoader);
            case 2:
                return new G.g(parcel, classLoader);
            case 3:
                return new L3.a(parcel, classLoader);
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.b = parcel.readInt();
                baseSavedState.f2790c = parcel.readInt();
                baseSavedState.f2791d = parcel.readParcelable(classLoader);
                return baseSavedState;
            case 5:
                return new S3.d(parcel, classLoader);
            case 6:
                return new B(parcel, classLoader);
            case 7:
                return new G(parcel, classLoader);
            case 8:
                return new h0(parcel, classLoader);
            case 9:
                return new androidx.viewpager.widget.i(parcel, classLoader);
            case 10:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0547b.f5254c;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new W0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f287a) {
            case 0:
                return new j[i9];
            case 1:
                return new C3.b[i9];
            case 2:
                return new G.g[i9];
            case 3:
                return new L3.a[i9];
            case 4:
                return new S0.o[i9];
            case 5:
                return new S3.d[i9];
            case 6:
                return new B[i9];
            case 7:
                return new G[i9];
            case 8:
                return new h0[i9];
            case 9:
                return new androidx.viewpager.widget.i[i9];
            case 10:
                return new AbstractC0547b[i9];
            default:
                return new W0[i9];
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View$BaseSavedState, S0.o, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f287a) {
            case 0:
                return new j(parcel, (ClassLoader) null);
            case 1:
                return new C3.b(parcel, null);
            case 2:
                return new G.g(parcel, null);
            case 3:
                return new L3.a(parcel, null);
            case 4:
                ?? baseSavedState = new View.BaseSavedState(parcel, null);
                baseSavedState.b = parcel.readInt();
                baseSavedState.f2790c = parcel.readInt();
                baseSavedState.f2791d = parcel.readParcelable(null);
                return baseSavedState;
            case 5:
                return new S3.d(parcel, (ClassLoader) null);
            case 6:
                return new B(parcel, null);
            case 7:
                return new G(parcel, null);
            case 8:
                return new h0(parcel, null);
            case 9:
                return new androidx.viewpager.widget.i(parcel, null);
            case 10:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0547b.f5254c;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new W0(parcel, null);
        }
    }
}
