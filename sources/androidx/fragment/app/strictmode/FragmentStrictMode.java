package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import e0.u;
import e0.y;
import java.util.LinkedHashMap;
import java.util.Set;
import p0.a;

/* loaded from: classes3.dex */
public final class FragmentStrictMode {

    /* renamed from: a, reason: collision with root package name */
    public static final Policy f19901a = Policy.d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Flag {

        /* renamed from: a, reason: collision with root package name */
        public static final Flag f19902a;

        /* renamed from: b, reason: collision with root package name */
        public static final Flag f19903b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flag f19904c;
        public static final Flag d;

        /* renamed from: f, reason: collision with root package name */
        public static final Flag f19905f;

        /* renamed from: g, reason: collision with root package name */
        public static final Flag f19906g;

        /* renamed from: h, reason: collision with root package name */
        public static final Flag f19907h;

        /* renamed from: i, reason: collision with root package name */
        public static final Flag f19908i;

        /* renamed from: j, reason: collision with root package name */
        public static final Flag f19909j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f19910k;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, androidx.fragment.app.strictmode.FragmentStrictMode$Flag] */
        static {
            ?? r02 = new Enum("PENALTY_LOG", 0);
            f19902a = r02;
            ?? r1 = new Enum("PENALTY_DEATH", 1);
            f19903b = r1;
            ?? r2 = new Enum("DETECT_FRAGMENT_REUSE", 2);
            f19904c = r2;
            ?? r3 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
            d = r3;
            ?? r4 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
            f19905f = r4;
            ?? r5 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
            f19906g = r5;
            ?? r6 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
            f19907h = r6;
            ?? r7 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
            f19908i = r7;
            ?? r8 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            f19909j = r8;
            f19910k = new Flag[]{r02, r1, r2, r3, r4, r5, r6, r7, r8};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f19910k.clone();
        }
    }

    /* loaded from: classes3.dex */
    public interface OnViolationListener {
        void a();
    }

    /* loaded from: classes3.dex */
    public static final class Policy {
        public static final Policy d = new Policy();

        /* renamed from: a, reason: collision with root package name */
        public final Set f19911a = y.f30220a;

        /* renamed from: b, reason: collision with root package name */
        public final OnViolationListener f19912b = null;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedHashMap f19913c = new LinkedHashMap();

        /* loaded from: classes3.dex */
        public static final class Builder {
        }

        /* loaded from: classes3.dex */
        public static final class Companion {
        }
    }

    public static Policy a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                a.r(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f19901a;
    }

    public static void b(Policy policy, Violation violation) {
        Fragment fragment = violation.f19915a;
        String name = fragment.getClass().getName();
        Flag flag = Flag.f19902a;
        Set set = policy.f19911a;
        if (set.contains(flag)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (policy.f19912b != null) {
            e(fragment, new androidx.core.content.res.a(1, policy, violation));
        }
        if (set.contains(Flag.f19903b)) {
            e(fragment, new androidx.core.content.res.a(2, name, violation));
        }
    }

    public static void c(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f19915a.getClass().getName()), violation);
        }
    }

    public static final void d(Fragment fragment, String str) {
        a.s(fragment, "fragment");
        a.s(str, "previousFragmentId");
        Violation violation = new Violation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(violation);
        Policy a2 = a(fragment);
        if (a2.f19911a.contains(Flag.f19904c) && f(a2, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a2, violation);
        }
    }

    public static void e(Fragment fragment, androidx.core.content.res.a aVar) {
        if (!fragment.isAdded()) {
            aVar.run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().f19757u.f19733c;
        a.r(handler, "fragment.parentFragmentManager.host.handler");
        if (a.g(handler.getLooper(), Looper.myLooper())) {
            aVar.run();
        } else {
            handler.post(aVar);
        }
    }

    public static boolean f(Policy policy, Class cls, Class cls2) {
        Set set = (Set) policy.f19913c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (a.g(cls2.getSuperclass(), Violation.class) || !u.A0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
