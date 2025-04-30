package U3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b0.AbstractC0547b;

/* loaded from: classes2.dex */
public final class B extends AbstractC0547b {
    public static final Parcelable.Creator<B> CREATOR = new B3.i(6);

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f3136d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3137f;

    public B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3136d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3137f = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3136d) + "}";
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        TextUtils.writeToParcel(this.f3136d, parcel, i9);
        parcel.writeInt(this.f3137f ? 1 : 0);
    }
}
