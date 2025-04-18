package com.google.firebase;

import androidx.annotation.Keep;
import cb.b;
import cb.c;
import cb.d;
import com.google.firebase.components.ComponentRegistrar;
import db.a;
import db.j;
import db.s;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import s7.h1;
import va.h;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Ldb/a;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n+ 2 Firebase.kt\ncom/google/firebase/FirebaseKt\n*L\n1#1,82:1\n76#2,6:83\n76#2,6:89\n76#2,6:95\n76#2,6:101\n*S KotlinDebug\n*F\n+ 1 Firebase.kt\ncom/google/firebase/FirebaseCommonKtxRegistrar\n*L\n67#1:83,6\n68#1:89,6\n69#1:95,6\n70#1:101,6\n*E\n"})
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        h1 a = a.a(new s(cb.a.class, CoroutineDispatcher.class));
        a.a(new j(new s(cb.a.class, Executor.class), 1, 0));
        a.f24390f = h.f26397c;
        a b3 = a.b();
        Intrinsics.checkNotNullExpressionValue(b3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h1 a10 = a.a(new s(c.class, CoroutineDispatcher.class));
        a10.a(new j(new s(c.class, Executor.class), 1, 0));
        a10.f24390f = h.f26398d;
        a b10 = a10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h1 a11 = a.a(new s(b.class, CoroutineDispatcher.class));
        a11.a(new j(new s(b.class, Executor.class), 1, 0));
        a11.f24390f = h.f26399f;
        a b11 = a11.b();
        Intrinsics.checkNotNullExpressionValue(b11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        h1 a12 = a.a(new s(d.class, CoroutineDispatcher.class));
        a12.a(new j(new s(d.class, Executor.class), 1, 0));
        a12.f24390f = h.f26400g;
        a b12 = a12.b();
        Intrinsics.checkNotNullExpressionValue(b12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt.listOf((Object[]) new a[]{b3, b10, b11, b12});
    }
}
