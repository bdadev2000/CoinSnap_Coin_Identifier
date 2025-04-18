package androidx.appcompat.widget;

import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.ShowableListMenu;

/* loaded from: classes3.dex */
public class PopupMenu {

    /* renamed from: androidx.appcompat.widget.PopupMenu$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            throw null;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void onMenuModeChange(MenuBuilder menuBuilder) {
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements PopupWindow.OnDismissListener {
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            throw null;
        }
    }

    /* renamed from: androidx.appcompat.widget.PopupMenu$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass3 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public interface OnDismissListener {
    }

    /* loaded from: classes3.dex */
    public interface OnMenuItemClickListener {
    }
}
