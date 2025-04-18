package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.preferences.core.MutablePreferences;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.q;

@e(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends i implements q {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(g gVar) {
        super(3, gVar);
    }

    @Override // q0.q
    @Nullable
    public final Object invoke(@NotNull e1.i iVar, @NotNull Throwable th, @Nullable g gVar) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(gVar);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = iVar;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            e1.i iVar = (e1.i) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            MutablePreferences mutablePreferences = new MutablePreferences(true);
            this.L$0 = null;
            this.label = 1;
            if (iVar.emit(mutablePreferences, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
