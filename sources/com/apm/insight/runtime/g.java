package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g {
    private static final Comparator<a> a = new Comparator<a>() { // from class: com.apm.insight.runtime.g.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(a aVar, a aVar2) {
            int i10 = aVar.f3327b + aVar.f3328c;
            int i11 = aVar2.f3327b + aVar2.f3328c;
            if (i10 != i11) {
                return i10 > i11 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f3326b = new byte[4096];

    /* loaded from: classes.dex */
    public static class a {
        public String a = AppLovinMediationProvider.UNKNOWN;

        /* renamed from: b, reason: collision with root package name */
        public int f3327b;

        /* renamed from: c, reason: collision with root package name */
        public int f3328c;
    }

    public static long a(int i10) {
        return q.a.a() * NativeImpl.c(i10);
    }
}
