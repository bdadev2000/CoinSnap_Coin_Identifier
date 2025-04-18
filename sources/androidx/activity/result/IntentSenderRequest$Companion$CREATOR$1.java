package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p0.a;

/* loaded from: classes.dex */
public final class IntentSenderRequest$Companion$CREATOR$1 implements Parcelable.Creator<IntentSenderRequest> {
    @Override // android.os.Parcelable.Creator
    public final IntentSenderRequest createFromParcel(Parcel parcel) {
        a.s(parcel, "inParcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        a.p(readParcelable);
        return new IntentSenderRequest((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final IntentSenderRequest[] newArray(int i2) {
        return new IntentSenderRequest[i2];
    }
}
