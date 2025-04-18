package androidx.datastore.migrations;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.p;

/* loaded from: classes4.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    @e(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends i implements p {
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new i(2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            return Boolean.TRUE;
        }
    }

    @e(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends i implements p {
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new i(2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            return Boolean.TRUE;
        }
    }

    @e(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends i implements p {
        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new i(2, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create(obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            q.m(obj);
            return Boolean.TRUE;
        }
    }

    /* renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass4 extends r implements q0.a {
        @Override // q0.a
        public final Object invoke() {
            throw null;
        }
    }

    @RequiresApi
    /* loaded from: classes4.dex */
    public static final class Api24Impl {
        @DoNotInline
        public static final boolean a(@NotNull Context context, @NotNull String str) {
            p0.a.s(context, "context");
            p0.a.s(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.datastore.core.DataMigration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean b(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = (androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 r0 = new androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19064b
            i0.a r1 = i0.a.f30806a
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 != r3) goto L38
            androidx.datastore.migrations.SharedPreferencesMigration r0 = r0.f19063a
            kotlin.jvm.internal.q.m(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L34:
            r0.getClass()
            throw r2
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L40:
            kotlin.jvm.internal.q.m(r5)
            r0.f19063a = r4
            r0.d = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.b(h0.g):java.lang.Boolean");
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp() {
        throw null;
    }
}
