package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(6);

    /* renamed from: b, reason: collision with root package name */
    public final IntentSender f612b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f614d;

    /* renamed from: f, reason: collision with root package name */
    public final int f615f;

    public j(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f612b = intentSender;
        this.f613c = intent;
        this.f614d = i10;
        this.f615f = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f612b, i10);
        dest.writeParcelable(this.f613c, i10);
        dest.writeInt(this.f614d);
        dest.writeInt(this.f615f);
    }
}
