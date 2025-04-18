package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p0.a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f297a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f299c;
    public final int d;

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final IntentSender f300a;

        /* renamed from: b, reason: collision with root package name */
        public Intent f301b;

        /* renamed from: c, reason: collision with root package name */
        public int f302c;
        public int d;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            a.s(intentSender, "intentSender");
            this.f300a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f300a, this.f301b, this.f302c, this.d);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        a.s(intentSender, "intentSender");
        this.f297a = intentSender;
        this.f298b = intent;
        this.f299c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        a.s(parcel, "dest");
        parcel.writeParcelable(this.f297a, i2);
        parcel.writeParcelable(this.f298b, i2);
        parcel.writeInt(this.f299c);
        parcel.writeInt(this.d);
    }
}
