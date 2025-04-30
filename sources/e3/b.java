package E3;

import U4.w;
import Z.k;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.C0453b;
import androidx.fragment.app.C0455c;
import androidx.fragment.app.C0466h0;
import androidx.fragment.app.p0;
import androidx.fragment.app.u0;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.v0;
import androidx.recyclerview.widget.x0;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.C0785a;
import com.facebook.C1829g;
import com.facebook.C1830h;
import com.facebook.C1831i;
import com.facebook.p;
import com.google.firebase.perf.metrics.Trace;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1007a;

    public /* synthetic */ b(int i9) {
        this.f1007a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$BaseSavedState, E3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View$BaseSavedState, Z.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.fragment.app.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, androidx.fragment.app.p0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, androidx.recyclerview.widget.A] */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.recyclerview.widget.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.recyclerview.widget.x0, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f1007a) {
            case 0:
                return new c[i9];
            case 1:
                return new M6.a[i9];
            case 2:
                return new ParcelImpl[i9];
            case 3:
                return new w[i9];
            case 4:
                return new X3.b[i9];
            case 5:
                return new k[i9];
            case 6:
                return new MediaBrowserCompat$MediaItem[i9];
            case 7:
                return new MediaDescriptionCompat[i9];
            case 8:
                return new MediaMetadataCompat[i9];
            case 9:
                return new RatingCompat[i9];
            case 10:
                return new MediaSessionCompat$QueueItem[i9];
            case 11:
                return new MediaSessionCompat$ResultReceiverWrapper[i9];
            case 12:
                return new MediaSessionCompat$Token[i9];
            case 13:
                return new ParcelableVolumeInfo[i9];
            case 14:
                return new PlaybackStateCompat[i9];
            case 15:
                return new C0453b[i9];
            case 16:
                return new C0455c[i9];
            case 17:
                return new C0466h0[i9];
            case 18:
                return new p0[i9];
            case 19:
                return new u0[i9];
            case 20:
                return new A[i9];
            case 21:
                return new v0[i9];
            case 22:
                return new x0[i9];
            case 23:
                return new b5.c[i9];
            case 24:
                return new Trace[i9];
            case 25:
                return new C0785a[i9];
            case 26:
                return new C1829g[i9];
            case 27:
                return new C1830h[i9];
            case 28:
                return new C1831i[i9];
            default:
                return new p[i9];
        }
    }
}
