package android.support.v4.media.session;

import Q7.n0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new E3.b(14);
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4106c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4107d;

    /* renamed from: f, reason: collision with root package name */
    public final float f4108f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4109g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4110h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f4111i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4112j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4113k;
    public final long l;
    public final Bundle m;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final String b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f4114c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4115d;

        /* renamed from: f, reason: collision with root package name */
        public final Bundle f4116f;

        public CustomAction(Parcel parcel) {
            this.b = parcel.readString();
            this.f4114c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4115d = parcel.readInt();
            this.f4116f = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f4114c) + ", mIcon=" + this.f4115d + ", mExtras=" + this.f4116f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i9) {
            parcel.writeString(this.b);
            TextUtils.writeToParcel(this.f4114c, parcel, i9);
            parcel.writeInt(this.f4115d);
            parcel.writeBundle(this.f4116f);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.b = parcel.readInt();
        this.f4106c = parcel.readLong();
        this.f4108f = parcel.readFloat();
        this.f4112j = parcel.readLong();
        this.f4107d = parcel.readLong();
        this.f4109g = parcel.readLong();
        this.f4111i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4113k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.l = parcel.readLong();
        this.m = parcel.readBundle(a.class.getClassLoader());
        this.f4110h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.f4106c);
        sb.append(", buffered position=");
        sb.append(this.f4107d);
        sb.append(", speed=");
        sb.append(this.f4108f);
        sb.append(", updated=");
        sb.append(this.f4112j);
        sb.append(", actions=");
        sb.append(this.f4109g);
        sb.append(", error code=");
        sb.append(this.f4110h);
        sb.append(", error message=");
        sb.append(this.f4111i);
        sb.append(", custom actions=");
        sb.append(this.f4113k);
        sb.append(", active item id=");
        return n0.k(sb, this.l, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.f4106c);
        parcel.writeFloat(this.f4108f);
        parcel.writeLong(this.f4112j);
        parcel.writeLong(this.f4107d);
        parcel.writeLong(this.f4109g);
        TextUtils.writeToParcel(this.f4111i, parcel, i9);
        parcel.writeTypedList(this.f4113k);
        parcel.writeLong(this.l);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.f4110h);
    }
}
