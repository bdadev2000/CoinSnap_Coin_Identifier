package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import n0.AbstractC2469a;
import o0.C2491c;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class T implements LayoutInflater.Factory2 {
    public final FragmentManager b;

    public T(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        w0 createOrGetFragmentStateManager;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.b;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2469a.f21818a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z8 = Fragment.class.isAssignableFrom(P.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z8 = false;
            }
            if (z8) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment findFragmentById = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                if (findFragmentById == null && string != null) {
                    findFragmentById = fragmentManager.findFragmentByTag(string);
                }
                if (findFragmentById == null && id != -1) {
                    findFragmentById = fragmentManager.findFragmentById(id);
                }
                if (findFragmentById == null) {
                    P fragmentFactory = fragmentManager.getFragmentFactory();
                    context.getClassLoader();
                    findFragmentById = fragmentFactory.a(attributeValue);
                    findFragmentById.mFromLayout = true;
                    findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
                    findFragmentById.mContainerId = id;
                    findFragmentById.mTag = string;
                    findFragmentById.mInLayout = true;
                    findFragmentById.mFragmentManager = fragmentManager;
                    findFragmentById.mHost = fragmentManager.getHost();
                    findFragmentById.onInflate(fragmentManager.getHost().f4683c, attributeSet, findFragmentById.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.addFragment(findFragmentById);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Fragment " + findFragmentById + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!findFragmentById.mInLayout) {
                    findFragmentById.mInLayout = true;
                    findFragmentById.mFragmentManager = fragmentManager;
                    findFragmentById.mHost = fragmentManager.getHost();
                    findFragmentById.onInflate(fragmentManager.getHost().f4683c, attributeSet, findFragmentById.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.createOrGetFragmentStateManager(findFragmentById);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Retained Fragment " + findFragmentById + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C2491c c2491c = o0.d.f21935a;
                o0.d.b(new o0.e(findFragmentById, viewGroup, 0));
                o0.d.a(findFragmentById).getClass();
                findFragmentById.mContainer = viewGroup;
                createOrGetFragmentStateManager.k();
                createOrGetFragmentStateManager.j();
                View view2 = findFragmentById.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (findFragmentById.mView.getTag() == null) {
                        findFragmentById.mView.setTag(string);
                    }
                    findFragmentById.mView.addOnAttachStateChangeListener(new S(this, createOrGetFragmentStateManager));
                    return findFragmentById.mView;
                }
                throw new IllegalStateException(AbstractC2914a.e("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
