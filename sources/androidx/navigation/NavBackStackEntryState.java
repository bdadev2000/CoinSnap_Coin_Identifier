package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class NavBackStackEntryState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f20342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20343b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f20344c;
    public final Bundle d;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        p0.a.s(navBackStackEntry, "entry");
        this.f20342a = navBackStackEntry.f20331g;
        this.f20343b = navBackStackEntry.f20328b.f20436h;
        this.f20344c = navBackStackEntry.a();
        Bundle bundle = new Bundle();
        this.d = bundle;
        navBackStackEntry.f20334j.c(bundle);
    }

    public final NavBackStackEntry b(Context context, NavDestination navDestination, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        p0.a.s(context, "context");
        p0.a.s(state, "hostLifecycleState");
        Bundle bundle = this.f20344c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.d;
        String str = this.f20342a;
        p0.a.s(str, "id");
        return new NavBackStackEntry(context, navDestination, bundle2, state, navControllerViewModel, str, bundle3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        p0.a.s(parcel, "parcel");
        parcel.writeString(this.f20342a);
        parcel.writeInt(this.f20343b);
        parcel.writeBundle(this.f20344c);
        parcel.writeBundle(this.d);
    }

    public NavBackStackEntryState(Parcel parcel) {
        p0.a.s(parcel, "inParcel");
        String readString = parcel.readString();
        p0.a.p(readString);
        this.f20342a = readString;
        this.f20343b = parcel.readInt();
        this.f20344c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        p0.a.p(readBundle);
        this.d = readBundle;
    }
}
