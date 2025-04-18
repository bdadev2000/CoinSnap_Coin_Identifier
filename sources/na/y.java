package na;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.j3;

/* loaded from: classes3.dex */
public final class y extends w0.b {
    public static final Parcelable.Creator<y> CREATOR = new j3(13);

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f22715d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22716f;

    public y(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f22715d) + "}";
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        TextUtils.writeToParcel(this.f22715d, parcel, i10);
        parcel.writeInt(this.f22716f ? 1 : 0);
    }

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22715d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f22716f = parcel.readInt() == 1;
    }
}
