package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.q;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Comparator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f6035a = new Comparator<a>() { // from class: com.apm.insight.runtime.g.1
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compare(a aVar, a aVar2) {
            int i9 = aVar.b + aVar.f6037c;
            int i10 = aVar2.b + aVar2.f6037c;
            if (i9 != i10) {
                return i9 > i10 ? -1 : 1;
            }
            return 0;
        }
    };
    private static byte[] b = new byte[4096];

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f6036a = AppLovinMediationProvider.UNKNOWN;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f6037c;
    }

    public static long a(int i9) {
        return q.a.a() * NativeImpl.c(i9);
    }
}
