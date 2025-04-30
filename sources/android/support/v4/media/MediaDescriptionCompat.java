package android.support.v4.media;

import E3.b;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new b(7);
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f4092c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f4093d;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f4094f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f4095g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f4096h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f4097i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f4098j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4099k;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.b = str;
        this.f4092c = charSequence;
        this.f4093d = charSequence2;
        this.f4094f = charSequence3;
        this.f4095g = bitmap;
        this.f4096h = uri;
        this.f4097i = bundle;
        this.f4098j = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f4092c) + ", " + ((Object) this.f4093d) + ", " + ((Object) this.f4094f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        Object obj = this.f4099k;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.b);
            builder.setTitle(this.f4092c);
            builder.setSubtitle(this.f4093d);
            builder.setDescription(this.f4094f);
            builder.setIconBitmap(this.f4095g);
            builder.setIconUri(this.f4096h);
            builder.setExtras(this.f4097i);
            builder.setMediaUri(this.f4098j);
            obj = builder.build();
            this.f4099k = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i9);
    }
}
