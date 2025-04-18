package v9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.j3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public final class c extends w0.b {
    public static final Parcelable.Creator<c> CREATOR = new j3(9);

    /* renamed from: d, reason: collision with root package name */
    public final int f26347d;

    /* renamed from: f, reason: collision with root package name */
    public final int f26348f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26349g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26350h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26351i;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26347d = parcel.readInt();
        this.f26348f = parcel.readInt();
        this.f26349g = parcel.readInt() == 1;
        this.f26350h = parcel.readInt() == 1;
        this.f26351i = parcel.readInt() == 1;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f26347d);
        parcel.writeInt(this.f26348f);
        parcel.writeInt(this.f26349g ? 1 : 0);
        parcel.writeInt(this.f26350h ? 1 : 0);
        parcel.writeInt(this.f26351i ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f26347d = bottomSheetBehavior.N;
        this.f26348f = bottomSheetBehavior.f11574e;
        this.f26349g = bottomSheetBehavior.f11568b;
        this.f26350h = bottomSheetBehavior.I;
        this.f26351i = bottomSheetBehavior.J;
    }
}
