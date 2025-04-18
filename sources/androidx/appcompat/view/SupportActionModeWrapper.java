package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f605a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionMode f606b;

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class CallbackWrapper implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f607a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f608b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f609c = new ArrayList();
        public final SimpleArrayMap d = new SimpleArrayMap();

        public CallbackWrapper(Context context, ActionMode.Callback callback) {
            this.f608b = context;
            this.f607a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void a(ActionMode actionMode) {
            this.f607a.onDestroyActionMode(e(actionMode));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean b(ActionMode actionMode, MenuBuilder menuBuilder) {
            SupportActionModeWrapper e = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menu = (Menu) simpleArrayMap.get(menuBuilder);
            if (menu == null) {
                menu = new MenuWrapperICS(this.f608b, menuBuilder);
                simpleArrayMap.put(menuBuilder, menu);
            }
            return this.f607a.onCreateActionMode(e, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean c(ActionMode actionMode, MenuItem menuItem) {
            return this.f607a.onActionItemClicked(e(actionMode), new MenuItemWrapperICS(this.f608b, (SupportMenuItem) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean d(ActionMode actionMode, MenuBuilder menuBuilder) {
            SupportActionModeWrapper e = e(actionMode);
            SimpleArrayMap simpleArrayMap = this.d;
            Menu menu = (Menu) simpleArrayMap.get(menuBuilder);
            if (menu == null) {
                menu = new MenuWrapperICS(this.f608b, menuBuilder);
                simpleArrayMap.put(menuBuilder, menu);
            }
            return this.f607a.onPrepareActionMode(e, menu);
        }

        public final SupportActionModeWrapper e(ActionMode actionMode) {
            ArrayList arrayList = this.f609c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i2);
                if (supportActionModeWrapper != null && supportActionModeWrapper.f606b == actionMode) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.f608b, actionMode);
            arrayList.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }

    public SupportActionModeWrapper(Context context, ActionMode actionMode) {
        this.f605a = context;
        this.f606b = actionMode;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f606b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f606b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuWrapperICS(this.f605a, this.f606b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f606b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f606b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f606b.f594a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f606b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f606b.f595b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f606b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f606b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f606b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f606b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f606b.f594a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f606b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f606b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f606b.j(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f606b.l(i2);
    }
}
