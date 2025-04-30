package h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.y;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new y(18);
    public final IntentSender b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f20566c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20567d;

    /* renamed from: f, reason: collision with root package name */
    public final int f20568f;

    public k(IntentSender intentSender, Intent intent, int i9, int i10) {
        G7.j.e(intentSender, "intentSender");
        this.b = intentSender;
        this.f20566c = intent;
        this.f20567d = i9;
        this.f20568f = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        G7.j.e(parcel, "dest");
        parcel.writeParcelable(this.b, i9);
        parcel.writeParcelable(this.f20566c, i9);
        parcel.writeInt(this.f20567d);
        parcel.writeInt(this.f20568f);
    }
}
