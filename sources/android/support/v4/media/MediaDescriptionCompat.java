package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f71a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f72b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f73c;
    public final CharSequence d;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f74f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f75g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f76h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f77i;

    /* renamed from: j, reason: collision with root package name */
    public Object f78j;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f71a = str;
        this.f72b = charSequence;
        this.f73c = charSequence2;
        this.d = charSequence3;
        this.f74f = bitmap;
        this.f75g = uri;
        this.f76h = bundle;
        this.f77i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f72b) + ", " + ((Object) this.f73c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Object obj = this.f78j;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f71a);
            builder.setTitle(this.f72b);
            builder.setSubtitle(this.f73c);
            builder.setDescription(this.d);
            builder.setIconBitmap(this.f74f);
            builder.setIconUri(this.f75g);
            builder.setExtras(this.f76h);
            builder.setMediaUri(this.f77i);
            obj = builder.build();
            this.f78j = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
