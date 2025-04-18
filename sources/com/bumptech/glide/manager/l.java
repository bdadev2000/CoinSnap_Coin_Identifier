package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class l extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final a f9723b;

    /* renamed from: c, reason: collision with root package name */
    public final fb.c f9724c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f9725d;

    /* renamed from: f, reason: collision with root package name */
    public com.bumptech.glide.o f9726f;

    /* renamed from: g, reason: collision with root package name */
    public l f9727g;

    /* renamed from: h, reason: collision with root package name */
    public Fragment f9728h;

    public l() {
        a aVar = new a();
        this.f9724c = new fb.c(this, 19);
        this.f9725d = new HashSet();
        this.f9723b = aVar;
    }

    public final void a(Activity activity) {
        l lVar = this.f9727g;
        if (lVar != null) {
            lVar.f9725d.remove(this);
            this.f9727g = null;
        }
        m mVar = com.bumptech.glide.b.a(activity).f9610g;
        mVar.getClass();
        l d10 = mVar.d(activity.getFragmentManager());
        this.f9727g = d10;
        if (!equals(d10)) {
            this.f9727g.f9725d.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9723b.a();
        l lVar = this.f9727g;
        if (lVar != null) {
            lVar.f9725d.remove(this);
            this.f9727g = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        l lVar = this.f9727g;
        if (lVar != null) {
            lVar.f9725d.remove(this);
            this.f9727g = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9723b.b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9723b.c();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f9728h;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
