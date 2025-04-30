package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public interface z6 {

    /* renamed from: a */
    public static final z6 f12539a;
    public static final z6 b;

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a */
        public static final b f12540a = new C1(19);

        static /* synthetic */ void b() {
        }

        static /* synthetic */ void d() {
            b();
        }

        void a();
    }

    static {
        a aVar = new a();
        f12539a = aVar;
        b = aVar;
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
            if (d9Var.f7213p == null) {
                return null;
            }
            return new s7(new x6.a(new tp(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.applovin.impl.z6
        public int a(d9 d9Var) {
            return d9Var.f7213p != null ? 1 : 0;
        }
    }

    default b b(Looper looper, y6.a aVar, d9 d9Var) {
        return b.f12540a;
    }
}
