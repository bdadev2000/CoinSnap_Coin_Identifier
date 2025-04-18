package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public interface z6 {
    public static final z6 a;

    /* renamed from: b */
    public static final z6 f9359b;

    /* loaded from: classes.dex */
    public interface b {
        public static final b a = new lu(18);

        static /* synthetic */ void b() {
        }

        static /* synthetic */ void d() {
            b();
        }

        void a();
    }

    static {
        a aVar = new a();
        a = aVar;
        f9359b = aVar;
    }

    int a(d9 d9Var);

    x6 a(Looper looper, y6.a aVar, d9 d9Var);

    default void a() {
    }

    default void b() {
    }

    /* loaded from: classes.dex */
    public class a implements z6 {
        @Override // com.applovin.impl.z6
        public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
            if (d9Var.f4231p == null) {
                return null;
            }
            return new s7(new x6.a(new tp(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.applovin.impl.z6
        public int a(d9 d9Var) {
            return d9Var.f4231p != null ? 1 : 0;
        }
    }

    default b b(Looper looper, y6.a aVar, d9 d9Var) {
        return b.a;
    }
}
