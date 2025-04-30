package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(O0.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        O0.c cVar = remoteActionCompat.f4383a;
        boolean z8 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f4383a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((O0.b) aVar).f2140e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4384c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((O0.b) aVar).f2140e);
        }
        remoteActionCompat.f4384c = charSequence2;
        remoteActionCompat.f4385d = (PendingIntent) aVar.g(remoteActionCompat.f4385d, 4);
        boolean z9 = remoteActionCompat.f4386e;
        if (aVar.e(5)) {
            if (((O0.b) aVar).f2140e.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        remoteActionCompat.f4386e = z9;
        boolean z10 = remoteActionCompat.f4387f;
        if (aVar.e(6)) {
            if (((O0.b) aVar).f2140e.readInt() == 0) {
                z8 = false;
            }
            z10 = z8;
        }
        remoteActionCompat.f4387f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, O0.a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4383a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        aVar.i(2);
        Parcel parcel = ((O0.b) aVar).f2140e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4384c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4385d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z8 = remoteActionCompat.f4386e;
        aVar.i(5);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = remoteActionCompat.f4387f;
        aVar.i(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
