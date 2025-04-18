package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.compose.ComposeNavigator;
import q0.l;
import q0.r;

@StabilityInferred
@NavDestinationDsl
/* loaded from: classes2.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {

    /* renamed from: h, reason: collision with root package name */
    public final ComposeNavigator f20540h;

    /* renamed from: i, reason: collision with root package name */
    public final r f20541i;

    /* renamed from: j, reason: collision with root package name */
    public l f20542j;

    /* renamed from: k, reason: collision with root package name */
    public l f20543k;

    /* renamed from: l, reason: collision with root package name */
    public l f20544l;

    /* renamed from: m, reason: collision with root package name */
    public l f20545m;

    /* renamed from: n, reason: collision with root package name */
    public l f20546n;

    public ComposeNavigatorDestinationBuilder(ComposeNavigator composeNavigator, String str, r rVar) {
        super(composeNavigator, str);
        this.f20540h = composeNavigator;
        this.f20541i = rVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public final NavDestination a() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.a();
        destination.f20535m = this.f20542j;
        destination.f20536n = this.f20543k;
        destination.f20537o = this.f20544l;
        destination.f20538p = this.f20545m;
        destination.f20539q = this.f20546n;
        return destination;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public final NavDestination b() {
        return new ComposeNavigator.Destination(this.f20540h, this.f20541i);
    }
}
