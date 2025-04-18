package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import com.safedk.android.utils.SdksMapping;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f19734a;

    public FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.f19734a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        final FragmentStateManager g2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f19734a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19649a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !FragmentFactory.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment C = resourceId != -1 ? fragmentManager.C(resourceId) : null;
        if (C == null && string != null) {
            C = fragmentManager.D(string);
        }
        if (C == null && id != -1) {
            C = fragmentManager.C(id);
        }
        if (C == null) {
            C = fragmentManager.G().instantiate(context.getClassLoader(), attributeValue);
            C.mFromLayout = true;
            C.mFragmentId = resourceId != 0 ? resourceId : id;
            C.mContainerId = id;
            C.mTag = string;
            C.mInLayout = true;
            C.mFragmentManager = fragmentManager;
            FragmentHostCallback<?> fragmentHostCallback = fragmentManager.f19757u;
            C.mHost = fragmentHostCallback;
            C.onInflate(fragmentHostCallback.f19732b, attributeSet, C.mSavedFragmentState);
            g2 = fragmentManager.a(C);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Fragment " + C + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!C.mInLayout) {
            C.mInLayout = true;
            C.mFragmentManager = fragmentManager;
            FragmentHostCallback<?> fragmentHostCallback2 = fragmentManager.f19757u;
            C.mHost = fragmentHostCallback2;
            C.onInflate(fragmentHostCallback2.f19732b, attributeSet, C.mSavedFragmentState);
            g2 = fragmentManager.g(C);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Retained Fragment " + C + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.Policy policy = FragmentStrictMode.f19901a;
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(C, viewGroup);
        FragmentStrictMode.c(fragmentTagUsageViolation);
        FragmentStrictMode.Policy a2 = FragmentStrictMode.a(C);
        if (a2.f19911a.contains(FragmentStrictMode.Flag.d) && FragmentStrictMode.f(a2, C.getClass(), FragmentTagUsageViolation.class)) {
            FragmentStrictMode.b(a2, fragmentTagUsageViolation);
        }
        C.mContainer = viewGroup;
        g2.k();
        g2.j();
        View view2 = C.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (C.mView.getTag() == null) {
                C.mView.setTag(string);
            }
            C.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view3) {
                    FragmentStateManager fragmentStateManager = g2;
                    Fragment fragment = fragmentStateManager.f19800c;
                    fragmentStateManager.k();
                    SpecialEffectsController.j((ViewGroup) fragment.mView.getParent(), FragmentLayoutInflaterFactory.this.f19734a).i();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view3) {
                }
            });
            return C.mView;
        }
        throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("Fragment ", attributeValue, " did not create a view."));
    }
}
