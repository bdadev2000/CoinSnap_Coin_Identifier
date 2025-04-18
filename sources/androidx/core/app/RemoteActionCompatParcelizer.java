package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

@RestrictTo
/* loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        VersionedParcelable versionedParcelable = remoteActionCompat.f18464a;
        if (versionedParcel.j(1)) {
            versionedParcelable = versionedParcel.o();
        }
        remoteActionCompat.f18464a = (IconCompat) versionedParcelable;
        CharSequence charSequence = remoteActionCompat.f18465b;
        if (versionedParcel.j(2)) {
            charSequence = versionedParcel.i();
        }
        remoteActionCompat.f18465b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f18466c;
        if (versionedParcel.j(3)) {
            charSequence2 = versionedParcel.i();
        }
        remoteActionCompat.f18466c = charSequence2;
        Parcelable parcelable = remoteActionCompat.d;
        if (versionedParcel.j(4)) {
            parcelable = versionedParcel.m();
        }
        remoteActionCompat.d = (PendingIntent) parcelable;
        boolean z2 = remoteActionCompat.e;
        if (versionedParcel.j(5)) {
            z2 = versionedParcel.g();
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f18467f;
        if (versionedParcel.j(6)) {
            z3 = versionedParcel.g();
        }
        remoteActionCompat.f18467f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        IconCompat iconCompat = remoteActionCompat.f18464a;
        versionedParcel.p(1);
        versionedParcel.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.f18465b;
        versionedParcel.p(2);
        versionedParcel.t(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f18466c;
        versionedParcel.p(3);
        versionedParcel.t(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        versionedParcel.p(4);
        versionedParcel.w(pendingIntent);
        boolean z2 = remoteActionCompat.e;
        versionedParcel.p(5);
        versionedParcel.r(z2);
        boolean z3 = remoteActionCompat.f18467f;
        versionedParcel.p(6);
        versionedParcel.r(z3);
    }
}
