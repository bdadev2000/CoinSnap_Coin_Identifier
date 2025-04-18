package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes2.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.j(4);

    /* renamed from: a, reason: collision with root package name */
    public final MediaDescriptionCompat f103a;

    /* renamed from: b, reason: collision with root package name */
    public final long f104b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f103a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f104b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f103a);
        sb.append(", Id=");
        return android.support.v4.media.d.p(sb, this.f104b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        this.f103a.writeToParcel(parcel, i2);
        parcel.writeLong(this.f104b);
    }
}
