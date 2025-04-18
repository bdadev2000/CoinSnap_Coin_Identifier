package yf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.e;
import androidx.lifecycle.a1;
import dagger.hilt.android.internal.managers.g;
import dagger.hilt.android.internal.managers.i;

/* loaded from: classes4.dex */
public abstract class d<VB extends e> extends mf.d<VB> implements ph.b {

    /* renamed from: c, reason: collision with root package name */
    public i f28208c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28209d;

    /* renamed from: f, reason: collision with root package name */
    public volatile g f28210f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f28211g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f28212h = false;

    @Override // ph.b
    public final Object d() {
        if (this.f28210f == null) {
            synchronized (this.f28211g) {
                if (this.f28210f == null) {
                    this.f28210f = new g(this);
                }
            }
        }
        return this.f28210f.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f28209d) {
            return null;
        }
        h();
        return this.f28208c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.j
    public final a1 getDefaultViewModelProviderFactory() {
        return com.bumptech.glide.e.z(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.f28208c == null) {
            this.f28208c = new i(super.getContext(), this);
            this.f28209d = com.bumptech.glide.e.F(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.f28212h) {
            return;
        }
        this.f28212h = true;
        ((c) d()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        i iVar = this.f28208c;
        com.facebook.internal.i.j(iVar == null || g.b(iVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (this.f28212h) {
            return;
        }
        this.f28212h = true;
        ((c) d()).getClass();
    }
}
