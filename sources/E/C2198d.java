package e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2198d implements Parcelable {
    public static final Parcelable.Creator<C2198d> CREATOR = new y(15);
    public InterfaceC2196b b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new BinderC2197c(this);
                }
                parcel.writeStrongBinder(this.b.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i9, Bundle bundle) {
    }
}
