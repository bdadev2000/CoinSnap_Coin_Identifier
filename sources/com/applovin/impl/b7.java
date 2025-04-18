package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.a7;
import com.applovin.impl.z6;
import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public interface b7 {

    /* renamed from: a */
    public static final b7 f23026a;

    /* renamed from: b */
    public static final b7 f23027b;

    /* loaded from: classes2.dex */
    public interface b {

        /* renamed from: a */
        public static final b f23028a = new rs(6);

        static /* synthetic */ void b() {
        }

        static /* synthetic */ void d() {
            b();
        }

        void a();
    }

    static {
        a aVar = new a();
        f23026a = aVar;
        f23027b = aVar;
    }

    int a(f9 f9Var);

    z6 a(Looper looper, a7.a aVar, f9 f9Var);

    default void a() {
    }

    default b b(Looper looper, a7.a aVar, f9 f9Var) {
        return b.f23028a;
    }

    /* loaded from: classes2.dex */
    public class a implements b7 {
        @Override // com.applovin.impl.b7
        public z6 a(Looper looper, a7.a aVar, f9 f9Var) {
            if (f9Var.f23843p == null) {
                return null;
            }
            return new u7(new z6.a(new sp(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.applovin.impl.b7
        public int a(f9 f9Var) {
            return f9Var.f23843p != null ? 1 : 0;
        }
    }

    default void b() {
    }
}
