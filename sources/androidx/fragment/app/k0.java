package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f1675b;

    public k0(FragmentManager fragmentManager) {
        this.f1675b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        k1 createOrGetFragmentStateManager;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f1675b;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1.a.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z10 = Fragment.class.isAssignableFrom(h0.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragment = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                if (fragment == null && string != null) {
                    fragment = fragmentManager.findFragmentByTag(string);
                }
                if (fragment == null && id2 != -1) {
                    fragment = fragmentManager.findFragmentById(id2);
                }
                if (fragment == null) {
                    h0 fragmentFactory = fragmentManager.getFragmentFactory();
                    context.getClassLoader();
                    fragment = fragmentFactory.a(attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
                    fragment.mContainerId = id2;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    fragment.mFragmentManager = fragmentManager;
                    fragment.mHost = fragmentManager.getHost();
                    fragment.onInflate(fragmentManager.getHost().f1648c, attributeSet, fragment.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.addFragment(fragment);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!fragment.mInLayout) {
                    fragment.mInLayout = true;
                    fragment.mFragmentManager = fragmentManager;
                    fragment.mHost = fragmentManager.getHost();
                    fragment.onInflate(fragmentManager.getHost().f1648c, attributeSet, fragment.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.createOrGetFragmentStateManager(fragment);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                h1.b bVar = h1.c.a;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                h1.d dVar = new h1.d(fragment, viewGroup, 0);
                h1.c.c(dVar);
                h1.b a = h1.c.a(fragment);
                if (a.a.contains(h1.a.DETECT_FRAGMENT_TAG_USAGE) && h1.c.e(a, fragment.getClass(), h1.d.class)) {
                    h1.c.b(a, dVar);
                }
                fragment.mContainer = viewGroup;
                createOrGetFragmentStateManager.k();
                createOrGetFragmentStateManager.j();
                View view2 = fragment.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new j0(this, createOrGetFragmentStateManager));
                    return fragment.mView;
                }
                throw new IllegalStateException(com.applovin.impl.mediation.ads.e.f("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
