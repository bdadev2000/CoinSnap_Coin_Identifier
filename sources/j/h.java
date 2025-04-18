package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import k.f0;

/* loaded from: classes.dex */
public final class h extends ActionMode {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final c f19668b;

    public h(Context context, c cVar) {
        this.a = context;
        this.f19668b = cVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f19668b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f19668b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new f0(this.a, this.f19668b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f19668b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f19668b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f19668b.f19655b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f19668b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f19668b.f19656c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f19668b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f19668b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f19668b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f19668b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f19668b.f19655b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f19668b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f19668b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f19668b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f19668b.n(i10);
    }
}
