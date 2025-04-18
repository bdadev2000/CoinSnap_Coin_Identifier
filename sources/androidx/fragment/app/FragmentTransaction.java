package androidx.fragment.app;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class FragmentTransaction {

    /* renamed from: b, reason: collision with root package name */
    public int f19809b;

    /* renamed from: c, reason: collision with root package name */
    public int f19810c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f19811f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19812g;

    /* renamed from: h, reason: collision with root package name */
    public String f19813h;

    /* renamed from: i, reason: collision with root package name */
    public int f19814i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f19815j;

    /* renamed from: k, reason: collision with root package name */
    public int f19816k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f19817l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f19818m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f19819n;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19808a = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public boolean f19820o = false;

    /* loaded from: classes4.dex */
    public static final class Op {

        /* renamed from: a, reason: collision with root package name */
        public int f19821a;

        /* renamed from: b, reason: collision with root package name */
        public Fragment f19822b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19823c = true;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f19824f;

        /* renamed from: g, reason: collision with root package name */
        public int f19825g;

        /* renamed from: h, reason: collision with root package name */
        public Lifecycle.State f19826h;

        /* renamed from: i, reason: collision with root package name */
        public Lifecycle.State f19827i;

        public Op(Fragment fragment, int i2) {
            this.f19821a = i2;
            this.f19822b = fragment;
            Lifecycle.State state = Lifecycle.State.f19990f;
            this.f19826h = state;
            this.f19827i = state;
        }

        public Op(int i2, Fragment fragment) {
            this.f19821a = i2;
            this.f19822b = fragment;
            Lifecycle.State state = Lifecycle.State.f19990f;
            this.f19826h = state;
            this.f19827i = state;
        }
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
    }

    public final void b(Op op) {
        this.f19808a.add(op);
        op.d = this.f19809b;
        op.e = this.f19810c;
        op.f19824f = this.d;
        op.f19825g = this.e;
    }

    public abstract int c();

    public abstract int d();

    public abstract void e();

    public void f(int i2, Fragment fragment, String str, int i3) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        b(new Op(fragment, i3));
    }

    public final void g(int i2, Fragment fragment) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i2, fragment, null, 2);
    }
}
