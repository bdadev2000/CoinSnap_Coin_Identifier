package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(h2.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        h2.c cVar = remoteActionCompat.a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1167b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h2.b) aVar).f18714e);
        }
        remoteActionCompat.f1167b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1168c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h2.b) aVar).f18714e);
        }
        remoteActionCompat.f1168c = charSequence2;
        remoteActionCompat.f1169d = (PendingIntent) aVar.g(remoteActionCompat.f1169d, 4);
        boolean z11 = remoteActionCompat.f1170e;
        if (aVar.e(5)) {
            if (((h2.b) aVar).f18714e.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        remoteActionCompat.f1170e = z11;
        boolean z12 = remoteActionCompat.f1171f;
        if (aVar.e(6)) {
            if (((h2.b) aVar).f18714e.readInt() == 0) {
                z10 = false;
            }
            z12 = z10;
        }
        remoteActionCompat.f1171f = z12;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, h2.a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1167b;
        aVar.i(2);
        Parcel parcel = ((h2.b) aVar).f18714e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1168c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.f1169d, 4);
        boolean z10 = remoteActionCompat.f1170e;
        aVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f1171f;
        aVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
