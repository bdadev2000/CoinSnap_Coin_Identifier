package androidx.navigation;

/* loaded from: classes2.dex */
public final class NavDeepLinkBuilder {

    /* loaded from: classes2.dex */
    public static final class DeepLinkDestination {
    }

    /* loaded from: classes2.dex */
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {
        @Override // androidx.navigation.NavigatorProvider
        public final Navigator b(String str) {
            p0.a.s(str, "name");
            try {
                return super.b(str);
            } catch (IllegalStateException unused) {
                p0.a.q(null, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return null;
            }
        }
    }
}
