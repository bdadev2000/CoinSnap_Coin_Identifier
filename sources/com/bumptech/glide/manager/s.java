package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class s extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final a f9745b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f9746c;

    /* renamed from: d, reason: collision with root package name */
    public s f9747d;

    /* renamed from: f, reason: collision with root package name */
    public Fragment f9748f;

    public s() {
        a aVar = new a();
        this.f9746c = new HashSet();
        this.f9745b = aVar;
    }

    public final void b(Context context, FragmentManager fragmentManager) {
        s sVar = this.f9747d;
        if (sVar != null) {
            sVar.f9746c.remove(this);
            this.f9747d = null;
        }
        m mVar = com.bumptech.glide.b.a(context).f9610g;
        HashMap hashMap = mVar.f9732d;
        s sVar2 = (s) hashMap.get(fragmentManager);
        if (sVar2 == null) {
            s sVar3 = (s) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (sVar3 == null) {
                sVar3 = new s();
                sVar3.f9748f = null;
                hashMap.put(fragmentManager, sVar3);
                fragmentManager.beginTransaction().add(sVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
                mVar.f9733f.obtainMessage(2, fragmentManager).sendToTarget();
            }
            sVar2 = sVar3;
        }
        this.f9747d = sVar2;
        if (!equals(sVar2)) {
            this.f9747d.f9746c.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                b(getContext(), fragmentManager);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9745b.a();
        s sVar = this.f9747d;
        if (sVar != null) {
            sVar.f9746c.remove(this);
            this.f9747d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f9748f = null;
        s sVar = this.f9747d;
        if (sVar != null) {
            sVar.f9746c.remove(this);
            this.f9747d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9745b.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9745b.c();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f9748f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
