package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: b, reason: collision with root package name */
    public final String f510b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f511c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f512d;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f513f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap f514g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f515h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f516i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f517j;

    /* renamed from: k, reason: collision with root package name */
    public MediaDescription f518k;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f510b = str;
        this.f511c = charSequence;
        this.f512d = charSequence2;
        this.f513f = charSequence3;
        this.f514g = bitmap;
        this.f515h = uri;
        this.f516i = bundle;
        this.f517j = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f511c) + ", " + ((Object) this.f512d) + ", " + ((Object) this.f513f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescription = this.f518k;
        if (mediaDescription == null) {
            MediaDescription.Builder b3 = b.b();
            b.n(b3, this.f510b);
            b.p(b3, this.f511c);
            b.o(b3, this.f512d);
            b.j(b3, this.f513f);
            b.l(b3, this.f514g);
            b.m(b3, this.f515h);
            b.k(b3, this.f516i);
            c.b(b3, this.f517j);
            mediaDescription = b.a(b3);
            this.f518k = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
