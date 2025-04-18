package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new android.support.v4.media.j(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f113b;

    /* renamed from: c, reason: collision with root package name */
    public final long f114c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final long f115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f116g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f117h;

    /* renamed from: i, reason: collision with root package name */
    public final long f118i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f119j;

    /* renamed from: k, reason: collision with root package name */
    public final long f120k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f121l;

    /* loaded from: classes4.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final String f122a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f123b;

        /* renamed from: c, reason: collision with root package name */
        public final int f124c;
        public final Bundle d;

        public CustomAction(Parcel parcel) {
            this.f122a = parcel.readString();
            this.f123b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f124c = parcel.readInt();
            this.d = parcel.readBundle(j.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f123b) + ", mIcon=" + this.f124c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f122a);
            TextUtils.writeToParcel(this.f123b, parcel, i2);
            parcel.writeInt(this.f124c);
            parcel.writeBundle(this.d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f112a = parcel.readInt();
        this.f113b = parcel.readLong();
        this.d = parcel.readFloat();
        this.f118i = parcel.readLong();
        this.f114c = parcel.readLong();
        this.f115f = parcel.readLong();
        this.f117h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f119j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f120k = parcel.readLong();
        this.f121l = parcel.readBundle(j.class.getClassLoader());
        this.f116g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f112a);
        sb.append(", position=");
        sb.append(this.f113b);
        sb.append(", buffered position=");
        sb.append(this.f114c);
        sb.append(", speed=");
        sb.append(this.d);
        sb.append(", updated=");
        sb.append(this.f118i);
        sb.append(", actions=");
        sb.append(this.f115f);
        sb.append(", error code=");
        sb.append(this.f116g);
        sb.append(", error message=");
        sb.append(this.f117h);
        sb.append(", custom actions=");
        sb.append(this.f119j);
        sb.append(", active item id=");
        return android.support.v4.media.d.p(sb, this.f120k, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f112a);
        parcel.writeLong(this.f113b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f118i);
        parcel.writeLong(this.f114c);
        parcel.writeLong(this.f115f);
        TextUtils.writeToParcel(this.f117h, parcel, i2);
        parcel.writeTypedList(this.f119j);
        parcel.writeLong(this.f120k);
        parcel.writeBundle(this.f121l);
        parcel.writeInt(this.f116g);
    }
}
