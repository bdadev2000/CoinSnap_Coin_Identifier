package of;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.e;
import androidx.lifecycle.a1;
import dagger.hilt.android.internal.managers.i;

/* loaded from: classes4.dex */
public abstract class h<VB extends androidx.databinding.e> extends mf.b<VB> implements ph.b {

    /* renamed from: d, reason: collision with root package name */
    public i f23312d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23313f;

    /* renamed from: g, reason: collision with root package name */
    public volatile dagger.hilt.android.internal.managers.g f23314g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f23315h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public boolean f23316i = false;

    @Override // ph.b
    public final Object d() {
        if (this.f23314g == null) {
            synchronized (this.f23315h) {
                if (this.f23314g == null) {
                    this.f23314g = new dagger.hilt.android.internal.managers.g(this);
                }
            }
        }
        return this.f23314g.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f23313f) {
            return null;
        }
        j();
        return this.f23312d;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.j
    public final a1 getDefaultViewModelProviderFactory() {
        return com.bumptech.glide.e.z(this, super.getDefaultViewModelProviderFactory());
    }

    public final void j() {
        if (this.f23312d == null) {
            this.f23312d = new i(super.getContext(), this);
            this.f23313f = com.bumptech.glide.e.F(super.getContext());
        }
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        j();
        if (this.f23316i) {
            return;
        }
        this.f23316i = true;
        ((g) d()).getClass();
    }

    @Override // androidx.fragment.app.r, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new i(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        i iVar = this.f23312d;
        com.facebook.internal.i.j(iVar == null || dagger.hilt.android.internal.managers.g.b(iVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j();
        if (this.f23316i) {
            return;
        }
        this.f23316i = true;
        ((g) d()).getClass();
    }
}
