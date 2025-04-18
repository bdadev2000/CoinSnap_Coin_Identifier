package androidx.webkit.internal;

import android.os.Build;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public abstract class ApiFeature implements ConditionallySupportedFeature {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f21803c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f21804a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21805b;

    /* loaded from: classes2.dex */
    public static class LAZY_HOLDER {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f21806a = new HashSet(Arrays.asList(WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f21833a.a()));
    }

    /* loaded from: classes2.dex */
    public static class M extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class N extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class NoFramework extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class O extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class O_MR1 extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* loaded from: classes2.dex */
    public static class P extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* loaded from: classes2.dex */
    public static class Q extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* loaded from: classes2.dex */
    public static class T extends ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public ApiFeature(String str, String str2) {
        this.f21804a = str;
        this.f21805b = str2;
        f21803c.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final String a() {
        return this.f21804a;
    }

    public abstract boolean b();

    public boolean c() {
        return BoundaryInterfaceReflectionUtil.containsFeature(LAZY_HOLDER.f21806a, this.f21805b);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public final boolean isSupported() {
        return b() || c();
    }
}
