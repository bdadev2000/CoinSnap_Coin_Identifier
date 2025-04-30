package h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310a implements Parcelable {
    public static final Parcelable.Creator<C2310a> CREATOR = new y(17);
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f20551c;

    public C2310a(int i9, Intent intent) {
        this.b = i9;
        this.f20551c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i9 = this.b;
        if (i9 != -1) {
            if (i9 != 0) {
                str = String.valueOf(i9);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f20551c);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10;
        G7.j.e(parcel, "dest");
        parcel.writeInt(this.b);
        Intent intent = this.f20551c;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        parcel.writeInt(i10);
        if (intent != null) {
            intent.writeToParcel(parcel, i9);
        }
    }
}
