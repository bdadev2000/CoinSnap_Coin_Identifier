package gg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.e;
import androidx.lifecycle.a1;

/* loaded from: classes4.dex */
public abstract class a<VB extends androidx.databinding.e> extends mf.d<VB> implements ph.b {

    /* renamed from: c, reason: collision with root package name */
    public dagger.hilt.android.internal.managers.i f18456c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18457d;

    /* renamed from: f, reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f18458f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18459g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f18460h = false;

    @Override // ph.b
    public final Object d() {
        if (this.f18458f == null) {
            synchronized (this.f18459g) {
                if (this.f18458f == null) {
                    this.f18458f = new dagger.hilt.android.internal.managers.g(this);
                }
            }
        }
        return this.f18458f.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f18457d) {
            return null;
        }
        h();
        return this.f18456c;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.j
    public final a1 getDefaultViewModelProviderFactory() {
        return com.bumptech.glide.e.z(this, super.getDefaultViewModelProviderFactory());
    }

    public final void h() {
        if (this.f18456c == null) {
            this.f18456c = new dagger.hilt.android.internal.managers.i(super.getContext(), this);
            this.f18457d = com.bumptech.glide.e.F(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        h();
        if (this.f18460h) {
            return;
        }
        this.f18460h = true;
        ((j) d()).getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new dagger.hilt.android.internal.managers.i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dagger.hilt.android.internal.managers.i iVar = this.f18456c;
        com.facebook.internal.i.j(iVar == null || dagger.hilt.android.internal.managers.g.b(iVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        h();
        if (this.f18460h) {
            return;
        }
        this.f18460h = true;
        ((j) d()).getClass();
    }
}
