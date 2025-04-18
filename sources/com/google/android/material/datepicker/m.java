package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class m<S> extends s {

    /* renamed from: c, reason: collision with root package name */
    public int f11721c;

    /* renamed from: d, reason: collision with root package name */
    public c f11722d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11721c = bundle.getInt("THEME_RES_ID_KEY");
        com.applovin.impl.mediation.ads.e.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11722d = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f11721c));
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11721c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11722d);
    }
}
