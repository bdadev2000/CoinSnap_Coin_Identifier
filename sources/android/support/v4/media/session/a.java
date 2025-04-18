package android.support.v4.media.session;

import a4.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new a(0);

                    /* renamed from: b, reason: collision with root package name */
                    public final ResultReceiver f532b;

                    {
                        this.f532b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f532b.writeToParcel(parcel2, i10);
                    }
                };
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f530b;

                    /* renamed from: c, reason: collision with root package name */
                    public final long f531c;

                    {
                        this.f530b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f531c = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f530b);
                        sb2.append(", Id=");
                        return j.j(sb2, this.f531c, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f530b.writeToParcel(parcel2, i10);
                        parcel2.writeLong(this.f531c);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: b, reason: collision with root package name */
                    public final Object f533b = new Object();

                    /* renamed from: c, reason: collision with root package name */
                    public final Object f534c;

                    {
                        this.f534c = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.f534c;
                        if (obj2 == null) {
                            if (mediaSessionCompat$Token.f534c == null) {
                                return true;
                            }
                            return false;
                        }
                        Object obj3 = mediaSessionCompat$Token.f534c;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.f534c;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeParcelable((Parcelable) this.f534c, i10);
                    }
                };
            case 3:
                return new ParcelableVolumeInfo(parcel);
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 1:
                return new MediaSessionCompat$QueueItem[i10];
            case 2:
                return new MediaSessionCompat$Token[i10];
            case 3:
                return new ParcelableVolumeInfo[i10];
            default:
                return new PlaybackStateCompat[i10];
        }
    }
}
