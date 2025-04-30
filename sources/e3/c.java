package E3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class c extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new b(0);
    public int b;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i9 = this.b;
        if (i9 != 1) {
            if (i9 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return AbstractC2914a.h(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeValue(Integer.valueOf(this.b));
    }
}
