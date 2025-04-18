package y9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import vd.e;

/* loaded from: classes3.dex */
public final class b extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new r8.b(11);

    /* renamed from: b, reason: collision with root package name */
    public int f28123b;

    public b(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i10 = this.f28123b;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return e.h(sb2, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f28123b));
    }

    public b(Parcel parcel) {
        super(parcel);
        this.f28123b = ((Integer) parcel.readValue(b.class.getClassLoader())).intValue();
    }
}
