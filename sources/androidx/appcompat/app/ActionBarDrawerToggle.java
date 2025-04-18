package androidx.appcompat.app;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes2.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public interface Delegate {
    }

    /* loaded from: classes2.dex */
    public interface DelegateProvider {
    }

    /* loaded from: classes2.dex */
    public static class FrameworkActionBarDelegate implements Delegate {
    }

    /* loaded from: classes2.dex */
    public static class ToolbarCompatDelegate implements Delegate {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerSlide(View view, float f2) {
        throw null;
    }
}
