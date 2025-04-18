package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new android.support.v4.media.j(6);

    /* renamed from: a, reason: collision with root package name */
    public final Object f106a;

    /* renamed from: b, reason: collision with root package name */
    public c f107b;

    public MediaSessionCompat$Token(Parcelable parcelable, c cVar) {
        this.f106a = parcelable;
        this.f107b = cVar;
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
        Object obj2 = this.f106a;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f106a == null;
        }
        Object obj3 = mediaSessionCompat$Token.f106a;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f106a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable((Parcelable) this.f106a, i2);
    }
}
