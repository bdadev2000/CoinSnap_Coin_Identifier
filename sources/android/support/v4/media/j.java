package android.support.v4.media;

import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    public /* synthetic */ j(int i2) {
        this.f96a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f96a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i2];
            case 1:
                return new MediaDescriptionCompat[i2];
            case 2:
                return new MediaMetadataCompat[i2];
            case 3:
                return new RatingCompat[i2];
            case 4:
                return new MediaSessionCompat$QueueItem[i2];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i2];
            case 6:
                return new MediaSessionCompat$Token[i2];
            case 7:
                return new ParcelableVolumeInfo[i2];
            case 8:
                return new PlaybackStateCompat[i2];
            case 9:
                return new c.d[i2];
            default:
                return new o.c[i2];
        }
    }
}
