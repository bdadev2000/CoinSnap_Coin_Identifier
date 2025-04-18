package android.support.v4.media;

import android.os.Parcelable;
import androidx.activity.result.j;
import androidx.appcompat.widget.r0;
import androidx.fragment.app.e1;
import androidx.fragment.app.j1;
import androidx.fragment.app.x0;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.u1;
import androidx.recyclerview.widget.w1;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.facebook.d0;
import com.facebook.l;
import com.facebook.m;
import com.facebook.n;
import com.facebook.n0;
import com.facebook.u;
import d.e;
import m3.g;
import t0.k;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i10];
            case 1:
                return new MediaDescriptionCompat[i10];
            case 2:
                return new MediaMetadataCompat[i10];
            case 3:
                return new RatingCompat[i10];
            case 4:
                return new e[i10];
            case 5:
                return new androidx.activity.result.a[i10];
            case 6:
                return new j[i10];
            case 7:
                return new r0[i10];
            case 8:
                return new k[i10];
            case 9:
                return new androidx.fragment.app.b[i10];
            case 10:
                return new androidx.fragment.app.c[i10];
            case 11:
                return new x0[i10];
            case 12:
                return new e1[i10];
            case 13:
                return new j1[i10];
            case 14:
                return new a0[i10];
            case 15:
                return new u1[i10];
            case 16:
                return new w1[i10];
            case 17:
                return new ParcelImpl[i10];
            case 18:
                return new g[i10];
            case 19:
                return new com.facebook.a[i10];
            case 20:
                return new l[i10];
            case 21:
                return new m[i10];
            case 22:
                return new n[i10];
            case 23:
                return new u[i10];
            case 24:
                return new d0[i10];
            case 25:
                return new n0[i10];
            case 26:
                return new WrappedParcelable[i10];
            case 27:
                return new com.facebook.login.b[i10];
            case 28:
                return new com.facebook.login.g[i10];
            default:
                return new com.facebook.login.j[i10];
        }
    }
}
