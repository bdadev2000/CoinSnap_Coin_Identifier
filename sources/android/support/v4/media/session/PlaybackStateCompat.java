package android.support.v4.media.session;

import a4.j;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bumptech.glide.d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f541c;

    /* renamed from: d, reason: collision with root package name */
    public final long f542d;

    /* renamed from: f, reason: collision with root package name */
    public final float f543f;

    /* renamed from: g, reason: collision with root package name */
    public final long f544g;

    /* renamed from: h, reason: collision with root package name */
    public final int f545h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f546i;

    /* renamed from: j, reason: collision with root package name */
    public final long f547j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f548k;

    /* renamed from: l, reason: collision with root package name */
    public final long f549l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f550m;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public final String f551b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f552c;

        /* renamed from: d, reason: collision with root package name */
        public final int f553d;

        /* renamed from: f, reason: collision with root package name */
        public final Bundle f554f;

        public CustomAction(Parcel parcel) {
            this.f551b = parcel.readString();
            this.f552c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f553d = parcel.readInt();
            this.f554f = parcel.readBundle(d.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f552c) + ", mIcon=" + this.f553d + ", mExtras=" + this.f554f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f551b);
            TextUtils.writeToParcel(this.f552c, parcel, i10);
            parcel.writeInt(this.f553d);
            parcel.writeBundle(this.f554f);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f540b = parcel.readInt();
        this.f541c = parcel.readLong();
        this.f543f = parcel.readFloat();
        this.f547j = parcel.readLong();
        this.f542d = parcel.readLong();
        this.f544g = parcel.readLong();
        this.f546i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f548k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f549l = parcel.readLong();
        this.f550m = parcel.readBundle(d.class.getClassLoader());
        this.f545h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f540b);
        sb2.append(", position=");
        sb2.append(this.f541c);
        sb2.append(", buffered position=");
        sb2.append(this.f542d);
        sb2.append(", speed=");
        sb2.append(this.f543f);
        sb2.append(", updated=");
        sb2.append(this.f547j);
        sb2.append(", actions=");
        sb2.append(this.f544g);
        sb2.append(", error code=");
        sb2.append(this.f545h);
        sb2.append(", error message=");
        sb2.append(this.f546i);
        sb2.append(", custom actions=");
        sb2.append(this.f548k);
        sb2.append(", active item id=");
        return j.j(sb2, this.f549l, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f540b);
        parcel.writeLong(this.f541c);
        parcel.writeFloat(this.f543f);
        parcel.writeLong(this.f547j);
        parcel.writeLong(this.f542d);
        parcel.writeLong(this.f544g);
        TextUtils.writeToParcel(this.f546i, parcel, i10);
        parcel.writeTypedList(this.f548k);
        parcel.writeLong(this.f549l);
        parcel.writeBundle(this.f550m);
        parcel.writeInt(this.f545h);
    }
}
